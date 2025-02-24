package o;

import androidx.lifecycle.LiveData;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import o.FullLifecycleObserverAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/AudioAttributesCompatParcelizer.class */
public final class AudioAttributesCompatParcelizer<T> extends LiveData<T> {
    final Callable<T> f;
    final onActivityStopped g;
    final boolean j;
    final FullLifecycleObserverAdapter.IconCompatParcelizer n;
    private final LifecycleCoroutineScopeImpl s;
    final AtomicBoolean k = new AtomicBoolean(true);
    final AtomicBoolean i = new AtomicBoolean(false);

    /* renamed from: o  reason: collision with root package name */
    final AtomicBoolean f74o = new AtomicBoolean(false);
    final Runnable m = new Runnable() { // from class: o.AudioAttributesCompatParcelizer.4
        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            if (AudioAttributesCompatParcelizer.this.f74o.compareAndSet(false, true)) {
                FullLifecycleObserverAdapter fullLifecycleObserverAdapter = AudioAttributesCompatParcelizer.this.g.i;
                fullLifecycleObserverAdapter.a(new FullLifecycleObserverAdapter.RemoteActionCompatParcelizer(fullLifecycleObserverAdapter, AudioAttributesCompatParcelizer.this.n));
            }
            do {
                if (AudioAttributesCompatParcelizer.this.i.compareAndSet(false, true)) {
                    T t = null;
                    z = false;
                    while (AudioAttributesCompatParcelizer.this.k.compareAndSet(true, false)) {
                        try {
                            try {
                                t = AudioAttributesCompatParcelizer.this.f.call();
                                z = true;
                            } catch (Exception e) {
                                throw new RuntimeException("Exception while computing database live data.", e);
                            }
                        } finally {
                            AudioAttributesCompatParcelizer.this.i.set(false);
                        }
                    }
                    if (z) {
                        AudioAttributesCompatParcelizer.this.d((AudioAttributesCompatParcelizer) t);
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } while (AudioAttributesCompatParcelizer.this.k.get());
        }
    };
    final Runnable l = new Runnable() { // from class: o.AudioAttributesCompatParcelizer.1
        @Override // java.lang.Runnable
        public final void run() {
            boolean z = AudioAttributesCompatParcelizer.this.a > 0;
            if (AudioAttributesCompatParcelizer.this.k.compareAndSet(false, true) && z) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.this;
                (audioAttributesCompatParcelizer.j ? audioAttributesCompatParcelizer.g.f : audioAttributesCompatParcelizer.g.j).execute(AudioAttributesCompatParcelizer.this.m);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesCompatParcelizer(onActivityStopped onactivitystopped, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, boolean z, Callable<T> callable, String[] strArr) {
        this.g = onactivitystopped;
        this.j = z;
        this.f = callable;
        this.s = lifecycleCoroutineScopeImpl;
        this.n = new FullLifecycleObserverAdapter.IconCompatParcelizer(strArr) { // from class: o.AudioAttributesCompatParcelizer.5
            @Override // o.FullLifecycleObserverAdapter.IconCompatParcelizer
            public final void c(Set<String> set) {
                setQueryHint c = setQueryHint.c();
                Runnable runnable = AudioAttributesCompatParcelizer.this.l;
                if (c.d()) {
                    runnable.run();
                } else {
                    c.c(runnable);
                }
            }
        };
    }

    @Override // androidx.lifecycle.LiveData
    public final void c() {
        c();
        this.s.d.remove(this);
    }

    @Override // androidx.lifecycle.LiveData
    public final void e() {
        e();
        this.s.d.add(this);
        (this.j ? this.g.f : this.g.j).execute(this.m);
    }
}
