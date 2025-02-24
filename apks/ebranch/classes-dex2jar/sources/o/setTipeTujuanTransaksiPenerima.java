package o;

import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setTipeTujuanTransaksiPenerima.class */
final class setTipeTujuanTransaksiPenerima extends AbstractC0025realmSet$namaPengirim {
    private final Fragment a;
    private final List c = new ArrayList();
    private Activity d;
    protected realmSet$namaKontakPengirim e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTipeTujuanTransaksiPenerima(Fragment fragment) {
        this.a = fragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(setTipeTujuanTransaksiPenerima settipetujuantransaksipenerima, Activity activity) {
        settipetujuantransaksipenerima.d = activity;
        settipetujuantransaksipenerima.f();
    }

    @Override // o.AbstractC0025realmSet$namaPengirim
    public final void d(realmSet$namaKontakPengirim realmset_namakontakpengirim) {
        this.e = realmset_namakontakpengirim;
        f();
    }

    public final void f() {
        if (this.d != null && this.e != null && c() == null) {
            try {
                realmSet$NegaraTujuanPenerima.a(this.d);
                this.e.a(new setTypeOfProduct(this.a, setJenisMataUangTransaksi.c(this.d, null).a(realmSet$jenisWarkatTransaksi.d(this.d))));
                for (realmSet$NoHpPengirim realmset_nohppengirim : this.c) {
                    ((setTypeOfProduct) c()).e(realmset_nohppengirim);
                }
                this.c.clear();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException e2) {
            }
        }
    }
}
