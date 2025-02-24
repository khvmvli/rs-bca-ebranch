package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import o.setFlagIB;
import o.setFotoPribadi;
import o.setHmAddress;
import o.setLimitMinNominalTransaksi;
import o.setNoTelpPenerima;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/maps/model/StreetViewPanoramaCamera.class */
public class StreetViewPanoramaCamera extends setFotoPribadi implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new setNoTelpPenerima();
    private final setLimitMinNominalTransaksi b;
    public final float c;
    public final float d;
    public final float e;

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        boolean z = false;
        if (f2 >= -90.0f) {
            z = false;
            if (f2 <= 90.0f) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        String obj = sb.toString();
        if (z) {
            this.d = ((double) f) <= 0.0d ? 0.0f : f;
            this.c = 0.0f + f2;
            this.e = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
            setLimitMinNominalTransaksi.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new setLimitMinNominalTransaksi.RemoteActionCompatParcelizer();
            remoteActionCompatParcelizer.a = f2;
            remoteActionCompatParcelizer.e = f3;
            this.b = new setLimitMinNominalTransaksi(remoteActionCompatParcelizer.a, remoteActionCompatParcelizer.e);
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.d) == Float.floatToIntBits(streetViewPanoramaCamera.d) && Float.floatToIntBits(this.c) == Float.floatToIntBits(streetViewPanoramaCamera.c) && Float.floatToIntBits(this.e) == Float.floatToIntBits(streetViewPanoramaCamera.e);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.d), Float.valueOf(this.c), Float.valueOf(this.e)});
    }

    @Override // java.lang.Object
    public String toString() {
        return new setFlagIB.IconCompatParcelizer(this).b("zoom", Float.valueOf(this.d)).b("tilt", Float.valueOf(this.c)).b("bearing", Float.valueOf(this.e)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        float f = this.d;
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(262146);
        parcel.writeFloat(f);
        float f2 = this.c;
        parcel.writeInt(262147);
        parcel.writeFloat(f2);
        float f3 = this.e;
        parcel.writeInt(262148);
        parcel.writeFloat(f3);
        setHmAddress.e(parcel, dataPosition);
    }
}
