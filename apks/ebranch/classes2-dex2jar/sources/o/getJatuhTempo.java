package o;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:o/getJatuhTempo.class */
public abstract class getJatuhTempo extends setStatusPendudukPengirim implements getKodeJenisWarkat {
    public getJatuhTempo() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final boolean d(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                setStatusKewarganegaraanPengirim.a(parcel, realmGet.jobValue.CREATOR);
                User$$Parcelable user$$Parcelable = (User$$Parcelable) setStatusKewarganegaraanPengirim.a(parcel, User$$Parcelable.CREATOR);
                setStatusKewarganegaraanPengirim.a(parcel);
                break;
            case 4:
                setStatusKewarganegaraanPengirim.a(parcel, Status.CREATOR);
                setStatusKewarganegaraanPengirim.a(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                setStatusKewarganegaraanPengirim.a(parcel, Status.CREATOR);
                setStatusKewarganegaraanPengirim.a(parcel);
                break;
            case 7:
                setStatusKewarganegaraanPengirim.a(parcel, Status.CREATOR);
                setStatusKewarganegaraanPengirim.a(parcel, GoogleSignInAccount.CREATOR);
                setStatusKewarganegaraanPengirim.a(parcel);
                break;
            case 8:
                setStatusKewarganegaraanPengirim.a(parcel);
                c((realmGet$kodeBank) setStatusKewarganegaraanPengirim.a(parcel, realmGet$kodeBank.CREATOR));
                break;
            case 9:
                getNamaBank getnamabank = (getNamaBank) setStatusKewarganegaraanPengirim.a(parcel, getNamaBank.CREATOR);
                setStatusKewarganegaraanPengirim.a(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
