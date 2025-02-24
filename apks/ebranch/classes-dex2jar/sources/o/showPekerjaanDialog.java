package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* loaded from: classes-dex2jar.jar:o/showPekerjaanDialog.class */
public class showPekerjaanDialog<T> {
    final int c;
    public final Class<? super T> d;
    public final Type e;

    public showPekerjaanDialog() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type e = ubahDataPenerima.e(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.e = e;
            this.d = (Class<? super T>) ubahDataPenerima.b(e);
            this.c = e.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public showPekerjaanDialog(Type type) {
        Type e = ubahDataPenerima.e(type);
        this.e = e;
        this.d = (Class<? super T>) ubahDataPenerima.b(e);
        this.c = e.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof showPekerjaanDialog) && ubahDataPenerima.a(this.e, ((showPekerjaanDialog) obj).e);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return ubahDataPenerima.d(this.e);
    }
}
