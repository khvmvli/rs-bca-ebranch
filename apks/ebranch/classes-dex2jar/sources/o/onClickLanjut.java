package o;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bca.smartbranch.activity.BaseActivityPostLoginKotlin;
import com.bca.smartbranch.activity.DaftarPemilikSumberDanaMenuActivity;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.detailBCAFullPayment;
import o.setOnStartEnterTransitionListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:o/onClickLanjut.class */
public final class onClickLanjut extends BaseActivityPostLoginKotlin implements DaftarPemilikSumberDanaPresenter.read {
    private DetailTundaActivity_ViewBinding j;
    private int k;
    private final onChooseValueSumberPenghasilan l;
    private boolean m;
    private final onChooseValueSumberPenghasilan n;
    public Map<Integer, View> h = new LinkedHashMap();
    private final String f = "DaftarPemilikSumberDanaActivity";

    /* renamed from: o */
    private String f170o = DaftarPemilikSumberDanaMenuActivity.f;

    /* loaded from: classes-dex2jar.jar:o/onClickLanjut$IconCompatParcelizer.class */
    static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer() {
            super(0);
            onClickLanjut.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding invoke() {
            View inflate = onClickLanjut.this.getLayoutInflater().inflate(2131492917, (ViewGroup) null, false);
            int i = 2131297482;
            View a = setRotation.a(inflate, 2131297482);
            if (a != null) {
                LinearLayout linearLayout = (LinearLayout) a;
                TextView textView = (TextView) setRotation.a(a, 2131299690);
                if (textView != null) {
                    ListNegaraPemrekAdapter$ListNegaraAdapterVH listNegaraPemrekAdapter$ListNegaraAdapterVH = new ListNegaraPemrekAdapter$ListNegaraAdapterVH(linearLayout, linearLayout, textView);
                    View a2 = setRotation.a(inflate, 2131297483);
                    if (a2 != null) {
                        ListProvinsiAdapter$ListProvinsiAdapterVH_ViewBinding b = ListProvinsiAdapter$ListProvinsiAdapterVH_ViewBinding.b(a2);
                        View a3 = setRotation.a(inflate, 2131297500);
                        if (a3 != null) {
                            ListNegaraORAdapter$ListNegaraORAdapterVH_ViewBinding b2 = ListNegaraORAdapter$ListNegaraORAdapterVH_ViewBinding.b(a3);
                            LinearLayout linearLayout2 = (LinearLayout) inflate;
                            getIncomeDisplayAmount getincomedisplayamount = (getIncomeDisplayAmount) setRotation.a(inflate, 2131298322);
                            if (getincomedisplayamount != null) {
                                ViewAnimator viewAnimator = (ViewAnimator) setRotation.a(inflate, 2131299749);
                                if (viewAnimator != null) {
                                    HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding = new HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding(linearLayout2, listNegaraPemrekAdapter$ListNegaraAdapterVH, b, b2, linearLayout2, getincomedisplayamount, viewAnimator);
                                    subscribeReservationRescheduleEvent.d(hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding, "");
                                    return hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding;
                                }
                                i = 2131299749;
                            } else {
                                i = 2131298322;
                            }
                        } else {
                            i = 2131297500;
                        }
                    } else {
                        i = 2131297483;
                    }
                } else {
                    throw new NullPointerException("Missing required view with ID: ".concat(a.getResources().getResourceName(2131299690)));
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    /* loaded from: classes-dex2jar.jar:o/onClickLanjut$write.class */
    public static final class write extends setOnStartEnterTransitionListener.RatingCompat {
        write() {
            onClickLanjut.this = r4;
        }

        @Override // o.setOnStartEnterTransitionListener.RatingCompat
        public final void a(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i, int i2) {
            setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver;
            int i3;
            subscribeReservationRescheduleEvent.e(setonstartentertransitionlistener, "");
            a(setonstartentertransitionlistener, i, i2);
            if (i2 > 0 && (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = setonstartentertransitionlistener.z) != null) {
                onClickLanjut onclicklanjut = onClickLanjut.this;
                int m = setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.m();
                int s = setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.s();
                if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver instanceof LinearLayoutManager) {
                    i3 = ((LinearLayoutManager) setonstartentertransitionlistener_mediabrowsercompat_itemreceiver).g();
                } else {
                    i3 = 0;
                    if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver instanceof StaggeredGridLayoutManager) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) setonstartentertransitionlistener_mediabrowsercompat_itemreceiver;
                        int[] iArr = new int[staggeredGridLayoutManager.f];
                        for (int i4 = 0; i4 < staggeredGridLayoutManager.f; i4++) {
                            StaggeredGridLayoutManager.IconCompatParcelizer iconCompatParcelizer = staggeredGridLayoutManager.g[i4];
                            iArr[i4] = StaggeredGridLayoutManager.this.e ? iconCompatParcelizer.b(iconCompatParcelizer.b.size() - 1, -1, false, true, false) : iconCompatParcelizer.b(0, iconCompatParcelizer.b.size(), false, true, false);
                        }
                        i3 = 0;
                        if (iArr != null) {
                            i3 = 0;
                            if (!(iArr.length == 0)) {
                                i3 = iArr[0];
                            }
                        }
                    }
                }
                if (!onclicklanjut.m && m + i3 >= s) {
                    onclicklanjut.q();
                    onclicklanjut.m = true;
                }
            }
        }
    }

    public onClickLanjut() {
        DaftarPemilikSumberDanaMenuActivity.IconCompatParcelizer iconCompatParcelizer = DaftarPemilikSumberDanaMenuActivity.j;
        IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer();
        subscribeReservationRescheduleEvent.e(iconCompatParcelizer2, "");
        this.n = new Page6KLFragment_ViewBinding(iconCompatParcelizer2, null, 2);
        onClickLanjut$MediaBrowserCompat$CustomActionResultReceiver onclicklanjut_mediabrowsercompat_customactionresultreceiver = onClickLanjut$MediaBrowserCompat$CustomActionResultReceiver.b;
        subscribeReservationRescheduleEvent.e(onclicklanjut_mediabrowsercompat_customactionresultreceiver, "");
        this.l = new Page6KLFragment_ViewBinding(onclicklanjut_mediabrowsercompat_customactionresultreceiver, null, 2);
    }

    public static /* synthetic */ void c(onClickLanjut onclicklanjut, View view) {
        subscribeReservationRescheduleEvent.e(onclicklanjut, "");
        onclicklanjut.q();
    }

    public final void q() {
        String str = this.f170o;
        DaftarPemilikSumberDanaMenuActivity.IconCompatParcelizer iconCompatParcelizer = DaftarPemilikSumberDanaMenuActivity.j;
        ((DaftarPemilikSumberDanaPresenter) this.l.d()).c(new InfoProductActivity_ViewBinding(J().getEmail(), J().getSessionId(), J().getImei(), subscribeReservationRescheduleEvent.b((Object) str, (Object) DaftarPemilikSumberDanaMenuActivity.f) ? "OTH" : "ORG"), Integer.valueOf(this.k), 15, "", "", "", Boolean.TRUE);
    }

    private final void r() {
        DetailTundaActivity_ViewBinding detailTundaActivity_ViewBinding;
        int size;
        if (this.k > 0 && (detailTundaActivity_ViewBinding = this.j) != null) {
            detailTundaActivity_ViewBinding.b = false;
            ArrayList<detailBCAFullPayment.read> arrayList = detailTundaActivity_ViewBinding.e;
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                ArrayList<detailBCAFullPayment.read> arrayList2 = detailTundaActivity_ViewBinding.e;
                if ((arrayList2 != null ? arrayList2.get(size) : null) != null) {
                    arrayList.remove(size);
                    detailTundaActivity_ViewBinding.a.c(size, 1);
                }
            }
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final View D() {
        LinearLayout linearLayout = ((HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding) this.n.d()).e;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        return linearLayout;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final void G() {
        setCardSlogan.e().b = this.f;
        h(this.f);
    }

    @Override // com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter.read
    public final void a(String str) {
        r();
        HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding = (HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding) this.n.d();
        if (this.k <= 0) {
            hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding.f.setDisplayedChild(1);
            if (str != null) {
                hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding.b.e.setText(str);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter.read
    public final void b(String str) {
        r();
        HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding = (HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding) this.n.d();
        if (this.k <= 0) {
            hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding.f.setDisplayedChild(1);
            if (str != null) {
                hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding.b.e.setText(str);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter.read
    public final void b(List<detailBCAFullPayment.read> list) {
        ArrayList<detailBCAFullPayment.read> arrayList;
        ArrayList<detailBCAFullPayment.read> arrayList2;
        r();
        this.m = false;
        ((HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding) this.n.d()).f.setDisplayedChild(0);
        if (this.k <= 0) {
            DetailTundaActivity_ViewBinding detailTundaActivity_ViewBinding = this.j;
            if (detailTundaActivity_ViewBinding != null) {
                ArrayList<detailBCAFullPayment.read> arrayList3 = detailTundaActivity_ViewBinding.e;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                if (!(list == null || (arrayList2 = detailTundaActivity_ViewBinding.e) == null)) {
                    arrayList2.addAll(list);
                }
                detailTundaActivity_ViewBinding.a.b();
            }
        } else {
            DetailTundaActivity_ViewBinding detailTundaActivity_ViewBinding2 = this.j;
            if (detailTundaActivity_ViewBinding2 != null) {
                if (!(list == null || (arrayList = detailTundaActivity_ViewBinding2.e) == null)) {
                    arrayList.addAll(list);
                }
                detailTundaActivity_ViewBinding2.a.b();
            }
        }
        this.k++;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final void c(Bundle bundle) {
        String str;
        c(bundle);
        ((DaftarPemilikSumberDanaPresenter) this.l.d()).d = this;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            DaftarPemilikSumberDanaMenuActivity.IconCompatParcelizer iconCompatParcelizer = DaftarPemilikSumberDanaMenuActivity.j;
            String str2 = DaftarPemilikSumberDanaMenuActivity.m;
            DaftarPemilikSumberDanaMenuActivity.IconCompatParcelizer iconCompatParcelizer2 = DaftarPemilikSumberDanaMenuActivity.j;
            str = extras.getString(str2, DaftarPemilikSumberDanaMenuActivity.f);
        } else {
            str = null;
        }
        String str3 = str;
        if (str == null) {
            DaftarPemilikSumberDanaMenuActivity.IconCompatParcelizer iconCompatParcelizer3 = DaftarPemilikSumberDanaMenuActivity.j;
            str3 = DaftarPemilikSumberDanaMenuActivity.f;
        }
        this.f170o = str3;
        b(((HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding) this.n.d()).d.d);
        i();
        setBackgroundResource i = i();
        if (i != null) {
            i.d(true);
        }
        setBackgroundResource i2 = i();
        if (i2 != null) {
            i2.d("");
        }
        Resources resources = getResources();
        StringBuilder sb = new StringBuilder("(");
        sb.append(getResources().getString(2131821980));
        sb.append(')');
        String string = resources.getString(2131822485, sb.toString());
        subscribeReservationRescheduleEvent.d(string, "");
        String str4 = this.f170o;
        DaftarPemilikSumberDanaMenuActivity.IconCompatParcelizer iconCompatParcelizer4 = DaftarPemilikSumberDanaMenuActivity.j;
        if (subscribeReservationRescheduleEvent.b((Object) str4, (Object) DaftarPemilikSumberDanaMenuActivity.k)) {
            Resources resources2 = getResources();
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(getResources().getString(2131822042));
            sb2.append(')');
            string = resources2.getString(2131822485, sb2.toString());
            subscribeReservationRescheduleEvent.d(string, "");
        }
        ((HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding) this.n.d()).d.c.setText(string);
        HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding = (HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding) this.n.d();
        this.j = new DetailTundaActivity_ViewBinding(this, this.f170o);
        hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding.g.setLayoutManager(new LinearLayoutManager(1, false));
        hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding.g.setEmptyView(hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding.a.e);
        hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding.a.a.setText(getResources().getString(2131820698));
        hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding.g.setAdapter(this.j);
        getIncomeDisplayAmount getincomedisplayamount = hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding.g;
        write write2 = new write();
        if (getincomedisplayamount.Q == null) {
            getincomedisplayamount.Q = new ArrayList();
        }
        getincomedisplayamount.Q.add(write2);
        ((HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding) this.n.d()).b.a.setOnClickListener(new View.OnClickListener() { // from class: o.onExitReservasi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onClickLanjut.c(onClickLanjut.this, view);
            }
        });
    }

    @Override // com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter.read, com.bca.smartbranch.presenter.CheckCISNPresenter.write
    public final void c(String str) {
        E();
        Bundle bundle = new Bundle();
        bundle.putString("imei", J().getImei());
        bundle.putString("email", J().getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter.read
    public final void d(String str) {
        r();
        HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding = (HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding) this.n.d();
        if (this.k <= 0) {
            hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding.f.setDisplayedChild(1);
            if (str != null) {
                hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding.b.e.setText(str);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter.read, com.bca.smartbranch.presenter.CheckCISNPresenter.write
    public final void e(String str) {
        E();
        Bundle bundle = new Bundle();
        bundle.putString("imei", J().getImei());
        bundle.putString("email", J().getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin, o.setPadding, o.getView, android.app.Activity
    public final void onDestroy() {
        onDestroy();
        DaftarPemilikSumberDanaPresenter daftarPemilikSumberDanaPresenter = (DaftarPemilikSumberDanaPresenter) this.l.d();
        Call<OpenAccountSuccessActivity<detailBCAFullPayment>> call = daftarPemilikSumberDanaPresenter.e;
        if (call != null) {
            call.cancel();
        }
        daftarPemilikSumberDanaPresenter.d = null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        subscribeReservationRescheduleEvent.e(menuItem, "");
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        k();
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin, o.getView, android.app.Activity
    public final void onResume() {
        onResume();
        this.k = 0;
        q();
        ((HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding) this.n.d()).g.e(0);
    }

    @Override // com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter.read
    public final void p() {
        if (this.k <= 0) {
            ((HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding) this.n.d()).f.setDisplayedChild(2);
            return;
        }
        DetailTundaActivity_ViewBinding detailTundaActivity_ViewBinding = this.j;
        if (detailTundaActivity_ViewBinding != null) {
            detailTundaActivity_ViewBinding.b = true;
            ArrayList<detailBCAFullPayment.read> arrayList = detailTundaActivity_ViewBinding.e;
            if (arrayList != null) {
                arrayList.add(new detailBCAFullPayment.read(null, null, null, null, null, null, 63));
            }
            ArrayList<detailBCAFullPayment.read> arrayList2 = detailTundaActivity_ViewBinding.e;
            if (arrayList2 != null) {
                detailTundaActivity_ViewBinding.a.e(arrayList2.size() - 1, 1);
            }
        }
    }
}
