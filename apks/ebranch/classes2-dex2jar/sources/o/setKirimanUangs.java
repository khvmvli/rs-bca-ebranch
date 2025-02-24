package o;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import o.realmGet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/setKirimanUangs.class */
public abstract class setKirimanUangs {
    Boolean a;
    final int b;
    final String c;
    Boolean e;
    Long g;
    Long h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setKirimanUangs(String str, int i) {
        this.c = str;
        this.b = i;
    }

    static Boolean a(double d, realmGet.hmKelurahan hmkelurahan) {
        try {
            return b(new BigDecimal(d), hmkelurahan, Math.ulp(d));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    static Boolean a(String str, realmGet.hmKelurahan hmkelurahan) {
        if (!setAccounts.b(str)) {
            return null;
        }
        try {
            return b(new BigDecimal(str), hmkelurahan, 0.0d);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    static Boolean b(String str, realmGet.identityCardNumber identitycardnumber, setIsInputAtmPemrek setisinputatmpemrek) {
        List list;
        setFotoKtp.b(identitycardnumber);
        if (str == null || !identitycardnumber.d() || identitycardnumber.e() == realmGet.identityCardType.d) {
            return null;
        }
        if (identitycardnumber.e() == realmGet.identityCardType.g) {
            if (identitycardnumber.f() == 0) {
                return null;
            }
        } else if (!identitycardnumber.c()) {
            return null;
        }
        realmGet.identityCardType e = identitycardnumber.e();
        boolean j = identitycardnumber.j();
        String h = (j || e == realmGet.identityCardType.a || e == realmGet.identityCardType.g) ? identitycardnumber.h() : identitycardnumber.h().toUpperCase(Locale.ENGLISH);
        if (identitycardnumber.f() == 0) {
            list = null;
        } else {
            List<String> g = identitycardnumber.g();
            list = g;
            if (!j) {
                ArrayList arrayList = new ArrayList(g.size());
                for (String str2 : g) {
                    arrayList.add(str2.toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList(arrayList);
            }
        }
        return b(str, e, j, h, list, e == realmGet.identityCardType.a ? h : null, setisinputatmpemrek);
    }

    private static Boolean b(String str, realmGet.identityCardType identitycardtype, boolean z, String str2, List<String> list, String str3, setIsInputAtmPemrek setisinputatmpemrek) {
        if (identitycardtype == realmGet.identityCardType.g) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        String str4 = str;
        if (!z) {
            str4 = str;
            if (identitycardtype != realmGet.identityCardType.a) {
                str4 = str.toUpperCase(Locale.ENGLISH);
            }
        }
        realmGet.hmStayPeriod hmstayperiod = realmGet.hmStayPeriod.d;
        switch (identitycardtype.ordinal()) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str4).matches());
                } catch (PatternSyntaxException e) {
                    if (setisinputatmpemrek == null) {
                        return null;
                    }
                    setisinputatmpemrek.c().e("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                return Boolean.valueOf(str4.startsWith(str2));
            case 3:
                return Boolean.valueOf(str4.endsWith(str2));
            case 4:
                return Boolean.valueOf(str4.contains(str2));
            case 5:
                return Boolean.valueOf(str4.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str4));
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
        if (r14 != null) goto L_0x00ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    static java.lang.Boolean b(java.math.BigDecimal r7, o.realmGet.hmKelurahan r8, double r9) {
        /*
        // Method dump skipped, instructions count: 503
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setKirimanUangs.b(java.math.BigDecimal, o.realmGet$hmKelurahan, double):java.lang.Boolean");
    }

    static Boolean c(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    static Boolean e(long j, realmGet.hmKelurahan hmkelurahan) {
        try {
            return b(new BigDecimal(j), hmkelurahan, 0.0d);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean d();
}
