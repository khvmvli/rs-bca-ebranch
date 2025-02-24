package o;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* loaded from: classes2-dex2jar.jar:o/chooseCabangTerlaluJauh.class */
public class chooseCabangTerlaluJauh extends setShortcut {
    private boolean a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/chooseCabangTerlaluJauh$read.class */
    public final class read extends BottomSheetBehavior.read {
        private read() {
        }

        /* synthetic */ read(chooseCabangTerlaluJauh choosecabangterlalujauh, byte b) {
            this();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.read
        public final void d(View view) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.read
        public final void e(View view, int i) {
            if (i == 5) {
                chooseCabangTerlaluJauh.c(chooseCabangTerlaluJauh.this);
            }
        }
    }

    static /* synthetic */ void c(chooseCabangTerlaluJauh choosecabangterlalujauh) {
        if (choosecabangterlalujauh.a) {
            choosecabangterlalujauh.dismissAllowingStateLoss();
        } else {
            choosecabangterlalujauh.dismiss();
        }
    }

    private boolean e(boolean z) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof chooseKeperluanMendadak)) {
            return false;
        }
        chooseKeperluanMendadak choosekeperluanmendadak = (chooseKeperluanMendadak) dialog;
        if (choosekeperluanmendadak.a == null) {
            choosekeperluanmendadak.b();
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = choosekeperluanmendadak.a;
        if (!bottomSheetBehavior.n || !choosekeperluanmendadak.h) {
            return false;
        }
        this.a = z;
        if (bottomSheetBehavior.u != 5) {
            if (getDialog() instanceof chooseKeperluanMendadak) {
                chooseKeperluanMendadak choosekeperluanmendadak2 = (chooseKeperluanMendadak) getDialog();
                BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = choosekeperluanmendadak2.a;
                bottomSheetBehavior2.d.remove(choosekeperluanmendadak2.e);
            }
            read read2 = new read(this, (byte) 0);
            if (!bottomSheetBehavior.d.contains(read2)) {
                bottomSheetBehavior.d.add(read2);
            }
            bottomSheetBehavior.b(5);
            return true;
        } else if (this.a) {
            dismissAllowingStateLoss();
            return true;
        } else {
            dismiss();
            return true;
        }
    }

    public void dismiss() {
        if (!e(false)) {
            dismiss();
        }
    }

    public void dismissAllowingStateLoss() {
        if (!e(true)) {
            dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Dialog, o.chooseKeperluanMendadak] */
    public Dialog onCreateDialog(Bundle bundle) {
        return new chooseKeperluanMendadak(getContext(), getTheme());
    }
}
