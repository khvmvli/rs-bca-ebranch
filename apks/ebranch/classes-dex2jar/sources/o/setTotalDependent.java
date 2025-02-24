package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes-dex2jar.jar:o/setTotalDependent.class */
final class setTotalDependent extends setBirthPlace<Long> implements RandomAccess, setNpwpImg, realmSet$annualFeeAddOnAmount {
    private static final setTotalDependent c;
    private int d;
    private long[] e;

    static {
        setTotalDependent settotaldependent = new setTotalDependent(new long[0], 0);
        c = settotaldependent;
        settotaldependent.b();
    }

    setTotalDependent() {
        this(new long[10], 0);
    }

    private setTotalDependent(long[] jArr, int i) {
        this.e = jArr;
        this.d = i;
    }

    private final String b(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    private final void c(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(b(i));
        }
    }

    public static setTotalDependent e() {
        return c;
    }

    @Override // o.setNpwpImg
    /* renamed from: a */
    public final setNpwpImg e(int i) {
        if (i >= this.d) {
            return new setTotalDependent(Arrays.copyOf(this.e, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(b(i));
        }
        long[] jArr = this.e;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.e, i, jArr2, i + 1, this.d - i);
            this.e = jArr2;
        }
        this.e[i] = longValue;
        this.d++;
        this.modCount++;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }

    @Override // o.setBirthPlace, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        setNationality.c(collection);
        if (!(collection instanceof setTotalDependent)) {
            return addAll(collection);
        }
        setTotalDependent settotaldependent = (setTotalDependent) collection;
        int i = settotaldependent.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.e;
            if (i3 > jArr.length) {
                this.e = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(settotaldependent.e, 0, this.e, this.d, settotaldependent.d);
            this.d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // o.setNpwpImg
    public final long d(int i) {
        c(i);
        return this.e[i];
    }

    public final void d(long j) {
        a();
        int i = this.d;
        long[] jArr = this.e;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.e = jArr2;
        }
        long[] jArr3 = this.e;
        int i2 = this.d;
        this.d = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List, java.util.Collection, java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTotalDependent)) {
            return equals(obj);
        }
        setTotalDependent settotaldependent = (setTotalDependent) obj;
        if (this.d != settotaldependent.d) {
            return false;
        }
        long[] jArr = settotaldependent.e;
        for (int i = 0; i < this.d; i++) {
            if (this.e[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        c(i);
        return Long.valueOf(this.e[i]);
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List, java.util.Collection, java.lang.Object
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + setNationality.c(this.e[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.e[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        a();
        c(i);
        long[] jArr = this.e;
        long j = jArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            long[] jArr = this.e;
            System.arraycopy(jArr, i2, jArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        c(i);
        long[] jArr = this.e;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }
}
