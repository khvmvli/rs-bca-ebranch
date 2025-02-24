package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.global.TransaksiTunda;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.CancelAskTransaksiDialog;
import com.bca.smartbranch.dialog.CancelTransaksiDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.CancelReservationPresenter;
import com.bca.smartbranch.presenter.CancelTundaPresenter;
import com.bca.smartbranch.presenter.DetailTransactionPresenter;
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.ChooseBCACardAdapter$ViewHolder;
import o.FormUbahTellerActivity_ViewBinding;
import o.InfoDocumentUnderlyingActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.choosePic;
import o.documentProvider;
import o.getPromotion;
import o.onChooseBidangUsaha;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaCCActivity.class */
public class DetailTundaCCActivity extends BaseActivityPostLogin implements DetailTransactionPresenter.read, CancelTundaPresenter.IconCompatParcelizer, CancelReservationPresenter.write {
    @BindView(2131296380)
    Button btnBatal;
    @BindView(2131296443)
    Button btnReschedule;
    @BindView(2131296444)
    Button btnReservasi;
    private View f;
    @BindString(2131821817)
    String labelKuponDesc;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297869)
    LinearLayout llReservasi;
    private String n;
    private CancelReservationPresenter p;
    private String q;
    private CancelTundaPresenter r;
    @BindString(2131822092)
    String retry;
    private String s;
    private DetailTransactionPresenter t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822262)
    String toolbarTitle;
    @BindView(2131298863)
    TextView tvBrancahAddres;
    @BindView(2131298867)
    TextView tvBranchName;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299310)
    TextView tvJenisProduk;
    @BindView(2131299384)
    TextView tvKuponDescription;
    @BindView(2131299467)
    TextView tvNoReferensi;
    @BindView(2131299502)
    TextView tvNote;
    @BindView(2131299554)
    TextView tvReservationDate;
    @BindView(2131299557)
    TextView tvReservationTime;
    @BindView(2131299555)
    TextView tvResevationNote;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private ViewAnimator u;
    private String v;
    private TransaksiTunda w;
    private String x;

    private void v() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = new InfoDocumentUnderlyingActivity();
        infoDocumentUnderlyingActivity.e = this.q;
        infoDocumentUnderlyingActivity.d = "TUNDA";
        infoDocumentUnderlyingActivity.b = this.v;
        infoDocumentUnderlyingActivity.a = this.w.getType();
        this.t.d(getPromotion.b(this.m, ""), infoDocumentUnderlyingActivity);
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void A_(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.u, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void a_(String str) {
        this.tvErrorMessage.setText(str);
        this.u.setDisplayedChild(1);
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
                case -1976290923:
                    if (key.equals("AdditionalInfo")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1490966820:
                    if (key.equals("TxnStatus")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1335256710:
                    if (key.equals("ReservationDate")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1334772583:
                    if (key.equals("ReservationTime")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1238485368:
                    if (key.equals("Transaksi")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -948547731:
                    if (key.equals("BranchName")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -170196014:
                    if (key.equals("BranchAddress")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 75456161:
                    if (key.equals("Notes")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1260938190:
                    if (key.equals("Nomor Referensi")) {
                        c = '\b';
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
                    this.tvResevationNote.setText(Html.fromHtml(txnDataDetail.getValue()));
                    break;
                case 1:
                    String value = txnDataDetail.getValue();
                    value.hashCode();
                    switch (value.hashCode()) {
                        case 49:
                            c2 = 65535;
                            if (value.equals("1")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 50:
                            c2 = 65535;
                            if (value.equals("2")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 51:
                            if (!value.equals("3")) {
                                c2 = 65535;
                                break;
                            } else {
                                c2 = 2;
                                break;
                            }
                        case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
                            c2 = 65535;
                            if (value.equals("4")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 53:
                            c2 = 65535;
                            if (value.equals("5")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 54:
                            c2 = 65535;
                            if (value.equals("6")) {
                                c2 = 5;
                                break;
                            }
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            if (c2 != 2) {
                                if (c2 != 3) {
                                    if (c2 != 4) {
                                        if (c2 != 5) {
                                            break;
                                        } else {
                                            this.x = "6";
                                            break;
                                        }
                                    } else {
                                        this.x = "5";
                                        break;
                                    }
                                } else {
                                    this.x = "4";
                                    break;
                                }
                            } else {
                                this.x = "3";
                                break;
                            }
                        } else {
                            this.x = "2";
                            break;
                        }
                    } else {
                        this.x = "1";
                        break;
                    }
                case 2:
                    this.tvReservationDate.setText(Html.fromHtml(txnDataDetail.getValue()));
                    break;
                case 3:
                    this.tvReservationTime.setText(Html.fromHtml(txnDataDetail.getValue().replace(":", ".")));
                    break;
                case 4:
                    this.n = txnDataDetail.getValue();
                    this.tvJenisProduk.setText(txnDataDetail.getValue().replace(":@:", "\n"));
                    break;
                case 5:
                    this.tvBranchName.setText(Html.fromHtml(txnDataDetail.getValue()));
                    break;
                case 6:
                    this.tvBrancahAddres.setText(Html.fromHtml(txnDataDetail.getValue()));
                    break;
                case 7:
                    this.tvNote.setText(Html.fromHtml(txnDataDetail.getValue()));
                    break;
                case '\b':
                    this.tvNoReferensi.setText(Html.fromHtml(txnDataDetail.getValue()));
                    break;
            }
        }
        this.u.setDisplayedChild(2);
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

    @OnClick({2131296380})
    public void batal(View view) {
        if (this.s.equals("Y")) {
            CancelAskTransaksiDialog cancelAskTransaksiDialog = new CancelAskTransaksiDialog();
            Bundle bundle = new Bundle();
            bundle.putString("token", this.v);
            bundle.putString("noref", this.q);
            cancelAskTransaksiDialog.setArguments(bundle);
            cancelAskTransaksiDialog.show(l(), "CancelAskTransaksiDialog");
            return;
        }
        CancelTransaksiDialog cancelTransaksiDialog = new CancelTransaksiDialog();
        Bundle bundle2 = new Bundle();
        bundle2.putString("token", this.v);
        bundle2.putString("noref", this.q);
        cancelTransaksiDialog.setArguments(bundle2);
        cancelTransaksiDialog.show(l(), "CancelTransaksiDialog");
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @OnClick({2131296444, 2131296443})
    public void clickedReservation(View view) {
        this.f = view;
        Reservation reservation = new Reservation();
        reservation.setNoReff(this.w.getNoReff());
        reservation.setTypeTransaction(this.n);
        reservation.setTxnType("Transaksi CS");
        reservation.setTypeReservation(this.f.getId() == 2131296444 ? "NEW_RESERVATION" : "RESCHEDULE_RESERVATION");
        reservation.setTnxStatus(this.x);
        Intent intent = new Intent(this, BranchMapActivity.class);
        intent.putExtra("reff_no", reservation.getNoReff());
        intent.putExtra("type_transaksi", reservation.getTypeTransaction());
        intent.putExtra("type_reservation", reservation.getTypeReservation());
        intent.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(reservation));
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.u = (ViewAnimator) findViewById(2131299752);
        DetailTransactionPresenter detailTransactionPresenter = new DetailTransactionPresenter();
        this.t = detailTransactionPresenter;
        detailTransactionPresenter.e = this;
        this.p = new CancelReservationPresenter();
        this.r = new CancelTundaPresenter();
        this.p.a = this;
        this.r.a = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitle));
        this.tvKuponDescription.setText(Html.fromHtml(this.labelKuponDesc));
        TransaksiTunda transaksiTunda = (TransaksiTunda) ListUtil.OneItemImmutableList.a(getIntent().getExtras().getParcelable("transaksi_tunda"));
        this.w = transaksiTunda;
        this.q = transaksiTunda.getNoReff();
        this.s = this.w.getFlagBooking();
        this.v = this.w.getToken();
        if (this.s.equals("Y")) {
            this.btnReservasi.setVisibility(8);
            this.btnReschedule.setVisibility(0);
            this.llReservasi.setVisibility(0);
        }
        if (this.w.getServiceType() != null && this.w.getServiceType().equals("TL")) {
            this.btnReservasi.setVisibility(8);
            this.btnReschedule.setVisibility(8);
            this.btnBatal.setBackgroundResource(2131231309);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.btnBatal.getLayoutParams();
            layoutParams.width = -2;
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131165353);
            layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            layoutParams.weight = 0.0f;
            this.btnBatal.setLayoutParams(layoutParams);
        }
        v();
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void d(String str) {
        this.tvErrorMessage.setText(str);
        this.u.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void f_(String str) {
        this.tvErrorMessage.setText(str);
        this.u.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void g_() {
        z();
    }

    @Override // com.bca.smartbranch.presenter.DetailTransactionPresenter.read
    public final void h_() {
        this.u.setDisplayedChild(0);
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void i(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void j(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.u, str, -1).g();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBatalTransaksiOrReservasiEvent(onChooseBidangUsaha onchoosebidangusaha) {
        finish();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558410, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        DetailTransactionPresenter detailTransactionPresenter = this.t;
        Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call = detailTransactionPresenter.c;
        if (call != null) {
            call.cancel();
        }
        detailTransactionPresenter.e = null;
        CancelReservationPresenter cancelReservationPresenter = this.p;
        Call<OpenAccountSuccessActivity<Object>> call2 = cancelReservationPresenter.c;
        if (call2 != null) {
            call2.cancel();
        }
        cancelReservationPresenter.a = null;
        CancelTundaPresenter cancelTundaPresenter = this.r;
        Call<OpenAccountSuccessActivity<Object>> call3 = cancelTundaPresenter.d;
        if (call3 != null) {
            call3.cancel();
        }
        cancelTundaPresenter.a = null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "DetailTundaActivity";
        this.j = "DetailTundaActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492940;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131296446})
    public void retry(View view) {
        v();
    }

    @OnClick({2131299502})
    public void showWebView(View view) {
        Intent intent = new Intent(this, CekDokumenActivity.class);
        intent.putExtra("txn_status", this.x);
        startActivity(intent);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeSubmitBatalEvent(ChooseBCACardAdapter$ViewHolder chooseBCACardAdapter$ViewHolder) {
        if (chooseBCACardAdapter$ViewHolder.e) {
            this.p.e(new FormUbahTellerActivity_ViewBinding(this.m.getEmail(), this.m.getSessionId(), chooseBCACardAdapter$ViewHolder.b, chooseBCACardAdapter$ViewHolder.d, this.m.getImei()));
        } else {
            this.r.a(new choosePic(this.m.getEmail(), this.m.getImei(), this.m.getSessionId(), chooseBCACardAdapter$ViewHolder.b, chooseBCACardAdapter$ViewHolder.a, chooseBCACardAdapter$ViewHolder.d));
        }
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void t() {
        x();
        documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", getString(2131822441));
        bundle.putString("MessageDialogTitle", getString(2131822128));
        bundle.putBoolean("isMessageSuccess", true);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void u() {
        x();
        documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", getString(2131822441));
        bundle.putString("MessageDialogTitle", getString(2131822128));
        bundle.putBoolean("isMessageSuccess", true);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void w_(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.u, str, 0).g();
    }

    @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer
    public final void x_(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.u, str, 0).g();
    }
}
