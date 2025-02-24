package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.LiveData;
import java.text.DateFormat;
import java.util.List;
import o.GetTxnTellerDetailResponse;
import o.TxnTellerResponse;
import o.consumeDisplayCutout;
import o.performStop;
import o.setCurrencyName;
/* loaded from: classes-dex2jar.jar:o/TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.class */
public final class TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable extends setLcsCode {
    public static final read j = new read((byte) 0);
    private setLimitMin f;

    /* renamed from: o */
    private final onChooseValueSumberPenghasilan f129o = new performResume(subscriberLoadDraftBankTransferEvent.a(TxnTellerResponse.TxnDataOutput.class), new RemoteActionCompatParcelizer(this), new IconCompatParcelizer());

    /* loaded from: classes-dex2jar.jar:o/TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable$IconCompatParcelizer.class */
    static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<performStop.read> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer() {
            super(0);
            TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ performStop.read invoke() {
            return new TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable(TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.this.getIntent().getLongExtra("transaction_id", 0));
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<performPrimaryNavigationFragmentChanged> {
        final /* synthetic */ MediaSessionCompat$QueueItem d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem) {
            super(0);
            this.d = mediaSessionCompat$QueueItem;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ performPrimaryNavigationFragmentChanged invoke() {
            performPrimaryNavigationFragmentChanged viewModelStore = this.d.getViewModelStore();
            subscribeReservationRescheduleEvent.d(viewModelStore, "");
            return viewModelStore;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static void d(Context context, long j) {
            subscribeReservationRescheduleEvent.e(context, "");
            Intent intent = new Intent(context, TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.class);
            intent.putExtra("transaction_id", j);
            context.startActivity(intent);
        }
    }

    public static /* synthetic */ void e(TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable tujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable, GetTxnTellerDetailResponse.TxnDetail.Representative representative) {
        subscribeReservationRescheduleEvent.e(tujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable, "");
        subscribeReservationRescheduleEvent.d(representative, "");
        setLimitMin setlimitmin = tujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.f;
        setLimitMin setlimitmin2 = setlimitmin;
        if (setlimitmin == null) {
            subscribeReservationRescheduleEvent.e("");
            setlimitmin2 = null;
        }
        TextView textView = setlimitmin2.e;
        String format = DateFormat.getDateTimeInstance(3, 2).format(representative.d);
        subscribeReservationRescheduleEvent.d(format, "");
        textView.setText(format);
        setlimitmin2.a.d.setText(representative.c);
        setlimitmin2.a.e.setText(representative.a);
        setlimitmin2.a.a.setText(representative.e);
        setlimitmin2.c.setText(representative.b);
    }

    @Override // o.setLcsCode, o.getView, o.MediaSessionCompat$QueueItem, o.IconCompat, android.app.Activity
    public final void onCreate(Bundle bundle) {
        onCreate(bundle);
        View inflate = getLayoutInflater().inflate(setCurrencyName.read.d, (ViewGroup) null, false);
        int i = setCurrencyName.IconCompatParcelizer.X;
        View a = setRotation.a(inflate, i);
        if (a != null) {
            setWarkat b = setWarkat.b(a);
            i = setCurrencyName.IconCompatParcelizer.Y;
            TextView textView = (TextView) setRotation.a(inflate, i);
            if (textView != null) {
                i = setCurrencyName.IconCompatParcelizer.ae;
                cancel a2 = setRotation.a(inflate, i);
                if (a2 != null) {
                    i = setCurrencyName.IconCompatParcelizer.af;
                    TextView textView2 = (TextView) setRotation.a(inflate, i);
                    if (textView2 != null) {
                        setLimitMin setlimitmin = new setLimitMin((CoordinatorLayout) inflate, b, textView, a2, textView2);
                        subscribeReservationRescheduleEvent.d(setlimitmin, "");
                        this.f = setlimitmin;
                        setContentView(setlimitmin.d);
                        b((setInputType) setlimitmin.b);
                        setlimitmin.a.b.setVisibility(8);
                        setBackgroundResource i2 = i();
                        if (i2 != null) {
                            i2.d(true);
                        }
                        ((TxnTellerResponse.TxnDataOutput) this.f129o.d()).d.a(this, new performLowMemory() { // from class: o.TxnTellerResponse

                            /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$Description.class */
                            public final /* synthetic */ class Description implements performLowMemory {
                                public final /* synthetic */ TxnTellerResponse$Description$$Parcelable e;

                                public /* synthetic */ Description(TxnTellerResponse$Description$$Parcelable txnTellerResponse$Description$$Parcelable) {
                                    this.e = txnTellerResponse$Description$$Parcelable;
                                }

                                @Override // o.performLowMemory
                                public final void e(Object obj) {
                                    TxnTellerResponse$Description$$Parcelable.e(this.e, (List) obj);
                                }
                            }

                            /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$TxnDataOutput.class */
                            public final class TxnDataOutput extends performPictureInPictureModeChanged {
                                final LiveData<GetTxnTellerDetailResponse.TxnDetail.Representative> d;

                                public TxnDataOutput(long j) {
                                    KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable kategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable = KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e;
                                    this.d = KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.b().d(j);
                                }
                            }

                            /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$ValueTxnDataDetail.class */
                            public enum ValueTxnDataDetail {
                                REQUEST,
                                RESPONSE
                            }

                            /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$ValueTxnSubDataDetail.class */
                            public abstract class ValueTxnSubDataDetail {
                                final int d;
                                final int e;

                                /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$ValueTxnSubDataDetail$read.class */
                                public static final class read extends ValueTxnSubDataDetail {
                                    public read() {
                                        super(setCurrencyName.RemoteActionCompatParcelizer.e, setCurrencyName.write.h, (byte) 0);
                                    }
                                }

                                /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$ValueTxnSubDataDetail$write.class */
                                public static final class write extends ValueTxnSubDataDetail {
                                    public write() {
                                        super(setCurrencyName.RemoteActionCompatParcelizer.a, setCurrencyName.write.i, (byte) 0);
                                    }
                                }

                                private ValueTxnSubDataDetail(int i, int i2) {
                                    this.e = i;
                                    this.d = i2;
                                }

                                public /* synthetic */ ValueTxnSubDataDetail(int i, int i2, byte b) {
                                    this(i, i2);
                                }
                            }

                            @Override // o.performLowMemory
                            public final void e(Object obj) {
                                TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.e(TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.this, (GetTxnTellerDetailResponse.TxnDetail.Representative) obj);
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
        MenuInflater menuInflater = getMenuInflater();
        subscribeReservationRescheduleEvent.d(menuInflater, "");
        menuInflater.inflate(setCurrencyName$MediaBrowserCompat$MediaItem.e, menu);
        return onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        subscribeReservationRescheduleEvent.e(menuItem, "");
        if (menuItem.getItemId() == setCurrencyName.IconCompatParcelizer.P) {
            Object obj = ((TxnTellerResponse.TxnDataOutput) this.f129o.d()).d.c;
            if (obj == LiveData.e) {
                obj = null;
            }
            GetTxnTellerDetailResponse.TxnDetail.Representative representative = (GetTxnTellerDetailResponse.TxnDetail.Representative) obj;
            z = true;
            if (representative != null) {
                int i = setCurrencyName$MediaBrowserCompat$ItemReceiver.G;
                String format = DateFormat.getDateTimeInstance(3, 2).format(representative.d);
                subscribeReservationRescheduleEvent.d(format, "");
                String string = getString(i, format, representative.a, representative.c, representative.e, representative.b);
                subscribeReservationRescheduleEvent.d(string, "");
                startActivity(consumeDisplayCutout.read.e(this).d("text/plain").c((CharSequence) getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.M)).c(getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.H)).b((CharSequence) string).d());
                z = true;
            }
        } else {
            z = onOptionsItemSelected(menuItem);
        }
        return z;
    }
}
