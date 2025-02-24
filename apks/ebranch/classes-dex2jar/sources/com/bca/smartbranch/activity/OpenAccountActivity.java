package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindArray;
import butterknife.BindString;
import butterknife.BindView;
import com.bca.smartbranch.adapter.MenuPemrekAdapter;
import com.bca.smartbranch.dialog.MessageDialog;
import java.util.ArrayList;
import java.util.List;
import o.ConfirmVisaAdapter$ViewHolder_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.UbahProfilActivity_ViewBinding;
import o.clickJenisIdentitasPemilikSumberDana;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/OpenAccountActivity.class */
public class OpenAccountActivity extends BaseActivityPostLogin {
    @BindArray(2130903041)
    String[] accountDesc;
    @BindArray(2130903042)
    String[] accountType;
    private boolean n;
    private long r;
    @BindView(2131298316)
    setOnStartEnterTransitionListener rvAccountType;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822236)
    String toolbarTitle;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    int[] f = {2131231210, 2131231214, 2131231411, 2131230823, 2131231410};
    private List<ConfirmVisaAdapter$ViewHolder_ViewBinding> t = new ArrayList();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitle));
        this.sharedPreferences.edit().putBoolean("from_info_product", false).commit();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.n = extras.getBoolean("is_from_reservation", false);
            this.r = extras.getLong("id_reservation", 0);
        }
        int length = this.accountType.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            ConfirmVisaAdapter$ViewHolder_ViewBinding confirmVisaAdapter$ViewHolder_ViewBinding = new ConfirmVisaAdapter$ViewHolder_ViewBinding();
            confirmVisaAdapter$ViewHolder_ViewBinding.c = this.accountType[i];
            confirmVisaAdapter$ViewHolder_ViewBinding.e = this.f[i];
            confirmVisaAdapter$ViewHolder_ViewBinding.b = this.accountDesc[i];
            this.t.add(confirmVisaAdapter$ViewHolder_ViewBinding);
            i++;
        }
        if (this.m == null) {
            List<ConfirmVisaAdapter$ViewHolder_ViewBinding> list = this.t;
            list.remove(list.size() - 1);
        }
        MenuPemrekAdapter menuPemrekAdapter = new MenuPemrekAdapter();
        menuPemrekAdapter.b = this.t;
        menuPemrekAdapter.a.b();
        this.rvAccountType.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvAccountType.setAdapter(menuPemrekAdapter);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onClickDetail(UbahProfilActivity_ViewBinding ubahProfilActivity_ViewBinding) {
        Intent intent = new Intent(this, InfoProductActivity.class);
        if (this.t.get(ubahProfilActivity_ViewBinding.d).c.equals(this.accountType[0])) {
            intent.putExtra("product_type", "Tahapan BCA");
        } else if (this.t.get(ubahProfilActivity_ViewBinding.d).c.equals(this.accountType[1])) {
            intent.putExtra("product_type", "Tahapan Xpresi");
        } else if (this.t.get(ubahProfilActivity_ViewBinding.d).c.equals(this.accountType[2])) {
            intent.putExtra("product_type", "Tapres BCA");
        } else if (this.t.get(ubahProfilActivity_ViewBinding.d).c.equals(this.accountType[3])) {
            intent.putExtra("product_type", "BCA Dollar");
        } else if (this.t.get(ubahProfilActivity_ViewBinding.d).c.equals(this.accountType[4])) {
            intent.putExtra("product_type", "Tahapan Berjangka");
        }
        intent.putExtra("old_cust", this.m != null ? this.m.getVerified() : "N");
        boolean z = false;
        if (this.m != null) {
            z = false;
            if (this.m.isMember()) {
                z = true;
            }
        }
        intent.putExtra("is_member", z);
        boolean z2 = this.n;
        if (z2) {
            intent.putExtra("is_from_reservation", z2);
            intent.putExtra("id_reservation", this.r);
        }
        startActivity(intent);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onClickMenu(ConfirmVisaAdapter$ViewHolder_ViewBinding confirmVisaAdapter$ViewHolder_ViewBinding) {
        String verified = this.m != null ? this.m.getVerified() : "N";
        if (confirmVisaAdapter$ViewHolder_ViewBinding.c.equals(this.accountType[4])) {
            if (this.m == null) {
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", getString(2131822440));
                bundle.putString("MessageDialogTitle", getString(2131822223));
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(l(), "MessageDialog");
                return;
            }
            Intent intent = new Intent(this, FormActivity.class);
            intent.putExtra("product_type", confirmVisaAdapter$ViewHolder_ViewBinding.c);
            intent.putExtra("old_cust", "Y");
            boolean z = this.n;
            if (z) {
                intent.putExtra("is_from_reservation", z);
                intent.putExtra("id_reservation", this.r);
            }
            startActivity(intent);
        } else if (this.m == null) {
            Intent intent2 = new Intent(this, FormActivity.class);
            intent2.putExtra("product_type", confirmVisaAdapter$ViewHolder_ViewBinding.c);
            intent2.putExtra("old_cust", "N");
            boolean z2 = this.n;
            if (z2) {
                intent2.putExtra("is_from_reservation", z2);
                intent2.putExtra("id_reservation", this.r);
            }
            startActivity(intent2);
        } else if (verified.equals("Y")) {
            Intent intent3 = new Intent(this, FormActivity.class);
            intent3.putExtra("product_type", confirmVisaAdapter$ViewHolder_ViewBinding.c);
            intent3.putExtra("old_cust", "Y");
            boolean z3 = this.n;
            if (z3) {
                intent3.putExtra("is_from_reservation", z3);
                intent3.putExtra("id_reservation", this.r);
            }
            startActivity(intent3);
        } else {
            Intent intent4 = new Intent(this, AskAccountActivity.class);
            intent4.putExtra("product_type", confirmVisaAdapter$ViewHolder_ViewBinding.c);
            boolean z4 = this.n;
            if (z4) {
                intent4.putExtra("is_from_reservation", z4);
                intent4.putExtra("id_reservation", this.r);
            }
            startActivity(intent4);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onFormSuccess(clickJenisIdentitasPemilikSumberDana clickjenisidentitaspemiliksumberdana) {
        finish();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        k();
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "OpenAccountActivity";
        this.j = "OpenAccountActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492968;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
