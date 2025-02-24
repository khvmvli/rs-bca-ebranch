package o;

import com.google.android.gms.common.api.AvailabilityException;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:o/realmSet$resCountry.class */
public final class realmSet$resCountry {
    private final setThumbTextPadding a;
    private final setJenisWarkat b;
    private int c;
    private boolean d;
    private final setThumbTextPadding e;

    public final void b(realmGet$religion realmget_religion, realmGet$jobValue realmget_jobvalue, String str) {
        this.a.put(realmget_religion, realmget_jobvalue);
        this.e.put(realmget_religion, str);
        this.c--;
        if (!realmget_jobvalue.c()) {
            this.d = true;
        }
        if (this.c != 0) {
            return;
        }
        if (this.d) {
            this.b.e((Exception) new AvailabilityException(this.a));
            return;
        }
        this.b.e((setJenisWarkat) this.e);
    }

    public final Set c() {
        return this.a.keySet();
    }
}
