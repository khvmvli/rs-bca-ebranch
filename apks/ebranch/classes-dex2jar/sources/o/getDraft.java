package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getDraft.class */
public final class getDraft extends getCurrCompanyBusinessType {
    protected realmSet$ccOtherBankCreditCards b;
    protected final List<String> c;
    protected final List<getCustomerFullName> d;

    public getDraft(String str, List<getCustomerFullName> list, List<getCustomerFullName> list2, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards) {
        super(str);
        this.c = new ArrayList();
        this.b = realmset_ccotherbankcreditcards;
        if (!list.isEmpty()) {
            for (getCustomerFullName getcustomerfullname : list) {
                this.c.add(getcustomerfullname.d());
            }
        }
        this.d = new ArrayList(list2);
    }

    private getDraft(getDraft getdraft) {
        super(getdraft.a);
        ArrayList arrayList = new ArrayList(getdraft.c.size());
        this.c = arrayList;
        arrayList.addAll(getdraft.c);
        ArrayList arrayList2 = new ArrayList(getdraft.d.size());
        this.d = arrayList2;
        arrayList2.addAll(getdraft.d);
        this.b = getdraft.b;
    }

    @Override // o.getCurrCompanyBusinessType
    public final getCustomerFullName b(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        realmSet$ccOtherBankCreditCards d = this.b.d();
        for (int i = 0; i < this.c.size(); i++) {
            if (i < list.size()) {
                d.a(this.c.get(i), realmset_ccotherbankcreditcards.a(list.get(i)));
            } else {
                d.a(this.c.get(i), g);
            }
        }
        for (getCustomerFullName getcustomerfullname : this.d) {
            getCustomerFullName a = d.a(getcustomerfullname);
            getCustomerFullName getcustomerfullname2 = a;
            if (a instanceof getCustomerName) {
                getcustomerfullname2 = d.a(getcustomerfullname);
            }
            if (getcustomerfullname2 instanceof getCurrOfficeAddress) {
                return ((getCurrOfficeAddress) getcustomerfullname2).e();
            }
        }
        return getCustomerFullName.g;
    }

    @Override // o.getCurrCompanyBusinessType, o.getCustomerFullName
    public final getCustomerFullName h() {
        return new getDraft(this);
    }
}
