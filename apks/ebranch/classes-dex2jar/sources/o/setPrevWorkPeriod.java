package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes-dex2jar.jar:o/setPrevWorkPeriod.class */
public final class setPrevWorkPeriod extends setBirthPlace<String> implements RandomAccess, setReferalCode {
    public static final setReferalCode a;
    private static final setPrevWorkPeriod b;
    private final List<Object> e;

    static {
        setPrevWorkPeriod setprevworkperiod = new setPrevWorkPeriod(10);
        b = setprevworkperiod;
        setprevworkperiod.b();
        a = setprevworkperiod;
    }

    public setPrevWorkPeriod() {
        this(10);
    }

    public setPrevWorkPeriod(int i) {
        this.e = new ArrayList(i);
    }

    private setPrevWorkPeriod(ArrayList<Object> arrayList) {
        this.e = arrayList;
    }

    private static String a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof setCurrOfficePostCode ? ((setCurrOfficePostCode) obj).e(setNationality.c) : setNationality.a((byte[]) obj);
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        a();
        this.e.add(i, (String) obj);
        this.modCount++;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        List<?> list = collection;
        if (collection instanceof setReferalCode) {
            list = ((setReferalCode) collection).d();
        }
        boolean addAll = this.e.addAll(i, list);
        this.modCount++;
        return addAll;
    }

    @Override // o.setBirthPlace, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // o.setReferalCode
    public final Object b(int i) {
        return this.e.get(i);
    }

    @Override // o.setReferalCode
    public final void b(setCurrOfficePostCode setcurrofficepostcode) {
        a();
        this.e.add(setcurrofficepostcode);
        this.modCount++;
    }

    /* renamed from: c */
    public final String get(int i) {
        Object obj = this.e.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof setCurrOfficePostCode) {
            setCurrOfficePostCode setcurrofficepostcode = (setCurrOfficePostCode) obj;
            String e = setcurrofficepostcode.e(setNationality.c);
            if (setcurrofficepostcode.a()) {
                this.e.set(i, e);
            }
            return e;
        }
        byte[] bArr = (byte[]) obj;
        String a2 = setNationality.a(bArr);
        if (setNationality.b(bArr)) {
            this.e.set(i, a2);
        }
        return a2;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final void clear() {
        a();
        this.e.clear();
        this.modCount++;
    }

    @Override // o.setReferalCode
    public final List<?> d() {
        return Collections.unmodifiableList(this.e);
    }

    @Override // o.setMonthlyIncome
    public final /* synthetic */ setMonthlyIncome e(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.e);
            return new setPrevWorkPeriod(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // o.setReferalCode
    public final setReferalCode e() {
        return c() ? new getRelationship(this) : this;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        a();
        Object remove = this.e.remove(i);
        this.modCount++;
        return a(remove);
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        a();
        return a(this.e.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.e.size();
    }
}
