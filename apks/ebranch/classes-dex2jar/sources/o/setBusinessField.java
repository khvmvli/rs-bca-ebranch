package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import io.realm.internal.Property;
import java.security.MessageDigest;
import java.util.Map;
import o.setBusinessField;
/* loaded from: classes-dex2jar.jar:o/setBusinessField.class */
public abstract class setBusinessField<T extends setBusinessField<T>> implements Cloneable {
    private int a;
    int c;
    Drawable d;
    Drawable e;
    public boolean f;
    int g;
    public boolean i;
    int k;
    boolean l;
    Drawable m;

    /* renamed from: o */
    boolean f201o;
    Resources.Theme s;
    boolean x;
    boolean y;
    float q = 1.0f;
    DaftarTransferResponse b = DaftarTransferResponse.e;
    private setCategories D = setCategories.NORMAL;
    boolean j = true;
    private int w = -1;
    private int u = -1;
    setCode r = getLimitMax.d();
    private boolean v = true;
    CategoryResponse n = new CategoryResponse();
    Map<Class<?>, getReservationDate<?>> p = new getReceiverStatesName();
    Class<?> t = Object.class;
    boolean h = true;

    private <Y> T b(Class<Y> cls, getReservationDate<Y> getreservationdate, boolean z) {
        setBusinessField<T> setbusinessfield = this;
        while (setbusinessfield.i) {
            setbusinessfield = setbusinessfield.clone();
        }
        if (cls == null) {
            throw new NullPointerException("Argument must not be null");
        } else if (getreservationdate != null) {
            setbusinessfield.p.put(cls, getreservationdate);
            int i = setbusinessfield.a;
            setbusinessfield.v = true;
            int i2 = i | 2048 | 65536;
            setbusinessfield.a = i2;
            setbusinessfield.h = false;
            if (z) {
                setbusinessfield.a = i2 | 131072;
                setbusinessfield.f201o = true;
            }
            if (!setbusinessfield.f) {
                return setbusinessfield;
            }
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    private T b(getCurrencyCode getcurrencycode, getReservationDate<Bitmap> getreservationdate) {
        setBusinessField<T> setbusinessfield = this;
        while (setbusinessfield.i) {
            setbusinessfield = setbusinessfield.clone();
        }
        setbusinessfield.c(getcurrencycode);
        return setbusinessfield.e(getreservationdate, false);
    }

    private <Y> T c(getCode<Y> getcode, Y y) {
        setBusinessField<T> setbusinessfield = this;
        while (setbusinessfield.i) {
            setbusinessfield = setbusinessfield.clone();
        }
        if (getcode == null) {
            throw new NullPointerException("Argument must not be null");
        } else if (y != null) {
            setbusinessfield.n.c.put(getcode, y);
            if (!setbusinessfield.f) {
                return setbusinessfield;
            }
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    private T c(getCurrencyCode getcurrencycode) {
        getCode getcode = getCurrencyCode.f;
        if (getcurrencycode != null) {
            return c(getcode, getcurrencycode);
        }
        throw new NullPointerException("Argument must not be null");
    }

    private T e(getCurrencyCode getcurrencycode, getReservationDate<Bitmap> getreservationdate) {
        T t;
        if (this.i) {
            t = (T) clone().b(getcurrencycode, getreservationdate);
        } else {
            getCode getcode = getCurrencyCode.f;
            if (getcurrencycode != null) {
                c(getcode, getcurrencycode);
                t = e(getreservationdate, false);
            } else {
                throw new NullPointerException("Argument must not be null");
            }
        }
        t.h = true;
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private T e(getReservationDate<Bitmap> getreservationdate, boolean z) {
        setBusinessField<T> setbusinessfield = this;
        while (setbusinessfield.i) {
            setbusinessfield = setbusinessfield.clone();
        }
        GetBranchROResponse getBranchROResponse = new GetBranchROResponse(getreservationdate, z);
        setbusinessfield.b(Bitmap.class, getreservationdate, z);
        setbusinessfield.b(Drawable.class, getBranchROResponse, z);
        setbusinessfield.b(BitmapDrawable.class, getBranchROResponse, z);
        setbusinessfield.b(getProvince.class, new getRegularKiosk(getreservationdate), z);
        if (!setbusinessfield.f) {
            return setbusinessfield;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: a */
    public T clone() {
        try {
            T t = (T) ((setBusinessField) clone());
            CategoryResponse categoryResponse = new CategoryResponse();
            t.n = categoryResponse;
            categoryResponse.c.e((setCollapseIcon<? extends getCode<?>, ? extends Object>) this.n.c);
            getReceiverStatesName getreceiverstatesname = new getReceiverStatesName();
            t.p = getreceiverstatesname;
            getreceiverstatesname.putAll(this.p);
            t.f = false;
            t.i = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final T a(getCurrencyCode getcurrencycode, getReservationDate<Bitmap> getreservationdate) {
        setBusinessField<T> setbusinessfield = this;
        while (setbusinessfield.i) {
            setbusinessfield = setbusinessfield.clone();
        }
        setbusinessfield.c(getcurrencycode);
        return setbusinessfield.e(getreservationdate, true);
    }

    public final T a(boolean z) {
        setBusinessField<T> setbusinessfield = this;
        while (setbusinessfield.i) {
            setbusinessfield = setbusinessfield.clone();
        }
        setbusinessfield.y = z;
        setbusinessfield.a |= 1048576;
        if (!setbusinessfield.f) {
            return setbusinessfield;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public final int b() {
        return this.u;
    }

    public final T b(getReservationDate<Bitmap> getreservationdate) {
        return e(getreservationdate, true);
    }

    public final T c(float f) {
        setBusinessField<T> setbusinessfield = this;
        while (setbusinessfield.i) {
            setbusinessfield = setbusinessfield.clone();
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        setbusinessfield.q = f;
        setbusinessfield.a |= 2;
        if (!setbusinessfield.f) {
            return setbusinessfield;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public T c(setBusinessField<?> setbusinessfield) {
        if (this.i) {
            return (T) clone().c(setbusinessfield);
        }
        if ((setbusinessfield.a & 2) != 0) {
            this.q = setbusinessfield.q;
        }
        if ((setbusinessfield.a & 262144) != 0) {
            this.x = setbusinessfield.x;
        }
        if ((setbusinessfield.a & 1048576) != 0) {
            this.y = setbusinessfield.y;
        }
        if ((setbusinessfield.a & 4) != 0) {
            this.b = setbusinessfield.b;
        }
        if ((setbusinessfield.a & 8) != 0) {
            this.D = setbusinessfield.D;
        }
        if ((setbusinessfield.a & 16) != 0) {
            this.d = setbusinessfield.d;
            this.c = 0;
            this.a &= -33;
        }
        if ((setbusinessfield.a & 32) != 0) {
            this.c = setbusinessfield.c;
            this.d = null;
            this.a &= -17;
        }
        if ((setbusinessfield.a & 64) != 0) {
            this.m = setbusinessfield.m;
            this.k = 0;
            this.a &= -129;
        }
        if ((setbusinessfield.a & Property.TYPE_ARRAY) != 0) {
            this.k = setbusinessfield.k;
            this.m = null;
            this.a &= -65;
        }
        if ((setbusinessfield.a & Property.TYPE_SET) != 0) {
            this.j = setbusinessfield.j;
        }
        if ((setbusinessfield.a & Property.TYPE_DICTIONARY) != 0) {
            this.u = setbusinessfield.u;
            this.w = setbusinessfield.w;
        }
        if ((setbusinessfield.a & 1024) != 0) {
            this.r = setbusinessfield.r;
        }
        if ((setbusinessfield.a & 4096) != 0) {
            this.t = setbusinessfield.t;
        }
        if ((setbusinessfield.a & 8192) != 0) {
            this.e = setbusinessfield.e;
            this.g = 0;
            this.a &= -16385;
        }
        if ((setbusinessfield.a & 16384) != 0) {
            this.g = setbusinessfield.g;
            this.e = null;
            this.a &= -8193;
        }
        if ((setbusinessfield.a & 32768) != 0) {
            this.s = setbusinessfield.s;
        }
        if ((setbusinessfield.a & 65536) != 0) {
            this.v = setbusinessfield.v;
        }
        if ((setbusinessfield.a & 131072) != 0) {
            this.f201o = setbusinessfield.f201o;
        }
        if ((setbusinessfield.a & 2048) != 0) {
            this.p.putAll(setbusinessfield.p);
            this.h = setbusinessfield.h;
        }
        if ((setbusinessfield.a & 524288) != 0) {
            this.l = setbusinessfield.l;
        }
        if (!this.v) {
            this.p.clear();
            int i = this.a;
            this.f201o = false;
            this.a = i & -2049 & -131073;
            this.h = true;
        }
        this.a |= setbusinessfield.a;
        this.n.c.e((setCollapseIcon<? extends getCode<?>, ? extends Object>) setbusinessfield.n.c);
        if (!this.f) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public final T c(setCode setcode) {
        setBusinessField<T> setbusinessfield = this;
        while (setbusinessfield.i) {
            setbusinessfield = setbusinessfield.clone();
        }
        if (setcode != null) {
            setbusinessfield.r = setcode;
            setbusinessfield.a |= 1024;
            if (!setbusinessfield.f) {
                return setbusinessfield;
            }
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        throw new NullPointerException("Argument must not be null");
    }

    protected final boolean c() {
        return this.i;
    }

    public final T d(boolean z) {
        setBusinessField<T> setbusinessfield = this;
        while (setbusinessfield.i) {
            setbusinessfield = setbusinessfield.clone();
        }
        setbusinessfield.j = false;
        setbusinessfield.a |= Property.TYPE_SET;
        if (!setbusinessfield.f) {
            return setbusinessfield;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public final setCategories d() {
        return this.D;
    }

    public final int e() {
        return this.w;
    }

    public final T e(int i, int i2) {
        setBusinessField<T> setbusinessfield = this;
        while (setbusinessfield.i) {
            setbusinessfield = setbusinessfield.clone();
        }
        setbusinessfield.u = i;
        setbusinessfield.w = i2;
        setbusinessfield.a |= Property.TYPE_DICTIONARY;
        if (!setbusinessfield.f) {
            return setbusinessfield;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public final T e(Class<?> cls) {
        setBusinessField<T> setbusinessfield = this;
        while (setbusinessfield.i) {
            setbusinessfield = setbusinessfield.clone();
        }
        if (cls != null) {
            setbusinessfield.t = cls;
            setbusinessfield.a |= 4096;
            if (!setbusinessfield.f) {
                return setbusinessfield;
            }
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final T e(DaftarTransferResponse daftarTransferResponse) {
        setBusinessField<T> setbusinessfield = this;
        while (setbusinessfield.i) {
            setbusinessfield = setbusinessfield.clone();
        }
        if (daftarTransferResponse != null) {
            setbusinessfield.b = daftarTransferResponse;
            setbusinessfield.a |= 4;
            if (!setbusinessfield.f) {
                return setbusinessfield;
            }
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final T e(setCategories setcategories) {
        setBusinessField<T> setbusinessfield = this;
        while (setbusinessfield.i) {
            setbusinessfield = setbusinessfield.clone();
        }
        if (setcategories != null) {
            setbusinessfield.D = setcategories;
            setbusinessfield.a |= 8;
            if (!setbusinessfield.f) {
                return setbusinessfield;
            }
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof setBusinessField) {
            setBusinessField setbusinessfield = (setBusinessField) obj;
            z = false;
            if (Float.compare(setbusinessfield.q, this.q) == 0) {
                z = false;
                if (this.c == setbusinessfield.c) {
                    z = false;
                    if (getTxnNotes2.a(this.d, setbusinessfield.d)) {
                        z = false;
                        if (this.k == setbusinessfield.k) {
                            z = false;
                            if (getTxnNotes2.a(this.m, setbusinessfield.m)) {
                                z = false;
                                if (this.g == setbusinessfield.g) {
                                    z = false;
                                    if (getTxnNotes2.a(this.e, setbusinessfield.e)) {
                                        z = false;
                                        if (this.j == setbusinessfield.j) {
                                            z = false;
                                            if (this.w == setbusinessfield.w) {
                                                z = false;
                                                if (this.u == setbusinessfield.u) {
                                                    z = false;
                                                    if (this.f201o == setbusinessfield.f201o) {
                                                        z = false;
                                                        if (this.v == setbusinessfield.v) {
                                                            z = false;
                                                            if (this.x == setbusinessfield.x) {
                                                                z = false;
                                                                if (this.l == setbusinessfield.l) {
                                                                    z = false;
                                                                    if (this.b.equals(setbusinessfield.b)) {
                                                                        z = false;
                                                                        if (this.D == setbusinessfield.D) {
                                                                            z = false;
                                                                            if (this.n.equals(setbusinessfield.n)) {
                                                                                z = false;
                                                                                if (this.p.equals(setbusinessfield.p)) {
                                                                                    z = false;
                                                                                    if (this.t.equals(setbusinessfield.t)) {
                                                                                        z = false;
                                                                                        if (getTxnNotes2.a(this.r, setbusinessfield.r)) {
                                                                                            z = false;
                                                                                            if (getTxnNotes2.a(this.s, setbusinessfield.s)) {
                                                                                                z = true;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    public final boolean f() {
        return this.v;
    }

    public final boolean g() {
        return (this.a & 8) != 0;
    }

    public final boolean h() {
        return this.j;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return getTxnNotes2.a(this.s, getTxnNotes2.a(this.r, getTxnNotes2.a(this.t, getTxnNotes2.a(this.p, getTxnNotes2.a(this.n, getTxnNotes2.a(this.D, getTxnNotes2.a(this.b, getTxnNotes2.d(this.l, getTxnNotes2.d(this.x, getTxnNotes2.d(this.v, getTxnNotes2.d(this.f201o, getTxnNotes2.b(this.u, getTxnNotes2.b(this.w, getTxnNotes2.d(this.j, getTxnNotes2.a(this.e, getTxnNotes2.b(this.g, getTxnNotes2.a(this.m, getTxnNotes2.b(this.k, getTxnNotes2.a(this.d, getTxnNotes2.b(this.c, getTxnNotes2.a(this.q)))))))))))))))))))));
    }

    public final boolean i() {
        return (this.a & 2048) != 0;
    }

    public final boolean j() {
        return getTxnNotes2.d(this.u, this.w);
    }

    public final T k() {
        return e(getCurrencyCode.a, new GetAcctOpeningCategoryDataResponse$Languange$$Parcelable() { // from class: o.GetBankSpecialRelationResponse$$Parcelable
            private static final byte[] a = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(e);

            @Override // o.GetAcctOpeningCategoryDataResponse$Languange$$Parcelable
            protected final Bitmap d(setValueArray setvaluearray, Bitmap bitmap, int i, int i2) {
                return getBranchType.b(setvaluearray, bitmap, i, i2);
            }

            @Override // o.setCode
            public final void e(MessageDigest messageDigest) {
                messageDigest.update(a);
            }

            @Override // o.setCode
            public final boolean equals(Object obj) {
                return obj instanceof GetBankSpecialRelationResponse$$Parcelable;
            }

            @Override // o.setCode
            public final int hashCode() {
                return -670243078;
            }
        });
    }

    public final T m() {
        return e(getCurrencyCode.g, new setRelationCode());
    }

    public final T n() {
        getCurrencyCode getcurrencycode = getCurrencyCode.d;
        getRelationCode getrelationcode = new getRelationCode();
        if (this.i) {
            return (T) clone().b(getcurrencycode, getrelationcode);
        }
        c(getcurrencycode);
        return e((getReservationDate<Bitmap>) getrelationcode, false);
    }

    protected final T o() {
        if (!this.f) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }
}
