package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes-dex2jar.jar:o/setNamaBankPenerima.class */
public class setNamaBankPenerima extends setFotoPribadi {
    public static final Parcelable.Creator<setNamaBankPenerima> CREATOR = new setNoIBANPenerima();
    private setKeteranganAlamatBankPenerima a;
    private String b;
    private LatLng c;
    public int d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;

    /* renamed from: o */
    private float f247o;
    private String p;
    private float q;
    private View s;
    private int t;

    public setNamaBankPenerima() {
        this.i = 0.5f;
        this.j = 1.0f;
        this.g = true;
        this.h = false;
        this.l = 0.0f;
        this.m = 0.5f;
        this.k = 0.0f;
        this.n = 1.0f;
        this.t = 0;
    }

    public setNamaBankPenerima(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7, int i, IBinder iBinder2, int i2, String str3, float f8) {
        this.i = 0.5f;
        this.j = 1.0f;
        this.g = true;
        this.h = false;
        this.l = 0.0f;
        this.m = 0.5f;
        this.k = 0.0f;
        this.n = 1.0f;
        this.t = 0;
        this.c = latLng;
        this.b = str;
        this.e = str2;
        View view = null;
        if (iBinder == null) {
            this.a = null;
        } else {
            this.a = new setKeteranganAlamatBankPenerima(realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(iBinder));
        }
        this.i = f;
        this.j = f2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.l = f3;
        this.m = f4;
        this.k = f5;
        this.n = f6;
        this.f247o = f7;
        this.d = i2;
        this.t = i;
        realmSet$noHpKontakPengirim d = realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(iBinder2);
        this.s = d != null ? (View) realmSet$jenisWarkatTransaksi.e(d) : view;
        this.p = str3;
        this.q = f8;
    }

    public setNamaBankPenerima a(setKeteranganAlamatBankPenerima setketeranganalamatbankpenerima) {
        this.a = setketeranganalamatbankpenerima;
        return this;
    }

    public setNamaBankPenerima b(LatLng latLng) {
        if (latLng != null) {
            this.c = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public setNamaBankPenerima c(String str) {
        this.e = str;
        return this;
    }

    public setNamaBankPenerima d(String str) {
        this.b = str;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        setHmAddress.b(parcel, 2, (Parcelable) this.c, i, false);
        setHmAddress.c(parcel, 3, this.b, false);
        setHmAddress.c(parcel, 4, this.e, false);
        setKeteranganAlamatBankPenerima setketeranganalamatbankpenerima = this.a;
        setHmAddress.b(parcel, 5, setketeranganalamatbankpenerima == null ? null : setketeranganalamatbankpenerima.e.asBinder(), false);
        float f = this.i;
        parcel.writeInt(262150);
        parcel.writeFloat(f);
        float f2 = this.j;
        parcel.writeInt(262151);
        parcel.writeFloat(f2);
        boolean z = this.f;
        parcel.writeInt(262152);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.g;
        parcel.writeInt(262153);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.h;
        parcel.writeInt(262154);
        parcel.writeInt(z3 ? 1 : 0);
        float f3 = this.l;
        parcel.writeInt(262155);
        parcel.writeFloat(f3);
        float f4 = this.m;
        parcel.writeInt(262156);
        parcel.writeFloat(f4);
        float f5 = this.k;
        parcel.writeInt(262157);
        parcel.writeFloat(f5);
        float f6 = this.n;
        parcel.writeInt(262158);
        parcel.writeFloat(f6);
        float f7 = this.f247o;
        parcel.writeInt(262159);
        parcel.writeFloat(f7);
        int i2 = this.t;
        parcel.writeInt(262161);
        parcel.writeInt(i2);
        setHmAddress.b(parcel, 18, new realmSet$jenisWarkatTransaksi(this.s).asBinder(), false);
        int i3 = this.d;
        parcel.writeInt(262163);
        parcel.writeInt(i3);
        setHmAddress.c(parcel, 20, this.p, false);
        float f8 = this.q;
        parcel.writeInt(262165);
        parcel.writeFloat(f8);
        setHmAddress.e(parcel, dataPosition);
    }
}
