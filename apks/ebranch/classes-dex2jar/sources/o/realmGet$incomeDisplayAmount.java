package o;

import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes-dex2jar.jar:o/realmGet$incomeDisplayAmount.class */
final class realmGet$incomeDisplayAmount<E> extends setBirthPlace<E> implements RandomAccess {
    private static final realmGet$incomeDisplayAmount<Object> a;
    private E[] b;
    private int d;

    static {
        realmGet$incomeDisplayAmount<Object> realmget_incomedisplayamount = new realmGet$incomeDisplayAmount<>(new Object[0], 0);
        a = realmget_incomedisplayamount;
        realmget_incomedisplayamount.b();
    }

    realmGet$incomeDisplayAmount() {
        this(new Object[10], 0);
    }

    private realmGet$incomeDisplayAmount(E[] eArr, int i) {
        this.b = eArr;
        this.d = i;
    }

    private final void a(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(d(i));
        }
    }

    private final String d(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public static <E> realmGet$incomeDisplayAmount<E> e() {
        return (realmGet$incomeDisplayAmount<E>) a;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(d(i));
        }
        E[] eArr = this.b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.b, i, eArr2, i + 1, this.d - i);
            this.b = eArr2;
        }
        this.b[i] = e;
        this.d++;
        this.modCount++;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean add(E e) {
        a();
        int i = this.d;
        E[] eArr = this.b;
        if (i == eArr.length) {
            this.b = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    @Override // o.setMonthlyIncome
    public final /* synthetic */ setMonthlyIncome e(int i) {
        if (i >= this.d) {
            return new realmGet$incomeDisplayAmount(Arrays.copyOf(this.b, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        a(i);
        return this.b[i];
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        a();
        a(i);
        E[] eArr = this.b;
        E e = eArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return e;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        a();
        a(i);
        E[] eArr = this.b;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }
}
