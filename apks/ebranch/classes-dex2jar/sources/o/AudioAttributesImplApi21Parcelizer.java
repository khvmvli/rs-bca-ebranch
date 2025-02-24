package o;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes-dex2jar.jar:o/AudioAttributesImplApi21Parcelizer.class */
public abstract class AudioAttributesImplApi21Parcelizer {
    public final AtomicBoolean a = new AtomicBoolean(false);
    private final onActivityStopped c;
    public volatile Recreator d;

    public AudioAttributesImplApi21Parcelizer(onActivityStopped onactivitystopped) {
        this.c = onactivitystopped;
    }

    private Recreator a() {
        String b = b();
        onActivityStopped onactivitystopped = this.c;
        onactivitystopped.d();
        onactivitystopped.a();
        return onactivitystopped.g.e().a(b);
    }

    protected abstract String b();

    public final Recreator c() {
        Recreator recreator;
        this.c.d();
        if (this.a.compareAndSet(false, true)) {
            if (this.d == null) {
                this.d = a();
            }
            recreator = this.d;
        } else {
            recreator = a();
        }
        return recreator;
    }
}
