package o;
/* loaded from: classes-dex2jar.jar:o/setTrackDrawable.class */
public final class setTrackDrawable<E> implements Cloneable {
    public static final Object e = new Object();
    public int a;
    public Object[] b;
    public boolean c;
    public long[] d;

    public setTrackDrawable() {
        this(10);
    }

    public setTrackDrawable(int i) {
        this.c = false;
        if (i == 0) {
            this.d = setThumbTintList.d;
            this.b = setThumbTintList.b;
            return;
        }
        int b = setThumbTintList.b(i);
        this.d = new long[b];
        this.b = new Object[b];
    }

    public final int a() {
        if (this.c) {
            e();
        }
        return this.a;
    }

    public final E a(long j, E e2) {
        E e3;
        int e4 = setThumbTintList.e(this.d, this.a, j);
        return (e4 < 0 || (e3 = (E) this.b[e4]) == e) ? e2 : e3;
    }

    public final E b(int i) {
        if (this.c) {
            e();
        }
        return (E) this.b[i];
    }

    public final void b() {
        int i = this.a;
        Object[] objArr = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.a = 0;
        this.c = false;
    }

    public final void c(long j, E e2) {
        int e3 = setThumbTintList.e(this.d, this.a, j);
        if (e3 >= 0) {
            this.b[e3] = e2;
            return;
        }
        int i = e3 ^ -1;
        int i2 = this.a;
        if (i < i2) {
            Object[] objArr = this.b;
            if (objArr[i] == e) {
                this.d[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        int i3 = i;
        if (this.c) {
            i3 = i;
            if (i2 >= this.d.length) {
                e();
                i3 = setThumbTintList.e(this.d, this.a, j) ^ -1;
            }
        }
        int i4 = this.a;
        if (i4 >= this.d.length) {
            int b = setThumbTintList.b(i4 + 1);
            long[] jArr = new long[b];
            Object[] objArr2 = new Object[b];
            long[] jArr2 = this.d;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.d = jArr;
            this.b = objArr2;
        }
        int i5 = this.a - i3;
        if (i5 != 0) {
            long[] jArr3 = this.d;
            int i6 = i3 + 1;
            System.arraycopy(jArr3, i3, jArr3, i6, i5);
            Object[] objArr4 = this.b;
            System.arraycopy(objArr4, i3, objArr4, i6, this.a - i3);
        }
        this.d[i3] = j;
        this.b[i3] = e2;
        this.a++;
    }

    public final long d(int i) {
        if (this.c) {
            e();
        }
        return this.d[i];
    }

    /* renamed from: d */
    public final setTrackDrawable<E> clone() {
        try {
            setTrackDrawable<E> settrackdrawable = (setTrackDrawable) clone();
            settrackdrawable.d = (long[]) this.d.clone();
            settrackdrawable.b = (Object[]) this.b.clone();
            return settrackdrawable;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void d(long j, E e2) {
        int i = this.a;
        if (i == 0 || j > this.d[i - 1]) {
            if (this.c && i >= this.d.length) {
                e();
            }
            int i2 = this.a;
            if (i2 >= this.d.length) {
                int b = setThumbTintList.b(i2 + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                long[] jArr2 = this.d;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.b;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.d = jArr;
                this.b = objArr;
            }
            this.d[i2] = j;
            this.b[i2] = e2;
            this.a = i2 + 1;
            return;
        }
        c(j, e2);
    }

    public void e() {
        int i = this.a;
        long[] jArr = this.d;
        Object[] objArr = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = i2;
            if (obj != e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.c = false;
        this.a = i2;
    }

    @Override // java.lang.Object
    public final String toString() {
        if (this.c) {
            e();
        }
        int i = this.a;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.a; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(d(i2));
            sb.append('=');
            E b = b(i2);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
