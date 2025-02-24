package o;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes-dex2jar.jar:o/realmSet$religionOthers.class */
public final class realmSet$religionOthers {
    public static final Status c = new Status(8, "The connection to Google Play services was lost");
    final Set b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final realmSet$oldCustFlag d = new realmSet$oldCustFlag(this);

    public final void b() {
        realmGet$purposePemRekOthers[] realmget_purposepemrekothersArr = (realmGet$purposePemRekOthers[]) this.b.toArray(new realmGet$purposePemRekOthers[0]);
        for (realmGet$purposePemRekOthers realmget_purposepemrekothers : realmget_purposepemrekothersArr) {
            realmget_purposepemrekothers.a((realmSet$oldCustFlag) null);
            if (realmget_purposepemrekothers.f()) {
                this.b.remove(realmget_purposepemrekothers);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(realmGet$purposePemRekOthers realmget_purposepemrekothers) {
        this.b.add(realmget_purposepemrekothers);
        realmget_purposepemrekothers.a(this.d);
    }
}
