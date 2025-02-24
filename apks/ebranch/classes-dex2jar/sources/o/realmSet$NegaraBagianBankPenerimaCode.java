package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/realmSet$NegaraBagianBankPenerimaCode.class */
public final class realmSet$NegaraBagianBankPenerimaCode extends setFotoPribadi {
    public static final Parcelable.Creator<realmSet$NegaraBagianBankPenerimaCode> CREATOR = new Parcelable.Creator<realmSet$NegaraBagianBankPenerimaCode>() { // from class: o.realmSet$NamaPengirim
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ realmSet$NegaraBagianBankPenerimaCode createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            long j = 50;
            long j2 = Long.MAX_VALUE;
            boolean z = true;
            float f = 0.0f;
            int i = Integer.MAX_VALUE;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                int b2 = SafeParcelReader.b(b);
                if (b2 == 1) {
                    z = SafeParcelReader.j(parcel, b);
                } else if (b2 == 2) {
                    j = SafeParcelReader.r(parcel, b);
                } else if (b2 == 3) {
                    f = SafeParcelReader.m(parcel, b);
                } else if (b2 == 4) {
                    j2 = SafeParcelReader.r(parcel, b);
                } else if (b2 != 5) {
                    SafeParcelReader.p(parcel, b);
                } else {
                    i = SafeParcelReader.k(parcel, b);
                }
            }
            SafeParcelReader.d(parcel, a);
            return new realmSet$NegaraBagianBankPenerimaCode(z, j, f, j2, i);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ realmSet$NegaraBagianBankPenerimaCode[] newArray(int i) {
            return new realmSet$NegaraBagianBankPenerimaCode[i];
        }
    };
    long a;
    int b;
    float c;
    long d;
    boolean e;

    public realmSet$NegaraBagianBankPenerimaCode() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public realmSet$NegaraBagianBankPenerimaCode(boolean z, long j, float f, long j2, int i) {
        this.e = z;
        this.a = j;
        this.c = f;
        this.d = j2;
        this.b = i;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof realmSet$NegaraBagianBankPenerimaCode)) {
            return false;
        }
        realmSet$NegaraBagianBankPenerimaCode realmset_negarabagianbankpenerimacode = (realmSet$NegaraBagianBankPenerimaCode) obj;
        return this.e == realmset_negarabagianbankpenerimacode.e && this.a == realmset_negarabagianbankpenerimacode.a && Float.compare(this.c, realmset_negarabagianbankpenerimacode.c) == 0 && this.d == realmset_negarabagianbankpenerimacode.d && this.b == realmset_negarabagianbankpenerimacode.b;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return setFlagIB.b(Boolean.valueOf(this.e), Long.valueOf(this.a), Float.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.b));
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.e);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.a);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.c);
        long j = this.d;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.b != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.b);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.b(parcel, 1, this.e);
        setHmAddress.e(parcel, 2, this.a);
        setHmAddress.b(parcel, 3, this.c);
        setHmAddress.e(parcel, 4, this.d);
        setHmAddress.d(parcel, 5, this.b);
        setHmAddress.e(parcel, b);
    }
}
