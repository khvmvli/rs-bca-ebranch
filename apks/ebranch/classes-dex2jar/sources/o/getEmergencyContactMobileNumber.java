package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes-dex2jar.jar:o/getEmergencyContactMobileNumber.class */
public final class getEmergencyContactMobileNumber implements Iterable<getCustomerFullName>, getCustomerFullName {
    private final String b;

    public getEmergencyContactMobileNumber(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    @Override // o.getCustomerFullName
    public final Double a() {
        if (this.b.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.b);
        } catch (NumberFormatException e) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // o.getCustomerFullName
    public final Boolean b() {
        return Boolean.valueOf(!this.b.isEmpty());
    }

    @Override // o.getCustomerFullName
    public final Iterator<getCustomerFullName> c() {
        return new getCurrWorkPeriod(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.getCustomerFullName
    public final getCustomerFullName c(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        char c;
        getCustomerFullName getcustomerfullname;
        int i;
        int i2;
        int i3;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str) || "trim".equals(str)) {
            switch (str.hashCode()) {
                case -1789698943:
                    if (str.equals("hasOwnProperty")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1776922004:
                    if (str.equals("toString")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1464939364:
                    if (str.equals("toLocaleLowerCase")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1361633751:
                    if (str.equals("charAt")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -726908483:
                    if (str.equals("toLocaleUpperCase")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -399551817:
                    if (str.equals("toUpperCase")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 3568674:
                    if (str.equals("trim")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 103668165:
                    if (str.equals("match")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 530542161:
                    if (str.equals("substring")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str2 = "undefined";
            String str3 = "";
            switch (c) {
                case 0:
                    realmSet$flagBCAAccount.e("charAt", 1, list);
                    int d = list.size() > 0 ? (int) realmSet$flagBCAAccount.d(realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue()) : 0;
                    String str4 = this.b;
                    if (d < 0 || d >= str4.length()) {
                        getcustomerfullname = getCustomerFullName.f144o;
                        break;
                    } else {
                        getcustomerfullname = new getEmergencyContactMobileNumber(String.valueOf(str4.charAt(d)));
                        break;
                    }
                    break;
                case 1:
                    if (list.size() != 0) {
                        StringBuilder sb = new StringBuilder(this.b);
                        for (int i4 = 0; i4 < list.size(); i4++) {
                            sb.append(realmset_ccotherbankcreditcards.a(list.get(i4)).d());
                        }
                        getcustomerfullname = new getEmergencyContactMobileNumber(sb.toString());
                        break;
                    }
                    getcustomerfullname = this;
                    break;
                case 2:
                    realmSet$flagBCAAccount.b("hasOwnProperty", 1, list);
                    String str5 = this.b;
                    getCustomerFullName a = realmset_ccotherbankcreditcards.a(list.get(0));
                    if ("length".equals(a.d())) {
                        getcustomerfullname = getCurrCompanyName.n;
                        break;
                    } else {
                        double doubleValue = a.a().doubleValue();
                        if (doubleValue != Math.floor(doubleValue) || (i = (int) doubleValue) < 0 || i >= str5.length()) {
                            getcustomerfullname = getCurrCompanyName.k;
                            break;
                        } else {
                            getcustomerfullname = getCurrCompanyName.n;
                            break;
                        }
                    }
                    break;
                case 3:
                    realmSet$flagBCAAccount.e("indexOf", 2, list);
                    String str6 = this.b;
                    if (list.size() > 0) {
                        str2 = realmset_ccotherbankcreditcards.a(list.get(0)).d();
                    }
                    getcustomerfullname = new getCreditCardSupplements(Double.valueOf((double) str6.indexOf(str2, (int) realmSet$flagBCAAccount.d(list.size() < 2 ? 0.0d : realmset_ccotherbankcreditcards.a(list.get(1)).a().doubleValue()))));
                    break;
                case 4:
                    realmSet$flagBCAAccount.e("lastIndexOf", 2, list);
                    String str7 = this.b;
                    if (list.size() > 0) {
                        str2 = realmset_ccotherbankcreditcards.a(list.get(0)).d();
                    }
                    double doubleValue2 = list.size() < 2 ? Double.NaN : realmset_ccotherbankcreditcards.a(list.get(1)).a().doubleValue();
                    getcustomerfullname = new getCreditCardSupplements(Double.valueOf((double) str7.lastIndexOf(str2, (int) (Double.isNaN(doubleValue2) ? Double.POSITIVE_INFINITY : realmSet$flagBCAAccount.d(doubleValue2)))));
                    break;
                case 5:
                    realmSet$flagBCAAccount.e("match", 1, list);
                    String str8 = this.b;
                    if (list.size() > 0) {
                        str3 = realmset_ccotherbankcreditcards.a(list.get(0)).d();
                    }
                    Matcher matcher = Pattern.compile(str3).matcher(str8);
                    if (matcher.find()) {
                        getcustomerfullname = new getCurrCompanyPosition(Arrays.asList(new getEmergencyContactMobileNumber(matcher.group())));
                        break;
                    } else {
                        getcustomerfullname = getCustomerFullName.h;
                        break;
                    }
                case 6:
                    realmSet$flagBCAAccount.e("replace", 2, list);
                    getCustomerFullName getcustomerfullname2 = getCustomerFullName.g;
                    getCustomerFullName getcustomerfullname3 = getcustomerfullname2;
                    if (list.size() > 0) {
                        String d2 = realmset_ccotherbankcreditcards.a(list.get(0)).d();
                        getcustomerfullname3 = getcustomerfullname2;
                        str2 = d2;
                        if (list.size() > 1) {
                            getcustomerfullname3 = realmset_ccotherbankcreditcards.a(list.get(1));
                            str2 = d2;
                        }
                    }
                    String str9 = this.b;
                    int indexOf = str9.indexOf(str2);
                    if (indexOf >= 0) {
                        if (getcustomerfullname3 instanceof getCurrCompanyBusinessType) {
                            getcustomerfullname3 = ((getCurrCompanyBusinessType) getcustomerfullname3).b(realmset_ccotherbankcreditcards, Arrays.asList(new getEmergencyContactMobileNumber(str2), new getCreditCardSupplements(Double.valueOf((double) indexOf)), this));
                        }
                        String substring = str9.substring(0, indexOf);
                        String d3 = getcustomerfullname3.d();
                        String substring2 = str9.substring(indexOf + str2.length());
                        StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + String.valueOf(d3).length() + String.valueOf(substring2).length());
                        sb2.append(substring);
                        sb2.append(d3);
                        sb2.append(substring2);
                        getcustomerfullname = new getEmergencyContactMobileNumber(sb2.toString());
                        break;
                    }
                    getcustomerfullname = this;
                    break;
                case 7:
                    realmSet$flagBCAAccount.e("search", 1, list);
                    if (list.size() > 0) {
                        str2 = realmset_ccotherbankcreditcards.a(list.get(0)).d();
                    }
                    Matcher matcher2 = Pattern.compile(str2).matcher(this.b);
                    if (matcher2.find()) {
                        getcustomerfullname = new getCreditCardSupplements(Double.valueOf((double) matcher2.start()));
                        break;
                    } else {
                        getcustomerfullname = new getCreditCardSupplements(Double.valueOf(-1.0d));
                        break;
                    }
                case '\b':
                    realmSet$flagBCAAccount.e("slice", 2, list);
                    String str10 = this.b;
                    double d4 = realmSet$flagBCAAccount.d(list.size() > 0 ? realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue() : 0.0d);
                    int max = (int) (d4 < 0.0d ? Math.max(((double) str10.length()) + d4, 0.0d) : Math.min(d4, (double) str10.length()));
                    double d5 = realmSet$flagBCAAccount.d(list.size() > 1 ? realmset_ccotherbankcreditcards.a(list.get(1)).a().doubleValue() : (double) str10.length());
                    getcustomerfullname = new getEmergencyContactMobileNumber(str10.substring(max, Math.max(0, ((int) (d5 < 0.0d ? Math.max(((double) str10.length()) + d5, 0.0d) : Math.min(d5, (double) str10.length()))) - max) + max));
                    break;
                case '\t':
                    realmSet$flagBCAAccount.e("split", 2, list);
                    String str11 = this.b;
                    if (str11.length() == 0) {
                        getcustomerfullname = new getCurrCompanyPosition(Arrays.asList(this));
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        if (list.size() == 0) {
                            arrayList.add(this);
                        } else {
                            String d6 = realmset_ccotherbankcreditcards.a(list.get(0)).d();
                            long c2 = list.size() > 1 ? realmSet$flagBCAAccount.c(realmset_ccotherbankcreditcards.a(list.get(1)).a().doubleValue()) : 2147483647L;
                            if (c2 == 0) {
                                getcustomerfullname = new getCurrCompanyPosition();
                                break;
                            } else {
                                String[] split = str11.split(Pattern.quote(d6), ((int) c2) + 1);
                                int length = split.length;
                                if (!d6.equals("") || length <= 0) {
                                    i3 = length;
                                    i2 = 0;
                                } else {
                                    boolean equals = split[0].equals("");
                                    int i5 = length - 1;
                                    i3 = i5;
                                    i2 = equals;
                                    if (!split[i5].equals("")) {
                                        i3 = length;
                                        i2 = equals;
                                    }
                                }
                                int i6 = i3;
                                int i7 = i2;
                                if (((long) length) > c2) {
                                    i6 = i3 - 1;
                                    i7 = i2;
                                }
                                while (i7 < i6) {
                                    arrayList.add(new getEmergencyContactMobileNumber(split[i7]));
                                    i7++;
                                }
                            }
                        }
                        getcustomerfullname = new getCurrCompanyPosition(arrayList);
                        break;
                    }
                case '\n':
                    realmSet$flagBCAAccount.e("substring", 2, list);
                    String str12 = this.b;
                    int d7 = list.size() > 0 ? (int) realmSet$flagBCAAccount.d(realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue()) : 0;
                    int d8 = list.size() > 1 ? (int) realmSet$flagBCAAccount.d(realmset_ccotherbankcreditcards.a(list.get(1)).a().doubleValue()) : str12.length();
                    int min = Math.min(Math.max(d7, 0), str12.length());
                    int min2 = Math.min(Math.max(d8, 0), str12.length());
                    getcustomerfullname = new getEmergencyContactMobileNumber(str12.substring(Math.min(min, min2), Math.max(min, min2)));
                    break;
                case 11:
                    realmSet$flagBCAAccount.b("toLocaleUpperCase", 0, list);
                    getcustomerfullname = new getEmergencyContactMobileNumber(this.b.toUpperCase());
                    break;
                case '\f':
                    realmSet$flagBCAAccount.b("toLocaleLowerCase", 0, list);
                    getcustomerfullname = new getEmergencyContactMobileNumber(this.b.toLowerCase());
                    break;
                case '\r':
                    realmSet$flagBCAAccount.b("toLowerCase", 0, list);
                    getcustomerfullname = new getEmergencyContactMobileNumber(this.b.toLowerCase(Locale.ENGLISH));
                    break;
                case 14:
                    realmSet$flagBCAAccount.b("toString", 0, list);
                    getcustomerfullname = this;
                    break;
                case 15:
                    realmSet$flagBCAAccount.b("toUpperCase", 0, list);
                    getcustomerfullname = new getEmergencyContactMobileNumber(this.b.toUpperCase(Locale.ENGLISH));
                    break;
                case 16:
                    realmSet$flagBCAAccount.b("toUpperCase", 0, list);
                    getcustomerfullname = new getEmergencyContactMobileNumber(this.b.trim());
                    break;
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
            return getcustomerfullname;
        }
        throw new IllegalArgumentException(String.format("%s is not a String function", str));
    }

    @Override // o.getCustomerFullName
    public final String d() {
        return this.b;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getEmergencyContactMobileNumber)) {
            return false;
        }
        return this.b.equals(((getEmergencyContactMobileNumber) obj).b);
    }

    @Override // o.getCustomerFullName
    public final getCustomerFullName h() {
        return new getEmergencyContactMobileNumber(this.b);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<getCustomerFullName> iterator() {
        return new getCurrOfficePostCode(this);
    }

    @Override // java.lang.Object
    public final String toString() {
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb.toString();
    }
}
