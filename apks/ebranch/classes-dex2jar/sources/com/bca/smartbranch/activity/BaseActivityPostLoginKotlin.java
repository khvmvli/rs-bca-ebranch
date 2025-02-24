package com.bca.smartbranch.activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import com.bca.smartbranch.App;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import io.realm.Case;
import io.realm.Realm;
import java.util.LinkedHashMap;
import java.util.Map;
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
import o.subscribeReservationRescheduleEvent;
import o.update;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BaseActivityPostLoginKotlin.class */
public abstract class BaseActivityPostLoginKotlin extends setPadding {
    public static final RemoteActionCompatParcelizer x = new RemoteActionCompatParcelizer((byte) 0);
    protected Realm B;
    protected User D;
    @onClickNegara
    public SharedPreferences.Editor editor;
    private String f;
    private getText h;
    private String j;
    private ProgressDialog k;
    @onClickNegara
    public SharedPreferences sharedPreferences;
    public Map<Integer, View> C = new LinkedHashMap();

    /* renamed from: o  reason: collision with root package name */
    private boolean f11o = true;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BaseActivityPostLoginKotlin$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    protected abstract View D();

    protected final void E() {
        ProgressDialog progressDialog = this.k;
        if (progressDialog != null) {
            subscribeReservationRescheduleEvent.c(progressDialog);
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = this.k;
                subscribeReservationRescheduleEvent.c(progressDialog2);
                progressDialog2.dismiss();
            }
        }
    }

    protected final String F() {
        return this.f;
    }

    protected abstract void G();

    public final Realm H() {
        Realm realm = this.B;
        if (realm != null) {
            return realm;
        }
        subscribeReservationRescheduleEvent.e("");
        return null;
    }

    public final User J() {
        User user = this.D;
        if (user != null) {
            return user;
        }
        subscribeReservationRescheduleEvent.e("");
        return null;
    }

    protected final void N() {
        if (this.k == null) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.k = progressDialog;
            subscribeReservationRescheduleEvent.c(progressDialog);
            progressDialog.setCanceledOnTouchOutside(false);
            ProgressDialog progressDialog2 = this.k;
            subscribeReservationRescheduleEvent.c(progressDialog2);
            Window window = progressDialog2.getWindow();
            subscribeReservationRescheduleEvent.c(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        ProgressDialog progressDialog3 = this.k;
        subscribeReservationRescheduleEvent.c(progressDialog3);
        if (!progressDialog3.isShowing()) {
            ProgressDialog progressDialog4 = this.k;
            subscribeReservationRescheduleEvent.c(progressDialog4);
            progressDialog4.show();
            ProgressDialog progressDialog5 = this.k;
            subscribeReservationRescheduleEvent.c(progressDialog5);
            progressDialog5.setContentView(2131493036);
            ProgressDialog progressDialog6 = this.k;
            subscribeReservationRescheduleEvent.c(progressDialog6);
            ((ProgressBar) progressDialog6.findViewById(2131298110)).setProgressTintList(ColorStateList.valueOf(copyWindowDataInto.a(this, 2131099720)));
        }
    }

    @Override // o.setPadding, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        subscribeReservationRescheduleEvent.e(context, "");
        onClickCardSilver.write write = onClickCardSilver.b;
        subscribeReservationRescheduleEvent.b((Object) context, "");
        attachBaseContext(new onClickCardSilver(context, (byte) 0));
    }

    public void c(Bundle bundle) {
    }

    protected final void e(boolean z) {
        this.f11o = z;
    }

    protected final void h(String str) {
        this.j = str;
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, o.IconCompat, android.app.Activity
    public void onCreate(Bundle bundle) {
        onCreate(bundle);
        setContentView(D());
        Realm defaultInstance = Realm.getDefaultInstance();
        subscribeReservationRescheduleEvent.d(defaultInstance, "");
        subscribeReservationRescheduleEvent.e(defaultInstance, "");
        this.B = defaultInstance;
        App.d().c(this);
        SharedPreferences sharedPreferences = this.sharedPreferences;
        Realm realm = null;
        if (sharedPreferences == null) {
            subscribeReservationRescheduleEvent.e("");
            sharedPreferences = null;
        }
        subscribeReservationRescheduleEvent.c(sharedPreferences);
        this.f = sharedPreferences.getString("email", "");
        realm = this.B;
        if (realm == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        Object findFirst = realm.where(User.class).equalTo("email", this.f, Case.INSENSITIVE).findFirst();
        subscribeReservationRescheduleEvent.c(findFirst);
        User user = (User) findFirst;
        subscribeReservationRescheduleEvent.e(user, "");
        this.D = user;
        this.h = new AutoLogoutDialog();
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
        c(bundle);
    }

    @Override // o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        if (documentProvider.b().b(this) && this.f11o) {
            documentProvider.b().e(this);
        }
        Realm realm = this.B;
        if (realm == null) {
            subscribeReservationRescheduleEvent.e("");
            realm = null;
        }
        subscribeReservationRescheduleEvent.c(realm);
        realm.close();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onMultipleLogin(update update) {
        subscribeReservationRescheduleEvent.e(update, "");
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", update.b);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // o.getView, android.app.Activity
    public void onResume() {
        onResume();
        G();
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences == null) {
            subscribeReservationRescheduleEvent.e("");
            sharedPreferences = null;
        }
        subscribeReservationRescheduleEvent.c(sharedPreferences);
        this.f = sharedPreferences.getString("email", "");
        setCardSlogan.e().d();
        setCardSlogan.e().c();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onSessionExpiredEvent(UbahPINActivity_ViewBinding ubahPINActivity_ViewBinding) {
        subscribeReservationRescheduleEvent.e(ubahPINActivity_ViewBinding, "");
        if (subscribeReservationRescheduleEvent.b((Object) ubahPINActivity_ViewBinding.c, (Object) this.j)) {
            User user = this.D;
            User user2 = null;
            if (user == null) {
                subscribeReservationRescheduleEvent.e("");
                user = null;
            }
            if (user != null) {
                SharedPreferences.Editor editor = this.editor;
                if (editor == null) {
                    subscribeReservationRescheduleEvent.e("");
                    editor = null;
                }
                subscribeReservationRescheduleEvent.c(editor);
                editor.putString("email", "");
                SharedPreferences.Editor editor2 = this.editor;
                if (editor2 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    editor2 = null;
                }
                subscribeReservationRescheduleEvent.c(editor2);
                editor2.commit();
                Bundle bundle = new Bundle();
                User user3 = this.D;
                if (user3 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    user3 = null;
                }
                subscribeReservationRescheduleEvent.c(user3);
                bundle.putString("imei", user3.getImei());
                user2 = this.D;
                if (user2 == null) {
                    subscribeReservationRescheduleEvent.e("");
                }
                subscribeReservationRescheduleEvent.c(user2);
                bundle.putString("email", user2.getEmail());
                getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
                subscribeReservationRescheduleEvent.d(getuservisiblehint, "");
                getText gettext = this.h;
                subscribeReservationRescheduleEvent.c(gettext);
                gettext.setArguments(bundle);
                getText gettext2 = this.h;
                subscribeReservationRescheduleEvent.c(gettext2);
                getuservisiblehint.d(0, gettext2, "AutoLogoutDialog", 1);
                getuservisiblehint.c();
            }
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
        if (documentProvider.b().b(this) && !this.f11o) {
            documentProvider.b().e(this);
        }
        onStop();
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        onUserInteraction();
        setCardSlogan.e().d();
        setCardSlogan.e().c();
    }
}
