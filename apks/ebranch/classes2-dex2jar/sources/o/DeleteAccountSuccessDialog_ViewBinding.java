package o;

import android.os.Bundle;
import android.view.View;
/* loaded from: classes2-dex2jar.jar:o/DeleteAccountSuccessDialog_ViewBinding.class */
public final class DeleteAccountSuccessDialog_ViewBinding<S> extends ErrorGetBranchDialog_ViewBinding<S> {
    DaftarTransferBerhasilDiupdateDialog c;
    DeskripsiPekerjaanDialog_ViewBinding f;
    View g;
    DepositoDialog_ViewBinding h;
    DepositoDialog<S> i;
    read j;
    setOnStartEnterTransitionListener k;
    private View m;
    private int n;

    /* renamed from: o */
    setOnStartEnterTransitionListener f23o;
    static final Object e = "MONTHS_VIEW_GROUP_TAG";
    static final Object b = "NAVIGATION_PREV_TAG";
    static final Object d = "NAVIGATION_NEXT_TAG";
    static final Object a = "SELECTOR_TOGGLE_TAG";

    /* loaded from: classes2-dex2jar.jar:o/DeleteAccountSuccessDialog_ViewBinding$read.class */
    public enum read {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/DeleteAccountSuccessDialog_ViewBinding$write.class */
    public interface write {
        void e(long j);
    }

    public static <T> DeleteAccountSuccessDialog_ViewBinding<T> d(DepositoDialog<T> depositoDialog, int i, DaftarTransferBerhasilDiupdateDialog daftarTransferBerhasilDiupdateDialog) {
        DeleteAccountSuccessDialog_ViewBinding<T> deleteAccountSuccessDialog_ViewBinding = new DeleteAccountSuccessDialog_ViewBinding<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", depositoDialog);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", daftarTransferBerhasilDiupdateDialog);
        bundle.putParcelable("CURRENT_MONTH_KEY", daftarTransferBerhasilDiupdateDialog.b);
        deleteAccountSuccessDialog_ViewBinding.setArguments(bundle);
        return deleteAccountSuccessDialog_ViewBinding;
    }

    public final void b(read read2) {
        this.j = read2;
        if (read2 == read.YEAR) {
            this.f23o.z.d(this.f.g - this.f23o.g.e.c.c.g);
            this.m.setVisibility(0);
            this.g.setVisibility(8);
        } else if (read2 == read.DAY) {
            this.m.setVisibility(8);
            this.g.setVisibility(0);
            d(this.f);
        }
    }

    @Override // o.ErrorGetBranchDialog_ViewBinding
    public final boolean c(ErrorGetBranchDialog<S> errorGetBranchDialog) {
        return c(errorGetBranchDialog);
    }

    public final void d(DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding) {
        ErrorGetCityListDialog errorGetCityListDialog = this.k.g;
        final int b2 = errorGetCityListDialog.e.c.b(deskripsiPekerjaanDialog_ViewBinding);
        int b3 = b2 - errorGetCityListDialog.e.c.b(this.f);
        boolean z = false;
        boolean z2 = Math.abs(b3) > 3;
        if (b3 > 0) {
            z = true;
        }
        this.f = deskripsiPekerjaanDialog_ViewBinding;
        if (z2 && z) {
            this.k.c(b2 - 3);
            this.k.post(new Runnable() { // from class: o.DeleteAccountSuccessDialog_ViewBinding.3
                @Override // java.lang.Runnable
                public final void run() {
                    DeleteAccountSuccessDialog_ViewBinding.this.k.e(b2);
                }
            });
        } else if (z2) {
            this.k.c(b2 + 3);
            this.k.post(new Runnable() { // from class: o.DeleteAccountSuccessDialog_ViewBinding.3
                @Override // java.lang.Runnable
                public final void run() {
                    DeleteAccountSuccessDialog_ViewBinding.this.k.e(b2);
                }
            });
        } else {
            this.k.post(new Runnable() { // from class: o.DeleteAccountSuccessDialog_ViewBinding.3
                @Override // java.lang.Runnable
                public final void run() {
                    DeleteAccountSuccessDialog_ViewBinding.this.k.e(b2);
                }
            });
        }
    }

    public final void onCreate(Bundle bundle) {
        onCreate(bundle);
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = getArguments();
        }
        this.n = bundle2.getInt("THEME_RES_ID_KEY");
        this.i = (DepositoDialog) bundle2.getParcelable("GRID_SELECTOR_KEY");
        this.c = (DaftarTransferBerhasilDiupdateDialog) bundle2.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f = (DeskripsiPekerjaanDialog_ViewBinding) bundle2.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARN: Type inference failed for: r0v48, types: [o.CancelReservasiDialog_ViewBinding, android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v53, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v57, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
        // Method dump skipped, instructions count: 622
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DeleteAccountSuccessDialog_ViewBinding.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.n);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.i);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.c);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f);
    }
}
