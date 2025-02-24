package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import com.bca.smartbranch.adapter.ListBankPenerbitAdapter;
import com.bca.smartbranch.data.api.response.CategoryResponse;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.PilihBidangUsahaActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.getPromotion;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihBankPenerbitActivity.class */
public class PilihBankPenerbitActivity extends BaseActivityPostLogin implements TextWatcher {
    @BindView(2131296980)
    EditText etFilter;
    List<CategoryResponse> f = new ArrayList();
    @BindView(2131297536)
    LinearLayout llBankPenerbitTidakDitemukan;
    private ListBankPenerbitAdapter n;
    @BindView(2131298328)
    setOnStartEnterTransitionListener rvListItem;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    @BindView(2131299749)
    ViewAnimator va;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        ArrayList arrayList = new ArrayList();
        for (CategoryResponse categoryResponse : this.f) {
            if (categoryResponse.getDescription().toLowerCase().contains(this.etFilter.getText().toString().toLowerCase())) {
                arrayList.add(categoryResponse);
            }
        }
        ListBankPenerbitAdapter listBankPenerbitAdapter = this.n;
        listBankPenerbitAdapter.e = arrayList;
        listBankPenerbitAdapter.a.b();
        if (arrayList.size() <= 0) {
            this.llBankPenerbitTidakDitemukan.setVisibility(0);
        } else {
            this.llBankPenerbitTidakDitemukan.setVisibility(8);
        }
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
        this.txtToolbarTitle.setText("Pilih Bank Penerbit");
        this.etFilter.addTextChangedListener(this);
        List<CategoryResponse> list = (List) ListUtil.OneItemImmutableList.a(getIntent().getExtras().getParcelable("list_data"));
        this.f = list;
        this.n = new ListBankPenerbitAdapter(this, list);
        this.rvListItem.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvListItem.setAdapter(this.n);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseBankPenerbit(PilihBidangUsahaActivity_ViewBinding pilihBidangUsahaActivity_ViewBinding) {
        getPromotion.d(this);
        finish();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558409, menu);
        return true;
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
            yakinKeluarDialog.d = "transaction_cs";
            yakinKeluarDialog.show(l(), "YakinKeluarDialog");
            return true;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "PilihBankPenerbitActivity";
        this.j = "PilihBankPenerbitActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492976;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
