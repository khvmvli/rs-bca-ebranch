package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
/* loaded from: classes-dex2jar.jar:org/joda/time/DateTime.class */
public final class DateTime extends BaseDateTime implements ReadableDateTime, Serializable {
    private static final long serialVersionUID;

    public DateTime() {
    }

    public DateTime(int i, int i2, int i3, int i4, int i5) {
        super(i, i2, i3, i4, i5, 0, 0);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6, 0);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(i, i2, i3, i4, i5, i6, i7);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, Chronology chronology) {
        super(i, i2, i3, i4, i5, i6, i7, chronology);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, DateTimeZone dateTimeZone) {
        super(i, i2, i3, i4, i5, i6, i7, dateTimeZone);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6, Chronology chronology) {
        super(i, i2, i3, i4, i5, i6, 0, chronology);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6, DateTimeZone dateTimeZone) {
        super(i, i2, i3, i4, i5, i6, 0, dateTimeZone);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, Chronology chronology) {
        super(i, i2, i3, i4, i5, 0, 0, chronology);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, DateTimeZone dateTimeZone) {
        super(i, i2, i3, i4, i5, 0, 0, dateTimeZone);
    }

    public DateTime(long j) {
        super(j);
    }

    public DateTime(long j, Chronology chronology) {
        super(j, chronology);
    }

    public DateTime(long j, DateTimeZone dateTimeZone) {
        super(j, dateTimeZone);
    }

    public DateTime(Object obj) {
        super(obj, (Chronology) null);
    }

    public DateTime(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology));
    }

    public DateTime(Object obj, DateTimeZone dateTimeZone) {
        super(obj, dateTimeZone);
    }

    public DateTime(Chronology chronology) {
        super(chronology);
    }

    public DateTime(DateTimeZone dateTimeZone) {
        super(dateTimeZone);
    }

    public static DateTime now() {
        return new DateTime();
    }

    public static DateTime now(Chronology chronology) {
        if (chronology != null) {
            return new DateTime(chronology);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    public static DateTime now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new DateTime(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @FromString
    public static DateTime parse(String str) {
        return parse(str, ISODateTimeFormat.dateTimeParser().withOffsetParsed());
    }

    public static DateTime parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseDateTime(str);
    }

    public final Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    public final Property dayOfMonth() {
        return new Property(this, getChronology().dayOfMonth());
    }

    public final Property dayOfWeek() {
        return new Property(this, getChronology().dayOfWeek());
    }

    public final Property dayOfYear() {
        return new Property(this, getChronology().dayOfYear());
    }

    public final Property era() {
        return new Property(this, getChronology().era());
    }

    public final Property hourOfDay() {
        return new Property(this, getChronology().hourOfDay());
    }

    public final Property millisOfDay() {
        return new Property(this, getChronology().millisOfDay());
    }

    public final Property millisOfSecond() {
        return new Property(this, getChronology().millisOfSecond());
    }

    public final DateTime minus(long j) {
        return withDurationAdded(j, -1);
    }

    public final DateTime minus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, -1);
    }

    public final DateTime minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public final DateTime minusDays(int i) {
        return i == 0 ? this : withMillis(getChronology().days().subtract(getMillis(), i));
    }

    public final DateTime minusHours(int i) {
        return i == 0 ? this : withMillis(getChronology().hours().subtract(getMillis(), i));
    }

    public final DateTime minusMillis(int i) {
        return i == 0 ? this : withMillis(getChronology().millis().subtract(getMillis(), i));
    }

    public final DateTime minusMinutes(int i) {
        return i == 0 ? this : withMillis(getChronology().minutes().subtract(getMillis(), i));
    }

    public final DateTime minusMonths(int i) {
        return i == 0 ? this : withMillis(getChronology().months().subtract(getMillis(), i));
    }

    public final DateTime minusSeconds(int i) {
        return i == 0 ? this : withMillis(getChronology().seconds().subtract(getMillis(), i));
    }

    public final DateTime minusWeeks(int i) {
        return i == 0 ? this : withMillis(getChronology().weeks().subtract(getMillis(), i));
    }

    public final DateTime minusYears(int i) {
        return i == 0 ? this : withMillis(getChronology().years().subtract(getMillis(), i));
    }

    public final Property minuteOfDay() {
        return new Property(this, getChronology().minuteOfDay());
    }

    public final Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public final Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public final DateTime plus(long j) {
        return withDurationAdded(j, 1);
    }

    public final DateTime plus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, 1);
    }

    public final DateTime plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public final DateTime plusDays(int i) {
        return i == 0 ? this : withMillis(getChronology().days().add(getMillis(), i));
    }

    public final DateTime plusHours(int i) {
        return i == 0 ? this : withMillis(getChronology().hours().add(getMillis(), i));
    }

    public final DateTime plusMillis(int i) {
        return i == 0 ? this : withMillis(getChronology().millis().add(getMillis(), i));
    }

    public final DateTime plusMinutes(int i) {
        return i == 0 ? this : withMillis(getChronology().minutes().add(getMillis(), i));
    }

    public final DateTime plusMonths(int i) {
        return i == 0 ? this : withMillis(getChronology().months().add(getMillis(), i));
    }

    public final DateTime plusSeconds(int i) {
        return i == 0 ? this : withMillis(getChronology().seconds().add(getMillis(), i));
    }

    public final DateTime plusWeeks(int i) {
        return i == 0 ? this : withMillis(getChronology().weeks().add(getMillis(), i));
    }

    public final DateTime plusYears(int i) {
        return i == 0 ? this : withMillis(getChronology().years().add(getMillis(), i));
    }

    public final Property property(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            DateTimeField field = dateTimeFieldType.getField(getChronology());
            if (field.isSupported()) {
                return new Property(this, field);
            }
            StringBuilder sb = new StringBuilder("Field '");
            sb.append(dateTimeFieldType);
            sb.append("' is not supported");
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    public final Property secondOfDay() {
        return new Property(this, getChronology().secondOfDay());
    }

    public final Property secondOfMinute() {
        return new Property(this, getChronology().secondOfMinute());
    }

    @Deprecated
    public final DateMidnight toDateMidnight() {
        return new DateMidnight(getMillis(), getChronology());
    }

    @Override // org.joda.time.base.AbstractInstant, org.joda.time.ReadableDateTime
    public final DateTime toDateTime() {
        return this;
    }

    @Override // org.joda.time.base.AbstractInstant
    public final DateTime toDateTime(Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        return getChronology() == chronology2 ? this : toDateTime(chronology2);
    }

    @Override // org.joda.time.base.AbstractInstant
    public final DateTime toDateTime(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        return getZone() == zone ? this : toDateTime(zone);
    }

    @Override // org.joda.time.base.AbstractInstant
    public final DateTime toDateTimeISO() {
        return getChronology() == ISOChronology.getInstance() ? this : toDateTimeISO();
    }

    public final LocalDate toLocalDate() {
        return new LocalDate(getMillis(), getChronology());
    }

    public final LocalDateTime toLocalDateTime() {
        return new LocalDateTime(getMillis(), getChronology());
    }

    public final LocalTime toLocalTime() {
        return new LocalTime(getMillis(), getChronology());
    }

    @Deprecated
    public final TimeOfDay toTimeOfDay() {
        return new TimeOfDay(getMillis(), getChronology());
    }

    @Deprecated
    public final YearMonthDay toYearMonthDay() {
        return new YearMonthDay(getMillis(), getChronology());
    }

    public final Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public final Property weekyear() {
        return new Property(this, getChronology().weekyear());
    }

    public final DateTime withCenturyOfEra(int i) {
        return withMillis(getChronology().centuryOfEra().set(getMillis(), i));
    }

    public final DateTime withChronology(Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        return chronology2 == getChronology() ? this : new DateTime(getMillis(), chronology2);
    }

    public final DateTime withDate(int i, int i2, int i3) {
        Chronology chronology = getChronology();
        return withMillis(chronology.getZone().convertLocalToUTC(chronology.withUTC().getDateTimeMillis(i, i2, i3, getMillisOfDay()), false, getMillis()));
    }

    public final DateTime withDate(LocalDate localDate) {
        return withDate(localDate.getYear(), localDate.getMonthOfYear(), localDate.getDayOfMonth());
    }

    public final DateTime withDayOfMonth(int i) {
        return withMillis(getChronology().dayOfMonth().set(getMillis(), i));
    }

    public final DateTime withDayOfWeek(int i) {
        return withMillis(getChronology().dayOfWeek().set(getMillis(), i));
    }

    public final DateTime withDayOfYear(int i) {
        return withMillis(getChronology().dayOfYear().set(getMillis(), i));
    }

    public final DateTime withDurationAdded(long j, int i) {
        return (j == 0 || i == 0) ? this : withMillis(getChronology().add(getMillis(), j, i));
    }

    public final DateTime withDurationAdded(ReadableDuration readableDuration, int i) {
        return (readableDuration == null || i == 0) ? this : withDurationAdded(readableDuration.getMillis(), i);
    }

    public final DateTime withEarlierOffsetAtOverlap() {
        return withMillis(getZone().adjustOffset(getMillis(), false));
    }

    public final DateTime withEra(int i) {
        return withMillis(getChronology().era().set(getMillis(), i));
    }

    public final DateTime withField(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            return withMillis(dateTimeFieldType.getField(getChronology()).set(getMillis(), i));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public final DateTime withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType != null) {
            return i == 0 ? this : withMillis(durationFieldType.getField(getChronology()).add(getMillis(), i));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public final DateTime withFields(ReadablePartial readablePartial) {
        return readablePartial == null ? this : withMillis(getChronology().set(readablePartial, getMillis()));
    }

    public final DateTime withHourOfDay(int i) {
        return withMillis(getChronology().hourOfDay().set(getMillis(), i));
    }

    public final DateTime withLaterOffsetAtOverlap() {
        return withMillis(getZone().adjustOffset(getMillis(), true));
    }

    public final DateTime withMillis(long j) {
        return j == getMillis() ? this : new DateTime(j, getChronology());
    }

    public final DateTime withMillisOfDay(int i) {
        return withMillis(getChronology().millisOfDay().set(getMillis(), i));
    }

    public final DateTime withMillisOfSecond(int i) {
        return withMillis(getChronology().millisOfSecond().set(getMillis(), i));
    }

    public final DateTime withMinuteOfHour(int i) {
        return withMillis(getChronology().minuteOfHour().set(getMillis(), i));
    }

    public final DateTime withMonthOfYear(int i) {
        return withMillis(getChronology().monthOfYear().set(getMillis(), i));
    }

    public final DateTime withPeriodAdded(ReadablePeriod readablePeriod, int i) {
        return (readablePeriod == null || i == 0) ? this : withMillis(getChronology().add(readablePeriod, getMillis(), i));
    }

    public final DateTime withSecondOfMinute(int i) {
        return withMillis(getChronology().secondOfMinute().set(getMillis(), i));
    }

    public final DateTime withTime(int i, int i2, int i3, int i4) {
        Chronology chronology = getChronology();
        return withMillis(chronology.getZone().convertLocalToUTC(chronology.withUTC().getDateTimeMillis(getYear(), getMonthOfYear(), getDayOfMonth(), i, i2, i3, i4), false, getMillis()));
    }

    public final DateTime withTime(LocalTime localTime) {
        return withTime(localTime.getHourOfDay(), localTime.getMinuteOfHour(), localTime.getSecondOfMinute(), localTime.getMillisOfSecond());
    }

    public final DateTime withTimeAtStartOfDay() {
        return toLocalDate().toDateTimeAtStartOfDay(getZone());
    }

    public final DateTime withWeekOfWeekyear(int i) {
        return withMillis(getChronology().weekOfWeekyear().set(getMillis(), i));
    }

    public final DateTime withWeekyear(int i) {
        return withMillis(getChronology().weekyear().set(getMillis(), i));
    }

    public final DateTime withYear(int i) {
        return withMillis(getChronology().year().set(getMillis(), i));
    }

    public final DateTime withYearOfCentury(int i) {
        return withMillis(getChronology().yearOfCentury().set(getMillis(), i));
    }

    public final DateTime withYearOfEra(int i) {
        return withMillis(getChronology().yearOfEra().set(getMillis(), i));
    }

    public final DateTime withZone(DateTimeZone dateTimeZone) {
        return withChronology(getChronology().withZone(dateTimeZone));
    }

    public final DateTime withZoneRetainFields(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        DateTimeZone zone2 = DateTimeUtils.getZone(getZone());
        return zone == zone2 ? this : new DateTime(zone2.getMillisKeepLocal(zone, getMillis()), getChronology().withZone(zone));
    }

    public final Property year() {
        return new Property(this, getChronology().year());
    }

    public final Property yearOfCentury() {
        return new Property(this, getChronology().yearOfCentury());
    }

    public final Property yearOfEra() {
        return new Property(this, getChronology().yearOfEra());
    }
}
