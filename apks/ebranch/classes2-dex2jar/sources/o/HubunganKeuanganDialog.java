package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import o.BaseDialogKotlin;
/* loaded from: classes2-dex2jar.jar:o/HubunganKeuanganDialog.class */
public final class HubunganKeuanganDialog extends setCompoundDrawables {
    private static final int a = BaseDialogKotlin.MediaDescriptionCompat.x;
    private static final int[][] e = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList c;
    private boolean d;

    public HubunganKeuanganDialog(Context context) {
        this(context, null);
    }

    public HubunganKeuanganDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public HubunganKeuanganDialog(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r0 = o.HubunganKeuanganDialog.a
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            android.content.Context r1 = o.MataUangDialog_ViewBinding.a(r1, r2, r3, r4)
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3)
            r0 = r7
            android.content.Context r0 = r0.getContext()
            r8 = r0
            int[] r0 = o.BaseDialogKotlin$MediaSessionCompat$Token.ee
            r12 = r0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            o.GuestWarningWebViewDialog_ViewBinding.a(r0, r1, r2, r3)
            r0 = r8
            r1 = r9
            r2 = r12
            r3 = r10
            r4 = r11
            r5 = 0
            int[] r5 = new int[r5]
            o.GuestWarningWebViewDialog_ViewBinding.a(r0, r1, r2, r3, r4, r5)
            r0 = r8
            r1 = r9
            r2 = r12
            r3 = r10
            r4 = r11
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r9 = r0
            r0 = r9
            int r1 = o.BaseDialogKotlin$MediaSessionCompat$Token.ea
            boolean r0 = r0.hasValue(r1)
            if (r0 == 0) goto L_0x0053
            r0 = r7
            r1 = r8
            r2 = r9
            int r3 = o.BaseDialogKotlin$MediaSessionCompat$Token.ea
            android.content.res.ColorStateList r1 = o.HubunganKeuanganDialog_ViewBinding.c(r1, r2, r3)
            o.getHost.c(r0, r1)
        L_0x0053:
            r0 = r7
            r1 = r9
            int r2 = o.BaseDialogKotlin$MediaSessionCompat$Token.eh
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            r0.d = r1
            r0 = r9
            r0.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.HubunganKeuanganDialog.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onAttachedToWindow() {
        onAttachedToWindow();
        if (this.d && getHost.d(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setUseMaterialThemeColors(boolean z) {
        this.d = z;
        if (z) {
            if (this.c == null) {
                int c = HubunganDialog_ViewBinding.c(getContext(), BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.n, getClass().getCanonicalName());
                int c2 = HubunganDialog_ViewBinding.c(getContext(), BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.k, getClass().getCanonicalName());
                int c3 = HubunganDialog_ViewBinding.c(getContext(), BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.t, getClass().getCanonicalName());
                int[][] iArr = e;
                int[] iArr2 = new int[iArr.length];
                iArr2[0] = isRound.a(isRound.b(c, Math.round(((float) Color.alpha(c)) * 1.0f)), c3);
                iArr2[1] = isRound.a(isRound.b(c2, Math.round(((float) Color.alpha(c2)) * 0.54f)), c3);
                iArr2[2] = isRound.a(isRound.b(c2, Math.round(((float) Color.alpha(c2)) * 0.38f)), c3);
                iArr2[3] = isRound.a(isRound.b(c2, Math.round(((float) Color.alpha(c2)) * 0.38f)), c3);
                this.c = new ColorStateList(iArr, iArr2);
            }
            getHost.c(this, this.c);
            return;
        }
        getHost.c(this, (ColorStateList) null);
    }
}
