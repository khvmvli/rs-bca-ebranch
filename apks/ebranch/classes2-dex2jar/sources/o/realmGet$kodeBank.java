package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:o/realmGet$kodeBank.class */
public final class realmGet$kodeBank extends setFotoPribadi {
    public static final Parcelable.Creator<realmGet$kodeBank> CREATOR = new Parcelable.Creator() { // from class: o.realmGet$jenisWarkat
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            realmGet.jobValue jobvalue = null;
            setMaritalStatus setmaritalstatus = null;
            int i = 0;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                int b2 = SafeParcelReader.b(b);
                if (b2 == 1) {
                    i = SafeParcelReader.k(parcel, b);
                } else if (b2 == 2) {
                    jobvalue = (realmGet.jobValue) SafeParcelReader.b(parcel, b, realmGet.jobValue.CREATOR);
                } else if (b2 != 3) {
                    SafeParcelReader.p(parcel, b);
                } else {
                    setmaritalstatus = (setMaritalStatus) SafeParcelReader.b(parcel, b, setMaritalStatus.CREATOR);
                }
            }
            SafeParcelReader.d(parcel, a);
            return new realmGet$kodeBank(i, jobvalue, setmaritalstatus);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new realmGet$kodeBank[i];
        }
    };
    private final setMaritalStatus a;
    final int c;
    private final realmGet.jobValue e;

    public realmGet$kodeBank(int i, realmGet.jobValue jobvalue, setMaritalStatus setmaritalstatus) {
        this.c = i;
        this.e = jobvalue;
        this.a = setmaritalstatus;
    }

    public final setMaritalStatus b() {
        return this.a;
    }

    public final realmGet.jobValue d() {
        return this.e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.d(parcel, 1, this.c);
        setHmAddress.b(parcel, 2, this.e, i, false);
        setHmAddress.b(parcel, 3, this.a, i, false);
        setHmAddress.e(parcel, b);
    }
}
