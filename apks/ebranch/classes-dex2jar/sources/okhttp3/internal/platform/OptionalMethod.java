package okhttp3.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes-dex2jar.jar:okhttp3/internal/platform/OptionalMethod.class */
class OptionalMethod<T> {
    private final String methodName;
    private final Class[] methodParams;
    private final Class<?> returnType;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OptionalMethod(Class<?> cls, String str, Class... clsArr) {
        this.returnType = cls;
        this.methodName = str;
        this.methodParams = clsArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r0.isAssignableFrom(r0.getReturnType()) == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private java.lang.reflect.Method getMethod(java.lang.Class<?> r5) {
        /*
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.methodName
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0031
            r0 = r5
            r1 = r6
            r2 = r4
            java.lang.Class[] r2 = r2.methodParams
            java.lang.reflect.Method r0 = getPublicMethod(r0, r1, r2)
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0033
            r0 = r4
            java.lang.Class<?> r0 = r0.returnType
            r7 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0033
            r0 = r6
            r5 = r0
            r0 = r7
            r1 = r6
            java.lang.Class r1 = r1.getReturnType()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L_0x0033
        L_0x0031:
            r0 = 0
            r5 = r0
        L_0x0033:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.OptionalMethod.getMethod(java.lang.Class):java.lang.reflect.Method");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
        if ((r4.getModifiers() & 1) == 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static java.lang.reflect.Method getPublicMethod(java.lang.Class<?> r4, java.lang.String r5, java.lang.Class[] r6) {
        /*
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: NoSuchMethodException -> 0x0016
            r4 = r0
            r0 = r4
            int r0 = r0.getModifiers()     // Catch: NoSuchMethodException -> 0x001a
            r7 = r0
            r0 = r7
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0014
        L_0x0012:
            r0 = 0
            r4 = r0
        L_0x0014:
            r0 = r4
            return r0
        L_0x0016:
            r4 = move-exception
            goto L_0x0012
        L_0x001a:
            r5 = move-exception
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.OptionalMethod.getPublicMethod(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    public Object invoke(T t, Object... objArr) throws InvocationTargetException {
        Method method = getMethod(t.getClass());
        if (method != null) {
            try {
                return method.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder("Unexpectedly could not call: ");
                sb.append(method);
                AssertionError assertionError = new AssertionError(sb.toString());
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Method ");
            sb2.append(this.methodName);
            sb2.append(" not supported for object ");
            sb2.append(t);
            throw new AssertionError(sb2.toString());
        }
    }

    public Object invokeOptional(T t, Object... objArr) throws InvocationTargetException {
        Method method = getMethod(t.getClass());
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(t, objArr);
        } catch (IllegalAccessException e) {
            return null;
        }
    }

    public Object invokeOptionalWithoutCheckedException(T t, Object... objArr) {
        try {
            return invokeOptional(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object invokeWithoutCheckedException(T t, Object... objArr) {
        try {
            return invoke(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean isSupported(T t) {
        return getMethod(t.getClass()) != null;
    }
}
