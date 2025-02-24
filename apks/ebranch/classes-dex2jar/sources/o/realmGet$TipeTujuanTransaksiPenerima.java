package o;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes-dex2jar.jar:o/realmGet$TipeTujuanTransaksiPenerima.class */
public final class realmGet$TipeTujuanTransaksiPenerima {
    final TreeMap<Integer, getDraft> a = new TreeMap<>();
    final TreeMap<Integer, getDraft> e = new TreeMap<>();

    private static final int e(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, getDraft getdraft, getCustomerFullName getcustomerfullname) {
        getCustomerFullName b = getdraft.b(realmset_ccotherbankcreditcards, Collections.singletonList(getcustomerfullname));
        if (b instanceof getCreditCardSupplements) {
            return realmSet$flagBCAAccount.e(b.a().doubleValue());
        }
        return -1;
    }

    public final void a(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, getCcOtherBankAccounts getccotherbankaccounts) {
        realmGet$annualFeeBasicAmount realmget_annualfeebasicamount = new getCurrOfficeBusinessField(getccotherbankaccounts) { // from class: o.realmGet$annualFeeBasicAmount
            private final getCcOtherBankAccounts e;

            {
                this.e = r4;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // o.getCurrOfficeBusinessField, o.getCustomerFullName
            public final getCustomerFullName c(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards2, List<getCustomerFullName> list) {
                char c;
                switch (str.hashCode()) {
                    case 21624207:
                        if (str.equals("getEventName")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 45521504:
                        if (str.equals("getTimestamp")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 146575578:
                        if (str.equals("getParamValue")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 700587132:
                        if (str.equals("getParams")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 920706790:
                        if (str.equals("setParamValue")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1570616835:
                        if (str.equals("setEventName")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    realmSet$flagBCAAccount.b("getEventName", 0, list);
                    return new getEmergencyContactMobileNumber(this.e.e().a());
                } else if (c == 1) {
                    realmSet$flagBCAAccount.b("getParamValue", 1, list);
                    return realmSet$prevWorkPeriod.e(this.e.e().e(realmset_ccotherbankcreditcards2.a(list.get(0)).d()));
                } else if (c == 2) {
                    realmSet$flagBCAAccount.b("getParams", 0, list);
                    Map<String, Object> c2 = this.e.e().c();
                    getCurrOfficeBusinessField getcurrofficebusinessfield = new getCurrOfficeBusinessField();
                    for (String str2 : c2.keySet()) {
                        getcurrofficebusinessfield.c(str2, realmSet$prevWorkPeriod.e(c2.get(str2)));
                    }
                    return getcurrofficebusinessfield;
                } else if (c == 3) {
                    realmSet$flagBCAAccount.b("getTimestamp", 0, list);
                    return new getCreditCardSupplements(Double.valueOf((double) this.e.e().d()));
                } else if (c == 4) {
                    realmSet$flagBCAAccount.b("setEventName", 1, list);
                    getCustomerFullName a = realmset_ccotherbankcreditcards2.a(list.get(0));
                    if (g.equals(a) || h.equals(a)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    this.e.e().c(a.d());
                    return new getEmergencyContactMobileNumber(a.d());
                } else if (c != 5) {
                    return c(str, realmset_ccotherbankcreditcards2, list);
                } else {
                    realmSet$flagBCAAccount.b("setParamValue", 2, list);
                    String d = realmset_ccotherbankcreditcards2.a(list.get(0)).d();
                    getCustomerFullName a2 = realmset_ccotherbankcreditcards2.a(list.get(1));
                    this.e.e().e(d, realmSet$flagBCAAccount.d(a2));
                    return a2;
                }
            }
        };
        for (Integer num : this.a.keySet()) {
            getCreditCardOptions e = getccotherbankaccounts.e().clone();
            int e2 = e(realmset_ccotherbankcreditcards, this.a.get(num), realmget_annualfeebasicamount);
            if (e2 == 2 || e2 == -1) {
                getccotherbankaccounts.c(e);
            }
        }
        for (Integer num2 : this.e.keySet()) {
            e(realmset_ccotherbankcreditcards, this.e.get(num2), realmget_annualfeebasicamount);
        }
    }

    public final void d(String str, int i, getDraft getdraft, String str2) {
        TreeMap<Integer, getDraft> treeMap;
        if ("create".equals(str2)) {
            treeMap = this.e;
        } else if ("edit".equals(str2)) {
            treeMap = this.a;
        } else {
            String valueOf = String.valueOf(str2);
            throw new IllegalStateException(valueOf.length() != 0 ? "Unknown callback type: ".concat(valueOf) : new String("Unknown callback type: "));
        }
        int i2 = i;
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i2 = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i2), getdraft);
    }
}
