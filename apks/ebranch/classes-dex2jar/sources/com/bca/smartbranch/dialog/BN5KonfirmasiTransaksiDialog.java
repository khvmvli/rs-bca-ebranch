package com.bca.smartbranch.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.activity.FormBankNotesActivity;
import com.bca.smartbranch.activity.MainActivity;
import java.util.Locale;
import o.CategoryListAdapter$CategoryListVH_ViewBinding;
import o.ConfirmSubMastercardAdapter$ViewHolder;
import o.documentProvider;
import o.getPromotion;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/BN5KonfirmasiTransaksiDialog.class */
public class BN5KonfirmasiTransaksiDialog extends BaseDialog {
    private ConfirmSubMastercardAdapter$ViewHolder a;
    @BindView(2131296461)
    Button btnYa;
    private CountDownTimer c;
    private Unbinder d;
    @BindView(2131298886)
    TextView tvCountDownTimer;
    @BindView(2131299317)
    TextView tvJumlahAkhir;
    @BindView(2131299318)
    TextView tvJumlahAwal;
    @BindView(2131299632)
    TextView tvTitleInfo;
    @BindView(2131299684)
    TextView tvTotalPembayaran;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.d = ButterKnife.bind(this, view);
    }

    @OnClick({2131296455})
    public void clickedNo(View view) {
        getDialog().dismiss();
        startActivity(new Intent(getContext(), MainActivity.class));
    }

    @OnClick({2131296461})
    public void clickedYes(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new CategoryListAdapter$CategoryListVH_ViewBinding());
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493055;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        ConfirmSubMastercardAdapter$ViewHolder confirmSubMastercardAdapter$ViewHolder = ((FormBankNotesActivity) getActivity()).n;
        this.a = confirmSubMastercardAdapter$ViewHolder;
        this.tvTitleInfo.setText(Html.fromHtml(getString(2131821820, confirmSubMastercardAdapter$ViewHolder.a, this.a.j.b)));
        TextView textView = this.tvJumlahAwal;
        StringBuilder sb = new StringBuilder();
        sb.append(getPromotion.a(String.valueOf(this.a.f)));
        sb.append(" IDR");
        textView.setText(sb.toString());
        TextView textView2 = this.tvJumlahAkhir;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getPromotion.a(String.valueOf(this.a.l)));
        sb2.append(" IDR");
        textView2.setText(sb2.toString());
        TextView textView3 = this.tvTotalPembayaran;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getPromotion.a(this.a.f82o.toString()));
        sb3.append(" IDR");
        textView3.setText(sb3.toString());
        this.c = new CountDownTimer(10000, 1000) { // from class: com.bca.smartbranch.dialog.BN5KonfirmasiTransaksiDialog.3
            @Override // android.os.CountDownTimer
            public final void onFinish() {
                BN5KonfirmasiTransaksiDialog.this.tvCountDownTimer.setText("00 : 00");
                BN5KonfirmasiTransaksiDialog.this.btnYa.setEnabled(false);
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
                BN5KonfirmasiTransaksiDialog.this.tvCountDownTimer.setText(String.format(Locale.getDefault(), "00 : %02d", Long.valueOf((j / 1000) + 1)));
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.d.unbind();
        this.c.cancel();
    }
}
