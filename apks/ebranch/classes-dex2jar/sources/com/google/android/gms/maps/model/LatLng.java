package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import o.setFotoPribadi;
import o.setHmAddress;
import o.setNegaraTujuanPenerimaISO;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/maps/model/LatLng.class */
public final class LatLng extends setFotoPribadi implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new setNegaraTujuanPenerimaISO();
    public final double a;
    public final double c;

    public LatLng(double d, double d2) {
        if (d2 < -180.0d || d2 >= 180.0d) {
            this.a = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.a = d2;
        }
        this.c = Math.max(-90.0d, Math.min(90.0d, d));
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.c) == Double.doubleToLongBits(latLng.c) && Double.doubleToLongBits(this.a) == Double.doubleToLongBits(latLng.a);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.c);
        long doubleToLongBits2 = Double.doubleToLongBits(this.a);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("lat/lng: (");
        sb.append(this.c);
        sb.append(",");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        double d = this.c;
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(524290);
        parcel.writeDouble(d);
        double d2 = this.a;
        parcel.writeInt(524291);
        parcel.writeDouble(d2);
        setHmAddress.e(parcel, dataPosition);
    }
}
