package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/QRCodeDialog_ViewBinding.class */
public class QRCodeDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private QRCodeDialog d;

    public QRCodeDialog_ViewBinding(final QRCodeDialog qRCodeDialog, View view) {
        this.d = qRCodeDialog;
        qRCodeDialog.ivQrCode = (ImageView) Utils.findRequiredViewAsType(view, 2131297409, "field 'ivQrCode'", ImageView.class);
        qRCodeDialog.tvNoRef = (TextView) Utils.findRequiredViewAsType(view, 2131299466, "field 'tvNoRef'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296450, "method 'saveImage'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.QRCodeDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                qRCodeDialog.saveImage();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296379, "method 'share'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.QRCodeDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                qRCodeDialog.share();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.QRCodeDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                qRCodeDialog.close();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        QRCodeDialog qRCodeDialog = this.d;
        if (qRCodeDialog != null) {
            this.d = null;
            qRCodeDialog.ivQrCode = null;
            qRCodeDialog.tvNoRef = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
