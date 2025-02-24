package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes2-dex2jar.jar:o/GetDaftarPekerjaanPresenter.class */
public class GetDaftarPekerjaanPresenter {
    static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(GetDaftarPekerjaanPresenter.class, "_handled");
    volatile /* synthetic */ int _handled;
    public final Throwable a;

    public GetDaftarPekerjaanPresenter(Throwable th, boolean z) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    public /* synthetic */ GetDaftarPekerjaanPresenter(Throwable th, boolean z, int i) {
        this(th, false);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append(this.a);
        sb.append(']');
        return sb.toString();
    }
}
