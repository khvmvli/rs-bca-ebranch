package o;

import java.lang.ref.WeakReference;
import o.realmGet;
/* loaded from: classes-dex2jar.jar:o/realmSet$flagDifResidency.class */
final class realmSet$flagDifResidency extends seteChannels {
    private final WeakReference b;

    public realmSet$flagDifResidency(realmSet$flagEKTP realmset_flagektp) {
        this.b = new WeakReference(realmset_flagektp);
    }

    public final void c(realmGet.kodeBank kodebank) {
        realmSet$flagEKTP realmset_flagektp = (realmSet$flagEKTP) this.b.get();
        if (realmset_flagektp != null) {
            realmset_flagektp.a.a(new realmSet$fotoPribadi(this, realmset_flagektp, realmset_flagektp, kodebank) { // from class: o.realmSet$expID
                final /* synthetic */ realmGet.kodeBank b;
                final /* synthetic */ realmSet$flagEKTP c;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.c = r6;
                    this.b = r7;
                }

                @Override // o.realmSet$fotoPribadi
                public final void d() {
                    realmSet$flagEKTP.d(this.c, this.b);
                }
            });
        }
    }
}
