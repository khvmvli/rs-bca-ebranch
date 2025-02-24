package o;

import android.content.Context;
import android.graphics.Color;
/* loaded from: classes2-dex2jar.jar:o/ExitReservasiDialog.class */
public final class ExitReservasiDialog {
    private final float a;
    private final int c;
    private final int d;
    public final boolean e;

    public ExitReservasiDialog(Context context) {
        this.e = HubunganDialog_ViewBinding.e(context, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.r, false);
        this.c = DaftarTransferORBerhasilDiupdateDialog.d(context, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.s, 0);
        this.d = DaftarTransferORBerhasilDiupdateDialog.d(context, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.t, 0);
        this.a = context.getResources().getDisplayMetrics().density;
    }

    public final int d(int i, float f) {
        int i2 = i;
        if (this.e) {
            i2 = i;
            if (isRound.b(i, 255) == this.d) {
                float f2 = this.a;
                float f3 = 0.0f;
                if (f2 > 0.0f) {
                    f3 = 0.0f;
                    if (f > 0.0f) {
                        f3 = Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                    }
                }
                int alpha = Color.alpha(i);
                int b = isRound.b(i, 255);
                int i3 = this.c;
                i2 = isRound.b(isRound.a(isRound.b(i3, Math.round(((float) Color.alpha(i3)) * f3)), b), alpha);
            }
        }
        return i2;
    }
}
