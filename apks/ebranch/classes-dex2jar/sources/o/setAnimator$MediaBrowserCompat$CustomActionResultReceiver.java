package o;
/* loaded from: classes-dex2jar.jar:o/setAnimator$MediaBrowserCompat$CustomActionResultReceiver.class */
final class setAnimator$MediaBrowserCompat$CustomActionResultReceiver {
    int a;
    Object b;
    int c;
    int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setAnimator$MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, Object obj) {
        this.a = i;
        this.d = i2;
        this.c = i3;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setAnimator$MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver = (setAnimator$MediaBrowserCompat$CustomActionResultReceiver) obj;
        int i = this.a;
        if (i != setanimator_mediabrowsercompat_customactionresultreceiver.a) {
            return false;
        }
        if (i == 8 && Math.abs(this.c - this.d) == 1 && this.c == setanimator_mediabrowsercompat_customactionresultreceiver.d && this.d == setanimator_mediabrowsercompat_customactionresultreceiver.c) {
            return true;
        }
        if (this.c != setanimator_mediabrowsercompat_customactionresultreceiver.c || this.d != setanimator_mediabrowsercompat_customactionresultreceiver.d) {
            return false;
        }
        Object obj2 = this.b;
        return obj2 != null ? obj2.equals(setanimator_mediabrowsercompat_customactionresultreceiver.b) : setanimator_mediabrowsercompat_customactionresultreceiver.b == null;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.d) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.d);
        sb.append("c:");
        sb.append(this.c);
        sb.append(",p:");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }
}
