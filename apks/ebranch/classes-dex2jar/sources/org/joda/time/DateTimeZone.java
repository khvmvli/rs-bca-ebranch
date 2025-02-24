package org.joda.time;

import com.facebook.stetho.websocket.CloseCodes;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.FormatUtils;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;
/* loaded from: classes-dex2jar.jar:org/joda/time/DateTimeZone.class */
public abstract class DateTimeZone implements Serializable {
    private static final int MAX_MILLIS;
    private static final long serialVersionUID;
    private final String iID;
    public static final DateTimeZone UTC = UTCDateTimeZone.INSTANCE;
    private static final AtomicReference<Provider> cProvider = new AtomicReference<>();
    private static final AtomicReference<NameProvider> cNameProvider = new AtomicReference<>();
    private static final AtomicReference<DateTimeZone> cDefault = new AtomicReference<>();

    /* loaded from: classes-dex2jar.jar:org/joda/time/DateTimeZone$LazyInit.class */
    public static final class LazyInit {
        static final Map<String, String> CONVERSION_MAP = buildMap();
        static final DateTimeFormatter OFFSET_FORMATTER = buildFormatter();

        LazyInit() {
        }

        private static DateTimeFormatter buildFormatter() {
            return new DateTimeFormatterBuilder().appendTimeZoneOffset(null, true, 2, 4).toFormatter().withChronology(new BaseChronology() { // from class: org.joda.time.DateTimeZone.LazyInit.1
                private static final long serialVersionUID;

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public DateTimeZone getZone() {
                    return null;
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology, java.lang.Object
                public String toString() {
                    return getClass().getName();
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public Chronology withUTC() {
                    return this;
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public Chronology withZone(DateTimeZone dateTimeZone) {
                    return this;
                }
            });
        }

        private static Map<String, String> buildMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("GMT", "UTC");
            hashMap.put("WET", "WET");
            hashMap.put("CET", "CET");
            hashMap.put("MET", "CET");
            hashMap.put("ECT", "CET");
            hashMap.put("EET", "EET");
            hashMap.put("MIT", "Pacific/Apia");
            hashMap.put("HST", "Pacific/Honolulu");
            hashMap.put("AST", "America/Anchorage");
            hashMap.put("PST", "America/Los_Angeles");
            hashMap.put("MST", "America/Denver");
            hashMap.put("PNT", "America/Phoenix");
            hashMap.put("CST", "America/Chicago");
            hashMap.put("EST", "America/New_York");
            hashMap.put("IET", "America/Indiana/Indianapolis");
            hashMap.put("PRT", "America/Puerto_Rico");
            hashMap.put("CNT", "America/St_Johns");
            hashMap.put("AGT", "America/Argentina/Buenos_Aires");
            hashMap.put("BET", "America/Sao_Paulo");
            hashMap.put("ART", "Africa/Cairo");
            hashMap.put("CAT", "Africa/Harare");
            hashMap.put("EAT", "Africa/Addis_Ababa");
            hashMap.put("NET", "Asia/Yerevan");
            hashMap.put("PLT", "Asia/Karachi");
            hashMap.put("IST", "Asia/Kolkata");
            hashMap.put("BST", "Asia/Dhaka");
            hashMap.put("VST", "Asia/Ho_Chi_Minh");
            hashMap.put("CTT", "Asia/Shanghai");
            hashMap.put("JST", "Asia/Tokyo");
            hashMap.put("ACT", "Australia/Darwin");
            hashMap.put("AET", "Australia/Sydney");
            hashMap.put("SST", "Pacific/Guadalcanal");
            hashMap.put("NST", "Pacific/Auckland");
            return Collections.unmodifiableMap(hashMap);
        }
    }

    /* loaded from: classes-dex2jar.jar:org/joda/time/DateTimeZone$Stub.class */
    static final class Stub implements Serializable {
        private static final long serialVersionUID;
        private transient String iID;

        Stub(String str) {
            this.iID = str;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            this.iID = objectInputStream.readUTF();
        }

        private Object readResolve() throws ObjectStreamException {
            return DateTimeZone.forID(this.iID);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeUTF(this.iID);
        }
    }

    public DateTimeZone(String str) {
        if (str != null) {
            this.iID = str;
            return;
        }
        throw new IllegalArgumentException("Id must not be null");
    }

    private static String convertToAsciiNumber(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            int digit = Character.digit(sb.charAt(i), 10);
            if (digit >= 0) {
                sb.setCharAt(i, (char) (digit + 48));
            }
        }
        return sb.toString();
    }

    private static DateTimeZone fixedOffsetZone(String str, int i) {
        return i == 0 ? UTC : new FixedDateTimeZone(str, null, i, i);
    }

    @FromString
    public static DateTimeZone forID(String str) {
        if (str == null) {
            return getDefault();
        }
        if (str.equals("UTC")) {
            return UTC;
        }
        DateTimeZone zone = getProvider().getZone(str);
        if (zone != null) {
            return zone;
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            int parseOffset = parseOffset(str);
            return ((long) parseOffset) == 0 ? UTC : fixedOffsetZone(printOffset(parseOffset), parseOffset);
        }
        StringBuilder sb = new StringBuilder("The datetime zone id '");
        sb.append(str);
        sb.append("' is not recognised");
        throw new IllegalArgumentException(sb.toString());
    }

    public static DateTimeZone forOffsetHours(int i) throws IllegalArgumentException {
        return forOffsetHoursMinutes(i, 0);
    }

    public static DateTimeZone forOffsetHoursMinutes(int i, int i2) throws IllegalArgumentException {
        int abs;
        if (i == 0 && i2 == 0) {
            return UTC;
        }
        if (i < -23 || i > 23) {
            StringBuilder sb = new StringBuilder("Hours out of range: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < -59 || i2 > 59) {
            StringBuilder sb2 = new StringBuilder("Minutes out of range: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i <= 0 || i2 >= 0) {
            int i3 = i * 60;
            if (i3 < 0) {
                try {
                    abs = i3 - Math.abs(i2);
                } catch (ArithmeticException e) {
                    throw new IllegalArgumentException("Offset is too large");
                }
            } else {
                abs = i3 + i2;
            }
            return forOffsetMillis(FieldUtils.safeMultiply(abs, 60000));
        } else {
            StringBuilder sb3 = new StringBuilder("Positive hours must not have negative minutes: ");
            sb3.append(i2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public static DateTimeZone forOffsetMillis(int i) {
        if (i >= -86399999 && i <= MAX_MILLIS) {
            return fixedOffsetZone(printOffset(i), i);
        }
        StringBuilder sb = new StringBuilder("Millis out of range: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static DateTimeZone forTimeZone(TimeZone timeZone) {
        if (timeZone == null) {
            return getDefault();
        }
        String id = timeZone.getID();
        if (id == null) {
            throw new IllegalArgumentException("The TimeZone id must not be null");
        } else if (id.equals("UTC")) {
            return UTC;
        } else {
            String convertedId = getConvertedId(id);
            Provider provider = getProvider();
            DateTimeZone zone = convertedId != null ? provider.getZone(convertedId) : null;
            DateTimeZone dateTimeZone = zone;
            if (zone == null) {
                dateTimeZone = provider.getZone(id);
            }
            if (dateTimeZone != null) {
                return dateTimeZone;
            }
            if (convertedId != null || (!id.startsWith("GMT+") && !id.startsWith("GMT-"))) {
                StringBuilder sb = new StringBuilder("The datetime zone id '");
                sb.append(id);
                sb.append("' is not recognised");
                throw new IllegalArgumentException(sb.toString());
            }
            String substring = id.substring(3);
            String str = substring;
            if (substring.length() > 2) {
                char charAt = substring.charAt(1);
                str = substring;
                if (charAt > '9') {
                    str = substring;
                    if (Character.isDigit(charAt)) {
                        str = convertToAsciiNumber(substring);
                    }
                }
            }
            int parseOffset = parseOffset(str);
            return ((long) parseOffset) == 0 ? UTC : fixedOffsetZone(printOffset(parseOffset), parseOffset);
        }
    }

    public static Set<String> getAvailableIDs() {
        return getProvider().getAvailableIDs();
    }

    private static String getConvertedId(String str) {
        return LazyInit.CONVERSION_MAP.get(str);
    }

    public static DateTimeZone getDefault() {
        boolean z;
        DateTimeZone dateTimeZone = cDefault.get();
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            DateTimeZone dateTimeZone3 = dateTimeZone;
            try {
                try {
                    String property = System.getProperty("user.timezone");
                    dateTimeZone3 = dateTimeZone;
                    if (property != null) {
                        dateTimeZone3 = forID(property);
                    }
                } catch (IllegalArgumentException e) {
                }
            } catch (RuntimeException e2) {
                dateTimeZone3 = dateTimeZone;
            }
            dateTimeZone3 = dateTimeZone3;
            if (dateTimeZone3 == null) {
                dateTimeZone3 = forTimeZone(TimeZone.getDefault());
            }
            dateTimeZone2 = dateTimeZone3;
            if (dateTimeZone3 == null) {
                dateTimeZone2 = UTC;
            }
            AtomicReference<DateTimeZone> atomicReference = cDefault;
            while (true) {
                if (!atomicReference.compareAndSet(null, dateTimeZone2)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                dateTimeZone2 = atomicReference.get();
            }
        }
        return dateTimeZone2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static org.joda.time.tz.NameProvider getDefaultNameProvider() {
        /*
            java.lang.String r0 = "org.joda.time.DateTimeZone.NameProvider"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: SecurityException -> 0x0037
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0025
            r0 = r3
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: Exception -> 0x0019, SecurityException -> 0x0037
            java.lang.Object r0 = r0.newInstance()     // Catch: Exception -> 0x0019, SecurityException -> 0x0037
            org.joda.time.tz.NameProvider r0 = (org.joda.time.tz.NameProvider) r0     // Catch: Exception -> 0x0019, SecurityException -> 0x0037
            r3 = r0
            goto L_0x0027
        L_0x0019:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: SecurityException -> 0x0037
            r3 = r0
            r0 = r3
            r1 = r4
            r0.<init>(r1)     // Catch: SecurityException -> 0x0037
            r0 = r3
            throw r0     // Catch: SecurityException -> 0x0037
        L_0x0025:
            r0 = 0
            r3 = r0
        L_0x0027:
            r0 = r3
            r4 = r0
            r0 = r3
            if (r0 != 0) goto L_0x0035
            org.joda.time.tz.DefaultNameProvider r0 = new org.joda.time.tz.DefaultNameProvider
            r1 = r0
            r1.<init>()
            r4 = r0
        L_0x0035:
            r0 = r4
            return r0
        L_0x0037:
            r3 = move-exception
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeZone.getDefaultNameProvider():org.joda.time.tz.NameProvider");
    }

    private static Provider getDefaultProvider() {
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.Provider");
            if (property != null) {
                try {
                    return validateProvider((Provider) Class.forName(property).newInstance());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (SecurityException e2) {
        }
        try {
            String property2 = System.getProperty("org.joda.time.DateTimeZone.Folder");
            if (property2 != null) {
                try {
                    return validateProvider(new ZoneInfoProvider(new File(property2)));
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            }
        } catch (SecurityException e4) {
        }
        try {
            return validateProvider(new ZoneInfoProvider("org/joda/time/tz/data"));
        } catch (Exception e5) {
            e5.printStackTrace();
            return new UTCProvider();
        }
    }

    public static NameProvider getNameProvider() {
        boolean z;
        AtomicReference<NameProvider> atomicReference = cNameProvider;
        NameProvider nameProvider = atomicReference.get();
        NameProvider nameProvider2 = nameProvider;
        if (nameProvider == null) {
            nameProvider2 = getDefaultNameProvider();
            while (true) {
                if (!atomicReference.compareAndSet(null, nameProvider2)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                nameProvider2 = atomicReference.get();
            }
        }
        return nameProvider2;
    }

    public static Provider getProvider() {
        boolean z;
        AtomicReference<Provider> atomicReference = cProvider;
        Provider provider = atomicReference.get();
        Provider provider2 = provider;
        if (provider == null) {
            provider2 = getDefaultProvider();
            while (true) {
                if (!atomicReference.compareAndSet(null, provider2)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                provider2 = atomicReference.get();
            }
        }
        return provider2;
    }

    private static int parseOffset(String str) {
        return -((int) LazyInit.OFFSET_FORMATTER.parseMillis(str));
    }

    private static String printOffset(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i = -i;
        }
        int i2 = i / 3600000;
        FormatUtils.appendPaddedInteger(stringBuffer, i2, 2);
        int i3 = i - (i2 * 3600000);
        int i4 = i3 / 60000;
        stringBuffer.append(':');
        FormatUtils.appendPaddedInteger(stringBuffer, i4, 2);
        int i5 = i3 - (i4 * 60000);
        if (i5 == 0) {
            return stringBuffer.toString();
        }
        int i6 = i5 / CloseCodes.NORMAL_CLOSURE;
        stringBuffer.append(':');
        FormatUtils.appendPaddedInteger(stringBuffer, i6, 2);
        int i7 = i5 - (i6 * CloseCodes.NORMAL_CLOSURE);
        if (i7 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        FormatUtils.appendPaddedInteger(stringBuffer, i7, 3);
        return stringBuffer.toString();
    }

    public static void setDefault(DateTimeZone dateTimeZone) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        if (dateTimeZone != null) {
            cDefault.set(dateTimeZone);
            return;
        }
        throw new IllegalArgumentException("The datetime zone must not be null");
    }

    public static void setNameProvider(NameProvider nameProvider) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setNameProvider"));
        }
        NameProvider nameProvider2 = nameProvider;
        if (nameProvider == null) {
            nameProvider2 = getDefaultNameProvider();
        }
        cNameProvider.set(nameProvider2);
    }

    public static void setProvider(Provider provider) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        if (provider == null) {
            provider = getDefaultProvider();
        } else {
            validateProvider(provider);
        }
        cProvider.set(provider);
    }

    private static Provider validateProvider(Provider provider) {
        Set<String> availableIDs = provider.getAvailableIDs();
        if (availableIDs == null || availableIDs.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        } else if (!availableIDs.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        } else if (UTC.equals(provider.getZone("UTC"))) {
            return provider;
        } else {
            throw new IllegalArgumentException("Invalid UTC zone provided");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [long] */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long adjustOffset(long r8, boolean r10) {
        /*
            r7 = this;
            r0 = r8
            r1 = 10800000(0xa4cb80, double:5.335909E-317)
            long r0 = r0 - r1
            r11 = r0
            r0 = r7
            r1 = r11
            int r0 = r0.getOffset(r1)
            long r0 = (long) r0
            r13 = r0
            r0 = r7
            r1 = 10800000(0xa4cb80, double:5.335909E-317)
            r2 = r8
            long r1 = r1 + r2
            int r0 = r0.getOffset(r1)
            long r0 = (long) r0
            r15 = r0
            r0 = r13
            r1 = r15
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0026
            r0 = r8
            return r0
        L_0x0026:
            r0 = r13
            r1 = r15
            long r0 = r0 - r1
            r13 = r0
            r0 = r7
            r1 = r11
            long r0 = r0.nextTransition(r1)
            r15 = r0
            r0 = r15
            r1 = r13
            long r0 = r0 - r1
            r17 = r0
            r0 = r8
            r11 = r0
            r0 = r8
            r1 = r17
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x007d
            r0 = r8
            r1 = r15
            r2 = r13
            long r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0056
            r0 = r8
            r11 = r0
            goto L_0x007d
        L_0x0056:
            r0 = r8
            r1 = r17
            long r0 = r0 - r1
            r1 = r13
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0070
            r0 = r8
            r11 = r0
            r0 = r10
            if (r0 != 0) goto L_0x006d
            r0 = r8
            r1 = r13
            long r0 = r0 - r1
            r11 = r0
        L_0x006d:
            r0 = r11
            return r0
        L_0x0070:
            r0 = r8
            r11 = r0
            r0 = r10
            if (r0 == 0) goto L_0x007d
            r0 = r8
            r1 = r13
            long r0 = r0 + r1
            r11 = r0
        L_0x007d:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeZone.adjustOffset(long, boolean):long");
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [long] */
    /* JADX WARN: Type inference failed for: r0v29, types: [long] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long convertLocalToUTC(long r7, boolean r9) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            int r0 = r0.getOffset(r1)
            r10 = r0
            r0 = r7
            r1 = r10
            long r1 = (long) r1
            long r0 = r0 - r1
            r11 = r0
            r0 = r6
            r1 = r11
            int r0 = r0.getOffset(r1)
            r13 = r0
            r0 = r10
            r1 = r13
            if (r0 == r1) goto L_0x007f
            r0 = r9
            if (r0 != 0) goto L_0x0026
            r0 = r10
            if (r0 >= 0) goto L_0x007f
        L_0x0026:
            r0 = r6
            r1 = r11
            long r0 = r0.nextTransition(r1)
            r14 = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r16 = r0
            r0 = r14
            r18 = r0
            r0 = r14
            r1 = r11
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0044
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = r0
        L_0x0044:
            r0 = r7
            r1 = r13
            long r1 = (long) r1
            long r0 = r0 - r1
            r11 = r0
            r0 = r6
            r1 = r11
            long r0 = r0.nextTransition(r1)
            r14 = r0
            r0 = r14
            r1 = r11
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005f
            r0 = r14
            r16 = r0
        L_0x005f:
            r0 = r18
            r1 = r16
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x007f
            r0 = r9
            if (r0 != 0) goto L_0x0072
            r0 = r10
            r13 = r0
            goto L_0x007f
        L_0x0072:
            org.joda.time.IllegalInstantException r0 = new org.joda.time.IllegalInstantException
            r1 = r0
            r2 = r7
            r3 = r6
            java.lang.String r3 = r3.getID()
            r1.<init>(r2, r3)
            throw r0
        L_0x007f:
            r0 = r13
            long r0 = (long) r0
            r16 = r0
            r0 = r7
            r1 = r16
            long r0 = r0 - r1
            r18 = r0
            r0 = r7
            r1 = r18
            long r0 = r0 ^ r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00aa
            r0 = r7
            r1 = r16
            long r0 = r0 ^ r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x009f
            goto L_0x00aa
        L_0x009f:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r1 = r0
            java.lang.String r2 = "Subtracting time zone offset caused overflow"
            r1.<init>(r2)
            throw r0
        L_0x00aa:
            r0 = r18
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeZone.convertLocalToUTC(long, boolean):long");
    }

    public long convertLocalToUTC(long j, boolean z, long j2) {
        int offset = getOffset(j2);
        long j3 = j - ((long) offset);
        return getOffset(j3) == offset ? j3 : convertLocalToUTC(j, z);
    }

    public long convertUTCToLocal(long j) {
        long offset = (long) getOffset(j);
        long j2 = j + offset;
        if ((j ^ j2) >= 0 || (j ^ offset) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    @Override // java.lang.Object
    public abstract boolean equals(Object obj);

    @ToString
    public final String getID() {
        return this.iID;
    }

    public long getMillisKeepLocal(DateTimeZone dateTimeZone, long j) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = getDefault();
        }
        return dateTimeZone2 == this ? j : dateTimeZone2.convertLocalToUTC(convertUTCToLocal(j), false, j);
    }

    public final String getName(long j) {
        return getName(j, null);
    }

    public String getName(long j, Locale locale) {
        Locale locale2 = locale;
        if (locale == null) {
            locale2 = Locale.getDefault();
        }
        String nameKey = getNameKey(j);
        if (nameKey == null) {
            return this.iID;
        }
        NameProvider nameProvider = getNameProvider();
        String name = nameProvider instanceof DefaultNameProvider ? ((DefaultNameProvider) nameProvider).getName(locale2, this.iID, nameKey, isStandardOffset(j)) : nameProvider.getName(locale2, this.iID, nameKey);
        return name != null ? name : printOffset(getOffset(j));
    }

    public abstract String getNameKey(long j);

    public abstract int getOffset(long j);

    public final int getOffset(ReadableInstant readableInstant) {
        return readableInstant == null ? getOffset(DateTimeUtils.currentTimeMillis()) : getOffset(readableInstant.getMillis());
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [long] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int getOffsetFromLocal(long r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            int r0 = r0.getOffset(r1)
            r8 = r0
            r0 = r6
            r1 = r8
            long r1 = (long) r1
            long r0 = r0 - r1
            r9 = r0
            r0 = r5
            r1 = r9
            int r0 = r0.getOffset(r1)
            r11 = r0
            r0 = r8
            r1 = r11
            if (r0 == r1) goto L_0x0063
            r0 = r8
            r1 = r11
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x008c
            r0 = r5
            r1 = r9
            long r0 = r0.nextTransition(r1)
            r12 = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r14 = r0
            r0 = r12
            r16 = r0
            r0 = r12
            r1 = r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003f
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r16 = r0
        L_0x003f:
            r0 = r6
            r1 = r11
            long r1 = (long) r1
            long r0 = r0 - r1
            r12 = r0
            r0 = r5
            r1 = r12
            long r0 = r0.nextTransition(r1)
            r6 = r0
            r0 = r6
            r1 = r12
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            r0 = r14
            r6 = r0
            goto L_0x005a
        L_0x005a:
            r0 = r16
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x008c
            r0 = r8
            return r0
        L_0x0063:
            r0 = r8
            if (r0 < 0) goto L_0x008c
            r0 = r5
            r1 = r9
            long r0 = r0.previousTransition(r1)
            r6 = r0
            r0 = r6
            r1 = r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x008c
            r0 = r5
            r1 = r6
            int r0 = r0.getOffset(r1)
            r18 = r0
            r0 = r9
            r1 = r6
            long r0 = r0 - r1
            r1 = r18
            r2 = r8
            int r1 = r1 - r2
            long r1 = (long) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x008c
            r0 = r18
            return r0
        L_0x008c:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeZone.getOffsetFromLocal(long):int");
    }

    public final String getShortName(long j) {
        return getShortName(j, null);
    }

    public String getShortName(long j, Locale locale) {
        Locale locale2 = locale;
        if (locale == null) {
            locale2 = Locale.getDefault();
        }
        String nameKey = getNameKey(j);
        if (nameKey == null) {
            return this.iID;
        }
        NameProvider nameProvider = getNameProvider();
        String shortName = nameProvider instanceof DefaultNameProvider ? ((DefaultNameProvider) nameProvider).getShortName(locale2, this.iID, nameKey, isStandardOffset(j)) : nameProvider.getShortName(locale2, this.iID, nameKey);
        return shortName != null ? shortName : printOffset(getOffset(j));
    }

    public abstract int getStandardOffset(long j);

    @Override // java.lang.Object
    public int hashCode() {
        return getID().hashCode() + 57;
    }

    public abstract boolean isFixed();

    public boolean isLocalDateTimeGap(LocalDateTime localDateTime) {
        if (isFixed()) {
            return false;
        }
        try {
            localDateTime.toDateTime(this);
            return false;
        } catch (IllegalInstantException e) {
            return true;
        }
    }

    public boolean isStandardOffset(long j) {
        return getOffset(j) == getStandardOffset(j);
    }

    public abstract long nextTransition(long j);

    public abstract long previousTransition(long j);

    @Override // java.lang.Object
    public String toString() {
        return getID();
    }

    public TimeZone toTimeZone() {
        return TimeZone.getTimeZone(this.iID);
    }

    protected Object writeReplace() throws ObjectStreamException {
        return new Stub(this.iID);
    }
}
