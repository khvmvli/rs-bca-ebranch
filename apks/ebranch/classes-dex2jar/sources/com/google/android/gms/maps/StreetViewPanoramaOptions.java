package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import o.setAlamatLengkapPenerima;
import o.setFlagIB;
import o.setFotoPribadi;
import o.setHmAddress;
import o.setNegaraBagianBankPenerima;
import o.setPPUNumber;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/maps/StreetViewPanoramaOptions.class */
public final class StreetViewPanoramaOptions extends setFotoPribadi implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new setPPUNumber();
    private LatLng a;
    private Integer b;
    private Boolean c;
    private StreetViewPanoramaCamera d;
    private String e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private setNegaraBagianBankPenerima i;
    private Boolean j;

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.c = bool;
        this.g = bool;
        this.h = bool;
        this.j = bool;
        this.i = setNegaraBagianBankPenerima.a;
    }

    public StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, setNegaraBagianBankPenerima setnegarabagianbankpenerima) {
        Boolean bool = Boolean.TRUE;
        this.c = bool;
        this.g = bool;
        this.h = bool;
        this.j = bool;
        this.i = setNegaraBagianBankPenerima.a;
        this.d = streetViewPanoramaCamera;
        this.a = latLng;
        this.b = num;
        this.e = str;
        this.c = setAlamatLengkapPenerima.a(b);
        this.g = setAlamatLengkapPenerima.a(b2);
        this.h = setAlamatLengkapPenerima.a(b3);
        this.j = setAlamatLengkapPenerima.a(b4);
        this.f = setAlamatLengkapPenerima.a(b5);
        this.i = setnegarabagianbankpenerima;
    }

    @Override // java.lang.Object
    public final String toString() {
        return new setFlagIB.IconCompatParcelizer(this).b("PanoramaId", this.e).b("Position", this.a).b("Radius", this.b).b("Source", this.i).b("StreetViewPanoramaCamera", this.d).b("UserNavigationEnabled", this.c).b("ZoomGesturesEnabled", this.g).b("PanningGesturesEnabled", this.h).b("StreetNamesEnabled", this.j).b("UseViewLifecycleInFragment", this.f).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        setHmAddress.b(parcel, 2, (Parcelable) this.d, i, false);
        setHmAddress.c(parcel, 3, this.e, false);
        setHmAddress.b(parcel, 4, (Parcelable) this.a, i, false);
        setHmAddress.e(parcel, 5, this.b, false);
        byte e = setAlamatLengkapPenerima.e(this.c);
        parcel.writeInt(262150);
        parcel.writeInt(e);
        byte e2 = setAlamatLengkapPenerima.e(this.g);
        parcel.writeInt(262151);
        parcel.writeInt(e2);
        byte e3 = setAlamatLengkapPenerima.e(this.h);
        parcel.writeInt(262152);
        parcel.writeInt(e3);
        byte e4 = setAlamatLengkapPenerima.e(this.j);
        parcel.writeInt(262153);
        parcel.writeInt(e4);
        byte e5 = setAlamatLengkapPenerima.e(this.f);
        parcel.writeInt(262154);
        parcel.writeInt(e5);
        setHmAddress.b(parcel, 11, (Parcelable) this.i, i, false);
        setHmAddress.e(parcel, dataPosition);
    }
}
