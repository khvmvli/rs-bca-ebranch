package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import o.setCollapseContentDescription;
/* loaded from: classes-dex2jar.jar:o/setThumbTextPadding.class */
public class setThumbTextPadding<K, V> extends setCollapseIcon<K, V> implements Map<K, V> {
    setCollapseContentDescription<K, V> c;

    public setThumbTextPadding() {
    }

    public setThumbTextPadding(int i) {
        super(i);
    }

    public setThumbTextPadding(setCollapseIcon setcollapseicon) {
        super(setcollapseicon);
    }

    public final boolean a(Collection<?> collection) {
        return setCollapseContentDescription.d(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.c == null) {
            this.c = new setCollapseContentDescription<K, V>() { // from class: o.setThumbTextPadding.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setCollapseContentDescription
                public final void a(int i) {
                    setThumbTextPadding.this.b(i);
                }

                @Override // o.setCollapseContentDescription
                protected final int b(Object obj) {
                    return setThumbTextPadding.this.e(obj);
                }

                @Override // o.setCollapseContentDescription
                protected final Map<K, V> b() {
                    return setThumbTextPadding.this;
                }

                @Override // o.setCollapseContentDescription
                protected final V c(int i, V v) {
                    return setThumbTextPadding.this.b(i, (int) v);
                }

                @Override // o.setCollapseContentDescription
                protected final void c(K k, V v) {
                    setThumbTextPadding.this.put(k, v);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setCollapseContentDescription
                public final int d() {
                    return setThumbTextPadding.this.f;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setCollapseContentDescription
                public final Object d(int i, int i2) {
                    return setThumbTextPadding.this.h[(i << 1) + i2];
                }

                @Override // o.setCollapseContentDescription
                protected final int e(Object obj) {
                    setThumbTextPadding setthumbtextpadding = setThumbTextPadding.this;
                    return obj == null ? setthumbtextpadding.b() : setthumbtextpadding.b(obj, obj.hashCode());
                }

                @Override // o.setCollapseContentDescription
                protected final void e() {
                    setThumbTextPadding.this.clear();
                }
            };
        }
        setCollapseContentDescription<K, V> setcollapsecontentdescription = this.c;
        if (setcollapsecontentdescription.c == null) {
            setcollapsecontentdescription.c = new setCollapseContentDescription.IconCompatParcelizer();
        }
        return setcollapsecontentdescription.c;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        if (this.c == null) {
            this.c = new setCollapseContentDescription<K, V>() { // from class: o.setThumbTextPadding.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setCollapseContentDescription
                public final void a(int i) {
                    setThumbTextPadding.this.b(i);
                }

                @Override // o.setCollapseContentDescription
                protected final int b(Object obj) {
                    return setThumbTextPadding.this.e(obj);
                }

                @Override // o.setCollapseContentDescription
                protected final Map<K, V> b() {
                    return setThumbTextPadding.this;
                }

                @Override // o.setCollapseContentDescription
                protected final V c(int i, V v) {
                    return setThumbTextPadding.this.b(i, (int) v);
                }

                @Override // o.setCollapseContentDescription
                protected final void c(K k, V v) {
                    setThumbTextPadding.this.put(k, v);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setCollapseContentDescription
                public final int d() {
                    return setThumbTextPadding.this.f;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setCollapseContentDescription
                public final Object d(int i, int i2) {
                    return setThumbTextPadding.this.h[(i << 1) + i2];
                }

                @Override // o.setCollapseContentDescription
                protected final int e(Object obj) {
                    setThumbTextPadding setthumbtextpadding = setThumbTextPadding.this;
                    return obj == null ? setthumbtextpadding.b() : setthumbtextpadding.b(obj, obj.hashCode());
                }

                @Override // o.setCollapseContentDescription
                protected final void e() {
                    setThumbTextPadding.this.clear();
                }
            };
        }
        setCollapseContentDescription<K, V> setcollapsecontentdescription = this.c;
        if (setcollapsecontentdescription.d == null) {
            setcollapsecontentdescription.d = new setCollapseContentDescription.read();
        }
        return setcollapsecontentdescription.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.f + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        if (this.c == null) {
            this.c = new setCollapseContentDescription<K, V>() { // from class: o.setThumbTextPadding.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setCollapseContentDescription
                public final void a(int i) {
                    setThumbTextPadding.this.b(i);
                }

                @Override // o.setCollapseContentDescription
                protected final int b(Object obj) {
                    return setThumbTextPadding.this.e(obj);
                }

                @Override // o.setCollapseContentDescription
                protected final Map<K, V> b() {
                    return setThumbTextPadding.this;
                }

                @Override // o.setCollapseContentDescription
                protected final V c(int i, V v) {
                    return setThumbTextPadding.this.b(i, (int) v);
                }

                @Override // o.setCollapseContentDescription
                protected final void c(K k, V v) {
                    setThumbTextPadding.this.put(k, v);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setCollapseContentDescription
                public final int d() {
                    return setThumbTextPadding.this.f;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setCollapseContentDescription
                public final Object d(int i, int i2) {
                    return setThumbTextPadding.this.h[(i << 1) + i2];
                }

                @Override // o.setCollapseContentDescription
                protected final int e(Object obj) {
                    setThumbTextPadding setthumbtextpadding = setThumbTextPadding.this;
                    return obj == null ? setthumbtextpadding.b() : setthumbtextpadding.b(obj, obj.hashCode());
                }

                @Override // o.setCollapseContentDescription
                protected final void e() {
                    setThumbTextPadding.this.clear();
                }
            };
        }
        setCollapseContentDescription<K, V> setcollapsecontentdescription = this.c;
        if (setcollapsecontentdescription.e == null) {
            setcollapsecontentdescription.e = new setCollapseContentDescription.RemoteActionCompatParcelizer();
        }
        return setcollapsecontentdescription.e;
    }
}
