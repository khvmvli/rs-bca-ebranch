package o;

import android.util.DisplayMetrics;
import o.DetailTransactionResponse$ValueTxnDataDetail$$Parcelable;
/* loaded from: classes-dex2jar.jar:o/DetailTransactionResponse$ValueTxnDataDetail$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver.class */
final class DetailTransactionResponse$ValueTxnDataDetail$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver implements DetailTransactionResponse$ValueTxnDataDetail$$Parcelable.read {
    private final DisplayMetrics d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DetailTransactionResponse$ValueTxnDataDetail$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver(DisplayMetrics displayMetrics) {
        this.d = displayMetrics;
    }

    @Override // o.DetailTransactionResponse$ValueTxnDataDetail$$Parcelable.read
    public final int a() {
        return this.d.widthPixels;
    }

    @Override // o.DetailTransactionResponse$ValueTxnDataDetail$$Parcelable.read
    public final int d() {
        return this.d.heightPixels;
    }
}
