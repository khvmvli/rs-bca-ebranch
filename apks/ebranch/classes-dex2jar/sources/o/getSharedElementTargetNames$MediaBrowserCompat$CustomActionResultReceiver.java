package o;
/* loaded from: classes-dex2jar.jar:o/getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver.class */
final class getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver {
    public final long c;
    public final long e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver(long j, long j2) {
        if (j2 == 0) {
            this.c = 0;
            this.e = 1;
            return;
        }
        this.c = j;
        this.e = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append("/");
        sb.append(this.e);
        return sb.toString();
    }
}
