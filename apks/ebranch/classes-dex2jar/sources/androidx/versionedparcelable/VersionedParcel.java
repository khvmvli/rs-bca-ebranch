package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.setScaleY;
import o.setThumbTextPadding;
/* loaded from: classes-dex2jar.jar:androidx/versionedparcelable/VersionedParcel.class */
public abstract class VersionedParcel {
    protected final setThumbTextPadding<String, Method> b;
    protected final setThumbTextPadding<String, Class> c;
    protected final setThumbTextPadding<String, Method> d;

    /* loaded from: classes-dex2jar.jar:androidx/versionedparcelable/VersionedParcel$ParcelException.class */
    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(setThumbTextPadding<String, Method> setthumbtextpadding, setThumbTextPadding<String, Method> setthumbtextpadding2, setThumbTextPadding<String, Class> setthumbtextpadding3) {
        this.b = setthumbtextpadding;
        this.d = setthumbtextpadding2;
        this.c = setthumbtextpadding3;
    }

    private Class a(Class<? extends setScaleY> cls) throws ClassNotFoundException {
        Class<?> cls2 = this.c.get(cls.getName());
        Class<?> cls3 = cls2;
        if (cls2 == null) {
            cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.c.put(cls.getName(), cls3);
        }
        return cls3;
    }

    private <T extends setScaleY> T d(String str, VersionedParcel versionedParcel) {
        try {
            Method method = this.b.get(str);
            Method method2 = method;
            if (method == null) {
                method2 = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
                this.b.put(str, method2);
            }
            return (T) ((setScaleY) method2.invoke(null, versionedParcel));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    protected abstract CharSequence a();

    public final CharSequence a(CharSequence charSequence, int i) {
        return !d(i) ? charSequence : a();
    }

    protected abstract void a(int i);

    protected abstract void a(String str);

    /* JADX WARN: Multi-variable type inference failed */
    protected final void a(setScaleY setscaley) {
        if (setscaley == null) {
            a((String) null);
            return;
        }
        try {
            a(a((Class<? extends setScaleY>) setscaley.getClass()).getName());
            VersionedParcel e = e();
            try {
                Class<?> cls = setscaley.getClass();
                Method method = this.d.get(cls.getName());
                Method method2 = method;
                if (method == null) {
                    method2 = a((Class<? extends setScaleY>) cls).getDeclaredMethod("write", cls, VersionedParcel.class);
                    this.d.put(cls.getName(), method2);
                }
                method2.invoke(null, setscaley, e);
                e.c();
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (e5.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e5.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
            }
        } catch (ClassNotFoundException e6) {
            StringBuilder sb = new StringBuilder();
            sb.append(setscaley.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e6);
        }
    }

    protected abstract void a(boolean z);

    protected abstract void a(byte[] bArr);

    public final void a(byte[] bArr, int i) {
        a(2);
        a(bArr);
    }

    public final boolean a(boolean z, int i) {
        return !d(i) ? z : d();
    }

    public final void b(int i, int i2) {
        a(i2);
        e(i);
    }

    protected abstract void b(CharSequence charSequence);

    public final void b(setScaleY setscaley, int i) {
        a(1);
        a(setscaley);
    }

    protected abstract byte[] b();

    public final byte[] b(byte[] bArr, int i) {
        return !d(2) ? bArr : b();
    }

    public final String c(String str, int i) {
        return !d(i) ? str : g();
    }

    protected abstract void c();

    public final void c(CharSequence charSequence, int i) {
        a(i);
        b(charSequence);
    }

    public final <T extends Parcelable> T d(T t, int i) {
        return !d(i) ? t : (T) h();
    }

    public final <T extends setScaleY> T d(T t, int i) {
        if (!d(1)) {
            return t;
        }
        String g = g();
        if (g == null) {
            return null;
        }
        return (T) d(g, e());
    }

    protected abstract void d(Parcelable parcelable);

    public final void d(String str, int i) {
        a(i);
        a(str);
    }

    public final void d(boolean z, int i) {
        a(i);
        a(z);
    }

    protected abstract boolean d();

    protected abstract boolean d(int i);

    public final int e(int i, int i2) {
        return !d(i2) ? i : i();
    }

    protected abstract VersionedParcel e();

    protected abstract void e(int i);

    public final void e(Parcelable parcelable, int i) {
        a(i);
        d(parcelable);
    }

    protected abstract String g();

    protected abstract <T extends Parcelable> T h();

    protected abstract int i();

    protected final <T extends setScaleY> T j() {
        String g = g();
        if (g == null) {
            return null;
        }
        return (T) d(g, e());
    }
}
