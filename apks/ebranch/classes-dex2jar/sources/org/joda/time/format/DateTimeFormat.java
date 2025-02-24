package org.joda.time.format;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import org.joda.time.DateTime;
/* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormat.class */
public class DateTimeFormat {
    static final int DATE;
    static final int DATETIME;
    static final int FULL;
    static final int LONG;
    static final int MEDIUM;
    static final int NONE;
    private static final int PATTERN_CACHE_SIZE;
    static final int SHORT;
    static final int TIME;
    private static final ConcurrentHashMap<String, DateTimeFormatter> cPatternCache = new ConcurrentHashMap<>();
    private static final AtomicReferenceArray<DateTimeFormatter> cStyleCache = new AtomicReferenceArray<>(25);

    protected DateTimeFormat() {
    }

    public static void appendPatternTo(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        parsePatternTo(dateTimeFormatterBuilder, str);
    }

    private static DateTimeFormatter createDateTimeFormatter(int i, int i2) {
        StyleFormatter styleFormatter = new StyleFormatter(i, i2, i == 4 ? 1 : i2 == 4 ? 0 : 2);
        return new DateTimeFormatter((InternalPrinter) styleFormatter, (InternalParser) styleFormatter);
    }

    private static DateTimeFormatter createFormatterForPattern(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Invalid pattern specification");
        }
        ConcurrentHashMap<String, DateTimeFormatter> concurrentHashMap = cPatternCache;
        DateTimeFormatter dateTimeFormatter = concurrentHashMap.get(str);
        DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
        if (dateTimeFormatter == null) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
            parsePatternTo(dateTimeFormatterBuilder, str);
            DateTimeFormatter formatter = dateTimeFormatterBuilder.toFormatter();
            dateTimeFormatter2 = formatter;
            if (concurrentHashMap.size() < 500) {
                DateTimeFormatter putIfAbsent = concurrentHashMap.putIfAbsent(str, formatter);
                dateTimeFormatter2 = formatter;
                if (putIfAbsent != null) {
                    dateTimeFormatter2 = putIfAbsent;
                }
            }
        }
        return dateTimeFormatter2;
    }

    private static DateTimeFormatter createFormatterForStyle(String str) {
        if (str == null || str.length() != 2) {
            StringBuilder sb = new StringBuilder("Invalid style specification: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        int selectStyle = selectStyle(str.charAt(0));
        int selectStyle2 = selectStyle(str.charAt(1));
        if (selectStyle != 4 || selectStyle2 != 4) {
            return createFormatterForStyleIndex(selectStyle, selectStyle2);
        }
        throw new IllegalArgumentException("Style '--' is invalid");
    }

    private static DateTimeFormatter createFormatterForStyleIndex(int i, int i2) {
        boolean z;
        int i3 = (i << 2) + i + i2;
        AtomicReferenceArray<DateTimeFormatter> atomicReferenceArray = cStyleCache;
        if (i3 >= atomicReferenceArray.length()) {
            return createDateTimeFormatter(i, i2);
        }
        DateTimeFormatter dateTimeFormatter = atomicReferenceArray.get(i3);
        DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
        if (dateTimeFormatter == null) {
            dateTimeFormatter2 = createDateTimeFormatter(i, i2);
            while (true) {
                if (!atomicReferenceArray.compareAndSet(i3, null, dateTimeFormatter2)) {
                    if (atomicReferenceArray.get(i3) != null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                dateTimeFormatter2 = atomicReferenceArray.get(i3);
            }
        }
        return dateTimeFormatter2;
    }

    public static DateTimeFormatter forPattern(String str) {
        return createFormatterForPattern(str);
    }

    public static DateTimeFormatter forStyle(String str) {
        return createFormatterForStyle(str);
    }

    public static DateTimeFormatter fullDate() {
        return createFormatterForStyleIndex(0, 4);
    }

    public static DateTimeFormatter fullDateTime() {
        return createFormatterForStyleIndex(0, 0);
    }

    public static DateTimeFormatter fullTime() {
        return createFormatterForStyleIndex(4, 0);
    }

    private static boolean isNumericToken(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        switch (str.charAt(0)) {
            case 'C':
            case 'D':
            case 'F':
            case 'H':
            case 'K':
            case 'S':
            case 'W':
            case 'Y':
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cr:
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cv:
            case 'e':
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cu:
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz:
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB:
            case 's':
            case setHasDecor$MediaBrowserCompat$MediaItem.aJ:
            case 'x':
            case setHasDecor$MediaBrowserCompat$MediaItem.aI:
                return true;
            case 'M':
                return length <= 2;
            default:
                return false;
        }
    }

    public static DateTimeFormatter longDate() {
        return createFormatterForStyleIndex(1, 4);
    }

    public static DateTimeFormatter longDateTime() {
        return createFormatterForStyleIndex(1, 1);
    }

    public static DateTimeFormatter longTime() {
        return createFormatterForStyleIndex(4, 1);
    }

    public static DateTimeFormatter mediumDate() {
        return createFormatterForStyleIndex(2, 4);
    }

    public static DateTimeFormatter mediumDateTime() {
        return createFormatterForStyleIndex(2, 2);
    }

    public static DateTimeFormatter mediumTime() {
        return createFormatterForStyleIndex(4, 2);
    }

    private static void parsePatternTo(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        boolean z;
        int length = str.length();
        int[] iArr = new int[1];
        int i = 0;
        while (i < length) {
            iArr[0] = i;
            String parseToken = parseToken(str, iArr);
            int i2 = iArr[0];
            int length2 = parseToken.length();
            if (length2 != 0) {
                char charAt = parseToken.charAt(0);
                if (charAt == '\'') {
                    String substring = parseToken.substring(1);
                    if (substring.length() == 1) {
                        dateTimeFormatterBuilder.appendLiteral(substring.charAt(0));
                    } else {
                        dateTimeFormatterBuilder.appendLiteral(new String(substring));
                    }
                } else if (charAt == 'K') {
                    dateTimeFormatterBuilder.appendHourOfHalfday(length2);
                } else if (charAt != 'M') {
                    if (charAt == 'S') {
                        dateTimeFormatterBuilder.appendFractionOfSecond(length2, length2);
                    } else if (charAt == 'a') {
                        dateTimeFormatterBuilder.appendHalfdayOfDayText();
                    } else if (charAt == 'h') {
                        dateTimeFormatterBuilder.appendClockhourOfHalfday(length2);
                    } else if (charAt == 'k') {
                        dateTimeFormatterBuilder.appendClockhourOfDay(length2);
                    } else if (charAt == 'm') {
                        dateTimeFormatterBuilder.appendMinuteOfHour(length2);
                    } else if (charAt == 's') {
                        dateTimeFormatterBuilder.appendSecondOfMinute(length2);
                    } else if (charAt == 'G') {
                        dateTimeFormatterBuilder.appendEraText();
                    } else if (charAt != 'H') {
                        if (charAt != 'Y') {
                            if (charAt != 'Z') {
                                if (charAt == 'd') {
                                    dateTimeFormatterBuilder.appendDayOfMonth(length2);
                                } else if (charAt != 'e') {
                                    switch (charAt) {
                                        case 'C':
                                            dateTimeFormatterBuilder.appendCenturyOfEra(length2, length2);
                                            break;
                                        case 'D':
                                            dateTimeFormatterBuilder.appendDayOfYear(length2);
                                            break;
                                        case 'E':
                                            if (length2 < 4) {
                                                dateTimeFormatterBuilder.appendDayOfWeekShortText();
                                                break;
                                            } else {
                                                dateTimeFormatterBuilder.appendDayOfWeekText();
                                                break;
                                            }
                                        default:
                                            switch (charAt) {
                                                case setHasDecor$MediaBrowserCompat$MediaItem.aJ:
                                                    dateTimeFormatterBuilder.appendWeekOfWeekyear(length2);
                                                    break;
                                                case 'x':
                                                case setHasDecor$MediaBrowserCompat$MediaItem.aI:
                                                    break;
                                                case setHasDecor$MediaBrowserCompat$MediaItem.aH:
                                                    if (length2 < 4) {
                                                        dateTimeFormatterBuilder.appendTimeZoneShortName(null);
                                                        break;
                                                    } else {
                                                        dateTimeFormatterBuilder.appendTimeZoneName();
                                                        break;
                                                    }
                                                default:
                                                    StringBuilder sb = new StringBuilder("Illegal pattern component: ");
                                                    sb.append(parseToken);
                                                    throw new IllegalArgumentException(sb.toString());
                                            }
                                    }
                                } else {
                                    dateTimeFormatterBuilder.appendDayOfWeek(length2);
                                }
                            } else if (length2 == 1) {
                                dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", false, 2, 2);
                            } else if (length2 == 2) {
                                dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", true, 2, 2);
                            } else {
                                dateTimeFormatterBuilder.appendTimeZoneId();
                            }
                        }
                        if (length2 == 2) {
                            if (i2 + 1 < length) {
                                iArr[0] = iArr[0] + 1;
                                z = !isNumericToken(parseToken(str, iArr));
                                iArr[0] = iArr[0] - 1;
                            } else {
                                z = true;
                            }
                            if (charAt != 'x') {
                                dateTimeFormatterBuilder.appendTwoDigitYear(new DateTime().getYear() - 30, z);
                            } else {
                                dateTimeFormatterBuilder.appendTwoDigitWeekyear(new DateTime().getWeekyear() - 30, z);
                            }
                        } else {
                            int i3 = 9;
                            if (i2 + 1 < length) {
                                iArr[0] = iArr[0] + 1;
                                i3 = 9;
                                if (isNumericToken(parseToken(str, iArr))) {
                                    i3 = length2;
                                }
                                iArr[0] = iArr[0] - 1;
                            }
                            if (charAt == 'Y') {
                                dateTimeFormatterBuilder.appendYearOfEra(length2, i3);
                            } else if (charAt == 'x') {
                                dateTimeFormatterBuilder.appendWeekyear(length2, i3);
                            } else if (charAt == 'y') {
                                dateTimeFormatterBuilder.appendYear(length2, i3);
                            }
                        }
                    } else {
                        dateTimeFormatterBuilder.appendHourOfDay(length2);
                    }
                } else if (length2 < 3) {
                    dateTimeFormatterBuilder.appendMonthOfYear(length2);
                } else if (length2 >= 4) {
                    dateTimeFormatterBuilder.appendMonthOfYearText();
                } else {
                    dateTimeFormatterBuilder.appendMonthOfYearShortText();
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
        r11 = r7 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static java.lang.String parseToken(java.lang.String r4, int[] r5) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormat.parseToken(java.lang.String, int[]):java.lang.String");
    }

    public static String patternForStyle(String str, Locale locale) {
        DateTimeFormatter createFormatterForStyle = createFormatterForStyle(str);
        Locale locale2 = locale;
        if (locale == null) {
            locale2 = Locale.getDefault();
        }
        return createFormatterForStyle.getPrinter0().getPattern(locale2);
    }

    private static int selectStyle(char c) {
        if (c == '-') {
            return 4;
        }
        if (c == 'F') {
            return 0;
        }
        if (c == 'S') {
            return 3;
        }
        if (c == 'L') {
            return 1;
        }
        if (c == 'M') {
            return 2;
        }
        StringBuilder sb = new StringBuilder("Invalid style character: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }

    public static DateTimeFormatter shortDate() {
        return createFormatterForStyleIndex(3, 4);
    }

    public static DateTimeFormatter shortDateTime() {
        return createFormatterForStyleIndex(3, 3);
    }

    public static DateTimeFormatter shortTime() {
        return createFormatterForStyleIndex(4, 3);
    }
}
