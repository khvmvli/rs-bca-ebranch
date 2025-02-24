package o;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/setCollapseIcon.class */
public class setCollapseIcon<K, V> {
    static int a;
    static Object[] b;
    static Object[] d;
    static int e;
    int f;
    public Object[] h;
    int[] i;

    public setCollapseIcon() {
        this.i = setThumbTintList.e;
        this.h = setThumbTintList.b;
        this.f = 0;
    }

    public setCollapseIcon(int i) {
        if (i == 0) {
            this.i = setThumbTintList.e;
            this.h = setThumbTintList.b;
        } else {
            e(i);
        }
        this.f = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setCollapseIcon(setCollapseIcon<K, V> setcollapseicon) {
        this();
        if (setcollapseicon != 0) {
            e((setCollapseIcon) setcollapseicon);
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (setCollapseIcon.class) {
                try {
                    if (e < 10) {
                        objArr[0] = d;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        d = objArr;
                        e++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (setCollapseIcon.class) {
                try {
                    if (a < 10) {
                        objArr[0] = b;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        b = objArr;
                        a++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static int e(int[] iArr, int i, int i2) {
        try {
            return setThumbTintList.d(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ConcurrentModificationException();
        }
    }

    private void e(int i) {
        if (i == 8) {
            synchronized (setCollapseIcon.class) {
                try {
                    Object[] objArr = d;
                    if (objArr != null) {
                        this.h = objArr;
                        d = (Object[]) objArr[0];
                        this.i = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        e--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i == 4) {
            synchronized (setCollapseIcon.class) {
                try {
                    Object[] objArr2 = b;
                    if (objArr2 != null) {
                        this.h = objArr2;
                        b = (Object[]) objArr2[0];
                        this.i = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        a--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.i = new int[i];
        this.h = new Object[i << 1];
    }

    public final void a(int i) {
        int i2 = this.f;
        int[] iArr = this.i;
        if (iArr.length < i) {
            Object[] objArr = this.h;
            e(i);
            if (this.f > 0) {
                System.arraycopy(iArr, 0, this.i, 0, i2);
                System.arraycopy(objArr, 0, this.h, 0, i2 << 1);
            }
            d(iArr, objArr, i2);
        }
        if (this.f != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final int b() {
        int i = this.f;
        if (i == 0) {
            return -1;
        }
        int e2 = e(this.i, i, 0);
        if (e2 >= 0 && this.h[e2 << 1] != null) {
            int i2 = e2 + 1;
            while (i2 < i && this.i[i2] == 0) {
                if (this.h[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            int i3 = e2 - 1;
            while (i3 >= 0 && this.i[i3] == 0) {
                if (this.h[i3 << 1] == null) {
                    return i3;
                }
                i3--;
            }
            return i2 ^ -1;
        }
        return e2;
    }

    public final int b(Object obj, int i) {
        int i2 = this.f;
        if (i2 == 0) {
            return -1;
        }
        int e2 = e(this.i, i2, i);
        if (e2 >= 0 && !obj.equals(this.h[e2 << 1])) {
            int i3 = e2 + 1;
            while (i3 < i2 && this.i[i3] == i) {
                if (obj.equals(this.h[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            int i4 = e2 - 1;
            while (i4 >= 0 && this.i[i4] == i) {
                if (obj.equals(this.h[i4 << 1])) {
                    return i4;
                }
                i4--;
            }
            return i3 ^ -1;
        }
        return e2;
    }

    public V b(int i) {
        Object[] objArr = this.h;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f;
        int i4 = 0;
        if (i3 <= 1) {
            d(this.i, objArr, i3);
            this.i = setThumbTintList.e;
            this.h = setThumbTintList.b;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.i;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.h;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.h;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                e(i6);
                if (i3 == this.f) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.i, 0, i);
                        System.arraycopy(objArr, 0, this.h, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.i, i, i11);
                        System.arraycopy(objArr, i10 << 1, this.h, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f) {
            this.f = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V b(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.h;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    @Override // java.util.Map
    public void clear() {
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.i;
            Object[] objArr = this.h;
            this.i = setThumbTintList.e;
            this.h = setThumbTintList.b;
            this.f = 0;
            d(iArr, objArr, i);
        }
        if (this.f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return (obj == null ? b() : b(obj, obj.hashCode())) >= 0;
    }

    public boolean containsValue(Object obj) {
        return e(obj) >= 0;
    }

    final int e(Object obj) {
        int i = this.f << 1;
        Object[] objArr = this.h;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(setCollapseIcon<? extends K, ? extends V> setcollapseicon) {
        int i = setcollapseicon.f;
        a(this.f + i);
        if (this.f != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr = setcollapseicon.h;
                int i3 = i2 << 1;
                put(objArr[i3], objArr[i3 + 1]);
            }
        } else if (i > 0) {
            System.arraycopy(setcollapseicon.i, 0, this.i, 0, i);
            System.arraycopy(setcollapseicon.h, 0, this.h, 0, i << 1);
            this.f = i;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setCollapseIcon) {
            setCollapseIcon setcollapseicon = (setCollapseIcon) obj;
            if (size() != setcollapseicon.size()) {
                return false;
            }
            for (int i = 0; i < this.f; i++) {
                try {
                    int i2 = i << 1;
                    Object obj2 = this.h[i2];
                    Object obj3 = this.h[i2 + 1];
                    Object obj4 = setcollapseicon.get(obj2);
                    if (obj3 == null) {
                        if (obj4 != null || !setcollapseicon.containsKey(obj2)) {
                            return false;
                        }
                    } else if (!obj3.equals(obj4)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException e2) {
                    return false;
                }
            }
            return true;
        } else if (!(obj instanceof Map)) {
            return false;
        } else {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f; i3++) {
                try {
                    int i4 = i3 << 1;
                    Object obj5 = this.h[i4];
                    Object obj6 = this.h[i4 + 1];
                    Object obj7 = map.get(obj5);
                    if (obj6 == null) {
                        if (obj7 != null || !map.containsKey(obj5)) {
                            return false;
                        }
                    } else if (!obj6.equals(obj7)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException e3) {
                    return false;
                }
            }
            return true;
        }
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int b2 = obj == null ? b() : b(obj, obj.hashCode());
        if (b2 >= 0) {
            v = (V) this.h[(b2 << 1) + 1];
        }
        return v;
    }

    @Override // java.util.Map, java.lang.Object
    public int hashCode() {
        int[] iArr = this.i;
        Object[] objArr = this.h;
        int i = this.f;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f <= 0;
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f;
        if (k == null) {
            i2 = b();
            i = 0;
        } else {
            i = k.hashCode();
            i2 = b(k, i);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            Object[] objArr = this.h;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        int[] iArr = this.i;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.h;
            e(i6);
            if (i3 == this.f) {
                int[] iArr2 = this.i;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.h, 0, objArr2.length);
                }
                d(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.i;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.h;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f - i5) << 1);
        }
        int i8 = this.f;
        if (i3 == i8) {
            int[] iArr4 = this.i;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr4 = this.h;
                int i9 = i5 << 1;
                objArr4[i9] = k;
                objArr4[i9 + 1] = v;
                this.f = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        V v3 = v2;
        if (v2 == null) {
            v3 = put(k, v);
        }
        return v3;
    }

    public V remove(Object obj) {
        int b2 = obj == null ? b() : b(obj, obj.hashCode());
        if (b2 >= 0) {
            return b(b2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int b2 = obj == null ? b() : b(obj, obj.hashCode());
        if (b2 < 0) {
            return false;
        }
        Object obj3 = this.h[(b2 << 1) + 1];
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        b(b2);
        return true;
    }

    public V replace(K k, V v) {
        int b2 = k == null ? b() : b(k, k.hashCode());
        if (b2 >= 0) {
            return b(b2, (int) v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int b2 = k == null ? b() : b(k, k.hashCode());
        if (b2 < 0) {
            return false;
        }
        Object obj = this.h[(b2 << 1) + 1];
        if (obj != v && (v == null || !v.equals(obj))) {
            return false;
        }
        b(b2, (int) v2);
        return true;
    }

    public int size() {
        return this.f;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 28);
        sb.append('{');
        for (int i = 0; i < this.f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = i << 1;
            Object obj = this.h[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.h[i2 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
