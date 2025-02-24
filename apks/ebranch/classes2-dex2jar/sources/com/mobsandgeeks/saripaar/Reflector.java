package com.mobsandgeeks.saripaar;

import android.view.View;
import com.mobsandgeeks.saripaar.adapter.ViewDataAdapter;
import com.mobsandgeeks.saripaar.annotation.ValidateUsing;
import com.mobsandgeeks.saripaar.exception.SaripaarViolationException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/Reflector.class */
public final class Reflector {
    private Reflector() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Method findGetDataMethod(Class<? extends ViewDataAdapter> cls) {
        Method method;
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i];
            if ("getData".equals(method.getName())) {
                boolean isVolatile = Modifier.isVolatile(method.getModifiers());
                Class<?>[] parameterTypes = method.getParameterTypes();
                boolean z = parameterTypes.length == 1 && View.class.isAssignableFrom(parameterTypes[0]);
                if ((!isVolatile) && z) {
                    break;
                }
            }
            i++;
        }
        return method;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Method getAttributeMethod(Class<? extends Annotation> cls, String str) {
        Method method;
        try {
            method = cls.getMethod(str, new Class[0]);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            method = null;
        }
        return method;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T getAttributeValue(Annotation annotation, String str, Class<T> cls) {
        T t;
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Method attributeMethod = getAttributeMethod(annotationType, str);
        if (attributeMethod != null) {
            try {
                t = (T) attributeMethod.invoke(annotation, new Object[0]);
                if (!cls.isPrimitive()) {
                    t = cls.cast(t);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                t = null;
                return t;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                t = null;
                return t;
            }
            return t;
        }
        throw new IllegalStateException(String.format("Cannot find attribute '%s' in annotation '%s'.", str, annotationType.getName()));
    }

    private static String getMissingConstructorErrorMessage(Class<? extends AnnotationRule> cls, Class<? extends Annotation> cls2) {
        return ContextualAnnotationRule.class.isAssignableFrom(cls) ? String.format("A constructor accepting a '%s' and a '%s' is required for %s.", cls2.getName(), ValidationContext.class, cls.getName()) : AnnotationRule.class.isAssignableFrom(cls) ? String.format("'%s' should have a single-argument constructor that accepts a '%s' instance.", cls.getName(), cls2.getName()) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> getRuleDataType(ValidateUsing validateUsing) {
        Class value = validateUsing.value();
        return getRuleTypeFromIsValidMethod(value, value.getDeclaredMethods());
    }

    static Class<?> getRuleDataType(Annotation annotation) {
        return getRuleDataType(getValidateUsingAnnotation(annotation.annotationType()));
    }

    private static Class<?> getRuleTypeFromIsValidMethod(Class<? extends AnnotationRule> cls, Method[] methodArr) {
        Class<?> cls2 = null;
        for (Method method : methodArr) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            cls2 = cls2;
            if (matchesIsValidMethodSignature(method, parameterTypes)) {
                if (cls2 == null) {
                    cls2 = parameterTypes[0];
                } else {
                    throw new SaripaarViolationException(String.format("Found duplicate 'boolean isValid(T)' method signature in '%s'.", cls.getName()));
                }
            }
        }
        return cls2;
    }

    private static ValidateUsing getValidateUsingAnnotation(Class<? extends Annotation> cls) {
        ValidateUsing validateUsing;
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        int length = declaredAnnotations.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                validateUsing = null;
                break;
            }
            Annotation annotation = declaredAnnotations[i];
            if (ValidateUsing.class.equals(annotation.annotationType())) {
                validateUsing = (ValidateUsing) annotation;
                break;
            }
            i++;
        }
        return validateUsing;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.mobsandgeeks.saripaar.AnnotationRule] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v9 */
    static AnnotationRule instantiateRule(Class<? extends AnnotationRule> cls, Annotation annotation, ValidationContext validationContext) throws SaripaarViolationException {
        try {
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            throw new SaripaarViolationException(getMissingConstructorErrorMessage(cls, annotation.annotationType()));
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
        if (ContextualAnnotationRule.class.isAssignableFrom(cls)) {
            Constructor declaredConstructor = cls.getDeclaredConstructor(annotation.annotationType(), ValidationContext.class);
            declaredConstructor.setAccessible(true);
            cls = (AnnotationRule) declaredConstructor.newInstance(annotation, validationContext);
        } else {
            if (AnnotationRule.class.isAssignableFrom(cls)) {
                Constructor declaredConstructor2 = cls.getDeclaredConstructor(annotation.annotationType());
                declaredConstructor2.setAccessible(true);
                cls = (AnnotationRule) declaredConstructor2.newInstance(annotation);
            }
            cls = 0;
        }
        return cls;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isAnnotated(Class<? extends Annotation> cls, Class<? extends Annotation> cls2) {
        boolean z = false;
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            z = cls2.equals(annotation.annotationType());
            z = z;
            if (z) {
                break;
            }
        }
        return z;
    }

    private static boolean matchesIsValidMethodSignature(Method method, Class<?>[] clsArr) {
        int modifiers = method.getModifiers();
        boolean isPublic = Modifier.isPublic(modifiers);
        boolean isVolatile = Modifier.isVolatile(modifiers);
        boolean equals = Boolean.TYPE.equals(method.getReturnType());
        boolean equals2 = "isValid".equals(method.getName());
        boolean z = clsArr.length == 1;
        boolean z2 = false;
        if (isPublic) {
            z2 = false;
            if (!isVolatile) {
                z2 = false;
                if (equals) {
                    z2 = false;
                    if (equals2) {
                        z2 = z;
                    }
                }
            }
        }
        return z2;
    }
}
