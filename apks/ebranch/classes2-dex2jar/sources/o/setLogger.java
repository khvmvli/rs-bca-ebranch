package o;

import android.os.Parcel;
/* loaded from: classes2-dex2jar.jar:o/setLogger.class */
public abstract class setLogger<T> implements identityEquals<T> {
    public abstract void c(T t, Parcel parcel);

    @Override // o.ListUtil.ThreeItemImmutableList
    public final T d(Parcel parcel) {
        return parcel.readInt() == -1 ? null : e(parcel);
    }

    @Override // o.ListUtil.ThreeItemImmutableList
    public final void d(T t, Parcel parcel) {
        if (t == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(1);
        c(t, parcel);
    }

    public abstract T e(Parcel parcel);
}
