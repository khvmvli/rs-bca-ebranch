package o;

import android.os.Parcel;
/* loaded from: classes2-dex2jar.jar:o/e.class */
public final class e implements identityEquals<char[]> {
    @Override // o.ListUtil.ThreeItemImmutableList
    public final /* synthetic */ Object d(Parcel parcel) {
        char[] cArr;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            cArr = null;
        } else {
            char[] cArr2 = new char[readInt];
            parcel.readCharArray(cArr2);
            cArr = cArr2;
        }
        return cArr;
    }

    @Override // o.ListUtil.ThreeItemImmutableList
    public final /* synthetic */ void d(Object obj, Parcel parcel) {
        char[] cArr = (char[]) obj;
        if (cArr == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(cArr.length);
        parcel.writeCharArray(cArr);
    }
}
