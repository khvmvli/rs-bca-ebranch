package o;

import android.os.Looper;
import java.lang.ref.WeakReference;
import o.setCitizenValue;
/* loaded from: classes-dex2jar.jar:o/realmSet$createdAt.class */
final class realmSet$createdAt implements setCitizenValue.RemoteActionCompatParcelizer {
    private final boolean b;
    private final WeakReference d;
    private final realmGet$name e;

    public realmSet$createdAt(realmSet$flagEKTP realmset_flagektp, realmGet$name realmget_name, boolean z) {
        this.d = new WeakReference(realmset_flagektp);
        this.e = realmget_name;
        this.b = z;
    }

    @Override // o.setCitizenValue.RemoteActionCompatParcelizer
    public final void c(realmGet$jobValue realmget_jobvalue) {
        realmSet$flagEKTP realmset_flagektp = (realmSet$flagEKTP) this.d.get();
        if (realmset_flagektp != null) {
            setFotoKtp.c(Looper.myLooper() == realmset_flagektp.a.g.e(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            realmset_flagektp.c.lock();
            try {
                if (realmset_flagektp.c(0)) {
                    if (!realmget_jobvalue.c()) {
                        realmset_flagektp.a(realmget_jobvalue, this.e, this.b);
                    }
                    if (realmset_flagektp.h()) {
                        realmset_flagektp.i();
                    }
                }
            } finally {
                realmset_flagektp.c.unlock();
            }
        }
    }
}
