package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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
import com.bca.smartbranch.data.api.request.UpdateTxnTellerDetailRequest;
import com.bca.smartbranch.data.api.response.BeneficiaryBankResponse;
import com.bca.smartbranch.data.api.response.CategoriesORResponse;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.api.response.GetBankSpecialRelationResponse;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse;
import com.bca.smartbranch.data.api.response.KategoriTujuanTransaksiORResponse;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.fragment.OR6ReviewUbahFragment;
import com.bca.smartbranch.presenter.GetHBPresenter;
import com.bca.smartbranch.presenter.UpdateTxnTellerDetailPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.ArrayList;
import java.util.List;
import o.InfoProductORActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getCardName;
import o.getUserVisibleHint;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnHierarchyChangeListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/OutwardRemittanceFormUbahActivity.class */
public class OutwardRemittanceFormUbahActivity extends BaseActivityPostLogin implements GetHBPresenter.write, UpdateTxnTellerDetailPresenter.write {
    private UpdateTxnTellerDetailPresenter A;
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
    @BindView(2131297383)
    ImageView ivIndicatorClear4;
    @BindView(2131297384)
    ImageView ivIndicatorClear5;
    @BindView(2131297385)
    ImageView ivIndicatorClear6;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297767)
    LinearLayout llMainIndicator;
    public List<DaftarTransferResponse.DaftarTransferOutput> n;
    public ListFormTeller p;
    @BindView(2131298111)
    ProgressBar pbIndicator1;
    @BindView(2131298112)
    ProgressBar pbIndicator2;
    @BindView(2131298113)
    ProgressBar pbIndicator3;
    @BindView(2131298114)
    ProgressBar pbIndicator4;
    @BindView(2131298115)
    ProgressBar pbIndicator5;
    @BindString(2131822092)
    String retry;
    @BindView(2131298304)
    RelativeLayout rlToolbar;
    public GetCustAcctListResponse s;
    @BindString(2131822238)
    String titleOutwardRemittance;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
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
    @BindView(2131299281)
    TextView tvIndicator6;
    @BindView(2131298790)
    TextView tvToolbarTitle;
    private GetHBPresenter u;
    private String z;
    public String q = "";
    private List<BeneficiaryBankResponse.BeneficiaryBank> x = new ArrayList();
    private List<GetBankSpecialRelationResponse.SpecialBank> y = new ArrayList();
    public List<KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR> r = new ArrayList();
    public List<CategoriesORResponse.Category> t = new ArrayList();
    private boolean w = false;
    private int v = 0;

    private void e(int i) {
        switch (i) {
            case 1:
                this.tvIndicator1.setBackgroundResource(2131231203);
                this.tvIndicator1.setTextColor(getResources().getColor(2131099772));
                this.tvIndicator2.setBackgroundResource(2131231202);
                this.tvIndicator2.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator3.setBackgroundResource(2131231202);
                this.tvIndicator3.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator4.setBackgroundResource(2131231202);
                this.tvIndicator4.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator5.setBackgroundResource(2131231202);
                this.tvIndicator5.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator6.setBackgroundResource(2131231202);
                this.tvIndicator6.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator1.setVisibility(0);
                this.ivIndicatorClear1.setVisibility(8);
                ProgressBar progressBar = this.pbIndicator1;
                progressBar.startAnimation(new getCardName(progressBar, 0.0f));
                ProgressBar progressBar2 = this.pbIndicator2;
                progressBar2.startAnimation(new getCardName(progressBar2, 0.0f));
                ProgressBar progressBar3 = this.pbIndicator3;
                progressBar3.startAnimation(new getCardName(progressBar3, 0.0f));
                ProgressBar progressBar4 = this.pbIndicator4;
                progressBar4.startAnimation(new getCardName(progressBar4, 0.0f));
                ProgressBar progressBar5 = this.pbIndicator5;
                progressBar5.startAnimation(new getCardName(progressBar5, 0.0f));
                return;
            case 2:
                this.tvIndicator1.setVisibility(8);
                this.ivIndicatorClear1.setVisibility(0);
                this.tvIndicator2.setBackgroundResource(2131231203);
                this.tvIndicator2.setTextColor(getResources().getColor(2131099772));
                this.tvIndicator3.setBackgroundResource(2131231202);
                this.tvIndicator3.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator4.setBackgroundResource(2131231202);
                this.tvIndicator4.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator5.setBackgroundResource(2131231202);
                this.tvIndicator5.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator6.setBackgroundResource(2131231202);
                this.tvIndicator6.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator2.setVisibility(0);
                this.ivIndicatorClear2.setVisibility(8);
                ProgressBar progressBar6 = this.pbIndicator1;
                progressBar6.startAnimation(new getCardName(progressBar6, 100.0f));
                ProgressBar progressBar7 = this.pbIndicator2;
                progressBar7.startAnimation(new getCardName(progressBar7, 0.0f));
                ProgressBar progressBar8 = this.pbIndicator3;
                progressBar8.startAnimation(new getCardName(progressBar8, 0.0f));
                ProgressBar progressBar9 = this.pbIndicator4;
                progressBar9.startAnimation(new getCardName(progressBar9, 0.0f));
                ProgressBar progressBar10 = this.pbIndicator5;
                progressBar10.startAnimation(new getCardName(progressBar10, 0.0f));
                return;
            case 3:
                this.tvIndicator1.setVisibility(8);
                this.ivIndicatorClear1.setVisibility(0);
                this.tvIndicator2.setVisibility(8);
                this.ivIndicatorClear2.setVisibility(0);
                this.tvIndicator3.setBackgroundResource(2131231203);
                this.tvIndicator3.setTextColor(getResources().getColor(2131099772));
                this.tvIndicator4.setBackgroundResource(2131231202);
                this.tvIndicator4.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator5.setBackgroundResource(2131231202);
                this.tvIndicator5.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator6.setBackgroundResource(2131231202);
                this.tvIndicator6.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator3.setVisibility(0);
                this.ivIndicatorClear3.setVisibility(8);
                ProgressBar progressBar11 = this.pbIndicator1;
                progressBar11.startAnimation(new getCardName(progressBar11, 100.0f));
                ProgressBar progressBar12 = this.pbIndicator2;
                progressBar12.startAnimation(new getCardName(progressBar12, 100.0f));
                ProgressBar progressBar13 = this.pbIndicator3;
                progressBar13.startAnimation(new getCardName(progressBar13, 0.0f));
                ProgressBar progressBar14 = this.pbIndicator4;
                progressBar14.startAnimation(new getCardName(progressBar14, 0.0f));
                ProgressBar progressBar15 = this.pbIndicator5;
                progressBar15.startAnimation(new getCardName(progressBar15, 0.0f));
                return;
            case 4:
                this.tvIndicator1.setVisibility(8);
                this.ivIndicatorClear1.setVisibility(0);
                this.tvIndicator2.setVisibility(8);
                this.ivIndicatorClear2.setVisibility(0);
                this.tvIndicator3.setVisibility(8);
                this.ivIndicatorClear3.setVisibility(0);
                this.tvIndicator4.setBackgroundResource(2131231203);
                this.tvIndicator4.setTextColor(getResources().getColor(2131099772));
                this.tvIndicator5.setBackgroundResource(2131231202);
                this.tvIndicator5.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator6.setBackgroundResource(2131231202);
                this.tvIndicator6.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator4.setVisibility(0);
                this.ivIndicatorClear4.setVisibility(8);
                ProgressBar progressBar16 = this.pbIndicator1;
                progressBar16.startAnimation(new getCardName(progressBar16, 100.0f));
                ProgressBar progressBar17 = this.pbIndicator2;
                progressBar17.startAnimation(new getCardName(progressBar17, 100.0f));
                ProgressBar progressBar18 = this.pbIndicator3;
                progressBar18.startAnimation(new getCardName(progressBar18, 100.0f));
                ProgressBar progressBar19 = this.pbIndicator4;
                progressBar19.startAnimation(new getCardName(progressBar19, 0.0f));
                ProgressBar progressBar20 = this.pbIndicator5;
                progressBar20.startAnimation(new getCardName(progressBar20, 0.0f));
                return;
            case 5:
                this.tvIndicator1.setVisibility(8);
                this.ivIndicatorClear1.setVisibility(0);
                this.tvIndicator2.setVisibility(8);
                this.ivIndicatorClear2.setVisibility(0);
                this.tvIndicator3.setVisibility(8);
                this.ivIndicatorClear3.setVisibility(0);
                this.tvIndicator4.setVisibility(8);
                this.ivIndicatorClear4.setVisibility(0);
                this.tvIndicator5.setBackgroundResource(2131231203);
                this.tvIndicator5.setTextColor(getResources().getColor(2131099772));
                this.tvIndicator6.setBackgroundResource(2131231202);
                this.tvIndicator6.setTextColor(getResources().getColor(2131099815));
                this.tvIndicator5.setVisibility(0);
                this.ivIndicatorClear5.setVisibility(8);
                ProgressBar progressBar21 = this.pbIndicator1;
                progressBar21.startAnimation(new getCardName(progressBar21, 100.0f));
                ProgressBar progressBar22 = this.pbIndicator2;
                progressBar22.startAnimation(new getCardName(progressBar22, 100.0f));
                ProgressBar progressBar23 = this.pbIndicator3;
                progressBar23.startAnimation(new getCardName(progressBar23, 100.0f));
                ProgressBar progressBar24 = this.pbIndicator4;
                progressBar24.startAnimation(new getCardName(progressBar24, 100.0f));
                ProgressBar progressBar25 = this.pbIndicator5;
                progressBar25.startAnimation(new getCardName(progressBar25, 0.0f));
                return;
            case 6:
                this.tvIndicator1.setVisibility(8);
                this.ivIndicatorClear1.setVisibility(0);
                this.tvIndicator2.setVisibility(8);
                this.ivIndicatorClear2.setVisibility(0);
                this.tvIndicator3.setVisibility(8);
                this.ivIndicatorClear3.setVisibility(0);
                this.tvIndicator4.setVisibility(8);
                this.ivIndicatorClear4.setVisibility(0);
                this.tvIndicator5.setVisibility(8);
                this.ivIndicatorClear5.setVisibility(0);
                this.tvIndicator6.setBackgroundResource(2131231203);
                this.tvIndicator6.setTextColor(getResources().getColor(2131099772));
                ProgressBar progressBar26 = this.pbIndicator1;
                progressBar26.startAnimation(new getCardName(progressBar26, 100.0f));
                ProgressBar progressBar27 = this.pbIndicator2;
                progressBar27.startAnimation(new getCardName(progressBar27, 100.0f));
                ProgressBar progressBar28 = this.pbIndicator3;
                progressBar28.startAnimation(new getCardName(progressBar28, 100.0f));
                ProgressBar progressBar29 = this.pbIndicator4;
                progressBar29.startAnimation(new getCardName(progressBar29, 100.0f));
                ProgressBar progressBar30 = this.pbIndicator5;
                progressBar30.startAnimation(new getCardName(progressBar30, 100.0f));
                return;
            default:
                return;
        }
    }

    @Override // com.bca.smartbranch.presenter.UpdateTxnTellerDetailPresenter.write
    public final void a(String str) {
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
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.OutwardRemittanceFormUbahActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OutwardRemittanceFormUbahActivity.this.s();
            }
        }).g();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.getView
    public void c(Fragment fragment) {
        char c;
        c(fragment);
        String tag = fragment.getTag();
        tag.hashCode();
        switch (tag.hashCode()) {
            case -603095421:
                if (tag.equals("OR1DataPengirimFragment")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 53888775:
                if (tag.equals("ProsesORFragment")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 404696923:
                if (tag.equals("OR6ReviewFragment")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 412114819:
                if (tag.equals("OR5DataPenerimaFragment")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 635975390:
                if (tag.equals("OR4DataBankPenerimaFragment")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 758930212:
                if (tag.equals("OR3DataTransaksiBFragment")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 785582095:
                if (tag.equals("OR6DataLainnyaFragment")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1088953692:
                if (tag.equals("OR2PilihProductFragment")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1321620194:
                if (tag.equals("OR2DataTransaksiAFragment")) {
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
                this.llMainIndicator.setVisibility(0);
                this.rlToolbar.setVisibility(0);
                e(1);
                return;
            case 1:
                this.llMainIndicator.setVisibility(8);
                this.rlToolbar.setVisibility(8);
                return;
            case 2:
                this.llMainIndicator.setVisibility(0);
                this.rlToolbar.setVisibility(0);
                e(6);
                return;
            case 3:
                this.llMainIndicator.setVisibility(0);
                this.rlToolbar.setVisibility(0);
                e(4);
                return;
            case 4:
                this.llMainIndicator.setVisibility(0);
                this.rlToolbar.setVisibility(0);
                e(3);
                return;
            case 5:
            case 7:
            case '\b':
                this.llMainIndicator.setVisibility(0);
                this.rlToolbar.setVisibility(0);
                e(2);
                return;
            case 6:
                this.llMainIndicator.setVisibility(0);
                this.rlToolbar.setVisibility(0);
                e(5);
                return;
            default:
                return;
        }
    }

    @Override // com.bca.smartbranch.presenter.UpdateTxnTellerDetailPresenter.write
    public final void c(String str) {
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
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbarTitle.setText(2131822238);
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.u = getHBPresenter;
        getHBPresenter.e = this;
        UpdateTxnTellerDetailPresenter updateTxnTellerDetailPresenter = new UpdateTxnTellerDetailPresenter();
        this.A = updateTxnTellerDetailPresenter;
        updateTxnTellerDetailPresenter.e = this;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (this.m != null && this.m.getVerified().equals("Y")) {
                this.s = (GetCustAcctListResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("ListAcct"));
            }
            if (extras.getParcelable("data_kategori_tujuan") != null) {
                this.r = ((KategoriTujuanTransaksiORResponse) ListUtil.OneItemImmutableList.a(extras.getParcelable("data_kategori_tujuan"))).getListData();
            }
            if (extras.getParcelable("data_sumber_dana") != null) {
                this.t = ((CategoriesORResponse) ListUtil.OneItemImmutableList.a(extras.getParcelable("data_sumber_dana"))).getCategories();
            }
            if (extras.getParcelable("data_daftar_transfer") != null) {
                this.n = (List) ListUtil.OneItemImmutableList.a(extras.getParcelable("data_daftar_transfer"));
            }
            GetTxnTellerDetailResponse getTxnTellerDetailResponse = (GetTxnTellerDetailResponse) ListUtil.OneItemImmutableList.a(extras.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
            this.f = getTxnTellerDetailResponse;
            String product = getTxnTellerDetailResponse.getTxnDetail().getProduct();
            this.q = product;
            product.hashCode();
            int hashCode = product.hashCode();
            char c = 65535;
            if (hashCode != 52) {
                if (hashCode != 70) {
                    if (hashCode != 79) {
                        if (hashCode != 76) {
                            if (hashCode == 77 && product.equals("M")) {
                                c = 3;
                            }
                        } else if (product.equals("L")) {
                            c = 2;
                        }
                    } else if (product.equals("O")) {
                        c = 4;
                    }
                } else if (product.equals("F")) {
                    c = 1;
                }
            } else if (product.equals("4")) {
                c = 0;
            }
            if (c == 0) {
                this.tvToolbarTitle.setText(2131822093);
            } else if (c == 1) {
                this.tvToolbarTitle.setText(2131821362);
            } else if (c == 2) {
                this.tvToolbarTitle.setText(2131821871);
            } else if (c == 3) {
                this.tvToolbarTitle.setText(2131821916);
            } else if (c != 4) {
                this.tvToolbarTitle.setText(2131822238);
            } else {
                this.tvToolbarTitle.setText(2131822238);
            }
            this.z = extras.getString("token");
        }
        OR6ReviewUbahFragment oR6ReviewUbahFragment = new OR6ReviewUbahFragment();
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
        getuservisiblehint.e(2130772010, 2130772011);
        getuservisiblehint.d(2131296811, oR6ReviewUbahFragment, "OR6ReviewFragment", 2);
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
        GetHBPresenter getHBPresenter = this.u;
        Call<OpenAccountSuccessActivity<Object>> call = getHBPresenter.b;
        if (call != null) {
            call.cancel();
        }
        getHBPresenter.e = null;
        UpdateTxnTellerDetailPresenter updateTxnTellerDetailPresenter = this.A;
        Call<OpenAccountSuccessActivity<Object>> call2 = updateTxnTellerDetailPresenter.b;
        if (call2 != null) {
            call2.cancel();
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

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "OutwardRemittanceFormActivity";
        this.j = "OutwardRemittanceFormActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492972;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    public final void s() {
        UpdateTxnTellerDetailRequest.InputSchema inputSchema = new UpdateTxnTellerDetailRequest.InputSchema();
        inputSchema.setToken(this.z);
        inputSchema.setAmount(this.f.getTxnDetail().getTxnAmount());
        inputSchema.setAccountNumberOR(this.f.getTxnDetail().getAccountNumber());
        inputSchema.setPic(this.f.getTxnDetail().getPic());
        inputSchema.setPhoneNumber(this.f.getTxnDetail().getSenderPhone());
        inputSchema.setTransactionPurpose(this.f.getTxnDetail().getTxnPurpose());
        inputSchema.setTransactionPurposeType(this.f.getTxnDetail().getTxnPurposeType());
        inputSchema.setTransactionSource(this.f.getTxnDetail().getTxnSource());
        inputSchema.setTransactionNotes(this.f.getTxnDetail().getTxnNotes());
        inputSchema.setTransactionNotes2(this.f.getTxnDetail().getTxnNotes2());
        inputSchema.setFinancialRelation(this.f.getTxnDetail().getFinancialRelation());
        inputSchema.setIbanAccountNumber(this.f.getTxnDetail().getIbanAccountNumber());
        inputSchema.setAddress(this.f.getTxnDetail().getAddress());
        inputSchema.setAddress2(this.f.getTxnDetail().getAddress2());
        inputSchema.setReceiverCity(this.f.getTxnDetail().getReceiverCity());
        inputSchema.setReceiverCountry(this.f.getTxnDetail().getReceiverCountry());
        inputSchema.setReceiverNameOR(this.f.getTxnDetail().getReceiverName());
        inputSchema.setCustomerType(this.f.getTxnDetail().getCustomerType());
        inputSchema.setReceiverStates(this.f.getTxnDetail().getReceiverStates());
        inputSchema.setAdditionalBankInfo(this.f.getTxnDetail().getAdditionalBankInfo());
        inputSchema.setLocalClearingCode(this.f.getTxnDetail().getLocalClearingCode());
        inputSchema.setCodeword(this.f.getTxnDetail().getCodeword());
        inputSchema.setPromotionCode(this.f.getTxnDetail().getPromotionCode());
        this.A.d(new UpdateTxnTellerDetailRequest(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), inputSchema));
    }

    public final void t() {
        if (this.m != null) {
            GetHBPresenter getHBPresenter = this.u;
            Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
            getHBPresenter.b = e;
            e.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE  
                  (r0v7 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                  (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x003c: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v3 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.OutwardRemittanceFormUbahActivity.t():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/OutwardRemittanceFormUbahActivity.class
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
                com.bca.smartbranch.presenter.GetHBPresenter r0 = r0.u
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
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.OutwardRemittanceFormUbahActivity.t():void");
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
