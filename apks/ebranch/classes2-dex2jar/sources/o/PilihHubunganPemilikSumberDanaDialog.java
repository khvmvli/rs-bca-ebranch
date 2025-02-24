package o;

import android.view.accessibility.AccessibilityManager;
import o.PendidikanTerakhirDialog;
import o.PendidikanTerakhirDialog_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/PilihHubunganPemilikSumberDanaDialog.class */
final class PilihHubunganPemilikSumberDanaDialog implements PendidikanTerakhirDialog.RemoteActionCompatParcelizer, PendidikanTerakhirDialog_ViewBinding.read, PendidikanTerakhirDialog_ViewBinding.RemoteActionCompatParcelizer, PendidikanTerakhirDialog.IconCompatParcelizer, PenghasilanPerTahunDialog_ViewBinding {
    private float d;
    private boolean e = false;
    private MessageDialog g;
    private float h;
    private PendidikanTerakhirDialog_ViewBinding i;
    private static final String[] b = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    private static final String[] a = {"00", "2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "22"};
    private static final String[] c = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    public PilihHubunganPemilikSumberDanaDialog(PendidikanTerakhirDialog_ViewBinding pendidikanTerakhirDialog_ViewBinding, MessageDialog messageDialog) {
        this.i = pendidikanTerakhirDialog_ViewBinding;
        this.g = messageDialog;
        if (messageDialog.e == 0) {
            this.i.q.setVisibility(0);
        }
        this.i.j.c.add(this);
        this.i.l = this;
        this.i.m = this;
        this.i.setOnActionUpListener(this);
        a(b, "%d");
        a(a, "%d");
        a(c, "%02d");
        d();
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [o.PendidikanTerakhirDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v20, types: [o.PendidikanTerakhirDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void a(int r7, boolean r8) {
        /*
            r6 = this;
            r0 = r7
            r1 = 12
            if (r0 != r1) goto L_0x000b
            r0 = 1
            r9 = r0
            goto L_0x000d
        L_0x000b:
            r0 = 0
            r9 = r0
        L_0x000d:
            r0 = r6
            o.PendidikanTerakhirDialog_ViewBinding r0 = r0.i
            r1 = r9
            r0.setAnimateOnTouchUp(r1)
            r0 = r6
            o.MessageDialog r0 = r0.g
            r1 = r7
            r0.g = r1
            r0 = r6
            o.PendidikanTerakhirDialog_ViewBinding r0 = r0.i
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L_0x002f
            java.lang.String[] r0 = o.PilihHubunganPemilikSumberDanaDialog.c
            r11 = r0
            goto L_0x0047
        L_0x002f:
            r0 = r6
            o.MessageDialog r0 = r0.g
            int r0 = r0.e
            r1 = 1
            if (r0 != r1) goto L_0x0042
            java.lang.String[] r0 = o.PilihHubunganPemilikSumberDanaDialog.a
            r11 = r0
            goto L_0x0047
        L_0x0042:
            java.lang.String[] r0 = o.PilihHubunganPemilikSumberDanaDialog.b
            r11 = r0
        L_0x0047:
            r0 = r9
            if (r0 == 0) goto L_0x0053
            int r0 = o.BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.k
            r12 = r0
            goto L_0x0058
        L_0x0053:
            int r0 = o.BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.g
            r12 = r0
        L_0x0058:
            r0 = r10
            r1 = r11
            r2 = r12
            r0.setValues(r1, r2)
            r0 = r6
            o.PendidikanTerakhirDialog_ViewBinding r0 = r0.i
            r11 = r0
            r0 = r9
            if (r0 == 0) goto L_0x0074
            r0 = r6
            float r0 = r0.h
            r13 = r0
            goto L_0x007a
        L_0x0074:
            r0 = r6
            float r0 = r0.d
            r13 = r0
        L_0x007a:
            r0 = r11
            r1 = r13
            r2 = r8
            r0.setHandRotation(r1, r2)
            r0 = r6
            o.PendidikanTerakhirDialog_ViewBinding r0 = r0.i
            r1 = r7
            r0.setActiveSelection(r1)
            r0 = r6
            o.PendidikanTerakhirDialog_ViewBinding r0 = r0.i
            r11 = r0
            r0 = r11
            o.showDatePicker r1 = new o.showDatePicker
            r2 = r1
            r3 = r11
            android.content.Context r3 = r3.getContext()
            int r4 = o.BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.h
            r2.<init>(r3, r4)
            r0.setMinuteHourDelegate(r1)
            r0 = r6
            o.PendidikanTerakhirDialog_ViewBinding r0 = r0.i
            r11 = r0
            r0 = r11
            o.showDatePicker r1 = new o.showDatePicker
            r2 = r1
            r3 = r11
            android.content.Context r3 = r3.getContext()
            int r4 = o.BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.l
            r2.<init>(r3, r4)
            r0.setHourClickDelegate(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PilihHubunganPemilikSumberDanaDialog.a(int, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [o.PendidikanTerakhirDialog_ViewBinding, android.view.View] */
    private void a(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = MessageDialog.a(this.i.getResources(), strArr[i], str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.PendidikanTerakhirDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v23, types: [android.widget.TextView, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.widget.TextView, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void e() {
        /*
            r7 = this;
            r0 = r7
            o.PendidikanTerakhirDialog_ViewBinding r0 = r0.i
            r8 = r0
            r0 = r7
            o.MessageDialog r0 = r0.g
            int r0 = r0.i
            r9 = r0
            r0 = r7
            o.MessageDialog r0 = r0.g
            int r0 = r0.d()
            r10 = r0
            r0 = r7
            o.MessageDialog r0 = r0.g
            int r0 = r0.d
            r11 = r0
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L_0x002a
            int r0 = o.BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.n
            r9 = r0
            goto L_0x002e
        L_0x002a:
            int r0 = o.BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.m
            r9 = r0
        L_0x002e:
            r0 = r8
            o.chooseSudahDatangKeCabang r0 = r0.q
            r1 = r9
            r0.d(r1)
            r0 = r8
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            r12 = r0
            r0 = r12
            java.lang.String r1 = "%02d"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r11
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            r13 = r0
            r0 = r12
            java.lang.String r1 = "%02d"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            r12 = r0
            r0 = r8
            o.chooseBelumYakinBertransaksi r0 = r0.f52o
            r1 = r13
            r0.setText(r1)
            r0 = r8
            o.chooseBelumYakinBertransaksi r0 = r0.k
            r1 = r12
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PilihHubunganPemilikSumberDanaDialog.e():void");
    }

    @Override // o.PendidikanTerakhirDialog_ViewBinding.read
    public final void a(int i) {
        a(i, true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.PendidikanTerakhirDialog_ViewBinding, android.view.View] */
    @Override // o.PenghasilanPerTahunDialog_ViewBinding
    public final void b() {
        this.i.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.PendidikanTerakhirDialog_ViewBinding, android.view.View] */
    @Override // o.PenghasilanPerTahunDialog_ViewBinding
    public final void c() {
        this.i.setVisibility(0);
    }

    @Override // o.PenghasilanPerTahunDialog_ViewBinding
    public final void d() {
        this.d = (float) (this.g.d() * (this.g.e == 1 ? 15 : 30));
        this.h = (float) (this.g.d * 6);
        a(this.g.g, false);
        e();
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [o.PendidikanTerakhirDialog_ViewBinding, android.view.View] */
    @Override // o.PendidikanTerakhirDialog.RemoteActionCompatParcelizer
    public final void d(float f, boolean z) {
        if (!this.e) {
            int i = this.g.c;
            int i2 = this.g.d;
            int round = Math.round(f);
            if (this.g.g == 12) {
                this.g.d = ((round + 3) / 6) % 60;
                this.h = (float) Math.floor((double) (this.g.d * 6));
            } else {
                int i3 = 15;
                int i4 = (this.g.e == 1 ? 15 : 30) / 2;
                MessageDialog messageDialog = this.g;
                messageDialog.b((round + i4) / (messageDialog.e == 1 ? 15 : 30));
                int d = this.g.d();
                if (this.g.e != 1) {
                    i3 = 30;
                }
                this.d = (float) (d * i3);
            }
            if (!z) {
                e();
                if (this.g.d != i2 || this.g.c != i) {
                    this.i.performHapticFeedback(4);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [o.PendidikanTerakhirDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v35, types: [o.PendidikanTerakhirDialog_ViewBinding, android.view.View] */
    @Override // o.PendidikanTerakhirDialog.IconCompatParcelizer
    public final void e(float f, boolean z) {
        this.e = true;
        int i = this.g.d;
        int i2 = this.g.c;
        if (this.g.g == 10) {
            this.i.setHandRotation(this.d, false);
            if (!((AccessibilityManager) copyWindowDataInto.d(this.i.getContext(), AccessibilityManager.class)).isTouchExplorationEnabled()) {
                a(12, true);
            }
        } else {
            int round = Math.round(f);
            if (!z) {
                this.g.d = (((round + 15) / 30) * 5) % 60;
                this.h = (float) (this.g.d * 6);
            }
            this.i.setHandRotation(this.h, z);
        }
        this.e = false;
        e();
        if (this.g.d != i || this.g.c != i2) {
            this.i.performHapticFeedback(4);
        }
    }

    @Override // o.PendidikanTerakhirDialog_ViewBinding.RemoteActionCompatParcelizer
    public final void e(int i) {
        this.g.e(i);
    }
}
