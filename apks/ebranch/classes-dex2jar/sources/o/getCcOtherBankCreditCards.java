package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes-dex2jar.jar:o/getCcOtherBankCreditCards.class */
final class getCcOtherBankCreditCards implements Iterator<getCustomerFullName> {
    final /* synthetic */ Iterator b;
    final /* synthetic */ Iterator d;

    public getCcOtherBankCreditCards(getCurrCompanyPosition getcurrcompanyposition, Iterator it, Iterator it2) {
        this.b = it;
        this.d = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b.hasNext()) {
            return true;
        }
        return this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ getCustomerFullName next() {
        getEmergencyContactMobileNumber getemergencycontactmobilenumber;
        if (this.b.hasNext()) {
            getemergencycontactmobilenumber = new getEmergencyContactMobileNumber(((Integer) this.b.next()).toString());
        } else if (this.d.hasNext()) {
            getemergencycontactmobilenumber = new getEmergencyContactMobileNumber((String) this.d.next());
        } else {
            throw new NoSuchElementException();
        }
        return getemergencycontactmobilenumber;
    }
}
