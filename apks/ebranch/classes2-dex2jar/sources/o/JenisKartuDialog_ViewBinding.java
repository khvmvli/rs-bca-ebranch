package o;

import android.graphics.drawable.Drawable;
import android.view.View;
/* loaded from: classes2-dex2jar.jar:o/JenisKartuDialog_ViewBinding.class */
public final class JenisKartuDialog_ViewBinding {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static InfoNegaraORDialog_ViewBinding a(int i) {
        if (i != 0 && i == 1) {
            return new JenisIdDialog();
        }
        return new JenisPekerjaanDialog_ViewBinding();
    }

    public static void d(View view) {
        Drawable background = view.getBackground();
        if (background instanceof JenisKodeBankDialog) {
            JenisKodeBankDialog jenisKodeBankDialog = (JenisKodeBankDialog) background;
            if (jenisKodeBankDialog.l()) {
                jenisKodeBankDialog.n(HaloBCADialog.c(view));
            }
        }
    }
}
