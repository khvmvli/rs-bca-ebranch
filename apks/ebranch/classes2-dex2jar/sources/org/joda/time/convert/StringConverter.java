package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
/* loaded from: classes2-dex2jar.jar:org/joda/time/convert/StringConverter.class */
class StringConverter extends AbstractConverter implements InstantConverter, PartialConverter, DurationConverter, PeriodConverter, IntervalConverter {
    static final StringConverter INSTANCE = new StringConverter();

    protected StringConverter() {
    }

    @Override // org.joda.time.convert.DurationConverter
    public long getDurationMillis(Object obj) {
        long j;
        long j2;
        String str = (String) obj;
        int length = str.length();
        if (length >= 4 && ((str.charAt(0) == 'P' || str.charAt(0) == 'p') && (str.charAt(1) == 'T' || str.charAt(1) == 't'))) {
            int i = length - 1;
            if (str.charAt(i) == 'S' || str.charAt(i) == 's') {
                String substring = str.substring(2, i);
                int i2 = -1;
                int i3 = 0;
                for (int i4 = 0; i4 < substring.length(); i4++) {
                    if (substring.charAt(i4) >= '0') {
                        i2 = i2;
                        i3 = i3;
                        if (substring.charAt(i4) <= '9') {
                            continue;
                        }
                    }
                    if (i4 == 0 && substring.charAt(0) == '-') {
                        i3 = 1;
                        i2 = i2;
                    } else if (i4 > i3 && substring.charAt(i4) == '.' && i2 == -1) {
                        i2 = i4;
                        i3 = i3;
                    } else {
                        StringBuilder sb = new StringBuilder("Invalid format: \"");
                        sb.append(str);
                        sb.append('\"');
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                if (i2 > 0) {
                    j2 = Long.parseLong(substring.substring(i3, i2));
                    String substring2 = substring.substring(i2 + 1);
                    String str2 = substring2;
                    if (substring2.length() != 3) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(substring2);
                        sb2.append("000");
                        str2 = sb2.toString().substring(0, 3);
                    }
                    j = (long) Integer.parseInt(str2);
                } else {
                    j2 = i3 != 0 ? Long.parseLong(substring.substring(i3, substring.length())) : Long.parseLong(substring);
                    j = 0;
                }
                return i3 != 0 ? FieldUtils.safeAdd(FieldUtils.safeMultiply(-j2, (int) DateTimeConstants.MILLIS_PER_SECOND), -j) : FieldUtils.safeAdd(FieldUtils.safeMultiply(j2, (int) DateTimeConstants.MILLIS_PER_SECOND), j);
            }
        }
        StringBuilder sb3 = new StringBuilder("Invalid format: \"");
        sb3.append(str);
        sb3.append('\"');
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ISODateTimeFormat.dateTimeParser().withChronology(chronology).parseMillis((String) obj);
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.PartialConverter
    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, Chronology chronology, DateTimeFormatter dateTimeFormatter) {
        Chronology chronology2 = chronology;
        if (dateTimeFormatter.getZone() != null) {
            chronology2 = chronology.withZone(dateTimeFormatter.getZone());
        }
        return chronology2.get(readablePartial, dateTimeFormatter.withChronology(chronology2).parseMillis((String) obj));
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return String.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [long] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.joda.time.convert.AbstractConverter, org.joda.time.convert.StringConverter] */
    /* JADX WARN: Unknown variable types count: 2 */
    @Override // org.joda.time.convert.IntervalConverter
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void setInto(org.joda.time.ReadWritableInterval r7, java.lang.Object r8, org.joda.time.Chronology r9) {
        /*
        // Method dump skipped, instructions count: 407
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.convert.StringConverter.setInto(org.joda.time.ReadWritableInterval, java.lang.Object, org.joda.time.Chronology):void");
    }

    @Override // org.joda.time.convert.PeriodConverter
    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        String str = (String) obj;
        PeriodFormatter standard = ISOPeriodFormat.standard();
        readWritablePeriod.clear();
        int parseInto = standard.parseInto(readWritablePeriod, str, 0);
        if (parseInto < str.length()) {
            if (parseInto < 0) {
                standard.withParseType(readWritablePeriod.getPeriodType()).parseMutablePeriod(str);
            }
            StringBuilder sb = new StringBuilder("Invalid format: \"");
            sb.append(str);
            sb.append('\"');
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
