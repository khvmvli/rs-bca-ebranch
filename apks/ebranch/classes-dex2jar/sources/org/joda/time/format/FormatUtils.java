package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
/* loaded from: classes-dex2jar.jar:org/joda/time/format/FormatUtils.class */
public class FormatUtils {
    private static final double LOG_10 = Math.log(10.0d);

    private FormatUtils() {
    }

    public static void appendPaddedInteger(Appendable appendable, int i, int i2) throws IOException {
        int i3 = i;
        if (i < 0) {
            appendable.append('-');
            if (i != Integer.MIN_VALUE) {
                i3 = -i;
            } else {
                for (int i4 = i2; i4 > 10; i4--) {
                    appendable.append('0');
                }
                appendable.append("2147483648");
                return;
            }
        }
        if (i3 < 10) {
            while (i2 > 1) {
                appendable.append('0');
                i2--;
            }
            appendable.append((char) (i3 + 48));
        } else if (i3 < 100) {
            while (i2 > 2) {
                appendable.append('0');
                i2--;
            }
            int i5 = ((i3 + 1) * 13421772) >> 27;
            appendable.append((char) (i5 + 48));
            appendable.append((char) (((i3 - (i5 << 3)) - (i5 << 1)) + 48));
        } else {
            int log = i3 < 1000 ? 3 : i3 < 10000 ? 4 : ((int) (Math.log((double) i3) / LOG_10)) + 1;
            while (i2 > log) {
                appendable.append('0');
                i2--;
            }
            appendable.append(Integer.toString(i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [long] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void appendPaddedInteger(java.lang.Appendable r5, long r6, int r8) throws java.io.IOException {
        /*
            r0 = r6
            int r0 = (int) r0
            r9 = r0
            r0 = r9
            long r0 = (long) r0
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0014
            r0 = r5
            r1 = r9
            r2 = r8
            appendPaddedInteger(r0, r1, r2)
            return
        L_0x0014:
            r0 = r8
            r1 = 19
            if (r0 > r1) goto L_0x0026
            r0 = r5
            r1 = r6
            java.lang.String r1 = java.lang.Long.toString(r1)
            java.lang.Appendable r0 = r0.append(r1)
            return
        L_0x0026:
            r0 = r6
            r10 = r0
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x006a
            r0 = r5
            r1 = 45
            java.lang.Appendable r0 = r0.append(r1)
            r0 = r8
            r9 = r0
            r0 = r6
            r1 = -9223372036854775808
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x004a
            r0 = r6
            long r0 = -r0
            r10 = r0
            goto L_0x006a
        L_0x004a:
            r0 = r9
            r1 = 19
            if (r0 <= r1) goto L_0x0060
            r0 = r5
            r1 = 48
            java.lang.Appendable r0 = r0.append(r1)
            int r9 = r9 + -1
            goto L_0x004a
        L_0x0060:
            r0 = r5
            java.lang.String r1 = "9223372036854775808"
            java.lang.Appendable r0 = r0.append(r1)
            return
        L_0x006a:
            r0 = r10
            double r0 = (double) r0
            double r0 = java.lang.Math.log(r0)
            double r1 = org.joda.time.format.FormatUtils.LOG_10
            double r0 = r0 / r1
            int r0 = (int) r0
            r9 = r0
        L_0x0077:
            r0 = r8
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            if (r0 <= r1) goto L_0x008e
            r0 = r5
            r1 = 48
            java.lang.Appendable r0 = r0.append(r1)
            int r8 = r8 + -1
            goto L_0x0077
        L_0x008e:
            r0 = r5
            r1 = r10
            java.lang.String r1 = java.lang.Long.toString(r1)
            java.lang.Appendable r0 = r0.append(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.FormatUtils.appendPaddedInteger(java.lang.Appendable, long, int):void");
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, int i, int i2) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, i, i2);
        } catch (IOException e) {
        }
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, long j, int i) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, j, i);
        } catch (IOException e) {
        }
    }

    public static void appendUnpaddedInteger(Appendable appendable, int i) throws IOException {
        int i2 = i;
        if (i < 0) {
            appendable.append('-');
            if (i != Integer.MIN_VALUE) {
                i2 = -i;
            } else {
                appendable.append("2147483648");
                return;
            }
        }
        if (i2 < 10) {
            appendable.append((char) (i2 + 48));
        } else if (i2 < 100) {
            int i3 = ((i2 + 1) * 13421772) >> 27;
            appendable.append((char) (i3 + 48));
            appendable.append((char) (((i2 - (i3 << 3)) - (i3 << 1)) + 48));
        } else {
            appendable.append(Integer.toString(i2));
        }
    }

    public static void appendUnpaddedInteger(Appendable appendable, long j) throws IOException {
        int i = (int) j;
        if (((long) i) == j) {
            appendUnpaddedInteger(appendable, i);
        } else {
            appendable.append(Long.toString(j));
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, int i) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, i);
        } catch (IOException e) {
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, long j) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, j);
        } catch (IOException e) {
        }
    }

    public static int calculateDigitCount(long j) {
        int i = 1;
        if (j >= 0) {
            if (j >= 10) {
                i = j < 100 ? 2 : j < 1000 ? 3 : j < 10000 ? 4 : 1 + ((int) (Math.log((double) j) / LOG_10));
            }
            return i;
        } else if (j != Long.MIN_VALUE) {
            return calculateDigitCount(-j) + 1;
        } else {
            return 20;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String createErrorMessage(String str, int i) {
        int i2 = i + 32;
        String concat = str.length() <= i2 + 3 ? str : str.substring(0, i2).concat("...");
        if (i <= 0) {
            StringBuilder sb = new StringBuilder("Invalid format: \"");
            sb.append(concat);
            sb.append('\"');
            return sb.toString();
        } else if (i >= str.length()) {
            StringBuilder sb2 = new StringBuilder("Invalid format: \"");
            sb2.append(concat);
            sb2.append("\" is too short");
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder("Invalid format: \"");
            sb3.append(concat);
            sb3.append("\" is malformed at \"");
            sb3.append(concat.substring(i));
            sb3.append('\"');
            return sb3.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int parseTwoDigits(CharSequence charSequence, int i) {
        int charAt = charSequence.charAt(i) - '0';
        return (((charAt << 3) + (charAt << 1)) + charSequence.charAt(i + 1)) - 48;
    }

    public static void writePaddedInteger(Writer writer, int i, int i2) throws IOException {
        int i3 = i;
        if (i < 0) {
            writer.write(45);
            if (i != Integer.MIN_VALUE) {
                i3 = -i;
            } else {
                for (int i4 = i2; i4 > 10; i4--) {
                    writer.write(48);
                }
                writer.write("2147483648");
                return;
            }
        }
        if (i3 < 10) {
            while (i2 > 1) {
                writer.write(48);
                i2--;
            }
            writer.write(i3 + 48);
        } else if (i3 < 100) {
            while (i2 > 2) {
                writer.write(48);
                i2--;
            }
            int i5 = ((i3 + 1) * 13421772) >> 27;
            writer.write(i5 + 48);
            writer.write(((i3 - (i5 << 3)) - (i5 << 1)) + 48);
        } else {
            int log = i3 < 1000 ? 3 : i3 < 10000 ? 4 : ((int) (Math.log((double) i3) / LOG_10)) + 1;
            while (i2 > log) {
                writer.write(48);
                i2--;
            }
            writer.write(Integer.toString(i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [long] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void writePaddedInteger(java.io.Writer r5, long r6, int r8) throws java.io.IOException {
        /*
            r0 = r6
            int r0 = (int) r0
            r9 = r0
            r0 = r9
            long r0 = (long) r0
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0014
            r0 = r5
            r1 = r9
            r2 = r8
            writePaddedInteger(r0, r1, r2)
            return
        L_0x0014:
            r0 = r8
            r1 = 19
            if (r0 > r1) goto L_0x0023
            r0 = r5
            r1 = r6
            java.lang.String r1 = java.lang.Long.toString(r1)
            r0.write(r1)
            return
        L_0x0023:
            r0 = r6
            r10 = r0
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005e
            r0 = r5
            r1 = 45
            r0.write(r1)
            r0 = r8
            r9 = r0
            r0 = r6
            r1 = -9223372036854775808
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0044
            r0 = r6
            long r0 = -r0
            r10 = r0
            goto L_0x005e
        L_0x0044:
            r0 = r9
            r1 = 19
            if (r0 <= r1) goto L_0x0057
            r0 = r5
            r1 = 48
            r0.write(r1)
            int r9 = r9 + -1
            goto L_0x0044
        L_0x0057:
            r0 = r5
            java.lang.String r1 = "9223372036854775808"
            r0.write(r1)
            return
        L_0x005e:
            r0 = r10
            double r0 = (double) r0
            double r0 = java.lang.Math.log(r0)
            double r1 = org.joda.time.format.FormatUtils.LOG_10
            double r0 = r0 / r1
            int r0 = (int) r0
            r9 = r0
        L_0x006b:
            r0 = r8
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            if (r0 <= r1) goto L_0x007f
            r0 = r5
            r1 = 48
            r0.write(r1)
            int r8 = r8 + -1
            goto L_0x006b
        L_0x007f:
            r0 = r5
            r1 = r10
            java.lang.String r1 = java.lang.Long.toString(r1)
            r0.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.FormatUtils.writePaddedInteger(java.io.Writer, long, int):void");
    }

    public static void writeUnpaddedInteger(Writer writer, int i) throws IOException {
        int i2 = i;
        if (i < 0) {
            writer.write(45);
            if (i != Integer.MIN_VALUE) {
                i2 = -i;
            } else {
                writer.write("2147483648");
                return;
            }
        }
        if (i2 < 10) {
            writer.write(i2 + 48);
        } else if (i2 < 100) {
            int i3 = ((i2 + 1) * 13421772) >> 27;
            writer.write(i3 + 48);
            writer.write(((i2 - (i3 << 3)) - (i3 << 1)) + 48);
        } else {
            writer.write(Integer.toString(i2));
        }
    }

    public static void writeUnpaddedInteger(Writer writer, long j) throws IOException {
        int i = (int) j;
        if (((long) i) == j) {
            writeUnpaddedInteger(writer, i);
        } else {
            writer.write(Long.toString(j));
        }
    }
}
