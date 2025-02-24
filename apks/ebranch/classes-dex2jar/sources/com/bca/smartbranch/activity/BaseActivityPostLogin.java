package com.bca.smartbranch.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bca.smartbranch.App;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import io.realm.Case;
import io.realm.Realm;
import o.KeluarFormReservationDialog_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.UbahPINActivity_ViewBinding;
import o.copyWindowDataInto;
import o.documentProvider;
import o.getText;
import o.getUserVisibleHint;
import o.onClickCardSilver;
import o.onClickNegara;
import o.setCardSlogan;
import o.setPadding;
import o.update;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BaseActivityPostLogin.class */
public abstract class BaseActivityPostLogin extends setPadding {
    @onClickNegara
    public SharedPreferences.Editor editor;
    private getText f;
    protected String h;
    protected String j;
    protected Realm k;
    ProgressDialog l;
    protected User m;
    private Unbinder n;

    /* renamed from: o */
    protected boolean f10o = true;
    @onClickNegara
    public SharedPreferences sharedPreferences;

    protected final void a(View view, String str) {
        KeluarFormReservationDialog_ViewBinding a = KeluarFormReservationDialog_ViewBinding.a(null, view, "", 0);
        KeluarFormReservationDialog_ViewBinding.read b = a.b();
        View inflate = getLayoutInflater().inflate(2131493473, (ViewGroup) null);
        ((TextView) inflate.findViewById(2131299409)).setText(str);
        ((ImageView) inflate.findViewById(2131297327)).setOnClickListener(new View.OnClickListener() { // from class: o.onClickJenisId
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KeluarFormReservationDialog_ViewBinding.this.d();
            }
        });
        b.setPadding(0, 0, 0, 0);
        b.addView(inflate, 0);
        a.g();
    }

    @Override // o.setPadding, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        attachBaseContext(onClickCardSilver.c(context));
    }

    public void d(Bundle bundle) {
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, o.IconCompat, android.app.Activity
    public void onCreate(Bundle bundle) {
        onCreate(bundle);
        setContentView(q());
        this.n = ButterKnife.bind(r());
        this.k = Realm.getDefaultInstance();
        App.d().c(this);
        this.h = this.sharedPreferences.getString("email", "");
        this.m = (User) this.k.where(User.class).equalTo("email", this.h, Case.INSENSITIVE).findFirst();
        this.f = new AutoLogoutDialog();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            boolean z = extras.getBoolean("multiple_login");
            String string = extras.getString("message_multiple_login");
            if (z) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("MessageDialogContent", string);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle2);
                messageDialog.show(l(), "MessageDialog");
            }
        }
        d(bundle);
    }

    @Override // o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        if (documentProvider.b().b(this) && this.f10o) {
            documentProvider.b().e(this);
        }
        this.k.close();
        Unbinder unbinder = this.n;
        if (unbinder != null) {
            unbinder.unbind();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onMultipleLogin(update update) {
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", update.b);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // o.getView, android.app.Activity
    public void onResume() {
        onResume();
        p();
        this.h = this.sharedPreferences.getString("email", "");
        if (this.m != null) {
            setCardSlogan.e().d();
            setCardSlogan.e().c();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onSessionExpiredEvent(UbahPINActivity_ViewBinding ubahPINActivity_ViewBinding) {
        if (ubahPINActivity_ViewBinding.c.equals(this.j) && this.m != null) {
            this.editor.putString("email", "");
            this.editor.commit();
            Bundle bundle = new Bundle();
            bundle.putString("imei", this.m.getImei());
            bundle.putString("email", this.m.getEmail());
            getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
            this.f.setArguments(bundle);
            getuservisiblehint.d(0, this.f, "AutoLogoutDialog", 1);
            getuservisiblehint.c();
        }
    }

    @Override // o.setPadding, o.getView, android.app.Activity
    public void onStart() {
        onStart();
        if (!documentProvider.b().b(this)) {
            documentProvider.b().c(this);
        }
    }

    @Override // o.setPadding, o.getView, android.app.Activity
    public void onStop() {
        if (documentProvider.b().b(this) && !this.f10o) {
            documentProvider.b().e(this);
        }
        onStop();
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        onUserInteraction();
        if (this.m != null) {
            setCardSlogan.e().d();
            setCardSlogan.e().c();
        }
    }

    protected abstract void p();

    protected abstract int q();

    protected abstract Activity r();

    public final User w() {
        return this.m;
    }

    protected final void x() {
        ProgressDialog progressDialog = this.l;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.l.dismiss();
        }
    }

    protected final void z() {
        if (this.l == null) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.l = progressDialog;
            progressDialog.setCanceledOnTouchOutside(false);
            this.l.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        if (!this.l.isShowing()) {
            this.l.show();
            this.l.setContentView(2131493036);
            ((ProgressBar) this.l.findViewById(2131298110)).setProgressTintList(ColorStateList.valueOf(copyWindowDataInto.a(this, 2131099720)));
        }
    }
}
