package o;

import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmGet$annualFeeAddOnDisplayAmount.class */
public final class realmGet$annualFeeAddOnDisplayAmount {
    public static final int d(int i, Object obj, Object obj2) {
        realmGet$annualFeeAddOnAmount realmget_annualfeeaddonamount = (realmGet$annualFeeAddOnAmount) obj;
        CreditCardOptions creditCardOptions = (CreditCardOptions) obj2;
        if (realmget_annualfeeaddonamount.isEmpty()) {
            return 0;
        }
        Iterator it = realmget_annualfeeaddonamount.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object d(Object obj, Object obj2) {
        realmGet$annualFeeAddOnAmount realmget_annualfeeaddonamount = (realmGet$annualFeeAddOnAmount) obj;
        realmGet$annualFeeAddOnAmount realmget_annualfeeaddonamount2 = (realmGet$annualFeeAddOnAmount) obj2;
        realmGet$annualFeeAddOnAmount realmget_annualfeeaddonamount3 = realmget_annualfeeaddonamount;
        if (!realmget_annualfeeaddonamount2.isEmpty()) {
            realmget_annualfeeaddonamount3 = realmget_annualfeeaddonamount;
            if (!realmget_annualfeeaddonamount.b()) {
                realmget_annualfeeaddonamount3 = realmget_annualfeeaddonamount.a();
            }
            realmget_annualfeeaddonamount3.b(realmget_annualfeeaddonamount2);
        }
        return realmget_annualfeeaddonamount3;
    }
}
