package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/SplashScreenActivity.class */
public class SplashScreenActivity extends BaseActivityPreLogin {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    public final void b(Bundle bundle) {
        b(bundle);
        new Handler().postDelayed(new Runnable() { // from class: com.bca.smartbranch.activity.SplashScreenActivity.2
            @Override // java.lang.Runnable
            public final void run() {
                SplashScreenActivity.this.startActivity(new Intent(SplashScreenActivity.this.getBaseContext(), LandingActivity.class));
                SplashScreenActivity.this.overridePendingTransition(2130771997, 2130771999);
                SplashScreenActivity.this.finish();
            }
        }, 2000);
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    protected final int p() {
        return 2131493001;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    protected final Activity r() {
        return this;
    }
}
