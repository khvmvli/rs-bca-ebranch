package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes2-dex2jar.jar:o/realmSet$setorans.class */
public final class realmSet$setorans implements Parcelable.Creator<realmSet$tarikans> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(realmSet$tarikans realmset_tarikans, Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.d(parcel, 1, realmset_tarikans.a);
        setHmAddress.c(parcel, 2, realmset_tarikans.c, false);
        setHmAddress.e(parcel, 3, realmset_tarikans.d);
        setHmAddress.d(parcel, 4, realmset_tarikans.e, false);
        setHmAddress.e(parcel, 5, (Float) null, false);
        setHmAddress.c(parcel, 6, realmset_tarikans.b, false);
        setHmAddress.c(parcel, 7, realmset_tarikans.i, false);
        setHmAddress.c(parcel, 8, realmset_tarikans.f, false);
        setHmAddress.e(parcel, b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ realmSet$tarikans createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            switch (SafeParcelReader.b(b)) {
                case 1:
                    i = SafeParcelReader.k(parcel, b);
                    break;
                case 2:
                    str = SafeParcelReader.b(parcel, b);
                    break;
                case 3:
                    j = SafeParcelReader.r(parcel, b);
                    break;
                case 4:
                    l = SafeParcelReader.t(parcel, b);
                    break;
                case 5:
                    f = SafeParcelReader.o(parcel, b);
                    break;
                case 6:
                    str2 = SafeParcelReader.b(parcel, b);
                    break;
                case 7:
                    str3 = SafeParcelReader.b(parcel, b);
                    break;
                case 8:
                    d = SafeParcelReader.g(parcel, b);
                    break;
                default:
                    SafeParcelReader.p(parcel, b);
                    break;
            }
        }
        SafeParcelReader.d(parcel, a);
        return new realmSet$tarikans(i, str, j, l, f, str2, str3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ realmSet$tarikans[] newArray(int i) {
        return new realmSet$tarikans[i];
    }
}
