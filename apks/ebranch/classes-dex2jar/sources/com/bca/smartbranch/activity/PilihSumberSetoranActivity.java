package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.PilihSumberSetoranActivity;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import io.realm.Realm;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihSumberSetoranActivity.class */
public class PilihSumberSetoranActivity extends BaseActivityPostLogin {
    public ListFormTeller f;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822281)
    String toolbarTitle;
    @BindView(2131298790)
    TextView txtToolbarTitle;

    @OnClick({2131296456})
    public void clickSumberSetoran(View view) {
        ListFormTeller listFormTeller = this.f;
        if (listFormTeller == null || listFormTeller.getCountAll() == 0) {
            Intent intent = new Intent(this, AskAccountActivity.class);
            intent.putExtra("product_type", "setoran");
            intent.putExtra("title", getString(2131822282));
            startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(this, FormTellerActivity.class);
        intent2.putExtra("TellerType", "setoran");
        startActivity(intent2);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitle));
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.openRingkasanActivity
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                PilihSumberSetoranActivity.this.f = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
            }
        });
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
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "TransaksiTellerActivity";
        this.j = "TransaksiTellerActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492986;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
