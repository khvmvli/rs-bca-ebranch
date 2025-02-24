package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes-dex2jar.jar:o/setIdentityCardNumber.class */
final class setIdentityCardNumber extends setBirthPlace<Integer> implements RandomAccess, setIdentityCardImg, realmSet$annualFeeAddOnAmount {
    private static final setIdentityCardNumber a;
    private int[] b;
    private int d;

    static {
        setIdentityCardNumber setidentitycardnumber = new setIdentityCardNumber(new int[0], 0);
        a = setidentitycardnumber;
        setidentitycardnumber.b();
    }

    setIdentityCardNumber() {
        this(new int[10], 0);
    }

    private setIdentityCardNumber(int[] iArr, int i) {
        this.b = iArr;
        this.d = i;
    }

    private final void b(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    public static setIdentityCardNumber e() {
        return a;
    }

    private final String h(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final int a(int i) {
        b(i);
        return this.b[i];
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int[] iArr = this.b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.b, i, iArr2, i + 1, this.d - i);
            this.b = iArr2;
        }
        this.b[i] = intValue;
        this.d++;
        this.modCount++;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }

    @Override // o.setBirthPlace, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        setNationality.c(collection);
        if (!(collection instanceof setIdentityCardNumber)) {
            return addAll(collection);
        }
        setIdentityCardNumber setidentitycardnumber = (setIdentityCardNumber) collection;
        int i = setidentitycardnumber.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.b;
            if (i3 > iArr.length) {
                this.b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(setidentitycardnumber.b, 0, this.b, this.d, setidentitycardnumber.d);
            this.d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // o.setIdentityCardImg
    /* renamed from: c */
    public final setIdentityCardImg e(int i) {
        if (i >= this.d) {
            return new setIdentityCardNumber(Arrays.copyOf(this.b, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        a();
        int i2 = this.d;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.b = iArr2;
        }
        int[] iArr3 = this.b;
        int i3 = this.d;
        this.d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List, java.util.Collection, java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setIdentityCardNumber)) {
            return equals(obj);
        }
        setIdentityCardNumber setidentitycardnumber = (setIdentityCardNumber) obj;
        if (this.d != setidentitycardnumber.d) {
            return false;
        }
        int[] iArr = setidentitycardnumber.b;
        for (int i = 0; i < this.d; i++) {
            if (this.b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Integer.valueOf(this.b[i]);
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List, java.util.Collection, java.lang.Object
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        a();
        b(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        int i3 = this.d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            int[] iArr = this.b;
            System.arraycopy(iArr, i2, iArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        b(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }
}
