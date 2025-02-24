package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes-dex2jar.jar:o/setSwitchPadding.class */
public class setSwitchPadding<K, V> implements Iterable<Map.Entry<K, V>> {
    public write<K, V> b;
    public write<K, V> c;
    public WeakHashMap<setSwitchPadding$MediaBrowserCompat$SearchResultReceiver<K, V>, Boolean> a = new WeakHashMap<>();
    public int e = 0;

    /* loaded from: classes-dex2jar.jar:o/setSwitchPadding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer<K, V> extends setSwitchPadding$MediaBrowserCompat$CustomActionResultReceiver<K, V> {
        public IconCompatParcelizer(write<K, V> write, write<K, V> write2) {
            super(write, write2);
        }

        @Override // o.setSwitchPadding$MediaBrowserCompat$CustomActionResultReceiver
        final write<K, V> c(write<K, V> write) {
            return write.b;
        }

        @Override // o.setSwitchPadding$MediaBrowserCompat$CustomActionResultReceiver
        final write<K, V> d(write<K, V> write) {
            return write.a;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setSwitchPadding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer<K, V> extends setSwitchPadding$MediaBrowserCompat$CustomActionResultReceiver<K, V> {
        RemoteActionCompatParcelizer(write<K, V> write, write<K, V> write2) {
            super(write, write2);
        }

        @Override // o.setSwitchPadding$MediaBrowserCompat$CustomActionResultReceiver
        final write<K, V> c(write<K, V> write) {
            return write.a;
        }

        @Override // o.setSwitchPadding$MediaBrowserCompat$CustomActionResultReceiver
        final write<K, V> d(write<K, V> write) {
            return write.b;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setSwitchPadding$read.class */
    public final class read implements Iterator<Map.Entry<K, V>>, setSwitchPadding$MediaBrowserCompat$SearchResultReceiver<K, V> {
        private boolean a = true;
        private write<K, V> d;

        public read() {
            setSwitchPadding.this = r4;
        }

        @Override // o.setSwitchPadding$MediaBrowserCompat$SearchResultReceiver
        public final void a(write<K, V> write) {
            write<K, V> write2 = this.d;
            if (write == write2) {
                write<K, V> write3 = write2.a;
                this.d = write3;
                this.a = write3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            boolean z = false;
            if (this.a) {
                if (setSwitchPadding.this.b != null) {
                    z = true;
                }
                return z;
            }
            write<K, V> write = this.d;
            boolean z2 = false;
            if (write != null) {
                z2 = false;
                if (write.b != null) {
                    z2 = true;
                }
            }
            return z2;
        }

        @Override // java.util.Iterator
        public final /* bridge */ /* synthetic */ Object next() {
            if (this.a) {
                this.a = false;
                this.d = setSwitchPadding.this.b;
            } else {
                write<K, V> write = this.d;
                this.d = write != null ? write.b : null;
            }
            return this.d;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setSwitchPadding$write.class */
    public static final class write<K, V> implements Map.Entry<K, V> {
        public write<K, V> a;
        write<K, V> b;
        final K c;
        final V d;

        write(K k, V v) {
            this.c = k;
            this.d = v;
        }

        @Override // java.util.Map.Entry, java.lang.Object
        public final boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write = (write) obj;
            if (!this.c.equals(write.c) || !this.d.equals(write.d)) {
                z = false;
            }
            return z;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.c;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.d;
        }

        @Override // java.util.Map.Entry, java.lang.Object
        public final int hashCode() {
            return this.c.hashCode() ^ this.d.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            sb.append("=");
            sb.append(this.d);
            return sb.toString();
        }
    }

    public V a(K k) {
        write<K, V> b = b(k);
        if (b == null) {
            return null;
        }
        this.e--;
        if (!this.a.isEmpty()) {
            for (setSwitchPadding$MediaBrowserCompat$SearchResultReceiver<K, V> setswitchpadding_mediabrowsercompat_searchresultreceiver : this.a.keySet()) {
                setswitchpadding_mediabrowsercompat_searchresultreceiver.a(b);
            }
        }
        if (b.a != null) {
            b.a.b = b.b;
        } else {
            this.b = b.b;
        }
        if (b.b != null) {
            b.b.a = b.a;
        } else {
            this.c = b.a;
        }
        b.b = null;
        b.a = null;
        return b.d;
    }

    protected write<K, V> b(K k) {
        write<K, V> write2 = this.b;
        while (write2 != null && !write2.c.equals(k)) {
            write2 = write2.b;
        }
        return write2;
    }

    protected final write<K, V> b(K k, V v) {
        write<K, V> write2 = new write<>(k, v);
        this.e++;
        write<K, V> write3 = this.c;
        if (write3 == null) {
            this.b = write2;
            this.c = write2;
            return write2;
        }
        write3.b = write2;
        write2.a = this.c;
        this.c = write2;
        return write2;
    }

    public V e(K k, V v) {
        write<K, V> b = b(k);
        if (b != null) {
            return b.d;
        }
        b(k, v);
        return null;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setSwitchPadding)) {
            return false;
        }
        setSwitchPadding setswitchpadding = (setSwitchPadding) obj;
        if (this.e != setswitchpadding.e) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = setswitchpadding.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if (next == null && next2 != null) {
                return false;
            }
            if (next != null && !next.equals(next2)) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            z = false;
        }
        return z;
    }

    @Override // java.lang.Object
    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.b, this.c);
        this.a.put(remoteActionCompatParcelizer, Boolean.FALSE);
        return remoteActionCompatParcelizer;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
