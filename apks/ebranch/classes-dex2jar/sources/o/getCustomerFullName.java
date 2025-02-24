package o;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getCustomerFullName.class */
public interface getCustomerFullName {
    public static final getCustomerFullName g = new getEmergencyContactName();
    public static final getCustomerFullName h = new getCurrOfficeCity();
    public static final getCustomerFullName i = new getCurrOfficeAddress("continue");
    public static final getCustomerFullName j = new getCurrOfficeAddress("break");
    public static final getCustomerFullName f = new getCurrOfficeAddress("return");
    public static final getCustomerFullName n = new getCurrCompanyName(Boolean.TRUE);
    public static final getCustomerFullName k = new getCurrCompanyName(Boolean.FALSE);

    /* renamed from: o */
    public static final getCustomerFullName f144o = new getEmergencyContactMobileNumber("");

    Double a();

    Boolean b();

    Iterator<getCustomerFullName> c();

    getCustomerFullName c(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list);

    String d();

    getCustomerFullName h();
}
