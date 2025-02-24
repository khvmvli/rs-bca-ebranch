package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$promotionCode.class */
public final class realmGet$promotionCode extends setFlagOtherCC<realmGet$referenceBranchCode, realmGet$promotionCode> {
    private realmGet$promotionCode() {
        super(realmGet$referenceBranchCode.zzi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ realmGet$promotionCode(realmGet$prevCompanyName realmget_prevcompanyname) {
        super(realmGet$referenceBranchCode.zzi);
    }

    public final realmGet$promotionCode a(boolean z) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmGet$referenceBranchCode.c((realmGet$referenceBranchCode) this.b, z);
        return this;
    }

    public final realmGet$promotionCode c(realmSet$currCompanyPosition realmset_currcompanyposition) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmGet$referenceBranchCode.a((realmGet$referenceBranchCode) this.b, realmset_currcompanyposition);
        return this;
    }

    public final realmGet$promotionCode d(realmSet$currCompanyBusinessType realmset_currcompanybusinesstype) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmGet$referenceBranchCode.d((realmGet$referenceBranchCode) this.b, realmset_currcompanybusinesstype.v());
        return this;
    }

    public final realmGet$promotionCode e(int i) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmGet$referenceBranchCode.e((realmGet$referenceBranchCode) this.b, i);
        return this;
    }
}
