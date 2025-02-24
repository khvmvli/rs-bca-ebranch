package o;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/getCurrOfficeEmailAddress.class */
public final class getCurrOfficeEmailAddress implements Iterator<getCustomerFullName> {
    final /* synthetic */ Iterator a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getCurrOfficeEmailAddress(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ getCustomerFullName next() {
        return new getEmergencyContactMobileNumber((String) this.a.next());
    }
}
