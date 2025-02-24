package o;

import android.util.Log;
import o.getTxnPurposeValue;
import o.onFindViewById;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/getTxnPurposeValue$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class getTxnPurposeValue$MediaBrowserCompat$CustomActionResultReceiver<T> implements onFindViewById.write<T> {
    private final getTxnPurposeValue.read<T> a;
    private final getTxnPurposeValue.IconCompatParcelizer<T> d;
    private final onFindViewById.write<T> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getTxnPurposeValue$MediaBrowserCompat$CustomActionResultReceiver(onFindViewById.write<T> write, getTxnPurposeValue.read<T> read, getTxnPurposeValue.IconCompatParcelizer<T> iconCompatParcelizer) {
        this.e = write;
        this.a = read;
        this.d = iconCompatParcelizer;
    }

    @Override // o.onFindViewById.write
    public final T a() {
        T a = this.e.a();
        T t = a;
        if (a == null) {
            T b = this.a.b();
            t = b;
            if (Log.isLoggable("FactoryPools", 2)) {
                StringBuilder sb = new StringBuilder("Created new ");
                sb.append(b.getClass());
                Log.v("FactoryPools", sb.toString());
                t = b;
            }
        }
        if (t instanceof getTxnPurposeValue.RemoteActionCompatParcelizer) {
            ((getTxnPurposeValue.RemoteActionCompatParcelizer) t).j_().d(false);
        }
        return t;
    }

    @Override // o.onFindViewById.write
    public final boolean c(T t) {
        if (t instanceof getTxnPurposeValue.RemoteActionCompatParcelizer) {
            ((getTxnPurposeValue.RemoteActionCompatParcelizer) t).j_().d(true);
        }
        this.d.a(t);
        return this.e.c(t);
    }
}
