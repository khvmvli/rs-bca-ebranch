package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import o.setFlagIB;
import o.setFotoPribadi;
import o.setHmAddress;
import o.setNegaraBagianPenerimaCode;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/maps/model/CameraPosition.class */
public final class CameraPosition extends setFotoPribadi implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new setNegaraBagianPenerimaCode();
    public final float a;
    public final LatLng b;
    public final float c;
    public final float d;

    /* loaded from: classes-dex2jar.jar:com/google/android/gms/maps/model/CameraPosition$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        public LatLng a;
        public float b;
        public float c;
        public float d;
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        if (latLng != null) {
            if (f2 >= 0.0f && f2 <= 90.0f) {
                this.b = latLng;
                this.c = f;
                this.a = f2 + 0.0f;
                this.d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
                return;
            }
            throw new IllegalArgumentException(String.format("Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2)));
        }
        throw new NullPointerException("camera target must not be null.");
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.b.equals(cameraPosition.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cameraPosition.c) && Float.floatToIntBits(this.a) == Float.floatToIntBits(cameraPosition.a) && Float.floatToIntBits(this.d) == Float.floatToIntBits(cameraPosition.d);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Float.valueOf(this.c), Float.valueOf(this.a), Float.valueOf(this.d)});
    }

    @Override // java.lang.Object
    public final String toString() {
        return new setFlagIB.IconCompatParcelizer(this).b("target", this.b).b("zoom", Float.valueOf(this.c)).b("tilt", Float.valueOf(this.a)).b("bearing", Float.valueOf(this.d)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LatLng latLng = this.b;
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        setHmAddress.b(parcel, 2, (Parcelable) latLng, i, false);
        float f = this.c;
        parcel.writeInt(262147);
        parcel.writeFloat(f);
        float f2 = this.a;
        parcel.writeInt(262148);
        parcel.writeFloat(f2);
        float f3 = this.d;
        parcel.writeInt(262149);
        parcel.writeFloat(f3);
        setHmAddress.e(parcel, dataPosition);
    }
}
