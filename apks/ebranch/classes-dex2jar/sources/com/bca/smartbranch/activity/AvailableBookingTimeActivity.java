package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.data.api.response.CreateReservationResponse;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.ErrorGetAvailableBookingTimeDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.CreateReservationPresenter;
import com.bca.smartbranch.presenter.GetAvailableBookingPresenter;
import com.bca.smartbranch.presenter.GetHBPresenter;
import com.bca.smartbranch.presenter.RescheduleReservationPresenter;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import java.util.ArrayList;
import java.util.List;
import o.InfoBiayaActivity_ViewBinding;
import o.InfoFullAmountORActivity_ViewBinding;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/AvailableBookingTimeActivity.class */
public class AvailableBookingTimeActivity extends BaseActivityPostLogin implements CreateReservationPresenter.read, RescheduleReservationPresenter.write, GetAvailableBookingPresenter.IconCompatParcelizer, GetHBPresenter.write, SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    private List<GetBranchROResponse.DetailBranch> A;
    private Reservation B;
    private String C;
    private SendEmailTransactionSuccessPresenter D;
    private ViewAnimator F;
    private String H;
    @BindView(2131297635)
    LinearLayout llEstimasi;
    @BindView(2131296324)
    LinearLayout lnActivityMain;
    @BindView(2131297970)
    LinearLayout lnReservationDate;
    @BindView(2131297971)
    LinearLayout lnReservationTime;
    private CreateReservationResponse n;
    @BindString(2131822092)
    String retry;
    private Location s;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298862)
    TextView tvBranch;
    @BindView(2131298952)
    TextView tvError;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299252)
    TextView tvEstimasiWaktu;
    @BindView(2131298790)
    TextView tvToolbar;
    @BindView(2131299686)
    TextView tvTotalTransaksi;
    @BindString(2131822291)
    String txtToolbar;
    private GetHBPresenter u;
    private CreateReservationPresenter v;
    private RescheduleReservationPresenter w;
    private GetBranchROResponse.DetailBranch x;
    private GetAvailableBookingPresenter y;
    private String z;
    private String f = null;
    private List<OutwardRemittanceMenuActivity_ViewBinding.IconCompatParcelizer> q = new ArrayList();
    private List<OutwardRemittanceMenuActivity_ViewBinding.RemoteActionCompatParcelizer> r = new ArrayList();
    private int p = -1;
    private int t = -1;

    private void a(CreateReservationResponse createReservationResponse) {
        this.f = "SendEmail";
        this.n = createReservationResponse;
        this.D.c(new LoginSessionActivity_ViewBinding(this.m.getEmail(), this.z));
    }

    private void l(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("type_transaksi", this.B.getTypeTransaction());
        bundle.putString("reff_no", this.z);
        bundle.putBoolean("from_form", this.B.isFromForm());
        bundle.putParcelable("reservasi", ListUtil.OneItemImmutableList.e(this.n));
        bundle.putString("type_reservation", this.C);
        bundle.putString("email_success", str);
        Intent intent = new Intent(this, ReservasiSuccessActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void n(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    private void v() {
        this.f = "GetAvailableBooking";
        GetAvailableBookingPresenter getAvailableBookingPresenter = this.y;
        InfoFullAmountORActivity_ViewBinding infoFullAmountORActivity_ViewBinding = new InfoFullAmountORActivity_ViewBinding(this.m.getEmail(), this.m.getSessionId(), this.x.getBranchCode(), this.m.getImei());
        getAvailableBookingPresenter.b.t();
        Call<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding>> a = getAvailableBookingPresenter.apiService.a(infoFullAmountORActivity_ViewBinding);
        getAvailableBookingPresenter.a = a;
        a.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0051: INVOKE  
              (r0v8 'a' retrofit2.Call<o.OpenAccountSuccessActivity<o.OutwardRemittanceMenuActivity_ViewBinding>>)
              (wrap: com.bca.smartbranch.presenter.GetAvailableBookingPresenter$1 : 0x004e: CONSTRUCTOR  (r1v4 com.bca.smartbranch.presenter.GetAvailableBookingPresenter$1 A[REMOVE]) = (r0v2 'getAvailableBookingPresenter' com.bca.smartbranch.presenter.GetAvailableBookingPresenter) call: com.bca.smartbranch.presenter.GetAvailableBookingPresenter.1.<init>(com.bca.smartbranch.presenter.GetAvailableBookingPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.AvailableBookingTimeActivity.v():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/AvailableBookingTimeActivity.class
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetAvailableBookingPresenter, state: GENERATED_AND_UNLOADED
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
            r0 = r7
            java.lang.String r1 = "GetAvailableBooking"
            r0.f = r1
            r0 = r7
            com.bca.smartbranch.presenter.GetAvailableBookingPresenter r0 = r0.y
            r8 = r0
            o.InfoFullAmountORActivity_ViewBinding r0 = new o.InfoFullAmountORActivity_ViewBinding
            r1 = r0
            r2 = r7
            com.bca.smartbranch.data.localdb.User r2 = r2.m
            java.lang.String r2 = r2.getEmail()
            r3 = r7
            com.bca.smartbranch.data.localdb.User r3 = r3.m
            java.lang.String r3 = r3.getSessionId()
            r4 = r7
            com.bca.smartbranch.data.api.response.GetBranchROResponse$DetailBranch r4 = r4.x
            java.lang.String r4 = r4.getBranchCode()
            r5 = r7
            com.bca.smartbranch.data.localdb.User r5 = r5.m
            java.lang.String r5 = r5.getImei()
            r1.<init>(r2, r3, r4, r5)
            r9 = r0
            r0 = r8
            com.bca.smartbranch.presenter.GetAvailableBookingPresenter$IconCompatParcelizer r0 = r0.b
            r0.t()
            r0 = r8
            o.setIncomeDisplayAmount r0 = r0.apiService
            r1 = r9
            retrofit2.Call r0 = r0.a(r1)
            r9 = r0
            r0 = r8
            r1 = r9
            r0.a = r1
            r0 = r9
            com.bca.smartbranch.presenter.GetAvailableBookingPresenter$1 r1 = new com.bca.smartbranch.presenter.GetAvailableBookingPresenter$1
            r2 = r1
            r3 = r8
            r2.<init>()
            r0.enqueue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.AvailableBookingTimeActivity.v():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        this.f = "CreateReservation";
        StringBuilder sb = new StringBuilder();
        sb.append(this.q.get(this.p).b);
        sb.append(" ");
        sb.append(this.r.get(this.t).e);
        this.v.d(new InfoBiayaActivity_ViewBinding(this.m.getEmail(), this.m.getSessionId(), this.x.getBranchCode(), sb.toString(), this.z, this.B.getTypeReservation().equals("Internet/Mobile Banking") ? "2" : "1", this.m.getImei()));
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        l("");
    }

    @Override // com.bca.smartbranch.presenter.CreateReservationPresenter.read, com.bca.smartbranch.presenter.RescheduleReservationPresenter.write, com.bca.smartbranch.presenter.GetAvailableBookingPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
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
            KeluarFormReservationDialog_ViewBinding.a(null, this.lnActivityMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeActivity.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AvailableBookingTimeActivity.this.y();
                }
            }).g();
        } else if (this.f.equals("SendEmail")) {
            l("");
        }
    }

    @Override // com.bca.smartbranch.presenter.GetAvailableBookingPresenter.IconCompatParcelizer
    public final void b(OutwardRemittanceMenuActivity_ViewBinding outwardRemittanceMenuActivity_ViewBinding) {
        this.F.setDisplayedChild(2);
        this.q = outwardRemittanceMenuActivity_ViewBinding.c;
        this.lnReservationDate.removeAllViews();
        final int i = 0;
        for (OutwardRemittanceMenuActivity_ViewBinding.IconCompatParcelizer iconCompatParcelizer : this.q) {
            View inflate = getLayoutInflater().inflate(2131493349, (ViewGroup) null);
            final LinearLayout linearLayout = (LinearLayout) inflate.findViewById(2131297979);
            TextView textView = (TextView) inflate.findViewById(2131298915);
            TextView textView2 = (TextView) inflate.findViewById(2131298916);
            TextView textView3 = (TextView) inflate.findViewById(2131299415);
            if (iconCompatParcelizer.a.equals("Y")) {
                inflate.setEnabled(false);
                linearLayout.setEnabled(false);
                textView.setAlpha(0.3f);
                textView2.setAlpha(0.2f);
                textView3.setAlpha(0.4f);
            } else {
                inflate.setEnabled(true);
                linearLayout.setEnabled(true);
            }
            textView.setText(getAnnualFeeBasicAmount.d(iconCompatParcelizer.b));
            textView2.setText(DateTimeFormat.forPattern("dd").print(DateTimeFormat.forPattern("yyyyMMdd").parseDateTime(iconCompatParcelizer.b)));
            textView3.setText(getAnnualFeeBasicAmount.c(iconCompatParcelizer.b));
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeActivity.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    for (int i2 = 0; i2 < AvailableBookingTimeActivity.this.lnReservationDate.getChildCount(); i2++) {
                        ((LinearLayout) AvailableBookingTimeActivity.this.lnReservationDate.getChildAt(i2).findViewById(2131297979)).setSelected(false);
                    }
                    linearLayout.setSelected(true);
                    AvailableBookingTimeActivity.this.p = i;
                    documentProvider.b().d(new onChooseJabatan(i));
                }
            });
            this.lnReservationDate.addView(inflate);
            i++;
        }
        for (int i2 = 0; i2 < this.lnReservationDate.getChildCount(); i2++) {
            if ("N".equals(this.q.get(i2).a)) {
                this.lnReservationDate.getChildAt(i2).performClick();
                return;
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.RescheduleReservationPresenter.write
    public final void c(CreateReservationResponse createReservationResponse) {
        a(createReservationResponse);
    }

    @Override // com.bca.smartbranch.presenter.CreateReservationPresenter.read
    public final void c(String str) {
        n(str);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        l("");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        Bundle extras = getIntent().getExtras();
        this.F = (ViewAnimator) findViewById(2131299749);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbar.setText(this.txtToolbar);
        this.v = new CreateReservationPresenter();
        this.y = new GetAvailableBookingPresenter();
        this.w = new RescheduleReservationPresenter();
        this.D = new SendEmailTransactionSuccessPresenter();
        this.v.d = this;
        this.y.b = this;
        this.w.c = this;
        this.D.b = this;
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.u = getHBPresenter;
        getHBPresenter.e = this;
        this.B = (Reservation) ListUtil.OneItemImmutableList.a(extras.getParcelable("reservation_data"));
        this.A = (List) ListUtil.OneItemImmutableList.a(extras.getParcelable("reservation_list"));
        Location location = new Location("");
        this.s = location;
        location.setLatitude(extras.getDouble("LAT"));
        this.s.setLongitude(extras.getDouble("LONG"));
        this.H = this.B.getTypeTransaction();
        this.z = this.B.getNoReff();
        this.C = this.B.getTypeReservation();
        this.x = (GetBranchROResponse.DetailBranch) ListUtil.OneItemImmutableList.a(extras.getParcelable("branch"));
        TextView textView = this.tvBranch;
        StringBuilder sb = new StringBuilder();
        sb.append(this.x.getBranchType());
        sb.append(" ");
        sb.append(this.x.getBranchName());
        sb.append(", ");
        sb.append(this.x.getAddress());
        sb.append(", ");
        sb.append(this.x.getCity());
        sb.append(", ");
        sb.append(this.x.getProvince());
        textView.setText(sb.toString());
        this.llEstimasi.setVisibility(8);
        v();
    }

    @Override // com.bca.smartbranch.presenter.CreateReservationPresenter.read
    public final void d(CreateReservationResponse createReservationResponse) {
        a(createReservationResponse);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        l(str);
    }

    @Override // com.bca.smartbranch.presenter.GetAvailableBookingPresenter.IconCompatParcelizer
    public final void f(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetAvailableBookingTimeDialog errorGetAvailableBookingTimeDialog = new ErrorGetAvailableBookingTimeDialog();
        errorGetAvailableBookingTimeDialog.setArguments(bundle);
        errorGetAvailableBookingTimeDialog.show(l(), "ErrorGetAvailableBookingTimeDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetAvailableBookingPresenter.IconCompatParcelizer
    public final void g(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetAvailableBookingTimeDialog errorGetAvailableBookingTimeDialog = new ErrorGetAvailableBookingTimeDialog();
        errorGetAvailableBookingTimeDialog.setArguments(bundle);
        errorGetAvailableBookingTimeDialog.show(l(), "ErrorGetAvailableBookingTimeDialog");
    }

    @Override // com.bca.smartbranch.presenter.CreateReservationPresenter.read, com.bca.smartbranch.presenter.RescheduleReservationPresenter.write, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        z();
    }

    @Override // com.bca.smartbranch.presenter.CreateReservationPresenter.read
    public final void h(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.lnActivityMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.RescheduleReservationPresenter.write
    public final void i(String str) {
        n(str);
    }

    @Override // com.bca.smartbranch.presenter.CreateReservationPresenter.read, com.bca.smartbranch.presenter.RescheduleReservationPresenter.write, com.bca.smartbranch.presenter.GetAvailableBookingPresenter.IconCompatParcelizer
    public final void j(String str) {
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

    @Override // com.bca.smartbranch.presenter.CreateReservationPresenter.read, com.bca.smartbranch.presenter.RescheduleReservationPresenter.write, com.bca.smartbranch.presenter.GetAvailableBookingPresenter.IconCompatParcelizer
    public final void k(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.RescheduleReservationPresenter.write
    public final void o(String str) {
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
        this.r = this.q.get(onchoosejabatan.e).e;
        this.t = -1;
        this.lnReservationTime.removeAllViews();
        final int i = 0;
        for (final OutwardRemittanceMenuActivity_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.r) {
            View inflate = getLayoutInflater().inflate(2131493350, (ViewGroup) null);
            final LinearLayout linearLayout = (LinearLayout) inflate.findViewById(2131297979);
            TextView textView = (TextView) inflate.findViewById(2131299606);
            final TextView textView2 = (TextView) inflate.findViewById(2131299573);
            if (Integer.valueOf(remoteActionCompatParcelizer.c).intValue() <= 0 || !"1".equals(remoteActionCompatParcelizer.a)) {
                inflate.setEnabled(false);
                linearLayout.setEnabled(false);
                textView.setAlpha(0.4f);
            } else {
                inflate.setEnabled(true);
                linearLayout.setEnabled(true);
            }
            textView.setText(remoteActionCompatParcelizer.e.replace(":", "."));
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeActivity.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    for (int i2 = 0; i2 < AvailableBookingTimeActivity.this.lnReservationTime.getChildCount(); i2++) {
                        View childAt = AvailableBookingTimeActivity.this.lnReservationTime.getChildAt(i2);
                        ((LinearLayout) childAt.findViewById(2131297979)).setSelected(false);
                        ((TextView) childAt.findViewById(2131299573)).setVisibility(8);
                    }
                    linearLayout.setSelected(true);
                    AvailableBookingTimeActivity.this.t = i;
                    if (Integer.parseInt(remoteActionCompatParcelizer.c) == 1) {
                        textView2.setVisibility(0);
                    }
                }
            });
            this.lnReservationTime.addView(inflate);
            i++;
        }
        for (int i2 = 0; i2 < this.lnReservationTime.getChildCount(); i2++) {
            if (Integer.valueOf(this.r.get(i2).c).intValue() > 0 && "1".equals(this.r.get(i2).a)) {
                this.lnReservationTime.getChildAt(i2).performClick();
                return;
            }
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseCabangEvent(onChooseKecamatan onchoosekecamatan) {
        TextView textView = this.tvBranch;
        StringBuilder sb = new StringBuilder();
        sb.append(this.x.getBranchType());
        sb.append(" ");
        sb.append(this.x.getBranchName());
        sb.append(", ");
        sb.append(this.x.getAddress());
        sb.append(", ");
        sb.append(this.x.getCity());
        sb.append(", ");
        sb.append(this.x.getProvince());
        textView.setText(sb.toString());
    }

    @OnClick({2131299697})
    public void onClickUbahCabang(View view) {
        finish();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        CreateReservationPresenter createReservationPresenter = this.v;
        Call<OpenAccountSuccessActivity<CreateReservationResponse>> call = createReservationPresenter.a;
        if (call != null) {
            call.cancel();
        }
        createReservationPresenter.d = null;
        GetAvailableBookingPresenter getAvailableBookingPresenter = this.y;
        Call<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding>> call2 = getAvailableBookingPresenter.a;
        if (call2 != null) {
            call2.cancel();
        }
        getAvailableBookingPresenter.b = null;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.D;
        Call<OpenAccountSuccessActivity<Object>> call3 = sendEmailTransactionSuccessPresenter.a;
        if (call3 != null) {
            call3.cancel();
        }
        sendEmailTransactionSuccessPresenter.b = null;
        GetHBPresenter getHBPresenter = this.u;
        Call<OpenAccountSuccessActivity<Object>> call4 = getHBPresenter.b;
        if (call4 != null) {
            call4.cancel();
        }
        getHBPresenter.e = null;
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
        setCardSlogan.e().b = "AvailableBookingTimeActivity";
        this.j = "AvailableBookingTimeActivity";
    }

    @OnClick({2131296440})
    public void proses(View view) {
        this.tvError.setVisibility(8);
        String string = this.p < 0 ? getString(2131820985) : this.t < 0 ? getString(2131820986) : "";
        if (!string.isEmpty()) {
            this.tvError.setText(string);
            this.tvError.setVisibility(0);
            return;
        }
        GetHBPresenter getHBPresenter = this.u;
        Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
        getHBPresenter.b = e;
        e.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0081: INVOKE  
              (r0v11 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
              (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x007e: CONSTRUCTOR  (r1v4 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v7 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.AvailableBookingTimeActivity.proses(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/AvailableBookingTimeActivity.class
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
        // Method dump skipped, instructions count: 325
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.AvailableBookingTimeActivity.proses(android.view.View):void");
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

    @Override // com.bca.smartbranch.presenter.GetAvailableBookingPresenter.IconCompatParcelizer
    public final void t() {
        this.F.setDisplayedChild(0);
    }
}
