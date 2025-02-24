package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.adapter.BenefitAdapter;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import io.realm.Case;
import io.realm.Realm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.documentProvider;
import o.findFragmentByWho;
import o.getLifecycle;
import o.onChooseProvinsi;
import o.onChooseTanggalJatuhTempo;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnHierarchyChangeListener;
import o.setOnStartEnterTransitionListener;
import o.setSplitTrack;
import o.showDataKartuTambahan1;
import o.showKtpPage;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC22SubBCACardInfoActivity.class */
public class CC22SubBCACardInfoActivity extends BaseActivityPostLogin {
    @BindView(2131296421)
    Button btnPilihKartu;
    @BindView(2131296836)
    setSplitTrack cvImageLandscape;
    @BindView(2131296837)
    setSplitTrack cvImagePortrait;
    private BenefitAdapter f;
    @BindView(2131297374)
    ImageView ivImageLandscape;
    @BindView(2131297375)
    ImageView ivImagePortrait;
    private String n;
    @BindView(2131298093)
    getLifecycle nsvMain;
    private String p;
    private List<String> q = new ArrayList();
    private String r;
    @BindView(2131298327)
    setOnStartEnterTransitionListener rvKeuntungan;
    private String s;
    private String t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299315)
    TextView tvJudul;
    @BindView(2131298790)
    TextView tvToolbarTitle;
    private boolean u;
    private User v;
    private CreditCard w;
    private int x;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        findFragmentByWho.d((View) this.rvKeuntungan, false);
        Bundle extras = getIntent().getExtras();
        this.w = (CreditCard) this.k.where(CreditCard.class).equalTo("id", Long.valueOf(extras.getLong("current_cc_id"))).findFirst();
        this.v = (User) this.k.where(User.class).equalTo("email", extras.getString("current_user_id"), Case.INSENSITIVE).findFirst();
        this.s = extras.getString("card_name");
        this.t = extras.getString("card_image");
        this.n = extras.getString("card_annual_fee_basic");
        this.r = extras.getString("card_income");
        String str = this.n;
        if (str != null && !str.isEmpty()) {
            this.q.add(getString(2131820571, this.n));
        }
        String str2 = this.r;
        if (str2 != null && !str2.isEmpty()) {
            this.q.add(getString(2131821253, this.r));
        }
        Iterator it = ((ArrayList) Objects.requireNonNull(extras.getStringArrayList("card_benefit"))).iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!str3.isEmpty()) {
                this.q.add(str3);
            }
        }
        this.x = extras.getInt("index");
        this.p = extras.getString("card_orientation");
        this.u = extras.getBoolean("is_checked");
        this.tvToolbarTitle.setText("Info Kartu");
        this.tvJudul.setText(this.s);
        if (this.p.equals("LANDSCAPE")) {
            this.cvImageLandscape.setVisibility(0);
            this.cvImagePortrait.setVisibility(8);
            showKtpPage e = onChooseTanggalJatuhTempo.d(this).a(this.t.replaceAll(" ", "%20")).e(2131231395);
            e.e = true;
            e.a(this.ivImageLandscape, (showDataKartuTambahan1) null);
        } else if (this.p.equals("PORTRAIT")) {
            this.cvImageLandscape.setVisibility(8);
            this.cvImagePortrait.setVisibility(0);
            showKtpPage e2 = onChooseTanggalJatuhTempo.d(this).a(this.t.replaceAll(" ", "%20")).e(2131231395);
            e2.e = true;
            e2.a(this.ivImagePortrait, (showDataKartuTambahan1) null);
        }
        this.f = new BenefitAdapter(this, this.q);
        this.rvKeuntungan.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvKeuntungan.setAdapter(this.f);
        if (this.u) {
            this.btnPilihKartu.setEnabled(false);
        } else {
            this.btnPilihKartu.setEnabled(true);
        }
    }

    @OnClick({2131296421})
    public void onCLickedPilihKartu() {
        k();
        documentProvider.b().d(new onChooseProvinsi(this.x, true));
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        String str = reservasiSuccessEChannelActivity_ViewBinding.d;
        str.hashCode();
        if (str.equals("N")) {
            this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC22SubBCACardInfoActivity.5
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC22SubBCACardInfoActivity.this.w.cascadeDelete();
                }
            });
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            setOnHierarchyChangeListener.d((Activity) this);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        String str = tarikanReservasiUbahTransaksiActivity_ViewBinding.a;
        str.hashCode();
        if (str.equals("Y")) {
            this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC22SubBCACardInfoActivity.4
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC22SubBCACardInfoActivity.this.w.cascadeDelete();
                }
            });
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            setOnHierarchyChangeListener.d((Activity) this);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            k();
            return true;
        } else if (menuItem.getItemId() != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            if (this.v.isMember()) {
                new SimpanDraftDialog().show(l(), "SimpanDraftDialog");
                return true;
            }
            new YakinKeluarDialog().show(l(), "YakinKeluarDialog");
            return true;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "CC22SubBCACardInfoActivity";
        this.j = "CC22SubBCACardInfoActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492908;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
