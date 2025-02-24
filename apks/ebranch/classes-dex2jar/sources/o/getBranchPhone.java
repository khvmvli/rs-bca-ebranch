package o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import o.DaftarTransfer$$Parcelable;
import o.TxnTellerResponse;
/* loaded from: classes-dex2jar.jar:o/getBranchPhone.class */
public final class getBranchPhone extends isPostponed {
    private final String[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBranchPhone(Context context, isDetached isdetached) {
        super(isdetached, 1);
        subscribeReservationRescheduleEvent.e(context, "");
        subscribeReservationRescheduleEvent.e(isdetached, "");
        this.d = new String[]{context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.t), context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.u), context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.A)};
    }

    @Override // o.setScaleX
    public final CharSequence c(int i) {
        return this.d[i];
    }

    @Override // o.setScaleX
    public final int d() {
        return this.d.length;
    }

    @Override // o.isPostponed
    public final Fragment e(int i) {
        getBranchLong getbranchlong;
        if (i == 0) {
            getbranchlong = new getBranchLong();
        } else if (i == 1) {
            DaftarTransfer$$Parcelable.RemoteActionCompatParcelizer remoteActionCompatParcelizer = DaftarTransfer$$Parcelable.b;
            getbranchlong = DaftarTransfer$$Parcelable.RemoteActionCompatParcelizer.d(TxnTellerResponse.ValueTxnDataDetail.REQUEST);
        } else if (i == 2) {
            DaftarTransfer$$Parcelable.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = DaftarTransfer$$Parcelable.b;
            getbranchlong = DaftarTransfer$$Parcelable.RemoteActionCompatParcelizer.d(TxnTellerResponse.ValueTxnDataDetail.RESPONSE);
        } else {
            throw new IllegalArgumentException("no item");
        }
        return getbranchlong;
    }
}
