package com.google.android.gms.maps;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import o.setAlamatLengkapPenerima;
import o.setFlagIB;
import o.setFotoPribadi;
import o.setHmAddress;
import o.setSumberDanaTransaksiKode;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/maps/GoogleMapOptions.class */
public final class GoogleMapOptions extends setFotoPribadi implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new setSumberDanaTransaksiKode();
    public static final Integer e = Integer.valueOf(Color.argb(255, 236, 233, 225));
    public Boolean a;
    public Boolean b;
    public int c;
    public CameraPosition d;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Boolean j;
    public Boolean k;
    public Boolean l;
    public Boolean m;
    public Float n;

    /* renamed from: o */
    public Boolean f72o;
    public LatLngBounds p;
    public String q;
    public Boolean r;
    public Integer s;
    public Float t;
    public int w;

    public GoogleMapOptions() {
        this.c = -1;
        this.n = null;
        this.t = null;
        this.p = null;
        this.s = null;
        this.q = null;
    }

    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str, int i2) {
        this.c = -1;
        this.n = null;
        this.t = null;
        this.p = null;
        this.s = null;
        this.q = null;
        this.a = setAlamatLengkapPenerima.a(b);
        this.b = setAlamatLengkapPenerima.a(b2);
        this.c = i;
        this.d = cameraPosition;
        this.g = setAlamatLengkapPenerima.a(b3);
        this.h = setAlamatLengkapPenerima.a(b4);
        this.j = setAlamatLengkapPenerima.a(b5);
        this.f = setAlamatLengkapPenerima.a(b6);
        this.i = setAlamatLengkapPenerima.a(b7);
        this.l = setAlamatLengkapPenerima.a(b8);
        this.m = setAlamatLengkapPenerima.a(b9);
        this.k = setAlamatLengkapPenerima.a(b10);
        this.f72o = setAlamatLengkapPenerima.a(b11);
        this.n = f;
        this.t = f2;
        this.p = latLngBounds;
        this.r = setAlamatLengkapPenerima.a(b12);
        this.s = num;
        this.q = str;
        this.w = i2;
    }

    @Override // java.lang.Object
    public final String toString() {
        return new setFlagIB.IconCompatParcelizer(this).b("MapType", Integer.valueOf(this.c)).b("LiteMode", this.m).b("Camera", this.d).b("CompassEnabled", this.h).b("ZoomControlsEnabled", this.g).b("ScrollGesturesEnabled", this.j).b("ZoomGesturesEnabled", this.f).b("TiltGesturesEnabled", this.i).b("RotateGesturesEnabled", this.l).b("ScrollGesturesEnabledDuringRotateOrZoom", this.r).b("MapToolbarEnabled", this.k).b("AmbientEnabled", this.f72o).b("MinZoomPreference", this.n).b("MaxZoomPreference", this.t).b("BackgroundColor", this.s).b("LatLngBoundsForCameraTarget", this.p).b("ZOrderOnTop", this.a).b("UseViewLifecycleInFragment", this.b).b("mapColorScheme", Integer.valueOf(this.w)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        byte e2 = setAlamatLengkapPenerima.e(this.a);
        parcel.writeInt(262146);
        parcel.writeInt(e2);
        byte e3 = setAlamatLengkapPenerima.e(this.b);
        parcel.writeInt(262147);
        parcel.writeInt(e3);
        int i2 = this.c;
        parcel.writeInt(262148);
        parcel.writeInt(i2);
        setHmAddress.b(parcel, 5, (Parcelable) this.d, i, false);
        byte e4 = setAlamatLengkapPenerima.e(this.g);
        parcel.writeInt(262150);
        parcel.writeInt(e4);
        byte e5 = setAlamatLengkapPenerima.e(this.h);
        parcel.writeInt(262151);
        parcel.writeInt(e5);
        byte e6 = setAlamatLengkapPenerima.e(this.j);
        parcel.writeInt(262152);
        parcel.writeInt(e6);
        byte e7 = setAlamatLengkapPenerima.e(this.f);
        parcel.writeInt(262153);
        parcel.writeInt(e7);
        byte e8 = setAlamatLengkapPenerima.e(this.i);
        parcel.writeInt(262154);
        parcel.writeInt(e8);
        byte e9 = setAlamatLengkapPenerima.e(this.l);
        parcel.writeInt(262155);
        parcel.writeInt(e9);
        byte e10 = setAlamatLengkapPenerima.e(this.m);
        parcel.writeInt(262156);
        parcel.writeInt(e10);
        byte e11 = setAlamatLengkapPenerima.e(this.k);
        parcel.writeInt(262158);
        parcel.writeInt(e11);
        byte e12 = setAlamatLengkapPenerima.e(this.f72o);
        parcel.writeInt(262159);
        parcel.writeInt(e12);
        setHmAddress.e(parcel, 16, this.n, false);
        setHmAddress.e(parcel, 17, this.t, false);
        setHmAddress.b(parcel, 18, (Parcelable) this.p, i, false);
        byte e13 = setAlamatLengkapPenerima.e(this.r);
        parcel.writeInt(262163);
        parcel.writeInt(e13);
        setHmAddress.e(parcel, 20, this.s, false);
        setHmAddress.c(parcel, 21, this.q, false);
        int i3 = this.w;
        parcel.writeInt(262167);
        parcel.writeInt(i3);
        setHmAddress.e(parcel, dataPosition);
    }
}
