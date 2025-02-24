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
import com.bca.smartbranch.adapter.ListKecamatanAdapter;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.presenter.GetAddressPresenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.OpenAccountActivity;
import o.OpenAccountSuccessActivity;
import o.PilihKelurahanActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.getPromotion;
import o.onChooseKelurahan;
import o.onChooseKelurahanHome;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihKecamatanActivity.class */
public class PilihKecamatanActivity extends BaseActivityPostLogin implements TextWatcher, GetAddressPresenter.IconCompatParcelizer {
    @BindView(2131296980)
    EditText etFilter;
    private ListKecamatanAdapter n;
    @BindView(2131298328)
    setOnStartEnterTransitionListener rvListItem;
    private GetAddressPresenter s;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    @BindView(2131299749)
    ViewAnimator va;
    List<String> f = new ArrayList();
    private String p = "";

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
        ListKecamatanAdapter listKecamatanAdapter = this.n;
        listKecamatanAdapter.e = arrayList;
        listKecamatanAdapter.a.b();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.presenter.GetAddressPresenter.IconCompatParcelizer
    public final void c(OpenAccountActivity openAccountActivity) {
        this.f.addAll(openAccountActivity.a);
        this.n = new ListKecamatanAdapter(this, this.f, this.p);
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
        this.txtToolbarTitle.setText("Pilih Kecamatan");
        GetAddressPresenter getAddressPresenter = new GetAddressPresenter();
        this.s = getAddressPresenter;
        getAddressPresenter.a = this;
        this.etFilter.addTextChangedListener(this);
        Bundle extras = getIntent().getExtras();
        this.p = extras.getString("type", "");
        HashMap hashMap = new HashMap();
        hashMap.put("provinsi", extras.getString("provinsi", ""));
        hashMap.put("kabupaten", extras.getString("kota", ""));
        this.s.a("kecamatan", hashMap);
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
    public void onChooseKecamatan(onChooseKelurahan onchoosekelurahan) {
        getPromotion.d(this);
        finish();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKecamatanHome(PilihKelurahanActivity_ViewBinding pilihKelurahanActivity_ViewBinding) {
        getPromotion.d(this);
        finish();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKecamatanHome(onChooseKelurahanHome onchoosekelurahanhome) {
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
        GetAddressPresenter getAddressPresenter = this.s;
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
        setCardSlogan.e().b = "PilihKecamatanActivity";
        this.j = "PilihKecamatanActivity";
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
