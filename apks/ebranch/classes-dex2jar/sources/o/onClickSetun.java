package o;

import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bca.smartbranch.activity.BaseActivityPostLoginKotlin;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.KeluarFormReservationDialog;
import com.bca.smartbranch.dialog.SimpanDraftAndHitServiceDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.presenter.BankListPresenter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.ListUtil;
import o.onClickMenu;
/* loaded from: classes-dex2jar.jar:o/onClickSetun.class */
public final class onClickSetun extends BaseActivityPostLoginKotlin implements TextWatcher, BankListPresenter.IconCompatParcelizer {
    private boolean E;
    private final onChooseValueSumberPenghasilan F;
    private boolean G;
    private boolean H;
    private List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> I;
    private int M;
    public DetailTundaReservasiROActivity_ViewBinding f;
    public LinearLayout k;
    public String l;
    public EditText m;
    public setInputType n;

    /* renamed from: o */
    public setOnStartEnterTransitionListener f171o;
    public TextView p;
    public ViewAnimator s;
    public TextView t;
    private final onChooseValueSumberPenghasilan z;
    public static final RemoteActionCompatParcelizer h = new RemoteActionCompatParcelizer((byte) 0);
    private static final String u = "ITEM_LIST_BANK";
    private static final String q = "IS_FROM_RESERVATION";
    private static final String r = "IS_FROM_UBAH_PAGE";
    private static final String w = "IS_ONLY_SAVE_DRAFT";
    private static final String v = "TOTAL_COUNT_LIST_TEMP";
    public Map<Integer, View> j = new LinkedHashMap();
    private final String y = "PilihBankTransferActivity";
    private List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> A = new ArrayList();

    /* loaded from: classes-dex2jar.jar:o/onClickSetun$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String str = ((OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver) t).e;
            String str2 = ((OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver) t2).e;
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/onClickSetun$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/onClickSetun$write.class */
    static final class write extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<BankListPresenter> {
        public static final write e = new write();

        write() {
            super(0);
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ BankListPresenter invoke() {
            return new BankListPresenter();
        }
    }

    public onClickSetun() {
        onClickSetun$MediaBrowserCompat$CustomActionResultReceiver onclicksetun_mediabrowsercompat_customactionresultreceiver = new pilihNoRek<JenisKodeBankAdapter$JenisKodeBankVH>() { // from class: o.onClickSetun$MediaBrowserCompat$CustomActionResultReceiver
            @Override // o.pilihNoRek
            public final /* synthetic */ JenisKodeBankAdapter$JenisKodeBankVH invoke() {
                JenisKodeBankAdapter$JenisKodeBankVH c = JenisKodeBankAdapter$JenisKodeBankVH.c(onClickSetun.this.getLayoutInflater().inflate(2131492977, (ViewGroup) null, false));
                subscribeReservationRescheduleEvent.d(c, "");
                return c;
            }
        };
        subscribeReservationRescheduleEvent.e(onclicksetun_mediabrowsercompat_customactionresultreceiver, "");
        this.z = new Page6KLFragment_ViewBinding(onclicksetun_mediabrowsercompat_customactionresultreceiver, null, 2);
        write write2 = write.e;
        subscribeReservationRescheduleEvent.e(write2, "");
        this.F = new Page6KLFragment_ViewBinding(write2, null, 2);
    }

    public static /* synthetic */ void a(onClickSetun onclicksetun, View view) {
        subscribeReservationRescheduleEvent.e(onclicksetun, "");
        ((BankListPresenter) onclicksetun.F.d()).e(onclicksetun.J());
    }

    private final void p() {
        DetailTundaReservasiROActivity_ViewBinding detailTundaReservasiROActivity_ViewBinding = new DetailTundaReservasiROActivity_ViewBinding(this, this.A);
        subscribeReservationRescheduleEvent.e(detailTundaReservasiROActivity_ViewBinding, "");
        this.f = detailTundaReservasiROActivity_ViewBinding;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.f171o;
        ViewAnimator viewAnimator = null;
        if (setonstartentertransitionlistener == null) {
            subscribeReservationRescheduleEvent.e("");
            setonstartentertransitionlistener = null;
        }
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.f171o;
        if (setonstartentertransitionlistener2 == null) {
            subscribeReservationRescheduleEvent.e("");
            setonstartentertransitionlistener2 = null;
        }
        DetailTundaReservasiROActivity_ViewBinding detailTundaReservasiROActivity_ViewBinding2 = this.f;
        if (detailTundaReservasiROActivity_ViewBinding2 == null) {
            subscribeReservationRescheduleEvent.e("");
            detailTundaReservasiROActivity_ViewBinding2 = null;
        }
        setonstartentertransitionlistener2.setAdapter(detailTundaReservasiROActivity_ViewBinding2);
        viewAnimator = this.s;
        if (viewAnimator == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        viewAnimator.setDisplayedChild(2);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final View D() {
        LinearLayout linearLayout = ((JenisKodeBankAdapter$JenisKodeBankVH) this.z.d()).h;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        return linearLayout;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final void G() {
        setCardSlogan.e().b = this.y;
        h(this.y);
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void a_(String str) {
        TextView textView = this.p;
        ViewAnimator viewAnimator = null;
        if (textView == null) {
            subscribeReservationRescheduleEvent.e("");
            textView = null;
        }
        textView.setText(str);
        viewAnimator = this.s;
        if (viewAnimator == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        viewAnimator.setDisplayedChild(1);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        ArrayList arrayList = new ArrayList();
        Iterator<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> it = this.A.iterator();
        while (true) {
            linearLayout2 = null;
            linearLayout = null;
            EditText editText = null;
            if (!it.hasNext()) {
                break;
            }
            OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            String str = next.e;
            EditText editText2 = this.m;
            if (editText2 != null) {
                editText = editText2;
            } else {
                subscribeReservationRescheduleEvent.e("");
            }
            String lowerCase = editText.getText().toString().toLowerCase(Locale.ROOT);
            subscribeReservationRescheduleEvent.d(lowerCase, "");
            if (CheckOTPSessionPresenter.d((CharSequence) str, (CharSequence) lowerCase, true)) {
                arrayList.add(next);
            }
        }
        DetailTundaReservasiROActivity_ViewBinding detailTundaReservasiROActivity_ViewBinding = this.f;
        if (detailTundaReservasiROActivity_ViewBinding == null) {
            subscribeReservationRescheduleEvent.e("");
            detailTundaReservasiROActivity_ViewBinding = null;
        }
        subscribeReservationRescheduleEvent.e(arrayList, "");
        detailTundaReservasiROActivity_ViewBinding.b = arrayList;
        detailTundaReservasiROActivity_ViewBinding.a.b();
        if (arrayList.size() <= 0) {
            linearLayout2 = this.k;
            if (linearLayout2 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            linearLayout2.setVisibility(0);
            return;
        }
        linearLayout = this.k;
        if (linearLayout == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        linearLayout.setVisibility(8);
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void b(String str) {
        TextView textView = this.p;
        ViewAnimator viewAnimator = null;
        if (textView == null) {
            subscribeReservationRescheduleEvent.e("");
            textView = null;
        }
        textView.setText(str);
        viewAnimator = this.s;
        if (viewAnimator == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        viewAnimator.setDisplayedChild(1);
        Bundle bundle = new Bundle();
        bundle.putString("imei", J().getImei());
        bundle.putString("email", J().getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void b_(String str) {
        TextView textView = this.p;
        ViewAnimator viewAnimator = null;
        if (textView == null) {
            subscribeReservationRescheduleEvent.e("");
            textView = null;
        }
        textView.setText(str);
        viewAnimator = this.s;
        if (viewAnimator == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        viewAnimator.setDisplayedChild(1);
        Bundle bundle = new Bundle();
        bundle.putString("imei", J().getImei());
        bundle.putString("email", J().getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final void c(Bundle bundle) {
        c(bundle);
        setInputType setinputtype = ((JenisKodeBankAdapter$JenisKodeBankVH) this.z.d()).a.b;
        subscribeReservationRescheduleEvent.d(setinputtype, "");
        subscribeReservationRescheduleEvent.e(setinputtype, "");
        this.n = setinputtype;
        TextView textView = ((JenisKodeBankAdapter$JenisKodeBankVH) this.z.d()).a.c;
        subscribeReservationRescheduleEvent.d(textView, "");
        subscribeReservationRescheduleEvent.e(textView, "");
        this.t = textView;
        String string = getResources().getString(2131822487);
        subscribeReservationRescheduleEvent.d(string, "");
        subscribeReservationRescheduleEvent.e(string, "");
        this.l = string;
        EditText editText = ((JenisKodeBankAdapter$JenisKodeBankVH) this.z.d()).d;
        subscribeReservationRescheduleEvent.d(editText, "");
        subscribeReservationRescheduleEvent.e(editText, "");
        this.m = editText;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = ((JenisKodeBankAdapter$JenisKodeBankVH) this.z.d()).i;
        subscribeReservationRescheduleEvent.d(setonstartentertransitionlistener, "");
        subscribeReservationRescheduleEvent.e(setonstartentertransitionlistener, "");
        this.f171o = setonstartentertransitionlistener;
        TextView textView2 = ((JenisKodeBankAdapter$JenisKodeBankVH) this.z.d()).e.e;
        subscribeReservationRescheduleEvent.d(textView2, "");
        subscribeReservationRescheduleEvent.e(textView2, "");
        this.p = textView2;
        ViewAnimator viewAnimator = ((JenisKodeBankAdapter$JenisKodeBankVH) this.z.d()).g;
        subscribeReservationRescheduleEvent.d(viewAnimator, "");
        subscribeReservationRescheduleEvent.e(viewAnimator, "");
        this.s = viewAnimator;
        LinearLayout linearLayout = ((JenisKodeBankAdapter$JenisKodeBankVH) this.z.d()).c;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        subscribeReservationRescheduleEvent.e(linearLayout, "");
        this.k = linearLayout;
        ((BankListPresenter) this.F.d()).d = this;
        setInputType setinputtype2 = this.n;
        EditText editText2 = null;
        if (setinputtype2 == null) {
            subscribeReservationRescheduleEvent.e("");
            setinputtype2 = null;
        }
        b(setinputtype2);
        subscribeReservationRescheduleEvent.c(i());
        setBackgroundResource i = i();
        subscribeReservationRescheduleEvent.c(i);
        i.d(true);
        setBackgroundResource i2 = i();
        subscribeReservationRescheduleEvent.c(i2);
        i2.d("");
        TextView textView3 = this.t;
        if (textView3 == null) {
            subscribeReservationRescheduleEvent.e("");
            textView3 = null;
        }
        String str = this.l;
        if (str == null) {
            subscribeReservationRescheduleEvent.e("");
            str = null;
        }
        textView3.setText(Html.fromHtml(str));
        ((JenisKodeBankAdapter$JenisKodeBankVH) this.z.d()).j.setText(getResources().getString(2131821132));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.G = extras.getBoolean(r, false);
        }
        if (extras != null) {
            this.E = extras.getBoolean(q, false);
        }
        if (extras != null) {
            this.H = extras.getBoolean(w, false);
        }
        if (extras != null) {
            this.M = extras.getInt(v);
        }
        if (extras != null) {
            this.I = (List) ListUtil.OneItemImmutableList.a(extras.getParcelable(u));
        }
        ((JenisKodeBankAdapter$JenisKodeBankVH) this.z.d()).e.a.setOnClickListener(new View.OnClickListener() { // from class: o.showSubHalloBCA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onClickSetun.a(onClickSetun.this, view);
            }
        });
        editText2 = this.m;
        if (editText2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        editText2.addTextChangedListener(this);
        List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> list = this.I;
        boolean z = true;
        if (list != null) {
            z = list.isEmpty();
        }
        if (z) {
            ((BankListPresenter) this.F.d()).e(J());
            return;
        }
        List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> list2 = this.I;
        if (list2 != null) {
            this.A = subscriberLoadDraftCC.a(list2);
            p();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<com.bca.smartbranch.data.api.response.BankListResponse.Bank>");
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final <T> void d(T t) {
        if (t != null) {
            onClickMenu.read read = onClickMenu.a;
            List<onClickMenu.write> list = ((onClickMenu) t).c;
            PenerimaFragment penerimaFragment = list;
            if (list == null) {
                penerimaFragment = PenerimaFragment.b;
            }
            List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> e = onClickMenu.read.e(penerimaFragment);
            subscribeReservationRescheduleEvent.e(e, "");
            ArrayList arrayList = new ArrayList(e);
            this.A = arrayList;
            if (arrayList.size() > 1) {
                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
                subscribeReservationRescheduleEvent.e(arrayList, "");
                subscribeReservationRescheduleEvent.e(iconCompatParcelizer, "");
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList, iconCompatParcelizer);
                }
            }
            p();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.data.api.response.BankListLocalResponse");
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void g_() {
        ViewAnimator viewAnimator = this.s;
        if (viewAnimator == null) {
            subscribeReservationRescheduleEvent.e("");
            viewAnimator = null;
        }
        viewAnimator.setDisplayedChild(0);
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void n(String str) {
        TextView textView = this.p;
        ViewAnimator viewAnimator = null;
        if (textView == null) {
            subscribeReservationRescheduleEvent.e("");
            textView = null;
        }
        textView.setText(str);
        viewAnimator = this.s;
        if (viewAnimator == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        viewAnimator.setDisplayedChild(1);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseBankTujuan(goDeleteAccount godeleteaccount) {
        subscribeReservationRescheduleEvent.e(godeleteaccount, "");
        getPromotion.d(this);
        finish();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        subscribeReservationRescheduleEvent.e(reservasiSuccessEChannelActivity_ViewBinding, "");
        if (subscribeReservationRescheduleEvent.b((Object) reservasiSuccessEChannelActivity_ViewBinding.d, (Object) "Y") && !this.H) {
            getPromotion.d(this);
            finish();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (this.E) {
            return true;
        }
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin, o.setPadding, o.getView, android.app.Activity
    public final void onDestroy() {
        ((BankListPresenter) this.F.d()).b();
        onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        subscribeReservationRescheduleEvent.e(menuItem, "");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
        } else if (itemId != 2131298038) {
            z = onOptionsItemSelected(menuItem);
            return z;
        } else if (this.E) {
            new KeluarFormReservationDialog().show(l(), "KeluarFormReservationDialog");
        } else if (this.G) {
            YakinKeluarDialog yakinKeluarDialog = new YakinKeluarDialog();
            yakinKeluarDialog.d = "transaction_teller";
            yakinKeluarDialog.show(l(), "YakinKeluarDialog");
        } else if (this.H) {
            SimpanDraftDialog simpanDraftDialog = new SimpanDraftDialog();
            simpanDraftDialog.b = "transaction_teller";
            simpanDraftDialog.show(l(), "SimpanDraftDialog");
        } else {
            SimpanDraftAndHitServiceDialog simpanDraftAndHitServiceDialog = new SimpanDraftAndHitServiceDialog();
            simpanDraftAndHitServiceDialog.a = this.M;
            simpanDraftAndHitServiceDialog.show(l(), "SimpanDraftAndHitServiceDialog");
        }
        z = true;
        return z;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void u(String str) {
        TextView textView = this.p;
        ViewAnimator viewAnimator = null;
        if (textView == null) {
            subscribeReservationRescheduleEvent.e("");
            textView = null;
        }
        textView.setText(str);
        viewAnimator = this.s;
        if (viewAnimator == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        viewAnimator.setDisplayedChild(1);
    }
}
