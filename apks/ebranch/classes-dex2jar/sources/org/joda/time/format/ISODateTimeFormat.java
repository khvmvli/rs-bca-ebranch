package org.joda.time.format;

import java.util.Collection;
import java.util.HashSet;
import org.joda.time.DateTimeFieldType;
/* loaded from: classes-dex2jar.jar:org/joda/time/format/ISODateTimeFormat.class */
public class ISODateTimeFormat {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:org/joda/time/format/ISODateTimeFormat$Constants.class */
    public static final class Constants {
        private static final DateTimeFormatter ye = yearElement();
        private static final DateTimeFormatter mye = monthElement();
        private static final DateTimeFormatter dme = dayOfMonthElement();
        private static final DateTimeFormatter we = weekyearElement();
        private static final DateTimeFormatter wwe = weekElement();
        private static final DateTimeFormatter dwe = dayOfWeekElement();
        private static final DateTimeFormatter dye = dayOfYearElement();
        private static final DateTimeFormatter hde = hourElement();
        private static final DateTimeFormatter mhe = minuteElement();
        private static final DateTimeFormatter sme = secondElement();
        private static final DateTimeFormatter fse = fractionElement();
        private static final DateTimeFormatter ze = offsetElement();
        private static final DateTimeFormatter lte = literalTElement();
        private static final DateTimeFormatter ym = yearMonth();
        private static final DateTimeFormatter ymd = yearMonthDay();
        private static final DateTimeFormatter ww = weekyearWeek();
        private static final DateTimeFormatter wwd = weekyearWeekDay();
        private static final DateTimeFormatter hm = hourMinute();
        private static final DateTimeFormatter hms = hourMinuteSecond();
        private static final DateTimeFormatter hmsl = hourMinuteSecondMillis();
        private static final DateTimeFormatter hmsf = hourMinuteSecondFraction();
        private static final DateTimeFormatter dh = dateHour();
        private static final DateTimeFormatter dhm = dateHourMinute();
        private static final DateTimeFormatter dhms = dateHourMinuteSecond();
        private static final DateTimeFormatter dhmsl = dateHourMinuteSecondMillis();
        private static final DateTimeFormatter dhmsf = dateHourMinuteSecondFraction();
        private static final DateTimeFormatter t = time();
        private static final DateTimeFormatter tx = timeNoMillis();
        private static final DateTimeFormatter tt = tTime();
        private static final DateTimeFormatter ttx = tTimeNoMillis();
        private static final DateTimeFormatter dt = dateTime();
        private static final DateTimeFormatter dtx = dateTimeNoMillis();
        private static final DateTimeFormatter wdt = weekDateTime();
        private static final DateTimeFormatter wdtx = weekDateTimeNoMillis();
        private static final DateTimeFormatter od = ordinalDate();
        private static final DateTimeFormatter odt = ordinalDateTime();
        private static final DateTimeFormatter odtx = ordinalDateTimeNoMillis();
        private static final DateTimeFormatter bd = basicDate();
        private static final DateTimeFormatter bt = basicTime();
        private static final DateTimeFormatter btx = basicTimeNoMillis();
        private static final DateTimeFormatter btt = basicTTime();
        private static final DateTimeFormatter bttx = basicTTimeNoMillis();
        private static final DateTimeFormatter bdt = basicDateTime();
        private static final DateTimeFormatter bdtx = basicDateTimeNoMillis();
        private static final DateTimeFormatter bod = basicOrdinalDate();
        private static final DateTimeFormatter bodt = basicOrdinalDateTime();
        private static final DateTimeFormatter bodtx = basicOrdinalDateTimeNoMillis();
        private static final DateTimeFormatter bwd = basicWeekDate();
        private static final DateTimeFormatter bwdt = basicWeekDateTime();
        private static final DateTimeFormatter bwdtx = basicWeekDateTimeNoMillis();
        private static final DateTimeFormatter dpe = dateElementParser();
        private static final DateTimeFormatter tpe = timeElementParser();
        private static final DateTimeFormatter dp = dateParser();
        private static final DateTimeFormatter ldp = localDateParser();
        private static final DateTimeFormatter tp = timeParser();
        private static final DateTimeFormatter ltp = localTimeParser();
        private static final DateTimeFormatter dtp = dateTimeParser();
        private static final DateTimeFormatter dotp = dateOptionalTimeParser();
        private static final DateTimeFormatter ldotp = localDateOptionalTimeParser();

        Constants() {
        }

        private static DateTimeFormatter basicDate() {
            DateTimeFormatter dateTimeFormatter = bd;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.monthOfYear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicDateTime() {
            DateTimeFormatter dateTimeFormatter = bdt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(basicDate()).append(basicTTime()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bdtx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(basicDate()).append(basicTTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicOrdinalDate() {
            DateTimeFormatter dateTimeFormatter = bod;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.dayOfYear(), 3).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicOrdinalDateTime() {
            DateTimeFormatter dateTimeFormatter = bodt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(basicOrdinalDate()).append(basicTTime()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicOrdinalDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bodtx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(basicOrdinalDate()).append(basicTTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicTTime() {
            DateTimeFormatter dateTimeFormatter = btt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(literalTElement()).append(basicTime()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicTTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bttx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(literalTElement()).append(basicTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicTime() {
            DateTimeFormatter dateTimeFormatter = bt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendLiteral('.').appendFractionOfSecond(3, 9).appendTimeZoneOffset("Z", false, 2, 2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = btx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendTimeZoneOffset("Z", false, 2, 2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicWeekDate() {
            DateTimeFormatter dateTimeFormatter = bwd;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendWeekyear(4, 4).appendLiteral('W').appendFixedDecimal(DateTimeFieldType.weekOfWeekyear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfWeek(), 1).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicWeekDateTime() {
            DateTimeFormatter dateTimeFormatter = bwdt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(basicWeekDate()).append(basicTTime()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicWeekDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bwdtx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(basicWeekDate()).append(basicTTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateElementParser() {
            DateTimeFormatter dateTimeFormatter = dpe;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(yearElement()).appendOptional(new DateTimeFormatterBuilder().append(monthElement()).appendOptional(dayOfMonthElement().getParser()).toParser()).toParser(), new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).appendOptional(dayOfWeekElement().getParser()).toParser(), new DateTimeFormatterBuilder().append(yearElement()).append(dayOfYearElement()).toParser()}).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateHour() {
            DateTimeFormatter dateTimeFormatter = dh;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(ISODateTimeFormat.hour()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateHourMinute() {
            DateTimeFormatter dateTimeFormatter = dhm;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinute()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateHourMinuteSecond() {
            DateTimeFormatter dateTimeFormatter = dhms;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecond()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateHourMinuteSecondFraction() {
            DateTimeFormatter dateTimeFormatter = dhmsf;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecondFraction()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateHourMinuteSecondMillis() {
            DateTimeFormatter dateTimeFormatter = dhmsl;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecondMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateOptionalTimeParser() {
            DateTimeFormatter dateTimeFormatter = dotp;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').appendOptional(timeElementParser().getParser()).appendOptional(offsetElement().getParser()).toParser()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateParser() {
            DateTimeFormatter dateTimeFormatter = dp;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').append(offsetElement()).toParser()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateTime() {
            DateTimeFormatter dateTimeFormatter = dt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(tTime()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = dtx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(tTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateTimeParser() {
            DateTimeFormatter dateTimeFormatter = dtp;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().appendLiteral('T').append(timeElementParser()).appendOptional(offsetElement().getParser()).toParser(), dateOptionalTimeParser().getParser()}).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dayOfMonthElement() {
            DateTimeFormatter dateTimeFormatter = dme;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfMonth(2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dayOfWeekElement() {
            DateTimeFormatter dateTimeFormatter = dwe;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfWeek(1).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dayOfYearElement() {
            DateTimeFormatter dateTimeFormatter = dye;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfYear(3).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter fractionElement() {
            DateTimeFormatter dateTimeFormatter = fse;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral('.').appendFractionOfSecond(3, 9).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter hourElement() {
            DateTimeFormatter dateTimeFormatter = hde;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendHourOfDay(2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter hourMinute() {
            DateTimeFormatter dateTimeFormatter = hm;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter hourMinuteSecond() {
            DateTimeFormatter dateTimeFormatter = hms;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter hourMinuteSecondFraction() {
            DateTimeFormatter dateTimeFormatter = hmsf;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).append(fractionElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter hourMinuteSecondMillis() {
            DateTimeFormatter dateTimeFormatter = hmsl;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).appendLiteral('.').appendFractionOfSecond(3, 3).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter literalTElement() {
            DateTimeFormatter dateTimeFormatter = lte;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral('T').toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter localDateOptionalTimeParser() {
            DateTimeFormatter dateTimeFormatter = ldotp;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').append(timeElementParser()).toParser()).toFormatter().withZoneUTC();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter localDateParser() {
            DateTimeFormatter dateTimeFormatter = ldp;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = dateElementParser().withZoneUTC();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter localTimeParser() {
            DateTimeFormatter dateTimeFormatter = ltp;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendOptional(literalTElement().getParser()).append(timeElementParser()).toFormatter().withZoneUTC();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter minuteElement() {
            DateTimeFormatter dateTimeFormatter = mhe;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral(':').appendMinuteOfHour(2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter monthElement() {
            DateTimeFormatter dateTimeFormatter = mye;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral('-').appendMonthOfYear(2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter offsetElement() {
            DateTimeFormatter dateTimeFormatter = ze;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 2, 4).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter ordinalDate() {
            DateTimeFormatter dateTimeFormatter = od;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(yearElement()).append(dayOfYearElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter ordinalDateTime() {
            DateTimeFormatter dateTimeFormatter = odt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ordinalDate()).append(tTime()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter ordinalDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = odtx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ordinalDate()).append(tTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter secondElement() {
            DateTimeFormatter dateTimeFormatter = sme;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral(':').appendSecondOfMinute(2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter tTime() {
            DateTimeFormatter dateTimeFormatter = tt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(literalTElement()).append(time()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter tTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = ttx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(literalTElement()).append(timeNoMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter time() {
            DateTimeFormatter dateTimeFormatter = t;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(hourMinuteSecondFraction()).append(offsetElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter timeElementParser() {
            DateTimeFormatter dateTimeFormatter = tpe;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                DateTimeParser parser = new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().appendLiteral('.').toParser(), new DateTimeFormatterBuilder().appendLiteral(',').toParser()}).toParser();
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(hourElement()).append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(minuteElement()).append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(secondElement()).appendOptional(new DateTimeFormatterBuilder().append(parser).appendFractionOfSecond(1, 9).toParser()).toParser(), new DateTimeFormatterBuilder().append(parser).appendFractionOfMinute(1, 9).toParser(), null}).toParser(), new DateTimeFormatterBuilder().append(parser).appendFractionOfHour(1, 9).toParser(), null}).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter timeNoMillis() {
            DateTimeFormatter dateTimeFormatter = tx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(hourMinuteSecond()).append(offsetElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter timeParser() {
            DateTimeFormatter dateTimeFormatter = tp;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendOptional(literalTElement().getParser()).append(timeElementParser()).appendOptional(offsetElement().getParser()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter weekDateTime() {
            DateTimeFormatter dateTimeFormatter = wdt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.weekDate()).append(tTime()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter weekDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = wdtx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.weekDate()).append(tTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter weekElement() {
            DateTimeFormatter dateTimeFormatter = wwe;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral("-W").appendWeekOfWeekyear(2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter weekyearElement() {
            DateTimeFormatter dateTimeFormatter = we;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendWeekyear(4, 9).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter weekyearWeek() {
            DateTimeFormatter dateTimeFormatter = ww;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter weekyearWeekDay() {
            DateTimeFormatter dateTimeFormatter = wwd;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).append(dayOfWeekElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter yearElement() {
            DateTimeFormatter dateTimeFormatter = ye;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendYear(4, 9).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter yearMonth() {
            DateTimeFormatter dateTimeFormatter = ym;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(yearElement()).append(monthElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter yearMonthDay() {
            DateTimeFormatter dateTimeFormatter = ymd;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(yearElement()).append(monthElement()).append(dayOfMonthElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }
    }

    protected ISODateTimeFormat() {
    }

    private static void appendSeparator(DateTimeFormatterBuilder dateTimeFormatterBuilder, boolean z) {
        if (z) {
            dateTimeFormatterBuilder.appendLiteral('-');
        }
    }

    public static DateTimeFormatter basicDate() {
        return Constants.bd;
    }

    public static DateTimeFormatter basicDateTime() {
        return Constants.bdt;
    }

    public static DateTimeFormatter basicDateTimeNoMillis() {
        return Constants.bdtx;
    }

    public static DateTimeFormatter basicOrdinalDate() {
        return Constants.bod;
    }

    public static DateTimeFormatter basicOrdinalDateTime() {
        return Constants.bodt;
    }

    public static DateTimeFormatter basicOrdinalDateTimeNoMillis() {
        return Constants.bodtx;
    }

    public static DateTimeFormatter basicTTime() {
        return Constants.btt;
    }

    public static DateTimeFormatter basicTTimeNoMillis() {
        return Constants.bttx;
    }

    public static DateTimeFormatter basicTime() {
        return Constants.bt;
    }

    public static DateTimeFormatter basicTimeNoMillis() {
        return Constants.btx;
    }

    public static DateTimeFormatter basicWeekDate() {
        return Constants.bwd;
    }

    public static DateTimeFormatter basicWeekDateTime() {
        return Constants.bwdt;
    }

    public static DateTimeFormatter basicWeekDateTimeNoMillis() {
        return Constants.bwdtx;
    }

    private static void checkNotStrictISO(Collection<DateTimeFieldType> collection, boolean z) {
        if (z) {
            StringBuilder sb = new StringBuilder("No valid ISO8601 format for fields: ");
            sb.append(collection);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static DateTimeFormatter date() {
        return yearMonthDay();
    }

    private static boolean dateByMonth(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z2) {
        boolean z3;
        if (collection.remove(DateTimeFieldType.year())) {
            dateTimeFormatterBuilder.append(Constants.ye);
            if (!collection.remove(DateTimeFieldType.monthOfYear())) {
                if (collection.remove(DateTimeFieldType.dayOfMonth())) {
                    checkNotStrictISO(collection, z2);
                    dateTimeFormatterBuilder.appendLiteral('-');
                    dateTimeFormatterBuilder.appendLiteral('-');
                    dateTimeFormatterBuilder.appendDayOfMonth(2);
                    z3 = false;
                }
                z3 = true;
            } else if (collection.remove(DateTimeFieldType.dayOfMonth())) {
                appendSeparator(dateTimeFormatterBuilder, z);
                dateTimeFormatterBuilder.appendMonthOfYear(2);
                appendSeparator(dateTimeFormatterBuilder, z);
                dateTimeFormatterBuilder.appendDayOfMonth(2);
                z3 = false;
            } else {
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendMonthOfYear(2);
                z3 = true;
            }
        } else {
            if (collection.remove(DateTimeFieldType.monthOfYear())) {
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendMonthOfYear(2);
                if (collection.remove(DateTimeFieldType.dayOfMonth())) {
                    appendSeparator(dateTimeFormatterBuilder, z);
                    dateTimeFormatterBuilder.appendDayOfMonth(2);
                }
                z3 = true;
            } else if (collection.remove(DateTimeFieldType.dayOfMonth())) {
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendDayOfMonth(2);
            }
            z3 = false;
        }
        return z3;
    }

    private static boolean dateByOrdinal(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z2) {
        boolean z3;
        if (collection.remove(DateTimeFieldType.year())) {
            dateTimeFormatterBuilder.append(Constants.ye);
            if (collection.remove(DateTimeFieldType.dayOfYear())) {
                appendSeparator(dateTimeFormatterBuilder, z);
                dateTimeFormatterBuilder.appendDayOfYear(3);
            } else {
                z3 = true;
                return z3;
            }
        } else if (collection.remove(DateTimeFieldType.dayOfYear())) {
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendDayOfYear(3);
        }
        z3 = false;
        return z3;
    }

    private static boolean dateByWeek(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z2) {
        boolean z3 = true;
        if (collection.remove(DateTimeFieldType.weekyear())) {
            dateTimeFormatterBuilder.append(Constants.we);
            if (collection.remove(DateTimeFieldType.weekOfWeekyear())) {
                appendSeparator(dateTimeFormatterBuilder, z);
                dateTimeFormatterBuilder.appendLiteral('W');
                dateTimeFormatterBuilder.appendWeekOfWeekyear(2);
                if (collection.remove(DateTimeFieldType.dayOfWeek())) {
                    appendSeparator(dateTimeFormatterBuilder, z);
                    dateTimeFormatterBuilder.appendDayOfWeek(1);
                    z3 = false;
                }
            } else if (collection.remove(DateTimeFieldType.dayOfWeek())) {
                checkNotStrictISO(collection, z2);
                appendSeparator(dateTimeFormatterBuilder, z);
                dateTimeFormatterBuilder.appendLiteral('W');
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendDayOfWeek(1);
                z3 = false;
            }
        } else {
            if (collection.remove(DateTimeFieldType.weekOfWeekyear())) {
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendLiteral('W');
                dateTimeFormatterBuilder.appendWeekOfWeekyear(2);
                if (collection.remove(DateTimeFieldType.dayOfWeek())) {
                    appendSeparator(dateTimeFormatterBuilder, z);
                    dateTimeFormatterBuilder.appendDayOfWeek(1);
                }
            } else if (collection.remove(DateTimeFieldType.dayOfWeek())) {
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendLiteral('W');
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendDayOfWeek(1);
            }
            z3 = false;
        }
        return z3;
    }

    public static DateTimeFormatter dateElementParser() {
        return Constants.dpe;
    }

    public static DateTimeFormatter dateHour() {
        return Constants.dh;
    }

    public static DateTimeFormatter dateHourMinute() {
        return Constants.dhm;
    }

    public static DateTimeFormatter dateHourMinuteSecond() {
        return Constants.dhms;
    }

    public static DateTimeFormatter dateHourMinuteSecondFraction() {
        return Constants.dhmsf;
    }

    public static DateTimeFormatter dateHourMinuteSecondMillis() {
        return Constants.dhmsl;
    }

    public static DateTimeFormatter dateOptionalTimeParser() {
        return Constants.dotp;
    }

    public static DateTimeFormatter dateParser() {
        return Constants.dp;
    }

    public static DateTimeFormatter dateTime() {
        return Constants.dt;
    }

    public static DateTimeFormatter dateTimeNoMillis() {
        return Constants.dtx;
    }

    public static DateTimeFormatter dateTimeParser() {
        return Constants.dtp;
    }

    public static DateTimeFormatter forFields(Collection<DateTimeFieldType> collection, boolean z, boolean z2) {
        boolean z3;
        if (collection == null || collection.size() == 0) {
            throw new IllegalArgumentException("The fields must not be null or empty");
        }
        HashSet hashSet = new HashSet(collection);
        int size = hashSet.size();
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        if (hashSet.contains(DateTimeFieldType.monthOfYear())) {
            z3 = dateByMonth(dateTimeFormatterBuilder, hashSet, z, z2);
        } else if (hashSet.contains(DateTimeFieldType.dayOfYear())) {
            z3 = dateByOrdinal(dateTimeFormatterBuilder, hashSet, z, z2);
        } else if (hashSet.contains(DateTimeFieldType.weekOfWeekyear())) {
            z3 = dateByWeek(dateTimeFormatterBuilder, hashSet, z, z2);
        } else if (hashSet.contains(DateTimeFieldType.dayOfMonth())) {
            z3 = dateByMonth(dateTimeFormatterBuilder, hashSet, z, z2);
        } else if (hashSet.contains(DateTimeFieldType.dayOfWeek())) {
            z3 = dateByWeek(dateTimeFormatterBuilder, hashSet, z, z2);
        } else {
            if (hashSet.remove(DateTimeFieldType.year())) {
                dateTimeFormatterBuilder.append(Constants.ye);
            } else if (hashSet.remove(DateTimeFieldType.weekyear())) {
                dateTimeFormatterBuilder.append(Constants.we);
            } else {
                z3 = false;
            }
            z3 = true;
        }
        time(dateTimeFormatterBuilder, hashSet, z, z2, z3, hashSet.size() < size);
        if (dateTimeFormatterBuilder.canBuildFormatter()) {
            try {
                collection.retainAll(hashSet);
            } catch (UnsupportedOperationException e) {
            }
            return dateTimeFormatterBuilder.toFormatter();
        }
        StringBuilder sb = new StringBuilder("No valid format for fields: ");
        sb.append(collection);
        throw new IllegalArgumentException(sb.toString());
    }

    public static DateTimeFormatter hour() {
        return Constants.hde;
    }

    public static DateTimeFormatter hourMinute() {
        return Constants.hm;
    }

    public static DateTimeFormatter hourMinuteSecond() {
        return Constants.hms;
    }

    public static DateTimeFormatter hourMinuteSecondFraction() {
        return Constants.hmsf;
    }

    public static DateTimeFormatter hourMinuteSecondMillis() {
        return Constants.hmsl;
    }

    public static DateTimeFormatter localDateOptionalTimeParser() {
        return Constants.ldotp;
    }

    public static DateTimeFormatter localDateParser() {
        return Constants.ldp;
    }

    public static DateTimeFormatter localTimeParser() {
        return Constants.ltp;
    }

    public static DateTimeFormatter ordinalDate() {
        return Constants.od;
    }

    public static DateTimeFormatter ordinalDateTime() {
        return Constants.odt;
    }

    public static DateTimeFormatter ordinalDateTimeNoMillis() {
        return Constants.odtx;
    }

    public static DateTimeFormatter tTime() {
        return Constants.tt;
    }

    public static DateTimeFormatter tTimeNoMillis() {
        return Constants.ttx;
    }

    public static DateTimeFormatter time() {
        return Constants.t;
    }

    private static void time(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean remove = collection.remove(DateTimeFieldType.hourOfDay());
        boolean remove2 = collection.remove(DateTimeFieldType.minuteOfHour());
        boolean remove3 = collection.remove(DateTimeFieldType.secondOfMinute());
        boolean remove4 = collection.remove(DateTimeFieldType.millisOfSecond());
        if (remove || remove2 || remove3 || remove4) {
            if (remove || remove2 || remove3 || remove4) {
                if (z2 && z3) {
                    StringBuilder sb = new StringBuilder("No valid ISO8601 format for fields because Date was reduced precision: ");
                    sb.append(collection);
                    throw new IllegalArgumentException(sb.toString());
                } else if (z4) {
                    dateTimeFormatterBuilder.appendLiteral('T');
                }
            }
            if ((!remove || !remove2 || !remove3) && (!remove || remove3 || remove4)) {
                if (z2 && z4) {
                    StringBuilder sb2 = new StringBuilder("No valid ISO8601 format for fields because Time was truncated: ");
                    sb2.append(collection);
                    throw new IllegalArgumentException(sb2.toString());
                } else if ((remove || ((!remove2 || !remove3) && ((!remove2 || remove4) && !remove3))) && z2) {
                    StringBuilder sb3 = new StringBuilder("No valid ISO8601 format for fields: ");
                    sb3.append(collection);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            if (remove) {
                dateTimeFormatterBuilder.appendHourOfDay(2);
            } else if (remove2 || remove3 || remove4) {
                dateTimeFormatterBuilder.appendLiteral('-');
            }
            if (z && remove && remove2) {
                dateTimeFormatterBuilder.appendLiteral(':');
            }
            if (remove2) {
                dateTimeFormatterBuilder.appendMinuteOfHour(2);
            } else if (remove3 || remove4) {
                dateTimeFormatterBuilder.appendLiteral('-');
            }
            if (z && remove2 && remove3) {
                dateTimeFormatterBuilder.appendLiteral(':');
            }
            if (remove3) {
                dateTimeFormatterBuilder.appendSecondOfMinute(2);
            } else if (remove4) {
                dateTimeFormatterBuilder.appendLiteral('-');
            }
            if (remove4) {
                dateTimeFormatterBuilder.appendLiteral('.');
                dateTimeFormatterBuilder.appendMillisOfSecond(3);
            }
        }
    }

    public static DateTimeFormatter timeElementParser() {
        return Constants.tpe;
    }

    public static DateTimeFormatter timeNoMillis() {
        return Constants.tx;
    }

    public static DateTimeFormatter timeParser() {
        return Constants.tp;
    }

    public static DateTimeFormatter weekDate() {
        return Constants.wwd;
    }

    public static DateTimeFormatter weekDateTime() {
        return Constants.wdt;
    }

    public static DateTimeFormatter weekDateTimeNoMillis() {
        return Constants.wdtx;
    }

    public static DateTimeFormatter weekyear() {
        return Constants.we;
    }

    public static DateTimeFormatter weekyearWeek() {
        return Constants.ww;
    }

    public static DateTimeFormatter weekyearWeekDay() {
        return Constants.wwd;
    }

    public static DateTimeFormatter year() {
        return Constants.ye;
    }

    public static DateTimeFormatter yearMonth() {
        return Constants.ym;
    }

    public static DateTimeFormatter yearMonthDay() {
        return Constants.ymd;
    }
}
