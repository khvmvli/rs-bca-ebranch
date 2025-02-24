package o;

import java.util.NoSuchElementException;
/* loaded from: classes-dex2jar.jar:o/setCurrCompanyBusinessType.class */
final class setCurrCompanyBusinessType extends setCurrOfficeCity {
    private int a = 0;
    private final int b;
    final /* synthetic */ setCurrOfficePostCode c;

    public setCurrCompanyBusinessType(setCurrOfficePostCode setcurrofficepostcode) {
        this.c = setcurrofficepostcode;
        this.b = setcurrofficepostcode.b();
    }

    @Override // o.setCurrOfficeAddress
    public final byte b() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return this.c.a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }
}
