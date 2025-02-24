package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
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
import com.bca.smartbranch.data.api.response.FirebaseResponse;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.RateTransactionPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import java.util.ArrayList;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
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
import o.setOnHierarchyChangeListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailStatusPengajuanCCNotificationActivity.class */
public class DetailStatusPengajuanCCNotificationActivity extends BaseActivityPostLogin implements RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
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
    private String p;
    @BindView(2131298126)
    onAcceptKetentuanOR ratingBar;
    @BindString(2131822092)
    String retry;
    private RateTransactionPresenter s;
    private ViewAnimator t;
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
    private String n = "";
    private setMessage f = new setMessage();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void e(FirebaseResponse.TxnDataDetail txnDataDetail) {
        char c;
        char c2;
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
                        if (value.equals("6")) {
                            c2 = 3;
                            break;
                        } else {
                            c2 = 65535;
                            break;
                        }
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 0) {
                    this.clInprogress.setVisibility(0);
                    this.clDiterima.setVisibility(8);
                    this.clDitolak.setVisibility(8);
                    this.clDiretur.setVisibility(8);
                    this.llInfo.setVisibility(8);
                    this.llRating.setVisibility(8);
                    return;
                } else if (c2 == 1) {
                    this.clDiterima.setVisibility(0);
                    this.clInprogress.setVisibility(8);
                    this.clDitolak.setVisibility(8);
                    this.clDiretur.setVisibility(8);
                    this.llInfo.setVisibility(0);
                    this.llRating.setVisibility(0);
                    return;
                } else if (c2 == 2) {
                    this.clDitolak.setVisibility(0);
                    this.clDiterima.setVisibility(8);
                    this.clInprogress.setVisibility(8);
                    this.clDiretur.setVisibility(8);
                    this.llInfo.setVisibility(0);
                    this.llRating.setVisibility(8);
                    return;
                } else if (c2 == 3) {
                    this.clDiretur.setVisibility(0);
                    this.clDiterima.setVisibility(8);
                    this.clDitolak.setVisibility(8);
                    this.clInprogress.setVisibility(8);
                    this.llInfo.setVisibility(0);
                    this.llRating.setVisibility(8);
                    return;
                } else {
                    return;
                }
            case 1:
                this.ratingBar.setRating(Float.parseFloat(txnDataDetail.getValue()));
                this.ratingBar.setClickable(false);
                this.ratingBar.setScrollable(false);
                return;
            case 2:
                this.etKomentar.setText(txnDataDetail.getValue());
                this.etKomentar.setFocusable(false);
                this.etKomentar.setFocusableInTouchMode(false);
                this.etKomentar.setLongClickable(false);
                this.tilKomentar.setHintEnabled(true);
                return;
            case 3:
                this.p = txnDataDetail.getValue();
                return;
            case 4:
                this.tvDireturDate.setText(txnDataDetail.getValue());
                this.tvDiterimaDate.setText(txnDataDetail.getValue());
                this.tvDitolakDate.setText(txnDataDetail.getValue());
                this.tvInprogressDate.setText(txnDataDetail.getValue());
                return;
            case 5:
                this.tvDiterimaNamaPenerima.setText(txnDataDetail.getValue());
                return;
            case 6:
                this.tvNoReferensi.setText(txnDataDetail.getValue());
                this.ivQrCode.setImageBitmap(getPromotion.a(txnDataDetail.getValue(), this));
                return;
            case 7:
                this.tvDitolakDesc.setText(txnDataDetail.getValue());
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        loginAsGuest loginasguest = new loginAsGuest();
        loginasguest.c = this.n;
        loginasguest.e = String.valueOf((int) ((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a);
        loginasguest.a = this.etKomentar.getText().toString();
        loginasguest.b = this.p;
        this.s.d(loginasguest);
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
        this.t = (ViewAnimator) findViewById(2131299751);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText("Bukti Transaksi");
        RateTransactionPresenter rateTransactionPresenter = new RateTransactionPresenter();
        this.s = rateTransactionPresenter;
        rateTransactionPresenter.e = this;
        this.tvHaloBCA1.setText(Html.fromHtml(this.hubungiHaloBCA));
        FirebaseResponse firebaseResponse = (FirebaseResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("response"));
        FirebaseResponse firebaseResponse2 = firebaseResponse;
        if (firebaseResponse == null) {
            Bundle extras = getIntent().getExtras();
            firebaseResponse2 = firebaseResponse;
            if (extras != null) {
                firebaseResponse2 = new FirebaseResponse();
                firebaseResponse2.setType(extras.getString("Type"));
                firebaseResponse2.setAlert(extras.getString("Alert"));
                firebaseResponse2.setRefNo(extras.getString("RefNo"));
                try {
                    JSONArray jSONArray = new JSONArray(extras.getString("TxnDataDetail"));
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        FirebaseResponse.TxnDataDetail txnDataDetail = new FirebaseResponse.TxnDataDetail();
                        txnDataDetail.setKey(optJSONObject.optString("Key"));
                        txnDataDetail.setValue(optJSONObject.optString("Value"));
                        arrayList.add(txnDataDetail);
                    }
                    firebaseResponse2.setTxnDataDetailList(arrayList);
                } catch (JSONException e) {
                    Log.i("EBRANCH", String.valueOf(e));
                }
            }
        }
        if (firebaseResponse2 != null) {
            this.n = firebaseResponse2.getRefNo();
        }
        this.etKomentar.setOnTouchListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0131: INVOKE  
              (wrap: o.LogoutDialog : 0x0127: IGET  (r0v25 o.LogoutDialog A[REMOVE]) = (r4v0 'this' com.bca.smartbranch.activity.DetailStatusPengajuanCCNotificationActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.DetailStatusPengajuanCCNotificationActivity.etKomentar o.LogoutDialog)
              (wrap: o.getPromotion$4 : 0x012e: CONSTRUCTOR  (r1v16 o.getPromotion$4 A[REMOVE]) =  call: o.getPromotion.4.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.view.View.setOnTouchListener(android.view.View$OnTouchListener):void in method: com.bca.smartbranch.activity.DetailStatusPengajuanCCNotificationActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailStatusPengajuanCCNotificationActivity.class
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
        // Method dump skipped, instructions count: 352
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DetailStatusPengajuanCCNotificationActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void g(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
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
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.DetailStatusPengajuanCCNotificationActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailStatusPengajuanCCNotificationActivity.this.s();
            }
        }).g();
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        if (this.h.equalsIgnoreCase("")) {
            startActivity(new Intent(this, LandingActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            setOnHierarchyChangeListener.d((Activity) this);
            return;
        }
        onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        RateTransactionPresenter rateTransactionPresenter = this.s;
        Call<OpenAccountSuccessActivity<Object>> call = rateTransactionPresenter.a;
        if (call != null) {
            call.cancel();
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
        setCardSlogan.e().b = "DetailStatusPengajuanCCNotificationActivity";
        this.j = "DetailStatusPengajuanCCNotificationActivity";
    }

    @OnClick({2131296440})
    public void proses(View view) {
        this.tvErrorKomentar.setVisibility(8);
        this.tilKomentar.setBackgroundResource(2131230847);
        if (((pilihTipeTujuanTransaksiPenerima) this.ratingBar).a <= 0.0f) {
            this.tvErrorKomentar.setVisibility(0);
            this.tvErrorKomentar.setText(2131820982);
        } else if (this.etKomentar.getText().toString().isEmpty()) {
            this.tvErrorKomentar.setVisibility(0);
            this.tvErrorKomentar.setText(2131820765);
            this.tilKomentar.setBackgroundResource(2131230870);
            this.etKomentar.requestFocus();
        } else {
            s();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492939;
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
