package o;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes-dex2jar.jar:o/RatingCompat.class */
public abstract class RatingCompat {
    public boolean b;
    public CopyOnWriteArrayList<MediaSessionCompat$ResultReceiverWrapper> d = new CopyOnWriteArrayList<>();

    public RatingCompat(boolean z) {
        this.b = z;
    }

    public abstract void a();

    public final boolean c() {
        return this.b;
    }

    public final void e() {
        Iterator<MediaSessionCompat$ResultReceiverWrapper> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
