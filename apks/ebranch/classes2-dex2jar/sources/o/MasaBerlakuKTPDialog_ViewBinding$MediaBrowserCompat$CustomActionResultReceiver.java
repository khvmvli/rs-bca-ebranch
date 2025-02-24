package o;

import android.text.Editable;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/MasaBerlakuKTPDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class MasaBerlakuKTPDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver extends GuestWarningWebViewDialog {
    final /* synthetic */ MasaBerlakuKTPDialog_ViewBinding c;

    private MasaBerlakuKTPDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(MasaBerlakuKTPDialog_ViewBinding masaBerlakuKTPDialog_ViewBinding) {
        this.c = masaBerlakuKTPDialog_ViewBinding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ MasaBerlakuKTPDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(MasaBerlakuKTPDialog_ViewBinding masaBerlakuKTPDialog_ViewBinding, byte b) {
        this(masaBerlakuKTPDialog_ViewBinding);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.TextView, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.widget.TextView, o.chooseBelumYakinBertransaksi] */
    @Override // o.GuestWarningWebViewDialog, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (TextUtils.isEmpty(editable)) {
            this.c.b.setText(MessageDialog.a(this.c.getResources(), "00", "%02d"));
        } else {
            this.c.b.setText(MessageDialog.a(this.c.getResources(), editable, "%02d"));
        }
    }
}
