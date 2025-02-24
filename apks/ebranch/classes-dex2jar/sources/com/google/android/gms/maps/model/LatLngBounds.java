package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import o.setFlagIB;
import o.setFotoPribadi;
import o.setHmAddress;
import o.setNegaraTujuanTransaksi;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/maps/model/LatLngBounds.class */
public final class LatLngBounds extends setFotoPribadi implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new setNegaraTujuanTransaksi();
    public final LatLng c;
    public final LatLng e;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        if (latLng == null) {
            throw new NullPointerException("southwest must not be null.");
        } else if (latLng2 != null) {
            double d = latLng2.c;
            double d2 = latLng.c;
            boolean z = false;
            double d3 = latLng2.c;
            if (d >= d2 ? true : z) {
                this.c = latLng;
                this.e = latLng2;
                return;
            }
            throw new IllegalArgumentException(String.format("southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(d3)));
        } else {
            throw new NullPointerException("northeast must not be null.");
        }
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.c.equals(latLngBounds.c) && this.e.equals(latLngBounds.e);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.e});
    }

    @Override // java.lang.Object
    public final String toString() {
        return new setFlagIB.IconCompatParcelizer(this).b("southwest", this.c).b("northeast", this.e).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LatLng latLng = this.c;
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        setHmAddress.b(parcel, 2, (Parcelable) latLng, i, false);
        setHmAddress.b(parcel, 3, (Parcelable) this.e, i, false);
        setHmAddress.e(parcel, dataPosition);
    }
}
