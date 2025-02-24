package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.setCollapseContentDescription;
/* loaded from: classes-dex2jar.jar:o/setThumbTintMode.class */
public final class setThumbTintMode<E> implements Collection<E>, Set<E> {
    private static Object[] a;
    private static final int[] c = new int[0];
    private static final Object[] e = new Object[0];
    private static Object[] g;
    private static int h;
    private static int i;
    int b;
    public Object[] d;
    private int[] f;
    private setCollapseContentDescription<E, E> j;

    public setThumbTintMode() {
        this(0);
    }

    public setThumbTintMode(int i2) {
        if (i2 == 0) {
            this.f = c;
            this.d = e;
        } else {
            d(i2);
        }
        this.b = 0;
    }

    private static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (setThumbTintMode.class) {
                try {
                    if (i < 10) {
                        objArr[0] = g;
                        objArr[1] = iArr;
                        while (true) {
                            i2--;
                            if (i2 < 2) {
                                break;
                            }
                            objArr[i2] = null;
                        }
                        g = objArr;
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (setThumbTintMode.class) {
                try {
                    if (h < 10) {
                        objArr[0] = a;
                        objArr[1] = iArr;
                        while (true) {
                            i2--;
                            if (i2 < 2) {
                                break;
                            }
                            objArr[i2] = null;
                        }
                        a = objArr;
                        h++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void d(int i2) {
        if (i2 == 8) {
            synchronized (setThumbTintMode.class) {
                try {
                    Object[] objArr = g;
                    if (objArr != null) {
                        this.d = objArr;
                        g = (Object[]) objArr[0];
                        this.f = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        i--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i2 == 4) {
            synchronized (setThumbTintMode.class) {
                try {
                    Object[] objArr2 = a;
                    if (objArr2 != null) {
                        this.d = objArr2;
                        a = (Object[]) objArr2[0];
                        this.f = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        h--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f = new int[i2];
        this.d = new Object[i2];
    }

    int a() {
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        int d = setThumbTintList.d(this.f, i2, 0);
        if (d >= 0 && this.d[d] != null) {
            int i3 = d + 1;
            while (i3 < i2 && this.f[i3] == 0) {
                if (this.d[i3] == null) {
                    return i3;
                }
                i3++;
            }
            int i4 = d - 1;
            while (i4 >= 0 && this.f[i4] == 0) {
                if (this.d[i4] == null) {
                    return i4;
                }
                i4--;
            }
            return i3 ^ -1;
        }
        return d;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = a();
            i2 = 0;
        } else {
            i2 = e2.hashCode();
            i3 = e(e2, i2);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = i3 ^ -1;
        int i5 = this.b;
        int[] iArr = this.f;
        if (i5 >= iArr.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.d;
            d(i6);
            int[] iArr2 = this.f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.d, 0, objArr.length);
            }
            c(iArr, objArr, this.b);
        }
        int i7 = this.b;
        if (i4 < i7) {
            int[] iArr3 = this.f;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, i4, objArr2, i8, this.b - i4);
        }
        this.f[i4] = i2;
        this.d[i4] = e2;
        this.b++;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = this.b + collection.size();
        int[] iArr = this.f;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.d;
            d(size);
            int i2 = this.b;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f, 0, i2);
                System.arraycopy(objArr, 0, this.d, 0, this.b);
            }
            c(iArr, objArr, this.b);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public final E b(int i2) {
        Object[] objArr = this.d;
        E e2 = (E) objArr[i2];
        int i3 = this.b;
        if (i3 <= 1) {
            c(this.f, objArr, i3);
            this.f = c;
            this.d = e;
            this.b = 0;
        } else {
            int[] iArr = this.f;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = i3 - 1;
                this.b = i5;
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    System.arraycopy(iArr, i6, iArr, i2, i5 - i2);
                    Object[] objArr2 = this.d;
                    System.arraycopy(objArr2, i6, objArr2, i2, this.b - i2);
                }
                this.d[this.b] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                d(i4);
                this.b--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f, 0, i2);
                    System.arraycopy(objArr, 0, this.d, 0, i2);
                }
                int i7 = this.b;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr, i8, this.f, i2, i7 - i2);
                    System.arraycopy(objArr, i8, this.d, i2, this.b - i2);
                }
            }
        }
        return e2;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i2 = this.b;
        if (i2 != 0) {
            c(this.f, this.d, i2);
            this.f = c;
            this.d = e;
            this.b = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? a() : e(obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    int e(Object obj, int i2) {
        int i3 = this.b;
        if (i3 == 0) {
            return -1;
        }
        int d = setThumbTintList.d(this.f, i3, i2);
        if (d >= 0 && !obj.equals(this.d[d])) {
            int i4 = d + 1;
            while (i4 < i3 && this.f[i4] == i2) {
                if (obj.equals(this.d[i4])) {
                    return i4;
                }
                i4++;
            }
            while (true) {
                d--;
                if (d < 0 || this.f[d] != i2) {
                    break;
                } else if (obj.equals(this.d[d])) {
                    return d;
                }
            }
            return i4 ^ -1;
        }
        return d;
    }

    @Override // java.util.Collection, java.lang.Object, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            try {
                if (!set.contains(this.d[i2])) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException e2) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Object, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f;
        int i2 = this.b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.j == null) {
            this.j = new setCollapseContentDescription<E, E>() { // from class: o.setThumbTintMode.2
                @Override // o.setCollapseContentDescription
                protected final void a(int i2) {
                    setThumbTintMode.this.b(i2);
                }

                @Override // o.setCollapseContentDescription
                protected final int b(Object obj) {
                    setThumbTintMode setthumbtintmode = setThumbTintMode.this;
                    return obj == null ? setthumbtintmode.a() : setthumbtintmode.e(obj, obj.hashCode());
                }

                @Override // o.setCollapseContentDescription
                protected final Map<E, E> b() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // o.setCollapseContentDescription
                protected final E c(int i2, E e2) {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // o.setCollapseContentDescription
                protected final void c(E e2, E e3) {
                    setThumbTintMode.this.add(e2);
                }

                @Override // o.setCollapseContentDescription
                protected final int d() {
                    return setThumbTintMode.this.b;
                }

                @Override // o.setCollapseContentDescription
                protected final Object d(int i2, int i3) {
                    return setThumbTintMode.this.d[i2];
                }

                @Override // o.setCollapseContentDescription
                protected final int e(Object obj) {
                    setThumbTintMode setthumbtintmode = setThumbTintMode.this;
                    return obj == null ? setthumbtintmode.a() : setthumbtintmode.e(obj, obj.hashCode());
                }

                @Override // o.setCollapseContentDescription
                protected final void e() {
                    setThumbTintMode.this.clear();
                }
            };
        }
        setCollapseContentDescription<E, E> setcollapsecontentdescription = this.j;
        if (setcollapsecontentdescription.d == null) {
            setcollapsecontentdescription.d = new setCollapseContentDescription.read();
        }
        return setcollapsecontentdescription.d.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int a2 = obj == null ? a() : e(obj, obj.hashCode());
        if (a2 < 0) {
            return false;
        }
        b(a2);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.b - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.d[i2])) {
                b(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.b;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i2 = this.b;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.d, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        T[] tArr2 = tArr;
        if (tArr.length < this.b) {
            tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.b));
        }
        System.arraycopy(this.d, 0, tArr2, 0, this.b);
        int length = tArr2.length;
        int i2 = this.b;
        if (length > i2) {
            tArr2[i2] = null;
        }
        return tArr2;
    }

    @Override // java.lang.Object
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.b * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.b; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.d[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
