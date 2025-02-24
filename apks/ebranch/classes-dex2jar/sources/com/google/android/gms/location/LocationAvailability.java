package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationAvailability;
import java.util.Arrays;
import o.realmSet$KotaBankPenerima;
import o.setFotoPribadi;
import o.setHmAddress;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/location/LocationAvailability.class */
public final class LocationAvailability extends setFotoPribadi implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new Parcelable.Creator<LocationAvailability>() { // from class: o.realmSet$JenisKodeBankTransaksi
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            long j = 0;
            realmSet$KotaBankPenerima[] realmset_kotabankpenerimaArr = null;
            int i = CloseCodes.NORMAL_CLOSURE;
            int i2 = 1;
            int i3 = 1;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                int b2 = SafeParcelReader.b(b);
                if (b2 == 1) {
                    i2 = SafeParcelReader.k(parcel, b);
                } else if (b2 == 2) {
                    i3 = SafeParcelReader.k(parcel, b);
                } else if (b2 == 3) {
                    j = SafeParcelReader.r(parcel, b);
                } else if (b2 == 4) {
                    i = SafeParcelReader.k(parcel, b);
                } else if (b2 != 5) {
                    SafeParcelReader.p(parcel, b);
                } else {
                    realmset_kotabankpenerimaArr = (realmSet$KotaBankPenerima[]) SafeParcelReader.d(parcel, b, realmSet$KotaBankPenerima.CREATOR);
                }
            }
            SafeParcelReader.d(parcel, a);
            return new LocationAvailability(i, i2, i3, j, realmset_kotabankpenerimaArr);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i) {
            return new LocationAvailability[i];
        }
    };
    int a;
    realmSet$KotaBankPenerima[] b;
    @Deprecated
    int c;
    @Deprecated
    int d;
    long e;

    public LocationAvailability(int i, int i2, int i3, long j, realmSet$KotaBankPenerima[] realmset_kotabankpenerimaArr) {
        this.a = i;
        this.d = i2;
        this.c = i3;
        this.e = j;
        this.b = realmset_kotabankpenerimaArr;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationAvailability)) {
            return false;
        }
        LocationAvailability locationAvailability = (LocationAvailability) obj;
        return this.d == locationAvailability.d && this.c == locationAvailability.c && this.e == locationAvailability.e && this.a == locationAvailability.a && Arrays.equals(this.b, locationAvailability.b);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.d), Integer.valueOf(this.c), Long.valueOf(this.e), this.b});
    }

    @Override // java.lang.Object
    public final String toString() {
        boolean z = this.a < 1000;
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        int i2 = this.d;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        int i3 = this.c;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        long j = this.e;
        parcel.writeInt(524291);
        parcel.writeLong(j);
        int i4 = this.a;
        parcel.writeInt(262148);
        parcel.writeInt(i4);
        setHmAddress.b(parcel, 5, (Parcelable[]) this.b, i, false);
        setHmAddress.e(parcel, dataPosition);
    }
}
