package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:o/realmSet$expired.class */
public final class realmSet$expired extends setFotoPribadi {
    public static final Parcelable.Creator<realmSet$expired> CREATOR = new setExpired();
    final realmGet$expired a;
    final realmSet$FlagSimpanDaftarTransferPenerima b;
    final setBankTujuanPenerima d;
    final int e;

    public realmSet$expired(int i, realmGet$expired realmget_expired, IBinder iBinder, IBinder iBinder2) {
        this.e = i;
        this.a = realmget_expired;
        setBankTujuanPenerima setbanktujuanpenerima = null;
        this.b = iBinder == null ? null : realmSet$FlagSettleViaBankPenerima.e(iBinder);
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            setbanktujuanpenerima = queryLocalInterface instanceof setBankTujuanPenerima ? (setBankTujuanPenerima) queryLocalInterface : new setAlamatPenerima(iBinder2);
        }
        this.d = setbanktujuanpenerima;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.d(parcel, 1, this.e);
        setHmAddress.b(parcel, 2, (Parcelable) this.a, i, false);
        realmSet$FlagSimpanDaftarTransferPenerima realmset_flagsimpandaftartransferpenerima = this.b;
        IBinder iBinder = null;
        setHmAddress.b(parcel, 3, realmset_flagsimpandaftartransferpenerima == null ? null : realmset_flagsimpandaftartransferpenerima.asBinder(), false);
        setBankTujuanPenerima setbanktujuanpenerima = this.d;
        if (setbanktujuanpenerima != null) {
            iBinder = setbanktujuanpenerima.asBinder();
        }
        setHmAddress.b(parcel, 4, iBinder, false);
        setHmAddress.e(parcel, b);
    }
}
