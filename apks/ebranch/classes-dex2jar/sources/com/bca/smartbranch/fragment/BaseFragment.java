package com.bca.smartbranch.fragment;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bca.smartbranch.App;
import com.bca.smartbranch.data.localdb.Account;
import com.bca.smartbranch.data.localdb.User;
import io.realm.Case;
import io.realm.Realm;
import o.KeluarFormReservationDialog_ViewBinding;
import o.getUserVisibleHint;
import o.onClickNegara;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BaseFragment.class */
public abstract class BaseFragment extends Fragment {
    private Unbinder a;
    protected String b;
    protected Realm c;
    private ProgressDialog d;
    protected User e;
    @onClickNegara
    public SharedPreferences.Editor editor;
    @onClickNegara
    public SharedPreferences sharedPreferences;

    public void b(View view) {
    }

    protected final void b(View view, String str) {
        KeluarFormReservationDialog_ViewBinding a = KeluarFormReservationDialog_ViewBinding.a(null, view, "", 0);
        KeluarFormReservationDialog_ViewBinding.read b = a.b();
        View inflate = getLayoutInflater().inflate(2131493473, (ViewGroup) null);
        ((TextView) inflate.findViewById(2131299409)).setText(str);
        ((ImageView) inflate.findViewById(2131297327)).setOnClickListener(new View.OnClickListener() { // from class: o.setProductType
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KeluarFormReservationDialog_ViewBinding.this.d();
            }
        });
        b.setPadding(0, 0, 0, 0);
        b.addView(inflate, 0);
        a.g();
        new Account();
    }

    protected abstract int c();

    protected final void c(int i, Fragment fragment, String str) {
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(getFragmentManager());
        getuservisiblehint.e(2130772010, 2130772011);
        getuservisiblehint.d(2131296811, fragment, str, 2);
        getuservisiblehint.b();
    }

    protected final void d(int i, Fragment fragment, Fragment fragment2, String str) {
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(getFragmentManager());
        getuservisiblehint.f163o = 2130772010;
        getuservisiblehint.m = 2130772011;
        getuservisiblehint.l = 2130772009;
        getuservisiblehint.r = 2130772012;
        getuservisiblehint.a(fragment);
        getuservisiblehint.d(2131296811, fragment2, str, 1);
        if (getuservisiblehint.a) {
            getuservisiblehint.c = true;
            getuservisiblehint.n = str;
            getuservisiblehint.b();
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    protected final void e(int i, Fragment fragment, Fragment fragment2, String str) {
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(getFragmentManager());
        getuservisiblehint.a(fragment);
        getuservisiblehint.d(2131296811, fragment2, str, 1);
        if (getuservisiblehint.a) {
            getuservisiblehint.c = true;
            getuservisiblehint.n = str;
            getuservisiblehint.b();
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    protected final void e(int i, Fragment fragment, String str) {
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(getFragmentManager());
        getuservisiblehint.e(2130772009, 2130772012);
        getuservisiblehint.d(2131296811, fragment, str, 2);
        getuservisiblehint.b();
    }

    protected final void g() {
        if (this.d == null) {
            ProgressDialog progressDialog = new ProgressDialog(getContext());
            this.d = progressDialog;
            progressDialog.setCanceledOnTouchOutside(false);
            this.d.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        if (!this.d.isShowing()) {
            this.d.show();
            this.d.setContentView(2131493036);
        }
    }

    protected final void h() {
        ProgressDialog progressDialog = this.d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.d.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        onCreate(bundle);
        App.d().c(this);
        this.c = Realm.getDefaultInstance();
        this.b = this.sharedPreferences.getString("email", "");
        this.e = (User) this.c.where(User.class).equalTo("email", this.b, Case.INSENSITIVE).findFirst();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(c(), viewGroup, false);
        this.a = ButterKnife.bind(this, inflate);
        b(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        Unbinder unbinder = this.a;
        if (unbinder != null) {
            unbinder.unbind();
        }
        this.c.close();
    }
}
