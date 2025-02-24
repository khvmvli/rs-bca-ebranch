package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes-dex2jar.jar:o/setFlagCardKrisFlyer.class */
final class setFlagCardKrisFlyer extends setBirthPlace<Float> implements RandomAccess, realmSet$annualFeeAddOnAmount {
    private static final setFlagCardKrisFlyer e;
    private float[] b;
    private int d;

    static {
        setFlagCardKrisFlyer setflagcardkrisflyer = new setFlagCardKrisFlyer(new float[0], 0);
        e = setflagcardkrisflyer;
        setflagcardkrisflyer.b();
    }

    setFlagCardKrisFlyer() {
        this(new float[10], 0);
    }

    private setFlagCardKrisFlyer(float[] fArr, int i) {
        this.b = fArr;
        this.d = i;
    }

    private final void b(int i) {
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

    public final void a(float f) {
        a();
        int i = this.d;
        float[] fArr = this.b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.b = fArr2;
        }
        float[] fArr3 = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(d(i));
        }
        float[] fArr = this.b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.b, i, fArr2, i + 1, this.d - i);
            this.b = fArr2;
        }
        this.b[i] = floatValue;
        this.d++;
        this.modCount++;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
        a(((Float) obj).floatValue());
        return true;
    }

    @Override // o.setBirthPlace, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        setNationality.c(collection);
        if (!(collection instanceof setFlagCardKrisFlyer)) {
            return addAll(collection);
        }
        setFlagCardKrisFlyer setflagcardkrisflyer = (setFlagCardKrisFlyer) collection;
        int i = setflagcardkrisflyer.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.b;
            if (i3 > fArr.length) {
                this.b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(setflagcardkrisflyer.b, 0, this.b, this.d, setflagcardkrisflyer.d);
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

    @Override // o.setMonthlyIncome
    public final /* synthetic */ setMonthlyIncome e(int i) {
        if (i >= this.d) {
            return new setFlagCardKrisFlyer(Arrays.copyOf(this.b, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List, java.util.Collection, java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFlagCardKrisFlyer)) {
            return equals(obj);
        }
        setFlagCardKrisFlyer setflagcardkrisflyer = (setFlagCardKrisFlyer) obj;
        if (this.d != setflagcardkrisflyer.d) {
            return false;
        }
        float[] fArr = setflagcardkrisflyer.b;
        for (int i = 0; i < this.d; i++) {
            if (Float.floatToIntBits(this.b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Float.valueOf(this.b[i]);
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List, java.util.Collection, java.lang.Object
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        a();
        b(i);
        float[] fArr = this.b;
        float f = fArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            float[] fArr = this.b;
            System.arraycopy(fArr, i2, fArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // o.setBirthPlace, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        b(i);
        float[] fArr = this.b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }
}
