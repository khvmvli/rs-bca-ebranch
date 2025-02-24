package o;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;
import o.getSavedStateRegistry;
import o.getSharedElementEnterTransition;
/* loaded from: classes-dex2jar.jar:o/getSharedElementEnterTransition.class */
public abstract class getSharedElementEnterTransition<T extends getSharedElementEnterTransition<T>> implements getSavedStateRegistry.write {
    final Object s;
    final getSharedElementReturnTransition t;
    private float u;
    public static final RemoteActionCompatParcelizer h = new RemoteActionCompatParcelizer("translationX") { // from class: o.getSharedElementEnterTransition.2
        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ void c(View view, float f2) {
            view.setTranslationX(f2);
        }

        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ float e(View view) {
            return view.getTranslationX();
        }
    };
    public static final RemoteActionCompatParcelizer f = new RemoteActionCompatParcelizer("translationY") { // from class: o.getSharedElementEnterTransition.8
        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ void c(View view, float f2) {
            view.setTranslationY(f2);
        }

        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ float e(View view) {
            return view.getTranslationY();
        }
    };
    public static final RemoteActionCompatParcelizer n = new RemoteActionCompatParcelizer("translationZ") { // from class: o.getSharedElementEnterTransition.10
        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ void c(View view, float f2) {
            findFragmentByWho.e(view, f2);
        }

        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ float e(View view) {
            return findFragmentByWho.x(view);
        }
    };
    public static final RemoteActionCompatParcelizer c = new RemoteActionCompatParcelizer("scaleX") { // from class: o.getSharedElementEnterTransition.6
        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ void c(View view, float f2) {
            view.setScaleX(f2);
        }

        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ float e(View view) {
            return view.getScaleX();
        }
    };
    public static final RemoteActionCompatParcelizer j = new RemoteActionCompatParcelizer("scaleY") { // from class: o.getSharedElementEnterTransition.9
        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ void c(View view, float f2) {
            view.setScaleY(f2);
        }

        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ float e(View view) {
            return view.getScaleY();
        }
    };
    public static final RemoteActionCompatParcelizer d = new RemoteActionCompatParcelizer("rotation") { // from class: o.getSharedElementEnterTransition.12
        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ void c(View view, float f2) {
            view.setRotation(f2);
        }

        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ float e(View view) {
            return view.getRotation();
        }
    };
    public static final RemoteActionCompatParcelizer b = new RemoteActionCompatParcelizer("rotationX") { // from class: o.getSharedElementEnterTransition.15
        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ void c(View view, float f2) {
            view.setRotationX(f2);
        }

        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ float e(View view) {
            return view.getRotationX();
        }
    };
    public static final RemoteActionCompatParcelizer a = new RemoteActionCompatParcelizer("rotationY") { // from class: o.getSharedElementEnterTransition.14
        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ void c(View view, float f2) {
            view.setRotationY(f2);
        }

        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ float e(View view) {
            return view.getRotationY();
        }
    };

    /* renamed from: o */
    public static final RemoteActionCompatParcelizer f157o = new RemoteActionCompatParcelizer("x") { // from class: o.getSharedElementEnterTransition.11
        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ void c(View view, float f2) {
            view.setX(f2);
        }

        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ float e(View view) {
            return view.getX();
        }
    };
    public static final RemoteActionCompatParcelizer k = new RemoteActionCompatParcelizer("y") { // from class: o.getSharedElementEnterTransition.3
        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ void c(View view, float f2) {
            view.setY(f2);
        }

        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ float e(View view) {
            return view.getY();
        }
    };
    public static final RemoteActionCompatParcelizer l = new RemoteActionCompatParcelizer("z") { // from class: o.getSharedElementEnterTransition.5
        @Override // o.getSharedElementReturnTransition
        public final /* bridge */ /* synthetic */ void c(View view, float f2) {
            findFragmentByWho.c(view, f2);
        }

        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ float e(View view) {
            return findFragmentByWho.B(view);
        }
    };
    public static final RemoteActionCompatParcelizer e = new RemoteActionCompatParcelizer("alpha") { // from class: o.getSharedElementEnterTransition.4
        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ void c(View view, float f2) {
            view.setAlpha(f2);
        }

        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ float e(View view) {
            return view.getAlpha();
        }
    };
    public static final RemoteActionCompatParcelizer i = new RemoteActionCompatParcelizer("scrollX") { // from class: o.getSharedElementEnterTransition.1
        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ void c(View view, float f2) {
            view.setScrollX((int) f2);
        }

        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ float e(View view) {
            return (float) view.getScrollX();
        }
    };
    public static final RemoteActionCompatParcelizer g = new RemoteActionCompatParcelizer("scrollY") { // from class: o.getSharedElementEnterTransition.7
        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ void c(View view, float f2) {
            view.setScrollY((int) f2);
        }

        @Override // o.getSharedElementReturnTransition
        public final /* synthetic */ float e(View view) {
            return (float) view.getScrollY();
        }
    };
    float v = 0.0f;
    public float x = Float.MAX_VALUE;
    public boolean r = false;
    boolean p = false;
    float m = Float.MAX_VALUE;
    float q = -3.4028235E38f;
    private long y = 0;
    private final ArrayList<Object> w = new ArrayList<>();
    private final ArrayList<Object> A = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getSharedElementEnterTransition$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        float d;
        float e;
    }

    /* loaded from: classes-dex2jar.jar:o/getSharedElementEnterTransition$RemoteActionCompatParcelizer.class */
    public static abstract class RemoteActionCompatParcelizer extends getSharedElementReturnTransition<View> {
        private RemoteActionCompatParcelizer(String str) {
            super(str);
        }

        /* synthetic */ RemoteActionCompatParcelizer(String str, byte b) {
            this(str);
        }
    }

    public <K> getSharedElementEnterTransition(K k2, getSharedElementReturnTransition<K> getsharedelementreturntransition) {
        this.s = k2;
        this.t = getsharedelementreturntransition;
        if (getsharedelementreturntransition == d || getsharedelementreturntransition == b || getsharedelementreturntransition == a) {
            this.u = 0.1f;
        } else if (getsharedelementreturntransition == e) {
            this.u = 0.00390625f;
        } else if (getsharedelementreturntransition == c || getsharedelementreturntransition == j) {
            this.u = 0.00390625f;
        } else {
            this.u = 1.0f;
        }
    }

    private void a(float f2) {
        this.t.c(this.s, f2);
        for (int i2 = 0; i2 < this.A.size(); i2++) {
            if (this.A.get(i2) != null) {
                this.A.get(i2);
            }
        }
        c(this.A);
    }

    private void a(boolean z) {
        this.p = false;
        getSavedStateRegistry c2 = getSavedStateRegistry.c();
        c2.c.remove(this);
        int indexOf = c2.e.indexOf(this);
        if (indexOf >= 0) {
            c2.e.set(indexOf, null);
            c2.h = true;
        }
        this.y = 0;
        this.r = false;
        for (int i2 = 0; i2 < this.w.size(); i2++) {
            if (this.w.get(i2) != null) {
                this.w.get(i2);
            }
        }
        c(this.w);
    }

    private static <T> void c(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            boolean z = this.p;
            if (!z && !z) {
                this.p = true;
                if (!this.r) {
                    this.x = this.t.e(this.s);
                }
                float f2 = this.x;
                if (f2 > this.m || f2 < this.q) {
                    throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                }
                getSavedStateRegistry c2 = getSavedStateRegistry.c();
                if (c2.e.size() == 0) {
                    if (c2.f == null) {
                        c2.f = new getSavedStateRegistry$MediaBrowserCompat$CustomActionResultReceiver(c2.d);
                    }
                    c2.f.d();
                }
                if (!c2.e.contains(this)) {
                    c2.e.add(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    final float b() {
        return this.u * 0.75f;
    }

    abstract boolean c(long j2);

    public final void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.p) {
            a(true);
        }
    }

    @Override // o.getSavedStateRegistry.write
    public final boolean e(long j2) {
        long j3 = this.y;
        if (j3 == 0) {
            this.y = j2;
            a(this.x);
            return false;
        }
        this.y = j2;
        boolean c2 = c(j2 - j3);
        float min = Math.min(this.x, this.m);
        this.x = min;
        float max = Math.max(min, this.q);
        this.x = max;
        a(max);
        if (c2) {
            a(false);
        }
        return c2;
    }
}
