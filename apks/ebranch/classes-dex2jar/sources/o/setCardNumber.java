package o;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
/* loaded from: classes-dex2jar.jar:o/setCardNumber.class */
final class setCardNumber extends Category {
    final /* synthetic */ realmSet$CodewordBankPenerima c;
    final /* synthetic */ LocationRequest e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setCardNumber(realmSet$code realmset_code, realmGet$occupation realmget_occupation, LocationRequest locationRequest, realmSet$CodewordBankPenerima realmset_codewordbankpenerima) {
        super(realmget_occupation);
        this.e = locationRequest;
        this.c = realmset_codewordbankpenerima;
    }

    @Override // o.realmGet$religionOthers.write
    public final /* synthetic */ void d(realmGet$accountNumber realmget_accountnumber) throws RemoteException {
        realmget_accountnumber.c(this.e, realmGet$resRW.c(this.c, getExpired.c(), "LocationListener"), new setBankTujuanBIC(this) { // from class: o.realmSet$description
            private final realmGet$religionOthers$MediaBrowserCompat$CustomActionResultReceiver<Status> b;

            {
                this.b = r4;
            }

            @Override // o.setBankTujuanPenerima
            public final void d() {
            }

            @Override // o.setBankTujuanPenerima
            public final void d(C0026realmSet$norekPenerima realmset_norekpenerima) {
                this.b.d(realmset_norekpenerima.e());
            }
        });
    }
}
