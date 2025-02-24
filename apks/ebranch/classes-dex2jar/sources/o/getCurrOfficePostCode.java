package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes-dex2jar.jar:o/getCurrOfficePostCode.class */
final class getCurrOfficePostCode implements Iterator<getCustomerFullName> {
    private int a = 0;
    final /* synthetic */ getEmergencyContactMobileNumber e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getCurrOfficePostCode(getEmergencyContactMobileNumber getemergencycontactmobilenumber) {
        this.e = getemergencycontactmobilenumber;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.e.b.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ getCustomerFullName next() {
        if (this.a < this.e.b.length()) {
            String str = this.e.b;
            int i = this.a;
            this.a = i + 1;
            return new getEmergencyContactMobileNumber(String.valueOf(str.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
