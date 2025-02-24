package o;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* loaded from: classes2-dex2jar.jar:o/DetailTujuanBNDialog.class */
public final class DetailTujuanBNDialog<S> extends ErrorGetBranchDialog_ViewBinding<S> {
    private DaftarTransferBerhasilDiupdateDialog a;
    private DepositoDialog<S> d;
    private int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> DetailTujuanBNDialog<T> a(DepositoDialog<T> depositoDialog, int i, DaftarTransferBerhasilDiupdateDialog daftarTransferBerhasilDiupdateDialog) {
        DetailTujuanBNDialog<T> detailTujuanBNDialog = new DetailTujuanBNDialog<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", depositoDialog);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", daftarTransferBerhasilDiupdateDialog);
        detailTujuanBNDialog.setArguments(bundle);
        return detailTujuanBNDialog;
    }

    public final void onCreate(Bundle bundle) {
        onCreate(bundle);
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = getArguments();
        }
        this.e = bundle2.getInt("THEME_RES_ID_KEY");
        this.d = (DepositoDialog) bundle2.getParcelable("DATE_SELECTOR_KEY");
        this.a = (DaftarTransferBerhasilDiupdateDialog) bundle2.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.e));
        DepositoDialog<S> depositoDialog = this.d;
        new ErrorGetBranchDialog<S>() { // from class: o.DetailTujuanBNDialog.3
            @Override // o.ErrorGetBranchDialog
            public final void a(S s) {
                Iterator it = DetailTujuanBNDialog.this.l.iterator();
                while (it.hasNext()) {
                    ((ErrorGetBranchDialog) it.next()).a(s);
                }
            }
        };
        return depositoDialog.i();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.a);
    }
}
