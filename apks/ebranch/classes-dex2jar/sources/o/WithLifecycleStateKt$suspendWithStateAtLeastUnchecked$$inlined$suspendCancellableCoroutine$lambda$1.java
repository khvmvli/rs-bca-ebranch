package o;
/* loaded from: classes-dex2jar.jar:o/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.class */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1 {
    public static <T, C> T a(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        String str3 = canonicalName;
        if (!name.isEmpty()) {
            str3 = canonicalName.substring(name.length() + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str3.replace('.', '_'));
        sb.append(str);
        String obj = sb.toString();
        try {
            if (name.isEmpty()) {
                str2 = obj;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name);
                sb2.append(".");
                sb2.append(obj);
                str2 = sb2.toString();
            }
            return (T) Class.forName(str2, true, cls.getClassLoader()).newInstance();
        } catch (ClassNotFoundException e) {
            StringBuilder sb3 = new StringBuilder("cannot find implementation for ");
            sb3.append(cls.getCanonicalName());
            sb3.append(". ");
            sb3.append(obj);
            sb3.append(" does not exist");
            throw new RuntimeException(sb3.toString());
        } catch (IllegalAccessException e2) {
            StringBuilder sb4 = new StringBuilder("Cannot access the constructor");
            sb4.append(cls.getCanonicalName());
            throw new RuntimeException(sb4.toString());
        } catch (InstantiationException e3) {
            StringBuilder sb5 = new StringBuilder("Failed to create an instance of ");
            sb5.append(cls.getCanonicalName());
            throw new RuntimeException(sb5.toString());
        }
    }
}
