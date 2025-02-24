package o;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* renamed from: o.setAccounttype */
/* loaded from: classes-dex2jar.jar:o/setAccounttype.class */
public final class C0032setAccounttype implements realmSet$FlagAlamatBankPenerimaBelumSesuai {
    @Override // o.realmSet$FlagAlamatBankPenerimaBelumSesuai
    public final realmGet$occupationFlagFreeText<realmSet$FlagBicCode> c(realmGet$occupation realmget_occupation, realmSet$FlagHubunganKeuanganTransaksi realmset_flaghubungankeuangantransaksi) {
        return realmget_occupation.c((realmGet$occupation) new realmSet$KeteranganAlamatBankPenerima<realmSet$FlagBicCode>(this, realmget_occupation, realmset_flaghubungankeuangantransaksi, null) { // from class: o.realmGet$accounttype
            final /* synthetic */ realmSet$FlagHubunganKeuanganTransaksi e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r6;
            }

            @Override // o.realmGet$religionOthers.write
            public final /* synthetic */ void d(realmGet$accountNumber realmget_accountnumber) throws RemoteException {
                realmget_accountnumber.a(this.e, this, (String) null);
            }

            @Override // o.realmGet$purposePemRekOthers
            public final /* synthetic */ realmGet$oldCustFlag e(Status status) {
                return new realmSet$FlagBicCode(status, null);
            }
        });
    }
}
