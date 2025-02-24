package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import com.bca.smartbranch.activity.TarikanTransaksiActivity;
import com.bca.smartbranch.data.api.response.GetBranchReservationResponse;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import com.bca.smartbranch.data.global.BranchDetail;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.data.localdb.Setoran;
import com.bca.smartbranch.data.localdb.Tarikan;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.DraftBerhasilDialog;
import com.bca.smartbranch.dialog.InfoTarikanDialog;
import com.bca.smartbranch.dialog.KeluarFormReservationDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.SimpanDraftAndHitServiceDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.fragment.T1TransaksiTarikanFragment;
import com.bca.smartbranch.fragment.TPilihCabangFragment;
import com.bca.smartbranch.fragment.TReviewTarikanFragment;
import com.bca.smartbranch.presenter.GetHBPresenter;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import com.bca.smartbranch.presenter.TxnTellerPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.Realm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.BranchMapROItemAdapter$BranchMapROItemVH_ViewBinding;
import o.ChooseBCACardAdapter$ViewHolder_ViewBinding;
import o.InfoProductORActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LoginSessionActivity;
import o.OpenAccountSuccessActivity;
import o.PenggantianKeyBCAActivity;
import o.PilihJenisMataUangActivity_ViewBinding;
import o.PilihSetoranActivity_ViewBinding;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getCardName;
import o.getPromotion;
import o.getUserVisibleHint;
import o.onUbahFormReservasiEvent;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnHierarchyChangeListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/TarikanTransaksiActivity.class */
public class TarikanTransaksiActivity extends BaseActivityPostLogin implements TxnTellerPresenter.IconCompatParcelizer, GetHBPresenter.write, SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    private GetHBPresenter A;
    private String B;
    private TxnTellerPresenter C;
    private SendEmailTransactionSuccessPresenter D;
    private TxnTellerResponse I;
    @BindDrawable(2131231202)
    Drawable drawableIndicatorOff;
    @BindDrawable(2131231203)
    Drawable drawableIndicatorOn;
    public Tarikan f;
    @BindView(2131297377)
    ImageView ivIndicatorClear1;
    @BindView(2131297379)
    ImageView ivIndicatorClear2;
    @BindView(2131297381)
    ImageView ivIndicatorClear3;
    @BindView(2131297765)
    LinearLayout llLongIndicator;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297767)
    public LinearLayout llMainIndicator;
    public long n;
    public boolean p;
    @BindView(2131298111)
    ProgressBar pbIndicator1;
    @BindView(2131298112)
    ProgressBar pbIndicator2;
    public List<PenggantianKeyBCAActivity.RemoteActionCompatParcelizer> q = new ArrayList();
    public BranchDetail r;
    @BindView(2131298304)
    RelativeLayout rlToolbar;
    public GetBranchReservationResponse.ReservationBranch s;
    public GetCustAcctListResponse t;
    @BindString(2131822498)
    String tarikanCek;
    @BindString(2131822499)
    String tarikanTunai;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    public setInputType toolbar;
    @BindView(2131299276)
    TextView tvIndicator1;
    @BindView(2131299277)
    TextView tvIndicator2;
    @BindView(2131299278)
    TextView tvIndicator3;
    @BindView(2131298790)
    public TextView txtToolbarTitle;
    private Long u;
    private Bundle v;
    public ListFormTeller w;
    private boolean x;
    private boolean y;
    private boolean z;

    private void a(boolean z, String str) {
        x();
        String noReff = this.I.getTxnDataOutput().getNoReff();
        if (this.I.getTxnDataOutput().getDescriptionList() != null) {
            this.I.getTxnDataOutput().getDescriptionList().get(0).getKey();
        }
        if (this.I.getTxnDataOutput().getDescriptionList() != null) {
            this.I.getTxnDataOutput().getDescriptionList().get(0).getValue();
        }
        this.I.getTxnDataOutput().getNote();
        String email = this.m != null ? this.m.getEmail() : this.w.getSetoranList().get(0).getSenderEmail();
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilTellerNotificationActivity
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                TarikanTransaksiActivity tarikanTransaksiActivity = TarikanTransaksiActivity.this;
                if (tarikanTransaksiActivity.w != null) {
                    if (tarikanTransaksiActivity.w.getSetoranList() != null) {
                        tarikanTransaksiActivity.w.getSetoranList().deleteAllFromRealm();
                    }
                    if (tarikanTransaksiActivity.w.getTarikanList() != null) {
                        tarikanTransaksiActivity.w.getTarikanList().deleteAllFromRealm();
                    }
                    if (tarikanTransaksiActivity.w.getKirimanUangList() != null) {
                        tarikanTransaksiActivity.w.getKirimanUangList().deleteAllFromRealm();
                    }
                    if (tarikanTransaksiActivity.w.getKliringList() != null) {
                        tarikanTransaksiActivity.w.getKliringList().deleteAllFromRealm();
                    }
                    tarikanTransaksiActivity.w.deleteFromRealm();
                }
            }
        });
        if (this.y) {
            DraftBerhasilDialog draftBerhasilDialog = new DraftBerhasilDialog();
            draftBerhasilDialog.a = "transaction_teller";
            draftBerhasilDialog.show(l(), "DraftBerhasilDialog");
        } else if (this.z) {
            Reservation reservation = new Reservation();
            reservation.setTypeTransaction("Transaksi Teller");
            reservation.setTypeReservation("NEW_RESERVATION");
            reservation.setTxnType("Transaksi Teller");
            reservation.setNoReff(noReff);
            reservation.setTnxStatus("8");
            reservation.setTransactionCode(this.B);
            Intent intent = new Intent(this, BranchMapActivity.class);
            intent.putExtra("reff_no", reservation.getNoReff());
            intent.putExtra("type_transaksi", reservation.getTypeTransaction());
            intent.putExtra("type_reservation", reservation.getTypeReservation());
            intent.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(reservation));
            intent.putExtra("txn_data", ListUtil.OneItemImmutableList.e(this.I.getTxnDataOutput()));
            intent.putExtra("is_tartun_jumbes", this.x);
            startActivity(intent);
            setOnHierarchyChangeListener.d((Activity) this);
        } else {
            Intent intent2 = new Intent(this, DetailOpenTellerActivity.class);
            intent2.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.I.getTxnDataOutput()));
            intent2.putExtra("email", email);
            intent2.putExtra("no_reff", noReff);
            if (z) {
                intent2.putExtra("email_success", str);
            }
            startActivity(intent2);
            setOnHierarchyChangeListener.d((Activity) this);
        }
    }

    private void e(int i) {
        if (i == 1) {
            this.tvIndicator1.setBackgroundResource(2131231203);
            this.tvIndicator1.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator2.setBackgroundResource(2131231202);
            this.tvIndicator2.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator3.setBackgroundResource(2131231202);
            this.tvIndicator3.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator1.setVisibility(0);
            this.ivIndicatorClear1.setVisibility(8);
        } else if (i == 2) {
            this.tvIndicator1.setVisibility(8);
            this.ivIndicatorClear1.setVisibility(0);
            this.tvIndicator2.setBackgroundResource(2131231203);
            this.tvIndicator2.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator3.setBackgroundResource(2131231202);
            this.tvIndicator3.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator2.setVisibility(0);
            this.ivIndicatorClear2.setVisibility(8);
        } else if (i == 3) {
            this.tvIndicator1.setVisibility(8);
            this.ivIndicatorClear1.setVisibility(0);
            this.tvIndicator2.setVisibility(8);
            this.ivIndicatorClear2.setVisibility(0);
            this.tvIndicator3.setBackgroundResource(2131231203);
            this.tvIndicator3.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator3.setVisibility(0);
            this.ivIndicatorClear3.setVisibility(8);
        }
    }

    private void e(int i, Fragment fragment, String str) {
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
        getuservisiblehint.e(2130772010, 2130772011);
        getuservisiblehint.d(2131296811, fragment, str, 2);
        getuservisiblehint.b();
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        a(false, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0bb1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0bd6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0bec  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0c57  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0d1f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0d2a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0d40  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0d4b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0d61  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0d6c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0d7c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0d87  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0e61  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0e86  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0eba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x030e  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void a(boolean r8) {
        /*
        // Method dump skipped, instructions count: 4709
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.TarikanTransaksiActivity.a(boolean):void");
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        x();
        if (this.I != null) {
            a(false, "");
        } else {
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).e(2131822092, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.TarikanTransaksiActivity.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TarikanTransaksiActivity tarikanTransaksiActivity = TarikanTransaksiActivity.this;
                    tarikanTransaksiActivity.a(tarikanTransaksiActivity.y);
                }
            }).g();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void agree100JutaTarikan(PilihSetoranActivity_ViewBinding pilihSetoranActivity_ViewBinding) {
        startActivity(new Intent(this, BranchMapTarikanActivity.class));
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void b(TxnTellerResponse txnTellerResponse) {
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void b_(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void batal(PilihJenisMataUangActivity_ViewBinding pilihJenisMataUangActivity_ViewBinding) {
        Tarikan tarikan = (Tarikan) this.k.where(Tarikan.class).equalTo("id", Long.valueOf(this.f.getId())).findFirst();
        if (tarikan != null && tarikan.isValid()) {
            tarikan.deleteFromRealm();
        }
        finish();
    }

    @Override // o.getView
    public void c(Fragment fragment) {
        char c;
        c(fragment);
        try {
            String tag = fragment.getTag();
            switch (tag.hashCode()) {
                case 230573476:
                    if (tag.equals("TPilihCabangFragment")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 997753336:
                    if (tag.equals("TReviewTarikanFragment")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1231023888:
                    if (tag.equals("ProsesTarikanFragment")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 2088268825:
                    if (tag.equals("T1TransaksiTarikanFragment")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.llMainIndicator.setVisibility(0);
                this.rlToolbar.setVisibility(0);
                e(1);
                ProgressBar progressBar = this.pbIndicator1;
                progressBar.startAnimation(new getCardName(progressBar, 0.0f));
                this.llLongIndicator.setVisibility(8);
            } else if (c == 1) {
                this.llMainIndicator.setVisibility(0);
                this.rlToolbar.setVisibility(0);
                if (this.llLongIndicator.getVisibility() == 8) {
                    e(2);
                    ProgressBar progressBar2 = this.pbIndicator1;
                    progressBar2.startAnimation(new getCardName(progressBar2, 100.0f));
                } else {
                    e(3);
                    ProgressBar progressBar3 = this.pbIndicator2;
                    progressBar3.startAnimation(new getCardName(progressBar3, 100.0f));
                }
            } else if (c == 2) {
                this.llMainIndicator.setVisibility(0);
                this.rlToolbar.setVisibility(0);
                this.llLongIndicator.setVisibility(0);
                e(2);
                ProgressBar progressBar4 = this.pbIndicator1;
                progressBar4.startAnimation(new getCardName(progressBar4, 100.0f));
                ProgressBar progressBar5 = this.pbIndicator2;
                progressBar5.startAnimation(new getCardName(progressBar5, 0.0f));
            } else if (c == 3) {
                this.llMainIndicator.setVisibility(8);
                this.rlToolbar.setVisibility(8);
            }
            this.k.executeTransaction(new Realm.Transaction(fragment) { // from class: o.DetailBerhasilTellerActivity_ViewBinding
                public final /* synthetic */ Fragment b;

                {
                    this.b = r5;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    char c2;
                    TarikanTransaksiActivity tarikanTransaksiActivity = TarikanTransaksiActivity.this;
                    String tag2 = this.b.getTag();
                    tag2.hashCode();
                    switch (tag2.hashCode()) {
                        case 230573476:
                            if (tag2.equals("TPilihCabangFragment")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 345832560:
                            if (tag2.equals("TarikanInfoBiayaFragment")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 997753336:
                            if (tag2.equals("TReviewTarikanFragment")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2088268825:
                            if (tag2.equals("T1TransaksiTarikanFragment")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 == 0) {
                        tarikanTransaksiActivity.f.setCurrentPage("TPilihCabangFragment");
                    } else if (c2 == 1) {
                        tarikanTransaksiActivity.f.setCurrentPage("TarikanInfoBiayaFragment");
                    } else if (c2 == 2) {
                        tarikanTransaksiActivity.f.setCurrentPage("TReviewTarikanFragment");
                    } else if (c2 == 3) {
                        tarikanTransaksiActivity.f.setCurrentPage("T1TransaksiTarikanFragment");
                    }
                }
            });
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("TarikanTransaksiActivity : ");
            sb.append(e.getMessage());
            Log.i("EBRANCH", sb.toString());
        }
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void c(TxnTellerResponse txnTellerResponse) {
        this.I = txnTellerResponse;
        String imei = this.m != null ? this.m.getImei() : Settings.Secure.getString(getContentResolver(), "android_id");
        if (this.m != null) {
            this.m.getSessionId();
        }
        String str = this.m != null ? "N" : "Y";
        String email = this.m != null ? this.m.getEmail() : "";
        String str2 = email;
        if (email.isEmpty()) {
            if (!this.w.getSetoranList().isEmpty()) {
                str2 = this.w.getSetoranList().get(0).getSenderEmail();
            } else {
                str2 = email;
                if (!this.w.getTarikanList().isEmpty()) {
                    str2 = this.w.getTarikanList().get(0).getEmail();
                }
            }
        }
        this.D.a(getPromotion.e(this.m, str, imei, str2), str2, new LoginSessionActivity(txnTellerResponse.getTxnDataOutput().getNoReff()));
    }

    public final void c(boolean z) {
        Intent intent = new Intent(this, BranchMapTarikanActivity.class);
        if (z) {
            intent.putExtra("Reservasi", ListUtil.OneItemImmutableList.e(this.s));
            intent.putExtra("branchDetail", ListUtil.OneItemImmutableList.e(this.r));
        }
        startActivityForResult(intent, 25);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        a(false, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        char c;
        char c2;
        char c3;
        d(bundle);
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.A = getHBPresenter;
        getHBPresenter.e = this;
        this.f10o = false;
        this.v = getIntent().getExtras();
        TxnTellerPresenter txnTellerPresenter = new TxnTellerPresenter();
        this.C = txnTellerPresenter;
        txnTellerPresenter.d = this;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = new SendEmailTransactionSuccessPresenter();
        this.D = sendEmailTransactionSuccessPresenter;
        sendEmailTransactionSuccessPresenter.b = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(Html.fromHtml(this.tarikanTunai));
        if (this.m != null && this.m.getVerified().equals("Y")) {
            this.t = (GetCustAcctListResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("ListAcct"));
        }
        this.p = this.v.getBoolean("is_from_reservation", false);
        this.n = this.v.getLong("id_reservation");
        if (this.v.getBoolean("id_draft", false)) {
            String string = this.v.getString("TellerType", "");
            switch (string.hashCode()) {
                case -1628850644:
                    if (string.equals("kirim_uang")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1538212364:
                    if (string.equals("tarikan")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -628935336:
                    if (string.equals("kliring")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1985800370:
                    if (string.equals("setoran")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 2) {
                Tarikan tarikan = (Tarikan) this.k.where(Tarikan.class).equalTo("id", Long.valueOf(this.v.getLong("transaksi_teller_id", 0))).findFirst();
                this.u = Long.valueOf(this.v.getLong("transaksi_teller_id", 0));
                Tarikan tarikan2 = new Tarikan();
                this.f = tarikan2;
                tarikan2.setId(tarikan.getId());
                this.f.setCurrentPage(tarikan.getCurrentPage());
                this.f.setNoRekening(tarikan.getNoRekening());
                this.f.setJumlah(tarikan.getJumlah());
                this.f.setEmail(tarikan.getEmail());
                this.f.setCreatedAt(tarikan.getCreatedAt());
                String currentPage = this.f.getCurrentPage();
                currentPage.hashCode();
                switch (currentPage.hashCode()) {
                    case 230573476:
                        if (currentPage.equals("TPilihCabangFragment")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 345832560:
                        if (currentPage.equals("TarikanInfoBiayaFragment")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 997753336:
                        if (currentPage.equals("TReviewTarikanFragment")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 2088268825:
                        if (currentPage.equals("T1TransaksiTarikanFragment")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                if (c3 == 0) {
                    e(2131296811, new TPilihCabangFragment(), "TPilihCabangFragment");
                } else if (c3 == 1) {
                    e(2131296811, new T1TransaksiTarikanFragment(), "T1TransaksiTarikanFragment");
                } else if (c3 == 2) {
                    e(2131296811, new TReviewTarikanFragment(), "TReviewTarikanFragment");
                } else if (c3 == 3) {
                    e(2131296811, new T1TransaksiTarikanFragment(), "T1TransaksiTarikanFragment");
                }
            }
        } else {
            if (this.m == null || this.m.getVerified().equals("N")) {
                new InfoTarikanDialog().show(l(), "InfoTarikanDialog");
            }
            Tarikan tarikan3 = new Tarikan();
            this.f = tarikan3;
            if (this.p) {
                Tarikan tarikan4 = (Tarikan) this.k.where(Tarikan.class).equalTo("id", Long.valueOf(this.n)).findFirst();
                if (tarikan4 != null) {
                    this.f.setId(tarikan4.getId());
                    this.f.setCurrentPage("TReviewTarikanFragment");
                    this.f.setNoRekening(tarikan4.getNoRekening());
                    this.f.setJumlah(tarikan4.getJumlah());
                    this.f.setEmail(tarikan4.getEmail());
                    this.f.setCreatedAt(tarikan4.getCreatedAt());
                } else {
                    this.f.setId(this.n);
                    this.f.setCreatedAt(this.n);
                }
            } else {
                tarikan3.setId(System.currentTimeMillis());
                this.f.setCreatedAt(System.currentTimeMillis());
            }
            if (this.m != null) {
                this.f.setEmail(this.m.getEmail());
            }
            String currentPage2 = this.f.getCurrentPage();
            currentPage2.hashCode();
            switch (currentPage2.hashCode()) {
                case 230573476:
                    if (currentPage2.equals("TPilihCabangFragment")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 345832560:
                    if (currentPage2.equals("TarikanInfoBiayaFragment")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 997753336:
                    if (currentPage2.equals("TReviewTarikanFragment")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 2088268825:
                    if (currentPage2.equals("T1TransaksiTarikanFragment")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                e(2131296811, new TPilihCabangFragment(), "TPilihCabangFragment");
            } else if (c == 1) {
                e(2131296811, new T1TransaksiTarikanFragment(), "T1TransaksiTarikanFragment");
            } else if (c == 2) {
                e(2131296811, new TReviewTarikanFragment(), "TReviewTarikanFragment");
            } else if (c != 3) {
                e(2131296811, new T1TransaksiTarikanFragment(), "T1TransaksiTarikanFragment");
            } else {
                e(2131296811, new T1TransaksiTarikanFragment(), "T1TransaksiTarikanFragment");
            }
        }
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.TarikanTransaksiActivity.2
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                TarikanTransaksiActivity.this.w = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
                if (TarikanTransaksiActivity.this.w == null) {
                    TarikanTransaksiActivity.this.w = (ListFormTeller) realm.createObject(ListFormTeller.class, Long.valueOf(System.currentTimeMillis()));
                }
            }
        });
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        a(true, str);
    }

    public final /* synthetic */ void e(Realm realm) {
        Tarikan tarikan = (Tarikan) this.k.where(Tarikan.class).equalTo("id", Long.valueOf(this.f.getId())).findFirst();
        if (tarikan == null) {
            Tarikan tarikan2 = (Tarikan) realm.createObject(Tarikan.class, Long.valueOf(this.f.getId()));
            tarikan2.setCreatedAt(this.f.getCreatedAt());
            tarikan2.setNoRekening(this.f.getNoRekening());
            tarikan2.setJumlah(this.f.getJumlah().replaceAll("\\.", ""));
            tarikan2.setCurrentPage(this.f.getCurrentPage());
            this.m.getTarikans().add(tarikan2);
            return;
        }
        tarikan.setCreatedAt(this.f.getCreatedAt());
        tarikan.setNoRekening(this.f.getNoRekening());
        tarikan.setJumlah(this.f.getJumlah().replaceAll("\\.", ""));
        tarikan.setCurrentPage(this.f.getCurrentPage());
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        z();
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void i_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void l(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        documentProvider.b().d(new clickOrangSamaDenganPemilik());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueKeluarFormReservation(onUbahFormReservasiEvent onubahformreservasievent) {
        if (onubahformreservasievent.b.equals("Y")) {
            finish();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.TarikanTransaksiActivity.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    Tarikan tarikan = (Tarikan) TarikanTransaksiActivity.this.k.where(Tarikan.class).equalTo("id", Long.valueOf(TarikanTransaksiActivity.this.f.getId())).findFirst();
                    if (tarikan != null) {
                        tarikan.deleteFromRealm();
                        documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
                    }
                }
            });
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return;
        }
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.onDeleteEventDialog
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                TarikanTransaksiActivity.this.e(realm);
            }
        });
        if (this.w.getCountAll() > 0) {
            a(true);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.p) {
            return true;
        }
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        TxnTellerPresenter txnTellerPresenter = this.C;
        Call<OpenAccountSuccessActivity<TxnTellerResponse>> call = txnTellerPresenter.e;
        if (call != null) {
            call.cancel();
        }
        txnTellerPresenter.d = null;
        GetHBPresenter getHBPresenter = this.A;
        Call<OpenAccountSuccessActivity<Object>> call2 = getHBPresenter.b;
        if (call2 != null) {
            call2.cancel();
        }
        getHBPresenter.e = null;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.D;
        Call<OpenAccountSuccessActivity<Object>> call3 = sendEmailTransactionSuccessPresenter.a;
        if (call3 != null) {
            call3.cancel();
        }
        sendEmailTransactionSuccessPresenter.b = null;
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
            if (this.m == null) {
                YakinKeluarDialog yakinKeluarDialog = new YakinKeluarDialog();
                yakinKeluarDialog.d = "transaction_teller";
                yakinKeluarDialog.show(l(), "YakinKeluarDialog");
                return true;
            } else if (this.p) {
                new KeluarFormReservationDialog().show(l(), "KeluarFormReservationDialog");
                return true;
            } else {
                ListFormTeller listFormTeller = this.w;
                if (listFormTeller == null || listFormTeller.getCountAll() == 0) {
                    SimpanDraftDialog simpanDraftDialog = new SimpanDraftDialog();
                    simpanDraftDialog.b = "transaction_teller";
                    simpanDraftDialog.show(l(), "SimpanDraftDialog");
                    return true;
                }
                SimpanDraftAndHitServiceDialog simpanDraftAndHitServiceDialog = new SimpanDraftAndHitServiceDialog();
                simpanDraftAndHitServiceDialog.a = this.w.getCountAll();
                simpanDraftAndHitServiceDialog.show(l(), "SimpanDraftAndHitServiceDialog");
                return true;
            }
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onReservasiTellerEvent(BranchMapROItemAdapter$BranchMapROItemVH_ViewBinding branchMapROItemAdapter$BranchMapROItemVH_ViewBinding) {
        this.z = branchMapROItemAdapter$BranchMapROItemVH_ViewBinding.d;
        String email = this.m != null ? this.m.getEmail() : "";
        StringBuilder sb = new StringBuilder();
        new ArrayList();
        if (!this.w.getSetoranList().isEmpty()) {
            Iterator<Setoran> it = this.w.getSetoranList().iterator();
            while (it.hasNext()) {
                it.next();
                if (!sb.toString().isEmpty()) {
                    sb.append(",");
                }
                sb.append(ReservasiOnline.SETORAN_TUNAI);
            }
        }
        if (!this.w.getTarikanList().isEmpty()) {
            Iterator<Tarikan> it2 = this.w.getTarikanList().iterator();
            while (it2.hasNext()) {
                it2.next();
                if (!sb.toString().isEmpty()) {
                    sb.append(",");
                }
                sb.append(ReservasiOnline.TARIKAN_TUNAI);
            }
        }
        this.B = sb.toString();
        if (this.w.getTarikanList() != null && !this.w.getTarikanList().isEmpty()) {
            Iterator<Tarikan> it3 = this.w.getTarikanList().iterator();
            while (it3.hasNext()) {
                Tarikan next = it3.next();
                if (Long.parseLong(next.getJumlah().isEmpty() ? "0" : next.getJumlah()) > 100000000) {
                    this.x = true;
                }
            }
        }
        if (!this.x || this.z) {
            a(false);
            return;
        }
        Intent intent = new Intent(this, BranchMapTarikanActivity.class);
        intent.putExtra("email", email);
        intent.putExtra("no_reff", "");
        startActivity(intent);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onSelesaiHubungiCabang(ChooseBCACardAdapter$ViewHolder_ViewBinding chooseBCACardAdapter$ViewHolder_ViewBinding) {
        this.s = chooseBCACardAdapter$ViewHolder_ViewBinding.b;
        this.r = chooseBCACardAdapter$ViewHolder_ViewBinding.a;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "TarikanTransaksiActivity";
        this.j = "TarikanTransaksiActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131493009;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    public final void t() {
        if (this.m != null) {
            GetHBPresenter getHBPresenter = this.A;
            Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
            getHBPresenter.b = e;
            e.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE  
                  (r0v7 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                  (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x003c: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v3 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.TarikanTransaksiActivity.t():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/TarikanTransaksiActivity.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetHBPresenter, state: GENERATED_AND_UNLOADED
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
                	... 23 more
                */
            /*
                this = this;
                r0 = r6
                com.bca.smartbranch.data.localdb.User r0 = r0.m
                if (r0 == 0) goto L_0x0044
                r0 = r6
                com.bca.smartbranch.presenter.GetHBPresenter r0 = r0.A
                r7 = r0
                o.InfoProductORActivity_ViewBinding r0 = new o.InfoProductORActivity_ViewBinding
                r1 = r0
                r2 = r6
                java.lang.String r2 = r2.h
                r3 = r6
                com.bca.smartbranch.data.localdb.User r3 = r3.m
                java.lang.String r3 = r3.getSessionId()
                r4 = r6
                com.bca.smartbranch.data.localdb.User r4 = r4.m
                java.lang.String r4 = r4.getImei()
                r1.<init>(r2, r3, r4)
                r8 = r0
                r0 = r7
                o.setIncomeDisplayAmount r0 = r0.apiService
                r1 = r8
                retrofit2.Call r0 = r0.e(r1)
                r8 = r0
                r0 = r7
                r1 = r8
                r0.b = r1
                r0 = r8
                com.bca.smartbranch.presenter.GetHBPresenter$5 r1 = new com.bca.smartbranch.presenter.GetHBPresenter$5
                r2 = r1
                r3 = r7
                r2.<init>()
                r0.enqueue(r1)
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.TarikanTransaksiActivity.t():void");
        }
    }
