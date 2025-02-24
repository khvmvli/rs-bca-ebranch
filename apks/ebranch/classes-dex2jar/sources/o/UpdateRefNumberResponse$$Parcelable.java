package o;

import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import java.util.List;
import o.TxnTellerResponse$TxnDataOutput$$Parcelable;
import o.UpdateRefNumberResponse$$Parcelable;
import o.getNewRefNum;
import o.setCurrencyName;
/* loaded from: classes-dex2jar.jar:o/UpdateRefNumberResponse$$Parcelable.class */
public final class UpdateRefNumberResponse$$Parcelable extends Fragment implements SearchView.RemoteActionCompatParcelizer, getNewRefNum.read {
    public static final read c = new read((byte) 0);
    private setReceiverStatesName b;
    private final onChooseValueSumberPenghasilan d;
    private getNewRefNum e;

    /* loaded from: classes-dex2jar.jar:o/UpdateRefNumberResponse$$Parcelable$IconCompatParcelizer.class */
    static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer() {
            super(0);
            UpdateRefNumberResponse$$Parcelable.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ onCLickStatusNpwp invoke() {
            UpdateRefNumberResponse$$Parcelable.d(UpdateRefNumberResponse$$Parcelable.this).e();
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/UpdateRefNumberResponse$$Parcelable$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<Fragment> {
        final /* synthetic */ Fragment e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(Fragment fragment) {
            super(0);
            this.e = fragment;
        }

        @Override // o.pilihNoRek
        public final /* bridge */ /* synthetic */ Fragment invoke() {
            return this.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/UpdateRefNumberResponse$$Parcelable$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/UpdateRefNumberResponse$$Parcelable$write.class */
    public static final class write extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp>, Object> {
        int e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(ProsesTarikanFragment<? super write> prosesTarikanFragment) {
            super(2, prosesTarikanFragment);
            UpdateRefNumberResponse$$Parcelable.this = r5;
        }

        public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
            return new write(prosesTarikanFragment);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment) {
            return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x012b  */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
            // Method dump skipped, instructions count: 319
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UpdateRefNumberResponse$$Parcelable.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public UpdateRefNumberResponse$$Parcelable() {
        UpdateRefNumberResponse$$Parcelable updateRefNumberResponse$$Parcelable = this;
        this.d = onAttachFragment.c(updateRefNumberResponse$$Parcelable, subscriberLoadDraftBankTransferEvent.a(getSttDesc.class), new pilihNoRek<performPrimaryNavigationFragmentChanged>() { // from class: o.UpdateRefNumberResponse$$Parcelable$MediaBrowserCompat$ItemReceiver
            @Override // o.pilihNoRek
            public final /* synthetic */ performPrimaryNavigationFragmentChanged invoke() {
                performPrimaryNavigationFragmentChanged viewModelStore = ((performStart) pilihNoRek.this.invoke()).getViewModelStore();
                subscribeReservationRescheduleEvent.d(viewModelStore, "");
                return viewModelStore;
            }
        }, null);
    }

    public static final /* synthetic */ getSttDesc d(UpdateRefNumberResponse$$Parcelable updateRefNumberResponse$$Parcelable) {
        return (getSttDesc) updateRefNumberResponse$$Parcelable.d.d();
    }

    public static /* synthetic */ void d(UpdateRefNumberResponse$$Parcelable updateRefNumberResponse$$Parcelable, List list) {
        subscribeReservationRescheduleEvent.e(updateRefNumberResponse$$Parcelable, "");
        getNewRefNum getnewrefnum = updateRefNumberResponse$$Parcelable.e;
        setReceiverStatesName setreceiverstatesname = null;
        getNewRefNum getnewrefnum2 = getnewrefnum;
        if (getnewrefnum == null) {
            subscribeReservationRescheduleEvent.e("");
            getnewrefnum2 = null;
        }
        subscribeReservationRescheduleEvent.d(list, "");
        subscribeReservationRescheduleEvent.e(list, "");
        getnewrefnum2.b = list;
        getnewrefnum2.a.b();
        setreceiverstatesname = updateRefNumberResponse$$Parcelable.b;
        if (setreceiverstatesname == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        setreceiverstatesname.c.setVisibility(list.isEmpty() ? 0 : 8);
    }

    @Override // androidx.appcompat.widget.SearchView.RemoteActionCompatParcelizer
    public final boolean a(String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str, "");
        ((getSttDesc) this.d.d()).b.a(str);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.RemoteActionCompatParcelizer
    public final boolean b(String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        return true;
    }

    @Override // o.getNewRefNum.read
    public final void e(long j) {
        TxnTellerResponse$TxnDataOutput$$Parcelable.read read2 = TxnTellerResponse$TxnDataOutput$$Parcelable.f;
        getView requireActivity = requireActivity();
        subscribeReservationRescheduleEvent.d(requireActivity, "");
        TxnTellerResponse$TxnDataOutput$$Parcelable.read.a(requireActivity, j);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        subscribeReservationRescheduleEvent.e(menu, "");
        subscribeReservationRescheduleEvent.e(menuInflater, "");
        menuInflater.inflate(setCurrencyName$MediaBrowserCompat$MediaItem.c, menu);
        View actionView = menu.findItem(setCurrencyName.IconCompatParcelizer.K).getActionView();
        if (actionView != null) {
            SearchView searchView = (SearchView) actionView;
            searchView.setOnQueryTextListener(this);
            searchView.setIconifiedByDefault(true);
            onCreateOptionsMenu(menu, menuInflater);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        View inflate = layoutInflater.inflate(setCurrencyName.read.b, viewGroup, false);
        int i = setCurrencyName.IconCompatParcelizer.ag;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = (setOnStartEnterTransitionListener) setRotation.a(inflate, i);
        if (setonstartentertransitionlistener != null) {
            i = setCurrencyName.IconCompatParcelizer.ad;
            TextView textView = (TextView) setRotation.a(inflate, i);
            if (textView != null) {
                i = setCurrencyName.IconCompatParcelizer.ak;
                LinearLayout linearLayout = (LinearLayout) setRotation.a(inflate, i);
                if (linearLayout != null) {
                    setReceiverStatesName setreceiverstatesname = new setReceiverStatesName((FrameLayout) inflate, setonstartentertransitionlistener, textView, linearLayout);
                    subscribeReservationRescheduleEvent.d(setreceiverstatesname, "");
                    this.b = setreceiverstatesname;
                    Context requireContext = requireContext();
                    subscribeReservationRescheduleEvent.d(requireContext, "");
                    this.e = new getNewRefNum(requireContext, this);
                    setReceiverStatesName setreceiverstatesname2 = this.b;
                    setReceiverStatesName setreceiverstatesname3 = null;
                    setReceiverStatesName setreceiverstatesname4 = setreceiverstatesname2;
                    if (setreceiverstatesname2 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        setreceiverstatesname4 = null;
                    }
                    setreceiverstatesname4.e.setMovementMethod(LinkMovementMethod.getInstance());
                    setOnStartEnterTransitionListener setonstartentertransitionlistener2 = setreceiverstatesname4.a;
                    setonstartentertransitionlistener2.setHasFixedSize(true);
                    setonstartentertransitionlistener2.e(new setArguments(requireContext(), 1));
                    getNewRefNum getnewrefnum = this.e;
                    getNewRefNum getnewrefnum2 = getnewrefnum;
                    if (getnewrefnum == null) {
                        subscribeReservationRescheduleEvent.e("");
                        getnewrefnum2 = null;
                    }
                    setonstartentertransitionlistener2.setAdapter(getnewrefnum2);
                    setreceiverstatesname3 = this.b;
                    if (setreceiverstatesname3 == null) {
                        subscribeReservationRescheduleEvent.e("");
                    }
                    return setreceiverstatesname3.b;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        subscribeReservationRescheduleEvent.e(menuItem, "");
        int itemId = menuItem.getItemId();
        if (itemId == setCurrencyName.IconCompatParcelizer.f) {
            Context requireContext = requireContext();
            subscribeReservationRescheduleEvent.d(requireContext, "");
            String string = getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.b);
            subscribeReservationRescheduleEvent.d(string, "");
            String string2 = getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.a);
            subscribeReservationRescheduleEvent.d(string2, "");
            StockListBNResponse$StockBranch$$Parcelable.d(requireContext, new getCategorySttCode(string, string2, getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.b), getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.d)), new IconCompatParcelizer(), null);
        } else if (itemId == setCurrencyName.IconCompatParcelizer.p) {
            Context requireContext2 = requireContext();
            subscribeReservationRescheduleEvent.d(requireContext2, "");
            String string3 = getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.h);
            subscribeReservationRescheduleEvent.d(string3, "");
            String string4 = getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.g);
            subscribeReservationRescheduleEvent.d(string4, "");
            StockListBNResponse$StockBranch$$Parcelable.d(requireContext2, new getCategorySttCode(string3, string4, getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.h), getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.d)), new pilihNoRek<onCLickStatusNpwp>() { // from class: o.UpdateRefNumberResponse$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver
                @Override // o.pilihNoRek
                public final /* synthetic */ onCLickStatusNpwp invoke() {
                    UpdateReceiverDataPresenter unused = GetAreaPresenter.a(performConfigurationChanged.b(r0), (ProsesTarikanFragment_ViewBinding) null, (KategoriTujuanTransaksiORPresenter) null, new UpdateRefNumberResponse$$Parcelable.write(null), 3);
                    return onCLickStatusNpwp.e;
                }
            }, null);
        } else {
            z = onOptionsItemSelected(menuItem);
            return z;
        }
        z = true;
        return z;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        ((getSttDesc) this.d.d()).a.a(getViewLifecycleOwner(), new performLowMemory() { // from class: o.setBranchLong
            @Override // o.performLowMemory
            public final void e(Object obj) {
                UpdateRefNumberResponse$$Parcelable.d(UpdateRefNumberResponse$$Parcelable.this, (List) obj);
            }
        });
    }
}
