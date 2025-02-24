package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import o.BaseDialogKotlin;
/* loaded from: classes2-dex2jar.jar:o/HapusTransaksiWarkatDialog_ViewBinding.class */
public abstract class HapusTransaksiWarkatDialog_ViewBinding {
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public int i;

    public HapusTransaksiWarkatDialog_ViewBinding(Context context, AttributeSet attributeSet, int i, int i2) {
        this.d = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(BaseDialogKotlin.read.Y);
        TypedArray c = GuestWarningWebViewDialog_ViewBinding.c(context, attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.z, i, i2, new int[0]);
        this.i = HubunganKeuanganDialog_ViewBinding.d(context, c, BaseDialogKotlin$MediaSessionCompat$Token.L, dimensionPixelSize);
        this.b = Math.min(HubunganKeuanganDialog_ViewBinding.d(context, c, BaseDialogKotlin$MediaSessionCompat$Token.M, 0), this.i / 2);
        this.e = c.getInt(BaseDialogKotlin$MediaSessionCompat$Token.I, 0);
        this.a = c.getInt(BaseDialogKotlin$MediaSessionCompat$Token.F, 0);
        if (!c.hasValue(BaseDialogKotlin$MediaSessionCompat$Token.G)) {
            this.d = new int[]{DaftarTransferORBerhasilDiupdateDialog.d(context, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.l, -1)};
        } else if (c.peekValue(BaseDialogKotlin$MediaSessionCompat$Token.G).type != 1) {
            this.d = new int[]{c.getColor(BaseDialogKotlin$MediaSessionCompat$Token.G, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(c.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.G, -1));
            this.d = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (c.hasValue(BaseDialogKotlin$MediaSessionCompat$Token.N)) {
            this.c = c.getColor(BaseDialogKotlin$MediaSessionCompat$Token.N, -1);
        } else {
            this.c = this.d[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            int i3 = (int) (f * 255.0f);
            int i4 = this.c;
            this.c = isRound.b(i4, (Color.alpha(i4) * i3) / 255);
        }
        c.recycle();
    }
}
