package o;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import o.KetentuanORDialog_ViewBinding;
import o.TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable;
import o.TxnTellerResponse$$Parcelable;
import o.TxnTellerResponse$TxnDataOutput$$Parcelable;
import o.getNewRefNum;
import o.setCurrencyName;
/* loaded from: classes-dex2jar.jar:o/setSttCode.class */
public final class setSttCode extends setLcsCode implements getNewRefNum.read, TxnTellerResponse$$Parcelable.RemoteActionCompatParcelizer {
    public static final read f = new read((byte) 0);
    private setLimitMax j;

    /* loaded from: classes-dex2jar.jar:o/setSttCode$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    private final void d(Intent intent) {
        int i = 1;
        int intExtra = intent.getIntExtra("EXTRA_SCREEN", 1);
        setLimitMax setlimitmax = this.j;
        setLimitMax setlimitmax2 = setlimitmax;
        if (setlimitmax == null) {
            subscribeReservationRescheduleEvent.e("");
            setlimitmax2 = null;
        }
        getPathData getpathdata = setlimitmax2.d;
        if (intExtra == 1) {
            i = 0;
        }
        getpathdata.setCurrentItem(i);
    }

    @Override // o.TxnTellerResponse$$Parcelable.RemoteActionCompatParcelizer
    public final void a(long j) {
        TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.read read2 = TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.j;
        TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.read.d(this, j);
    }

    @Override // o.getNewRefNum.read
    public final void e(long j) {
        TxnTellerResponse$TxnDataOutput$$Parcelable.read read2 = TxnTellerResponse$TxnDataOutput$$Parcelable.f;
        TxnTellerResponse$TxnDataOutput$$Parcelable.read.a(this, j);
    }

    @Override // o.setLcsCode, o.getView, o.MediaSessionCompat$QueueItem, o.IconCompat, android.app.Activity
    public final void onCreate(Bundle bundle) {
        onCreate(bundle);
        View inflate = getLayoutInflater().inflate(setCurrencyName.read.e, (ViewGroup) null, false);
        int i = setCurrencyName.IconCompatParcelizer.W;
        KetentuanORDialog_ViewBinding a = setRotation.a(inflate, i);
        if (a != null) {
            i = setCurrencyName.IconCompatParcelizer.ae;
            cancel a2 = setRotation.a(inflate, i);
            if (a2 != null) {
                i = setCurrencyName.IconCompatParcelizer.al;
                getPathData getpathdata = (getPathData) setRotation.a(inflate, i);
                if (getpathdata != null) {
                    setLimitMax setlimitmax = new setLimitMax((LinearLayout) inflate, a, a2, getpathdata);
                    subscribeReservationRescheduleEvent.d(setlimitmax, "");
                    this.j = setlimitmax;
                    setContentView(setlimitmax.e);
                    b((setInputType) setlimitmax.a);
                    cancel cancel = setlimitmax.a;
                    CharSequence loadLabel = getApplicationInfo().loadLabel(getPackageManager());
                    subscribeReservationRescheduleEvent.d(loadLabel, "");
                    cancel.setSubtitle(loadLabel);
                    getPathData getpathdata2 = setlimitmax.d;
                    isDetached l = l();
                    subscribeReservationRescheduleEvent.d(l, "");
                    getpathdata2.setAdapter(new setSttDesc(this, l));
                    setlimitmax.b.setupWithViewPager(setlimitmax.d);
                    getPathData getpathdata3 = setlimitmax.d;
                    getPathData$MediaBrowserCompat$ItemReceiver getpathdata_mediabrowsercompat_itemreceiver = (getPathData$MediaBrowserCompat$ItemReceiver) new KetentuanORDialog_ViewBinding.MediaBrowserCompat.SearchResultReceiver(setlimitmax.b) { // from class: o.setSttCode$MediaBrowserCompat$CustomActionResultReceiver
                        public final void b(int i2) {
                            b(i2);
                            if (i2 == 0) {
                                setFlag_iban.c(setSttCode.this);
                            } else {
                                setFlag_iban.a(setSttCode.this);
                            }
                        }
                    };
                    if (getpathdata3.n == null) {
                        getpathdata3.n = new ArrayList();
                    }
                    getpathdata3.n.add(getpathdata_mediabrowsercompat_itemreceiver);
                    Intent intent = getIntent();
                    subscribeReservationRescheduleEvent.d(intent, "");
                    d(intent);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // o.getView, android.app.Activity
    public final void onNewIntent(Intent intent) {
        subscribeReservationRescheduleEvent.e(intent, "");
        onNewIntent(intent);
        d(intent);
    }
}
