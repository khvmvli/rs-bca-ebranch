package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes-dex2jar.jar:o/getCurrWorkPeriod.class */
final class getCurrWorkPeriod implements Iterator<getCustomerFullName> {
    private int b = 0;
    final /* synthetic */ getEmergencyContactMobileNumber d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getCurrWorkPeriod(getEmergencyContactMobileNumber getemergencycontactmobilenumber) {
        this.d = getemergencycontactmobilenumber;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.d.b.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ getCustomerFullName next() {
        if (this.b < this.d.b.length()) {
            int i = this.b;
            this.b = i + 1;
            return new getEmergencyContactMobileNumber(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
