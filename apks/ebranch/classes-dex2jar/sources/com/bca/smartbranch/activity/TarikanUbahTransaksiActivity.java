package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import com.bca.smartbranch.data.api.request.UpdateTxnTellerDetailRequest;
import com.bca.smartbranch.data.api.response.GetBranchReservationResponse;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse;
import com.bca.smartbranch.data.global.BranchDetail;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.InfoTarikanDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.fragment.TReviewTarikanUbahFragment;
import com.bca.smartbranch.presenter.UpdateTxnTellerDetailPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import o.ChooseBCACardAdapter$ViewHolder_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.OpenAccountSuccessActivity;
import o.PenggantianKeyBCAActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getUserVisibleHint;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnHierarchyChangeListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/TarikanUbahTransaksiActivity.class */
public class TarikanUbahTransaksiActivity extends BaseActivityPostLogin implements UpdateTxnTellerDetailPresenter.write {
    @BindDrawable(2131231202)
    Drawable drawableIndicatorOff;
    @BindDrawable(2131231203)
    Drawable drawableIndicatorOn;
    public GetTxnTellerDetailResponse f;
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
    public GetCustAcctListResponse n;
    private Bundle p;
    @BindView(2131298111)
    ProgressBar pbIndicator1;
    @BindView(2131298112)
    ProgressBar pbIndicator2;
    public BranchDetail q;
    public GetBranchReservationResponse.ReservationBranch r;
    @BindString(2131822092)
    String retry;
    private String s;
    public List<PenggantianKeyBCAActivity.RemoteActionCompatParcelizer> t = new ArrayList();
    @BindString(2131822498)
    String tarikanCek;
    @BindString(2131822499)
    String tarikanTunai;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299276)
    TextView tvIndicator1;
    @BindView(2131299277)
    TextView tvIndicator2;
    @BindView(2131299278)
    TextView tvIndicator3;
    @BindView(2131298790)
    public TextView txtToolbarTitle;
    private UpdateTxnTellerDetailPresenter x;

    private void d(int i) {
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

    @Override // com.bca.smartbranch.presenter.UpdateTxnTellerDetailPresenter.write
    public final void a(String str) {
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

    @Override // com.bca.smartbranch.presenter.UpdateTxnTellerDetailPresenter.write
    public final void b(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.TarikanUbahTransaksiActivity.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TarikanUbahTransaksiActivity.this.s();
            }
        }).g();
    }

    public final void b(boolean z) {
        Intent intent = new Intent(this, BranchMapTarikanActivity.class);
        if (z) {
            intent.putExtra("Reservasi", ListUtil.OneItemImmutableList.e(this.r));
            intent.putExtra("branchDetail", ListUtil.OneItemImmutableList.e(this.q));
        }
        startActivityForResult(intent, 25);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da A[Catch: Exception -> 0x00fd, TRY_ENTER, TryCatch #0 {Exception -> 0x00fd, blocks: (B:3:0x0005, B:10:0x0021, B:14:0x0030, B:18:0x003f, B:29:0x005e, B:31:0x0096, B:33:0x00a2, B:35:0x00be, B:37:0x00da), top: B:42:0x0005 }] */
    @Override // o.getView
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void c(androidx.fragment.app.Fragment r5) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.TarikanUbahTransaksiActivity.c(androidx.fragment.app.Fragment):void");
    }

    @Override // com.bca.smartbranch.presenter.UpdateTxnTellerDetailPresenter.write
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.p = getIntent().getExtras();
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(Html.fromHtml(this.tarikanTunai));
        UpdateTxnTellerDetailPresenter updateTxnTellerDetailPresenter = new UpdateTxnTellerDetailPresenter();
        this.x = updateTxnTellerDetailPresenter;
        updateTxnTellerDetailPresenter.e = this;
        if (this.m == null || this.m.getVerified().equals("N")) {
            new InfoTarikanDialog().show(l(), "InfoTarikanDialog");
        }
        if (this.m != null && this.m.getVerified().equals("Y")) {
            this.n = (GetCustAcctListResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("ListAcct"));
        }
        this.f = (GetTxnTellerDetailResponse) ListUtil.OneItemImmutableList.a(this.p.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
        this.s = this.p.getString("token");
        TReviewTarikanUbahFragment tReviewTarikanUbahFragment = new TReviewTarikanUbahFragment();
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
        getuservisiblehint.e(2130772010, 2130772011);
        getuservisiblehint.d(2131296811, tReviewTarikanUbahFragment, "TReviewTarikanUbahFragment", 2);
        getuservisiblehint.b();
    }

    @Override // com.bca.smartbranch.presenter.UpdateTxnTellerDetailPresenter.write
    public final void d(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdateTxnTellerDetailPresenter.write
    public final void e(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
        if (i == 25 && i2 == -1) {
            getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
            getuservisiblehint.d(2131296811, new TReviewTarikanUbahFragment(), "TReviewTarikanUbahFragment", 2);
            getuservisiblehint.b();
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        documentProvider.b().d(new clickOrangSamaDenganPemilik());
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
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        UpdateTxnTellerDetailPresenter updateTxnTellerDetailPresenter = this.x;
        Call<OpenAccountSuccessActivity<Object>> call = updateTxnTellerDetailPresenter.b;
        if (call != null) {
            call.cancel();
        }
        updateTxnTellerDetailPresenter.e = null;
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
            YakinKeluarDialog yakinKeluarDialog = new YakinKeluarDialog();
            yakinKeluarDialog.d = "transaction_teller";
            yakinKeluarDialog.show(l(), "YakinKeluarDialog");
            return true;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onSelesaiHubungiCabang(ChooseBCACardAdapter$ViewHolder_ViewBinding chooseBCACardAdapter$ViewHolder_ViewBinding) {
        this.r = chooseBCACardAdapter$ViewHolder_ViewBinding.b;
        this.q = chooseBCACardAdapter$ViewHolder_ViewBinding.a;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "TarikanUbahTransaksiActivity";
        this.j = "TarikanUbahTransaksiActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131493009;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    public final void s() {
        UpdateTxnTellerDetailRequest.InputSchema inputSchema = new UpdateTxnTellerDetailRequest.InputSchema();
        inputSchema.setAccountNumber(this.f.getTxnDetail().getAccountNumber());
        inputSchema.setTxnAmount(new BigInteger(this.f.getTxnDetail().getTxnAmount()));
        inputSchema.setToken(this.s);
        this.x.d(new UpdateTxnTellerDetailRequest(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), inputSchema));
    }

    @Override // com.bca.smartbranch.presenter.UpdateTxnTellerDetailPresenter.write
    public final void u() {
        z();
    }

    @Override // com.bca.smartbranch.presenter.UpdateTxnTellerDetailPresenter.write
    public final void v() {
        x();
        Intent intent = new Intent(this, TransactionActivity.class);
        intent.putExtra("is_update", true);
        startActivity(intent);
        setOnHierarchyChangeListener.d((Activity) this);
    }
}
