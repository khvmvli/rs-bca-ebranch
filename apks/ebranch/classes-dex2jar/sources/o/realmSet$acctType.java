package o;

import android.app.Activity;
/* loaded from: classes-dex2jar.jar:o/realmSet$acctType.class */
public final class realmSet$acctType extends realmSet$resPhoneNumber {
    private final setThumbTintMode c = new setThumbTintMode();
    private final realmGet$resCity h;

    realmSet$acctType(realmGet$religionValue realmget_religionvalue, realmGet$resCity realmget_rescity, realmGet$jobOthers realmget_jobothers) {
        super(realmget_religionvalue, realmget_jobothers);
        this.h = realmget_rescity;
        this.e.b("ConnectionlessLifecycleHelper", this);
    }

    public static void b(Activity activity, realmGet$resCity realmget_rescity, realmGet$religion realmget_religion) {
        realmGet$religionValue b = b(activity);
        realmSet$acctType realmset_accttype = (realmSet$acctType) b.e("ConnectionlessLifecycleHelper", realmSet$acctType.class);
        realmSet$acctType realmset_accttype2 = realmset_accttype;
        if (realmset_accttype == null) {
            realmset_accttype2 = new realmSet$acctType(b, realmget_rescity, realmGet$jobOthers.a());
        }
        setFotoKtp.a(realmget_religion, "ApiKey cannot be null");
        realmset_accttype2.c.add(realmget_religion);
        realmget_rescity.b(realmset_accttype2);
    }

    private final void h() {
        if (!this.c.isEmpty()) {
            this.h.b(this);
        }
    }

    @Override // o.realmSet$resPhoneNumber, o.realmGet$resAddress
    public final void b() {
        b();
        this.h.e(this);
    }

    @Override // o.realmSet$resPhoneNumber, o.realmGet$resAddress
    public final void c() {
        c();
        h();
    }

    @Override // o.realmSet$resPhoneNumber
    protected final void c(realmGet$jobValue realmget_jobvalue, int i) {
        this.h.b(realmget_jobvalue, i);
    }

    @Override // o.realmGet$resAddress
    public final void e() {
        e();
        h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setThumbTintMode g() {
        return this.c;
    }

    @Override // o.realmSet$resPhoneNumber
    protected final void j() {
        this.h.b();
    }
}
