package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import com.bca.smartbranch.adapter.ListKodePosAdapter;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.presenter.GetAddressPresenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.OpenAccountActivity;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.getPromotion;
import o.onChooseKodePosHome;
import o.onChooseKodePosKantor;
import o.onChooseKodePosRes;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihKodePosActivity.class */
public class PilihKodePosActivity extends BaseActivityPostLogin implements TextWatcher, GetAddressPresenter.IconCompatParcelizer {
    @BindView(2131296980)
    EditText etFilter;
    private ListKodePosAdapter n;
    private GetAddressPresenter p;
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
    List<String> f = new ArrayList();
    private String t = "";

    @Override // com.bca.smartbranch.presenter.GetAddressPresenter.IconCompatParcelizer
    public final void a(String str) {
        this.tvErrorMessage.setText(str);
        this.va.setDisplayedChild(1);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f) {
            if (str.toLowerCase().contains(this.etFilter.getText().toString().toLowerCase())) {
                arrayList.add(str);
            }
        }
        ListKodePosAdapter listKodePosAdapter = this.n;
        listKodePosAdapter.b = arrayList;
        listKodePosAdapter.a.b();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.presenter.GetAddressPresenter.IconCompatParcelizer
    public final void c(OpenAccountActivity openAccountActivity) {
        this.f.addAll(openAccountActivity.b);
        this.n = new ListKodePosAdapter(this, this.f, this.t);
        this.rvListItem.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvListItem.setAdapter(this.n);
        this.va.setDisplayedChild(2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText("Pilih Kode Pos");
        GetAddressPresenter getAddressPresenter = new GetAddressPresenter();
        this.p = getAddressPresenter;
        getAddressPresenter.a = this;
        this.etFilter.addTextChangedListener(this);
        Bundle extras = getIntent().getExtras();
        this.t = extras.getString("type", "");
        HashMap hashMap = new HashMap();
        hashMap.put("provinsi", extras.getString("provinsi", ""));
        hashMap.put("kabupaten", extras.getString("kota", ""));
        hashMap.put("kecamatan", extras.getString("kecamatan", ""));
        hashMap.put("kelurahan", extras.getString("kelurahan", ""));
        this.p.a("kode-pos", hashMap);
    }

    @Override // com.bca.smartbranch.presenter.GetAddressPresenter.IconCompatParcelizer
    public final void d(String str) {
        this.tvErrorMessage.setText(str);
        this.va.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.GetAddressPresenter.IconCompatParcelizer
    public final void e(String str) {
        this.tvErrorMessage.setText(str);
        this.va.setDisplayedChild(1);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKodePos(onChooseKodePosHome onchoosekodeposhome) {
        getPromotion.d(this);
        finish();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKodePosHome(o.PilihKodePosActivity pilihKodePosActivity) {
        getPromotion.d(this);
        finish();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKodePosKantor(onChooseKodePosRes onchoosekodeposres) {
        getPromotion.d(this);
        finish();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKodePosRes(onChooseKodePosKantor onchoosekodeposkantor) {
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
        GetAddressPresenter getAddressPresenter = this.p;
        Call<OpenAccountSuccessActivity<OpenAccountActivity>> call = getAddressPresenter.e;
        if (call != null) {
            call.cancel();
        }
        getAddressPresenter.a = null;
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
        setCardSlogan.e().b = "PilihKodePosActivity";
        this.j = "PilihKodePosActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492983;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Override // com.bca.smartbranch.presenter.GetAddressPresenter.IconCompatParcelizer
    public final void s() {
        this.va.setDisplayedChild(0);
    }
}
