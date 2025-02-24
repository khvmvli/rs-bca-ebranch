package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
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
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.DetailTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.documentProvider;
import o.getPromotion;
import o.loginAsGuest;
import o.onAcceptKetentuanOR;
import o.pilihTipeTujuanTransaksiPenerima;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setMessage;
import org.joda.time.format.DateTimeFormat;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBNPengembalianDanaActivity.class */
public class DetailBNPengembalianDanaActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read, RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private String A;
    private RateTransactionPresenter B;
    private String C;
    private String D;
    private String E;
    private ViewAnimator H;
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
    private DetailTransactionPresenter r;
    @BindView(2131298126)
    onAcceptKetentuanOR ratingBar;
    @BindString(2131822092)
    String retry;
    private String t;
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
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;
    private setMessage f = new setMessage();
    private String s = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.C;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.D;
        this.B.d(loginasguest);
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        this.tvErrorMessage.setText(str);
        this.H.setDisplayedChild(1);
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
                case -2065004047:
                    if (key.equals("Jumlah")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -2053478804:
                    if (key.equals("StatusType")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1854235203:
                    if (key.equals("Rating")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1679915457:
                    if (key.equals("Comment")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -932588989:
                    if (key.equals("Pecahan Uang")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -919926309:
                    if (key.equals("Total Pengembalian")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -140636396:
                    if (key.equals("Kurs Pengembalian")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 74230:
                    if (key.equals("Jam")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 2350411:
                    if (key.equals("Kurs")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 6130891:
                    if (key.equals("Nama Mata Uang")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 80988633:
                    if (key.equals("Token")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 80997156:
                    if (key.equals("Total")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 122683404:
                    if (key.equals("Tanggal")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 683936044:
                    if (key.equals("Nama Pembayar")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1125806085:
                    if (key.equals("Kondisi")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1260938190:
                    if (key.equals("Nomor Referensi")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950516649:
                    if (key.equals("Kode Mata Uang")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 2010750902:
                    if (key.equals("Cabang")) {
                        c = 17;
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
                    this.t = txnDataDetail.getValue();
                    break;
                case 1:
                    String value = txnDataDetail.getValue();
                    value.hashCode();
                    int hashCode = value.hashCode();
                    if (hashCode == 48) {
                        c2 = 65535;
                        if (value.equals("0")) {
                            c2 = 0;
                        }
                    } else if (hashCode != 53) {
                        c2 = hashCode != 54 ? 65535 : !value.equals("6") ? (char) 65535 : 2;
                    } else {
                        c2 = 65535;
                        if (value.equals("5")) {
                            c2 = 1;
                        }
                    }
                    if (c2 == 0) {
                        this.llPecahanUang.setVisibility(8);
                    } else if (c2 != 1) {
                        if (c2 != 2) {
                            break;
                        } else {
                            this.llRating.setVisibility(8);
                            break;
                        }
                    }
                    if (this.p.equals("N")) {
                        this.btnProses.setVisibility(0);
                    } else {
                        this.tvPenilaian.setText("Penilaian kamu");
                        this.btnProses.setVisibility(8);
                    }
                    this.llRating.setVisibility(0);
                    break;
                case 2:
                    if (!txnDataDetail.getValue().equalsIgnoreCase("")) {
                        this.ratingBar.setRating(Float.parseFloat(txnDataDetail.getValue()));
                        this.ratingBar.setClickable(false);
                        this.ratingBar.setScrollable(false);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (!txnDataDetail.getValue().equalsIgnoreCase("")) {
                        this.etKomentar.setText(txnDataDetail.getValue());
                        this.etKomentar.setFocusable(false);
                        this.etKomentar.setFocusableInTouchMode(false);
                        this.etKomentar.setLongClickable(false);
                        this.tilKomentar.setHintEnabled(true);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    this.s = txnDataDetail.getValue();
                    break;
                case 5:
                    TextView textView = this.tvTotalSebelumnya;
                    StringBuilder sb = new StringBuilder();
                    sb.append(getPromotion.a(txnDataDetail.getValue()));
                    sb.append(" IDR");
                    textView.setText(sb.toString());
                    break;
                case 6:
                    this.w = txnDataDetail.getValue();
                    break;
                case 7:
                    this.q = txnDataDetail.getValue();
                    break;
                case '\b':
                    this.y = txnDataDetail.getValue();
                    break;
                case '\t':
                    this.u = txnDataDetail.getValue();
                    break;
                case '\n':
                    this.D = txnDataDetail.getValue();
                    break;
                case 11:
                    TextView textView2 = this.tvTotal;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(getPromotion.a(txnDataDetail.getValue()));
                    sb2.append(" IDR");
                    textView2.setText(sb2.toString());
                    break;
                case '\f':
                    this.z = DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy").parseDateTime(txnDataDetail.getValue()));
                    break;
                case '\r':
                    this.tvNama.setText(txnDataDetail.getValue());
                    break;
                case 14:
                    this.n = txnDataDetail.getValue();
                    break;
                case 15:
                    this.C = txnDataDetail.getValue();
                    this.tvNoRef.setText(txnDataDetail.getValue());
                    break;
                case 16:
                    this.x = txnDataDetail.getValue();
                    break;
                case 17:
                    this.tvCabang.setText(txnDataDetail.getValue());
                    break;
            }
        }
        TextView textView3 = this.tvMataUangSebelumnya;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.u);
        sb3.append(" (");
        sb3.append(this.x);
        sb3.append(")");
        textView3.setText(sb3.toString());
        TextView textView4 = this.tvMataUang;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.u);
        sb4.append(" (");
        sb4.append(this.x);
        sb4.append(")");
        textView4.setText(sb4.toString());
        String str = this.s;
        if (str == null || str.isEmpty()) {
            this.llPecahanUang.setVisibility(8);
        } else {
            this.llPecahanUang.setVisibility(0);
            TextView textView5 = this.tvTitlePecahanUang;
            StringBuilder sb5 = new StringBuilder("Pecahan Uang ");
            sb5.append(this.x);
            textView5.setText(sb5.toString());
            TextView textView6 = this.tvPecahanUang;
            StringBuilder sb6 = new StringBuilder("Pecahan ");
            sb6.append(getPromotion.h(this.s));
            textView6.setText(sb6.toString());
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm");
            Date parse = simpleDateFormat.parse(this.q);
            TextView textView7 = this.tvTanggal;
            StringBuilder sb7 = new StringBuilder();
            sb7.append(this.z);
            sb7.append(", ");
            sb7.append(simpleDateFormat2.format(parse));
            textView7.setText(sb7.toString());
        } catch (Exception e) {
            TextView textView8 = this.tvTanggal;
            StringBuilder sb8 = new StringBuilder();
            sb8.append(this.z);
            sb8.append(", ");
            sb8.append(this.q);
            textView8.setText(sb8.toString());
        }
        TextView textView9 = this.tvJumlahPembelian;
        StringBuilder sb9 = new StringBuilder();
        sb9.append(getPromotion.h(this.t));
        sb9.append(" ");
        sb9.append(this.x);
        textView9.setText(sb9.toString());
        TextView textView10 = this.tvTitlePecahanUang;
        StringBuilder sb10 = new StringBuilder();
        sb10.append(getString(2131821992));
        sb10.append(" ");
        sb10.append(this.x);
        textView10.setText(sb10.toString());
        TextView textView11 = this.tvKurs;
        StringBuilder sb11 = new StringBuilder();
        sb11.append(getPromotion.a(this.y));
        sb11.append(" IDR");
        textView11.setText(sb11.toString());
        TextView textView12 = this.tvKursSebelumnya;
        StringBuilder sb12 = new StringBuilder();
        sb12.append(getPromotion.a(this.w));
        sb12.append(" IDR");
        textView12.setText(sb12.toString());
        this.H.setDisplayedChild(2);
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
        this.H = (ViewAnimator) findViewById(2131299751);
        RateTransactionPresenter rateTransactionPresenter = new RateTransactionPresenter();
        this.B = rateTransactionPresenter;
        rateTransactionPresenter.e = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitle));
        DetailTransactionPresenter detailTransactionPresenter = new DetailTransactionPresenter();
        this.r = detailTransactionPresenter;
        detailTransactionPresenter.e = this;
        Bundle extras = getIntent().getExtras();
        this.v = extras.getString("no_reff", "");
        this.A = extras.getString("token", "");
        this.p = extras.getString("flag_rating", "");
        this.E = extras.getString("TYPE", "");
        this.etKomentar.setOnTouchListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00aa: INVOKE  
              (wrap: android.widget.EditText : 0x00a0: IGET  (r0v25 android.widget.EditText A[REMOVE]) = (r5v0 'this' com.bca.smartbranch.activity.DetailBNPengembalianDanaActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailBNPengembalianDanaActivity.etKomentar android.widget.EditText)
              (wrap: o.getPromotion$4 : 0x00a7: CONSTRUCTOR  (r1v25 o.getPromotion$4 A[REMOVE]) =  call: o.getPromotion.4.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.view.View.setOnTouchListener(android.view.View$OnTouchListener):void in method: com.bca.smartbranch.activity.DetailBNPengembalianDanaActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBNPengembalianDanaActivity.class
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
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailBNPengembalianDanaActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        this.tvErrorMessage.setText(str);
        this.H.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        this.tvErrorMessage.setText(str);
        this.H.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        this.H.setDisplayedChild(0);
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
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNPengembalianDanaActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailBNPengembalianDanaActivity.this.v();
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
        DetailTransactionPresenter detailTransactionPresenter = this.r;
        Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call = detailTransactionPresenter.c;
        if (call != null) {
            call.cancel();
        }
        detailTransactionPresenter.e = null;
        RateTransactionPresenter rateTransactionPresenter = this.B;
        Call<OpenAccountSuccessActivity<Object>> call2 = rateTransactionPresenter.a;
        if (call2 != null) {
            call2.cancel();
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
            return true;
        }
    }

    @OnClick({2131297650, 2131299268, 2131297371})
    public void onToggleTransaksi(View view) {
        this.f.b(this.llDetail, this.ivHeader);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "DetailBNPengembalianDanaActivity";
        this.j = "DetailBNPengembalianDanaActivity";
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
