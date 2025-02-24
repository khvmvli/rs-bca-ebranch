package o;

import java.util.Comparator;
/* loaded from: classes-dex2jar.jar:o/setCurrOfficeEmailAddress.class */
final class setCurrOfficeEmailAddress implements Comparator<setCurrOfficePostCode> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(setCurrOfficePostCode setcurrofficepostcode, setCurrOfficePostCode setcurrofficepostcode2) {
        int i;
        setCurrOfficePostCode setcurrofficepostcode3 = setcurrofficepostcode;
        setCurrOfficePostCode setcurrofficepostcode4 = setcurrofficepostcode2;
        setCurrCompanyBusinessType setcurrcompanybusinesstype = new setCurrCompanyBusinessType(setcurrofficepostcode3);
        setCurrCompanyBusinessType setcurrcompanybusinesstype2 = new setCurrCompanyBusinessType(setcurrofficepostcode4);
        while (setcurrcompanybusinesstype.hasNext() && setcurrcompanybusinesstype2.hasNext()) {
            i = Integer.compare(setcurrcompanybusinesstype.b() & 255, setcurrcompanybusinesstype2.b() & 255);
            if (i != 0) {
                break;
            }
        }
        i = Integer.compare(setcurrofficepostcode3.b(), setcurrofficepostcode4.b());
        return i;
    }
}
