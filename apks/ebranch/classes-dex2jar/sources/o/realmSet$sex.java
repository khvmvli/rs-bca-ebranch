package o;

import android.os.Bundle;
import o.realmGet$occupation;
/* loaded from: classes-dex2jar.jar:o/realmSet$sex.class */
public final class realmSet$sex implements realmGet$occupation.IconCompatParcelizer, realmGet$occupation.read {
    private final boolean a;
    public final realmGet$name b;
    private realmSet$salaryValue c;

    public realmSet$sex(realmGet$name realmget_name, boolean z) {
        this.b = realmget_name;
        this.a = z;
    }

    private final realmSet$salaryValue d() {
        setFotoKtp.a(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.c;
    }

    public final void a(realmSet$salaryValue realmset_salaryvalue) {
        this.c = realmset_salaryvalue;
    }

    @Override // o.realmGet$resProvince
    public final void b(realmGet$jobValue realmget_jobvalue) {
        d().d(realmget_jobvalue, this.b, this.a);
    }

    @Override // o.realmGet$resCountry
    public final void e(int i) {
        d().e(i);
    }

    @Override // o.realmGet$resCountry
    public final void e(Bundle bundle) {
        d().e(bundle);
    }
}
