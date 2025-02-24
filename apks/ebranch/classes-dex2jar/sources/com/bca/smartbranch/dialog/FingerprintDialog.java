package com.bca.smartbranch.dialog;

import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.ChooseMastercardAdapter$ViewHolder;
import o.PilihSetoranActivity;
import o.documentProvider;
import o.getCardID;
import o.sumberDanaEvent;
import o.tambahPemegangKartu;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/FingerprintDialog.class */
public class FingerprintDialog extends BaseDialog implements getCardID.IconCompatParcelizer {
    public FingerprintManager.CryptoObject a;
    private getCardID b;
    private Unbinder c;
    private FingerprintManager d;
    private boolean e = false;
    @BindString(2131820795)
    String fingerprintNotRecognized;
    @BindView(2131297360)
    ImageView ivFailed;
    @BindView(2131298883)
    TextView tvContent;
    @BindView(2131299615)
    TextView tvTitle;

    @Override // o.getCardID.IconCompatParcelizer
    public final void a() {
        this.tvTitle.setText(getString(2131821654));
        this.tvContent.setText(getString(2131821655));
        this.ivFailed.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.c = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
    }

    @Override // o.getCardID.IconCompatParcelizer
    public final void c() {
        dismiss();
        documentProvider.b().d(new sumberDanaEvent(this.a, this.e));
    }

    @OnClick({2131296385})
    public void clickedBatal(View view) {
        documentProvider.b().d(new PilihSetoranActivity(false));
        getDialog().dismiss();
        if (!this.e) {
            documentProvider.b().d(new ChooseMastercardAdapter$ViewHolder(false));
        }
    }

    @Override // o.getCardID.IconCompatParcelizer
    public final void e() {
        documentProvider.b().d(new PilihSetoranActivity(false));
        dismiss();
        if (!this.e) {
            documentProvider.b().d(new ChooseMastercardAdapter$ViewHolder(false));
        }
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493067;
    }

    @Override // o.getText, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            this.d = (FingerprintManager) getActivity().getSystemService(FingerprintManager.class);
            this.b = new getCardID(getContext(), this, this.d);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        getCardID getcardid;
        CancellationSignal cancellationSignal;
        onPause();
        if (Build.VERSION.SDK_INT >= 23 && (cancellationSignal = (getcardid = this.b).c) != null) {
            cancellationSignal.cancel();
            getcardid.c = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        onResume();
        if (Build.VERSION.SDK_INT >= 23) {
            getCardID getcardid = this.b;
            FingerprintManager.CryptoObject cryptoObject = this.a;
            if (new tambahPemegangKartu(getcardid.d).b() && new tambahPemegangKartu(getcardid.d).c()) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                getcardid.c = cancellationSignal;
                getcardid.e.authenticate(cryptoObject, cancellationSignal, 0, getcardid, null);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        getDialog().setCanceledOnTouchOutside(false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            boolean z = arguments.getBoolean("fromLogin", false);
            this.e = z;
            if (z) {
                this.tvContent.setText(getString(2131821657));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.c.unbind();
    }
}
