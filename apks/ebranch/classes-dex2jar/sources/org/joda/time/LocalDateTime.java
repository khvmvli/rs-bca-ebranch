package org.joda.time;

import com.facebook.stetho.websocket.CloseCodes;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
/* loaded from: classes-dex2jar.jar:org/joda/time/LocalDateTime.class */
public final class LocalDateTime extends BaseLocal implements ReadablePartial, Serializable {
    private static final int DAY_OF_MONTH = 2;
    private static final int MILLIS_OF_DAY = 3;
    private static final int MONTH_OF_YEAR = 1;
    private static final int YEAR = 0;
    private static final long serialVersionUID = -268716875315837168L;
    private final Chronology iChronology;
    private final long iLocalMillis;

    public LocalDateTime() {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance());
    }

    public LocalDateTime(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, 0, 0, ISOChronology.getInstanceUTC());
    }

    public LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6) {
        this(i, i2, i3, i4, i5, i6, 0, ISOChronology.getInstanceUTC());
    }

    public LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(i, i2, i3, i4, i5, i6, i7, ISOChronology.getInstanceUTC());
    }

    public LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        long dateTimeMillis = withUTC.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        this.iChronology = withUTC;
        this.iLocalMillis = dateTimeMillis;
    }

    public LocalDateTime(long j) {
        this(j, ISOChronology.getInstance());
    }

    public LocalDateTime(long j, Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iLocalMillis = chronology2.getZone().getMillisKeepLocal(DateTimeZone.UTC, j);
        this.iChronology = chronology2.withUTC();
    }

    public LocalDateTime(long j, DateTimeZone dateTimeZone) {
        this(j, ISOChronology.getInstance(dateTimeZone));
    }

    public LocalDateTime(Object obj) {
        this(obj, (Chronology) null);
    }

    public LocalDateTime(Object obj, Chronology chronology) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology2 = DateTimeUtils.getChronology(partialConverter.getChronology(obj, chronology));
        Chronology withUTC = chronology2.withUTC();
        this.iChronology = withUTC;
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology2, ISODateTimeFormat.localDateOptionalTimeParser());
        this.iLocalMillis = withUTC.getDateTimeMillis(partialValues[0], partialValues[1], partialValues[2], partialValues[3]);
    }

    public LocalDateTime(Object obj, DateTimeZone dateTimeZone) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology = DateTimeUtils.getChronology(partialConverter.getChronology(obj, dateTimeZone));
        Chronology withUTC = chronology.withUTC();
        this.iChronology = withUTC;
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology, ISODateTimeFormat.localDateOptionalTimeParser());
        this.iLocalMillis = withUTC.getDateTimeMillis(partialValues[0], partialValues[1], partialValues[2], partialValues[3]);
    }

    public LocalDateTime(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public LocalDateTime(DateTimeZone dateTimeZone) {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance(dateTimeZone));
    }

    private Date correctDstTransition(Date date, TimeZone timeZone) {
        Calendar calendar;
        LocalDateTime localDateTime;
        Calendar instance = Calendar.getInstance(timeZone);
        instance.setTime(date);
        LocalDateTime fromCalendarFields = fromCalendarFields(instance);
        if (fromCalendarFields.isBefore(this)) {
            LocalDateTime localDateTime2 = fromCalendarFields;
            while (true) {
                if (localDateTime2.isBefore(this)) {
                    instance.setTimeInMillis(instance.getTimeInMillis() + 60000);
                    localDateTime2 = fromCalendarFields(instance);
                }
            }
            for (localDateTime = localDateTime2; !localDateTime.isBefore(this); localDateTime = fromCalendarFields(instance)) {
                instance.setTimeInMillis(instance.getTimeInMillis() - 1000);
            }
            instance.setTimeInMillis(instance.getTimeInMillis() + 1000);
            calendar = instance;
        } else {
            calendar = instance;
            if (fromCalendarFields.equals(this)) {
                Calendar instance2 = Calendar.getInstance(timeZone);
                instance2.setTimeInMillis(instance.getTimeInMillis() - ((long) timeZone.getDSTSavings()));
                calendar = instance;
                if (fromCalendarFields(instance2).equals(this)) {
                    calendar = instance2;
                }
            }
        }
        return calendar.getTime();
    }

    public static LocalDateTime fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            int i = calendar.get(0);
            int i2 = calendar.get(1);
            int i3 = i2;
            if (i != 1) {
                i3 = 1 - i2;
            }
            return new LocalDateTime(i3, calendar.get(2) + 1, calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static LocalDateTime fromDateFields(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        } else if (date.getTime() >= 0) {
            return new LocalDateTime(date.getYear() + 1900, date.getMonth() + 1, date.getDate(), date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + CloseCodes.NORMAL_CLOSURE) % CloseCodes.NORMAL_CLOSURE);
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            return fromCalendarFields(gregorianCalendar);
        }
    }

    public static LocalDateTime now() {
        return new LocalDateTime();
    }

    public static LocalDateTime now(Chronology chronology) {
        if (chronology != null) {
            return new LocalDateTime(chronology);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    public static LocalDateTime now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new LocalDateTime(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @FromString
    public static LocalDateTime parse(String str) {
        return parse(str, ISODateTimeFormat.localDateOptionalTimeParser());
    }

    public static LocalDateTime parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseLocalDateTime(str);
    }

    private Object readResolve() {
        return this.iChronology == null ? new LocalDateTime(this.iLocalMillis, ISOChronology.getInstanceUTC()) : !DateTimeZone.UTC.equals(this.iChronology.getZone()) ? new LocalDateTime(this.iLocalMillis, this.iChronology.withUTC()) : this;
    }

    public final Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    @Override // org.joda.time.base.AbstractPartial, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ReadablePartial readablePartial) {
        return compareTo(readablePartial);
    }

    @Override // org.joda.time.base.AbstractPartial
    /* renamed from: compareTo  reason: avoid collision after fix types in other method */
    public final int compareTo2(ReadablePartial readablePartial) {
        int i = 0;
        if (this == readablePartial) {
            return 0;
        }
        if (readablePartial instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) readablePartial;
            if (this.iChronology.equals(localDateTime.iChronology)) {
                int i2 = (this.iLocalMillis > localDateTime.iLocalMillis ? 1 : (this.iLocalMillis == localDateTime.iLocalMillis ? 0 : -1));
                if (i2 < 0) {
                    i = -1;
                } else if (i2 != 0) {
                    i = 1;
                }
                return i;
            }
        }
        return compareTo(readablePartial);
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

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial, java.lang.Object
    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.iChronology.equals(localDateTime.iChronology)) {
                if (this.iLocalMillis != localDateTime.iLocalMillis) {
                    z = false;
                }
                return z;
            }
        }
        return equals(obj);
    }

    public final Property era() {
        return new Property(this, getChronology().era());
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public final int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return dateTimeFieldType.getField(getChronology()).get(getLocalMillis());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    public final int getCenturyOfEra() {
        return getChronology().centuryOfEra().get(getLocalMillis());
    }

    @Override // org.joda.time.ReadablePartial
    public final Chronology getChronology() {
        return this.iChronology;
    }

    public final int getDayOfMonth() {
        return getChronology().dayOfMonth().get(getLocalMillis());
    }

    public final int getDayOfWeek() {
        return getChronology().dayOfWeek().get(getLocalMillis());
    }

    public final int getDayOfYear() {
        return getChronology().dayOfYear().get(getLocalMillis());
    }

    public final int getEra() {
        return getChronology().era().get(getLocalMillis());
    }

    @Override // org.joda.time.base.AbstractPartial
    public final DateTimeField getField(int i, Chronology chronology) {
        if (i == 0) {
            return chronology.year();
        }
        if (i == 1) {
            return chronology.monthOfYear();
        }
        if (i == 2) {
            return chronology.dayOfMonth();
        }
        if (i == 3) {
            return chronology.millisOfDay();
        }
        StringBuilder sb = new StringBuilder("Invalid index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int getHourOfDay() {
        return getChronology().hourOfDay().get(getLocalMillis());
    }

    @Override // org.joda.time.base.BaseLocal
    public final long getLocalMillis() {
        return this.iLocalMillis;
    }

    public final int getMillisOfDay() {
        return getChronology().millisOfDay().get(getLocalMillis());
    }

    public final int getMillisOfSecond() {
        return getChronology().millisOfSecond().get(getLocalMillis());
    }

    public final int getMinuteOfHour() {
        return getChronology().minuteOfHour().get(getLocalMillis());
    }

    public final int getMonthOfYear() {
        return getChronology().monthOfYear().get(getLocalMillis());
    }

    public final int getSecondOfMinute() {
        return getChronology().secondOfMinute().get(getLocalMillis());
    }

    @Override // org.joda.time.ReadablePartial
    public final int getValue(int i) {
        if (i == 0) {
            return getChronology().year().get(getLocalMillis());
        }
        if (i == 1) {
            return getChronology().monthOfYear().get(getLocalMillis());
        }
        if (i == 2) {
            return getChronology().dayOfMonth().get(getLocalMillis());
        }
        if (i == 3) {
            return getChronology().millisOfDay().get(getLocalMillis());
        }
        StringBuilder sb = new StringBuilder("Invalid index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int getWeekOfWeekyear() {
        return getChronology().weekOfWeekyear().get(getLocalMillis());
    }

    public final int getWeekyear() {
        return getChronology().weekyear().get(getLocalMillis());
    }

    public final int getYear() {
        return getChronology().year().get(getLocalMillis());
    }

    public final int getYearOfCentury() {
        return getChronology().yearOfCentury().get(getLocalMillis());
    }

    public final int getYearOfEra() {
        return getChronology().yearOfEra().get(getLocalMillis());
    }

    public final Property hourOfDay() {
        return new Property(this, getChronology().hourOfDay());
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public final boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        return dateTimeFieldType.getField(getChronology()).isSupported();
    }

    public final boolean isSupported(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        return durationFieldType.getField(getChronology()).isSupported();
    }

    public final Property millisOfDay() {
        return new Property(this, getChronology().millisOfDay());
    }

    public final Property millisOfSecond() {
        return new Property(this, getChronology().millisOfSecond());
    }

    public final LocalDateTime minus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, -1);
    }

    public final LocalDateTime minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public final LocalDateTime minusDays(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().days().subtract(getLocalMillis(), i));
    }

    public final LocalDateTime minusHours(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().hours().subtract(getLocalMillis(), i));
    }

    public final LocalDateTime minusMillis(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().millis().subtract(getLocalMillis(), i));
    }

    public final LocalDateTime minusMinutes(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().minutes().subtract(getLocalMillis(), i));
    }

    public final LocalDateTime minusMonths(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().months().subtract(getLocalMillis(), i));
    }

    public final LocalDateTime minusSeconds(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().seconds().subtract(getLocalMillis(), i));
    }

    public final LocalDateTime minusWeeks(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().weeks().subtract(getLocalMillis(), i));
    }

    public final LocalDateTime minusYears(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().years().subtract(getLocalMillis(), i));
    }

    public final Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public final Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public final LocalDateTime plus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, 1);
    }

    public final LocalDateTime plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public final LocalDateTime plusDays(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().days().add(getLocalMillis(), i));
    }

    public final LocalDateTime plusHours(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().hours().add(getLocalMillis(), i));
    }

    public final LocalDateTime plusMillis(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().millis().add(getLocalMillis(), i));
    }

    public final LocalDateTime plusMinutes(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().minutes().add(getLocalMillis(), i));
    }

    public final LocalDateTime plusMonths(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().months().add(getLocalMillis(), i));
    }

    public final LocalDateTime plusSeconds(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().seconds().add(getLocalMillis(), i));
    }

    public final LocalDateTime plusWeeks(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().weeks().add(getLocalMillis(), i));
    }

    public final LocalDateTime plusYears(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().years().add(getLocalMillis(), i));
    }

    public final Property property(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else if (isSupported(dateTimeFieldType)) {
            return new Property(this, dateTimeFieldType.getField(getChronology()));
        } else {
            StringBuilder sb = new StringBuilder("Field '");
            sb.append(dateTimeFieldType);
            sb.append("' is not supported");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final Property secondOfMinute() {
        return new Property(this, getChronology().secondOfMinute());
    }

    @Override // org.joda.time.ReadablePartial
    public final int size() {
        return 4;
    }

    public final Date toDate() {
        Date date = new Date(getYear() - 1900, getMonthOfYear() - 1, getDayOfMonth(), getHourOfDay(), getMinuteOfHour(), getSecondOfMinute());
        date.setTime(date.getTime() + ((long) getMillisOfSecond()));
        return correctDstTransition(date, TimeZone.getDefault());
    }

    public final Date toDate(TimeZone timeZone) {
        Calendar instance = Calendar.getInstance(timeZone);
        instance.clear();
        instance.set(getYear(), getMonthOfYear() - 1, getDayOfMonth(), getHourOfDay(), getMinuteOfHour(), getSecondOfMinute());
        Date time = instance.getTime();
        time.setTime(time.getTime() + ((long) getMillisOfSecond()));
        return correctDstTransition(time, timeZone);
    }

    public final DateTime toDateTime() {
        return toDateTime((DateTimeZone) null);
    }

    public final DateTime toDateTime(DateTimeZone dateTimeZone) {
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), getHourOfDay(), getMinuteOfHour(), getSecondOfMinute(), getMillisOfSecond(), this.iChronology.withZone(DateTimeUtils.getZone(dateTimeZone)));
    }

    public final LocalDate toLocalDate() {
        return new LocalDate(getLocalMillis(), getChronology());
    }

    public final LocalTime toLocalTime() {
        return new LocalTime(getLocalMillis(), getChronology());
    }

    @Override // org.joda.time.ReadablePartial, java.lang.Object
    @ToString
    public final String toString() {
        return ISODateTimeFormat.dateTime().print(this);
    }

    public final String toString(String str) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).print(this);
    }

    public final String toString(String str, Locale locale) throws IllegalArgumentException {
        return str == null ? toString() : DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public final Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public final Property weekyear() {
        return new Property(this, getChronology().weekyear());
    }

    public final LocalDateTime withCenturyOfEra(int i) {
        return withLocalMillis(getChronology().centuryOfEra().set(getLocalMillis(), i));
    }

    public final LocalDateTime withDate(int i, int i2, int i3) {
        Chronology chronology = getChronology();
        return withLocalMillis(chronology.dayOfMonth().set(chronology.monthOfYear().set(chronology.year().set(getLocalMillis(), i), i2), i3));
    }

    public final LocalDateTime withDayOfMonth(int i) {
        return withLocalMillis(getChronology().dayOfMonth().set(getLocalMillis(), i));
    }

    public final LocalDateTime withDayOfWeek(int i) {
        return withLocalMillis(getChronology().dayOfWeek().set(getLocalMillis(), i));
    }

    public final LocalDateTime withDayOfYear(int i) {
        return withLocalMillis(getChronology().dayOfYear().set(getLocalMillis(), i));
    }

    public final LocalDateTime withDurationAdded(ReadableDuration readableDuration, int i) {
        return (readableDuration == null || i == 0) ? this : withLocalMillis(getChronology().add(getLocalMillis(), readableDuration.getMillis(), i));
    }

    public final LocalDateTime withEra(int i) {
        return withLocalMillis(getChronology().era().set(getLocalMillis(), i));
    }

    public final LocalDateTime withField(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            return withLocalMillis(dateTimeFieldType.getField(getChronology()).set(getLocalMillis(), i));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public final LocalDateTime withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType != null) {
            return i == 0 ? this : withLocalMillis(durationFieldType.getField(getChronology()).add(getLocalMillis(), i));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public final LocalDateTime withFields(ReadablePartial readablePartial) {
        return readablePartial == null ? this : withLocalMillis(getChronology().set(readablePartial, getLocalMillis()));
    }

    public final LocalDateTime withHourOfDay(int i) {
        return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), i));
    }

    final LocalDateTime withLocalMillis(long j) {
        return j == getLocalMillis() ? this : new LocalDateTime(j, getChronology());
    }

    public final LocalDateTime withMillisOfDay(int i) {
        return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), i));
    }

    public final LocalDateTime withMillisOfSecond(int i) {
        return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), i));
    }

    public final LocalDateTime withMinuteOfHour(int i) {
        return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), i));
    }

    public final LocalDateTime withMonthOfYear(int i) {
        return withLocalMillis(getChronology().monthOfYear().set(getLocalMillis(), i));
    }

    public final LocalDateTime withPeriodAdded(ReadablePeriod readablePeriod, int i) {
        return (readablePeriod == null || i == 0) ? this : withLocalMillis(getChronology().add(readablePeriod, getLocalMillis(), i));
    }

    public final LocalDateTime withSecondOfMinute(int i) {
        return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), i));
    }

    public final LocalDateTime withTime(int i, int i2, int i3, int i4) {
        Chronology chronology = getChronology();
        return withLocalMillis(chronology.millisOfSecond().set(chronology.secondOfMinute().set(chronology.minuteOfHour().set(chronology.hourOfDay().set(getLocalMillis(), i), i2), i3), i4));
    }

    public final LocalDateTime withWeekOfWeekyear(int i) {
        return withLocalMillis(getChronology().weekOfWeekyear().set(getLocalMillis(), i));
    }

    public final LocalDateTime withWeekyear(int i) {
        return withLocalMillis(getChronology().weekyear().set(getLocalMillis(), i));
    }

    public final LocalDateTime withYear(int i) {
        return withLocalMillis(getChronology().year().set(getLocalMillis(), i));
    }

    public final LocalDateTime withYearOfCentury(int i) {
        return withLocalMillis(getChronology().yearOfCentury().set(getLocalMillis(), i));
    }

    public final LocalDateTime withYearOfEra(int i) {
        return withLocalMillis(getChronology().yearOfEra().set(getLocalMillis(), i));
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
