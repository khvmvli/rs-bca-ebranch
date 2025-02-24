package o;
/* loaded from: classes-dex2jar.jar:o/setTrackTintList.class */
public class setTrackTintList<E> implements Cloneable {
    private static final Object b = new Object();
    private int[] a;
    private boolean c;
    private int d;
    private Object[] e;

    public setTrackTintList() {
        this(10);
    }

    public setTrackTintList(int i) {
        this.c = false;
        if (i == 0) {
            this.a = setThumbTintList.e;
            this.e = setThumbTintList.b;
            return;
        }
        int d = setThumbTintList.d(i);
        this.a = new int[d];
        this.e = new Object[d];
    }

    private void d() {
        int i = this.d;
        int[] iArr = this.a;
        Object[] objArr = this.e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = i2;
            if (obj != b) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.c = false;
        this.d = i2;
    }

    public void a(int i, E e) {
        int i2 = this.d;
        if (i2 == 0 || i > this.a[i2 - 1]) {
            if (this.c && i2 >= this.a.length) {
                d();
            }
            int i3 = this.d;
            if (i3 >= this.a.length) {
                int d = setThumbTintList.d(i3 + 1);
                int[] iArr = new int[d];
                Object[] objArr = new Object[d];
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.e;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.a = iArr;
                this.e = objArr;
            }
            this.a[i3] = i;
            this.e[i3] = e;
            this.d = i3 + 1;
            return;
        }
        c(i, e);
    }

    public int b() {
        if (this.c) {
            d();
        }
        return this.d;
    }

    public E b(int i) {
        return e(i, null);
    }

    public int c(int i) {
        if (this.c) {
            d();
        }
        return this.a[i];
    }

    /* renamed from: c */
    public setTrackTintList<E> clone() {
        try {
            setTrackTintList<E> settracktintlist = (setTrackTintList) clone();
            settracktintlist.a = (int[]) this.a.clone();
            settracktintlist.e = (Object[]) this.e.clone();
            return settracktintlist;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public void c(int i, E e) {
        int d = setThumbTintList.d(this.a, this.d, i);
        if (d >= 0) {
            this.e[d] = e;
            return;
        }
        int i2 = d ^ -1;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.e;
            if (objArr[i2] == b) {
                this.a[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        int i4 = i2;
        if (this.c) {
            i4 = i2;
            if (i3 >= this.a.length) {
                d();
                i4 = setThumbTintList.d(this.a, this.d, i) ^ -1;
            }
        }
        int i5 = this.d;
        if (i5 >= this.a.length) {
            int d2 = setThumbTintList.d(i5 + 1);
            int[] iArr = new int[d2];
            Object[] objArr2 = new Object[d2];
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.a = iArr;
            this.e = objArr2;
        }
        int i6 = this.d - i4;
        if (i6 != 0) {
            int[] iArr3 = this.a;
            int i7 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i7, i6);
            Object[] objArr4 = this.e;
            System.arraycopy(objArr4, i4, objArr4, i7, this.d - i4);
        }
        this.a[i4] = i;
        this.e[i4] = e;
        this.d++;
    }

    public int e(E e) {
        if (this.c) {
            d();
        }
        for (int i = 0; i < this.d; i++) {
            if (this.e[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public E e(int i) {
        if (this.c) {
            d();
        }
        return (E) this.e[i];
    }

    public E e(int i, E e) {
        E e2;
        int d = setThumbTintList.d(this.a, this.d, i);
        return (d < 0 || (e2 = (E) this.e[d]) == b) ? e : e2;
    }

    public void e() {
        int i = this.d;
        Object[] objArr = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.c = false;
    }

    @Override // java.lang.Object
    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(c(i));
            sb.append('=');
            E e = e(i);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
