package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getEmergencyContactBCACardNumber.class */
public abstract class getEmergencyContactBCACardNumber {
    final List<getFlagOtherCC> a = new ArrayList();

    public final getCustomerFullName a(String str) {
        if (this.a.contains(realmSet$flagBCAAccount.d(str))) {
            String valueOf = String.valueOf(str);
            throw new UnsupportedOperationException(valueOf.length() != 0 ? "Command not implemented: ".concat(valueOf) : new String("Command not implemented: "));
        }
        throw new IllegalArgumentException("Command not supported");
    }

    public abstract getCustomerFullName a(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list);
}
