package o;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:o/BaseFragment.class */
public final class BaseFragment<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> f = new Comparator<Comparable>() { // from class: o.BaseFragment.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    int a;
    read<K, V> b;
    Comparator<? super K> c;
    final read<K, V> d;
    int e;
    private BaseFragment<K, V>.IconCompatParcelizer h;
    private BaseFragment<K, V>.write i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/BaseFragment$IconCompatParcelizer.class */
    public final class IconCompatParcelizer extends AbstractSet<K> {
        IconCompatParcelizer() {
            BaseFragment.this = r4;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            BaseFragment.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return BaseFragment.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new CC10KTPFormKartuKreditFragment(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            BaseFragment baseFragment = BaseFragment.this;
            read<K, V> a = baseFragment.a(obj);
            boolean z = true;
            if (a != null) {
                baseFragment.d((read) a, true);
            }
            if (a == null) {
                z = false;
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return BaseFragment.this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/BaseFragment$RemoteActionCompatParcelizer.class */
    public abstract class RemoteActionCompatParcelizer<T> implements Iterator<T> {
        int a;
        read<K, V> b = null;
        read<K, V> e;

        public RemoteActionCompatParcelizer() {
            BaseFragment.this = r4;
            this.e = r4.d.b;
            this.a = r4.a;
        }

        final read<K, V> c() {
            read<K, V> read = this.e;
            if (read == BaseFragment.this.d) {
                throw new NoSuchElementException();
            } else if (BaseFragment.this.a == this.a) {
                this.e = read.b;
                this.b = read;
                return read;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e != BaseFragment.this.d;
        }

        @Override // java.util.Iterator
        public final void remove() {
            read<K, V> read = this.b;
            if (read != null) {
                BaseFragment.this.d((read) read, true);
                this.b = null;
                this.a = BaseFragment.this.a;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/BaseFragment$read.class */
    public static final class read<K, V> implements Map.Entry<K, V> {
        read<K, V> a;
        read<K, V> b;
        int c;
        read<K, V> d;
        final K e;
        read<K, V> f;
        read<K, V> i;
        V j;

        read() {
            this.e = null;
            this.i = this;
            this.b = this;
        }

        read(read<K, V> read, K k, read<K, V> read2, read<K, V> read3) {
            this.d = read;
            this.e = k;
            this.c = 1;
            this.b = read2;
            this.i = read3;
            read3.b = this;
            read2.i = this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
            r0 = r3.j;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
            if (r0 != null) goto L_0x0058;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
            r7 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
            if (r0.getValue() != null) goto L_0x006c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
            r7 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
            if (r0.equals(r0.getValue()) == false) goto L_0x006c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
            r7 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
            if (r0.getKey() == null) goto L_0x003e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
            if (r0.equals(r0.getKey()) != false) goto L_0x003e;
         */
        @Override // java.util.Map.Entry, java.lang.Object
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = r4
                boolean r0 = r0 instanceof java.util.Map.Entry
                r5 = r0
                r0 = 0
                r6 = r0
                r0 = r6
                r7 = r0
                r0 = r5
                if (r0 == 0) goto L_0x006c
                r0 = r4
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r4 = r0
                r0 = r3
                K r0 = r0.e
                r8 = r0
                r0 = r8
                if (r0 != 0) goto L_0x002d
                r0 = r6
                r7 = r0
                r0 = r4
                java.lang.Object r0 = r0.getKey()
                if (r0 != 0) goto L_0x006c
                goto L_0x003e
            L_0x002d:
                r0 = r6
                r7 = r0
                r0 = r8
                r1 = r4
                java.lang.Object r1 = r1.getKey()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x006c
            L_0x003e:
                r0 = r3
                V r0 = r0.j
                r8 = r0
                r0 = r8
                if (r0 != 0) goto L_0x0058
                r0 = r6
                r7 = r0
                r0 = r4
                java.lang.Object r0 = r0.getValue()
                if (r0 != 0) goto L_0x006c
                goto L_0x0069
            L_0x0058:
                r0 = r6
                r7 = r0
                r0 = r8
                r1 = r4
                java.lang.Object r1 = r1.getValue()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x006c
            L_0x0069:
                r0 = 1
                r7 = r0
            L_0x006c:
                r0 = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.BaseFragment.read.equals(java.lang.Object):boolean");
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.e;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.j;
        }

        @Override // java.util.Map.Entry, java.lang.Object
        public final int hashCode() {
            K k = this.e;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.j;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.j;
            this.j = v;
            return v2;
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.e);
            sb.append("=");
            sb.append(this.j);
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/BaseFragment$write.class */
    public final class write extends AbstractSet<Map.Entry<K, V>> {
        write() {
            BaseFragment.this = r4;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            BaseFragment.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && BaseFragment.this.d((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new fragmentBackPressedEvent(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            read<K, V> d;
            if (!(obj instanceof Map.Entry) || (d = BaseFragment.this.d((Map.Entry) obj)) == null) {
                return false;
            }
            BaseFragment.this.d((read) d, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return BaseFragment.this.e;
        }
    }

    public BaseFragment() {
        this(f);
    }

    private BaseFragment(Comparator<? super K> comparator) {
        this.e = 0;
        this.a = 0;
        this.d = new read<>();
        this.c = comparator == null ? f : comparator;
    }

    private void a(read<K, V> read2, read<K, V> read3) {
        read<K, V> read4 = read2.d;
        read2.d = null;
        if (read3 != null) {
            read3.d = read4;
        }
        if (read4 == null) {
            this.b = read3;
        } else if (read4.a == read2) {
            read4.a = read3;
        } else {
            read4.f = read3;
        }
    }

    private void a(read<K, V> read2, boolean z) {
        while (read2 != null) {
            read<K, V> read3 = read2.a;
            read<K, V> read4 = read2.f;
            int i = 0;
            int i2 = 0;
            int i3 = read3 != null ? read3.c : 0;
            int i4 = read4 != null ? read4.c : 0;
            int i5 = i3 - i4;
            if (i5 == -2) {
                read<K, V> read5 = read4.a;
                read<K, V> read6 = read4.f;
                int i6 = read6 != null ? read6.c : 0;
                if (read5 != null) {
                    i2 = read5.c;
                }
                int i7 = i2 - i6;
                if (i7 != -1 && (i7 != 0 || z)) {
                    d((read) read4);
                }
                c(read2);
                if (z) {
                    return;
                }
            } else if (i5 == 2) {
                read<K, V> read7 = read3.a;
                read<K, V> read8 = read3.f;
                int i8 = read8 != null ? read8.c : 0;
                if (read7 != null) {
                    i = read7.c;
                }
                int i9 = i - i8;
                if (i9 != 1 && (i9 != 0 || z)) {
                    c(read3);
                }
                d((read) read2);
                if (z) {
                    return;
                }
            } else if (i5 == 0) {
                read2.c = i3 + 1;
                if (z) {
                    return;
                }
            } else {
                read2.c = Math.max(i3, i4) + 1;
                if (!z) {
                    return;
                }
            }
            read2 = read2.d;
        }
    }

    private void c(read<K, V> read2) {
        read<K, V> read3 = read2.a;
        read<K, V> read4 = read2.f;
        read<K, V> read5 = read4.a;
        read<K, V> read6 = read4.f;
        read2.f = read5;
        if (read5 != null) {
            read5.d = read2;
        }
        a(read2, read4);
        read4.a = read2;
        read2.d = read4;
        int i = 0;
        read2.c = Math.max(read3 != null ? read3.c : 0, read5 != null ? read5.c : 0) + 1;
        int i2 = read2.c;
        if (read6 != null) {
            i = read6.c;
        }
        read4.c = Math.max(i2, i) + 1;
    }

    private read<K, V> d(K k, boolean z) {
        int i;
        read<K, V> read2;
        Comparator<? super K> comparator = this.c;
        read<K, V> read3 = this.b;
        if (read3 != null) {
            Comparable comparable = comparator == f ? (Comparable) k : null;
            while (true) {
                i = comparable != null ? comparable.compareTo(read3.e) : comparator.compare(k, (K) read3.e);
                if (i != 0) {
                    read<K, V> read4 = i < 0 ? read3.a : read3.f;
                    if (read4 == null) {
                        break;
                    }
                    read3 = read4;
                } else {
                    return read3;
                }
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        read<K, V> read5 = this.d;
        if (read3 != null) {
            read2 = new read<>(read3, k, read5, read5.i);
            if (i < 0) {
                read3.a = read2;
            } else {
                read3.f = read2;
            }
            a((read) read3, true);
        } else if (comparator != f || (k instanceof Comparable)) {
            read2 = new read<>(read3, k, read5, read5.i);
            this.b = read2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(k.getClass().getName());
            sb.append(" is not Comparable");
            throw new ClassCastException(sb.toString());
        }
        this.e++;
        this.a++;
        return read2;
    }

    private void d(read<K, V> read2) {
        read<K, V> read3 = read2.a;
        read<K, V> read4 = read2.f;
        read<K, V> read5 = read3.a;
        read<K, V> read6 = read3.f;
        read2.a = read6;
        if (read6 != null) {
            read6.d = read2;
        }
        a(read2, read3);
        read3.f = read2;
        read2.d = read3;
        int i = 0;
        read2.c = Math.max(read4 != null ? read4.c : 0, read6 != null ? read6.c : 0) + 1;
        int i2 = read2.c;
        if (read5 != null) {
            i = read5.c;
        }
        read3.c = Math.max(i2, i) + 1;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final read<K, V> a(Object obj) {
        read<K, V> d;
        if (obj != 0) {
            try {
                d = d((BaseFragment<K, V>) obj, false);
            } catch (ClassCastException e) {
            }
            return d;
        }
        d = null;
        return d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = null;
        this.e = 0;
        this.a++;
        read<K, V> read2 = this.d;
        read2.i = read2;
        read2.b = read2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return a(obj) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final o.BaseFragment.read<K, V> d(java.util.Map.Entry<?, ?> r4) {
        /*
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Object r1 = r1.getKey()
            o.BaseFragment$read r0 = r0.a(r1)
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0046
            r0 = r5
            V r0 = r0.j
            r7 = r0
            r0 = r4
            java.lang.Object r0 = r0.getValue()
            r4 = r0
            r0 = r7
            r1 = r4
            if (r0 == r1) goto L_0x0038
            r0 = r7
            if (r0 == 0) goto L_0x0032
            r0 = r7
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0038
        L_0x0032:
            r0 = 0
            r8 = r0
            goto L_0x003b
        L_0x0038:
            r0 = 1
            r8 = r0
        L_0x003b:
            r0 = r8
            if (r0 == 0) goto L_0x0046
            r0 = r6
            r8 = r0
            goto L_0x0049
        L_0x0046:
            r0 = 0
            r8 = r0
        L_0x0049:
            r0 = r8
            if (r0 == 0) goto L_0x0053
            r0 = r5
            r4 = r0
            goto L_0x0055
        L_0x0053:
            r0 = 0
            r4 = r0
        L_0x0055:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BaseFragment.d(java.util.Map$Entry):o.BaseFragment$read");
    }

    final void d(read<K, V> read2, boolean z) {
        int i;
        if (z) {
            read2.i.b = read2.b;
            read2.b.i = read2.i;
        }
        read<K, V> read3 = read2.a;
        read<K, V> read4 = read2.f;
        read<K, V> read5 = read2.d;
        int i2 = 0;
        if (read3 == null || read4 == null) {
            if (read3 != null) {
                a(read2, read3);
                read2.a = null;
            } else if (read4 != null) {
                a(read2, read4);
                read2.f = null;
            } else {
                a(read2, (read) null);
            }
            a((read) read5, false);
            this.e--;
            this.a++;
            return;
        }
        if (read3.c > read4.c) {
            read4 = read3.f;
            read4 = read3;
            while (read4 != null) {
                read4 = read4.f;
            }
        } else {
            read<K, V> read6 = read4.a;
            while (read6 != null) {
                read6 = read6.a;
                read4 = read6;
            }
        }
        d((read) read4, false);
        read<K, V> read7 = read2.a;
        if (read7 != null) {
            i = read7.c;
            read4.a = read7;
            read7.d = read4;
            read2.a = null;
        } else {
            i = 0;
        }
        read<K, V> read8 = read2.f;
        if (read8 != null) {
            i2 = read8.c;
            read4.f = read8;
            read8.d = read4;
            read2.f = null;
        }
        read4.c = Math.max(i, i2) + 1;
        a(read2, read4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        BaseFragment<K, V>.write write2 = this.i;
        BaseFragment<K, V>.write write3 = write2;
        if (write2 == null) {
            write3 = new write();
            this.i = write3;
        }
        return write3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        read<K, V> a = a(obj);
        return a != null ? a.j : null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        BaseFragment<K, V>.IconCompatParcelizer iconCompatParcelizer = this.h;
        BaseFragment<K, V>.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
        if (iconCompatParcelizer == null) {
            iconCompatParcelizer2 = new IconCompatParcelizer();
            this.h = iconCompatParcelizer2;
        }
        return iconCompatParcelizer2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k != null) {
            read<K, V> d = d((BaseFragment<K, V>) k, true);
            V v2 = d.j;
            d.j = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        read<K, V> a = a(obj);
        if (a != null) {
            d((read) a, true);
        }
        return a != null ? a.j : null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.e;
    }
}
