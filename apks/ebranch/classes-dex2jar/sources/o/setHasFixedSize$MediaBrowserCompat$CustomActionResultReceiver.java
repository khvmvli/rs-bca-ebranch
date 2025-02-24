package o;

import java.util.Collections;
import java.util.List;
import o.LifecycleDestroyedException;
/* loaded from: classes-dex2jar.jar:o/setHasFixedSize$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class setHasFixedSize$MediaBrowserCompat$CustomActionResultReceiver {
    public final String a;
    public final List<String> b;
    public final List<String> c;
    public final boolean e;

    public setHasFixedSize$MediaBrowserCompat$CustomActionResultReceiver(String str, boolean z, List<String> list, List<String> list2) {
        this.a = str;
        this.e = z;
        this.c = list;
        this.b = list2.size() == 0 ? Collections.nCopies(list.size(), LifecycleDestroyedException.read.ASC.name()) : list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setHasFixedSize$MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        setHasFixedSize$MediaBrowserCompat$CustomActionResultReceiver sethasfixedsize_mediabrowsercompat_customactionresultreceiver = (setHasFixedSize$MediaBrowserCompat$CustomActionResultReceiver) obj;
        if (this.e == sethasfixedsize_mediabrowsercompat_customactionresultreceiver.e && this.c.equals(sethasfixedsize_mediabrowsercompat_customactionresultreceiver.c) && this.b.equals(sethasfixedsize_mediabrowsercompat_customactionresultreceiver.b)) {
            return this.a.startsWith("index_") ? sethasfixedsize_mediabrowsercompat_customactionresultreceiver.a.startsWith("index_") : this.a.equals(sethasfixedsize_mediabrowsercompat_customactionresultreceiver.a);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.startsWith("index_") ? -1184239155 : this.a.hashCode()) * 31) + (this.e ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Index{name='");
        sb.append(this.a);
        sb.append("', unique=");
        sb.append(this.e);
        sb.append(", columns=");
        sb.append(this.c);
        sb.append(", orders=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
