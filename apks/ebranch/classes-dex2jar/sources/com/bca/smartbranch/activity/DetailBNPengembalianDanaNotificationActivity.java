package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindArray;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.RateTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.documentProvider;
import o.loginAsGuest;
import o.onAcceptKetentuanOR;
import o.pilihTipeTujuanTransaksiPenerima;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setMessage;
import o.setOnHierarchyChangeListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBNPengembalianDanaNotificationActivity.class */
public class DetailBNPengembalianDanaNotificationActivity extends BaseActivityPostLogin implements RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private ViewAnimator B;
    @BindView(2131296440)
    Button btnProses;
    @BindView(2131297031)
    EditText etKomentar;
    @BindView(2131297371)
    ImageView ivHeader;
    @BindView(2131297621)
    LinearLayout llDetail;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297841)
    LinearLayout llPecahanUang;
    @BindView(2131297867)
    LinearLayout llRating;
    @BindArray(2130903078)
    String[] mataUangBankNotes;
    private String n;
    private String p;
    private String q;
    private String r;
    @BindView(2131298126)
    onAcceptKetentuanOR ratingBar;
    @BindString(2131822092)
    String retry;
    private String s;
    @BindView(2131298578)
    LogoutDialog_ViewBinding tilKomentar;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822201)
    String toolbarTitle;
    @BindView(2131298872)
    TextView tvCabang;
    @BindView(2131299054)
    TextView tvErrorKomentar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299168)
    TextView tvErrorRating;
    @BindView(2131299327)
    TextView tvJumlahPembelian;
    @BindView(2131299385)
    TextView tvKurs;
    @BindView(2131299386)
    TextView tvKursSebelumnya;
    @BindView(2131299400)
    TextView tvMataUang;
    @BindView(2131299402)
    TextView tvMataUangSebelumnya;
    @BindView(2131299416)
    TextView tvNama;
    @BindView(2131299467)
    TextView tvNoRef;
    @BindView(2131299510)
    TextView tvPecahanUang;
    @BindView(2131299536)
    TextView tvPenilaian;
    @BindView(2131299594)
    TextView tvTanggal;
    @BindView(2131299659)
    TextView tvTitlePecahanUang;
    @BindView(2131299677)
    TextView tvTotal;
    @BindView(2131299685)
    TextView tvTotalSebelumnya;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private RateTransactionPresenter u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;
    private setMessage f = new setMessage();
    private String t = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.x;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.y;
        this.u.d(loginasguest);
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x029b, code lost:
        if (r0.equals("Total Pengembalian") != false) goto L_0x02c4;
     */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void d(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 1601
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBNPengembalianDanaNotificationActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void i(String str) {
        x();
        documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        bundle.putBoolean("isMessageSuccess", true);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        this.ratingBar.setClickable(false);
        this.ratingBar.setScrollable(false);
        this.etKomentar.setFocusable(false);
        this.etKomentar.setFocusableInTouchMode(false);
        this.etKomentar.setLongClickable(false);
        this.etKomentar.setEnabled(false);
        this.btnProses.setVisibility(8);
        this.tvPenilaian.setText("Penilaian kamu");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNPengembalianDanaNotificationActivity.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailBNPengembalianDanaNotificationActivity.this.s();
            }
        }).g();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        RateTransactionPresenter rateTransactionPresenter = this.u;
        Call<OpenAccountSuccessActivity<Object>> call = rateTransactionPresenter.a;
        if (call != null) {
            call.cancel();
        }
        rateTransactionPresenter.e = null;
        onDestroy();
    }

    @OnFocusChange({2131297031})
    public void onFocus(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131297031) {
                this.tilKomentar.setHintEnabled(true);
            }
        } else if (view.getId() == 2131297031 && this.etKomentar.getText().toString().isEmpty()) {
            this.tilKomentar.setHintEnabled(false);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            setOnHierarchyChangeListener.d((Activity) this);
            return true;
        }
    }

    @OnClick({2131297650, 2131299268, 2131297371})
    public void onToggleTransaksi(View view) {
        this.f.b(this.llDetail, this.ivHeader);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "DetailBNPengembalianDanaNotificationActivity";
        this.j = "DetailBNPengembalianDanaNotificationActivity";
    }

    @OnClick({2131296440})
    public void proses(View view) {
        this.tvErrorRating.setVisibility(8);
        this.tvErrorKomentar.setVisibility(8);
        this.tilKomentar.setBackgroundResource(2131230847);
        if (((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a <= 0.0f || this.etKomentar.getText().toString().isEmpty()) {
            if (((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a <= 0.0f) {
                this.tvErrorRating.setVisibility(0);
                this.tvErrorRating.setText(2131820982);
            }
            if (this.etKomentar.getText().toString().isEmpty()) {
                this.tvErrorKomentar.setVisibility(0);
                this.tvErrorKomentar.setText(2131820765);
                this.tilKomentar.setBackgroundResource(2131230870);
                this.etKomentar.requestFocus();
                return;
            }
            return;
        }
        s();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492930;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        z();
    }
}
