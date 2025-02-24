package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setRelationship.class */
public final class setRelationship extends getCurrCompanyBusinessType {
    private final getKotaBankPenerima b;

    public setRelationship(String str, getKotaBankPenerima getkotabankpenerima) {
        super("internal.remoteConfig");
        this.b = getkotabankpenerima;
        this.e.put("getValue", new getCurrCompanyBusinessType(this, "getValue", getkotabankpenerima) { // from class: o.realmSet$cardImageOrientation
            final /* synthetic */ getKotaBankPenerima b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = r6;
            }

            @Override // o.getCurrCompanyBusinessType
            public final getCustomerFullName b(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
                realmSet$flagBCAAccount.b("getValue", 2, list);
                getCustomerFullName a = realmset_ccotherbankcreditcards.a(list.get(0));
                getCustomerFullName a2 = realmset_ccotherbankcreditcards.a(list.get(1));
                String e = this.b.e(a.d());
                if (e != null) {
                    a2 = new getEmergencyContactMobileNumber(e);
                }
                return a2;
            }
        });
    }

    @Override // o.getCurrCompanyBusinessType
    public final getCustomerFullName b(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        return g;
    }
}
