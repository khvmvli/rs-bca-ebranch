package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmSet$flagBCAAccount.class */
public final class realmSet$flagBCAAccount {
    public static void b(String str, int i, List<getCustomerFullName> list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static boolean b(getCustomerFullName getcustomerfullname) {
        if (getcustomerfullname == null) {
            return false;
        }
        Double a = getcustomerfullname.a();
        return !a.isNaN() && a.doubleValue() >= 0.0d && a.equals(Double.valueOf(Math.floor(a.doubleValue())));
    }

    public static long c(double d) {
        return ((long) e(d)) & 4294967295L;
    }

    public static boolean c(getCustomerFullName getcustomerfullname, getCustomerFullName getcustomerfullname2) {
        if (!getcustomerfullname.getClass().equals(getcustomerfullname2.getClass())) {
            return false;
        }
        if ((getcustomerfullname instanceof getEmergencyContactName) || (getcustomerfullname instanceof getCurrOfficeCity)) {
            return true;
        }
        if (!(getcustomerfullname instanceof getCreditCardSupplements)) {
            return getcustomerfullname instanceof getEmergencyContactMobileNumber ? getcustomerfullname.d().equals(getcustomerfullname2.d()) : getcustomerfullname instanceof getCurrCompanyName ? getcustomerfullname.b().equals(getcustomerfullname2.b()) : getcustomerfullname == getcustomerfullname2;
        }
        if (Double.isNaN(getcustomerfullname.a().doubleValue()) || Double.isNaN(getcustomerfullname2.a().doubleValue())) {
            return false;
        }
        return getcustomerfullname.a().equals(getcustomerfullname2.a());
    }

    public static double d(double d) {
        int i;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || i == 0) {
            return d;
        }
        return ((double) (i > 0 ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    public static Object d(getCustomerFullName getcustomerfullname) {
        if (getCustomerFullName.h.equals(getcustomerfullname)) {
            return null;
        }
        return getCustomerFullName.g.equals(getcustomerfullname) ? "" : !getcustomerfullname.a().isNaN() ? getcustomerfullname.a() : getcustomerfullname.d();
    }

    public static getFlagOtherCC d(String str) {
        getFlagOtherCC c = (str == null || str.isEmpty()) ? null : getFlagOtherCC.c(Integer.parseInt(str));
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static void d(String str, int i, List<getCustomerFullName> list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static int e(double d) {
        int i;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((long) ((((double) (i > 0 ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d));
    }

    public static int e(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards) {
        int e = e(realmset_ccotherbankcreditcards.e("runtime.counter").a().doubleValue() + 1.0d);
        if (e <= 1000000) {
            realmset_ccotherbankcreditcards.c("runtime.counter", new getCreditCardSupplements(Double.valueOf((double) e)));
            return e;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static void e(String str, int i, List<getCustomerFullName> list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }
}
