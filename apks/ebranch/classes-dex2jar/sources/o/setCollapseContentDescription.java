package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:o/setCollapseContentDescription.class */
public abstract class setCollapseContentDescription<K, V> {
    setCollapseContentDescription<K, V>.IconCompatParcelizer c;
    setCollapseContentDescription<K, V>.read d;
    setCollapseContentDescription<K, V>.RemoteActionCompatParcelizer e;

    /* loaded from: classes-dex2jar.jar:o/setCollapseContentDescription$IconCompatParcelizer.class */
    public final class IconCompatParcelizer implements Set<Map.Entry<K, V>> {
        public IconCompatParcelizer() {
            setCollapseContentDescription.this = r4;
        }

        @Override // java.util.Set, java.util.Collection
        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = setCollapseContentDescription.this.d();
            Iterator<? extends Map.Entry<K, V>> it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                setCollapseContentDescription.this.c((setCollapseContentDescription) entry.getKey(), entry.getValue());
            }
            return d != setCollapseContentDescription.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            setCollapseContentDescription.this.e();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = setCollapseContentDescription.this.e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return setThumbTintList.c(setCollapseContentDescription.this.d(e, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Object
        public final boolean equals(Object obj) {
            return setCollapseContentDescription.b(this, obj);
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Object
        public final int hashCode() {
            int i = 0;
            for (int d = setCollapseContentDescription.this.d() - 1; d >= 0; d--) {
                Object d2 = setCollapseContentDescription.this.d(d, 0);
                Object d3 = setCollapseContentDescription.this.d(d, 1);
                i += (d2 == null ? 0 : d2.hashCode()) ^ (d3 == null ? 0 : d3.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return setCollapseContentDescription.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new write();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return setCollapseContentDescription.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setCollapseContentDescription$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer implements Collection<V> {
        public RemoteActionCompatParcelizer() {
            setCollapseContentDescription.this = r4;
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            setCollapseContentDescription.this.e();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return setCollapseContentDescription.this.b(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return setCollapseContentDescription.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new setCollapseContentDescription$MediaBrowserCompat$CustomActionResultReceiver(setCollapseContentDescription.this, 1);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            int b = setCollapseContentDescription.this.b(obj);
            if (b < 0) {
                return false;
            }
            setCollapseContentDescription.this.a(b);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int d = setCollapseContentDescription.this.d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                d = d;
                int i2 = i;
                if (collection.contains(setCollapseContentDescription.this.d(i, 1))) {
                    setCollapseContentDescription.this.a(i);
                    i2 = i - 1;
                    d--;
                    z = true;
                }
                i = i2 + 1;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            int d = setCollapseContentDescription.this.d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                d = d;
                int i2 = i;
                if (!collection.contains(setCollapseContentDescription.this.d(i, 1))) {
                    setCollapseContentDescription.this.a(i);
                    i2 = i - 1;
                    d--;
                    z = true;
                }
                i = i2 + 1;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return setCollapseContentDescription.this.d();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return setCollapseContentDescription.this.c(1);
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) setCollapseContentDescription.this.b(tArr, 1);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setCollapseContentDescription$read.class */
    public final class read implements Set<K> {
        public read() {
            setCollapseContentDescription.this = r4;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            setCollapseContentDescription.this.e();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return setCollapseContentDescription.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> b = setCollapseContentDescription.this.b();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!b.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Object
        public final boolean equals(Object obj) {
            return setCollapseContentDescription.b(this, obj);
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Object
        public final int hashCode() {
            int i = 0;
            for (int d = setCollapseContentDescription.this.d() - 1; d >= 0; d--) {
                Object d2 = setCollapseContentDescription.this.d(d, 0);
                i += d2 == null ? 0 : d2.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return setCollapseContentDescription.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new setCollapseContentDescription$MediaBrowserCompat$CustomActionResultReceiver(setCollapseContentDescription.this, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            int e = setCollapseContentDescription.this.e(obj);
            if (e < 0) {
                return false;
            }
            setCollapseContentDescription.this.a(e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> b = setCollapseContentDescription.this.b();
            int size = b.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                b.remove(it.next());
            }
            return size != b.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return setCollapseContentDescription.d(setCollapseContentDescription.this.b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return setCollapseContentDescription.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            return setCollapseContentDescription.this.c(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) setCollapseContentDescription.this.b(tArr, 0);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setCollapseContentDescription$write.class */
    final class write implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        int a;
        boolean e = false;
        int d = -1;

        write() {
            setCollapseContentDescription.this = r5;
            this.a = r5.d() - 1;
        }

        @Override // java.lang.Object, java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.e) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                boolean z = false;
                if (setThumbTintList.c(entry.getKey(), setCollapseContentDescription.this.d(this.d, 0))) {
                    z = false;
                    if (setThumbTintList.c(entry.getValue(), setCollapseContentDescription.this.d(this.d, 1))) {
                        z = true;
                    }
                }
                return z;
            }
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.e) {
                return (K) setCollapseContentDescription.this.d(this.d, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.e) {
                return (V) setCollapseContentDescription.this.d(this.d, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d < this.a;
        }

        @Override // java.lang.Object, java.util.Map.Entry
        public final int hashCode() {
            if (this.e) {
                int i = 0;
                Object d = setCollapseContentDescription.this.d(this.d, 0);
                Object d2 = setCollapseContentDescription.this.d(this.d, 1);
                int hashCode = d == null ? 0 : d.hashCode();
                if (d2 != null) {
                    i = d2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            if (hasNext()) {
                this.d++;
                this.e = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.e) {
                setCollapseContentDescription.this.a(this.d);
                this.d--;
                this.a--;
                this.e = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (this.e) {
                return (V) setCollapseContentDescription.this.c(this.d, (int) v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r3.containsAll(r0) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static <T> boolean b(java.util.Set<T> r3, java.lang.Object r4) {
        /*
            r0 = 1
            r5 = r0
            r0 = r3
            r1 = r4
            if (r0 != r1) goto L_0x0009
            r0 = 1
            return r0
        L_0x0009:
            r0 = r4
            boolean r0 = r0 instanceof java.util.Set
            if (r0 == 0) goto L_0x0034
            r0 = r4
            java.util.Set r0 = (java.util.Set) r0
            r4 = r0
            r0 = r3
            int r0 = r0.size()     // Catch: NullPointerException | ClassCastException -> 0x0036
            r1 = r4
            int r1 = r1.size()     // Catch: NullPointerException | ClassCastException -> 0x0036
            if (r0 != r1) goto L_0x0030
            r0 = r3
            r1 = r4
            boolean r0 = r0.containsAll(r1)     // Catch: NullPointerException | ClassCastException -> 0x0036
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0032
        L_0x0030:
            r0 = 0
            r5 = r0
        L_0x0032:
            r0 = r5
            return r0
        L_0x0034:
            r0 = 0
            return r0
        L_0x0036:
            r3 = move-exception
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCollapseContentDescription.b(java.util.Set, java.lang.Object):boolean");
    }

    public static <K, V> boolean d(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(int i);

    protected abstract int b(Object obj);

    protected abstract Map<K, V> b();

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T[] b(T[] tArr, int i) {
        int d = d();
        T[] tArr2 = tArr;
        if (tArr.length < d) {
            tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d));
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr2[i2] = d(i2, i);
        }
        if (tArr2.length > d) {
            tArr2[d] = null;
        }
        return tArr2;
    }

    protected abstract V c(int i, V v);

    protected abstract void c(K k, V v);

    public final Object[] c(int i) {
        int d = d();
        Object[] objArr = new Object[d];
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = d(i2, i);
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object d(int i, int i2);

    protected abstract int e(Object obj);

    protected abstract void e();
}
