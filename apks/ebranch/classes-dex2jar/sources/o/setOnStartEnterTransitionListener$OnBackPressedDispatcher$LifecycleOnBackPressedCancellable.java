package o;

import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable.class */
public abstract class setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
    private static final List<Object> t = Collections.emptyList();
    public final View b;
    public int c;
    setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<? extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> d;
    WeakReference<setOnStartEnterTransitionListener> f;
    public setOnStartEnterTransitionListener h;
    public int k = -1;
    int i = -1;
    public long e = -1;
    int g = -1;
    public int m = -1;

    /* renamed from: o */
    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable f256o = null;
    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable s = null;
    List<Object> j = null;
    List<Object> p = null;
    private int q = 0;
    setOnStartEnterTransitionListener$ComponentActivity$3 n = null;
    boolean a = false;
    int r = 0;
    int l = -1;

    public setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(View view) {
        if (view != null) {
            this.b = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i, boolean z) {
        if (this.i == -1) {
            this.i = this.k;
        }
        if (this.m == -1) {
            this.m = this.k;
        }
        if (z) {
            this.m += i;
        }
        this.k += i;
        if (this.b.getLayoutParams() != null) {
            ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) this.b.getLayoutParams()).d = true;
        }
    }

    public final boolean a() {
        return (this.b.getParent() == null || this.b.getParent() == this.h) ? false : true;
    }

    public final List<Object> b() {
        if ((this.c & 1024) != 0) {
            return t;
        }
        List<Object> list = this.j;
        return (list == null || list.size() == 0) ? t : this.p;
    }

    public final int c() {
        setOnStartEnterTransitionListener setonstartentertransitionlistener;
        setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<? extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver;
        int e;
        if (this.d == null || (setonstartentertransitionlistener = this.h) == null || (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver = setonstartentertransitionlistener.g) == null || (e = this.h.e(this)) == -1 || this.d != setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver) {
            return -1;
        }
        return e;
    }

    public final void c(boolean z) {
        int i = this.q;
        int i2 = z ? i - 1 : i + 1;
        this.q = i2;
        if (i2 < 0) {
            this.q = 0;
            StringBuilder sb = new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
            sb.append(this);
            Log.e("View", sb.toString());
        } else if (!z && i2 == 1) {
            this.c |= 16;
        } else if (z && i2 == 0) {
            this.c &= -17;
        }
    }

    @Deprecated
    public final int d() {
        return c();
    }

    public final int e() {
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.h;
        if (setonstartentertransitionlistener == null) {
            return -1;
        }
        return setonstartentertransitionlistener.e(this);
    }

    public final void e(Object obj) {
        if (obj == null) {
            this.c |= 1024;
        } else if ((this.c & 1024) == 0) {
            if (this.j == null) {
                ArrayList arrayList = new ArrayList();
                this.j = arrayList;
                this.p = Collections.unmodifiableList(arrayList);
            }
            this.j.add(obj);
        }
    }

    public final void i() {
        this.c = 0;
        this.k = -1;
        this.i = -1;
        this.e = -1;
        this.m = -1;
        this.q = 0;
        this.f256o = null;
        this.s = null;
        List<Object> list = this.j;
        if (list != null) {
            list.clear();
        }
        this.c &= -1025;
        this.r = 0;
        this.l = -1;
        setOnStartEnterTransitionListener.b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fc  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 527
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable.toString():java.lang.String");
    }
}
