package o;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes-dex2jar.jar:o/setFlagReservationTellerReguler.class */
final class setFlagReservationTellerReguler implements setTimeZone {
    private boolean a;
    private final Set<setVendorKiosk> d = Collections.newSetFromMap(new WeakHashMap());
    private boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.e = true;
        for (setVendorKiosk setvendorkiosk : getTxnNotes2.c(this.d)) {
            setvendorkiosk.c();
        }
    }

    @Override // o.setTimeZone
    public final void a(setVendorKiosk setvendorkiosk) {
        this.d.remove(setvendorkiosk);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.a = true;
        for (setVendorKiosk setvendorkiosk : getTxnNotes2.c(this.d)) {
            setvendorkiosk.d();
        }
    }

    @Override // o.setTimeZone
    public final void c(setVendorKiosk setvendorkiosk) {
        this.d.add(setvendorkiosk);
        if (this.e) {
            setvendorkiosk.c();
        } else if (this.a) {
            setvendorkiosk.d();
        } else {
            setvendorkiosk.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        this.a = false;
        for (setVendorKiosk setvendorkiosk : getTxnNotes2.c(this.d)) {
            setvendorkiosk.a();
        }
    }
}
