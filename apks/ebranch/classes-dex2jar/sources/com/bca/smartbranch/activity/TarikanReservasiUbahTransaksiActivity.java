package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.data.localdb.Tarikan;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.fragment.TReviewTarikanReservasiUbahFragment;
import io.realm.Realm;
import o.ListUtil;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getCardName;
import o.getUserVisibleHint;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/TarikanReservasiUbahTransaksiActivity.class */
public class TarikanReservasiUbahTransaksiActivity extends BaseActivityPostLogin {
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
    LinearLayout llMainIndicator;
    public GetCustAcctListResponse n;
    @BindView(2131298111)
    ProgressBar pbIndicator1;
    @BindView(2131298112)
    ProgressBar pbIndicator2;
    private Bundle q;
    private ListFormTeller r;
    @BindString(2131822092)
    String retry;
    private Long t;
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
    TextView txtToolbarTitle;

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.q = getIntent().getExtras();
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(Html.fromHtml(this.tarikanTunai));
        this.t = Long.valueOf(this.q.getLong("id", 0));
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.TarikanReservasiUbahTransaksiActivity.3
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                TarikanReservasiUbahTransaksiActivity.this.r = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
                Tarikan findFirst = TarikanReservasiUbahTransaksiActivity.this.r.getTarikanList().where().equalTo("id", TarikanReservasiUbahTransaksiActivity.this.t).findFirst();
                if (findFirst != null) {
                    TarikanReservasiUbahTransaksiActivity.this.f = new Tarikan();
                    TarikanReservasiUbahTransaksiActivity.this.f.setId(findFirst.getId());
                    TarikanReservasiUbahTransaksiActivity.this.f.setCurrentPage(findFirst.getCurrentPage());
                    TarikanReservasiUbahTransaksiActivity.this.f.setNoRekening(findFirst.getNoRekening());
                    TarikanReservasiUbahTransaksiActivity.this.f.setJumlah(findFirst.getJumlah());
                    TarikanReservasiUbahTransaksiActivity.this.f.setEmail(findFirst.getEmail());
                    TarikanReservasiUbahTransaksiActivity.this.f.setCreatedAt(findFirst.getCreatedAt());
                }
            }
        });
        if (this.m != null && this.m.getVerified().equals("Y")) {
            this.n = (GetCustAcctListResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("ListAcct"));
        }
        this.tvIndicator1.setVisibility(8);
        this.ivIndicatorClear1.setVisibility(0);
        this.tvIndicator2.setBackgroundResource(2131231203);
        this.tvIndicator2.setTextColor(getResources().getColor(2131099772));
        this.tvIndicator3.setBackgroundResource(2131231202);
        this.tvIndicator3.setTextColor(getResources().getColor(2131099815));
        this.tvIndicator2.setVisibility(0);
        this.ivIndicatorClear2.setVisibility(8);
        ProgressBar progressBar = this.pbIndicator1;
        progressBar.startAnimation(new getCardName(progressBar, 100.0f));
        TReviewTarikanReservasiUbahFragment tReviewTarikanReservasiUbahFragment = new TReviewTarikanReservasiUbahFragment();
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
        getuservisiblehint.e(2130772010, 2130772011);
        getuservisiblehint.d(2131296811, tReviewTarikanReservasiUbahFragment, "TReviewTarikanReservasiUbahFragment", 2);
        getuservisiblehint.b();
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
        setCardSlogan.e().b = "TarikanReservasiUbahTransaksiActivity";
        this.j = "TarikanReservasiUbahTransaksiActivity";
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
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.TarikanReservasiUbahTransaksiActivity.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                for (int i = 0; i < TarikanReservasiUbahTransaksiActivity.this.r.getTarikanList().size(); i++) {
                    if (TarikanReservasiUbahTransaksiActivity.this.r.getTarikanList().get(i).getId() == TarikanReservasiUbahTransaksiActivity.this.t.longValue()) {
                        TarikanReservasiUbahTransaksiActivity.this.r.getTarikanList().set(i, TarikanReservasiUbahTransaksiActivity.this.f);
                    }
                }
            }
        });
        finish();
    }
}
