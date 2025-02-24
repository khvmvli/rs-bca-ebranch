package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.DetailTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import java.util.List;
import o.InfoDocumentUnderlyingActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.getPromotion;
import o.loginAsGuest;
import o.onAcceptKetentuanOR;
import o.pilihTipeTujuanTransaksiPenerima;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setMaxHeight;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailStatusPengajuanCCActivity.class */
public class DetailStatusPengajuanCCActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read, RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    @BindView(2131296440)
    Button btnProses;
    @BindView(2131296794)
    setMaxHeight clDiretur;
    @BindView(2131296795)
    setMaxHeight clDiterima;
    @BindView(2131296796)
    setMaxHeight clDitolak;
    @BindView(2131296798)
    setMaxHeight clInprogress;
    @BindView(2131297031)
    LogoutDialog etKomentar;
    private setMessage f = new setMessage();
    @BindString(2131821713)
    String hubungiHaloBCA;
    @BindView(2131297409)
    ImageView ivQrCode;
    @BindView(2131297689)
    LinearLayout llInfo;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297867)
    LinearLayout llRating;
    private DetailTransactionPresenter n;
    private String p;
    private String q;
    private RateTransactionPresenter r;
    @BindView(2131298126)
    onAcceptKetentuanOR ratingBar;
    @BindString(2131822092)
    String retry;
    private String s;
    private String t;
    @BindView(2131298578)
    LogoutDialog_ViewBinding tilKomentar;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298937)
    TextView tvDireturDate;
    @BindView(2131298938)
    TextView tvDireturStatus;
    @BindView(2131298940)
    TextView tvDiterimaDate;
    @BindView(2131298941)
    TextView tvDiterimaNamaPenerima;
    @BindView(2131298942)
    TextView tvDiterimaStatus;
    @BindView(2131298943)
    TextView tvDitolakDate;
    @BindView(2131298944)
    TextView tvDitolakDesc;
    @BindView(2131298945)
    TextView tvDitolakStatus;
    @BindView(2131299054)
    TextView tvErrorKomentar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299168)
    TextView tvErrorRating;
    @BindView(2131299266)
    TextView tvHaloBCA1;
    @BindView(2131299294)
    TextView tvInprogressDate;
    @BindView(2131299295)
    TextView tvInprogressStatus;
    @BindView(2131299467)
    TextView tvNoReferensi;
    @BindView(2131299502)
    TextView tvNote;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private String u;
    private ViewAnimator v;

    private void u() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        infoDocumentUnderlyingActivity.e = this.s;
        infoDocumentUnderlyingActivity.d = "SUKSES";
        infoDocumentUnderlyingActivity.b = this.q;
        infoDocumentUnderlyingActivity.a = this.u;
        this.n.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.s;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.p;
        this.r.d(loginasguest);
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        this.tvErrorMessage.setText(str);
        this.v.setDisplayedChild(1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(List<DetailTransactionResponse.TxnDataDetail> list) {
        char c;
        char c2;
        for (DetailTransactionResponse.TxnDataDetail txnDataDetail : list) {
            String key = txnDataDetail.getKey();
            key.hashCode();
            switch (key.hashCode()) {
                case -2053478804:
                    if (key.equals("StatusType")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1854235203:
                    if (key.equals("Rating")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1679915457:
                    if (key.equals("Comment")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 80988633:
                    if (key.equals("Token")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 122683404:
                    if (key.equals("Tanggal")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 715827184:
                    if (key.equals("Nama Penerima")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1260938190:
                    if (key.equals("Nomor Referensi")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1963638442:
                    if (key.equals("Alasan")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    String value = txnDataDetail.getValue();
                    value.hashCode();
                    switch (value.hashCode()) {
                        case 51:
                            c2 = 65535;
                            if (value.equals("3")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
                            c2 = 65535;
                            if (value.equals("4")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 53:
                            c2 = 65535;
                            if (value.equals("5")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 54:
                            if (!value.equals("6")) {
                                c2 = 65535;
                                break;
                            } else {
                                c2 = 3;
                                break;
                            }
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            if (c2 != 2) {
                                if (c2 != 3) {
                                    break;
                                } else {
                                    this.clDiretur.setVisibility(0);
                                    this.clDiterima.setVisibility(8);
                                    this.clDitolak.setVisibility(8);
                                    this.clInprogress.setVisibility(8);
                                    this.llInfo.setVisibility(0);
                                    this.llRating.setVisibility(8);
                                    break;
                                }
                            } else {
                                this.clDitolak.setVisibility(0);
                                this.clDiterima.setVisibility(8);
                                this.clInprogress.setVisibility(8);
                                this.clDiretur.setVisibility(8);
                                this.llInfo.setVisibility(0);
                                this.llRating.setVisibility(8);
                                break;
                            }
                        } else {
                            this.clDiterima.setVisibility(0);
                            this.clInprogress.setVisibility(8);
                            this.clDitolak.setVisibility(8);
                            this.clDiretur.setVisibility(8);
                            this.llInfo.setVisibility(0);
                            this.llRating.setVisibility(0);
                            break;
                        }
                    } else {
                        this.clInprogress.setVisibility(0);
                        this.clDiterima.setVisibility(8);
                        this.clDitolak.setVisibility(8);
                        this.clDiretur.setVisibility(8);
                        this.llInfo.setVisibility(8);
                        this.llRating.setVisibility(8);
                        break;
                    }
                case 1:
                    this.ratingBar.setRating(Float.parseFloat(txnDataDetail.getValue()));
                    this.ratingBar.setClickable(false);
                    this.ratingBar.setScrollable(false);
                    break;
                case 2:
                    this.etKomentar.setText(txnDataDetail.getValue());
                    this.etKomentar.setFocusable(false);
                    this.etKomentar.setFocusableInTouchMode(false);
                    this.etKomentar.setLongClickable(false);
                    this.tilKomentar.setHintEnabled(true);
                    break;
                case 3:
                    this.p = txnDataDetail.getValue();
                    break;
                case 4:
                    this.tvDireturDate.setText(txnDataDetail.getValue());
                    this.tvDiterimaDate.setText(txnDataDetail.getValue());
                    this.tvDitolakDate.setText(txnDataDetail.getValue());
                    this.tvInprogressDate.setText(txnDataDetail.getValue());
                    break;
                case 5:
                    this.tvDiterimaNamaPenerima.setText(txnDataDetail.getValue());
                    break;
                case 6:
                    this.tvNoReferensi.setText(txnDataDetail.getValue());
                    this.ivQrCode.setImageBitmap(getPromotion.a(txnDataDetail.getValue(), this));
                    break;
                case 7:
                    this.tvDitolakDesc.setText(txnDataDetail.getValue());
                    break;
            }
        }
        this.v.setDisplayedChild(2);
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void b(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void b_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
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
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.v = (ViewAnimator) findViewById(2131299751);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText("Bukti Transaksi");
        this.n = new DetailTransactionPresenter();
        this.r = new RateTransactionPresenter();
        this.n.e = this;
        this.r.e = this;
        Bundle extras = getIntent().getExtras();
        this.s = extras.getString("no_reff", "");
        this.q = extras.getString("token", "");
        this.t = extras.getString("flag_rating", "");
        this.u = extras.getString("TYPE", "");
        this.etKomentar.setOnTouchListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00a8: INVOKE  
              (wrap: o.LogoutDialog : 0x009e: IGET  (r0v25 o.LogoutDialog A[REMOVE]) = (r5v0 'this' com.bca.smartbranch.activity.DetailStatusPengajuanCCActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailStatusPengajuanCCActivity.etKomentar o.LogoutDialog)
              (wrap: o.getPromotion$4 : 0x00a5: CONSTRUCTOR  (r1v21 o.getPromotion$4 A[REMOVE]) =  call: o.getPromotion.4.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.view.View.setOnTouchListener(android.view.View$OnTouchListener):void in method: com.bca.smartbranch.activity.DetailStatusPengajuanCCActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailStatusPengajuanCCActivity.class
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.getPromotion, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
            	... 15 more
            */
        /*
            this = this;
            r0 = r5
            r1 = r6
            r0.d(r1)
            r0 = r5
            r1 = r5
            r2 = 2131299751(0x7f090da7, float:1.8217512E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ViewAnimator r1 = (android.widget.ViewAnimator) r1
            r0.v = r1
            r0 = r5
            r1 = r5
            o.setInputType r1 = r1.toolbar
            r0.b(r1)
            r0 = r5
            o.setBackgroundResource r0 = r0.i()
            r0 = r5
            o.setBackgroundResource r0 = r0.i()
            r1 = 1
            r0.d(r1)
            r0 = r5
            o.setBackgroundResource r0 = r0.i()
            java.lang.String r1 = ""
            r0.d(r1)
            r0 = r5
            android.widget.TextView r0 = r0.txtToolbarTitle
            java.lang.String r1 = "Bukti Transaksi"
            r0.setText(r1)
            r0 = r5
            com.bca.smartbranch.presenter.DetailTransactionPresenter r1 = new com.bca.smartbranch.presenter.DetailTransactionPresenter
            r2 = r1
            r2.<init>()
            r0.n = r1
            r0 = r5
            com.bca.smartbranch.presenter.RateTransactionPresenter r1 = new com.bca.smartbranch.presenter.RateTransactionPresenter
            r2 = r1
            r2.<init>()
            r0.r = r1
            r0 = r5
            com.bca.smartbranch.presenter.DetailTransactionPresenter r0 = r0.n
            r1 = r5
            r0.e = r1
            r0 = r5
            com.bca.smartbranch.presenter.RateTransactionPresenter r0 = r0.r
            r1 = r5
            r0.e = r1
            r0 = r5
            android.content.Intent r0 = r0.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r6 = r0
            r0 = r5
            r1 = r6
            java.lang.String r2 = "no_reff"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            r0.s = r1
            r0 = r5
            r1 = r6
            java.lang.String r2 = "token"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            r0.q = r1
            r0 = r5
            r1 = r6
            java.lang.String r2 = "flag_rating"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            r0.t = r1
            r0 = r5
            r1 = r6
            java.lang.String r2 = "TYPE"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            r0.u = r1
            r0 = r5
            o.LogoutDialog r0 = r0.etKomentar
            o.getPromotion$4 r1 = new o.getPromotion$4
            r2 = r1
            r2.<init>()
            r0.setOnTouchListener(r1)
            r0 = r5
            android.widget.TextView r0 = r0.tvHaloBCA1
            r1 = r5
            java.lang.String r1 = r1.hubungiHaloBCA
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            r0.setText(r1)
            r0 = r5
            r0.u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailStatusPengajuanCCActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        this.tvErrorMessage.setText(str);
        this.v.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        this.tvErrorMessage.setText(str);
        this.v.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        this.v.setDisplayedChild(0);
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void i(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
        this.ratingBar.setClickable(false);
        this.ratingBar.setScrollable(false);
        this.etKomentar.setFocusable(false);
        this.etKomentar.setFocusableInTouchMode(false);
        this.etKomentar.setLongClickable(false);
        this.etKomentar.setEnabled(false);
        this.btnProses.setEnabled(false);
    }

    @OnFocusChange({2131297031})
    public void inputChange(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131297031) {
                this.tilKomentar.setHintEnabled(true);
            }
        } else if (view.getId() == 2131297031 && this.etKomentar.getText().toString().isEmpty()) {
            this.tilKomentar.setHintEnabled(false);
        }
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailStatusPengajuanCCActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailStatusPengajuanCCActivity.this.v();
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
        onDestroy();
        DetailTransactionPresenter detailTransactionPresenter = this.n;
        Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call = detailTransactionPresenter.c;
        if (call != null) {
            call.cancel();
        }
        detailTransactionPresenter.e = null;
        RateTransactionPresenter rateTransactionPresenter = this.r;
        Call<OpenAccountSuccessActivity<Object>> call2 = rateTransactionPresenter.a;
        if (call2 != null) {
            call2.cancel();
        }
        rateTransactionPresenter.e = null;
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
            return true;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "DetailStatusPengajuanCCActivity";
        this.j = "DetailStatusPengajuanCCActivity";
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
        v();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492939;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131296446})
    public void retry(View view) {
        u();
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void t() {
        z();
    }
}
