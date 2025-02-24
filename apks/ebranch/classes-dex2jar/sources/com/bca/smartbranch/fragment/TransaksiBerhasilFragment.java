package com.bca.smartbranch.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.TransactionActivity;
import com.bca.smartbranch.adapter.TransaksiBerhasilAdapter;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.fragment.TransaksiBerhasilFragment;
import com.bca.smartbranch.presenter.TransactionPresenter;
import com.bca.smartbranch.presenter.TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import io.realm.Case;
import io.realm.Realm;
import java.util.ArrayList;
import java.util.List;
import o.getIncomeDisplayAmount;
import o.getLifecycle;
import o.getLifecycle$MediaBrowserCompat$CustomActionResultReceiver;
import o.getPromotion;
import o.onCreditCardRedirect;
import o.onTakePicture;
import o.setBackgroundColorRes;
import org.joda.time.format.DateTimeFormat;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TransaksiBerhasilFragment.class */
public class TransaksiBerhasilFragment extends BaseFragment implements TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    public TransaksiBerhasilAdapter a;
    public int d;
    public User g;
    public TransactionPresenter h;
    private Realm k;
    @BindView(2131297634)
    LinearLayout llEmpty;
    private ViewAnimator n;
    @BindView(2131298093)
    getLifecycle nsvMain;
    @BindView(2131298337)
    getIncomeDisplayAmount rvTransaksiBerhasil;
    @BindView(2131298422)
    setBackgroundColorRes swipeRefreshLayout;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299690)
    TextView tvTransaksiEmpty;
    private List<onTakePicture.write> l = new ArrayList();
    private String m = "";
    public String i = "";
    public boolean f = false;

    /* renamed from: o */
    private boolean f59o = false;
    public int j = 2;

    static /* synthetic */ void d(TransaksiBerhasilFragment transaksiBerhasilFragment, String str) {
        transaksiBerhasilFragment.h.d(getPromotion.b(transaksiBerhasilFragment.g, str), new onCreditCardRedirect(""));
    }

    @Override // com.bca.smartbranch.presenter.TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void C_(String str) {
        setBackgroundColorRes setbackgroundcolorres = this.swipeRefreshLayout;
        if (setbackgroundcolorres != null && setbackgroundcolorres.j) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
        this.a.b();
        if (this.f59o) {
            this.n.setDisplayedChild(1);
            this.tvErrorMessage.setText(str);
        }
    }

    @Override // com.bca.smartbranch.presenter.TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void D_(String str) {
        setBackgroundColorRes setbackgroundcolorres = this.swipeRefreshLayout;
        if (setbackgroundcolorres != null && setbackgroundcolorres.j) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
        this.a.b();
        if (this.f59o) {
            this.n.setDisplayedChild(1);
            this.tvErrorMessage.setText(str);
        }
    }

    @Override // com.bca.smartbranch.presenter.TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void a_(String str) {
        setBackgroundColorRes setbackgroundcolorres = this.swipeRefreshLayout;
        if (setbackgroundcolorres != null && setbackgroundcolorres.j) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
        this.a.b();
        if (this.f59o) {
            this.n.setDisplayedChild(1);
            this.tvErrorMessage.setText(str);
        }
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    public final void b(View view) {
        b(view);
        this.n = (ViewAnimator) view.findViewById(2131299749);
    }

    @Override // com.bca.smartbranch.presenter.TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(String str) {
        getActivity().setResult(0);
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.g.getImei());
        bundle.putString("email", this.g.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(List<onTakePicture.write> list, List<onTakePicture.IconCompatParcelizer> list2, int i) {
        setBackgroundColorRes setbackgroundcolorres = this.swipeRefreshLayout;
        if (setbackgroundcolorres != null && setbackgroundcolorres.j) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
        if (this.f59o) {
            TransaksiBerhasilAdapter transaksiBerhasilAdapter = this.a;
            transaksiBerhasilAdapter.b.clear();
            transaksiBerhasilAdapter.a.b();
            this.n.setDisplayedChild(0);
        }
        ((TransactionActivity) getActivity()).d(i);
        if (list.size() > 0) {
            this.i = list.get(list.size() - 1).t;
        } else {
            this.d = this.j;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String print = DateTimeFormat.forPattern("dd MMMM yyyy").print(DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss").parseDateTime(list.get(i2).t));
            if (!this.m.equals(print)) {
                onTakePicture.write write = new onTakePicture.write();
                write.t = list.get(i2).t;
                write.r = print;
                write.g = true;
                arrayList.add(write);
            }
            arrayList.add(list.get(i2));
            this.m = print;
        }
        this.d++;
        if (!this.f59o) {
            this.a.b();
        }
        TransaksiBerhasilAdapter transaksiBerhasilAdapter2 = this.a;
        transaksiBerhasilAdapter2.b.addAll(arrayList);
        transaksiBerhasilAdapter2.a.b();
        this.l.addAll(arrayList);
        this.f = false;
        this.f59o = false;
        ((TransactionActivity) getActivity()).t = this.l;
        ((TransactionActivity) getActivity()).f = this.d;
    }

    @Override // com.bca.smartbranch.presenter.TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b_(String str) {
        getActivity().setResult(0);
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.g.getImei());
        bundle.putString("email", this.g.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493279;
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        onCreate(bundle);
        this.h = new TransactionPresenter();
        this.l = ((TransactionActivity) getActivity()).t;
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.k.close();
        this.h.c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        onStart();
        List<onTakePicture.write> list = ((TransactionActivity) getActivity()).t;
        this.l = list;
        if (!list.isEmpty()) {
            this.d = ((TransactionActivity) getActivity()).f;
            this.f59o = false;
            List<onTakePicture.write> list2 = this.l;
            this.i = list2.get(list2.size() - 1).t;
            TransaksiBerhasilAdapter transaksiBerhasilAdapter = this.a;
            transaksiBerhasilAdapter.b = this.l;
            transaksiBerhasilAdapter.a.b();
            return;
        }
        this.f59o = true;
        this.i = "";
        this.h.d(getPromotion.b(this.g, ""), new onCreditCardRedirect(""));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.h.d = this;
        Realm defaultInstance = Realm.getDefaultInstance();
        this.k = defaultInstance;
        this.g = (User) defaultInstance.where(User.class).equalTo("email", this.b, Case.INSENSITIVE).findFirst();
        this.a = new TransaksiBerhasilAdapter(getActivity());
        getContext();
        this.rvTransaksiBerhasil.setLayoutManager(new LinearLayoutManager(1, false));
        this.tvTransaksiEmpty.setText("Transaksi Berhasil");
        this.rvTransaksiBerhasil.setEmptyView(this.llEmpty);
        this.rvTransaksiBerhasil.setAdapter(this.a);
        this.swipeRefreshLayout.setOnRefreshListener(new setBackgroundColorRes.read() { // from class: com.bca.smartbranch.fragment.TransaksiBerhasilFragment.2
            @Override // o.setBackgroundColorRes.read
            public final void c() {
                TransaksiBerhasilFragment.this.d = 0;
                TransaksiBerhasilFragment.this.l = new ArrayList();
                ((TransactionActivity) TransaksiBerhasilFragment.this.getActivity()).f = TransaksiBerhasilFragment.this.d;
                ((TransactionActivity) TransaksiBerhasilFragment.this.getActivity()).t = TransaksiBerhasilFragment.this.l;
                TransaksiBerhasilFragment.this.f59o = true;
                TransaksiBerhasilFragment.this.m = "";
                TransaksiBerhasilFragment.this.i = "";
                TransaksiBerhasilFragment transaksiBerhasilFragment = TransaksiBerhasilFragment.this;
                TransaksiBerhasilFragment.d(transaksiBerhasilFragment, transaksiBerhasilFragment.i);
            }
        });
        this.nsvMain.setOnScrollChangeListener(new getLifecycle$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.getFlag
            @Override // o.getLifecycle$MediaBrowserCompat$CustomActionResultReceiver
            public final void a(getLifecycle getlifecycle, int i, int i2, int i3, int i4) {
                TransaksiBerhasilFragment transaksiBerhasilFragment = TransaksiBerhasilFragment.this;
                if (getlifecycle.getChildAt(getlifecycle.getChildCount() - 1) != null && !transaksiBerhasilFragment.f && i2 >= getlifecycle.getChildAt(getlifecycle.getChildCount() - 1).getMeasuredHeight() - getlifecycle.getMeasuredHeight() && i2 > i4 && transaksiBerhasilFragment.d < transaksiBerhasilFragment.j) {
                    TransaksiBerhasilAdapter transaksiBerhasilAdapter = transaksiBerhasilFragment.a;
                    transaksiBerhasilAdapter.e = true;
                    transaksiBerhasilAdapter.b.add(new onTakePicture.write());
                    transaksiBerhasilAdapter.a.e(transaksiBerhasilAdapter.b.size() - 1, 1);
                    transaksiBerhasilFragment.h.d(getPromotion.b(transaksiBerhasilFragment.g, transaksiBerhasilFragment.i), new onCreditCardRedirect(""));
                }
            }
        });
    }

    @OnClick({2131296446})
    public void retry(View view) {
        this.h.d(getPromotion.b(this.g, this.i), new onCreditCardRedirect(""));
    }

    @Override // com.bca.smartbranch.presenter.TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void s() {
        this.f = true;
        if (!this.swipeRefreshLayout.j && this.f59o) {
            this.n.setDisplayedChild(2);
        }
    }
}
