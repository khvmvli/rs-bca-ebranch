package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes-dex2jar.jar:o/setCreditCardOptions.class */
final class setCreditCardOptions extends setBirthPlace<Boolean> implements RandomAccess, realmSet$annualFeeAddOnAmount {
    private static final setCreditCardOptions e;
    private int a;
    private boolean[] c;

    static {
        setCreditCardOptions setcreditcardoptions = new setCreditCardOptions(new boolean[0], 0);
        e = setcreditcardoptions;
        setcreditcardoptions.b();
    }

    setCreditCardOptions() {
        this(new boolean[10], 0);
    }

    private setCreditCardOptions(boolean[] zArr, int i) {
        this.c = zArr;
        this.a = i;
    }

    private final void a(int i) {
        if (i < 0 || i >= this.a) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    private final String c(int i) {
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final void a(boolean z) {
        a();
        int i = this.a;
        boolean[] zArr = this.c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.c = zArr2;
        }
        boolean[] zArr3 = this.c;
        int i2 = this.a;
        this.a = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i < 0 || i > (i2 = this.a)) {
            throw new IndexOutOfBoundsException(c(i));
        }
        boolean[] zArr = this.c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.c, i, zArr2, i + 1, this.a - i);
            this.c = zArr2;
        }
        this.c[i] = booleanValue;
        this.a++;
        this.modCount++;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
        a(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // o.setBirthPlace, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        setNationality.c(collection);
        if (!(collection instanceof setCreditCardOptions)) {
            return addAll(collection);
        }
        setCreditCardOptions setcreditcardoptions = (setCreditCardOptions) collection;
        int i = setcreditcardoptions.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.c;
            if (i3 > zArr.length) {
                this.c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(setcreditcardoptions.c, 0, this.c, this.a, setcreditcardoptions.a);
            this.a = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // o.setMonthlyIncome
    public final /* synthetic */ setMonthlyIncome e(int i) {
        if (i >= this.a) {
            return new setCreditCardOptions(Arrays.copyOf(this.c, i), this.a);
        }
        throw new IllegalArgumentException();
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List, java.util.Collection, java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setCreditCardOptions)) {
            return equals(obj);
        }
        setCreditCardOptions setcreditcardoptions = (setCreditCardOptions) obj;
        if (this.a != setcreditcardoptions.a) {
            return false;
        }
        boolean[] zArr = setcreditcardoptions.c;
        for (int i = 0; i < this.a; i++) {
            if (this.c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        a(i);
        return Boolean.valueOf(this.c[i]);
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List, java.util.Collection, java.lang.Object
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.a; i2++) {
            i = (i * 31) + setNationality.d(this.c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        a();
        a(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        int i2 = this.a;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            boolean[] zArr = this.c;
            System.arraycopy(zArr, i2, zArr, i, this.a - i2);
            this.a -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        a(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.a;
    }
}
