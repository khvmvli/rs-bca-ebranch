package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationResult;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.setFotoPribadi;
import o.setHmAddress;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/location/LocationResult.class */
public final class LocationResult extends setFotoPribadi implements ReflectedParcelable {
    private final List<Location> e;
    public static final List<Location> a = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new Parcelable.Creator<LocationResult>() { // from class: o.realmSet$KodeSwiftBankPenerima
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LocationResult createFromParcel(Parcel parcel) {
            int a2 = SafeParcelReader.a(parcel);
            List<Location> list = LocationResult.a;
            while (parcel.dataPosition() < a2) {
                int b = SafeParcelReader.b(parcel);
                if (SafeParcelReader.b(b) != 1) {
                    SafeParcelReader.p(parcel, b);
                } else {
                    list = SafeParcelReader.c(parcel, b, Location.CREATOR);
                }
            }
            SafeParcelReader.d(parcel, a2);
            return new LocationResult(list);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocationResult[] newArray(int i) {
            return new LocationResult[i];
        }
    };

    public LocationResult(List<Location> list) {
        this.e = list;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.e.size() != this.e.size()) {
            return false;
        }
        Iterator<Location> it = this.e.iterator();
        for (Location location : locationResult.e) {
            if (it.next().getTime() != location.getTime()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        int i = 17;
        for (Location location : this.e) {
            long time = location.getTime();
            i = (i * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i;
    }

    @Override // java.lang.Object
    public final String toString() {
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        setHmAddress.a(parcel, 1, (List) this.e, false);
        setHmAddress.e(parcel, dataPosition);
    }
}
