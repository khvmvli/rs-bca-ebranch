package o;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import o.setScrollingTouchSlop;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/AudioAttributesImpl.class */
public final class AudioAttributesImpl implements setScrollingTouchSlop.read {
    private final Callable<InputStream> a;
    private final String b;
    private final File c;
    private final setScrollingTouchSlop.read d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImpl(String str, File file, Callable<InputStream> callable, setScrollingTouchSlop.read read) {
        this.b = str;
        this.c = file;
        this.a = callable;
        this.d = read;
    }

    @Override // o.setScrollingTouchSlop.read
    public final setScrollingTouchSlop d(setScrollingTouchSlop.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return new AudioAttributesImplApi21(remoteActionCompatParcelizer.c, this.b, this.c, this.a, remoteActionCompatParcelizer.b.d, this.d.d(remoteActionCompatParcelizer));
    }
}
