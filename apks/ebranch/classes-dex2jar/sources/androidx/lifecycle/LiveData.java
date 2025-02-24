package androidx.lifecycle;

import o.onRequestPermissionsResult;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.onResume;
import o.performContextItemSelected;
import o.performLowMemory;
import o.setQueryHint;
import o.setSwitchPadding;
/* loaded from: classes-dex2jar.jar:androidx/lifecycle/LiveData.class */
public abstract class LiveData<T> {
    public static final Object e = new Object();
    public int a;
    final Object b;
    public volatile Object c;
    volatile Object d;
    private setSwitchPadding<performLowMemory<? super T>, LiveData<T>.IconCompatParcelizer> f;
    private boolean g;
    public int h;
    private boolean i;
    private boolean j;
    private final Runnable l;

    /* loaded from: classes-dex2jar.jar:androidx/lifecycle/LiveData$IconCompatParcelizer.class */
    public abstract class IconCompatParcelizer {
        int a = -1;
        final performLowMemory<? super T> d;
        boolean e;

        IconCompatParcelizer(performLowMemory<? super T> performlowmemory) {
            LiveData.this = r4;
            this.d = performlowmemory;
        }

        abstract boolean a();

        void d() {
        }

        final void e(boolean z) {
            if (z != this.e) {
                this.e = z;
                LiveData.this.b(z ? 1 : -1);
                if (this.e) {
                    LiveData.this.c(this);
                }
            }
        }

        boolean e(performContextItemSelected performcontextitemselected) {
            return false;
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/lifecycle/LiveData$LifecycleBoundObserver.class */
    public class LifecycleBoundObserver extends IconCompatParcelizer implements onResume {
        final performContextItemSelected c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        LifecycleBoundObserver(performContextItemSelected performcontextitemselected, performLowMemory<? super T> performlowmemory) {
            super(performlowmemory);
            LiveData.this = r5;
            this.c = performcontextitemselected;
        }

        @Override // androidx.lifecycle.LiveData.IconCompatParcelizer
        final boolean a() {
            return this.c.getLifecycle().a().compareTo(onRequestPermissionsResult.read.STARTED) >= 0;
        }

        @Override // o.onResume
        public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
            onRequestPermissionsResult.read a = this.c.getLifecycle().a();
            if (a == onRequestPermissionsResult.read.DESTROYED) {
                LiveData.this.d((performLowMemory) this.d);
                return;
            }
            for (onRequestPermissionsResult.read read = null; read != a; read = a) {
                e(this.c.getLifecycle().a().compareTo(onRequestPermissionsResult.read.STARTED) >= 0);
                a = this.c.getLifecycle().a();
            }
        }

        @Override // androidx.lifecycle.LiveData.IconCompatParcelizer
        final void d() {
            this.c.getLifecycle().e(this);
        }

        @Override // androidx.lifecycle.LiveData.IconCompatParcelizer
        final boolean e(performContextItemSelected performcontextitemselected) {
            return this.c == performcontextitemselected;
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/lifecycle/LiveData$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer extends IconCompatParcelizer {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(performLowMemory<? super T> performlowmemory) {
            super(performlowmemory);
            LiveData.this = r5;
        }

        @Override // androidx.lifecycle.LiveData.IconCompatParcelizer
        final boolean a() {
            return true;
        }
    }

    public LiveData() {
        this.b = new Object();
        this.f = new setSwitchPadding<>();
        this.a = 0;
        Object obj = e;
        this.d = obj;
        this.l = new Runnable() { // from class: androidx.lifecycle.LiveData.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Object obj2;
                synchronized (LiveData.this.b) {
                    obj2 = LiveData.this.d;
                    LiveData.this.d = LiveData.e;
                }
                LiveData.this.a(obj2);
            }
        };
        this.c = obj;
        this.h = -1;
    }

    public LiveData(T t) {
        this.b = new Object();
        this.f = new setSwitchPadding<>();
        this.a = 0;
        this.d = e;
        this.l = new Runnable() { // from class: androidx.lifecycle.LiveData.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Object obj2;
                synchronized (LiveData.this.b) {
                    obj2 = LiveData.this.d;
                    LiveData.this.d = LiveData.e;
                }
                LiveData.this.a(obj2);
            }
        };
        this.c = t;
        this.h = 0;
    }

    private void e(LiveData<T>.IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer.e) {
            if (!iconCompatParcelizer.a()) {
                iconCompatParcelizer.e(false);
                return;
            }
            int i = iconCompatParcelizer.a;
            int i2 = this.h;
            if (i < i2) {
                iconCompatParcelizer.a = i2;
                iconCompatParcelizer.d.e((Object) this.c);
            }
        }
    }

    private static void e(String str) {
        if (!setQueryHint.c().a.d()) {
            StringBuilder sb = new StringBuilder("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background thread");
            throw new IllegalStateException(sb.toString());
        }
    }

    public void a(T t) {
        e("setValue");
        this.h++;
        this.c = t;
        c(null);
    }

    public final void a(performContextItemSelected performcontextitemselected, performLowMemory<? super T> performlowmemory) {
        e("observe");
        if (performcontextitemselected.getLifecycle().a() != onRequestPermissionsResult.read.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(performcontextitemselected, performlowmemory);
            LiveData<T>.IconCompatParcelizer e2 = this.f.e(performlowmemory, lifecycleBoundObserver);
            if (e2 != null && !e2.e(performcontextitemselected)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (e2 == null) {
                performcontextitemselected.getLifecycle().c(lifecycleBoundObserver);
            }
        }
    }

    final void b(int i) {
        int i2 = this.a;
        this.a = i + i2;
        if (!this.j) {
            this.j = true;
            while (true) {
                try {
                    int i3 = this.a;
                    if (i2 != i3) {
                        boolean z = i2 == 0 && i3 > 0;
                        boolean z2 = i2 > 0 && i3 == 0;
                        if (z) {
                            e();
                        } else if (z2) {
                            c();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.j = false;
                }
            }
        }
    }

    public final void b(performLowMemory<? super T> performlowmemory) {
        e("observeForever");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(performlowmemory);
        LiveData<T>.IconCompatParcelizer e2 = this.f.e(performlowmemory, remoteActionCompatParcelizer);
        if (e2 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (e2 == null) {
            remoteActionCompatParcelizer.e(true);
        }
    }

    public void c() {
    }

    final void c(LiveData<T>.IconCompatParcelizer iconCompatParcelizer) {
        if (this.i) {
            this.g = true;
            return;
        }
        this.i = true;
        do {
            this.g = false;
            if (iconCompatParcelizer == null) {
                setSwitchPadding<performLowMemory<? super T>, LiveData<T>.IconCompatParcelizer> setswitchpadding = this.f;
                setSwitchPadding.read read = new setSwitchPadding.read();
                setswitchpadding.a.put(read, Boolean.FALSE);
                while (true) {
                    iconCompatParcelizer = iconCompatParcelizer;
                    if (!read.hasNext()) {
                        break;
                    }
                    e((IconCompatParcelizer) read.next().getValue());
                    if (this.g) {
                        iconCompatParcelizer = iconCompatParcelizer;
                        break;
                    }
                }
            } else {
                e(iconCompatParcelizer);
                iconCompatParcelizer = null;
            }
        } while (this.g);
        this.i = false;
    }

    public void d(T t) {
        boolean z;
        synchronized (this.b) {
            z = this.d == e;
            this.d = t;
        }
        if (z) {
            setQueryHint.c().a.c(this.l);
        }
    }

    public void d(performLowMemory<? super T> performlowmemory) {
        e("removeObserver");
        LiveData<T>.IconCompatParcelizer a = this.f.a(performlowmemory);
        if (a != null) {
            a.d();
            a.e(false);
        }
    }

    public void e() {
    }
}
