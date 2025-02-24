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
/* loaded from: classes-dex2jar.jar:o/onClickBankTransfer.class */
public final class onClickBankTransfer extends BaseActivityPostLoginKotlin implements TextWatcher, BankListPresenter.IconCompatParcelizer {
    private boolean E;
    private int F;
    private final onChooseValueSumberPenghasilan G;
    private boolean I;
    public DetailTundaReservasiROActivity_ViewBinding f;
    public LinearLayout k;
    public setOnStartEnterTransitionListener l;
    public setInputType m;
    public String n;

    /* renamed from: o */
    public EditText f168o;
    public TextView p;
    public TextView q;
    public ViewAnimator s;
    private final onChooseValueSumberPenghasilan u;
    private boolean z;
    public static final IconCompatParcelizer j = new IconCompatParcelizer((byte) 0);
    private static final String t = "IS_FROM_RESERVATION";
    private static final String r = "IS_FROM_UBAH_PAGE";
    private static final String w = "IS_ONLY_SAVE_DRAFT";
    private static final String y = "TOTAL_COUNT_LIST_TEMP";
    public Map<Integer, View> h = new LinkedHashMap();
    private final String v = "PilihBankTransferActivity";
    private List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> A = new ArrayList();

    /* loaded from: classes-dex2jar.jar:o/onClickBankTransfer$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/onClickBankTransfer$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<BankListPresenter> {
        public static final RemoteActionCompatParcelizer b = new RemoteActionCompatParcelizer();

        RemoteActionCompatParcelizer() {
            super(0);
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ BankListPresenter invoke() {
            return new BankListPresenter();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/onClickBankTransfer$read.class */
    static final class read extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<JenisKodeBankAdapter$JenisKodeBankVH> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read() {
            super(0);
            onClickBankTransfer.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ JenisKodeBankAdapter$JenisKodeBankVH invoke() {
            JenisKodeBankAdapter$JenisKodeBankVH c = JenisKodeBankAdapter$JenisKodeBankVH.c(onClickBankTransfer.this.getLayoutInflater().inflate(2131492977, (ViewGroup) null, false));
            subscribeReservationRescheduleEvent.d(c, "");
            return c;
        }
    }

    public onClickBankTransfer() {
        read read2 = new read();
        subscribeReservationRescheduleEvent.e(read2, "");
        this.u = new Page6KLFragment_ViewBinding(read2, null, 2);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = RemoteActionCompatParcelizer.b;
        subscribeReservationRescheduleEvent.e(remoteActionCompatParcelizer, "");
        this.G = new Page6KLFragment_ViewBinding(remoteActionCompatParcelizer, null, 2);
    }

    public static /* synthetic */ void d(onClickBankTransfer onclickbanktransfer, View view) {
        subscribeReservationRescheduleEvent.e(onclickbanktransfer, "");
        ((BankListPresenter) onclickbanktransfer.G.d()).d(onclickbanktransfer.J());
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final View D() {
        LinearLayout linearLayout = ((JenisKodeBankAdapter$JenisKodeBankVH) this.u.d()).h;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        return linearLayout;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final void G() {
        setCardSlogan.e().b = this.v;
        h(this.v);
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void a_(String str) {
        TextView textView = this.q;
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
            EditText editText2 = this.f168o;
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
        TextView textView = this.q;
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
        TextView textView = this.q;
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
        setInputType setinputtype = ((JenisKodeBankAdapter$JenisKodeBankVH) this.u.d()).a.b;
        subscribeReservationRescheduleEvent.d(setinputtype, "");
        subscribeReservationRescheduleEvent.e(setinputtype, "");
        this.m = setinputtype;
        TextView textView = ((JenisKodeBankAdapter$JenisKodeBankVH) this.u.d()).a.c;
        subscribeReservationRescheduleEvent.d(textView, "");
        subscribeReservationRescheduleEvent.e(textView, "");
        this.p = textView;
        String string = getResources().getString(2131822486);
        subscribeReservationRescheduleEvent.d(string, "");
        subscribeReservationRescheduleEvent.e(string, "");
        this.n = string;
        EditText editText = ((JenisKodeBankAdapter$JenisKodeBankVH) this.u.d()).d;
        subscribeReservationRescheduleEvent.d(editText, "");
        subscribeReservationRescheduleEvent.e(editText, "");
        this.f168o = editText;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = ((JenisKodeBankAdapter$JenisKodeBankVH) this.u.d()).i;
        subscribeReservationRescheduleEvent.d(setonstartentertransitionlistener, "");
        subscribeReservationRescheduleEvent.e(setonstartentertransitionlistener, "");
        this.l = setonstartentertransitionlistener;
        TextView textView2 = ((JenisKodeBankAdapter$JenisKodeBankVH) this.u.d()).e.e;
        subscribeReservationRescheduleEvent.d(textView2, "");
        subscribeReservationRescheduleEvent.e(textView2, "");
        this.q = textView2;
        ViewAnimator viewAnimator = ((JenisKodeBankAdapter$JenisKodeBankVH) this.u.d()).g;
        subscribeReservationRescheduleEvent.d(viewAnimator, "");
        subscribeReservationRescheduleEvent.e(viewAnimator, "");
        this.s = viewAnimator;
        LinearLayout linearLayout = ((JenisKodeBankAdapter$JenisKodeBankVH) this.u.d()).c;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        subscribeReservationRescheduleEvent.e(linearLayout, "");
        this.k = linearLayout;
        ((BankListPresenter) this.G.d()).d = this;
        setInputType setinputtype2 = this.m;
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
        TextView textView3 = this.p;
        if (textView3 == null) {
            subscribeReservationRescheduleEvent.e("");
            textView3 = null;
        }
        String str = this.n;
        if (str == null) {
            subscribeReservationRescheduleEvent.e("");
            str = null;
        }
        textView3.setText(Html.fromHtml(str));
        Bundle extras = getIntent().getExtras();
        subscribeReservationRescheduleEvent.c(extras);
        this.E = extras.getBoolean(r, false);
        this.z = extras.getBoolean(t, false);
        this.I = extras.getBoolean(w, false);
        this.F = extras.getInt(y);
        ((JenisKodeBankAdapter$JenisKodeBankVH) this.u.d()).e.a.setOnClickListener(new View.OnClickListener() { // from class: o.onLoginFingerprintEvent
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onClickBankTransfer.d(onClickBankTransfer.this, view);
            }
        });
        editText2 = this.f168o;
        if (editText2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        editText2.addTextChangedListener(this);
        ((BankListPresenter) this.G.d()).d(J());
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final <T> void d(T t2) {
        if (t2 != null) {
            List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> list = ((OpenAccountActivity_ViewBinding) t2).e;
            PenerimaFragment penerimaFragment = list;
            if (list == null) {
                penerimaFragment = PenerimaFragment.b;
            }
            List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> list2 = penerimaFragment;
            subscribeReservationRescheduleEvent.e(list2, "");
            ArrayList arrayList = new ArrayList(list2);
            this.A = arrayList;
            if (arrayList.size() > 1) {
                onClickBankTransfer$MediaBrowserCompat$CustomActionResultReceiver onclickbanktransfer_mediabrowsercompat_customactionresultreceiver = new Comparator() { // from class: o.onClickBankTransfer$MediaBrowserCompat$CustomActionResultReceiver
                    @Override // java.util.Comparator
                    public final int compare(T t3, T t4) {
                        String str = ((OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver) t3).e;
                        String str2 = ((OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver) t4).e;
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
                };
                subscribeReservationRescheduleEvent.e(arrayList, "");
                subscribeReservationRescheduleEvent.e(onclickbanktransfer_mediabrowsercompat_customactionresultreceiver, "");
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList, onclickbanktransfer_mediabrowsercompat_customactionresultreceiver);
                }
            }
            DetailTundaReservasiROActivity_ViewBinding detailTundaReservasiROActivity_ViewBinding = new DetailTundaReservasiROActivity_ViewBinding(this, this.A);
            subscribeReservationRescheduleEvent.e(detailTundaReservasiROActivity_ViewBinding, "");
            this.f = detailTundaReservasiROActivity_ViewBinding;
            setOnStartEnterTransitionListener setonstartentertransitionlistener = this.l;
            ViewAnimator viewAnimator = null;
            if (setonstartentertransitionlistener == null) {
                subscribeReservationRescheduleEvent.e("");
                setonstartentertransitionlistener = null;
            }
            setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
            setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.l;
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
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.data.api.response.BankListResponse");
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
        TextView textView = this.q;
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
        if (subscribeReservationRescheduleEvent.b((Object) reservasiSuccessEChannelActivity_ViewBinding.d, (Object) "Y") && !this.I) {
            getPromotion.d(this);
            finish();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (this.z) {
            return true;
        }
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin, o.setPadding, o.getView, android.app.Activity
    public final void onDestroy() {
        ((BankListPresenter) this.G.d()).b();
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
        } else if (this.z) {
            new KeluarFormReservationDialog().show(l(), "KeluarFormReservationDialog");
        } else if (this.E) {
            YakinKeluarDialog yakinKeluarDialog = new YakinKeluarDialog();
            yakinKeluarDialog.d = "transaction_teller";
            yakinKeluarDialog.show(l(), "YakinKeluarDialog");
        } else if (this.I) {
            SimpanDraftDialog simpanDraftDialog = new SimpanDraftDialog();
            simpanDraftDialog.b = "transaction_teller";
            simpanDraftDialog.show(l(), "SimpanDraftDialog");
        } else {
            SimpanDraftAndHitServiceDialog simpanDraftAndHitServiceDialog = new SimpanDraftAndHitServiceDialog();
            simpanDraftAndHitServiceDialog.a = this.F;
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
        TextView textView = this.q;
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
