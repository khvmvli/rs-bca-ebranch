package com.bca.smartbranch.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bca.smartbranch.App;
import com.bca.smartbranch.data.localdb.User;
import io.realm.Case;
import io.realm.Realm;
import o.copyWindowDataInto;
import o.onClickCardSilver;
import o.onClickNegara;
import o.setPadding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BaseActivityPreLogin.class */
public abstract class BaseActivityPreLogin extends setPadding {
    protected String f;
    protected Realm h;
    protected User j;
    private Unbinder k;
    private ProgressDialog n;
    @onClickNegara
    public SharedPreferences sharedPreferences;

    @Override // o.setPadding, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        attachBaseContext(onClickCardSilver.c(context));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Bundle bundle) {
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, o.IconCompat, android.app.Activity
    public void onCreate(Bundle bundle) {
        onCreate(bundle);
        setContentView(p());
        this.k = ButterKnife.bind(r());
        this.h = Realm.getDefaultInstance();
        App.d().b(this);
        this.f = this.sharedPreferences.getString("email", "");
        this.j = (User) this.h.where(User.class).equalTo("email", this.f, Case.INSENSITIVE).findFirst();
        b(bundle);
    }

    @Override // o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        this.h.close();
        Unbinder unbinder = this.k;
        if (unbinder != null) {
            unbinder.unbind();
        }
    }

    @Override // o.getView, android.app.Activity
    public void onResume() {
        onResume();
        this.f = this.sharedPreferences.getString("email", "");
    }

    protected abstract int p();

    protected final void q() {
        ProgressDialog progressDialog = this.n;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.n.dismiss();
        }
    }

    protected abstract Activity r();

    protected final void t() {
        if (this.n == null) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.n = progressDialog;
            progressDialog.setCanceledOnTouchOutside(false);
            this.n.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        if (!this.n.isShowing()) {
            this.n.show();
            this.n.setContentView(2131493036);
            ((ProgressBar) this.n.findViewById(2131298110)).setProgressTintList(ColorStateList.valueOf(copyWindowDataInto.a(this, 2131099720)));
        }
    }
}
