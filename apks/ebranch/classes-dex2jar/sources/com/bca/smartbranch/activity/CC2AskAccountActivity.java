package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.data.api.response.CardType;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.onHiddenChanged;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC2AskAccountActivity.class */
public class CC2AskAccountActivity extends BaseActivityPostLogin {
    private List<CardType> f = new ArrayList();
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView tvToolbarTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbarTitle.setText(2131822011);
        this.f = (List) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("LIST_CARD"));
    }

    @OnClick({2131296416})
    public void onCLickedBelum() {
        Intent intent = new Intent(this, CC3ChooseBCACardActivity.class);
        intent.putExtra("LIST_CARD", ListUtil.OneItemImmutableList.e(this.f));
        startActivity(intent);
    }

    @OnClick({2131296462})
    public void onClickedYes() {
        startActivity(new Intent(this, CC3SKartuUtamaActivity.class));
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
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            onHiddenChanged.d((Activity) this);
            return true;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "CC2AskAccountActivity";
        this.j = "CC2AskAccountActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492904;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
