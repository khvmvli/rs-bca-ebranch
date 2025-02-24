package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.Settings;
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
import com.bca.smartbranch.activity.FormTellerActivity;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import com.bca.smartbranch.data.global.DaftarTransfer;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.data.localdb.Setoran;
import com.bca.smartbranch.data.localdb.Tarikan;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.DraftBerhasilDialog;
import com.bca.smartbranch.dialog.KeluarFormReservationDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.SimpanDraftAndHitServiceDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
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
import o.InfoProductORActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LoginSessionActivity;
import o.OpenAccountSuccessActivity;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getCardName;
import o.getPromotion;
import o.getUserVisibleHint;
import o.onClickUbahDataOrangDatangKeCabang;
import o.onUbahFormReservasiEvent;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnHierarchyChangeListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FormTellerActivity.class */
public class FormTellerActivity extends BaseActivityPostLogin implements GetHBPresenter.write, TxnTellerPresenter.IconCompatParcelizer, SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    private SendEmailTransactionSuccessPresenter A;
    private TxnTellerPresenter B;
    private boolean C;
    private String D;
    private TxnTellerResponse E;
    private String G;
    private String I;
    @BindDrawable(2131231202)
    Drawable drawableIndicatorOff;
    @BindDrawable(2131231203)
    Drawable drawableIndicatorOn;
    public Setoran f;
    @BindView(2131297377)
    ImageView ivIndicatorClear1;
    @BindView(2131297379)
    ImageView ivIndicatorClear2;
    @BindView(2131297381)
    ImageView ivIndicatorClear3;
    @BindView(2131297383)
    ImageView ivIndicatorClear4;
    @BindView(2131297384)
    ImageView ivIndicatorClear5;
    @BindView(2131297685)
    LinearLayout llIndicator3;
    @BindView(2131297686)
    LinearLayout llIndicator4;
    @BindView(2131297687)
    LinearLayout llIndicator5;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297767)
    public LinearLayout llMainIndicator;
    public User n;
    public List<DaftarTransfer> p;
    @BindView(2131298111)
    ProgressBar pbIndicator1;
    @BindView(2131298112)
    ProgressBar pbIndicator2;
    @BindView(2131298113)
    ProgressBar pbIndicator3;
    @BindView(2131298114)
    ProgressBar pbIndicator4;
    public String[] q;
    public long r;
    @BindView(2131298304)
    public RelativeLayout rlToolbar;
    public String[] s;
    public boolean t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822281)
    String toolbarTitle;
    @BindView(2131299276)
    TextView tvIndicator1;
    @BindView(2131299277)
    TextView tvIndicator2;
    @BindView(2131299278)
    TextView tvIndicator3;
    @BindView(2131299279)
    TextView tvIndicator4;
    @BindView(2131299280)
    TextView tvIndicator5;
    @BindView(2131298790)
    TextView tvToolbarTitle;
    private boolean u;
    public ListFormTeller v;
    private Bundle y;
    private GetHBPresenter z;
    private boolean x = false;
    public boolean w = false;

    private void b(int i, Fragment fragment, String str) {
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
        getuservisiblehint.e(2130772010, 2130772011);
        getuservisiblehint.d(2131296811, fragment, str, 2);
        getuservisiblehint.b();
    }

    private void d(int i) {
        if (i == 1) {
            this.tvIndicator1.setBackgroundResource(2131231203);
            this.tvIndicator1.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator2.setBackgroundResource(2131231202);
            this.tvIndicator2.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator3.setBackgroundResource(2131231202);
            this.tvIndicator3.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator4.setBackgroundResource(2131231202);
            this.tvIndicator4.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator1.setVisibility(0);
            this.ivIndicatorClear1.setVisibility(8);
            this.tvIndicator2.setVisibility(0);
            this.ivIndicatorClear2.setVisibility(8);
            this.tvIndicator3.setVisibility(0);
            this.ivIndicatorClear3.setVisibility(8);
            this.tvIndicator4.setVisibility(0);
            this.ivIndicatorClear4.setVisibility(8);
        } else if (i == 2) {
            this.tvIndicator1.setVisibility(8);
            this.ivIndicatorClear1.setVisibility(0);
            this.tvIndicator2.setBackgroundResource(2131231203);
            this.tvIndicator2.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator3.setBackgroundResource(2131231202);
            this.tvIndicator3.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator4.setBackgroundResource(2131231202);
            this.tvIndicator4.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator2.setVisibility(0);
            this.ivIndicatorClear2.setVisibility(8);
            this.tvIndicator3.setVisibility(0);
            this.ivIndicatorClear3.setVisibility(8);
            this.tvIndicator4.setVisibility(0);
            this.ivIndicatorClear4.setVisibility(8);
        } else if (i == 3) {
            this.tvIndicator1.setVisibility(8);
            this.ivIndicatorClear1.setVisibility(0);
            this.tvIndicator2.setVisibility(8);
            this.ivIndicatorClear2.setVisibility(0);
            this.tvIndicator3.setBackgroundResource(2131231203);
            this.tvIndicator3.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator4.setBackgroundResource(2131231202);
            this.tvIndicator4.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator3.setVisibility(0);
            this.ivIndicatorClear3.setVisibility(8);
            this.tvIndicator4.setVisibility(0);
            this.ivIndicatorClear4.setVisibility(8);
        } else if (i == 4) {
            this.tvIndicator1.setVisibility(8);
            this.ivIndicatorClear1.setVisibility(0);
            this.tvIndicator2.setVisibility(8);
            this.ivIndicatorClear2.setVisibility(0);
            this.tvIndicator3.setVisibility(8);
            this.ivIndicatorClear3.setVisibility(0);
            this.tvIndicator4.setBackgroundResource(2131231203);
            this.tvIndicator4.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator4.setVisibility(0);
            this.ivIndicatorClear4.setVisibility(8);
        } else if (i == 5) {
            this.tvIndicator1.setVisibility(8);
            this.ivIndicatorClear1.setVisibility(0);
            this.tvIndicator2.setVisibility(8);
            this.ivIndicatorClear2.setVisibility(0);
            this.tvIndicator3.setVisibility(8);
            this.ivIndicatorClear3.setVisibility(0);
            this.tvIndicator4.setVisibility(8);
            this.ivIndicatorClear4.setVisibility(0);
        }
    }

    private void e(boolean z, String str) {
        x();
        String noReff = this.E.getTxnDataOutput().getNoReff();
        if (this.E.getTxnDataOutput().getDescriptionList() != null) {
            this.E.getTxnDataOutput().getDescriptionList().get(0).getKey();
        }
        if (this.E.getTxnDataOutput().getDescriptionList() != null) {
            this.E.getTxnDataOutput().getDescriptionList().get(0).getValue();
        }
        this.E.getTxnDataOutput().getNote();
        String email = this.m != null ? this.m.getEmail() : this.v.getSetoranList().get(0).getSenderEmail();
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.CC6VisaInfoActivity
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                FormTellerActivity formTellerActivity = FormTellerActivity.this;
                ListFormTeller listFormTeller = formTellerActivity.v;
                if (listFormTeller != null) {
                    if (listFormTeller.getSetoranList() != null && formTellerActivity.v.getSetoranList().isValid()) {
                        formTellerActivity.v.getSetoranList().deleteAllFromRealm();
                    }
                    if (formTellerActivity.v.getTarikanList() != null && formTellerActivity.v.getTarikanList().isValid()) {
                        formTellerActivity.v.getTarikanList().deleteAllFromRealm();
                    }
                    if (formTellerActivity.v.getKirimanUangList() != null && formTellerActivity.v.getKirimanUangList().isValid()) {
                        formTellerActivity.v.getKirimanUangList().deleteAllFromRealm();
                    }
                    if (formTellerActivity.v.getKliringList() != null && formTellerActivity.v.getKliringList().isValid()) {
                        formTellerActivity.v.getKliringList().deleteAllFromRealm();
                    }
                    ListFormTeller listFormTeller2 = formTellerActivity.v;
                    if (listFormTeller2 != null && listFormTeller2.isValid()) {
                        formTellerActivity.v.deleteFromRealm();
                    }
                }
            }
        });
        if (this.u) {
            DraftBerhasilDialog draftBerhasilDialog = new DraftBerhasilDialog();
            draftBerhasilDialog.a = "transaction_teller";
            draftBerhasilDialog.show(l(), "DraftBerhasilDialog");
        } else if (this.C) {
            Reservation reservation = new Reservation();
            reservation.setTypeTransaction("Transaksi Teller");
            reservation.setTypeReservation("NEW_RESERVATION");
            reservation.setTxnType("Transaksi CS");
            reservation.setNoReff(noReff);
            reservation.setTnxStatus("8");
            reservation.setTransactionCode(this.G);
            Intent intent = new Intent(this, BranchMapActivity.class);
            intent.putExtra("reff_no", reservation.getNoReff());
            intent.putExtra("type_transaksi", reservation.getTypeTransaction());
            intent.putExtra("type_reservation", reservation.getTypeReservation());
            intent.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(reservation));
            intent.putExtra("txn_data", ListUtil.OneItemImmutableList.e(this.E.getTxnDataOutput()));
            intent.putExtra("is_tartun_jumbes", this.x);
            startActivity(intent);
            setOnHierarchyChangeListener.d((Activity) this);
        } else {
            Intent intent2 = new Intent(this, DetailOpenTellerActivity.class);
            intent2.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.E.getTxnDataOutput()));
            intent2.putExtra("email", email);
            intent2.putExtra("no_reff", noReff);
            if (z) {
                intent2.putExtra("email_success", str);
            }
            startActivity(intent2);
            setOnHierarchyChangeListener.d((Activity) this);
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        e(false, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09e8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0bb4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0bd9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0c5a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0d22  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0d2d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0d43  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0d4e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0d64  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0d6f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0d7f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0d8a  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0e64  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0e89  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0ebd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0313  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void a(boolean r8) {
        /*
        // Method dump skipped, instructions count: 4729
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.FormTellerActivity.a(boolean):void");
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        x();
        if (this.E != null) {
            e(false, "");
        } else {
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).e(2131822092, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.FormTellerActivity.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FormTellerActivity formTellerActivity = FormTellerActivity.this;
                    formTellerActivity.a(formTellerActivity.u);
                }
            }).g();
        }
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

    @Override // o.getView
    public void c(Fragment fragment) {
        char c;
        c(fragment);
        try {
            String tag = fragment.getTag();
            switch (tag.hashCode()) {
                case -513277748:
                    if (tag.equals("SumberDanaDataPemilikSetunFragment")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1034341173:
                    if (tag.equals("SumberDanaOrangDatangKeCabangSetunFragment")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1654903434:
                    if (tag.equals("ReviewSetoranFragment")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1774053895:
                    if (tag.equals("PenerimaFragment")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2013603516:
                    if (tag.equals("SumberDanaPilihIdentitasSetunFragment")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.rlToolbar.setVisibility(0);
                d(1);
                ProgressBar progressBar = this.pbIndicator1;
                progressBar.startAnimation(new getCardName(progressBar, 0.0f));
                ProgressBar progressBar2 = this.pbIndicator2;
                progressBar2.startAnimation(new getCardName(progressBar2, 0.0f));
                ProgressBar progressBar3 = this.pbIndicator3;
                progressBar3.startAnimation(new getCardName(progressBar3, 0.0f));
                ProgressBar progressBar4 = this.pbIndicator4;
                progressBar4.startAnimation(new getCardName(progressBar4, 0.0f));
                if (this.w) {
                    this.llIndicator3.setVisibility(8);
                    this.llIndicator4.setVisibility(8);
                }
            } else if (c == 1 || c == 2) {
                this.rlToolbar.setVisibility(0);
                d(2);
                ProgressBar progressBar5 = this.pbIndicator1;
                progressBar5.startAnimation(new getCardName(progressBar5, 100.0f));
                ProgressBar progressBar6 = this.pbIndicator2;
                progressBar6.startAnimation(new getCardName(progressBar6, 0.0f));
                ProgressBar progressBar7 = this.pbIndicator3;
                progressBar7.startAnimation(new getCardName(progressBar7, 0.0f));
                ProgressBar progressBar8 = this.pbIndicator4;
                progressBar8.startAnimation(new getCardName(progressBar8, 0.0f));
            } else if (c == 3) {
                this.rlToolbar.setVisibility(0);
                d(3);
                ProgressBar progressBar9 = this.pbIndicator1;
                progressBar9.startAnimation(new getCardName(progressBar9, 100.0f));
                ProgressBar progressBar10 = this.pbIndicator2;
                progressBar10.startAnimation(new getCardName(progressBar10, 100.0f));
                ProgressBar progressBar11 = this.pbIndicator3;
                progressBar11.startAnimation(new getCardName(progressBar11, 0.0f));
                ProgressBar progressBar12 = this.pbIndicator4;
                progressBar12.startAnimation(new getCardName(progressBar12, 0.0f));
            } else if (c == 4) {
                this.rlToolbar.setVisibility(0);
                if (this.w) {
                    d(2);
                    ProgressBar progressBar13 = this.pbIndicator1;
                    progressBar13.startAnimation(new getCardName(progressBar13, 100.0f));
                    ProgressBar progressBar14 = this.pbIndicator2;
                    progressBar14.startAnimation(new getCardName(progressBar14, 0.0f));
                    this.llIndicator3.setVisibility(8);
                    this.llIndicator4.setVisibility(8);
                    return;
                }
                d(4);
                ProgressBar progressBar15 = this.pbIndicator1;
                progressBar15.startAnimation(new getCardName(progressBar15, 100.0f));
                ProgressBar progressBar16 = this.pbIndicator2;
                progressBar16.startAnimation(new getCardName(progressBar16, 100.0f));
                ProgressBar progressBar17 = this.pbIndicator3;
                progressBar17.startAnimation(new getCardName(progressBar17, 100.0f));
                ProgressBar progressBar18 = this.pbIndicator4;
                progressBar18.startAnimation(new getCardName(progressBar18, 100.0f));
            }
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder("FormActivity : ");
            sb.append(e);
            Log.i("EBRANCH", sb.toString());
        }
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void c(TxnTellerResponse txnTellerResponse) {
        this.E = txnTellerResponse;
        String imei = this.m != null ? this.m.getImei() : Settings.Secure.getString(getContentResolver(), "android_id");
        if (this.m != null) {
            this.m.getSessionId();
        }
        String str = this.m != null ? "N" : "Y";
        String email = this.m != null ? this.m.getEmail() : "";
        String str2 = email;
        if (email.isEmpty()) {
            if (!this.v.getSetoranList().isEmpty()) {
                str2 = this.v.getSetoranList().get(0).getSenderEmail();
            } else {
                str2 = email;
                if (!this.v.getTarikanList().isEmpty()) {
                    str2 = this.v.getTarikanList().get(0).getEmail();
                }
            }
        }
        this.A.a(getPromotion.e(this.m, str, imei, str2), str2, new LoginSessionActivity(txnTellerResponse.getTxnDataOutput().getNoReff()));
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        e(false, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x09fa, code lost:
        if (r0.equals("ProsesSetoranFragment") == false) goto L_0x0994;
     */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void d(android.os.Bundle r8) {
        /*
        // Method dump skipped, instructions count: 2710
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.FormTellerActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        e(true, str);
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
            this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.FormTellerActivity.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    Setoran setoran = (Setoran) realm.where(Setoran.class).equalTo("id", Long.valueOf(FormTellerActivity.this.f.getId())).findFirst();
                    if (setoran != null) {
                        setoran.deleteFromRealm();
                        documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
                    }
                }
            });
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return;
        }
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.CC6VisaInfoActivity_ViewBinding
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                FormTellerActivity formTellerActivity = FormTellerActivity.this;
                Setoran setoran = (Setoran) realm.where(Setoran.class).equalTo("id", Long.valueOf(formTellerActivity.f.getId())).findFirst();
                if (setoran == null) {
                    Setoran setoran2 = (Setoran) realm.createObject(Setoran.class, Long.valueOf(formTellerActivity.f.getId()));
                    setoran2.setCurrentPage(formTellerActivity.f.getCurrentPage());
                    setoran2.setCreatedAt(formTellerActivity.f.getCreatedAt());
                    setoran2.setUpdatedAt(formTellerActivity.f.getUpdatedAt());
                    setoran2.setFlagGuest(formTellerActivity.f.getFlagGuest());
                    setoran2.setOldCustFlag(formTellerActivity.f.getOldCustFlag());
                    setoran2.setIsLongForm(formTellerActivity.f.getIsLongForm());
                    setoran2.setFlagDaftarTransfer(formTellerActivity.f.getFlagDaftarTransfer());
                    setoran2.setFlagTxnBerkala(formTellerActivity.f.getFlagTxnBerkala());
                    setoran2.setSenderName(formTellerActivity.f.getSenderName());
                    setoran2.setSenderIdType(formTellerActivity.f.getSenderIdType());
                    setoran2.setSenderIdNumber(formTellerActivity.f.getSenderIdNumber());
                    setoran2.setSenderAddress(formTellerActivity.f.getSenderAddress());
                    setoran2.setSenderPhone(formTellerActivity.f.getSenderPhone());
                    setoran2.setSenderEmail(formTellerActivity.f.getSenderEmail());
                    setoran2.setReceiverName(formTellerActivity.f.getReceiverName());
                    setoran2.setReceiverAccount(formTellerActivity.f.getReceiverAccount());
                    setoran2.setReceiverAlias(formTellerActivity.f.getReceiverAlias());
                    setoran2.setTxnAmount(formTellerActivity.f.getTxnAmount());
                    setoran2.setTxnSource(formTellerActivity.f.getTxnSource());
                    setoran2.setTxnPurpose(formTellerActivity.f.getTxnPurpose());
                    setoran2.setTxnNotes(formTellerActivity.f.getTxnNotes());
                    setoran2.setRecurringVar(formTellerActivity.f.getRecurringVar());
                    setoran2.setRecurringValue(formTellerActivity.f.getRecurringValue());
                    setoran2.setRecurringEndDate(formTellerActivity.f.getRecurringEndDate());
                    setoran2.setType(formTellerActivity.f.getType());
                    setoran2.setFlagSameReceiverSenderData(formTellerActivity.f.getFlagSameReceiverSenderData());
                    setoran2.setSourceAccountOwnerType(formTellerActivity.f.getSourceAccountOwnerType());
                    setoran2.setFlagRepresentativeTransaction(formTellerActivity.f.getFlagRepresentativeTransaction());
                    setoran2.setRepresentativeIdType(formTellerActivity.f.getRepresentativeIdType());
                    setoran2.setRepresentativeIdNumber(formTellerActivity.f.getRepresentativeIdNumber());
                    setoran2.setRepresentativeName(formTellerActivity.f.getRepresentativeName());
                    setoran2.setRepresentativeRelationship(formTellerActivity.f.getRepresentativeRelationship());
                    setoran2.setFlagSaveToSourceAccountList(formTellerActivity.f.getFlagSaveToSourceAccountList());
                    setoran2.setCurrency(formTellerActivity.f.getCurrency());
                    formTellerActivity.n.getSetorans().add(setoran2);
                    return;
                }
                setoran.setCurrentPage(formTellerActivity.f.getCurrentPage());
                setoran.setCreatedAt(formTellerActivity.f.getCreatedAt());
                setoran.setUpdatedAt(formTellerActivity.f.getUpdatedAt());
                setoran.setFlagGuest(formTellerActivity.f.getFlagGuest());
                setoran.setOldCustFlag(formTellerActivity.f.getOldCustFlag());
                setoran.setIsLongForm(formTellerActivity.f.getIsLongForm());
                setoran.setFlagDaftarTransfer(formTellerActivity.f.getFlagDaftarTransfer());
                setoran.setFlagTxnBerkala(formTellerActivity.f.getFlagTxnBerkala());
                setoran.setSenderName(formTellerActivity.f.getSenderName());
                setoran.setSenderIdType(formTellerActivity.f.getSenderIdType());
                setoran.setSenderIdNumber(formTellerActivity.f.getSenderIdNumber());
                setoran.setSenderAddress(formTellerActivity.f.getSenderAddress());
                setoran.setSenderPhone(formTellerActivity.f.getSenderPhone());
                setoran.setSenderEmail(formTellerActivity.f.getSenderEmail());
                setoran.setReceiverName(formTellerActivity.f.getReceiverName());
                setoran.setReceiverAccount(formTellerActivity.f.getReceiverAccount());
                setoran.setReceiverAlias(formTellerActivity.f.getReceiverAlias());
                setoran.setTxnAmount(formTellerActivity.f.getTxnAmount());
                setoran.setTxnSource(formTellerActivity.f.getTxnSource());
                setoran.setTxnPurpose(formTellerActivity.f.getTxnPurpose());
                setoran.setTxnNotes(formTellerActivity.f.getTxnNotes());
                setoran.setRecurringVar(formTellerActivity.f.getRecurringVar());
                setoran.setRecurringValue(formTellerActivity.f.getRecurringValue());
                setoran.setRecurringEndDate(formTellerActivity.f.getRecurringEndDate());
                setoran.setType(formTellerActivity.f.getType());
                setoran.setFlagSameReceiverSenderData(formTellerActivity.f.getFlagSameReceiverSenderData());
                setoran.setSourceAccountOwnerType(formTellerActivity.f.getSourceAccountOwnerType());
                setoran.setFlagRepresentativeTransaction(formTellerActivity.f.getFlagRepresentativeTransaction());
                setoran.setRepresentativeIdType(formTellerActivity.f.getRepresentativeIdType());
                setoran.setRepresentativeIdNumber(formTellerActivity.f.getRepresentativeIdNumber());
                setoran.setRepresentativeName(formTellerActivity.f.getRepresentativeName());
                setoran.setRepresentativeRelationship(formTellerActivity.f.getRepresentativeRelationship());
                setoran.setFlagSaveToSourceAccountList(formTellerActivity.f.getFlagSaveToSourceAccountList());
                setoran.setCurrency(formTellerActivity.f.getCurrency());
            }
        });
        if (this.v.getCountAll() > 0) {
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
        if (this.t) {
            return true;
        }
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        TxnTellerPresenter txnTellerPresenter = this.B;
        Call<OpenAccountSuccessActivity<TxnTellerResponse>> call = txnTellerPresenter.e;
        if (call != null) {
            call.cancel();
        }
        txnTellerPresenter.d = null;
        GetHBPresenter getHBPresenter = this.z;
        Call<OpenAccountSuccessActivity<Object>> call2 = getHBPresenter.b;
        if (call2 != null) {
            call2.cancel();
        }
        getHBPresenter.e = null;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.A;
        Call<OpenAccountSuccessActivity<Object>> call3 = sendEmailTransactionSuccessPresenter.a;
        if (call3 != null) {
            call3.cancel();
        }
        sendEmailTransactionSuccessPresenter.b = null;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onGetHBEvent(onClickUbahDataOrangDatangKeCabang onclickubahdataorangdatangkecabang) {
        if (this.m != null) {
            GetHBPresenter getHBPresenter = this.z;
            Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
            getHBPresenter.b = e;
            e.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE  
                  (r0v7 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                  (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x003c: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v3 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.FormTellerActivity.onGetHBEvent(o.onClickUbahDataOrangDatangKeCabang):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/FormTellerActivity.class
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
                com.bca.smartbranch.presenter.GetHBPresenter r0 = r0.z
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
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.FormTellerActivity.onGetHBEvent(o.onClickUbahDataOrangDatangKeCabang):void");
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
                if (!this.n.isMember()) {
                    YakinKeluarDialog yakinKeluarDialog = new YakinKeluarDialog();
                    yakinKeluarDialog.d = "transaction_teller";
                    yakinKeluarDialog.show(l(), "YakinKeluarDialog");
                    return true;
                } else if (this.t) {
                    new KeluarFormReservationDialog().show(l(), "KeluarFormReservationDialog");
                    return true;
                } else {
                    ListFormTeller listFormTeller = this.v;
                    if (listFormTeller == null || listFormTeller.getCountAll() == 0) {
                        SimpanDraftDialog simpanDraftDialog = new SimpanDraftDialog();
                        simpanDraftDialog.b = "transaction_teller";
                        simpanDraftDialog.show(l(), "SimpanDraftDialog");
                        return true;
                    }
                    SimpanDraftAndHitServiceDialog simpanDraftAndHitServiceDialog = new SimpanDraftAndHitServiceDialog();
                    simpanDraftAndHitServiceDialog.a = this.v.getCountAll();
                    simpanDraftAndHitServiceDialog.show(l(), "SimpanDraftAndHitServiceDialog");
                    return true;
                }
            }
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onReservasiTellerEvent(BranchMapROItemAdapter$BranchMapROItemVH_ViewBinding branchMapROItemAdapter$BranchMapROItemVH_ViewBinding) {
            this.C = branchMapROItemAdapter$BranchMapROItemVH_ViewBinding.d;
            String email = this.m != null ? this.m.getEmail() : "";
            StringBuilder sb = new StringBuilder();
            new ArrayList();
            if (!this.v.getSetoranList().isEmpty()) {
                Iterator<Setoran> it = this.v.getSetoranList().iterator();
                while (it.hasNext()) {
                    it.next();
                    if (!sb.toString().isEmpty()) {
                        sb.append(",");
                    }
                    sb.append(ReservasiOnline.SETORAN_TUNAI);
                }
            }
            if (!this.v.getTarikanList().isEmpty()) {
                Iterator<Tarikan> it2 = this.v.getTarikanList().iterator();
                while (it2.hasNext()) {
                    it2.next();
                    if (!sb.toString().isEmpty()) {
                        sb.append(",");
                    }
                    sb.append(ReservasiOnline.TARIKAN_TUNAI);
                }
            }
            this.G = sb.toString();
            if (this.v.getTarikanList() != null && !this.v.getTarikanList().isEmpty()) {
                Iterator<Tarikan> it3 = this.v.getTarikanList().iterator();
                while (it3.hasNext()) {
                    Tarikan next = it3.next();
                    if (Long.parseLong(next.getJumlah().isEmpty() ? "0" : next.getJumlah()) > 100000000) {
                        this.x = true;
                    }
                }
            }
            if (!this.x || this.C) {
                a(false);
                return;
            }
            Intent intent = new Intent(this, BranchMapTarikanActivity.class);
            intent.putExtra("email", email);
            intent.putExtra("no_reff", "");
            startActivity(intent);
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final void p() {
            setCardSlogan.e().b = "FormTellerActivity";
            this.j = "FormTellerActivity";
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final int q() {
            return 2131492955;
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final Activity r() {
            return this;
        }
    }
