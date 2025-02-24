package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.AvailableBookingTimeROActivity;
import com.bca.smartbranch.data.api.response.CreateQueueReservationResponse;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.ErrorGetAvailableBookingTimeDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.CreateQueueReservationPresenter;
import com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter;
import com.bca.smartbranch.presenter.GetHBPresenter;
import com.bca.smartbranch.presenter.RescheduleReservationV2Presenter;
import com.bca.smartbranch.presenter.SaveToEformPresenter;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.Realm;
import io.realm.RealmResults;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import o.ConfirmSubMastercardAdapter$ViewHolder_ViewBinding;
import o.HapusTransaksiBerkalaActivity_ViewBinding;
import o.InfoKursORActivity_ViewBinding;
import o.InfoProductORActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LoginSessionActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceMenuActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanTransaksiActivity_ViewBinding;
import o.clickView;
import o.documentProvider;
import o.getAnnualFeeBasicAmount;
import o.onAddFingerPrintSuccess;
import o.onChooseBankPenerbit;
import o.onChooseJabatan;
import o.onChooseKecamatan;
import o.onOpenFingerprintDialog;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import org.joda.time.format.DateTimeFormat;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/AvailableBookingTimeROActivity.class */
public class AvailableBookingTimeROActivity extends BaseActivityPostLogin implements RescheduleReservationV2Presenter.IconCompatParcelizer, GetAvailableBookingV2Presenter.write, GetHBPresenter.write, SaveToEformPresenter.write, CreateQueueReservationPresenter.write, SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    private RealmResults<ReservasiOnline> A;
    private SendEmailTransactionSuccessPresenter B;
    private SaveToEformPresenter C;
    private RescheduleReservationV2Presenter D;
    private String E;
    private String F;
    private String G;
    private Reservation I;
    private String J;
    private StringBuilder K;
    private ViewAnimator L;
    private List<DetailTransactionResponse.TxnDataDetail> M;
    @BindView(2131296440)
    Button btnProses;
    @BindView(2131297635)
    LinearLayout llEstimasi;
    @BindView(2131297703)
    LinearLayout llJenisRuanganWrapper;
    @BindView(2131296324)
    LinearLayout lnActivityMain;
    @BindView(2131297968)
    LinearLayout lnJenisRuangan;
    @BindView(2131297970)
    LinearLayout lnReservationDate;
    @BindView(2131297971)
    LinearLayout lnReservationTime;
    private CreateQueueReservationResponse n;
    private Location q;
    @BindString(2131822092)
    String retry;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298862)
    TextView tvBranch;
    @BindView(2131298952)
    TextView tvError;
    @BindView(2131298997)
    TextView tvErrorClosed;
    @BindView(2131299011)
    TextView tvErrorFullBook;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299252)
    TextView tvEstimasiWaktu;
    @BindView(2131299558)
    TextView tvReservationTimeInfo;
    @BindView(2131298790)
    TextView tvToolbar;
    @BindView(2131299686)
    TextView tvTotalTransaksi;
    @BindString(2131822291)
    String txtToolbar;
    private CreateQueueReservationPresenter w;
    private GetHBPresenter x;
    private GetAvailableBookingV2Presenter y;
    private GetBranchROResponse.DetailBranch z;
    private String f = null;
    private List<OutwardRemittanceMenuActivity_ViewBinding.IconCompatParcelizer> u = new ArrayList();
    private List<OutwardRemittanceMenuActivity_ViewBinding.RemoteActionCompatParcelizer> v = new ArrayList();
    private int s = -1;
    private int r = -1;
    private int t = -1;
    private List<ConfirmSubMastercardAdapter$ViewHolder_ViewBinding> p = new ArrayList();
    private String H = "001";

    public void A() {
        this.f = "SaveToEform";
        onOpenFingerprintDialog onopenfingerprintdialog = new onOpenFingerprintDialog();
        onopenfingerprintdialog.b = this.m.getEmail();
        onopenfingerprintdialog.e = this.m.getImei();
        onopenfingerprintdialog.d = this.m.getSessionId();
        onopenfingerprintdialog.c = this.m.getName();
        onopenfingerprintdialog.j = this.A.get(0).getTypeTransksi();
        onopenfingerprintdialog.a = "";
        onopenfingerprintdialog.i = this.K.toString();
        this.C.a(onopenfingerprintdialog);
    }

    private void C() {
        this.lnJenisRuangan.removeAllViews();
        this.p.clear();
        if (this.I.getTxnType().equalsIgnoreCase("Transaksi Teller")) {
            if (this.z.getFlagReservationTellerSolitaire() != null && this.z.getFlagReservationTellerSolitaire().equals("Y") && this.m.getMembership().equalsIgnoreCase("s")) {
                ConfirmSubMastercardAdapter$ViewHolder_ViewBinding confirmSubMastercardAdapter$ViewHolder_ViewBinding = new ConfirmSubMastercardAdapter$ViewHolder_ViewBinding();
                confirmSubMastercardAdapter$ViewHolder_ViewBinding.a = "003";
                confirmSubMastercardAdapter$ViewHolder_ViewBinding.d = "Solitaire";
                this.p.add(confirmSubMastercardAdapter$ViewHolder_ViewBinding);
            }
            if (this.z.getFlagReservationTellerPrioritas() != null && this.z.getFlagReservationTellerPrioritas().equals("Y")) {
                ConfirmSubMastercardAdapter$ViewHolder_ViewBinding confirmSubMastercardAdapter$ViewHolder_ViewBinding2 = new ConfirmSubMastercardAdapter$ViewHolder_ViewBinding();
                confirmSubMastercardAdapter$ViewHolder_ViewBinding2.a = "002";
                confirmSubMastercardAdapter$ViewHolder_ViewBinding2.d = "Prioritas";
                this.p.add(confirmSubMastercardAdapter$ViewHolder_ViewBinding2);
            }
            if (this.z.getFlagReservationTellerReguler() != null && this.z.getFlagReservationTellerReguler().equals("Y")) {
                ConfirmSubMastercardAdapter$ViewHolder_ViewBinding confirmSubMastercardAdapter$ViewHolder_ViewBinding3 = new ConfirmSubMastercardAdapter$ViewHolder_ViewBinding();
                confirmSubMastercardAdapter$ViewHolder_ViewBinding3.a = "001";
                confirmSubMastercardAdapter$ViewHolder_ViewBinding3.d = "Reguler";
                this.p.add(confirmSubMastercardAdapter$ViewHolder_ViewBinding3);
            }
        } else {
            if (this.z.getFlagReservationCsoSolitaire() != null && this.z.getFlagReservationCsoSolitaire().equals("Y") && this.m.getMembership().equalsIgnoreCase("s")) {
                ConfirmSubMastercardAdapter$ViewHolder_ViewBinding confirmSubMastercardAdapter$ViewHolder_ViewBinding4 = new ConfirmSubMastercardAdapter$ViewHolder_ViewBinding();
                confirmSubMastercardAdapter$ViewHolder_ViewBinding4.a = "003";
                confirmSubMastercardAdapter$ViewHolder_ViewBinding4.d = "Solitaire";
                this.p.add(confirmSubMastercardAdapter$ViewHolder_ViewBinding4);
            }
            if (this.z.getFlagReservationCsoPrioritas() != null && this.z.getFlagReservationCsoPrioritas().equals("Y")) {
                ConfirmSubMastercardAdapter$ViewHolder_ViewBinding confirmSubMastercardAdapter$ViewHolder_ViewBinding5 = new ConfirmSubMastercardAdapter$ViewHolder_ViewBinding();
                confirmSubMastercardAdapter$ViewHolder_ViewBinding5.a = "002";
                confirmSubMastercardAdapter$ViewHolder_ViewBinding5.d = "Prioritas";
                this.p.add(confirmSubMastercardAdapter$ViewHolder_ViewBinding5);
            }
            if (this.z.getFlagReservationCsoReguler() != null && this.z.getFlagReservationCsoReguler().equals("Y")) {
                ConfirmSubMastercardAdapter$ViewHolder_ViewBinding confirmSubMastercardAdapter$ViewHolder_ViewBinding6 = new ConfirmSubMastercardAdapter$ViewHolder_ViewBinding();
                confirmSubMastercardAdapter$ViewHolder_ViewBinding6.a = "001";
                confirmSubMastercardAdapter$ViewHolder_ViewBinding6.d = "Reguler";
                this.p.add(confirmSubMastercardAdapter$ViewHolder_ViewBinding6);
            }
        }
        if (this.p.size() > 0) {
            if (!this.p.get(0).a.equals("001")) {
                this.llJenisRuanganWrapper.setVisibility(0);
                for (final int i = 0; i < this.p.size(); i++) {
                    View inflate = getLayoutInflater().inflate(2131493306, (ViewGroup) null);
                    final LinearLayout linearLayout = (LinearLayout) inflate.findViewById(2131297979);
                    ((TextView) inflate.findViewById(2131299615)).setText(this.p.get(i).d);
                    if (i == 0) {
                        linearLayout.setSelected(true);
                        this.s = i;
                    }
                    inflate.setOnClickListener(new View.OnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeROActivity.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            for (int i2 = 0; i2 < AvailableBookingTimeROActivity.this.lnJenisRuangan.getChildCount(); i2++) {
                                ((LinearLayout) AvailableBookingTimeROActivity.this.lnJenisRuangan.getChildAt(i2).findViewById(2131297979)).setSelected(false);
                            }
                            linearLayout.setSelected(true);
                            int i3 = AvailableBookingTimeROActivity.this.s;
                            int i4 = i;
                            if (i3 != i4) {
                                AvailableBookingTimeROActivity.this.s = i4;
                                AvailableBookingTimeROActivity.this.v();
                            }
                        }
                    });
                    this.lnJenisRuangan.addView(inflate);
                }
            }
        }
    }

    private void c(CreateQueueReservationResponse createQueueReservationResponse) {
        this.f = "SendEmail";
        this.n = createQueueReservationResponse;
        if (this.M != null) {
            this.B.c(new LoginSessionActivity_ViewBinding(this.m.getEmail(), createQueueReservationResponse.getReferenceNumber()));
            return;
        }
        RealmResults findAll = this.k.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.SETORAN_TUNAI).or().equalTo("codeTransaksi", ReservasiOnline.TARIKAN_TUNAI).or().equalTo("codeTransaksi", ReservasiOnline.KIRIMAN_UANG).or().equalTo("codeTransaksi", ReservasiOnline.KLIRING).or().equalTo("codeTransaksi", ReservasiOnline.OUTWARD_REMITTANCE).or().findAll();
        RealmResults findAll2 = this.k.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.PEMBUKAAN_REKENING).or().equalTo("codeTransaksi", ReservasiOnline.INTERNET_MOBILE_BANKING).findAll();
        if ((!findAll.isEmpty() || (findAll2.size() == 1 && this.A.size() == 1)) && !this.E.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("reservation_data", ListUtil.OneItemImmutableList.e(this.I));
            bundle.putString("type_transaksi", this.I.getTypeTransaction());
            bundle.putBoolean("from_form", this.I.isFromForm());
            bundle.putString("reff_number", createQueueReservationResponse.getReferenceNumber());
            bundle.putString("BRANCH_CODE", this.z.getBranchCode());
            bundle.putParcelable("reservasi", ListUtil.OneItemImmutableList.e(createQueueReservationResponse));
            bundle.putParcelable("data_cabang", ListUtil.OneItemImmutableList.e(this.z));
            bundle.putString("type_reservation", this.J);
            int i = this.s;
            if (i >= 0) {
                bundle.putString("jenis_ruangan", this.p.get(i).d);
            }
            Intent intent = new Intent(this, ReservasiSuccessAskNextActivity.class);
            intent.putExtra("branch", ListUtil.OneItemImmutableList.e(this.z));
            intent.putExtras(bundle);
            startActivity(intent);
            return;
        }
        this.B.c(new LoginSessionActivity_ViewBinding(this.m.getEmail(), createQueueReservationResponse.getReferenceNumber()));
    }

    private void l(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putParcelable("reservation_data", ListUtil.OneItemImmutableList.e(this.I));
        bundle.putString("type_transaksi", this.I.getTypeTransaction());
        bundle.putBoolean("from_form", this.I.isFromForm());
        bundle.putString("reff_number", this.n.getReferenceNumber());
        bundle.putString("BRANCH_CODE", this.z.getBranchCode());
        bundle.putParcelable("reservasi", ListUtil.OneItemImmutableList.e(this.n));
        bundle.putParcelable("data_cabang", ListUtil.OneItemImmutableList.e(this.z));
        bundle.putString("type_reservation", this.J);
        bundle.putString("email_success", str);
        int i = this.s;
        if (i >= 0) {
            bundle.putString("jenis_ruangan", this.p.get(i).d);
        }
        if (this.M != null) {
            Intent intent = new Intent(this, ReservasiTundaSuccessActivity.class);
            bundle.putParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.M));
            intent.putExtras(bundle);
            startActivity(intent);
            return;
        }
        RealmResults findAll = this.k.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.SETORAN_TUNAI).or().equalTo("codeTransaksi", ReservasiOnline.TARIKAN_TUNAI).findAll();
        RealmResults findAll2 = this.k.where(ReservasiOnline.class).equalTo("codeTransaksi", ReservasiOnline.PEMBUKAAN_REKENING).or().equalTo("codeTransaksi", ReservasiOnline.INTERNET_MOBILE_BANKING).findAll();
        if ((!findAll.isEmpty() || (findAll2.size() == 1 && this.A.size() == 1)) && !this.E.isEmpty()) {
            Intent intent2 = new Intent(this, ReservasiSuccessAskNextActivity.class);
            intent2.putExtras(bundle);
            startActivity(intent2);
            return;
        }
        Intent intent3 = new Intent(this, ReservasiROSuccessActivity.class);
        intent3.putExtras(bundle);
        startActivity(intent3);
    }

    private void o(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    public void v() {
        InfoKursORActivity_ViewBinding infoKursORActivity_ViewBinding = new InfoKursORActivity_ViewBinding();
        this.f = "GetAvailableBooking";
        int i = this.s;
        if (i >= 0) {
            this.H = this.p.get(i).a;
        }
        this.K = new StringBuilder();
        List<DetailTransactionResponse.TxnDataDetail> list = this.M;
        if (list == null || list.size() <= 0) {
            if (this.A != null) {
                for (int i2 = 0; i2 < this.A.size(); i2++) {
                    this.K.append(((ReservasiOnline) Objects.requireNonNull(this.A.get(i2))).getCodeTransaksi());
                    if (i2 != this.A.size() - 1) {
                        this.K.append(",");
                    }
                }
                infoKursORActivity_ViewBinding.f = String.valueOf(this.A.size());
            }
            infoKursORActivity_ViewBinding.i = this.K.toString();
        } else {
            this.K.append(this.I.getTransactionCode());
            infoKursORActivity_ViewBinding.i = this.K.toString();
            infoKursORActivity_ViewBinding.f = String.valueOf(this.K.toString().split(",").length);
        }
        infoKursORActivity_ViewBinding.e = this.m.getEmail();
        infoKursORActivity_ViewBinding.a = this.m.getImei();
        infoKursORActivity_ViewBinding.j = this.m.getSessionId();
        infoKursORActivity_ViewBinding.d = this.z.getBranchCode();
        infoKursORActivity_ViewBinding.g = this.H;
        if (this.z.getBranchType().equals("KCU")) {
            infoKursORActivity_ViewBinding.h = "001";
        } else {
            infoKursORActivity_ViewBinding.h = "002";
        }
        if (this.z.getEmergencyCloseStartDate() == null || this.z.getEmergencyCloseEndDate() == null) {
            infoKursORActivity_ViewBinding.c = "";
            infoKursORActivity_ViewBinding.b = "";
        } else {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss", Locale.US);
                Date parse = simpleDateFormat.parse(this.z.getEmergencyCloseStartDate());
                Date parse2 = simpleDateFormat.parse(this.z.getEmergencyCloseEndDate());
                simpleDateFormat.applyPattern("yyyyMMdd HH:mm");
                infoKursORActivity_ViewBinding.c = simpleDateFormat.format(parse);
                infoKursORActivity_ViewBinding.b = simpleDateFormat.format(parse2);
            } catch (ParseException e) {
                infoKursORActivity_ViewBinding.c = this.z.getEmergencyCloseStartDate();
                infoKursORActivity_ViewBinding.b = this.z.getEmergencyCloseEndDate();
            }
        }
        this.y.a(infoKursORActivity_ViewBinding);
    }

    public void y() {
        this.f = "CreateReservation";
        StringBuilder sb = new StringBuilder();
        sb.append(this.u.get(this.r).b);
        sb.append(" ");
        sb.append(this.v.get(this.t).e);
        String print = DateTimeFormat.forPattern("yyyyMMdd HH:mm:ss").print(System.currentTimeMillis());
        HapusTransaksiBerkalaActivity_ViewBinding hapusTransaksiBerkalaActivity_ViewBinding = new HapusTransaksiBerkalaActivity_ViewBinding();
        hapusTransaksiBerkalaActivity_ViewBinding.d = this.m.getEmail();
        hapusTransaksiBerkalaActivity_ViewBinding.c = this.m.getImei();
        hapusTransaksiBerkalaActivity_ViewBinding.i = this.m.getSessionId();
        hapusTransaksiBerkalaActivity_ViewBinding.e = this.z.getBranchCode();
        hapusTransaksiBerkalaActivity_ViewBinding.n = this.H;
        hapusTransaksiBerkalaActivity_ViewBinding.a = "001";
        hapusTransaksiBerkalaActivity_ViewBinding.g = sb.toString();
        hapusTransaksiBerkalaActivity_ViewBinding.j = this.F;
        if (this.z.getBranchType().equals("KCU")) {
            hapusTransaksiBerkalaActivity_ViewBinding.h = "001";
        } else {
            hapusTransaksiBerkalaActivity_ViewBinding.h = "002";
        }
        hapusTransaksiBerkalaActivity_ViewBinding.b = this.m.getName();
        hapusTransaksiBerkalaActivity_ViewBinding.l = print;
        hapusTransaksiBerkalaActivity_ViewBinding.m = this.K.toString();
        hapusTransaksiBerkalaActivity_ViewBinding.f = String.valueOf(this.A.size());
        this.w.a(hapusTransaksiBerkalaActivity_ViewBinding);
    }

    @Override // com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write
    public final void a(CreateQueueReservationResponse createQueueReservationResponse) {
        c(createQueueReservationResponse);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        l("");
    }

    @Override // com.bca.smartbranch.presenter.RescheduleReservationV2Presenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter.write, com.bca.smartbranch.presenter.SaveToEformPresenter.write, com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        if (this.f.equals("GetAvailableBooking")) {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("desc", str);
            ErrorGetAvailableBookingTimeDialog errorGetAvailableBookingTimeDialog = new ErrorGetAvailableBookingTimeDialog();
            errorGetAvailableBookingTimeDialog.setArguments(bundle);
            errorGetAvailableBookingTimeDialog.show(l(), "ErrorGetAvailableBookingTimeDialog");
        } else if (this.f.equals("CreateReservation")) {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.lnActivityMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeROActivity.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AvailableBookingTimeROActivity.this.y();
                }
            }).g();
        } else if (this.f.equals("SaveToEform")) {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.lnActivityMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeROActivity.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AvailableBookingTimeROActivity.this.A();
                }
            }).g();
        } else if (this.f.equals("SendEmail")) {
            l("");
        }
    }

    @Override // com.bca.smartbranch.presenter.RescheduleReservationV2Presenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter.write, com.bca.smartbranch.presenter.SaveToEformPresenter.write, com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write
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

    @Override // com.bca.smartbranch.presenter.RescheduleReservationV2Presenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter.write, com.bca.smartbranch.presenter.SaveToEformPresenter.write, com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write
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

    @Override // com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write
    public final void c(String str) {
        o(str);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        l("");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        Bundle extras = getIntent().getExtras();
        this.L = (ViewAnimator) findViewById(2131299749);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbar.setText(this.txtToolbar);
        this.w = new CreateQueueReservationPresenter();
        this.y = new GetAvailableBookingV2Presenter();
        this.D = new RescheduleReservationV2Presenter();
        this.C = new SaveToEformPresenter();
        this.B = new SendEmailTransactionSuccessPresenter();
        this.w.b = this;
        this.y.b = this;
        this.D.a = this;
        this.C.a = this;
        this.B.b = this;
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.x = getHBPresenter;
        getHBPresenter.e = this;
        this.I = (Reservation) ListUtil.OneItemImmutableList.a(extras.getParcelable("reservation_data"));
        this.E = extras.getString("estimation", "");
        if (extras.getParcelable("txn_data_tunda") != null) {
            this.M = (List) ListUtil.OneItemImmutableList.a(extras.getParcelable("txn_data_tunda"));
        }
        Location location = new Location("");
        this.q = location;
        location.setLatitude(extras.getDouble("LAT"));
        this.q.setLongitude(extras.getDouble("LONG"));
        this.J = this.I.getTypeReservation();
        this.z = (GetBranchROResponse.DetailBranch) ListUtil.OneItemImmutableList.a(extras.getParcelable("branch"));
        TextView textView = this.tvBranch;
        StringBuilder sb = new StringBuilder();
        sb.append(this.z.getBranchType());
        sb.append(" ");
        sb.append(this.z.getBranchName());
        sb.append(", ");
        sb.append(this.z.getAddress());
        sb.append(", ");
        sb.append(this.z.getCity());
        sb.append(", ");
        sb.append(this.z.getProvince());
        textView.setText(sb.toString());
        if (!this.E.isEmpty()) {
            this.k.executeTransaction(new Realm.Transaction() { // from class: o.BN6PembayaranActivity_ViewBinding
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    AvailableBookingTimeROActivity.this.t();
                }
            });
        } else {
            this.llEstimasi.setVisibility(8);
        }
        if (this.m.getMembership().equalsIgnoreCase("p") || this.m.getMembership().equalsIgnoreCase("s")) {
            C();
        }
        v();
    }

    @Override // com.bca.smartbranch.presenter.RescheduleReservationV2Presenter.IconCompatParcelizer
    public final void d(CreateQueueReservationResponse createQueueReservationResponse) {
        c(createQueueReservationResponse);
    }

    @Override // com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter.write
    public final void d(OutwardRemittanceMenuActivity_ViewBinding outwardRemittanceMenuActivity_ViewBinding) {
        this.L.setDisplayedChild(2);
        this.u = outwardRemittanceMenuActivity_ViewBinding.c;
        this.lnReservationDate.removeAllViews();
        boolean z = true;
        boolean z2 = true;
        final int i = 0;
        for (OutwardRemittanceMenuActivity_ViewBinding.IconCompatParcelizer iconCompatParcelizer : this.u) {
            View inflate = getLayoutInflater().inflate(2131493349, (ViewGroup) null);
            final LinearLayout linearLayout = (LinearLayout) inflate.findViewById(2131297979);
            TextView textView = (TextView) inflate.findViewById(2131298915);
            TextView textView2 = (TextView) inflate.findViewById(2131298916);
            TextView textView3 = (TextView) inflate.findViewById(2131299415);
            boolean z3 = true;
            for (OutwardRemittanceMenuActivity_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer : iconCompatParcelizer.e) {
                if (Integer.parseInt(remoteActionCompatParcelizer.c.isEmpty() ? "0" : remoteActionCompatParcelizer.c) > 0 && "1".equals(remoteActionCompatParcelizer.a)) {
                    z3 = false;
                }
            }
            if (iconCompatParcelizer.a.equals("N")) {
                z = false;
            }
            if (iconCompatParcelizer.a.equals("Y") || z3) {
                inflate.setEnabled(false);
                linearLayout.setEnabled(false);
                textView.setAlpha(0.3f);
                textView2.setAlpha(0.2f);
                textView3.setAlpha(0.4f);
            } else {
                inflate.setEnabled(true);
                linearLayout.setEnabled(true);
                z2 = false;
            }
            textView.setText(getAnnualFeeBasicAmount.d(iconCompatParcelizer.b));
            textView2.setText(DateTimeFormat.forPattern("dd").print(DateTimeFormat.forPattern("yyyyMMdd").parseDateTime(iconCompatParcelizer.b)));
            textView3.setText(getAnnualFeeBasicAmount.c(iconCompatParcelizer.b));
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeROActivity.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    for (int i2 = 0; i2 < AvailableBookingTimeROActivity.this.lnReservationDate.getChildCount(); i2++) {
                        ((LinearLayout) AvailableBookingTimeROActivity.this.lnReservationDate.getChildAt(i2).findViewById(2131297979)).setSelected(false);
                    }
                    if (linearLayout.isEnabled()) {
                        linearLayout.setSelected(true);
                    }
                    AvailableBookingTimeROActivity.this.r = i;
                    documentProvider.b().d(new onChooseJabatan(i));
                }
            });
            this.lnReservationDate.addView(inflate);
            i++;
        }
        if (!z) {
            if (z2) {
                this.tvErrorFullBook.setVisibility(0);
                this.tvReservationTimeInfo.setVisibility(8);
                this.btnProses.setEnabled(false);
            } else {
                this.tvErrorFullBook.setVisibility(8);
                this.tvReservationTimeInfo.setVisibility(0);
                this.btnProses.setEnabled(true);
            }
            for (int i2 = 0; i2 < this.lnReservationDate.getChildCount(); i2++) {
                if (z2) {
                    if ("N".equals(this.u.get(i2).a)) {
                        this.lnReservationDate.getChildAt(i2).performClick();
                        return;
                    }
                } else if ("N".equals(this.u.get(i2).a) && this.lnReservationDate.getChildAt(i2).isEnabled()) {
                    this.lnReservationDate.getChildAt(i2).performClick();
                    return;
                }
            }
            return;
        }
        this.tvErrorClosed.setVisibility(0);
        this.llJenisRuanganWrapper.setVisibility(8);
        this.L.setVisibility(8);
    }

    @Override // com.bca.smartbranch.presenter.SaveToEformPresenter.write
    public final void d(onChooseBankPenerbit onchoosebankpenerbit) {
        this.F = onchoosebankpenerbit.b;
        y();
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        l(str);
    }

    @Override // com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write
    public final void f(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.lnActivityMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.RescheduleReservationV2Presenter.IconCompatParcelizer
    public final void g(String str) {
        o(str);
    }

    @Override // com.bca.smartbranch.presenter.RescheduleReservationV2Presenter.IconCompatParcelizer, com.bca.smartbranch.presenter.SaveToEformPresenter.write, com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        z();
    }

    @Override // com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter.write
    public final void h(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetAvailableBookingTimeDialog errorGetAvailableBookingTimeDialog = new ErrorGetAvailableBookingTimeDialog();
        errorGetAvailableBookingTimeDialog.setArguments(bundle);
        errorGetAvailableBookingTimeDialog.show(l(), "ErrorGetAvailableBookingTimeDialog");
    }

    @Override // com.bca.smartbranch.presenter.RescheduleReservationV2Presenter.IconCompatParcelizer
    public final void i(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.lnActivityMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter.write
    public final void j(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetAvailableBookingTimeDialog errorGetAvailableBookingTimeDialog = new ErrorGetAvailableBookingTimeDialog();
        errorGetAvailableBookingTimeDialog.setArguments(bundle);
        errorGetAvailableBookingTimeDialog.show(l(), "ErrorGetAvailableBookingTimeDialog");
    }

    @Override // com.bca.smartbranch.presenter.SaveToEformPresenter.write
    public final void k(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.lnActivityMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.SaveToEformPresenter.write
    public final void n(String str) {
        o(str);
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        onBackPressed();
        k();
        documentProvider.b().d(new TarikanTransaksiActivity_ViewBinding());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseAvailableDate(onChooseJabatan onchoosejabatan) {
        this.v = this.u.get(onchoosejabatan.e).e;
        this.t = -1;
        this.lnReservationTime.removeAllViews();
        Iterator<OutwardRemittanceMenuActivity_ViewBinding.RemoteActionCompatParcelizer> it = this.v.iterator();
        final int i = 0;
        while (true) {
            String str = "0";
            if (it.hasNext()) {
                final OutwardRemittanceMenuActivity_ViewBinding.RemoteActionCompatParcelizer next = it.next();
                View inflate = getLayoutInflater().inflate(2131493350, (ViewGroup) null);
                final LinearLayout linearLayout = (LinearLayout) inflate.findViewById(2131297979);
                TextView textView = (TextView) inflate.findViewById(2131299606);
                final TextView textView2 = (TextView) inflate.findViewById(2131299573);
                if (!next.c.isEmpty()) {
                    str = next.c;
                }
                if (Integer.parseInt(str) <= 0 || !"1".equals(next.a)) {
                    inflate.setEnabled(false);
                    linearLayout.setEnabled(false);
                    textView.setAlpha(0.4f);
                } else {
                    inflate.setEnabled(true);
                    linearLayout.setEnabled(true);
                }
                textView.setText(next.e.replace(":", "."));
                inflate.setOnClickListener(new View.OnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeROActivity.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        for (int i2 = 0; i2 < AvailableBookingTimeROActivity.this.lnReservationTime.getChildCount(); i2++) {
                            View childAt = AvailableBookingTimeROActivity.this.lnReservationTime.getChildAt(i2);
                            ((LinearLayout) childAt.findViewById(2131297979)).setSelected(false);
                            ((TextView) childAt.findViewById(2131299573)).setVisibility(8);
                        }
                        linearLayout.setSelected(true);
                        AvailableBookingTimeROActivity.this.t = i;
                        if (Integer.parseInt(next.c.isEmpty() ? "0" : next.c) == 1) {
                            textView2.setVisibility(0);
                        }
                    }
                });
                this.lnReservationTime.addView(inflate);
                i++;
            }
        }
        for (int i2 = 0; i2 < this.lnReservationTime.getChildCount(); i2++) {
            if (Integer.parseInt(this.v.get(i2).c.isEmpty() ? "0" : this.v.get(i2).c) > 0 && "1".equals(this.v.get(i2).a)) {
                this.lnReservationTime.getChildAt(i2).performClick();
                return;
            }
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseCabangEvent(onChooseKecamatan onchoosekecamatan) {
        TextView textView = this.tvBranch;
        StringBuilder sb = new StringBuilder();
        sb.append(this.z.getBranchType());
        sb.append(" ");
        sb.append(this.z.getBranchName());
        sb.append(", ");
        sb.append(this.z.getAddress());
        sb.append(", ");
        sb.append(this.z.getCity());
        sb.append(", ");
        sb.append(this.z.getProvince());
        textView.setText(sb.toString());
    }

    @OnClick({2131299697})
    public void onClickUbahCabang(View view) {
        finish();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        CreateQueueReservationPresenter createQueueReservationPresenter = this.w;
        Call<OpenAccountSuccessActivity<CreateQueueReservationResponse>> call = createQueueReservationPresenter.a;
        if (call != null) {
            call.cancel();
        }
        createQueueReservationPresenter.b = null;
        GetAvailableBookingV2Presenter getAvailableBookingV2Presenter = this.y;
        Call<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding>> call2 = getAvailableBookingV2Presenter.e;
        if (call2 != null) {
            call2.cancel();
        }
        getAvailableBookingV2Presenter.b = null;
        GetHBPresenter getHBPresenter = this.x;
        Call<OpenAccountSuccessActivity<Object>> call3 = getHBPresenter.b;
        if (call3 != null) {
            call3.cancel();
        }
        getHBPresenter.e = null;
        SaveToEformPresenter saveToEformPresenter = this.C;
        Call<OpenAccountSuccessActivity<onChooseBankPenerbit>> call4 = saveToEformPresenter.c;
        if (call4 != null) {
            call4.cancel();
        }
        saveToEformPresenter.a = null;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.B;
        Call<OpenAccountSuccessActivity<Object>> call5 = sendEmailTransactionSuccessPresenter.a;
        if (call5 != null) {
            call5.cancel();
        }
        sendEmailTransactionSuccessPresenter.b = null;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onGetBranchEvent(clickView clickview) {
        v();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "AvailableBookingTimeROActivity";
        this.j = "AvailableBookingTimeROActivity";
    }

    @OnClick({2131296440})
    public void proses(View view) {
        this.tvError.setVisibility(8);
        String string = this.r < 0 ? getString(2131820985) : this.t < 0 ? getString(2131820986) : "";
        if (!string.isEmpty()) {
            this.tvError.setText(string);
            this.tvError.setVisibility(0);
        } else if (this.I.getTypeReservation().equals("RESCHEDULE_RESERVATION")) {
            this.f = "CreateReservation";
            StringBuilder sb = new StringBuilder();
            sb.append(this.u.get(this.r).b);
            sb.append(" ");
            sb.append(this.v.get(this.t).e);
            String print = DateTimeFormat.forPattern("yyyyMMdd HH:mm:ss").print(System.currentTimeMillis());
            onAddFingerPrintSuccess onaddfingerprintsuccess = new onAddFingerPrintSuccess();
            onaddfingerprintsuccess.c = this.m.getEmail();
            onaddfingerprintsuccess.b = this.m.getImei();
            onaddfingerprintsuccess.g = this.m.getSessionId();
            onaddfingerprintsuccess.d = this.z.getBranchCode();
            onaddfingerprintsuccess.l = this.H;
            onaddfingerprintsuccess.e = "001";
            onaddfingerprintsuccess.h = sb.toString();
            if (this.z.getBranchType().equals("KCU")) {
                onaddfingerprintsuccess.i = "001";
            } else {
                onaddfingerprintsuccess.i = "002";
            }
            onaddfingerprintsuccess.a = this.m.getName();
            onaddfingerprintsuccess.m = print;
            onaddfingerprintsuccess.n = this.K.toString();
            List<DetailTransactionResponse.TxnDataDetail> list = this.M;
            if (list == null || list.size() <= 0) {
                onaddfingerprintsuccess.f = String.valueOf(this.A.size());
                onaddfingerprintsuccess.j = this.F;
            } else {
                onaddfingerprintsuccess.f = String.valueOf(this.K.toString().split(",").length);
                onaddfingerprintsuccess.j = this.I.getNoReff();
            }
            this.D.d(onaddfingerprintsuccess);
        } else {
            GetHBPresenter getHBPresenter = this.x;
            Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
            getHBPresenter.b = e;
            e.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01c9: INVOKE  
                  (r0v15 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                  (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x01c6: CONSTRUCTOR  (r1v5 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v11 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.AvailableBookingTimeROActivity.proses(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/AvailableBookingTimeROActivity.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:155)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:132)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
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
            // Method dump skipped, instructions count: 467
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.AvailableBookingTimeROActivity.proses(android.view.View):void");
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final int q() {
            return 2131493004;
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final Activity r() {
            return this;
        }

        @OnClick({2131296446})
        public void retry(View view) {
            v();
        }

        public final /* synthetic */ void t() {
            RealmResults<ReservasiOnline> findAll = this.k.where(ReservasiOnline.class).findAll();
            this.A = findAll;
            if (findAll != null && findAll.size() > 0) {
                this.G = String.valueOf(this.A.size());
                TextView textView = this.tvTotalTransaksi;
                StringBuilder sb = new StringBuilder();
                sb.append(this.G);
                sb.append(" Transaksi");
                textView.setText(sb.toString());
                TextView textView2 = this.tvEstimasiWaktu;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.E);
                sb2.append(" Menit");
                textView2.setText(sb2.toString());
            }
        }

        @Override // com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter.write
        public final void u() {
            this.L.setDisplayedChild(0);
        }
    }
