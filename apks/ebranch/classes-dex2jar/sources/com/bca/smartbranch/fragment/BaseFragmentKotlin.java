package com.bca.smartbranch.fragment;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bca.smartbranch.App;
import com.bca.smartbranch.data.localdb.User;
import io.realm.Case;
import io.realm.Realm;
import java.util.LinkedHashMap;
import java.util.Map;
import o.getUserVisibleHint;
import o.onClickNegara;
import o.subscribeReservationRescheduleEvent;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BaseFragmentKotlin.class */
public abstract class BaseFragmentKotlin extends Fragment {
    private String c;
    private ProgressDialog e;
    @onClickNegara
    public SharedPreferences.Editor editor;
    protected Realm f;
    public Map<Integer, View> i = new LinkedHashMap();
    protected User j;
    @onClickNegara
    public SharedPreferences sharedPreferences;

    protected final void b(int i, Fragment fragment, String str) {
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(getParentFragmentManager());
        subscribeReservationRescheduleEvent.d(getuservisiblehint, "");
        getuservisiblehint.e(2130772009, 2130772012);
        subscribeReservationRescheduleEvent.c(fragment);
        getuservisiblehint.d(2131296811, fragment, str, 2);
        getuservisiblehint.b();
    }

    public void e() {
        this.i.clear();
    }

    public final void e(int i, Fragment fragment, String str) {
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(getParentFragmentManager());
        subscribeReservationRescheduleEvent.d(getuservisiblehint, "");
        getuservisiblehint.e(2130772010, 2130772011);
        subscribeReservationRescheduleEvent.c(fragment);
        getuservisiblehint.d(2131296811, fragment, str, 2);
        getuservisiblehint.b();
    }

    public final void f() {
        ProgressDialog progressDialog = this.e;
        if (progressDialog != null) {
            subscribeReservationRescheduleEvent.c(progressDialog);
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = this.e;
                subscribeReservationRescheduleEvent.c(progressDialog2);
                progressDialog2.dismiss();
            }
        }
    }

    public final User g() {
        User user = this.j;
        if (user != null) {
            return user;
        }
        subscribeReservationRescheduleEvent.e("");
        return null;
    }

    public final void h() {
        if (this.e == null) {
            ProgressDialog progressDialog = new ProgressDialog(getContext());
            this.e = progressDialog;
            subscribeReservationRescheduleEvent.c(progressDialog);
            progressDialog.setCanceledOnTouchOutside(false);
            ProgressDialog progressDialog2 = this.e;
            subscribeReservationRescheduleEvent.c(progressDialog2);
            Window window = progressDialog2.getWindow();
            subscribeReservationRescheduleEvent.c(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        ProgressDialog progressDialog3 = this.e;
        subscribeReservationRescheduleEvent.c(progressDialog3);
        if (!progressDialog3.isShowing()) {
            ProgressDialog progressDialog4 = this.e;
            subscribeReservationRescheduleEvent.c(progressDialog4);
            progressDialog4.show();
            ProgressDialog progressDialog5 = this.e;
            subscribeReservationRescheduleEvent.c(progressDialog5);
            progressDialog5.setContentView(2131493036);
        }
    }

    public final Realm i() {
        Realm realm = this.f;
        if (realm != null) {
            return realm;
        }
        subscribeReservationRescheduleEvent.e("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        onCreate(bundle);
        App.d().e(this);
        Realm defaultInstance = Realm.getDefaultInstance();
        subscribeReservationRescheduleEvent.d(defaultInstance, "");
        subscribeReservationRescheduleEvent.e(defaultInstance, "");
        this.f = defaultInstance;
        SharedPreferences sharedPreferences = this.sharedPreferences;
        Realm realm = null;
        if (sharedPreferences == null) {
            subscribeReservationRescheduleEvent.e("");
            sharedPreferences = null;
        }
        subscribeReservationRescheduleEvent.c(sharedPreferences);
        this.c = sharedPreferences.getString("email", "");
        realm = this.f;
        if (realm == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        Object findFirst = realm.where(User.class).equalTo("email", this.c, Case.INSENSITIVE).findFirst();
        subscribeReservationRescheduleEvent.c(findFirst);
        User user = (User) findFirst;
        subscribeReservationRescheduleEvent.e(user, "");
        this.j = user;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        Realm realm = this.f;
        if (realm == null) {
            subscribeReservationRescheduleEvent.e("");
            realm = null;
        }
        realm.close();
        e();
    }
}
