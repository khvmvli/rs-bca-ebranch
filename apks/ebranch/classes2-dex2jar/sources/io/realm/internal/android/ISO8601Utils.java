package io.realm.internal.android;

import java.util.TimeZone;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/android/ISO8601Utils.class */
public class ISO8601Utils {
    private static final TimeZone TIMEZONE_UTC;
    private static final TimeZone TIMEZONE_Z;
    private static final String UTC_ID = "UTC";

    static {
        TimeZone timeZone = TimeZone.getTimeZone(UTC_ID);
        TIMEZONE_UTC = timeZone;
        TIMEZONE_Z = timeZone;
    }

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0388, code lost:
        if (r0.isEmpty() != false) goto L_0x038b;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x032f A[Catch: NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0348, NumberFormatException -> 0x0343, IllegalArgumentException -> 0x033e, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0348, NumberFormatException -> 0x0343, IllegalArgumentException -> 0x033e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0348, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0013, B:11:0x0025, B:13:0x002f, B:18:0x0042, B:20:0x005a, B:22:0x0063, B:27:0x008f, B:29:0x0099, B:34:0x00ab, B:36:0x00b5, B:40:0x00c3, B:42:0x00cb, B:50:0x00e8, B:57:0x0111, B:61:0x0121, B:72:0x0194, B:74:0x019d, B:77:0x01ac, B:82:0x01c8, B:83:0x01f5, B:85:0x01f7, B:87:0x020c, B:89:0x0215, B:91:0x0238, B:93:0x0240, B:96:0x024d, B:98:0x0280, B:101:0x0294, B:102:0x02cc, B:104:0x02d0, B:105:0x02d5, B:105:0x02d5, B:106:0x02d8, B:108:0x032f, B:108:0x032f, B:109:0x0332, B:110:0x033d), top: B:123:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019d A[Catch: NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0348, NumberFormatException -> 0x0343, IllegalArgumentException -> 0x033e, TRY_LEAVE, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0348, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0013, B:11:0x0025, B:13:0x002f, B:18:0x0042, B:20:0x005a, B:22:0x0063, B:27:0x008f, B:29:0x0099, B:34:0x00ab, B:36:0x00b5, B:40:0x00c3, B:42:0x00cb, B:50:0x00e8, B:57:0x0111, B:61:0x0121, B:72:0x0194, B:74:0x019d, B:77:0x01ac, B:82:0x01c8, B:83:0x01f5, B:85:0x01f7, B:87:0x020c, B:89:0x0215, B:91:0x0238, B:93:0x0240, B:96:0x024d, B:98:0x0280, B:101:0x0294, B:102:0x02cc, B:104:0x02d0, B:105:0x02d5, B:105:0x02d5, B:106:0x02d8, B:108:0x032f, B:108:0x032f, B:109:0x0332, B:110:0x033d), top: B:123:0x0000 }] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static java.util.Date parse(java.lang.String r5, java.text.ParsePosition r6) throws java.text.ParseException {
        /*
        // Method dump skipped, instructions count: 1007
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.internal.android.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i3 = -digit;
            } else {
                StringBuilder sb = new StringBuilder("Invalid number: ");
                sb.append(str.substring(i, i2));
                throw new NumberFormatException(sb.toString());
            }
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i4++;
            } else {
                StringBuilder sb2 = new StringBuilder("Invalid number: ");
                sb2.append(str.substring(i, i2));
                throw new NumberFormatException(sb2.toString());
            }
        }
        return -i3;
    }
}
