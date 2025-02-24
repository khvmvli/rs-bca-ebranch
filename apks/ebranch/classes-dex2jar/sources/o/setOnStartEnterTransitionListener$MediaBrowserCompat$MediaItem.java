package o;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.class */
public abstract class setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem {
    read g = null;
    private ArrayList<Object> e = new ArrayList<>();
    long h = 120;
    private long a = 120;
    long l = 250;
    long f = 250;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem$read.class */
    public interface read {
        void a(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
    }

    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem$write.class */
    public static final class write {
        public int a;
        public int c;
        public int d;
        public int e;

        public final write d(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
            View view = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b;
            this.e = view.getLeft();
            this.c = view.getTop();
            this.a = view.getRight();
            this.d = view.getBottom();
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        int i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & 14;
        if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & 4) != 0) {
            return 4;
        }
        int i2 = i;
        if ((i & 4) == 0) {
            int i3 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.i;
            setOnStartEnterTransitionListener setonstartentertransitionlistener = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.h;
            int e = setonstartentertransitionlistener == null ? -1 : setonstartentertransitionlistener.e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
            i2 = i;
            if (i3 != -1) {
                i2 = i;
                if (e != -1) {
                    i2 = i;
                    if (i3 != e) {
                        i2 = i | 2048;
                    }
                }
            }
        }
        return i2;
    }

    public static write g() {
        return new write();
    }

    public final void a() {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            this.e.get(i);
        }
        this.e.clear();
    }

    public abstract boolean b();

    public abstract void c();

    public boolean c(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        return true;
    }

    public boolean c(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, List<Object> list) {
        return c(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
    }

    public abstract boolean c(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, write write2, write write3);

    public abstract boolean c(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2, write write2, write write3);

    public final long d() {
        return this.f;
    }

    public abstract void d(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);

    public abstract boolean d(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, write write2, write write3);

    public abstract void e();

    public abstract boolean e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, write write2, write write3);

    public final long i() {
        return this.a;
    }

    public final void i(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        read read2 = this.g;
        if (read2 != null) {
            read2.a(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        }
    }

    public final long j() {
        return this.l;
    }
}
