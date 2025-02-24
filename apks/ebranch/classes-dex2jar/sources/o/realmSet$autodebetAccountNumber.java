package o;

import java.util.Collections;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmSet$autodebetAccountNumber.class */
public final class realmSet$autodebetAccountNumber extends setFlagOtherCC<realmGet$selectedCardOptions, realmSet$autodebetAccountNumber> {
    private realmSet$autodebetAccountNumber() {
        super(realmGet$selectedCardOptions.zzj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ realmSet$autodebetAccountNumber(realmGet$prevCompanyName realmget_prevcompanyname) {
        super(realmGet$selectedCardOptions.zzj);
    }

    public final List<realmSet$birthPlace> a() {
        return Collections.unmodifiableList(((realmGet$selectedCardOptions) this.b).c());
    }

    public final String b() {
        return ((realmGet$selectedCardOptions) this.b).e();
    }

    public final realmSet$autodebetAccountNumber b(String str) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmGet$selectedCardOptions.e((realmGet$selectedCardOptions) this.b, str);
        return this;
    }

    public final realmSet$autodebetAccountNumber b(realmGet$totalDependent realmget_totaldependent) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmGet$selectedCardOptions.d((realmGet$selectedCardOptions) this.b, realmget_totaldependent.v());
        return this;
    }

    public final realmSet$autodebetAccountNumber b(realmSet$birthPlace realmset_birthplace) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmGet$selectedCardOptions.d((realmGet$selectedCardOptions) this.b, realmset_birthplace);
        return this;
    }

    public final realmSet$birthPlace b(int i) {
        return ((realmGet$selectedCardOptions) this.b).b(i);
    }

    public final realmSet$autodebetAccountNumber c(int i) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmGet$selectedCardOptions.b((realmGet$selectedCardOptions) this.b, i);
        return this;
    }

    public final realmSet$autodebetAccountNumber c(long j) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmGet$selectedCardOptions.b((realmGet$selectedCardOptions) this.b, j);
        return this;
    }

    public final boolean c() {
        return ((realmGet$selectedCardOptions) this.b).j();
    }

    public final realmSet$autodebetAccountNumber d() {
        if (this.c) {
            u();
            this.c = false;
        }
        ((realmGet$selectedCardOptions) this.b).zze = realmGet$selectedCardOptions.aq();
        return this;
    }

    public final realmSet$autodebetAccountNumber d(int i, realmSet$birthPlace realmset_birthplace) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmGet$selectedCardOptions.c((realmGet$selectedCardOptions) this.b, i, realmset_birthplace);
        return this;
    }

    public final realmSet$autodebetAccountNumber d(long j) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmGet$selectedCardOptions.e((realmGet$selectedCardOptions) this.b, j);
        return this;
    }

    public final int e() {
        return ((realmGet$selectedCardOptions) this.b).a();
    }

    public final realmSet$autodebetAccountNumber e(int i, realmGet$totalDependent realmget_totaldependent) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmGet$selectedCardOptions.c((realmGet$selectedCardOptions) this.b, i, realmget_totaldependent.v());
        return this;
    }

    public final realmSet$autodebetAccountNumber e(Iterable<? extends realmSet$birthPlace> iterable) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmGet$selectedCardOptions.b((realmGet$selectedCardOptions) this.b, iterable);
        return this;
    }

    public final long i() {
        return ((realmGet$selectedCardOptions) this.b).f();
    }

    public final long j() {
        return ((realmGet$selectedCardOptions) this.b).i();
    }
}
