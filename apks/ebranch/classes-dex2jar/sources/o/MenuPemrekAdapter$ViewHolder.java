package o;

import android.content.Intent;
import android.net.Uri;
import com.bca.smartbranch.dialog.HaloBCADialog;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/MenuPemrekAdapter$ViewHolder.class */
public final class MenuPemrekAdapter$ViewHolder {
    private static final String[] e = {"android.permission.CALL_PHONE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/MenuPemrekAdapter$ViewHolder$write.class */
    public static final class write implements LogRedirector.Logger {
        private final WeakReference<HaloBCADialog> b;

        private write(HaloBCADialog haloBCADialog) {
            this.b = new WeakReference<>(haloBCADialog);
        }

        /* synthetic */ write(HaloBCADialog haloBCADialog, byte b) {
            this(haloBCADialog);
        }

        public final void a() {
            HaloBCADialog haloBCADialog = this.b.get();
            if (haloBCADialog != null) {
                haloBCADialog.requestPermissions(MenuPemrekAdapter$ViewHolder.e, 41);
            }
        }
    }

    public static void c(HaloBCADialog haloBCADialog) {
        getView requireActivity = haloBCADialog.requireActivity();
        String[] strArr = e;
        if (Predicate.c(requireActivity, strArr)) {
            haloBCADialog.startActivity(new Intent("android.intent.action.CALL", Uri.fromParts("tel", haloBCADialog.nomorHalloBCA, null)));
            haloBCADialog.getDialog().dismiss();
        } else if (Predicate.e(haloBCADialog, strArr)) {
            HaloBCADialog.e(new write(haloBCADialog, (byte) 0));
        } else {
            haloBCADialog.requestPermissions(strArr, 41);
        }
    }

    public static void e(HaloBCADialog haloBCADialog, int i, int[] iArr) {
        if (i != 41) {
            return;
        }
        if (Predicate.c(iArr)) {
            haloBCADialog.startActivity(new Intent("android.intent.action.CALL", Uri.fromParts("tel", haloBCADialog.nomorHalloBCA, null)));
            haloBCADialog.getDialog().dismiss();
            return;
        }
        haloBCADialog.getDialog().dismiss();
    }
}
