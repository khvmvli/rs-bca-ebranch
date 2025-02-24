package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes-dex2jar.jar:o/getCountry.class */
final class getCountry implements Iterator<getCustomerFullName> {
    final /* synthetic */ getCurrCompanyPosition a;
    private int e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getCountry(getCurrCompanyPosition getcurrcompanyposition) {
        this.a = getcurrcompanyposition;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.a.g();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ getCustomerFullName next() {
        if (this.e < this.a.g()) {
            getCurrCompanyPosition getcurrcompanyposition = this.a;
            int i = this.e;
            this.e = i + 1;
            return getcurrcompanyposition.b(i);
        }
        int i2 = this.e;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }
}
