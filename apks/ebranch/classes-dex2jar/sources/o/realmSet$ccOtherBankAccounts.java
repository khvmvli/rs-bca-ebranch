package o;
/* loaded from: classes-dex2jar.jar:o/realmSet$ccOtherBankAccounts.class */
public final class realmSet$ccOtherBankAccounts extends setFlagOtherCC<realmSet$currCompanyName, realmSet$ccOtherBankAccounts> {
    private realmSet$ccOtherBankAccounts() {
        super(realmSet$currCompanyName.zzg);
    }

    public /* synthetic */ realmSet$ccOtherBankAccounts(realmGet$prevCompanyName realmget_prevcompanyname) {
        super(realmSet$currCompanyName.zzg);
    }

    public final realmSet$ccOtherBankAccounts c(realmSet$autodebetPercentage realmset_autodebetpercentage) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmSet$currCompanyName.d((realmSet$currCompanyName) this.b, realmset_autodebetpercentage.v());
        return this;
    }
}
