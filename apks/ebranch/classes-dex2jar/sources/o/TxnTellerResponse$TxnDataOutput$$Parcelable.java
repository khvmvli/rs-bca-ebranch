package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.LiveData;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.ArrayList;
import o.Page6KLFragment;
import o.getPathData;
import o.performStop;
import o.setCurrencyName;
/* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$TxnDataOutput$$Parcelable.class */
public final class TxnTellerResponse$TxnDataOutput$$Parcelable extends setLcsCode {
    public static final read f = new read((byte) 0);
    private static int j;
    private final onChooseValueSumberPenghasilan n = new performResume(subscriberLoadDraftBankTransferEvent.a(getIsRepresentativeTransaction.class), new pilihNoRek<performPrimaryNavigationFragmentChanged>() { // from class: o.TxnTellerResponse$TxnDataOutput$$Parcelable$MediaBrowserCompat$MediaItem
        @Override // o.pilihNoRek
        public final /* synthetic */ performPrimaryNavigationFragmentChanged invoke() {
            performPrimaryNavigationFragmentChanged viewModelStore = MediaSessionCompat$QueueItem.this.getViewModelStore();
            subscribeReservationRescheduleEvent.d(viewModelStore, "");
            return viewModelStore;
        }
    }, new pilihNoRek<performStop.read>() { // from class: o.TxnTellerResponse$TxnDataOutput$$Parcelable$MediaBrowserCompat$SearchResultReceiver
        @Override // o.pilihNoRek
        public final /* synthetic */ performStop.read invoke() {
            return new DataTxnTeller$$Parcelable(TxnTellerResponse$TxnDataOutput$$Parcelable.this.getIntent().getLongExtra("transaction_id", 0));
        }
    });

    /* renamed from: o */
    private setProduct f130o;

    /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$TxnDataOutput$$Parcelable$IconCompatParcelizer.class */
    static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<HttpTransaction, TujuanTransaksiORResponse$$Parcelable> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer() {
            super(1);
            TxnTellerResponse$TxnDataOutput$$Parcelable.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ TujuanTransaksiORResponse$$Parcelable a(HttpTransaction httpTransaction) {
            HttpTransaction httpTransaction2 = httpTransaction;
            subscribeReservationRescheduleEvent.e(httpTransaction2, "");
            Object obj = TxnTellerResponse$TxnDataOutput$$Parcelable.c(TxnTellerResponse$TxnDataOutput$$Parcelable.this).e.c;
            if (obj == LiveData.e) {
                obj = null;
            }
            subscribeReservationRescheduleEvent.c(obj);
            return new TujuanTransaksiORResponse(httpTransaction2, ((Boolean) obj).booleanValue());
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$TxnDataOutput$$Parcelable$MediaMetadataCompat.class */
    public static final class MediaMetadataCompat extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp>, Object> {
        final /* synthetic */ TujuanTransaksiORResponse$$Parcelable b;
        int d;
        final /* synthetic */ TxnTellerResponse$TxnDataOutput$$Parcelable e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(TujuanTransaksiORResponse$$Parcelable tujuanTransaksiORResponse$$Parcelable, TxnTellerResponse$TxnDataOutput$$Parcelable txnTellerResponse$TxnDataOutput$$Parcelable, ProsesTarikanFragment<? super MediaMetadataCompat> prosesTarikanFragment) {
            super(2, prosesTarikanFragment);
            this.b = tujuanTransaksiORResponse$$Parcelable;
            this.e = txnTellerResponse$TxnDataOutput$$Parcelable;
        }

        public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
            return new MediaMetadataCompat(this.b, this.e, prosesTarikanFragment);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment) {
            return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
        }

        public final Object invokeSuspend(Object obj) {
            ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else if (obj instanceof Page6KLFragment.IconCompatParcelizer) {
                    throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
                }
            } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                TujuanTransaksiORResponse$$Parcelable tujuanTransaksiORResponse$$Parcelable = this.b;
                TxnTellerResponse$TxnDataOutput$$Parcelable txnTellerResponse$TxnDataOutput$$Parcelable = this.e;
                TxnTellerResponse$TxnDataOutput$$Parcelable txnTellerResponse$TxnDataOutput$$Parcelable2 = txnTellerResponse$TxnDataOutput$$Parcelable;
                String string = txnTellerResponse$TxnDataOutput$$Parcelable.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.K);
                subscribeReservationRescheduleEvent.d(string, "");
                String string2 = this.e.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.N);
                subscribeReservationRescheduleEvent.d(string2, "");
                this.d = 1;
                Object d = getSttCode.d(tujuanTransaksiORResponse$$Parcelable, txnTellerResponse$TxnDataOutput$$Parcelable2, string, string2, (ProsesTarikanFragment) this);
                obj = d;
                if (d == reviewSetoranFragment_ViewBinding) {
                    return reviewSetoranFragment_ViewBinding;
                }
            } else {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
            this.e.startActivity((Intent) obj);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$TxnDataOutput$$Parcelable$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<HttpTransaction, TujuanTransaksiORResponse$$Parcelable> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer() {
            super(1);
            TxnTellerResponse$TxnDataOutput$$Parcelable.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ TujuanTransaksiORResponse$$Parcelable a(HttpTransaction httpTransaction) {
            HttpTransaction httpTransaction2 = httpTransaction;
            subscribeReservationRescheduleEvent.e(httpTransaction2, "");
            Object obj = TxnTellerResponse$TxnDataOutput$$Parcelable.c(TxnTellerResponse$TxnDataOutput$$Parcelable.this).e.c;
            if (obj == LiveData.e) {
                obj = null;
            }
            subscribeReservationRescheduleEvent.c(obj);
            return new TujuanTransaksiORResponse(httpTransaction2, ((Boolean) obj).booleanValue());
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$TxnDataOutput$$Parcelable$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static void a(Context context, long j) {
            subscribeReservationRescheduleEvent.e(context, "");
            Intent intent = new Intent(context, TxnTellerResponse$TxnDataOutput$$Parcelable.class);
            intent.putExtra("transaction_id", j);
            context.startActivity(intent);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$TxnDataOutput$$Parcelable$write.class */
    public static final class write extends getPathData.MediaMetadataCompat {
        write() {
        }

        @Override // o.getPathData.MediaMetadataCompat, o.getPathData$MediaBrowserCompat$ItemReceiver
        public final void b(int i) {
            read read = TxnTellerResponse$TxnDataOutput$$Parcelable.f;
            TxnTellerResponse$TxnDataOutput$$Parcelable.j = i;
        }
    }

    public static final /* synthetic */ getIsRepresentativeTransaction c(TxnTellerResponse$TxnDataOutput$$Parcelable txnTellerResponse$TxnDataOutput$$Parcelable) {
        return (getIsRepresentativeTransaction) txnTellerResponse$TxnDataOutput$$Parcelable.n.d();
    }

    public static /* synthetic */ void c(MenuItem menuItem, Boolean bool) {
        subscribeReservationRescheduleEvent.d(bool, "");
        menuItem.setIcon(bool.booleanValue() ? setCurrencyName.RemoteActionCompatParcelizer.b : setCurrencyName.RemoteActionCompatParcelizer.d);
    }

    public static /* synthetic */ void c(TxnTellerResponse$TxnDataOutput$$Parcelable txnTellerResponse$TxnDataOutput$$Parcelable, String str) {
        subscribeReservationRescheduleEvent.e(txnTellerResponse$TxnDataOutput$$Parcelable, "");
        setProduct setproduct = txnTellerResponse$TxnDataOutput$$Parcelable.f130o;
        setProduct setproduct2 = setproduct;
        if (setproduct == null) {
            subscribeReservationRescheduleEvent.e("");
            setproduct2 = null;
        }
        setproduct2.d.setText(str);
    }

    private final boolean e(T1TransaksiTarikanUbahFragment_ViewBinding<? super HttpTransaction, ? extends TujuanTransaksiORResponse$$Parcelable> t1TransaksiTarikanUbahFragment_ViewBinding) {
        Object obj = ((getIsRepresentativeTransaction) this.n.d()).g.c;
        if (obj == LiveData.e) {
            obj = null;
        }
        HttpTransaction httpTransaction = (HttpTransaction) obj;
        if (httpTransaction == null) {
            String string = getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.v);
            subscribeReservationRescheduleEvent.d(string, "");
            subscribeReservationRescheduleEvent.e(string, "");
            Toast.makeText(this, string, 0).show();
            return true;
        }
        GetAreaPresenter.a(performConfigurationChanged.b(this), (ProsesTarikanFragment_ViewBinding) null, (KategoriTujuanTransaksiORPresenter) null, new MediaMetadataCompat((TujuanTransaksiORResponse$$Parcelable) t1TransaksiTarikanUbahFragment_ViewBinding.a(httpTransaction), this, null), 3);
        return true;
    }

    public static /* synthetic */ boolean e(TxnTellerResponse$TxnDataOutput$$Parcelable txnTellerResponse$TxnDataOutput$$Parcelable, MenuItem menuItem) {
        subscribeReservationRescheduleEvent.e(txnTellerResponse$TxnDataOutput$$Parcelable, "");
        subscribeReservationRescheduleEvent.e(menuItem, "");
        getIsRepresentativeTransaction getisrepresentativetransaction = (getIsRepresentativeTransaction) txnTellerResponse$TxnDataOutput$$Parcelable.n.d();
        Object obj = getisrepresentativetransaction.e.c;
        if (obj == LiveData.e) {
            obj = null;
        }
        subscribeReservationRescheduleEvent.c(obj);
        getisrepresentativetransaction.a.a(Boolean.valueOf(!((Boolean) obj).booleanValue()));
        return true;
    }

    @Override // o.setLcsCode, o.getView, o.MediaSessionCompat$QueueItem, o.IconCompat, android.app.Activity
    public final void onCreate(Bundle bundle) {
        onCreate(bundle);
        View inflate = getLayoutInflater().inflate(setCurrencyName.read.c, (ViewGroup) null, false);
        int i = setCurrencyName.IconCompatParcelizer.W;
        KetentuanORDialog_ViewBinding a = setRotation.a(inflate, i);
        if (a != null) {
            i = setCurrencyName.IconCompatParcelizer.ae;
            cancel a2 = setRotation.a(inflate, i);
            if (a2 != null) {
                i = setCurrencyName.IconCompatParcelizer.af;
                TextView textView = (TextView) setRotation.a(inflate, i);
                if (textView != null) {
                    i = setCurrencyName.IconCompatParcelizer.al;
                    getPathData getpathdata = (getPathData) setRotation.a(inflate, i);
                    if (getpathdata != null) {
                        setProduct setproduct = new setProduct((CoordinatorLayout) inflate, a, a2, textView, getpathdata);
                        subscribeReservationRescheduleEvent.d(setproduct, "");
                        this.f130o = setproduct;
                        setContentView(setproduct.e);
                        b((setInputType) setproduct.b);
                        getPathData getpathdata2 = setproduct.a;
                        subscribeReservationRescheduleEvent.d(getpathdata2, "");
                        isDetached l = l();
                        subscribeReservationRescheduleEvent.d(l, "");
                        getpathdata2.setAdapter(new getBranchPhone(this, l));
                        write write2 = new write();
                        if (getpathdata2.n == null) {
                            getpathdata2.n = new ArrayList();
                        }
                        getpathdata2.n.add(write2);
                        getpathdata2.setCurrentItem(j);
                        setproduct.c.setupWithViewPager(setproduct.a);
                        setBackgroundResource i2 = i();
                        if (i2 != null) {
                            i2.d(true);
                        }
                        ((getIsRepresentativeTransaction) this.n.d()).h.a(this, new performLowMemory() { // from class: o.BranchDetail
                            @Override // o.performLowMemory
                            public final void e(Object obj) {
                                TxnTellerResponse$TxnDataOutput$$Parcelable.c(TxnTellerResponse$TxnDataOutput$$Parcelable.this, (String) obj);
                            }
                        });
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        subscribeReservationRescheduleEvent.e(menu, "");
        getMenuInflater().inflate(setCurrencyName$MediaBrowserCompat$MediaItem.b, menu);
        MenuItem findItem = menu.findItem(setCurrencyName.IconCompatParcelizer.r);
        findItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o.TxnTellerResponse$ValueTxnDataDetail$$Parcelable
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return TxnTellerResponse$TxnDataOutput$$Parcelable.e(TxnTellerResponse$TxnDataOutput$$Parcelable.this, menuItem);
            }
        });
        ((getIsRepresentativeTransaction) this.n.d()).e.a(this, new performLowMemory(findItem) { // from class: o.UpdateRefNumberResponse
            public final /* synthetic */ MenuItem e;

            {
                this.e = r4;
            }

            @Override // o.performLowMemory
            public final void e(Object obj) {
                TxnTellerResponse$TxnDataOutput$$Parcelable.c(this.e, (Boolean) obj);
            }
        });
        return onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        subscribeReservationRescheduleEvent.e(menuItem, "");
        int itemId = menuItem.getItemId();
        if (itemId == setCurrencyName.IconCompatParcelizer.P) {
            z = e(new RemoteActionCompatParcelizer());
        } else if (itemId == setCurrencyName.IconCompatParcelizer.L) {
            z = e(TxnTellerResponse$TxnDataOutput$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver.d);
        } else if (itemId == setCurrencyName.IconCompatParcelizer.Q) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
            Object obj = ((getIsRepresentativeTransaction) this.n.d()).g.c;
            if (obj == LiveData.e) {
                obj = null;
            }
            HttpTransaction httpTransaction = (HttpTransaction) obj;
            if (httpTransaction == null) {
                String string = getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.v);
                subscribeReservationRescheduleEvent.d(string, "");
                subscribeReservationRescheduleEvent.e(string, "");
                Toast.makeText(this, string, 0).show();
            } else {
                GetAreaPresenter.a(performConfigurationChanged.b(this), (ProsesTarikanFragment_ViewBinding) null, (KategoriTujuanTransaksiORPresenter) null, new TxnTellerResponse$TxnDataOutput$$Parcelable$MediaBrowserCompat$ItemReceiver(iconCompatParcelizer.a(httpTransaction), this, null), 3);
            }
            z = true;
        } else {
            z = onOptionsItemSelected(menuItem);
        }
        return z;
    }
}
