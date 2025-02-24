package o;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:o/clickPilih.class */
public final class clickPilih implements AutoLogoutDialog_ViewBinding {
    @Nullable
    private realmSet$localClearingCodeBank a;
    private final Executor b;
    private final Object c = new Object();

    public clickPilih(Executor executor, realmSet$localClearingCodeBank realmset_localclearingcodebank) {
        this.b = executor;
        this.a = realmset_localclearingcodebank;
    }

    public static /* bridge */ /* synthetic */ realmSet$localClearingCodeBank b(clickPilih clickpilih) {
        return clickpilih.a;
    }

    public static /* bridge */ /* synthetic */ Object c(clickPilih clickpilih) {
        return clickpilih.c;
    }

    public final void c(setJatuhTempo setjatuhtempo) {
        synchronized (this.c) {
            if (this.a != null) {
                this.b.execute(new AutoLogoutDialog(this, setjatuhtempo));
            }
        }
    }
}
