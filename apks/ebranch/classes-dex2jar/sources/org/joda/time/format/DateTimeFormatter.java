package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
/* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormatter.class */
public class DateTimeFormatter {
    private final Chronology iChrono;
    private final int iDefaultYear;
    private final Locale iLocale;
    private final boolean iOffsetParsed;
    private final InternalParser iParser;
    private final Integer iPivotYear;
    private final InternalPrinter iPrinter;
    private final DateTimeZone iZone;

    public DateTimeFormatter(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        this(DateTimePrinterInternalPrinter.of(dateTimePrinter), DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatter(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iPrinter = internalPrinter;
        this.iParser = internalParser;
        this.iLocale = null;
        this.iOffsetParsed = false;
        this.iChrono = null;
        this.iZone = null;
        this.iPivotYear = null;
        this.iDefaultYear = 2000;
    }

    private DateTimeFormatter(InternalPrinter internalPrinter, InternalParser internalParser, Locale locale, boolean z, Chronology chronology, DateTimeZone dateTimeZone, Integer num, int i) {
        this.iPrinter = internalPrinter;
        this.iParser = internalParser;
        this.iLocale = locale;
        this.iOffsetParsed = z;
        this.iChrono = chronology;
        this.iZone = dateTimeZone;
        this.iPivotYear = num;
        this.iDefaultYear = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void printTo(java.lang.Appendable r10, long r11, org.joda.time.Chronology r13) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r9
            org.joda.time.format.InternalPrinter r0 = r0.requirePrinter()
            r14 = r0
            r0 = r9
            r1 = r13
            org.joda.time.Chronology r0 = r0.selectChronology(r1)
            r15 = r0
            r0 = r15
            org.joda.time.DateTimeZone r0 = r0.getZone()
            r16 = r0
            r0 = r16
            r1 = r11
            int r0 = r0.getOffset(r1)
            r17 = r0
            r0 = r17
            long r0 = (long) r0
            r18 = r0
            r0 = r11
            r1 = r18
            long r0 = r0 + r1
            r20 = r0
            r0 = r16
            r13 = r0
            r0 = r17
            r22 = r0
            r0 = r20
            r23 = r0
            r0 = r11
            r1 = r20
            long r0 = r0 ^ r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005d
            r0 = r16
            r13 = r0
            r0 = r17
            r22 = r0
            r0 = r20
            r23 = r0
            r0 = r18
            r1 = r11
            long r0 = r0 ^ r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x005d
            org.joda.time.DateTimeZone r0 = org.joda.time.DateTimeZone.UTC
            r13 = r0
            r0 = 0
            r22 = r0
            r0 = r11
            r23 = r0
        L_0x005d:
            r0 = r14
            r1 = r10
            r2 = r23
            r3 = r15
            org.joda.time.Chronology r3 = r3.withUTC()
            r4 = r22
            r5 = r13
            r6 = r9
            java.util.Locale r6 = r6.iLocale
            r0.printTo(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatter.printTo(java.lang.Appendable, long, org.joda.time.Chronology):void");
    }

    private InternalParser requireParser() {
        InternalParser internalParser = this.iParser;
        if (internalParser != null) {
            return internalParser;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    private InternalPrinter requirePrinter() {
        InternalPrinter internalPrinter = this.iPrinter;
        if (internalPrinter != null) {
            return internalPrinter;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    private Chronology selectChronology(Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        Chronology chronology3 = this.iChrono;
        if (chronology3 != null) {
            chronology2 = chronology3;
        }
        DateTimeZone dateTimeZone = this.iZone;
        Chronology chronology4 = chronology2;
        if (dateTimeZone != null) {
            chronology4 = chronology2.withZone(dateTimeZone);
        }
        return chronology4;
    }

    @Deprecated
    public Chronology getChronolgy() {
        return this.iChrono;
    }

    public Chronology getChronology() {
        return this.iChrono;
    }

    public int getDefaultYear() {
        return this.iDefaultYear;
    }

    public Locale getLocale() {
        return this.iLocale;
    }

    public DateTimeParser getParser() {
        return InternalParserDateTimeParser.of(this.iParser);
    }

    public InternalParser getParser0() {
        return this.iParser;
    }

    public Integer getPivotYear() {
        return this.iPivotYear;
    }

    public DateTimePrinter getPrinter() {
        return InternalPrinterDateTimePrinter.of(this.iPrinter);
    }

    public InternalPrinter getPrinter0() {
        return this.iPrinter;
    }

    public DateTimeZone getZone() {
        return this.iZone;
    }

    public boolean isOffsetParsed() {
        return this.iOffsetParsed;
    }

    public boolean isParser() {
        return this.iParser != null;
    }

    public boolean isPrinter() {
        return this.iPrinter != null;
    }

    public DateTime parseDateTime(String str) {
        int i;
        Chronology chronology;
        InternalParser requireParser = requireParser();
        Chronology selectChronology = selectChronology(null);
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0, selectChronology, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int parseInto = requireParser.parseInto(dateTimeParserBucket, str, 0);
        if (parseInto >= 0) {
            i = parseInto;
            if (parseInto >= str.length()) {
                long computeMillis = dateTimeParserBucket.computeMillis(true, str);
                if (!this.iOffsetParsed || dateTimeParserBucket.getOffsetInteger() == null) {
                    chronology = selectChronology;
                    if (dateTimeParserBucket.getZone() != null) {
                        chronology = selectChronology.withZone(dateTimeParserBucket.getZone());
                    }
                } else {
                    chronology = selectChronology.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
                }
                DateTime dateTime = new DateTime(computeMillis, chronology);
                DateTimeZone dateTimeZone = this.iZone;
                DateTime dateTime2 = dateTime;
                if (dateTimeZone != null) {
                    dateTime2 = dateTime.withZone(dateTimeZone);
                }
                return dateTime2;
            }
        } else {
            i = parseInto ^ -1;
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, i));
    }

    public int parseInto(ReadWritableInstant readWritableInstant, String str, int i) {
        Chronology chronology;
        InternalParser requireParser = requireParser();
        if (readWritableInstant != null) {
            long millis = readWritableInstant.getMillis();
            Chronology chronology2 = readWritableInstant.getChronology();
            int i2 = DateTimeUtils.getChronology(chronology2).year().get(millis);
            long offset = (long) chronology2.getZone().getOffset(millis);
            Chronology selectChronology = selectChronology(chronology2);
            DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(millis + offset, selectChronology, this.iLocale, this.iPivotYear, i2);
            int parseInto = requireParser.parseInto(dateTimeParserBucket, str, i);
            readWritableInstant.setMillis(dateTimeParserBucket.computeMillis(false, str));
            if (!this.iOffsetParsed || dateTimeParserBucket.getOffsetInteger() == null) {
                chronology = selectChronology;
                if (dateTimeParserBucket.getZone() != null) {
                    chronology = selectChronology.withZone(dateTimeParserBucket.getZone());
                }
            } else {
                chronology = selectChronology.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
            }
            readWritableInstant.setChronology(chronology);
            DateTimeZone dateTimeZone = this.iZone;
            if (dateTimeZone != null) {
                readWritableInstant.setZone(dateTimeZone);
            }
            return parseInto;
        }
        throw new IllegalArgumentException("Instant must not be null");
    }

    public LocalDate parseLocalDate(String str) {
        return parseLocalDateTime(str).toLocalDate();
    }

    public LocalDateTime parseLocalDateTime(String str) {
        int i;
        Chronology chronology;
        InternalParser requireParser = requireParser();
        Chronology withUTC = selectChronology(null).withUTC();
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0, withUTC, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int parseInto = requireParser.parseInto(dateTimeParserBucket, str, 0);
        if (parseInto >= 0) {
            i = parseInto;
            if (parseInto >= str.length()) {
                long computeMillis = dateTimeParserBucket.computeMillis(true, str);
                if (dateTimeParserBucket.getOffsetInteger() != null) {
                    chronology = withUTC.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
                } else {
                    chronology = withUTC;
                    if (dateTimeParserBucket.getZone() != null) {
                        chronology = withUTC.withZone(dateTimeParserBucket.getZone());
                    }
                }
                return new LocalDateTime(computeMillis, chronology);
            }
        } else {
            i = parseInto ^ -1;
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, i));
    }

    public LocalTime parseLocalTime(String str) {
        return parseLocalDateTime(str).toLocalTime();
    }

    public long parseMillis(String str) {
        return new DateTimeParserBucket(0, selectChronology(this.iChrono), this.iLocale, this.iPivotYear, this.iDefaultYear).doParseMillis(requireParser(), str);
    }

    public MutableDateTime parseMutableDateTime(String str) {
        int i;
        Chronology chronology;
        InternalParser requireParser = requireParser();
        Chronology selectChronology = selectChronology(null);
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0, selectChronology, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int parseInto = requireParser.parseInto(dateTimeParserBucket, str, 0);
        if (parseInto >= 0) {
            i = parseInto;
            if (parseInto >= str.length()) {
                long computeMillis = dateTimeParserBucket.computeMillis(true, str);
                if (!this.iOffsetParsed || dateTimeParserBucket.getOffsetInteger() == null) {
                    chronology = selectChronology;
                    if (dateTimeParserBucket.getZone() != null) {
                        chronology = selectChronology.withZone(dateTimeParserBucket.getZone());
                    }
                } else {
                    chronology = selectChronology.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
                }
                MutableDateTime mutableDateTime = new MutableDateTime(computeMillis, chronology);
                DateTimeZone dateTimeZone = this.iZone;
                if (dateTimeZone != null) {
                    mutableDateTime.setZone(dateTimeZone);
                }
                return mutableDateTime;
            }
        } else {
            i = parseInto ^ -1;
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, i));
    }

    public String print(long j) {
        StringBuilder sb = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo((Appendable) sb, j);
        } catch (IOException e) {
        }
        return sb.toString();
    }

    public String print(ReadableInstant readableInstant) {
        StringBuilder sb = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo((Appendable) sb, readableInstant);
        } catch (IOException e) {
        }
        return sb.toString();
    }

    public String print(ReadablePartial readablePartial) {
        StringBuilder sb = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo((Appendable) sb, readablePartial);
        } catch (IOException e) {
        }
        return sb.toString();
    }

    public void printTo(Writer writer, long j) throws IOException {
        printTo((Appendable) writer, j);
    }

    public void printTo(Writer writer, ReadableInstant readableInstant) throws IOException {
        printTo((Appendable) writer, readableInstant);
    }

    public void printTo(Writer writer, ReadablePartial readablePartial) throws IOException {
        printTo((Appendable) writer, readablePartial);
    }

    public void printTo(Appendable appendable, long j) throws IOException {
        printTo(appendable, j, null);
    }

    public void printTo(Appendable appendable, ReadableInstant readableInstant) throws IOException {
        printTo(appendable, DateTimeUtils.getInstantMillis(readableInstant), DateTimeUtils.getInstantChronology(readableInstant));
    }

    public void printTo(Appendable appendable, ReadablePartial readablePartial) throws IOException {
        InternalPrinter requirePrinter = requirePrinter();
        if (readablePartial != null) {
            requirePrinter.printTo(appendable, readablePartial, this.iLocale);
            return;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }

    public void printTo(StringBuffer stringBuffer, long j) {
        try {
            printTo((Appendable) stringBuffer, j);
        } catch (IOException e) {
        }
    }

    public void printTo(StringBuffer stringBuffer, ReadableInstant readableInstant) {
        try {
            printTo((Appendable) stringBuffer, readableInstant);
        } catch (IOException e) {
        }
    }

    public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial) {
        try {
            printTo((Appendable) stringBuffer, readablePartial);
        } catch (IOException e) {
        }
    }

    public void printTo(StringBuilder sb, long j) {
        try {
            printTo((Appendable) sb, j);
        } catch (IOException e) {
        }
    }

    public void printTo(StringBuilder sb, ReadableInstant readableInstant) {
        try {
            printTo((Appendable) sb, readableInstant);
        } catch (IOException e) {
        }
    }

    public void printTo(StringBuilder sb, ReadablePartial readablePartial) {
        try {
            printTo((Appendable) sb, readablePartial);
        } catch (IOException e) {
        }
    }

    public DateTimeFormatter withChronology(Chronology chronology) {
        return this.iChrono == chronology ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, chronology, this.iZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withDefaultYear(int i) {
        return new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, this.iChrono, this.iZone, this.iPivotYear, i);
    }

    public DateTimeFormatter withLocale(Locale locale) {
        return (locale == getLocale() || (locale != null && locale.equals(getLocale()))) ? this : new DateTimeFormatter(this.iPrinter, this.iParser, locale, this.iOffsetParsed, this.iChrono, this.iZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withOffsetParsed() {
        return this.iOffsetParsed ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, true, this.iChrono, null, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withPivotYear(int i) {
        return withPivotYear(Integer.valueOf(i));
    }

    public DateTimeFormatter withPivotYear(Integer num) {
        Integer num2 = this.iPivotYear;
        return (num2 == num || (num2 != null && num2.equals(num))) ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, this.iChrono, this.iZone, num, this.iDefaultYear);
    }

    public DateTimeFormatter withZone(DateTimeZone dateTimeZone) {
        return this.iZone == dateTimeZone ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, false, this.iChrono, dateTimeZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withZoneUTC() {
        return withZone(DateTimeZone.UTC);
    }
}
