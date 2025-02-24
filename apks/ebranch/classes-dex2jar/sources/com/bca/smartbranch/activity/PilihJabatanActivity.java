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
import com.bca.smartbranch.adapter.ListJabatanAdapter;
import com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.presenter.GetDaftarDetailPekerjaanPresenter;
import java.util.ArrayList;
import java.util.List;
import o.OpenAccountSuccessActivity;
import o.PilihKantorCabangEChannelActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.getPromotion;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihJabatanActivity.class */
public class PilihJabatanActivity extends BaseActivityPostLogin implements TextWatcher, GetDaftarDetailPekerjaanPresenter.write {
    @BindView(2131296980)
    EditText etFilter;
    List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> f = new ArrayList();
    private ListJabatanAdapter n;
    @BindView(2131298328)
    setOnStartEnterTransitionListener rvListItem;
    private GetDaftarDetailPekerjaanPresenter t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    @BindView(2131299749)
    ViewAnimator va;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        ArrayList arrayList = new ArrayList();
        for (GetDaftarPekerjaanResponse.DataPekerjaanOutput dataPekerjaanOutput : this.f) {
            if (dataPekerjaanOutput.getDescription().toLowerCase().contains(this.etFilter.getText().toString().toLowerCase())) {
                arrayList.add(dataPekerjaanOutput);
            }
        }
        ListJabatanAdapter listJabatanAdapter = this.n;
        listJabatanAdapter.b = arrayList;
        listJabatanAdapter.a.b();
    }

    @Override // com.bca.smartbranch.presenter.GetDaftarDetailPekerjaanPresenter.write
    public final void b(GetDaftarPekerjaanResponse getDaftarPekerjaanResponse) {
        this.va.setDisplayedChild(2);
        List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> daftarPekerjaanOutputList = getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList();
        this.f = daftarPekerjaanOutputList;
        this.n = new ListJabatanAdapter(this, daftarPekerjaanOutputList);
        this.rvListItem.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvListItem.setAdapter(this.n);
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
        this.txtToolbarTitle.setText("Pilih Jabatan");
        Bundle extras = getIntent().getExtras();
        GetDaftarDetailPekerjaanPresenter getDaftarDetailPekerjaanPresenter = new GetDaftarDetailPekerjaanPresenter();
        this.t = getDaftarDetailPekerjaanPresenter;
        getDaftarDetailPekerjaanPresenter.a = this;
        this.t.d(extras.getString("next_cat"));
        this.etFilter.addTextChangedListener(this);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseJabatan(PilihKantorCabangEChannelActivity pilihKantorCabangEChannelActivity) {
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
        GetDaftarDetailPekerjaanPresenter getDaftarDetailPekerjaanPresenter = this.t;
        Call<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> call = getDaftarDetailPekerjaanPresenter.d;
        if (call != null) {
            call.cancel();
        }
        getDaftarDetailPekerjaanPresenter.a = null;
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
            new YakinKeluarDialog().show(l(), "YakinKeluarDialog");
            return true;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "PilihJabatanActivity";
        this.j = "PilihJabatanActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492983;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Override // com.bca.smartbranch.presenter.GetDaftarDetailPekerjaanPresenter.write
    public final void s() {
        this.va.setDisplayedChild(0);
    }
}
