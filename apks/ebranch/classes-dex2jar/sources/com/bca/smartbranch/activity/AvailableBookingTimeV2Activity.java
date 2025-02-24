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
import com.bca.smartbranch.activity.AvailableBookingTimeV2Activity;
import com.bca.smartbranch.data.api.response.CreateQueueReservationResponse;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import com.bca.smartbranch.data.api.response.GetBranchReservationResponse;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.ErrorGetAvailableBookingTimeDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.CreateQueueReservationPresenter;
import com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter;
import com.bca.smartbranch.presenter.GetHBPresenter;
import com.bca.smartbranch.presenter.RescheduleReservationV2Presenter;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import com.bca.smartbranch.presenter.TxnTellerPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.Realm;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
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
import o.onChooseJabatan;
import o.onChooseKecamatan;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import org.joda.time.format.DateTimeFormat;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/AvailableBookingTimeV2Activity.class */
public class AvailableBookingTimeV2Activity extends BaseActivityPostLogin implements CreateQueueReservationPresenter.write, RescheduleReservationV2Presenter.IconCompatParcelizer, GetAvailableBookingV2Presenter.write, GetHBPresenter.write, SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer, TxnTellerPresenter.IconCompatParcelizer {
    private GetBranchROResponse.DetailBranch A;
    private SendEmailTransactionSuccessPresenter B;
    private List<GetBranchReservationResponse.ReservationBranch> C;
    private RescheduleReservationV2Presenter D;
    private Reservation E;
    private TxnTellerPresenter F;
    private String G;
    private String I;
    private TxnTellerResponse.TxnDataOutput J;
    private ViewAnimator K;
    private String L;
    private String M;
    private List<DetailTransactionResponse.TxnDataDetail> N;
    @BindView(2131296440)
    Button btnProses;
    public ListFormTeller f;
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
    @BindString(2131822092)
    String retry;
    private CreateQueueReservationResponse s;
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
    private GetAvailableBookingV2Presenter u;
    private Location v;
    private CreateQueueReservationPresenter y;
    private GetHBPresenter z;
    private String n = null;
    private List<OutwardRemittanceMenuActivity_ViewBinding.IconCompatParcelizer> x = new ArrayList();
    private List<OutwardRemittanceMenuActivity_ViewBinding.RemoteActionCompatParcelizer> w = new ArrayList();
    private int q = -1;
    private int r = -1;
    private int p = -1;
    private List<ConfirmSubMastercardAdapter$ViewHolder_ViewBinding> t = new ArrayList();
    private String H = "001";

    private void D() {
        this.lnJenisRuangan.removeAllViews();
        this.t.clear();
        if (this.E.getTypeTransaction().equalsIgnoreCase("Transaksi Teller")) {
            if (this.A.getFlagReservationTellerSolitaire() != null && this.A.getFlagReservationTellerSolitaire().equals("Y") && this.m.getMembership().equalsIgnoreCase("s")) {
                ConfirmSubMastercardAdapter$ViewHolder_ViewBinding confirmSubMastercardAdapter$ViewHolder_ViewBinding = new ConfirmSubMastercardAdapter$ViewHolder_ViewBinding();
                confirmSubMastercardAdapter$ViewHolder_ViewBinding.a = "003";
                confirmSubMastercardAdapter$ViewHolder_ViewBinding.d = "Solitaire";
                this.t.add(confirmSubMastercardAdapter$ViewHolder_ViewBinding);
            }
            if (this.A.getFlagReservationTellerPrioritas() != null && this.A.getFlagReservationTellerPrioritas().equals("Y")) {
                ConfirmSubMastercardAdapter$ViewHolder_ViewBinding confirmSubMastercardAdapter$ViewHolder_ViewBinding2 = new ConfirmSubMastercardAdapter$ViewHolder_ViewBinding();
                confirmSubMastercardAdapter$ViewHolder_ViewBinding2.a = "002";
                confirmSubMastercardAdapter$ViewHolder_ViewBinding2.d = "Prioritas";
                this.t.add(confirmSubMastercardAdapter$ViewHolder_ViewBinding2);
            }
            if (this.A.getFlagReservationTellerReguler() != null && this.A.getFlagReservationTellerReguler().equals("Y")) {
                ConfirmSubMastercardAdapter$ViewHolder_ViewBinding confirmSubMastercardAdapter$ViewHolder_ViewBinding3 = new ConfirmSubMastercardAdapter$ViewHolder_ViewBinding();
                confirmSubMastercardAdapter$ViewHolder_ViewBinding3.a = "001";
                confirmSubMastercardAdapter$ViewHolder_ViewBinding3.d = "Reguler";
                this.t.add(confirmSubMastercardAdapter$ViewHolder_ViewBinding3);
            }
        } else {
            if (this.A.getFlagReservationCsoSolitaire() != null && this.A.getFlagReservationCsoSolitaire().equals("Y") && this.m.getMembership().equalsIgnoreCase("s")) {
                ConfirmSubMastercardAdapter$ViewHolder_ViewBinding confirmSubMastercardAdapter$ViewHolder_ViewBinding4 = new ConfirmSubMastercardAdapter$ViewHolder_ViewBinding();
                confirmSubMastercardAdapter$ViewHolder_ViewBinding4.a = "003";
                confirmSubMastercardAdapter$ViewHolder_ViewBinding4.d = "Solitaire";
                this.t.add(confirmSubMastercardAdapter$ViewHolder_ViewBinding4);
            }
            if (this.A.getFlagReservationCsoPrioritas() != null && this.A.getFlagReservationCsoPrioritas().equals("Y")) {
                ConfirmSubMastercardAdapter$ViewHolder_ViewBinding confirmSubMastercardAdapter$ViewHolder_ViewBinding5 = new ConfirmSubMastercardAdapter$ViewHolder_ViewBinding();
                confirmSubMastercardAdapter$ViewHolder_ViewBinding5.a = "002";
                confirmSubMastercardAdapter$ViewHolder_ViewBinding5.d = "Prioritas";
                this.t.add(confirmSubMastercardAdapter$ViewHolder_ViewBinding5);
            }
            if (this.A.getFlagReservationCsoReguler() != null && this.A.getFlagReservationCsoReguler().equals("Y")) {
                ConfirmSubMastercardAdapter$ViewHolder_ViewBinding confirmSubMastercardAdapter$ViewHolder_ViewBinding6 = new ConfirmSubMastercardAdapter$ViewHolder_ViewBinding();
                confirmSubMastercardAdapter$ViewHolder_ViewBinding6.a = "001";
                confirmSubMastercardAdapter$ViewHolder_ViewBinding6.d = "Reguler";
                this.t.add(confirmSubMastercardAdapter$ViewHolder_ViewBinding6);
            }
        }
        if (this.t.size() > 0) {
            if (!this.t.get(0).a.equals("001")) {
                this.llJenisRuanganWrapper.setVisibility(0);
                for (final int i = 0; i < this.t.size(); i++) {
                    View inflate = getLayoutInflater().inflate(2131493306, (ViewGroup) null);
                    final LinearLayout linearLayout = (LinearLayout) inflate.findViewById(2131297979);
                    ((TextView) inflate.findViewById(2131299615)).setText(this.t.get(i).d);
                    if (i == 0) {
                        linearLayout.setSelected(true);
                        this.q = i;
                    }
                    inflate.setOnClickListener(new View.OnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeV2Activity.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            for (int i2 = 0; i2 < AvailableBookingTimeV2Activity.this.lnJenisRuangan.getChildCount(); i2++) {
                                ((LinearLayout) AvailableBookingTimeV2Activity.this.lnJenisRuangan.getChildAt(i2).findViewById(2131297979)).setSelected(false);
                            }
                            linearLayout.setSelected(true);
                            int i3 = AvailableBookingTimeV2Activity.this.q;
                            int i4 = i;
                            if (i3 != i4) {
                                AvailableBookingTimeV2Activity.this.q = i4;
                                AvailableBookingTimeV2Activity.this.y();
                            }
                        }
                    });
                    this.lnJenisRuangan.addView(inflate);
                }
            }
        }
    }

    private void b(CreateQueueReservationResponse createQueueReservationResponse) {
        this.n = "SendEmail";
        this.s = createQueueReservationResponse;
        this.B.c(new LoginSessionActivity_ViewBinding(this.m.getEmail(), this.I));
    }

    private void k(String str) {
        Intent intent;
        x();
        Bundle bundle = new Bundle();
        bundle.putString("type_transaksi", this.E.getTypeTransaction());
        bundle.putBoolean("from_form", this.E.isFromForm());
        bundle.putParcelable("reservasi", ListUtil.OneItemImmutableList.e(this.s));
        bundle.putString("email_success", str);
        bundle.putString("type_reservation", this.M);
        bundle.putParcelable("data_cabang", ListUtil.OneItemImmutableList.e(this.A));
        int i = this.q;
        if (i >= 0) {
            bundle.putString("jenis_ruangan", this.t.get(i).d);
        }
        if (this.J != null) {
            TxnTellerResponse txnTellerResponse = new TxnTellerResponse();
            txnTellerResponse.setTxnDataOutput(this.J);
            bundle.putParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(txnTellerResponse));
            bundle.putString("title", getString(2131822033));
            bundle.putBoolean("is_single_process", true);
            intent = new Intent(this, ReservasiTellerSuccessActivity.class);
        } else {
            List<DetailTransactionResponse.TxnDataDetail> list = this.N;
            if (list != null) {
                bundle.putParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(list));
                intent = new Intent(this, ReservasiTundaSuccessActivity.class);
            } else {
                intent = new Intent(this, ReservasiSuccessActivity.class);
            }
        }
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void m(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    public void t() {
        this.n = "CreateReservation";
        StringBuilder sb = new StringBuilder();
        sb.append(this.x.get(this.r).b);
        sb.append(" ");
        sb.append(this.w.get(this.p).e);
        String print = DateTimeFormat.forPattern("yyyyMMdd HH:mm:ss").print(System.currentTimeMillis());
        HapusTransaksiBerkalaActivity_ViewBinding hapusTransaksiBerkalaActivity_ViewBinding = new HapusTransaksiBerkalaActivity_ViewBinding();
        hapusTransaksiBerkalaActivity_ViewBinding.d = this.m.getEmail();
        hapusTransaksiBerkalaActivity_ViewBinding.c = this.m.getImei();
        hapusTransaksiBerkalaActivity_ViewBinding.i = this.m.getSessionId();
        hapusTransaksiBerkalaActivity_ViewBinding.e = this.A.getBranchCode();
        hapusTransaksiBerkalaActivity_ViewBinding.n = this.H;
        hapusTransaksiBerkalaActivity_ViewBinding.a = "001";
        hapusTransaksiBerkalaActivity_ViewBinding.g = sb.toString();
        hapusTransaksiBerkalaActivity_ViewBinding.j = this.I;
        if (this.A.getBranchType().equals("KCU")) {
            hapusTransaksiBerkalaActivity_ViewBinding.h = "001";
        } else {
            hapusTransaksiBerkalaActivity_ViewBinding.h = "002";
        }
        hapusTransaksiBerkalaActivity_ViewBinding.b = this.m.getName();
        hapusTransaksiBerkalaActivity_ViewBinding.l = print;
        hapusTransaksiBerkalaActivity_ViewBinding.m = this.G;
        hapusTransaksiBerkalaActivity_ViewBinding.f = String.valueOf(this.G.split(",").length);
        this.y.a(hapusTransaksiBerkalaActivity_ViewBinding);
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09e4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0bae  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0bd3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0be9  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0d1c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0d26  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0d3c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0d47  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0d5d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0d68  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0d78  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0d82  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0e5c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0e81  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0eb5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0314  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void v() {
        /*
        // Method dump skipped, instructions count: 4689
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.AvailableBookingTimeV2Activity.v():void");
    }

    public void y() {
        this.n = "GetAvailableBooking";
        int i = this.q;
        if (i >= 0) {
            this.H = this.t.get(i).a;
        }
        InfoKursORActivity_ViewBinding infoKursORActivity_ViewBinding = new InfoKursORActivity_ViewBinding();
        infoKursORActivity_ViewBinding.e = this.m.getEmail();
        infoKursORActivity_ViewBinding.a = this.m.getImei();
        infoKursORActivity_ViewBinding.j = this.m.getSessionId();
        infoKursORActivity_ViewBinding.d = this.A.getBranchCode();
        infoKursORActivity_ViewBinding.g = this.H;
        if (this.A.getBranchType().equals("KCU")) {
            infoKursORActivity_ViewBinding.h = "001";
        } else {
            infoKursORActivity_ViewBinding.h = "002";
        }
        infoKursORActivity_ViewBinding.i = this.G;
        infoKursORActivity_ViewBinding.f = String.valueOf(this.G.split(",").length);
        if (this.A.getEmergencyCloseStartDate() == null || this.A.getEmergencyCloseEndDate() == null) {
            infoKursORActivity_ViewBinding.c = "";
            infoKursORActivity_ViewBinding.b = "";
        } else {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss", Locale.US);
                Date parse = simpleDateFormat.parse(this.A.getEmergencyCloseStartDate());
                Date parse2 = simpleDateFormat.parse(this.A.getEmergencyCloseEndDate());
                simpleDateFormat.applyPattern("yyyyMMdd HH:mm");
                infoKursORActivity_ViewBinding.c = simpleDateFormat.format(parse);
                infoKursORActivity_ViewBinding.b = simpleDateFormat.format(parse2);
            } catch (ParseException e) {
                infoKursORActivity_ViewBinding.c = this.A.getEmergencyCloseStartDate();
                infoKursORActivity_ViewBinding.b = this.A.getEmergencyCloseEndDate();
            }
        }
        this.u.a(infoKursORActivity_ViewBinding);
    }

    @Override // com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write
    public final void a(CreateQueueReservationResponse createQueueReservationResponse) {
        b(createQueueReservationResponse);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        k("");
    }

    @Override // com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        if (this.n.equals("GetAvailableBooking")) {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("desc", str);
            ErrorGetAvailableBookingTimeDialog errorGetAvailableBookingTimeDialog = new ErrorGetAvailableBookingTimeDialog();
            errorGetAvailableBookingTimeDialog.setArguments(bundle);
            errorGetAvailableBookingTimeDialog.show(l(), "ErrorGetAvailableBookingTimeDialog");
        } else if (this.n.equals("CreateReservation")) {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.lnActivityMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeV2Activity.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AvailableBookingTimeV2Activity.this.t();
                }
            }).g();
        } else if (this.n.equals("SendEmail")) {
            k("");
        }
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void b(TxnTellerResponse txnTellerResponse) {
    }

    @Override // com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write
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

    @Override // com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write
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

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void c(TxnTellerResponse txnTellerResponse) {
        TxnTellerResponse.TxnDataOutput txnDataOutput = txnTellerResponse.getTxnDataOutput();
        this.J = txnDataOutput;
        this.I = txnDataOutput.getNoReff();
        t();
    }

    @Override // com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write
    public final void c(String str) {
        m(str);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        k("");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        Bundle extras = getIntent().getExtras();
        this.K = (ViewAnimator) findViewById(2131299749);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbar.setText(this.txtToolbar);
        this.y = new CreateQueueReservationPresenter();
        this.u = new GetAvailableBookingV2Presenter();
        this.D = new RescheduleReservationV2Presenter();
        this.B = new SendEmailTransactionSuccessPresenter();
        this.F = new TxnTellerPresenter();
        this.y.b = this;
        this.u.b = this;
        this.D.a = this;
        this.B.b = this;
        this.F.d = this;
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.z = getHBPresenter;
        getHBPresenter.e = this;
        this.E = (Reservation) ListUtil.OneItemImmutableList.a(extras.getParcelable("reservation_data"));
        this.C = (List) ListUtil.OneItemImmutableList.a(extras.getParcelable("reservation_list"));
        Location location = new Location("");
        this.v = location;
        location.setLatitude(extras.getDouble("LAT"));
        this.v.setLongitude(extras.getDouble("LONG"));
        this.L = this.E.getTypeTransaction();
        this.I = this.E.getNoReff();
        this.M = this.E.getTypeReservation();
        if (this.E.getTransactionCode() != null) {
            this.G = this.E.getTransactionCode();
        }
        if (this.I.isEmpty()) {
            this.k.executeTransaction(new Realm.Transaction() { // from class: o.showDetailPembayaran
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    AvailableBookingTimeV2Activity.this.f = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
                }
            });
        }
        this.A = (GetBranchROResponse.DetailBranch) ListUtil.OneItemImmutableList.a(extras.getParcelable("branch"));
        if (this.E.getTypeTransaction().equals("Transaksi Teller") && extras.getParcelable("txn_data") != null) {
            this.J = (TxnTellerResponse.TxnDataOutput) ListUtil.OneItemImmutableList.a(extras.getParcelable("txn_data"));
        }
        if (this.E.getTypeTransaction().equals("Transaksi Teller") && extras.getParcelable("txn_data_tunda") != null) {
            this.N = (List) ListUtil.OneItemImmutableList.a(extras.getParcelable("txn_data_tunda"));
        }
        TextView textView = this.tvBranch;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A.getBranchType());
        sb.append(" ");
        sb.append(this.A.getBranchName());
        sb.append(", ");
        sb.append(this.A.getAddress());
        sb.append(", ");
        sb.append(this.A.getCity());
        sb.append(", ");
        sb.append(this.A.getProvince());
        textView.setText(sb.toString());
        this.llEstimasi.setVisibility(8);
        if (this.m.getMembership().equalsIgnoreCase("p") || this.m.getMembership().equalsIgnoreCase("s")) {
            D();
        }
        y();
    }

    @Override // com.bca.smartbranch.presenter.RescheduleReservationV2Presenter.IconCompatParcelizer
    public final void d(CreateQueueReservationResponse createQueueReservationResponse) {
        b(createQueueReservationResponse);
    }

    @Override // com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter.write
    public final void d(OutwardRemittanceMenuActivity_ViewBinding outwardRemittanceMenuActivity_ViewBinding) {
        this.K.setDisplayedChild(2);
        this.x = outwardRemittanceMenuActivity_ViewBinding.c;
        this.lnReservationDate.removeAllViews();
        boolean z = true;
        boolean z2 = true;
        final int i = 0;
        for (OutwardRemittanceMenuActivity_ViewBinding.IconCompatParcelizer iconCompatParcelizer : this.x) {
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
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeV2Activity.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    for (int i2 = 0; i2 < AvailableBookingTimeV2Activity.this.lnReservationDate.getChildCount(); i2++) {
                        ((LinearLayout) AvailableBookingTimeV2Activity.this.lnReservationDate.getChildAt(i2).findViewById(2131297979)).setSelected(false);
                    }
                    if (linearLayout.isEnabled()) {
                        linearLayout.setSelected(true);
                    }
                    AvailableBookingTimeV2Activity.this.r = i;
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
                    if ("N".equals(this.x.get(i2).a)) {
                        this.lnReservationDate.getChildAt(i2).performClick();
                        return;
                    }
                } else if ("N".equals(this.x.get(i2).a) && this.lnReservationDate.getChildAt(i2).isEnabled()) {
                    this.lnReservationDate.getChildAt(i2).performClick();
                    return;
                }
            }
            return;
        }
        this.tvErrorClosed.setVisibility(0);
        this.llJenisRuanganWrapper.setVisibility(8);
        this.K.setVisibility(8);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        k(str);
    }

    @Override // com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write
    public final void f(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.lnActivityMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.RescheduleReservationV2Presenter.IconCompatParcelizer
    public final void g(String str) {
        m(str);
    }

    @Override // com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
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
        m(str);
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

    @Override // com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter.write
    public final void j(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetAvailableBookingTimeDialog errorGetAvailableBookingTimeDialog = new ErrorGetAvailableBookingTimeDialog();
        errorGetAvailableBookingTimeDialog.setArguments(bundle);
        errorGetAvailableBookingTimeDialog.show(l(), "ErrorGetAvailableBookingTimeDialog");
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void l(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.lnActivityMain, str, -1).g();
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        onBackPressed();
        k();
        documentProvider.b().d(new TarikanTransaksiActivity_ViewBinding());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseAvailableDate(onChooseJabatan onchoosejabatan) {
        this.w = this.x.get(onchoosejabatan.e).e;
        this.p = -1;
        this.lnReservationTime.removeAllViews();
        Iterator<OutwardRemittanceMenuActivity_ViewBinding.RemoteActionCompatParcelizer> it = this.w.iterator();
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
                inflate.setOnClickListener(new View.OnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeV2Activity.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        for (int i2 = 0; i2 < AvailableBookingTimeV2Activity.this.lnReservationTime.getChildCount(); i2++) {
                            View childAt = AvailableBookingTimeV2Activity.this.lnReservationTime.getChildAt(i2);
                            ((LinearLayout) childAt.findViewById(2131297979)).setSelected(false);
                            ((TextView) childAt.findViewById(2131299573)).setVisibility(8);
                        }
                        linearLayout.setSelected(true);
                        AvailableBookingTimeV2Activity.this.p = i;
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
            if (Integer.parseInt(this.w.get(i2).c.isEmpty() ? "0" : this.w.get(i2).c) > 0 && "1".equals(this.w.get(i2).a)) {
                this.lnReservationTime.getChildAt(i2).performClick();
                return;
            }
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseCabangEvent(onChooseKecamatan onchoosekecamatan) {
        TextView textView = this.tvBranch;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A.getBranchType());
        sb.append(" ");
        sb.append(this.A.getBranchName());
        sb.append(", ");
        sb.append(this.A.getAddress());
        sb.append(", ");
        sb.append(this.A.getCity());
        sb.append(", ");
        sb.append(this.A.getProvince());
        textView.setText(sb.toString());
    }

    @OnClick({2131299697})
    public void onClickUbahCabang(View view) {
        finish();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        CreateQueueReservationPresenter createQueueReservationPresenter = this.y;
        Call<OpenAccountSuccessActivity<CreateQueueReservationResponse>> call = createQueueReservationPresenter.a;
        if (call != null) {
            call.cancel();
        }
        createQueueReservationPresenter.b = null;
        GetAvailableBookingV2Presenter getAvailableBookingV2Presenter = this.u;
        Call<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding>> call2 = getAvailableBookingV2Presenter.e;
        if (call2 != null) {
            call2.cancel();
        }
        getAvailableBookingV2Presenter.b = null;
        GetHBPresenter getHBPresenter = this.z;
        Call<OpenAccountSuccessActivity<Object>> call3 = getHBPresenter.b;
        if (call3 != null) {
            call3.cancel();
        }
        getHBPresenter.e = null;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.B;
        Call<OpenAccountSuccessActivity<Object>> call4 = sendEmailTransactionSuccessPresenter.a;
        if (call4 != null) {
            call4.cancel();
        }
        sendEmailTransactionSuccessPresenter.b = null;
        TxnTellerPresenter txnTellerPresenter = this.F;
        Call<OpenAccountSuccessActivity<TxnTellerResponse>> call5 = txnTellerPresenter.e;
        if (call5 != null) {
            call5.cancel();
        }
        txnTellerPresenter.d = null;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onGetBranchEvent(clickView clickview) {
        y();
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
        setCardSlogan.e().b = "AvailableBookingTimeV2Activity";
        this.j = "AvailableBookingTimeV2Activity";
    }

    @OnClick({2131296440})
    public void proses(View view) {
        this.tvError.setVisibility(8);
        String string = this.r < 0 ? getString(2131820985) : this.p < 0 ? getString(2131820986) : "";
        if (!string.isEmpty()) {
            this.tvError.setText(string);
            this.tvError.setVisibility(0);
            return;
        }
        GetHBPresenter getHBPresenter = this.z;
        Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
        getHBPresenter.b = e;
        e.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0081: INVOKE  
              (r0v11 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
              (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x007e: CONSTRUCTOR  (r1v4 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v7 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.AvailableBookingTimeV2Activity.proses(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/AvailableBookingTimeV2Activity.class
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
            	... 19 more
            */
        /*
        // Method dump skipped, instructions count: 437
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.AvailableBookingTimeV2Activity.proses(android.view.View):void");
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
        y();
    }

    @Override // com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter.write
    public final void u() {
        this.K.setDisplayedChild(0);
    }
}
