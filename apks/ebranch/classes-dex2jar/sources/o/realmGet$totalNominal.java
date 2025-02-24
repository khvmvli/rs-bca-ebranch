package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/realmGet$totalNominal.class */
public final class realmGet$totalNominal extends setFotoPribadi {
    public static final Parcelable.Creator<realmGet$totalNominal> CREATOR = new Parcelable.Creator() { // from class: o.realmGet$tipeNasabahPengirimId
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            boolean z = false;
            String str = null;
            IBinder iBinder = null;
            boolean z2 = false;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                int b2 = SafeParcelReader.b(b);
                if (b2 == 1) {
                    str = SafeParcelReader.b(parcel, b);
                } else if (b2 == 2) {
                    iBinder = SafeParcelReader.l(parcel, b);
                } else if (b2 == 3) {
                    z = SafeParcelReader.j(parcel, b);
                } else if (b2 != 4) {
                    SafeParcelReader.p(parcel, b);
                } else {
                    z2 = SafeParcelReader.j(parcel, b);
                }
            }
            SafeParcelReader.d(parcel, a);
            return new realmGet$totalNominal(str, iBinder, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new realmGet$totalNominal[i];
        }
    };
    @Nullable
    private final realmGet$statusKewarganegaraanPengirim a;
    private final boolean b;
    private final String c;
    private final boolean e;

    public realmGet$totalNominal(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        realmGet$statusPendudukPengirim realmget_statuspendudukpengirim;
        this.c = str;
        if (iBinder == null) {
            realmget_statuspendudukpengirim = null;
        } else {
            try {
                realmSet$noHpKontakPengirim e = setResVillage.e(iBinder).e();
                byte[] bArr = e == null ? null : (byte[]) realmSet$jenisWarkatTransaksi.e(e);
                if (bArr != null) {
                    realmget_statuspendudukpengirim = new realmGet$statusPendudukPengirim(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                    realmget_statuspendudukpengirim = null;
                }
            } catch (RemoteException e2) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
                realmget_statuspendudukpengirim = null;
            }
        }
        this.a = realmget_statuspendudukpengirim;
        this.b = z;
        this.e = z2;
    }

    public realmGet$totalNominal(String str, @Nullable realmGet$statusKewarganegaraanPengirim realmget_statuskewarganegaraanpengirim, boolean z, boolean z2) {
        this.c = str;
        this.a = realmget_statuskewarganegaraanpengirim;
        this.b = z;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.c;
        int b = setHmAddress.b(parcel);
        setHmAddress.c(parcel, 1, str, false);
        realmGet$statusKewarganegaraanPengirim realmget_statuskewarganegaraanpengirim = this.a;
        realmGet$statusKewarganegaraanPengirim realmget_statuskewarganegaraanpengirim2 = realmget_statuskewarganegaraanpengirim;
        if (realmget_statuskewarganegaraanpengirim == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            realmget_statuskewarganegaraanpengirim2 = null;
        }
        setHmAddress.b(parcel, 2, (IBinder) realmget_statuskewarganegaraanpengirim2, false);
        setHmAddress.b(parcel, 3, this.b);
        setHmAddress.b(parcel, 4, this.e);
        setHmAddress.e(parcel, b);
    }
}
