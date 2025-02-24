package o;

import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/DaftarTransferBerhasilDihapusDialog$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class DaftarTransferBerhasilDihapusDialog$MediaBrowserCompat$CustomActionResultReceiver implements ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ DaftarTransferBerhasilDihapusDialog b;
    ViewGroup.OnHierarchyChangeListener c;

    private DaftarTransferBerhasilDihapusDialog$MediaBrowserCompat$CustomActionResultReceiver(DaftarTransferBerhasilDihapusDialog daftarTransferBerhasilDihapusDialog) {
        this.b = daftarTransferBerhasilDihapusDialog;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ DaftarTransferBerhasilDihapusDialog$MediaBrowserCompat$CustomActionResultReceiver(DaftarTransferBerhasilDihapusDialog daftarTransferBerhasilDihapusDialog, byte b) {
        this(daftarTransferBerhasilDihapusDialog);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [android.widget.CompoundButton, android.view.View, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Type inference failed for: r0v30, types: [android.widget.CompoundButton, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Type inference failed for: r0v40, types: [android.widget.CompoundButton, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void onChildViewAdded(android.view.View r5, android.view.View r6) {
        /*
            r4 = this;
            r0 = r5
            r1 = r4
            o.DaftarTransferBerhasilDihapusDialog r1 = r1.b
            if (r0 != r1) goto L_0x00b6
            r0 = r6
            boolean r0 = r0 instanceof o.chooseBelumYakinBertransaksi
            if (r0 == 0) goto L_0x00b6
            r0 = r6
            int r0 = r0.getId()
            r1 = -1
            if (r0 != r1) goto L_0x001e
            r0 = r6
            int r1 = o.findFragmentByWho.e()
            r0.setId(r1)
        L_0x001e:
            r0 = r6
            o.chooseBelumYakinBertransaksi r0 = (o.chooseBelumYakinBertransaksi) r0
            r7 = r0
            r0 = r7
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x00ab
            r0 = r5
            o.DaftarTransferBerhasilDihapusDialog r0 = (o.DaftarTransferBerhasilDihapusDialog) r0
            r8 = r0
            r0 = r7
            int r0 = r0.getId()
            r9 = r0
            r0 = r8
            int r0 = r0.e
            r10 = r0
            r0 = r9
            r1 = r10
            if (r0 == r1) goto L_0x00ab
            r0 = r10
            r1 = -1
            if (r0 == r1) goto L_0x0078
            r0 = r8
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x0078
            r0 = r8
            r1 = r10
            android.view.View r0 = r0.findViewById(r1)
            r11 = r0
            r0 = r11
            boolean r0 = r0 instanceof o.chooseBelumYakinBertransaksi
            if (r0 == 0) goto L_0x0078
            r0 = r8
            r1 = 1
            r0.c = r1
            r0 = r11
            o.chooseBelumYakinBertransaksi r0 = (o.chooseBelumYakinBertransaksi) r0
            r1 = 0
            r0.setChecked(r1)
            r0 = r8
            r1 = 0
            r0.c = r1
        L_0x0078:
            r0 = r9
            r1 = -1
            if (r0 == r1) goto L_0x00a4
            r0 = r8
            r1 = r9
            android.view.View r0 = r0.findViewById(r1)
            r11 = r0
            r0 = r11
            boolean r0 = r0 instanceof o.chooseBelumYakinBertransaksi
            if (r0 == 0) goto L_0x00a4
            r0 = r8
            r1 = 1
            r0.c = r1
            r0 = r11
            o.chooseBelumYakinBertransaksi r0 = (o.chooseBelumYakinBertransaksi) r0
            r1 = 1
            r0.setChecked(r1)
            r0 = r8
            r1 = 0
            r0.c = r1
        L_0x00a4:
            r0 = r8
            r1 = r9
            r0.e = r1
        L_0x00ab:
            r0 = r7
            r1 = r4
            o.DaftarTransferBerhasilDihapusDialog r1 = r1.b
            o.DaftarTransferBerhasilDihapusDialog$read r1 = r1.b
            r0.a = r1
        L_0x00b6:
            r0 = r4
            android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.c
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L_0x00ca
            r0 = r8
            r1 = r5
            r2 = r6
            r0.onChildViewAdded(r1, r2)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DaftarTransferBerhasilDihapusDialog$MediaBrowserCompat$CustomActionResultReceiver.onChildViewAdded(android.view.View, android.view.View):void");
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view == this.b && (view2 instanceof chooseBelumYakinBertransaksi)) {
            ((chooseBelumYakinBertransaksi) view2).a = null;
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.c;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
