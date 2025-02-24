package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.BaseDialogKotlin;
/* loaded from: classes2-dex2jar.jar:o/HapusWarkatBerhasilDialog_ViewBinding.class */
public final class HapusWarkatBerhasilDialog_ViewBinding extends HapusTransaksiWarkatDialog_ViewBinding {
    public int f;
    public int h;
    public int j;

    public HapusWarkatBerhasilDialog_ViewBinding(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.m);
    }

    public HapusWarkatBerhasilDialog_ViewBinding(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, HapusTransaksiWarkatDialog.h);
    }

    private HapusWarkatBerhasilDialog_ViewBinding(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(BaseDialogKotlin.read.Z);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(BaseDialogKotlin.read.ac);
        int[] iArr = BaseDialogKotlin$MediaSessionCompat$Token.bq;
        GuestWarningWebViewDialog_ViewBinding.a(context, attributeSet, i, i2);
        GuestWarningWebViewDialog_ViewBinding.a(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.f = Math.max(HubunganKeuanganDialog_ViewBinding.d(context, obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.bx, dimensionPixelSize), this.i << 1);
        this.j = HubunganKeuanganDialog_ViewBinding.d(context, obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.bt, dimensionPixelSize2);
        this.h = obtainStyledAttributes.getInt(BaseDialogKotlin$MediaSessionCompat$Token.bu, 0);
        obtainStyledAttributes.recycle();
    }
}
