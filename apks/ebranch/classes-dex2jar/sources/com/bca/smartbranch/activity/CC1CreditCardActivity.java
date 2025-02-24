package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import butterknife.OnClick;
import o.setCardSlogan;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC1CreditCardActivity.class */
public class CC1CreditCardActivity extends BaseActivityPostLogin {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
    }

    @OnClick({2131296381})
    public void onClickedBelum() {
        startActivity(new Intent(this, CC2AskAccountActivity.class));
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "CC1CreditCardActivity";
        this.j = "CC1CreditCardActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492903;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
