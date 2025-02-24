package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/chooseLainnya.class */
public final class chooseLainnya {
    static final boolean b = true;
    boolean a;
    ColorStateList c;
    PorterDuff.Mode e;
    int f;
    int g;
    int h;
    int j;
    Drawable k;
    final CancelReservasiDialog_ViewBinding l;
    int m;
    int n;

    /* renamed from: o  reason: collision with root package name */
    ColorStateList f59o;
    private LayerDrawable p;
    ColorStateList q;
    JenisPekerjaanDialog s;
    int t;
    boolean r = false;
    boolean d = false;
    boolean i = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public chooseLainnya(CancelReservasiDialog_ViewBinding cancelReservasiDialog_ViewBinding, JenisPekerjaanDialog jenisPekerjaanDialog) {
        this.l = cancelReservasiDialog_ViewBinding;
        this.s = jenisPekerjaanDialog;
    }

    private KategoriTujuanTransaksiORDialog b() {
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.p.getNumberOfLayers() > 2 ? (KategoriTujuanTransaksiORDialog) this.p.getDrawable(2) : (KategoriTujuanTransaksiORDialog) this.p.getDrawable(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public JenisKodeBankDialog b(boolean z) {
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return b ? (JenisKodeBankDialog) ((LayerDrawable) ((InsetDrawable) this.p.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0) : (JenisKodeBankDialog) this.p.getDrawable(!z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v10, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v21, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v4, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v7, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    public void b(int i, int i2) {
        int t = findFragmentByWho.t((View) this.l);
        int paddingTop = this.l.getPaddingTop();
        int s = findFragmentByWho.s((View) this.l);
        int paddingBottom = this.l.getPaddingBottom();
        int i3 = this.m;
        int i4 = this.g;
        this.g = i2;
        this.m = i;
        if (!this.d) {
            this.l.b(c());
            JenisKodeBankDialog b2 = b(false);
            if (b2 != null) {
                b2.l((float) this.f);
            }
        }
        findFragmentByWho.c((View) this.l, t, (paddingTop + i) - i3, s, (paddingBottom + i2) - i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v30, types: [o.CancelReservasiDialog_ViewBinding, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public android.graphics.drawable.Drawable c() {
        /*
        // Method dump skipped, instructions count: 319
        */
        throw new UnsupportedOperationException("Method not decompiled: o.chooseLainnya.c():android.graphics.drawable.Drawable");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v15, types: [o.CancelReservasiDialog_ViewBinding, android.view.View, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void e() {
        /*
            r4 = this;
            r0 = 0
            r5 = r0
            r0 = r4
            r1 = 0
            o.JenisKodeBankDialog r0 = r0.b(r1)
            r6 = r0
            r0 = r4
            r1 = 1
            o.JenisKodeBankDialog r0 = r0.b(r1)
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0051
            r0 = r6
            r1 = r4
            int r1 = r1.t
            float r1 = (float) r1
            r2 = r4
            android.content.res.ColorStateList r2 = r2.q
            r0.c(r1, r2)
            r0 = r7
            if (r0 == 0) goto L_0x0051
            r0 = r4
            int r0 = r0.t
            float r0 = (float) r0
            r8 = r0
            r0 = r4
            boolean r0 = r0.r
            if (r0 == 0) goto L_0x004a
            r0 = r4
            o.CancelReservasiDialog_ViewBinding r0 = r0.l
            r6 = r0
            int r0 = o.BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.t
            r5 = r0
            r0 = r6
            android.content.Context r0 = r0.getContext()
            r1 = r5
            r2 = r6
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            int r0 = o.HubunganDialog_ViewBinding.c(r0, r1, r2)
            r5 = r0
        L_0x004a:
            r0 = r7
            r1 = r8
            r2 = r5
            r0.a(r1, r2)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.chooseLainnya.e():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(JenisPekerjaanDialog jenisPekerjaanDialog) {
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(jenisPekerjaanDialog);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(jenisPekerjaanDialog);
        }
        if (b() != null) {
            b().setShapeAppearanceModel(jenisPekerjaanDialog);
        }
    }
}
