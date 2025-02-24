package o;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* loaded from: classes-dex2jar.jar:o/realmSet$cardName.class */
public class realmSet$cardName<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int a;
    private volatile realmSet$cardType b;
    private boolean e;
    private List<realmSet$cardGroupType> c = Collections.emptyList();
    private Map<K, V> d = Collections.emptyMap();
    private Map<K, V> f = Collections.emptyMap();

    public /* synthetic */ realmSet$cardName(int i, realmSet$cardCode realmset_cardcode) {
        this.a = i;
    }

    public final void a() {
        if (this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public final V c(int i) {
        a();
        V v = (V) this.c.remove(i).getValue();
        if (!this.d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = j().entrySet().iterator();
            List<realmSet$cardGroupType> list = this.c;
            Map.Entry<K, V> next = it.next();
            list.add(new realmSet$cardGroupType(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    private final int e(K k) {
        int size = this.c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.c.get(size).e());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.c.get(i2).e());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    private final SortedMap<K, V> j() {
        a();
        if (this.d.isEmpty() && !(this.d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.d = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.d;
    }

    public final int b() {
        return this.c.size();
    }

    public final Iterable<Map.Entry<K, V>> c() {
        return this.d.isEmpty() ? realmSet$cardID.b() : this.d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
        if (!this.d.isEmpty()) {
            this.d.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.d.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i) {
        return this.c.get(i);
    }

    public void d() {
        if (!this.e) {
            this.d = this.d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.d);
            this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
            this.e = true;
        }
    }

    /* renamed from: e */
    public final V put(K k, V v) {
        a();
        int e = e(k);
        if (e >= 0) {
            return (V) this.c.get(e).setValue(v);
        }
        a();
        if (this.c.isEmpty() && !(this.c instanceof ArrayList)) {
            this.c = new ArrayList(this.a);
        }
        int i = -(e + 1);
        if (i >= this.a) {
            return j().put(k, v);
        }
        int size = this.c.size();
        int i2 = this.a;
        if (size == i2) {
            realmSet$cardGroupType remove = this.c.remove(i2 - 1);
            j().put((K) remove.e(), (V) remove.getValue());
        }
        this.c.add(i, new realmSet$cardGroupType(this, k, v));
        return null;
    }

    public final boolean e() {
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.b == null) {
            this.b = new AbstractSet<Map.Entry>(null) { // from class: o.realmSet$cardType
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final /* synthetic */ boolean add(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (contains(entry)) {
                        return false;
                    }
                    realmSet$cardName.this.put((Comparable) entry.getKey(), entry.getValue());
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final void clear() {
                    realmSet$cardName.this.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = realmSet$cardName.this.get(entry.getKey());
                    Object value = entry.getValue();
                    boolean z = false;
                    if (obj2 != value) {
                        if (obj2 != null) {
                            if (!obj2.equals(value)) {
                                return false;
                            }
                        }
                        return z;
                    }
                    z = true;
                    return z;
                }

                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000c: RETURN  
                      (wrap: o.realmSet$cardDescription : 0x0009: CONSTRUCTOR  (r0v0 o.realmSet$cardDescription A[REMOVE]) = 
                      (wrap: o.realmSet$cardName : 0x0005: IGET  (r2v1 o.realmSet$cardName A[REMOVE]) = (r5v0 'this' o.realmSet$cardType A[IMMUTABLE_TYPE, THIS]) o.realmSet$cardType.d o.realmSet$cardName)
                      (null o.realmSet$cardCode)
                     call: o.realmSet$cardDescription.<init>(o.realmSet$cardName, o.realmSet$cardCode):void type: CONSTRUCTOR)
                     in method: o.realmSet$cardType.iterator():java.util.Iterator<java.util.Map$Entry>, file: classes-dex2jar.jar:o/realmSet$cardType.class
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.realmSet$cardDescription, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:328)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                    	... 10 more
                    */
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
                public final java.util.Iterator<java.util.Map.Entry> iterator() {
                    /*
                        r5 = this;
                        o.realmSet$cardDescription r0 = new o.realmSet$cardDescription
                        r1 = r0
                        r2 = r5
                        o.realmSet$cardName r2 = o.realmSet$cardName.this
                        r3 = 0
                        r1.<init>(r2, r3)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.realmSet$cardType.iterator():java.util.Iterator");
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean remove(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!contains(entry)) {
                        return false;
                    }
                    realmSet$cardName.this.remove(entry.getKey());
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    return realmSet$cardName.this.size();
                }
            };
        }
        return this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof realmSet$cardName)) {
            return equals(obj);
        }
        realmSet$cardName realmset_cardname = (realmSet$cardName) obj;
        int size = size();
        if (size != realmset_cardname.size()) {
            return false;
        }
        int b = b();
        if (b != realmset_cardname.b()) {
            return entrySet().equals(realmset_cardname.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!d(i).equals(realmset_cardname.d(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.d.equals(realmset_cardname.d);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e = e(comparable);
        return e >= 0 ? (V) this.c.get(e).getValue() : this.d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.lang.Object
    public final int hashCode() {
        int b = b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += this.c.get(i2).hashCode();
        }
        int i3 = i;
        if (this.d.size() > 0) {
            i3 = i + this.d.hashCode();
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        a();
        Comparable comparable = (Comparable) obj;
        int e = e(comparable);
        if (e >= 0) {
            return (V) c(e);
        }
        if (this.d.isEmpty()) {
            return null;
        }
        return this.d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.d.size();
    }
}
