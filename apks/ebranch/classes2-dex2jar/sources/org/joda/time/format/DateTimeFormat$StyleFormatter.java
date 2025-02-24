package org.joda.time.format;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
/* loaded from: classes2-dex2jar.jar:org/joda/time/format/DateTimeFormat$StyleFormatter.class */
class DateTimeFormat$StyleFormatter implements InternalPrinter, InternalParser {
    private static final ConcurrentHashMap<DateTimeFormat$StyleFormatterCacheKey, DateTimeFormatter> cCache = new ConcurrentHashMap<>();
    private final int iDateStyle;
    private final int iTimeStyle;
    private final int iType;

    DateTimeFormat$StyleFormatter(int i, int i2, int i3) {
        this.iDateStyle = i;
        this.iTimeStyle = i2;
        this.iType = i3;
    }

    private DateTimeFormatter getFormatter(Locale locale) {
        Locale locale2 = locale;
        if (locale == null) {
            locale2 = Locale.getDefault();
        }
        DateTimeFormat$StyleFormatterCacheKey dateTimeFormat$StyleFormatterCacheKey = new DateTimeFormat$StyleFormatterCacheKey(this.iType, this.iDateStyle, this.iTimeStyle, locale2);
        ConcurrentHashMap<DateTimeFormat$StyleFormatterCacheKey, DateTimeFormatter> concurrentHashMap = cCache;
        DateTimeFormatter dateTimeFormatter = concurrentHashMap.get(dateTimeFormat$StyleFormatterCacheKey);
        DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
        if (dateTimeFormatter == null) {
            dateTimeFormatter2 = DateTimeFormat.forPattern(getPattern(locale2));
            DateTimeFormatter putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeFormat$StyleFormatterCacheKey, dateTimeFormatter2);
            if (putIfAbsent != null) {
                dateTimeFormatter2 = putIfAbsent;
            }
        }
        return dateTimeFormatter2;
    }

    public int estimateParsedLength() {
        return 40;
    }

    public int estimatePrintedLength() {
        return 40;
    }

    String getPattern(Locale locale) {
        int i = this.iType;
        DateFormat dateTimeInstance = i != 0 ? i != 1 ? i != 2 ? null : DateFormat.getDateTimeInstance(this.iDateStyle, this.iTimeStyle, locale) : DateFormat.getTimeInstance(this.iTimeStyle, locale) : DateFormat.getDateInstance(this.iDateStyle, locale);
        if (dateTimeInstance instanceof SimpleDateFormat) {
            return ((SimpleDateFormat) dateTimeInstance).toPattern();
        }
        StringBuilder sb = new StringBuilder("No datetime pattern for locale: ");
        sb.append(locale);
        throw new IllegalArgumentException(sb.toString());
    }

    public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
        return getFormatter(dateTimeParserBucket.getLocale()).getParser0().parseInto(dateTimeParserBucket, charSequence, i);
    }

    public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
        getFormatter(locale).getPrinter0().printTo(appendable, j, chronology, i, dateTimeZone, locale);
    }

    public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        getFormatter(locale).getPrinter0().printTo(appendable, readablePartial, locale);
    }
}
