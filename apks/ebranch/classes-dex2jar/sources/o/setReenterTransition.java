package o;

import o.onFindViewById;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setReenterTransition.class */
public final class setReenterTransition {
    final setCollapseIcon<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable, read> e = new setCollapseIcon<>();
    final setTrackDrawable<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> c = new setTrackDrawable<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setReenterTransition$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void b(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write2);

        void d(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write2);

        void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);

        void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setReenterTransition$read.class */
    public static final class read {
        static onFindViewById.write<read> b = new onFindViewById.RemoteActionCompatParcelizer(20);
        setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write c;
        int d;
        setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write e;

        private read() {
        }

        static void a(read read) {
            read.d = 0;
            read.c = null;
            read.e = null;
            b.c(read);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void d() {
            do {
            } while (b.a() != null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static read e() {
            read a = b.a();
            read read = a;
            if (a == null) {
                read = new read();
            }
            return read;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        read read2 = this.e.get(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        read read3 = read2;
        if (read2 == null) {
            read3 = read.e();
            this.e.put(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, read3);
        }
        read3.d |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.e.clear();
        this.c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write c(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, int i) {
        read read2;
        setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write;
        setCollapseIcon<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable, read> setcollapseicon = this.e;
        int b = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable == null ? setcollapseicon.b() : setcollapseicon.b(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.hashCode());
        if (b < 0 || (read2 = (read) this.e.h[(b << 1) + 1]) == null || (read2.d & i) == 0) {
            return null;
        }
        read2.d &= i ^ -1;
        if (i == 4) {
            write = read2.c;
        } else if (i == 8) {
            write = read2.e;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((read2.d & 12) == 0) {
            this.e.b(b);
            read.a(read2);
        }
        return write;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        setTrackDrawable<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> settrackdrawable = this.c;
        if (settrackdrawable.c) {
            settrackdrawable.e();
        }
        int i = settrackdrawable.a - 1;
        while (true) {
            if (i < 0) {
                break;
            }
            setTrackDrawable<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> settrackdrawable2 = this.c;
            if (settrackdrawable2.c) {
                settrackdrawable2.e();
            }
            if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable == settrackdrawable2.b[i]) {
                setTrackDrawable<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> settrackdrawable3 = this.c;
                Object[] objArr = settrackdrawable3.b;
                Object obj = objArr[i];
                Object obj2 = setTrackDrawable.e;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    settrackdrawable3.c = true;
                }
            } else {
                i--;
            }
        }
        read remove = this.e.remove(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        if (remove != null) {
            read.a(remove);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write) {
        read read2 = this.e.get(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        read read3 = read2;
        if (read2 == null) {
            read3 = read.e();
            this.e.put(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, read3);
        }
        read3.e = write;
        read3.d |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        read read2 = this.e.get(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        boolean z = true;
        if (read2 == null || (read2.d & 1) == 0) {
            z = false;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write) {
        read read2 = this.e.get(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        read read3 = read2;
        if (read2 == null) {
            read3 = read.e();
            this.e.put(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, read3);
        }
        read3.c = write;
        read3.d |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = (setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) this.e.h[size << 1];
            read b = this.e.b(size);
            if ((b.d & 3) == 3) {
                remoteActionCompatParcelizer.e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
            } else if ((b.d & 1) != 0) {
                if (b.c == null) {
                    remoteActionCompatParcelizer.e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
                } else {
                    remoteActionCompatParcelizer.d(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, b.c, b.e);
                }
            } else if ((b.d & 14) == 14) {
                remoteActionCompatParcelizer.b(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, b.c, b.e);
            } else if ((b.d & 12) == 12) {
                remoteActionCompatParcelizer.e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, b.c, b.e);
            } else if ((b.d & 4) != 0) {
                remoteActionCompatParcelizer.d(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, b.c, null);
            } else if ((b.d & 8) != 0) {
                remoteActionCompatParcelizer.b(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, b.c, b.e);
            }
            read.a(b);
        }
    }
}
