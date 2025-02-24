package o;
/* loaded from: classes-dex2jar.jar:o/realmSet$bcaDebitCardType.class */
public final class realmSet$bcaDebitCardType extends setFlagOtherCC<realmSet$bcaDebitCardNumber, realmSet$bcaDebitCardType> {
    private realmSet$bcaDebitCardType() {
        super(realmSet$bcaDebitCardNumber.zze);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ realmSet$bcaDebitCardType(realmGet$prevCompanyName realmget_prevcompanyname) {
        super(realmSet$bcaDebitCardNumber.zze);
    }

    public final realmSet$bcaAccountNumber b(int i) {
        return ((realmSet$bcaDebitCardNumber) this.b).b(0);
    }

    public final realmSet$bcaDebitCardType d(realmSet$birthDate realmset_birthdate) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmSet$bcaDebitCardNumber.e((realmSet$bcaDebitCardNumber) this.b, realmset_birthdate.v());
        return this;
    }
}
