package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.adapter.ListNegaraPemrekAdapter;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.presenter.GetCountriesPresenter;
import com.bca.smartbranch.presenter.GetCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import java.util.ArrayList;
import java.util.List;
import o.OpenAccountSuccessActivity;
import o.OpenCCSuccessActivity_ViewBinding;
import o.PilihNegaraBagianActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.getPromotion;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihNegaraPemrekActivity.class */
public class PilihNegaraPemrekActivity extends BaseActivityPostLogin implements TextWatcher, GetCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    @BindView(2131296980)
    EditText etFilter;
    List<OpenCCSuccessActivity_ViewBinding.read> f = new ArrayList();
    @BindView(2131297813)
    LinearLayout llNegaraTidakDitemukan;
    private ListNegaraPemrekAdapter n;
    private GetCountriesPresenter p;
    private String q;
    @BindView(2131298328)
    setOnStartEnterTransitionListener rvListItem;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    @BindView(2131299749)
    ViewAnimator va;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        ArrayList arrayList = new ArrayList();
        for (OpenCCSuccessActivity_ViewBinding.read read : this.f) {
            if (read.b.toLowerCase().contains(this.etFilter.getText().toString().toLowerCase())) {
                arrayList.add(read);
            }
        }
        ListNegaraPemrekAdapter listNegaraPemrekAdapter = this.n;
        listNegaraPemrekAdapter.e = arrayList;
        listNegaraPemrekAdapter.a.b();
        if (arrayList.size() <= 0) {
            this.llNegaraTidakDitemukan.setVisibility(0);
        } else {
            this.llNegaraTidakDitemukan.setVisibility(8);
        }
    }

    @Override // com.bca.smartbranch.presenter.GetCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(String str) {
        this.tvErrorMessage.setText(str);
        this.va.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.GetCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(OpenCCSuccessActivity_ViewBinding openCCSuccessActivity_ViewBinding) {
        this.f = openCCSuccessActivity_ViewBinding.c;
        if (this.q.equals("NEGARA_PASPOR") || this.q.equals("NEGARA_ALAMAT")) {
            OpenCCSuccessActivity_ViewBinding.read read = null;
            for (OpenCCSuccessActivity_ViewBinding.read read2 : this.f) {
                if (read2.c.equals("ID")) {
                    read = read2;
                }
            }
            if (read != null) {
                this.f.remove(read);
            }
        }
        this.n = new ListNegaraPemrekAdapter(this, openCCSuccessActivity_ViewBinding.c, this.q);
        this.rvListItem.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvListItem.setAdapter(this.n);
        this.va.setDisplayedChild(2);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText("Pilih Negara");
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.q = extras.getString("type", "");
        }
        this.etFilter.addTextChangedListener(this);
        GetCountriesPresenter getCountriesPresenter = new GetCountriesPresenter();
        this.p = getCountriesPresenter;
        getCountriesPresenter.b = this;
        this.p.e();
    }

    @Override // com.bca.smartbranch.presenter.GetCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(String str) {
        this.tvErrorMessage.setText(str);
        this.va.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.GetCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(String str) {
        this.tvErrorMessage.setText(str);
        this.va.setDisplayedChild(1);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseNegara(PilihNegaraBagianActivity pilihNegaraBagianActivity) {
        getPromotion.d(this);
        finish();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        GetCountriesPresenter getCountriesPresenter = this.p;
        Call<OpenAccountSuccessActivity<OpenCCSuccessActivity_ViewBinding>> call = getCountriesPresenter.c;
        if (call != null) {
            call.cancel();
        }
        getCountriesPresenter.c = null;
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
            new YakinKeluarDialog().show(l(), "YakinKeluarDialog");
            return true;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "PilihNegaraPemrekActivity";
        this.j = "PilihNegaraPemrekActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492983;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131296446})
    public void retry(View view) {
        this.p.e();
    }

    @Override // com.bca.smartbranch.presenter.GetCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void s() {
        this.va.setDisplayedChild(0);
    }
}
