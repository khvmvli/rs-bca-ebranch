package o;
/* loaded from: classes-dex2jar.jar:o/DaftarTransferSetunFromUbahReservasiPresenter.class */
public class DaftarTransferSetunFromUbahReservasiPresenter extends DeleteTxnBerkalaPresenter {
    public static final String a(String str, String str2, String str3, boolean z) {
        int i;
        int e;
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        subscribeReservationRescheduleEvent.e(str3, "");
        String str4 = str;
        int i2 = 0;
        int e2 = CheckOTPSessionPresenter.e(str4, str2, 0, z);
        if (e2 < 0) {
            return str;
        }
        int length = str2.length();
        int i3 = 1;
        if (length >= 1) {
            i3 = length;
        }
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str4, i2, e2);
                sb.append(str3);
                i = e2 + length;
                if (e2 >= str.length()) {
                    break;
                }
                e = CheckOTPSessionPresenter.e(str4, str2, e2 + i3, z);
                i2 = i;
                e2 = e;
            } while (e > 0);
            sb.append((CharSequence) str4, i, str.length());
            String obj = sb.toString();
            subscribeReservationRescheduleEvent.d(obj, "");
            return obj;
        }
        throw new OutOfMemoryError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r7 != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final boolean a(java.lang.CharSequence r6) {
        /*
            r0 = r6
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.e(r0, r1)
            r0 = r6
            int r0 = r0.length()
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0070
            r0 = r6
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.e(r0, r1)
            o.setRegionPrefix r0 = new o.setRegionPrefix
            r1 = r0
            r2 = 0
            r3 = r6
            int r3 = r3.length()
            r4 = 1
            int r3 = r3 - r4
            r1.<init>(r2, r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        L_0x0032:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x006a
            r0 = r6
            r1 = r9
            o.clickSimpanNama r1 = (o.clickSimpanNama) r1
            int r1 = r1.c()
            char r0 = r0.charAt(r1)
            r10 = r0
            r0 = r10
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L_0x005f
            r0 = r10
            boolean r0 = java.lang.Character.isSpaceChar(r0)
            if (r0 != 0) goto L_0x005f
            r0 = 0
            r7 = r0
            goto L_0x0061
        L_0x005f:
            r0 = 1
            r7 = r0
        L_0x0061:
            r0 = r7
            if (r0 != 0) goto L_0x0032
            r0 = 0
            r7 = r0
            goto L_0x006c
        L_0x006a:
            r0 = 1
            r7 = r0
        L_0x006c:
            r0 = r7
            if (r0 == 0) goto L_0x0072
        L_0x0070:
            r0 = 1
            r8 = r0
        L_0x0072:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DaftarTransferSetunFromUbahReservasiPresenter.a(java.lang.CharSequence):boolean");
    }

    public static final boolean a(String str, String str2, boolean z) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        return !z ? str.startsWith(str2) : CheckOTPSessionPresenter.b(str, 0, str2, 0, str2.length(), z);
    }

    public static final boolean b(String str, int i, String str2, int i2, int i3, boolean z) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        return !z ? str.regionMatches(0, str2, i2, i3) : str.regionMatches(z, 0, str2, i2, i3);
    }

    public static final boolean d(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        return !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }
}
