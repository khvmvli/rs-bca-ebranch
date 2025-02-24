package o;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* loaded from: classes-dex2jar.jar:o/CC10PasporFormKartuKreditFragment_ViewBinding.class */
public abstract class CC10PasporFormKartuKreditFragment_ViewBinding {
    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sb = new StringBuilder("Interface can't be instantiated! Interface name: ");
            sb.append(cls.getName());
            throw new UnsupportedOperationException(sb.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder sb2 = new StringBuilder("Abstract class can't be instantiated! Class name: ");
            sb2.append(cls.getName());
            throw new UnsupportedOperationException(sb2.toString());
        }
    }

    public static CC10PasporFormKartuKreditFragment_ViewBinding b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(null);
            final Method method = cls.getMethod("allocateInstance", Class.class);
            return new CC10PasporFormKartuKreditFragment_ViewBinding() { // from class: o.CC10PasporFormKartuKreditFragment_ViewBinding.5
                @Override // o.CC10PasporFormKartuKreditFragment_ViewBinding
                public final <T> T c(Class<T> cls2) throws Exception {
                    a(cls2);
                    return (T) method.invoke(obj, cls2);
                }
            };
        } catch (Exception e) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                final int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new CC10PasporFormKartuKreditFragment_ViewBinding() { // from class: o.CC10PasporFormKartuKreditFragment_ViewBinding.1
                    @Override // o.CC10PasporFormKartuKreditFragment_ViewBinding
                    public final <T> T c(Class<T> cls2) throws Exception {
                        a(cls2);
                        return (T) declaredMethod2.invoke(null, cls2, Integer.valueOf(intValue));
                    }
                };
            } catch (Exception e2) {
                try {
                    final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new CC10PasporFormKartuKreditFragment_ViewBinding() { // from class: o.CC10PasporFormKartuKreditFragment_ViewBinding.3
                        @Override // o.CC10PasporFormKartuKreditFragment_ViewBinding
                        public final <T> T c(Class<T> cls2) throws Exception {
                            a(cls2);
                            return (T) declaredMethod3.invoke(null, cls2, Object.class);
                        }
                    };
                } catch (Exception e3) {
                    return new CC10PasporFormKartuKreditFragment_ViewBinding() { // from class: o.CC10PasporFormKartuKreditFragment_ViewBinding.4
                        @Override // o.CC10PasporFormKartuKreditFragment_ViewBinding
                        public final <T> T c(Class<T> cls2) {
                            StringBuilder sb = new StringBuilder("Cannot allocate ");
                            sb.append(cls2);
                            throw new UnsupportedOperationException(sb.toString());
                        }
                    };
                }
            }
        }
    }

    public abstract <T> T c(Class<T> cls) throws Exception;
}
