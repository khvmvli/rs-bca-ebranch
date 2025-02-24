package com.google.firebase.crashlytics.internal.log;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/log/QueueFile$MediaBrowserCompat$CustomActionResultReceiver.class */
final class QueueFile$MediaBrowserCompat$CustomActionResultReceiver {
    static final QueueFile$MediaBrowserCompat$CustomActionResultReceiver b = new QueueFile$MediaBrowserCompat$CustomActionResultReceiver(0, 0);
    final int a;
    final int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public QueueFile$MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        this.a = i;
        this.c = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[position = ");
        sb.append(this.a);
        sb.append(", length = ");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
