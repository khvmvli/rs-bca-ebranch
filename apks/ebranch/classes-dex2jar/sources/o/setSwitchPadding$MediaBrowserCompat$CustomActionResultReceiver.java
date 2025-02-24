package o;

import java.util.Iterator;
import java.util.Map;
import o.setSwitchPadding;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setSwitchPadding$MediaBrowserCompat$CustomActionResultReceiver.class */
public abstract class setSwitchPadding$MediaBrowserCompat$CustomActionResultReceiver<K, V> implements Iterator<Map.Entry<K, V>>, setSwitchPadding$MediaBrowserCompat$SearchResultReceiver<K, V> {
    setSwitchPadding.write<K, V> a;
    setSwitchPadding.write<K, V> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSwitchPadding$MediaBrowserCompat$CustomActionResultReceiver(setSwitchPadding.write<K, V> write, setSwitchPadding.write<K, V> write2) {
        this.a = write2;
        this.c = write;
    }

    @Override // o.setSwitchPadding$MediaBrowserCompat$SearchResultReceiver
    public final void a(setSwitchPadding.write<K, V> write) {
        if (this.a == write && write == this.c) {
            this.c = null;
            this.a = null;
        }
        setSwitchPadding.write<K, V> write2 = this.a;
        if (write2 == write) {
            this.a = c(write2);
        }
        setSwitchPadding.write<K, V> write3 = this.c;
        if (write3 == write) {
            setSwitchPadding.write<K, V> write4 = this.a;
            setSwitchPadding.write<K, V> write5 = null;
            if (write3 != write4) {
                write5 = null;
                if (write4 != null) {
                    write5 = d(write3);
                }
            }
            this.c = write5;
        }
    }

    abstract setSwitchPadding.write<K, V> c(setSwitchPadding.write<K, V> write);

    abstract setSwitchPadding.write<K, V> d(setSwitchPadding.write<K, V> write);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c != null;
    }

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        setSwitchPadding.write<K, V> write = this.c;
        setSwitchPadding.write<K, V> write2 = this.a;
        this.c = (write == write2 || write2 == null) ? null : d(write);
        return write;
    }
}
