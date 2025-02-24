package o;

import java.util.TimeZone;
/* loaded from: classes2-dex2jar.jar:o/CC14FormKartuKreditFragment.class */
public final class CC14FormKartuKreditFragment {
    private static final TimeZone d = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0424, code lost:
        if (r0.isEmpty() != false) goto L_0x0427;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023a A[Catch: IndexOutOfBoundsException -> 0x03e4, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x03df, IllegalArgumentException -> 0x03da, TRY_LEAVE, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x03df, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0019, B:15:0x003b, B:17:0x004b, B:26:0x006d, B:28:0x007d, B:35:0x0092, B:37:0x009a, B:42:0x00c4, B:44:0x00d5, B:53:0x00fb, B:55:0x010d, B:63:0x012e, B:65:0x0136, B:73:0x0157, B:79:0x0177, B:81:0x0180, B:89:0x01ad, B:101:0x0231, B:103:0x023a, B:106:0x0249, B:111:0x0265, B:112:0x0292, B:114:0x0294, B:117:0x02a7, B:119:0x02ca, B:121:0x02dc, B:124:0x02e9, B:126:0x031c, B:129:0x0330, B:130:0x0368, B:132:0x036c, B:133:0x0371, B:133:0x0371, B:134:0x0374, B:136:0x03cb, B:136:0x03cb, B:137:0x03ce, B:138:0x03d9), top: B:151:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03cb A[Catch: IndexOutOfBoundsException -> 0x03e4, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x03df, IllegalArgumentException -> 0x03da, IndexOutOfBoundsException -> 0x03e4, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x03df, IllegalArgumentException -> 0x03da, TRY_ENTER, TRY_LEAVE, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x03df, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0019, B:15:0x003b, B:17:0x004b, B:26:0x006d, B:28:0x007d, B:35:0x0092, B:37:0x009a, B:42:0x00c4, B:44:0x00d5, B:53:0x00fb, B:55:0x010d, B:63:0x012e, B:65:0x0136, B:73:0x0157, B:79:0x0177, B:81:0x0180, B:89:0x01ad, B:101:0x0231, B:103:0x023a, B:106:0x0249, B:111:0x0265, B:112:0x0292, B:114:0x0294, B:117:0x02a7, B:119:0x02ca, B:121:0x02dc, B:124:0x02e9, B:126:0x031c, B:129:0x0330, B:130:0x0368, B:132:0x036c, B:133:0x0371, B:133:0x0371, B:134:0x0374, B:136:0x03cb, B:136:0x03cb, B:137:0x03ce, B:138:0x03d9), top: B:151:0x0000 }] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static java.util.Date c(java.lang.String r5, java.text.ParsePosition r6) throws java.text.ParseException {
        /*
        // Method dump skipped, instructions count: 1163
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CC14FormKartuKreditFragment.c(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int e(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    private static int e(String str, int i, int i2) throws NumberFormatException {
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
