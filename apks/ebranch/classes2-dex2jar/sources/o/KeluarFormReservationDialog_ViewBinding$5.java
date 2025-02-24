package o;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
/* loaded from: classes2-dex2jar.jar:o/KeluarFormReservationDialog_ViewBinding$5.class */
final class KeluarFormReservationDialog_ViewBinding$5 implements View.OnClickListener {
    final /* synthetic */ KeluarFormReservationDialog_ViewBinding c;
    final /* synthetic */ View.OnClickListener d;

    KeluarFormReservationDialog_ViewBinding$5(KeluarFormReservationDialog_ViewBinding keluarFormReservationDialog_ViewBinding, View.OnClickListener onClickListener) {
        this.c = keluarFormReservationDialog_ViewBinding;
        this.d = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.d.onClick(view);
        KeluarFormReservationDialog_ViewBinding keluarFormReservationDialog_ViewBinding = this.c;
        if (KetentuanORDialog.e == null) {
            KetentuanORDialog.e = new KetentuanORDialog();
        }
        KetentuanORDialog.e.c(((BaseTransientBottomBar) keluarFormReservationDialog_ViewBinding).o, 1);
    }
}
