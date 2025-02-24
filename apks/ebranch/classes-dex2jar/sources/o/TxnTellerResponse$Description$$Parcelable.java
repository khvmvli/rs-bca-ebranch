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
import androidx.fragment.app.Fragment;
import java.util.List;
import o.TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable;
import o.TxnTellerResponse;
import o.TxnTellerResponse$$Parcelable;
import o.getSttDesc;
import o.setCurrencyName;
/* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$Description$$Parcelable.class */
public final class TxnTellerResponse$Description$$Parcelable extends Fragment implements TxnTellerResponse$$Parcelable.RemoteActionCompatParcelizer {
    public static final write b = new write((byte) 0);
    private TxnTellerResponse$$Parcelable a;
    private final onChooseValueSumberPenghasilan d;
    private setTotalAmountWarkat e;

    /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$Description$$Parcelable$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<Fragment> {
        final /* synthetic */ Fragment e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(Fragment fragment) {
            super(0);
            this.e = fragment;
        }

        @Override // o.pilihNoRek
        public final /* bridge */ /* synthetic */ Fragment invoke() {
            return this.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$Description$$Parcelable$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<performPrimaryNavigationFragmentChanged> {
        final /* synthetic */ pilihNoRek b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(pilihNoRek pilihnorek) {
            super(0);
            this.b = pilihnorek;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ performPrimaryNavigationFragmentChanged invoke() {
            performPrimaryNavigationFragmentChanged viewModelStore = ((performStart) this.b.invoke()).getViewModelStore();
            subscribeReservationRescheduleEvent.d(viewModelStore, "");
            return viewModelStore;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$Description$$Parcelable$read.class */
    static final class read extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read() {
            super(0);
            TxnTellerResponse$Description$$Parcelable.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ onCLickStatusNpwp invoke() {
            GetAreaPresenter.a(performSaveInstanceState.b(TxnTellerResponse$Description$$Parcelable.c(TxnTellerResponse$Description$$Parcelable.this)), (ProsesTarikanFragment_ViewBinding) null, (KategoriTujuanTransaksiORPresenter) null, new getSttDesc.IconCompatParcelizer(null), 3);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$Description$$Parcelable$write.class */
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public TxnTellerResponse$Description$$Parcelable() {
        TxnTellerResponse$Description$$Parcelable txnTellerResponse$Description$$Parcelable = this;
        this.d = onAttachFragment.c(txnTellerResponse$Description$$Parcelable, subscriberLoadDraftBankTransferEvent.a(getSttDesc.class), new RemoteActionCompatParcelizer(new IconCompatParcelizer(txnTellerResponse$Description$$Parcelable)), null);
    }

    public static final /* synthetic */ getSttDesc c(TxnTellerResponse$Description$$Parcelable txnTellerResponse$Description$$Parcelable) {
        return (getSttDesc) txnTellerResponse$Description$$Parcelable.d.d();
    }

    public static /* synthetic */ void e(TxnTellerResponse$Description$$Parcelable txnTellerResponse$Description$$Parcelable, List list) {
        subscribeReservationRescheduleEvent.e(txnTellerResponse$Description$$Parcelable, "");
        TxnTellerResponse$$Parcelable txnTellerResponse$$Parcelable = txnTellerResponse$Description$$Parcelable.a;
        setTotalAmountWarkat settotalamountwarkat = null;
        TxnTellerResponse$$Parcelable txnTellerResponse$$Parcelable2 = txnTellerResponse$$Parcelable;
        if (txnTellerResponse$$Parcelable == null) {
            subscribeReservationRescheduleEvent.e("");
            txnTellerResponse$$Parcelable2 = null;
        }
        subscribeReservationRescheduleEvent.d(list, "");
        subscribeReservationRescheduleEvent.e(list, "");
        txnTellerResponse$$Parcelable2.e = list;
        txnTellerResponse$$Parcelable2.a.b();
        settotalamountwarkat = txnTellerResponse$Description$$Parcelable.e;
        if (settotalamountwarkat == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        settotalamountwarkat.b.setVisibility(list.isEmpty() ? 0 : 8);
    }

    @Override // o.TxnTellerResponse$$Parcelable.RemoteActionCompatParcelizer
    public final void a(long j) {
        TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.read read2 = TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.j;
        getView requireActivity = requireActivity();
        subscribeReservationRescheduleEvent.d(requireActivity, "");
        TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.read.d(requireActivity, j);
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
        menuInflater.inflate(setCurrencyName$MediaBrowserCompat$MediaItem.d, menu);
        onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        View inflate = layoutInflater.inflate(setCurrencyName.read.a, viewGroup, false);
        int i = setCurrencyName.IconCompatParcelizer.t;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = (setOnStartEnterTransitionListener) setRotation.a(inflate, i);
        if (setonstartentertransitionlistener != null) {
            i = setCurrencyName.IconCompatParcelizer.ad;
            TextView textView = (TextView) setRotation.a(inflate, i);
            if (textView != null) {
                i = setCurrencyName.IconCompatParcelizer.ak;
                LinearLayout linearLayout = (LinearLayout) setRotation.a(inflate, i);
                if (linearLayout != null) {
                    setTotalAmountWarkat settotalamountwarkat = new setTotalAmountWarkat((FrameLayout) inflate, setonstartentertransitionlistener, textView, linearLayout);
                    subscribeReservationRescheduleEvent.d(settotalamountwarkat, "");
                    this.e = settotalamountwarkat;
                    this.a = new TxnTellerResponse$$Parcelable(this);
                    setTotalAmountWarkat settotalamountwarkat2 = this.e;
                    setTotalAmountWarkat settotalamountwarkat3 = null;
                    setTotalAmountWarkat settotalamountwarkat4 = settotalamountwarkat2;
                    if (settotalamountwarkat2 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        settotalamountwarkat4 = null;
                    }
                    settotalamountwarkat4.d.setMovementMethod(LinkMovementMethod.getInstance());
                    setOnStartEnterTransitionListener setonstartentertransitionlistener2 = settotalamountwarkat4.c;
                    setonstartentertransitionlistener2.setHasFixedSize(true);
                    setonstartentertransitionlistener2.e(new setArguments(setonstartentertransitionlistener2.getContext(), 1));
                    TxnTellerResponse$$Parcelable txnTellerResponse$$Parcelable = this.a;
                    TxnTellerResponse$$Parcelable txnTellerResponse$$Parcelable2 = txnTellerResponse$$Parcelable;
                    if (txnTellerResponse$$Parcelable == null) {
                        subscribeReservationRescheduleEvent.e("");
                        txnTellerResponse$$Parcelable2 = null;
                    }
                    setonstartentertransitionlistener2.setAdapter(txnTellerResponse$$Parcelable2);
                    settotalamountwarkat3 = this.e;
                    if (settotalamountwarkat3 == null) {
                        subscribeReservationRescheduleEvent.e("");
                    }
                    return settotalamountwarkat3.a;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        subscribeReservationRescheduleEvent.e(menuItem, "");
        if (menuItem.getItemId() == setCurrencyName.IconCompatParcelizer.f) {
            String string = getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.b);
            subscribeReservationRescheduleEvent.d(string, "");
            String string2 = getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.f);
            subscribeReservationRescheduleEvent.d(string2, "");
            getCategorySttCode getcategorysttcode = new getCategorySttCode(string, string2, getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.b), getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.d));
            Context requireContext = requireContext();
            subscribeReservationRescheduleEvent.d(requireContext, "");
            StockListBNResponse$StockBranch$$Parcelable.d(requireContext, getcategorysttcode, new read(), null);
            z = true;
        } else {
            z = onOptionsItemSelected(menuItem);
        }
        return z;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        ((getSttDesc) this.d.d()).d.a(getViewLifecycleOwner(), new TxnTellerResponse.Description(this));
    }
}
