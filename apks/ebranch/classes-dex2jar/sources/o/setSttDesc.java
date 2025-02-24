package o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import o.TxnTellerResponse$Description$$Parcelable;
import o.UpdateRefNumberResponse$$Parcelable;
/* loaded from: classes-dex2jar.jar:o/setSttDesc.class */
public final class setSttDesc extends isPostponed {
    public static final read e = new read((byte) 0);
    private final WeakReference<Context> d;

    /* loaded from: classes-dex2jar.jar:o/setSttDesc$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setSttDesc(Context context, isDetached isdetached) {
        super(isdetached, 1);
        subscribeReservationRescheduleEvent.e(context, "");
        subscribeReservationRescheduleEvent.e(isdetached, "");
        this.d = new WeakReference<>(context);
    }

    @Override // o.setScaleX
    public final CharSequence c(int i) {
        String str;
        Context context = this.d.get();
        if (context != null) {
            str = context.getString(i == 0 ? setCurrencyName$MediaBrowserCompat$ItemReceiver.P : setCurrencyName$MediaBrowserCompat$ItemReceiver.R);
        } else {
            str = null;
        }
        return str;
    }

    @Override // o.setScaleX
    public final int d() {
        return 2;
    }

    @Override // o.isPostponed
    public final Fragment e(int i) {
        TxnTellerResponse$Description$$Parcelable txnTellerResponse$Description$$Parcelable;
        if (i == 0) {
            UpdateRefNumberResponse$$Parcelable.read read2 = UpdateRefNumberResponse$$Parcelable.c;
            txnTellerResponse$Description$$Parcelable = new UpdateRefNumberResponse$$Parcelable();
        } else {
            TxnTellerResponse$Description$$Parcelable.write write = TxnTellerResponse$Description$$Parcelable.b;
            txnTellerResponse$Description$$Parcelable = new TxnTellerResponse$Description$$Parcelable();
        }
        return txnTellerResponse$Description$$Parcelable;
    }
}
