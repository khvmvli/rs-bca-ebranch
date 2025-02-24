package o;

import java.io.Serializable;
/* loaded from: classes2-dex2jar.jar:o/onChooseValuePenghasilanPerTahun.class */
public final class onChooseValuePenghasilanPerTahun<T> implements onChooseValueSumberPenghasilan<T>, Serializable {
    private final T d;

    public onChooseValuePenghasilanPerTahun(T t) {
        this.d = t;
    }

    public final T d() {
        return this.d;
    }

    @Override // java.lang.Object
    public final String toString() {
        return String.valueOf(d());
    }
}
