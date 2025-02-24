package o;

import android.os.Parcel;
import android.util.SparseArray;
/* loaded from: classes2-dex2jar.jar:o/i.class */
public abstract class i<T> implements identityEquals<SparseArray<T>> {
    public abstract T b(Parcel parcel);

    public abstract void b(T t, Parcel parcel);

    @Override // o.ListUtil.ThreeItemImmutableList
    public final /* synthetic */ Object d(Parcel parcel) {
        SparseArray sparseArray;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            sparseArray = null;
        } else {
            SparseArray sparseArray2 = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                sparseArray2.append(parcel.readInt(), b(parcel));
            }
            sparseArray = sparseArray2;
        }
        return sparseArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.ListUtil.ThreeItemImmutableList
    public final /* synthetic */ void d(Object obj, Parcel parcel) {
        SparseArray sparseArray = (SparseArray) obj;
        if (sparseArray == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            parcel.writeInt(sparseArray.keyAt(i));
            b(sparseArray.valueAt(i), parcel);
        }
    }
}
