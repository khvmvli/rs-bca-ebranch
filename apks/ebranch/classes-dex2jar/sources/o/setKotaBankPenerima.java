package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setKotaBankPenerima.class */
public final class setKotaBankPenerima extends setFotoPribadi {
    public static final Parcelable.Creator<setKotaBankPenerima> CREATOR = new setNegaraTujuanPenerima();
    public int a;
    public LatLng b;
    public float c;
    public int d;
    public double e;
    private boolean g;
    private boolean h;
    private float i;
    private List j;

    public setKotaBankPenerima() {
        this.b = null;
        this.e = 0.0d;
        this.c = 10.0f;
        this.d = -16777216;
        this.a = 0;
        this.i = 0.0f;
        this.g = true;
        this.h = false;
        this.j = null;
    }

    public setKotaBankPenerima(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List list) {
        this.b = latLng;
        this.e = d;
        this.c = f;
        this.d = i;
        this.a = i2;
        this.i = f2;
        this.g = z;
        this.h = z2;
        this.j = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        setHmAddress.b(parcel, 2, (Parcelable) this.b, i, false);
        double d = this.e;
        parcel.writeInt(524291);
        parcel.writeDouble(d);
        float f = this.c;
        parcel.writeInt(262148);
        parcel.writeFloat(f);
        int i2 = this.d;
        parcel.writeInt(262149);
        parcel.writeInt(i2);
        int i3 = this.a;
        parcel.writeInt(262150);
        parcel.writeInt(i3);
        float f2 = this.i;
        parcel.writeInt(262151);
        parcel.writeFloat(f2);
        boolean z = this.g;
        parcel.writeInt(262152);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.h;
        parcel.writeInt(262153);
        parcel.writeInt(z2 ? 1 : 0);
        setHmAddress.a(parcel, 10, this.j, false);
        setHmAddress.e(parcel, dataPosition);
    }
}
