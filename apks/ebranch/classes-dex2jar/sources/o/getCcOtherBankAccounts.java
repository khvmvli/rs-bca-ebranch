package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/getCcOtherBankAccounts.class */
public final class getCcOtherBankAccounts {
    private getCreditCardOptions b;
    private getCreditCardOptions c;
    private final List<getCreditCardOptions> e;

    public getCcOtherBankAccounts() {
        this.c = new getCreditCardOptions("", 0, null);
        this.b = new getCreditCardOptions("", 0, null);
        this.e = new ArrayList();
    }

    public getCcOtherBankAccounts(getCreditCardOptions getcreditcardoptions) {
        this.c = getcreditcardoptions;
        this.b = getcreditcardoptions.clone();
        this.e = new ArrayList();
    }

    public final List<getCreditCardOptions> a() {
        return this.e;
    }

    public final getCreditCardOptions b() {
        return this.c;
    }

    public final void b(String str, long j, Map<String, Object> map) {
        this.e.add(new getCreditCardOptions(str, j, map));
    }

    public final void b(getCreditCardOptions getcreditcardoptions) {
        this.c = getcreditcardoptions;
        this.b = getcreditcardoptions.clone();
        this.e.clear();
    }

    public final void c(getCreditCardOptions getcreditcardoptions) {
        this.b = getcreditcardoptions;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        getCcOtherBankAccounts getccotherbankaccounts = new getCcOtherBankAccounts(this.c.clone());
        for (getCreditCardOptions getcreditcardoptions : this.e) {
            getccotherbankaccounts.e.add(getcreditcardoptions.clone());
        }
        return getccotherbankaccounts;
    }

    public final getCreditCardOptions e() {
        return this.b;
    }
}
