package o;

import android.os.Bundle;
import java.util.Collections;
import o.realmGet$religionOthers;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes-dex2jar.jar:o/realmSet$flagNPWP.class */
public final class realmSet$flagNPWP implements realmSet$fotoNpwp {
    @NotOnlyInitialized
    private final realmSet$hmPhoneCodeNumber c;

    public realmSet$flagNPWP(realmSet$hmPhoneCodeNumber realmset_hmphonecodenumber) {
        this.c = realmset_hmphonecodenumber;
    }

    @Override // o.realmSet$fotoNpwp
    public final realmGet$religionOthers.write a(realmGet$religionOthers.write write) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // o.realmSet$fotoNpwp
    public final void b() {
        this.c.h();
    }

    @Override // o.realmSet$fotoNpwp
    public final void b(realmGet$jobValue realmget_jobvalue, realmGet$name realmget_name, boolean z) {
    }

    @Override // o.realmSet$fotoNpwp
    public final realmGet$religionOthers.write c(realmGet$religionOthers.write write) {
        this.c.g.e.add(write);
        return write;
    }

    @Override // o.realmSet$fotoNpwp
    public final boolean c() {
        return true;
    }

    @Override // o.realmSet$fotoNpwp
    public final void d() {
        for (realmGet$name$MediaBrowserCompat$SearchResultReceiver realmget_name_mediabrowsercompat_searchresultreceiver : this.c.a.values()) {
            realmget_name_mediabrowsercompat_searchresultreceiver.e();
        }
        this.c.g.c = Collections.emptySet();
    }

    @Override // o.realmSet$fotoNpwp
    public final void d(int i) {
    }

    @Override // o.realmSet$fotoNpwp
    public final void d(Bundle bundle) {
    }
}
