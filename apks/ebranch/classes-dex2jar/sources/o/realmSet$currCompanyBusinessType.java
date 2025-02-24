package o;
/* loaded from: classes-dex2jar.jar:o/realmSet$currCompanyBusinessType.class */
public final class realmSet$currCompanyBusinessType extends setFlagOtherCC<realmSet$currCompanyPosition, realmSet$currCompanyBusinessType> {
    private realmSet$currCompanyBusinessType() {
        super(realmSet$currCompanyPosition.zzh);
    }

    public /* synthetic */ realmSet$currCompanyBusinessType(realmGet$prevCompanyName realmget_prevcompanyname) {
        super(realmSet$currCompanyPosition.zzh);
    }

    public final realmSet$currCompanyBusinessType a(Iterable<? extends realmSet$currOfficeBusinessField> iterable) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmSet$currCompanyPosition.c((realmSet$currCompanyPosition) this.b, iterable);
        return this;
    }

    public final realmSet$currCompanyBusinessType c() {
        if (this.c) {
            u();
            this.c = false;
        }
        ((realmSet$currCompanyPosition) this.b).zze = realmSet$currCompanyPosition.al();
        return this;
    }

    public final realmSet$currCompanyBusinessType c(int i) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmSet$currCompanyPosition.d((realmSet$currCompanyPosition) this.b, i);
        return this;
    }

    public final realmSet$currCompanyBusinessType c(Iterable<? extends realmGet$referalCode> iterable) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmSet$currCompanyPosition.a((realmSet$currCompanyPosition) this.b, iterable);
        return this;
    }

    public final realmSet$currCompanyBusinessType d() {
        if (this.c) {
            u();
            this.c = false;
        }
        ((realmSet$currCompanyPosition) this.b).zza = realmSet$currCompanyPosition.al();
        return this;
    }

    public final realmSet$currCompanyBusinessType d(int i) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmSet$currCompanyPosition.c((realmSet$currCompanyPosition) this.b, i);
        return this;
    }

    public final realmSet$currCompanyBusinessType d(Iterable<? extends Long> iterable) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmSet$currCompanyPosition.d((realmSet$currCompanyPosition) this.b, iterable);
        return this;
    }

    public final realmSet$currCompanyBusinessType e(Iterable<? extends Long> iterable) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmSet$currCompanyPosition.e((realmSet$currCompanyPosition) this.b, iterable);
        return this;
    }
}
