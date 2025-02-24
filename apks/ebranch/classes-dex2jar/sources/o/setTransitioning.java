package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setTransitioning.class */
public class setTransitioning extends Drawable implements Drawable.Callback {
    private RemoteActionCompatParcelizer b;
    private Runnable c;
    private Drawable d;
    private boolean f;
    private long g;
    private IconCompatParcelizer h;
    private long i;
    private Rect j;
    private Drawable n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f282o;
    private int e = 255;
    private int a = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setTransitioning$IconCompatParcelizer.class */
    public static abstract class IconCompatParcelizer extends Drawable.ConstantState {
        int A;
        boolean B;
        boolean C;
        boolean D;
        final setTransitioning E;
        ColorStateList F;
        Resources G;
        boolean H;
        int I;
        PorterDuff.Mode J;
        boolean L;
        boolean a;
        int c;
        boolean e;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        int k;
        int l;
        int m;
        ColorFilter n;

        /* renamed from: o  reason: collision with root package name */
        int f283o;
        int p;
        int q;
        boolean r;
        Rect s;
        boolean t;
        boolean u;
        SparseArray<Drawable.ConstantState> v;
        int w;
        Drawable[] x;
        int y;
        int z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, setTransitioning settransitioning, Resources resources) {
            this.L = false;
            this.r = false;
            this.t = true;
            this.y = 0;
            this.w = 0;
            this.E = settransitioning;
            Rect rect = null;
            this.G = resources != null ? resources : iconCompatParcelizer != null ? iconCompatParcelizer.G : null;
            int b = setTransitioning.b(resources, iconCompatParcelizer != null ? iconCompatParcelizer.p : 0);
            this.p = b;
            if (iconCompatParcelizer != null) {
                this.c = iconCompatParcelizer.c;
                this.k = iconCompatParcelizer.k;
                this.f = true;
                this.e = true;
                this.L = iconCompatParcelizer.L;
                this.r = iconCompatParcelizer.r;
                this.t = iconCompatParcelizer.t;
                this.D = iconCompatParcelizer.D;
                this.A = iconCompatParcelizer.A;
                this.y = iconCompatParcelizer.y;
                this.w = iconCompatParcelizer.w;
                this.a = iconCompatParcelizer.a;
                this.n = iconCompatParcelizer.n;
                this.u = iconCompatParcelizer.u;
                this.F = iconCompatParcelizer.F;
                this.J = iconCompatParcelizer.J;
                this.C = iconCompatParcelizer.C;
                this.B = iconCompatParcelizer.B;
                if (iconCompatParcelizer.p == b) {
                    if (iconCompatParcelizer.j) {
                        this.s = iconCompatParcelizer.s != null ? new Rect(iconCompatParcelizer.s) : rect;
                        this.j = true;
                    }
                    if (iconCompatParcelizer.h) {
                        this.q = iconCompatParcelizer.q;
                        this.l = iconCompatParcelizer.l;
                        this.m = iconCompatParcelizer.m;
                        this.f283o = iconCompatParcelizer.f283o;
                        this.h = true;
                    }
                }
                if (iconCompatParcelizer.i) {
                    this.I = iconCompatParcelizer.I;
                    this.i = true;
                }
                if (iconCompatParcelizer.g) {
                    this.H = iconCompatParcelizer.H;
                    this.g = true;
                }
                Drawable[] drawableArr = iconCompatParcelizer.x;
                this.x = new Drawable[drawableArr.length];
                this.z = iconCompatParcelizer.z;
                SparseArray<Drawable.ConstantState> sparseArray = iconCompatParcelizer.v;
                if (sparseArray != null) {
                    this.v = sparseArray.clone();
                } else {
                    this.v = new SparseArray<>(this.z);
                }
                int i = this.z;
                for (int i2 = 0; i2 < i; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.v.put(i2, constantState);
                        } else {
                            this.x[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.x = new Drawable[10];
            this.z = 0;
        }

        private Drawable b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                getInsetsForType.c(drawable, this.A);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.E);
            return mutate;
        }

        private void o() {
            SparseArray<Drawable.ConstantState> sparseArray = this.v;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.x[this.v.keyAt(i)] = b(this.v.valueAt(i).newDrawable(this.G));
                }
                this.v = null;
            }
        }

        public final int a() {
            return this.z;
        }

        public final int a(Drawable drawable) {
            int i = this.z;
            if (i >= this.x.length) {
                b(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.E);
            this.x[i] = drawable;
            this.z++;
            this.k = drawable.getChangingConfigurations() | this.k;
            n();
            this.s = null;
            this.j = false;
            this.h = false;
            this.f = false;
            return i;
        }

        public final void a(boolean z) {
            this.L = z;
        }

        final boolean a(int i, int i2) {
            int i3 = this.z;
            Drawable[] drawableArr = this.x;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                z = z;
                if (drawableArr[i4] != null) {
                    z = Build.VERSION.SDK_INT >= 23 ? getInsetsForType.c(drawableArr[i4], i) : false;
                    z = z;
                    if (i4 == i2) {
                    }
                }
            }
            this.A = i;
            return z;
        }

        final int b() {
            return this.x.length;
        }

        public final void b(int i) {
            this.w = i;
        }

        public void b(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.x;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.x = drawableArr;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                o();
                int i = this.z;
                Drawable[] drawableArr = this.x;
                for (int i2 = 0; i2 < i; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null && getInsetsForType.b(drawable)) {
                        getInsetsForType.c(drawableArr[i2], theme);
                        this.k |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                d(setTransitioning$MediaBrowserCompat$CustomActionResultReceiver.c(theme));
            }
        }

        public final void b(boolean z) {
            this.r = z;
        }

        protected void c() {
            this.h = true;
            o();
            int i = this.z;
            Drawable[] drawableArr = this.x;
            this.l = -1;
            this.q = -1;
            this.f283o = 0;
            this.m = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.q) {
                    this.q = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.l) {
                    this.l = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.m) {
                    this.m = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f283o) {
                    this.f283o = minimumHeight;
                }
            }
        }

        public final void c(int i) {
            this.y = i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.z;
            Drawable[] drawableArr = this.x;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.v.get(i2);
                    if (constantState != null && setTransitioning$MediaBrowserCompat$CustomActionResultReceiver.d(constantState)) {
                        return true;
                    }
                } else if (getInsetsForType.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        void d() {
            int i = this.z;
            Drawable[] drawableArr = this.x;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.D = true;
        }

        final void d(Resources resources) {
            if (resources != null) {
                this.G = resources;
                int b = setTransitioning.b(resources, this.p);
                int i = this.p;
                this.p = b;
                if (i != b) {
                    this.h = false;
                    this.j = false;
                }
            }
        }

        public final Drawable e(int i) {
            int indexOfKey;
            Drawable drawable = this.x[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.v;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable b = b(this.v.valueAt(indexOfKey).newDrawable(this.G));
            this.x[i] = b;
            this.v.removeAt(indexOfKey);
            if (this.v.size() == 0) {
                this.v = null;
            }
            return b;
        }

        public boolean e() {
            if (this.f) {
                return this.e;
            }
            o();
            this.f = true;
            int i = this.z;
            Drawable[] drawableArr = this.x;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.e = false;
                    return false;
                }
            }
            this.e = true;
            return true;
        }

        public final int f() {
            if (!this.h) {
                c();
            }
            return this.q;
        }

        public final int g() {
            if (!this.h) {
                c();
            }
            return this.m;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.c | this.k;
        }

        public final int h() {
            if (!this.h) {
                c();
            }
            return this.l;
        }

        public final int i() {
            if (!this.h) {
                c();
            }
            return this.f283o;
        }

        public final Rect j() {
            Rect rect = null;
            if (this.L) {
                return null;
            }
            Rect rect2 = this.s;
            if (rect2 != null || this.j) {
                return rect2;
            }
            o();
            Rect rect3 = new Rect();
            int i = this.z;
            Drawable[] drawableArr = this.x;
            for (int i2 = 0; i2 < i; i2++) {
                rect = rect;
                if (drawableArr[i2].getPadding(rect3)) {
                    Rect rect4 = rect;
                    if (rect == null) {
                        rect4 = new Rect(0, 0, 0, 0);
                    }
                    if (rect3.left > rect4.left) {
                        rect4.left = rect3.left;
                    }
                    if (rect3.top > rect4.top) {
                        rect4.top = rect3.top;
                    }
                    if (rect3.right > rect4.right) {
                        rect4.right = rect3.right;
                    }
                    rect = rect4;
                    if (rect3.bottom > rect4.bottom) {
                        rect4.bottom = rect3.bottom;
                        rect = rect4;
                    }
                }
            }
            this.j = true;
            this.s = rect;
            return rect;
        }

        public final boolean k() {
            if (this.g) {
                return this.H;
            }
            o();
            int i = this.z;
            Drawable[] drawableArr = this.x;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.H = z;
            this.g = true;
            return z;
        }

        public final int l() {
            if (this.i) {
                return this.I;
            }
            o();
            int i = this.z;
            Drawable[] drawableArr = this.x;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.I = opacity;
            this.i = true;
            return opacity;
        }

        public final boolean m() {
            return this.r;
        }

        void n() {
            this.i = false;
            this.g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setTransitioning$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements Drawable.Callback {
        Drawable.Callback c;

        RemoteActionCompatParcelizer() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.c;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.c;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    private void a(Drawable drawable) {
        if (this.b == null) {
            this.b = new RemoteActionCompatParcelizer();
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.b;
        remoteActionCompatParcelizer.c = drawable.getCallback();
        drawable.setCallback(remoteActionCompatParcelizer);
        try {
            if (this.h.y <= 0 && this.f) {
                drawable.setAlpha(this.e);
            }
            if (this.h.u) {
                drawable.setColorFilter(this.h.n);
            } else {
                if (this.h.C) {
                    getInsetsForType.e(drawable, this.h.F);
                }
                if (this.h.B) {
                    getInsetsForType.d(drawable, this.h.J);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.h.t);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                getInsetsForType.c(drawable, getInsetsForType.c(this));
            }
            getInsetsForType.d(drawable, this.h.a);
            Rect rect = this.j;
            if (rect != null) {
                getInsetsForType.c(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.b;
            Drawable.Callback callback = remoteActionCompatParcelizer2.c;
            remoteActionCompatParcelizer2.c = null;
            drawable.setCallback(callback);
        }
    }

    static int b(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        int i2 = i;
        if (i == 0) {
            i2 = 160;
        }
        return i2;
    }

    private boolean d() {
        boolean z = true;
        if (!isAutoMirrored() || getInsetsForType.c(this) != 1) {
            z = false;
        }
        return z;
    }

    int a() {
        return this.a;
    }

    final void a(Resources resources) {
        this.h.d(resources);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    void a(boolean r8) {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTransitioning.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.h.b(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.h.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    IconCompatParcelizer e() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(IconCompatParcelizer iconCompatParcelizer) {
        this.h = iconCompatParcelizer;
        int i = this.a;
        if (i >= 0) {
            Drawable e = iconCompatParcelizer.e(i);
            this.d = e;
            if (e != null) {
                a(e);
            }
        }
        this.n = null;
    }

    boolean e(int i) {
        if (i == this.a) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.h.w > 0) {
            Drawable drawable = this.n;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.d;
            if (drawable2 != null) {
                this.n = drawable2;
                this.g = ((long) this.h.w) + uptimeMillis;
            } else {
                this.n = null;
                this.g = 0;
            }
        } else {
            Drawable drawable3 = this.d;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i < 0 || i >= this.h.z) {
            this.d = null;
            this.a = -1;
        } else {
            Drawable e = this.h.e(i);
            this.d = e;
            this.a = i;
            if (e != null) {
                if (this.h.y > 0) {
                    this.i = uptimeMillis + ((long) this.h.y);
                }
                a(e);
            }
        }
        if (!(this.i == 0 && this.g == 0)) {
            Runnable runnable = this.c;
            if (runnable == null) {
                this.c = new Runnable() { // from class: o.setTransitioning.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        setTransitioning.this.a(true);
                        setTransitioning.this.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(runnable);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return getChangingConfigurations() | this.h.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.h.e()) {
            return null;
        }
        this.h.c = getChangingConfigurations();
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.j;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.h.m()) {
            return this.h.h();
        }
        Drawable drawable = this.d;
        return drawable != null ? drawable.getIntrinsicHeight() : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.h.m()) {
            return this.h.f();
        }
        Drawable drawable = this.d;
        return drawable != null ? drawable.getIntrinsicWidth() : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.h.m()) {
            return this.h.i();
        }
        Drawable drawable = this.d;
        return drawable != null ? drawable.getMinimumHeight() : 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.h.m()) {
            return this.h.g();
        }
        Drawable drawable = this.d;
        return drawable != null ? drawable.getMinimumWidth() : 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.d;
        return (drawable == null || !drawable.isVisible()) ? -2 : this.h.l();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.d;
        if (drawable != null) {
            setTransitioning$MediaBrowserCompat$CustomActionResultReceiver.a(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean z;
        Rect j = this.h.j();
        if (j != null) {
            rect.set(j);
            z = (j.right | ((j.left | j.top) | j.bottom)) != 0;
        } else {
            Drawable drawable = this.d;
            z = drawable != null ? drawable.getPadding(rect) : getPadding(rect);
        }
        if (d()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        IconCompatParcelizer iconCompatParcelizer = this.h;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.n();
        }
        if (drawable == this.d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.h.a;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.h.k();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.n;
        boolean z = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.n = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f) {
                this.d.setAlpha(this.e);
            }
        }
        if (this.g != 0) {
            this.g = 0;
            z = true;
        }
        if (this.i != 0) {
            this.i = 0;
        }
        if (z) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f282o && mutate() == this) {
            IconCompatParcelizer e = e();
            e.d();
            e(e);
            this.f282o = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.h.a(i, a());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.n;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.n;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (!this.f || this.e != i) {
            this.f = true;
            this.e = i;
            Drawable drawable = this.d;
            if (drawable == null) {
                return;
            }
            if (this.i == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.h.a != z) {
            this.h.a = z;
            Drawable drawable = this.d;
            if (drawable != null) {
                getInsetsForType.d(drawable, this.h.a);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.h.u = true;
        if (this.h.n != colorFilter) {
            this.h.n = colorFilter;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        if (this.h.t != z) {
            this.h.t = z;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setDither(this.h.t);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.d;
        if (drawable != null) {
            getInsetsForType.d(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.j;
        if (rect == null) {
            this.j = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            getInsetsForType.c(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.h.C = true;
        if (this.h.F != colorStateList) {
            this.h.F = colorStateList;
            getInsetsForType.e(this.d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.h.B = true;
        if (this.h.J != mode) {
            this.h.J = mode;
            getInsetsForType.d(this.d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = setVisible(z, z2);
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
