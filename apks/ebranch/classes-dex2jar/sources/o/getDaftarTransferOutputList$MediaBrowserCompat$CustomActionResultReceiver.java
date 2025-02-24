package o;

import java.util.concurrent.Executor;
/* loaded from: classes-dex2jar.jar:o/getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver.class */
final class getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver {
    final GetPPUNumberResponse$$Parcelable b;
    final Executor e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver(GetPPUNumberResponse$$Parcelable getPPUNumberResponse$$Parcelable, Executor executor) {
        this.b = getPPUNumberResponse$$Parcelable;
        this.e = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver) {
            return this.b.equals(((getDaftarTransferOutputList$MediaBrowserCompat$CustomActionResultReceiver) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
