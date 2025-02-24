package com.bca.smartbranch.fragment;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.Page6DBCADollarSFragment_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN5VerifikasiOTPFragment_ViewBinding.class */
public class BN5VerifikasiOTPFragment_ViewBinding implements Unbinder {
    private View a;
    private BN5VerifikasiOTPFragment b;
    private View c;

    public BN5VerifikasiOTPFragment_ViewBinding(final BN5VerifikasiOTPFragment bN5VerifikasiOTPFragment, View view) {
        this.b = bN5VerifikasiOTPFragment;
        bN5VerifikasiOTPFragment.etOtp = (Page6DBCADollarSFragment_ViewBinding) Utils.findRequiredViewAsType(view, 2131297139, "field 'etOtp'", Page6DBCADollarSFragment_ViewBinding.class);
        bN5VerifikasiOTPFragment.tvTitlePage = (TextView) Utils.findRequiredViewAsType(view, 2131299465, "field 'tvTitlePage'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "field 'btnLanjut' and method 'lanjut'");
        bN5VerifikasiOTPFragment.btnLanjut = (Button) Utils.castView(findRequiredView, 2131296396, "field 'btnLanjut'", Button.class);
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.BN5VerifikasiOTPFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN5VerifikasiOTPFragment.lanjut();
            }
        });
        bN5VerifikasiOTPFragment.tvErrorKodeOtp = (TextView) Utils.findRequiredViewAsType(view, 2131299044, "field 'tvErrorKodeOtp'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131299549, "field 'tvRequest' and method 'requestOTP'");
        bN5VerifikasiOTPFragment.tvRequest = (TextView) Utils.castView(findRequiredView2, 2131299549, "field 'tvRequest'", TextView.class);
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.BN5VerifikasiOTPFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN5VerifikasiOTPFragment.requestOTP();
            }
        });
        Resources resources = view.getContext().getResources();
        bN5VerifikasiOTPFragment.listNoHandphone = resources.getStringArray(2130903081);
        bN5VerifikasiOTPFragment.titlePage = resources.getString(2131822063);
        bN5VerifikasiOTPFragment.retry = resources.getString(2131822092);
        bN5VerifikasiOTPFragment.messageOTP = resources.getString(2131821911);
        bN5VerifikasiOTPFragment.errorEmptyOTP = resources.getString(2131820830);
        bN5VerifikasiOTPFragment.errorNotValidOTP = resources.getString(2131820831);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BN5VerifikasiOTPFragment bN5VerifikasiOTPFragment = this.b;
        if (bN5VerifikasiOTPFragment != null) {
            this.b = null;
            bN5VerifikasiOTPFragment.etOtp = null;
            bN5VerifikasiOTPFragment.tvTitlePage = null;
            bN5VerifikasiOTPFragment.btnLanjut = null;
            bN5VerifikasiOTPFragment.tvErrorKodeOtp = null;
            bN5VerifikasiOTPFragment.tvRequest = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
