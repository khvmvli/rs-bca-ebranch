package o;
/* loaded from: classes-dex2jar.jar:o/getFlagBCAAccount.class */
final class getFlagBCAAccount implements getFlagAgreeLifeInsurance {
    private final realmSet$ccOtherBankCreditCards b;
    private final String e;

    public getFlagBCAAccount(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, String str) {
        this.b = realmset_ccotherbankcreditcards;
        this.e = str;
    }

    @Override // o.getFlagAgreeLifeInsurance
    public final realmSet$ccOtherBankCreditCards a(getCustomerFullName getcustomerfullname) {
        this.b.a(this.e, getcustomerfullname);
        return this.b;
    }
}
