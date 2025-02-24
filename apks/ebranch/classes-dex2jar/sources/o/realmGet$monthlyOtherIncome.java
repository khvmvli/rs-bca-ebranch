package o;

import java.util.Collections;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmGet$monthlyOtherIncome.class */
public final class realmGet$monthlyOtherIncome extends setFlagOtherCC<realmGet$noCardKrisFlyer, realmGet$monthlyOtherIncome> {
    private realmGet$monthlyOtherIncome() {
        super(realmGet$noCardKrisFlyer.zzn);
    }

    public /* synthetic */ realmGet$monthlyOtherIncome(realmGet$isDraft realmget_isdraft) {
        super(realmGet$noCardKrisFlyer.zzn);
    }

    public final List<realmGet$flagAgreeAutodebet> a() {
        return Collections.unmodifiableList(((realmGet$noCardKrisFlyer) this.b).g());
    }

    public final realmGet$monthlyOtherIncome a(int i, realmGet$nationality realmget_nationality) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmGet$noCardKrisFlyer.a((realmGet$noCardKrisFlyer) this.b, i, realmget_nationality.v());
        return this;
    }

    public final realmGet$monthlyIncome b(int i) {
        return ((realmGet$noCardKrisFlyer) this.b).d(i);
    }

    public final realmGet$monthlyOtherIncome c() {
        if (this.c) {
            u();
            this.c = false;
        }
        ((realmGet$noCardKrisFlyer) this.b).zzj = realmGet$noCardKrisFlyer.aq();
        return this;
    }

    public final int d() {
        return ((realmGet$noCardKrisFlyer) this.b).i();
    }
}
