package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
/* loaded from: classes2-dex2jar.jar:org/joda/time/LocalDate.class */
public final class LocalDate extends BaseLocal implements ReadablePartial, Serializable {
    private static final Set<DurationFieldType> DATE_DURATION_TYPES;
    private static final int DAY_OF_MONTH = 2;
    private static final int MONTH_OF_YEAR = 1;
    private static final int YEAR = 0;
    private static final long serialVersionUID = -8775358157899L;
    private final Chronology iChronology;
    private transient int iHash;
    private final long iLocalMillis;

    /* loaded from: classes2-dex2jar.jar:org/joda/time/LocalDate$Property.class */
    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -3193829732634L;
        private transient DateTimeField iField;
        private transient LocalDate iInstant;

        Property(LocalDate localDate, DateTimeField dateTimeField) {
            this.iInstant = localDate;
            this.iField = dateTimeField;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (LocalDate) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public final LocalDate addToCopy(int i) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.add(localDate.getLocalMillis(), i));
        }

        public final LocalDate addWrapFieldToCopy(int i) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.addWrapField(localDate.getLocalMillis(), i));
        }

        public final Chronology getChronology() {
            return this.iInstant.getChronology();
        }

        public final DateTimeField getField() {
            return this.iField;
        }

        public final LocalDate getLocalDate() {
            return this.iInstant;
        }

        public final long getMillis() {
            return this.iInstant.getLocalMillis();
        }

        public final LocalDate roundCeilingCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundCeiling(localDate.getLocalMillis()));
        }

        public final LocalDate roundFloorCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundFloor(localDate.getLocalMillis()));
        }

        public final LocalDate roundHalfCeilingCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundHalfCeiling(localDate.getLocalMillis()));
        }

        public final LocalDate roundHalfEvenCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundHalfEven(localDate.getLocalMillis()));
        }

        public final LocalDate roundHalfFloorCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundHalfFloor(localDate.getLocalMillis()));
        }

        public final LocalDate setCopy(int i) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.set(localDate.getLocalMillis(), i));
        }

        public final LocalDate setCopy(String str) {
            return setCopy(str, null);
        }

        public final LocalDate setCopy(String str, Locale locale) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.set(localDate.getLocalMillis(), str, locale));
        }

        public final LocalDate withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public final LocalDate withMinimumValue() {
            return setCopy(getMinimumValue());
        }
    }

    static {
        HashSet hashSet = new HashSet();
        DATE_DURATION_TYPES = hashSet;
        hashSet.add(DurationFieldType.days());
        hashSet.add(DurationFieldType.weeks());
        hashSet.add(DurationFieldType.months());
        hashSet.add(DurationFieldType.weekyears());
        hashSet.add(DurationFieldType.years());
        hashSet.add(DurationFieldType.centuries());
        hashSet.add(DurationFieldType.eras());
    }

    public LocalDate() {
        this(DateTimeUtils.currentTimeMillis(), (Chronology) ISOChronology.getInstance());
    }

    public LocalDate(int i, int i2, int i3) {
        this(i, i2, i3, ISOChronology.getInstanceUTC());
    }

    public LocalDate(int i, int i2, int i3, Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        long dateTimeMillis = withUTC.getDateTimeMillis(i, i2, i3, 0);
        this.iChronology = withUTC;
        this.iLocalMillis = dateTimeMillis;
    }

    public LocalDate(long j) {
        this(j, (Chronology) ISOChronology.getInstance());
    }

    public LocalDate(long j, Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        long millisKeepLocal = chronology2.getZone().getMillisKeepLocal(DateTimeZone.UTC, j);
        Chronology withUTC = chronology2.withUTC();
        this.iLocalMillis = withUTC.dayOfMonth().roundFloor(millisKeepLocal);
        this.iChronology = withUTC;
    }

    public LocalDate(long j, DateTimeZone dateTimeZone) {
        this(j, (Chronology) ISOChronology.getInstance(dateTimeZone));
    }

    public LocalDate(Object obj) {
        this(obj, (Chronology) null);
    }

    public LocalDate(Object obj, Chronology chronology) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology2 = DateTimeUtils.getChronology(partialConverter.getChronology(obj, chronology));
        Chronology withUTC = chronology2.withUTC();
        this.iChronology = withUTC;
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology2, ISODateTimeFormat.localDateParser());
        this.iLocalMillis = withUTC.getDateTimeMillis(partialValues[0], partialValues[1], partialValues[2], 0);
    }

    public LocalDate(Object obj, DateTimeZone dateTimeZone) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology = DateTimeUtils.getChronology(partialConverter.getChronology(obj, dateTimeZone));
        Chronology withUTC = chronology.withUTC();
        this.iChronology = withUTC;
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology, ISODateTimeFormat.localDateParser());
        this.iLocalMillis = withUTC.getDateTimeMillis(partialValues[0], partialValues[1], partialValues[2], 0);
    }

    public LocalDate(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public LocalDate(DateTimeZone dateTimeZone) {
        this(DateTimeUtils.currentTimeMillis(), (Chronology) ISOChronology.getInstance(dateTimeZone));
    }

    public static LocalDate fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            int i = calendar.get(0);
            int i2 = calendar.get(1);
            int i3 = i2;
            if (i != 1) {
                i3 = 1 - i2;
            }
            return new LocalDate(i3, calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static LocalDate fromDateFields(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        } else if (date.getTime() >= 0) {
            return new LocalDate(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            return fromCalendarFields(gregorianCalendar);
        }
    }

    public static LocalDate now() {
        return new LocalDate();
    }

    public static LocalDate now(Chronology chronology) {
        if (chronology != null) {
            return new LocalDate(chronology);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    public static LocalDate now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new LocalDate(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @FromString
    public static LocalDate parse(String str) {
        return parse(str, ISODateTimeFormat.localDateParser());
    }

    public static LocalDate parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseLocalDate(str);
    }

    private Object readResolve() {
        return this.iChronology == null ? new LocalDate(this.iLocalMillis, (Chronology) ISOChronology.getInstanceUTC()) : !DateTimeZone.UTC.equals(this.iChronology.getZone()) ? new LocalDate(this.iLocalMillis, this.iChronology.withUTC()) : this;
    }

    public final Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((ReadablePartial) obj);
    }

    public final int compareTo(ReadablePartial readablePartial) {
        int i = 0;
        if (this == readablePartial) {
            return 0;
        }
        if (readablePartial instanceof LocalDate) {
            LocalDate localDate = (LocalDate) readablePartial;
            if (this.iChronology.equals(localDate.iChronology)) {
                int i2 = (this.iLocalMillis > localDate.iLocalMillis ? 1 : (this.iLocalMillis == localDate.iLocalMillis ? 0 : -1));
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

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDate) {
            LocalDate localDate = (LocalDate) obj;
            if (this.iChronology.equals(localDate.iChronology)) {
                if (this.iLocalMillis != localDate.iLocalMillis) {
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

    public final int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else if (isSupported(dateTimeFieldType)) {
            return dateTimeFieldType.getField(getChronology()).get(getLocalMillis());
        } else {
            StringBuilder sb = new StringBuilder("Field '");
            sb.append(dateTimeFieldType);
            sb.append("' is not supported");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final int getCenturyOfEra() {
        return getChronology().centuryOfEra().get(getLocalMillis());
    }

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
        StringBuilder sb = new StringBuilder("Invalid index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final long getLocalMillis() {
        return this.iLocalMillis;
    }

    public final int getMonthOfYear() {
        return getChronology().monthOfYear().get(getLocalMillis());
    }

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

    @Override // java.lang.Object
    public final int hashCode() {
        int i = this.iHash;
        int i2 = i;
        if (i == 0) {
            i2 = hashCode();
            this.iHash = i2;
        }
        return i2;
    }

    public final boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        DurationFieldType durationType = dateTimeFieldType.getDurationType();
        if (DATE_DURATION_TYPES.contains(durationType) || durationType.getField(getChronology()).getUnitMillis() >= getChronology().days().getUnitMillis()) {
            return dateTimeFieldType.getField(getChronology()).isSupported();
        }
        return false;
    }

    public final boolean isSupported(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        DurationField field = durationFieldType.getField(getChronology());
        if (DATE_DURATION_TYPES.contains(durationFieldType) || field.getUnitMillis() >= getChronology().days().getUnitMillis()) {
            return field.isSupported();
        }
        return false;
    }

    public final LocalDate minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public final LocalDate minusDays(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().days().subtract(getLocalMillis(), i));
    }

    public final LocalDate minusMonths(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().months().subtract(getLocalMillis(), i));
    }

    public final LocalDate minusWeeks(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().weeks().subtract(getLocalMillis(), i));
    }

    public final LocalDate minusYears(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().years().subtract(getLocalMillis(), i));
    }

    public final Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public final LocalDate plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public final LocalDate plusDays(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().days().add(getLocalMillis(), i));
    }

    public final LocalDate plusMonths(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().months().add(getLocalMillis(), i));
    }

    public final LocalDate plusWeeks(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().weeks().add(getLocalMillis(), i));
    }

    public final LocalDate plusYears(int i) {
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

    public final int size() {
        return 3;
    }

    public final Date toDate() {
        Date date;
        int dayOfMonth = getDayOfMonth();
        Date date2 = new Date(getYear() - 1900, getMonthOfYear() - 1, dayOfMonth);
        LocalDate fromDateFields = fromDateFields(date2);
        if (fromDateFields.isBefore(this)) {
            for (LocalDate localDate = fromDateFields; !localDate.equals(this); localDate = fromDateFields(date2)) {
                date2.setTime(date2.getTime() + 3600000);
            }
            while (date2.getDate() == dayOfMonth) {
                date2.setTime(date2.getTime() - 1000);
            }
            date2.setTime(date2.getTime() + 1000);
            date = date2;
        } else {
            date = date2;
            if (fromDateFields.equals(this)) {
                Date date3 = new Date(date2.getTime() - ((long) TimeZone.getDefault().getDSTSavings()));
                date = date2;
                if (date3.getDate() == dayOfMonth) {
                    date = date3;
                }
            }
        }
        return date;
    }

    @Deprecated
    public final DateMidnight toDateMidnight() {
        return toDateMidnight(null);
    }

    @Deprecated
    public final DateMidnight toDateMidnight(DateTimeZone dateTimeZone) {
        return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology().withZone(DateTimeUtils.getZone(dateTimeZone)));
    }

    public final DateTime toDateTime(LocalTime localTime) {
        return toDateTime(localTime, null);
    }

    public final DateTime toDateTime(LocalTime localTime, DateTimeZone dateTimeZone) {
        if (localTime == null) {
            return toDateTimeAtCurrentTime(dateTimeZone);
        }
        if (getChronology() == localTime.getChronology()) {
            return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), localTime.getHourOfDay(), localTime.getMinuteOfHour(), localTime.getSecondOfMinute(), localTime.getMillisOfSecond(), getChronology().withZone(dateTimeZone));
        }
        throw new IllegalArgumentException("The chronology of the time does not match");
    }

    public final DateTime toDateTimeAtCurrentTime() {
        return toDateTimeAtCurrentTime(null);
    }

    public final DateTime toDateTimeAtCurrentTime(DateTimeZone dateTimeZone) {
        Chronology withZone = getChronology().withZone(DateTimeUtils.getZone(dateTimeZone));
        return new DateTime(withZone.set(this, DateTimeUtils.currentTimeMillis()), withZone);
    }

    @Deprecated
    public final DateTime toDateTimeAtMidnight() {
        return toDateTimeAtMidnight(null);
    }

    @Deprecated
    public final DateTime toDateTimeAtMidnight(DateTimeZone dateTimeZone) {
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, getChronology().withZone(DateTimeUtils.getZone(dateTimeZone)));
    }

    public final DateTime toDateTimeAtStartOfDay() {
        return toDateTimeAtStartOfDay(null);
    }

    public final DateTime toDateTimeAtStartOfDay(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        Chronology withZone = getChronology().withZone(zone);
        return new DateTime(withZone.dayOfMonth().roundFloor(zone.convertLocalToUTC(getLocalMillis() + 21600000, false)), withZone);
    }

    public final Interval toInterval() {
        return toInterval(null);
    }

    public final Interval toInterval(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        return new Interval((ReadableInstant) toDateTimeAtStartOfDay(zone), (ReadableInstant) plusDays(1).toDateTimeAtStartOfDay(zone));
    }

    public final LocalDateTime toLocalDateTime(LocalTime localTime) {
        if (localTime == null) {
            throw new IllegalArgumentException("The time must not be null");
        } else if (getChronology() == localTime.getChronology()) {
            return new LocalDateTime(getLocalMillis() + localTime.getLocalMillis(), getChronology());
        } else {
            throw new IllegalArgumentException("The chronology of the time does not match");
        }
    }

    @Override // java.lang.Object
    @ToString
    public final String toString() {
        return ISODateTimeFormat.date().print(this);
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

    public final LocalDate withCenturyOfEra(int i) {
        return withLocalMillis(getChronology().centuryOfEra().set(getLocalMillis(), i));
    }

    public final LocalDate withDayOfMonth(int i) {
        return withLocalMillis(getChronology().dayOfMonth().set(getLocalMillis(), i));
    }

    public final LocalDate withDayOfWeek(int i) {
        return withLocalMillis(getChronology().dayOfWeek().set(getLocalMillis(), i));
    }

    public final LocalDate withDayOfYear(int i) {
        return withLocalMillis(getChronology().dayOfYear().set(getLocalMillis(), i));
    }

    public final LocalDate withEra(int i) {
        return withLocalMillis(getChronology().era().set(getLocalMillis(), i));
    }

    public final LocalDate withField(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (isSupported(dateTimeFieldType)) {
            return withLocalMillis(dateTimeFieldType.getField(getChronology()).set(getLocalMillis(), i));
        } else {
            StringBuilder sb = new StringBuilder("Field '");
            sb.append(dateTimeFieldType);
            sb.append("' is not supported");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final LocalDate withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (isSupported(durationFieldType)) {
            return i == 0 ? this : withLocalMillis(durationFieldType.getField(getChronology()).add(getLocalMillis(), i));
        } else {
            StringBuilder sb = new StringBuilder("Field '");
            sb.append(durationFieldType);
            sb.append("' is not supported");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final LocalDate withFields(ReadablePartial readablePartial) {
        return readablePartial == null ? this : withLocalMillis(getChronology().set(readablePartial, getLocalMillis()));
    }

    final LocalDate withLocalMillis(long j) {
        long roundFloor = this.iChronology.dayOfMonth().roundFloor(j);
        return roundFloor == getLocalMillis() ? this : new LocalDate(roundFloor, getChronology());
    }

    public final LocalDate withMonthOfYear(int i) {
        return withLocalMillis(getChronology().monthOfYear().set(getLocalMillis(), i));
    }

    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v2, types: [long] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final org.joda.time.LocalDate withPeriodAdded(org.joda.time.ReadablePeriod r7, int r8) {
        /*
            r6 = this;
            r0 = r7
            if (r0 == 0) goto L_0x0064
            r0 = r8
            if (r0 == 0) goto L_0x0064
            r0 = r6
            long r0 = r0.getLocalMillis()
            r9 = r0
            r0 = r6
            org.joda.time.Chronology r0 = r0.getChronology()
            r11 = r0
            r0 = 0
            r12 = r0
        L_0x0016:
            r0 = r12
            r1 = r7
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x005e
            r0 = r7
            r1 = r12
            int r0 = r0.getValue(r1)
            r1 = r8
            int r0 = org.joda.time.field.FieldUtils.safeMultiply(r0, r1)
            long r0 = (long) r0
            r13 = r0
            r0 = r7
            r1 = r12
            org.joda.time.DurationFieldType r0 = r0.getFieldType(r1)
            r15 = r0
            r0 = r9
            r16 = r0
            r0 = r6
            r1 = r15
            boolean r0 = r0.isSupported(r1)
            if (r0 == 0) goto L_0x0055
            r0 = r15
            r1 = r11
            org.joda.time.DurationField r0 = r0.getField(r1)
            r1 = r9
            r2 = r13
            long r0 = r0.add(r1, r2)
            r16 = r0
        L_0x0055:
            int r12 = r12 + 1
            r0 = r16
            r9 = r0
            goto L_0x0016
        L_0x005e:
            r0 = r6
            r1 = r9
            org.joda.time.LocalDate r0 = r0.withLocalMillis(r1)
            return r0
        L_0x0064:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.LocalDate.withPeriodAdded(org.joda.time.ReadablePeriod, int):org.joda.time.LocalDate");
    }

    public final LocalDate withWeekOfWeekyear(int i) {
        return withLocalMillis(getChronology().weekOfWeekyear().set(getLocalMillis(), i));
    }

    public final LocalDate withWeekyear(int i) {
        return withLocalMillis(getChronology().weekyear().set(getLocalMillis(), i));
    }

    public final LocalDate withYear(int i) {
        return withLocalMillis(getChronology().year().set(getLocalMillis(), i));
    }

    public final LocalDate withYearOfCentury(int i) {
        return withLocalMillis(getChronology().yearOfCentury().set(getLocalMillis(), i));
    }

    public final LocalDate withYearOfEra(int i) {
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
