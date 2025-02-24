package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
/* loaded from: classes-dex2jar.jar:org/joda/time/MutableDateTime.class */
public class MutableDateTime extends BaseDateTime implements ReadWritableDateTime, Cloneable, Serializable {
    public static final int ROUND_CEILING;
    public static final int ROUND_FLOOR;
    public static final int ROUND_HALF_CEILING;
    public static final int ROUND_HALF_EVEN;
    public static final int ROUND_HALF_FLOOR;
    public static final int ROUND_NONE;
    private static final long serialVersionUID;
    private DateTimeField iRoundingField;
    private int iRoundingMode;

    /* loaded from: classes-dex2jar.jar:org/joda/time/MutableDateTime$Property.class */
    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID;
        private DateTimeField iField;
        private MutableDateTime iInstant;

        Property(MutableDateTime mutableDateTime, DateTimeField dateTimeField) {
            this.iInstant = mutableDateTime;
            this.iField = dateTimeField;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (MutableDateTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public final MutableDateTime add(int i) {
            this.iInstant.setMillis(getField().add(this.iInstant.getMillis(), i));
            return this.iInstant;
        }

        public final MutableDateTime add(long j) {
            this.iInstant.setMillis(getField().add(this.iInstant.getMillis(), j));
            return this.iInstant;
        }

        public final MutableDateTime addWrapField(int i) {
            this.iInstant.setMillis(getField().addWrapField(this.iInstant.getMillis(), i));
            return this.iInstant;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public final Chronology getChronology() {
            return this.iInstant.getChronology();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public final DateTimeField getField() {
            return this.iField;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public final long getMillis() {
            return this.iInstant.getMillis();
        }

        public final MutableDateTime getMutableDateTime() {
            return this.iInstant;
        }

        public final MutableDateTime roundCeiling() {
            this.iInstant.setMillis(getField().roundCeiling(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public final MutableDateTime roundFloor() {
            this.iInstant.setMillis(getField().roundFloor(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public final MutableDateTime roundHalfCeiling() {
            this.iInstant.setMillis(getField().roundHalfCeiling(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public final MutableDateTime roundHalfEven() {
            this.iInstant.setMillis(getField().roundHalfEven(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public final MutableDateTime roundHalfFloor() {
            this.iInstant.setMillis(getField().roundHalfFloor(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public final MutableDateTime set(int i) {
            this.iInstant.setMillis(getField().set(this.iInstant.getMillis(), i));
            return this.iInstant;
        }

        public final MutableDateTime set(String str) {
            set(str, null);
            return this.iInstant;
        }

        public final MutableDateTime set(String str, Locale locale) {
            this.iInstant.setMillis(getField().set(this.iInstant.getMillis(), str, locale));
            return this.iInstant;
        }
    }

    public MutableDateTime() {
    }

    public MutableDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(i, i2, i3, i4, i5, i6, i7);
    }

    public MutableDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, Chronology chronology) {
        super(i, i2, i3, i4, i5, i6, i7, chronology);
    }

    public MutableDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, DateTimeZone dateTimeZone) {
        super(i, i2, i3, i4, i5, i6, i7, dateTimeZone);
    }

    public MutableDateTime(long j) {
        super(j);
    }

    public MutableDateTime(long j, Chronology chronology) {
        super(j, chronology);
    }

    public MutableDateTime(long j, DateTimeZone dateTimeZone) {
        super(j, dateTimeZone);
    }

    public MutableDateTime(Object obj) {
        super(obj, (Chronology) null);
    }

    public MutableDateTime(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology));
    }

    public MutableDateTime(Object obj, DateTimeZone dateTimeZone) {
        super(obj, dateTimeZone);
    }

    public MutableDateTime(Chronology chronology) {
        super(chronology);
    }

    public MutableDateTime(DateTimeZone dateTimeZone) {
        super(dateTimeZone);
    }

    public static MutableDateTime now() {
        return new MutableDateTime();
    }

    public static MutableDateTime now(Chronology chronology) {
        if (chronology != null) {
            return new MutableDateTime(chronology);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    public static MutableDateTime now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new MutableDateTime(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @FromString
    public static MutableDateTime parse(String str) {
        return parse(str, ISODateTimeFormat.dateTimeParser().withOffsetParsed());
    }

    public static MutableDateTime parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseDateTime(str).toMutableDateTime();
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(long j) {
        setMillis(FieldUtils.safeAdd(getMillis(), j));
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (i != 0) {
            setMillis(durationFieldType.getField(getChronology()).add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(ReadableDuration readableDuration) {
        add(readableDuration, 1);
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(ReadableDuration readableDuration, int i) {
        if (readableDuration != null) {
            add(FieldUtils.safeMultiply(readableDuration.getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(ReadablePeriod readablePeriod) {
        add(readablePeriod, 1);
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(ReadablePeriod readablePeriod, int i) {
        if (readablePeriod != null) {
            setMillis(getChronology().add(readablePeriod, getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addDays(int i) {
        if (i != 0) {
            setMillis(getChronology().days().add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addHours(int i) {
        if (i != 0) {
            setMillis(getChronology().hours().add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addMillis(int i) {
        if (i != 0) {
            setMillis(getChronology().millis().add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addMinutes(int i) {
        if (i != 0) {
            setMillis(getChronology().minutes().add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addMonths(int i) {
        if (i != 0) {
            setMillis(getChronology().months().add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addSeconds(int i) {
        if (i != 0) {
            setMillis(getChronology().seconds().add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addWeeks(int i) {
        if (i != 0) {
            setMillis(getChronology().weeks().add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addWeekyears(int i) {
        if (i != 0) {
            setMillis(getChronology().weekyears().add(getMillis(), i));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addYears(int i) {
        if (i != 0) {
            setMillis(getChronology().years().add(getMillis(), i));
        }
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError("Clone error");
        }
    }

    public MutableDateTime copy() {
        return (MutableDateTime) clone();
    }

    public Property dayOfMonth() {
        return new Property(this, getChronology().dayOfMonth());
    }

    public Property dayOfWeek() {
        return new Property(this, getChronology().dayOfWeek());
    }

    public Property dayOfYear() {
        return new Property(this, getChronology().dayOfYear());
    }

    public Property era() {
        return new Property(this, getChronology().era());
    }

    public DateTimeField getRoundingField() {
        return this.iRoundingField;
    }

    public int getRoundingMode() {
        return this.iRoundingMode;
    }

    public Property hourOfDay() {
        return new Property(this, getChronology().hourOfDay());
    }

    public Property millisOfDay() {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond() {
        return new Property(this, getChronology().millisOfSecond());
    }

    public Property minuteOfDay() {
        return new Property(this, getChronology().minuteOfDay());
    }

    public Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
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

    public Property secondOfDay() {
        return new Property(this, getChronology().secondOfDay());
    }

    public Property secondOfMinute() {
        return new Property(this, getChronology().secondOfMinute());
    }

    @Override // org.joda.time.ReadWritableInstant
    public void set(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            setMillis(dateTimeFieldType.getField(getChronology()).set(getMillis(), i));
            return;
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    @Override // org.joda.time.base.BaseDateTime, org.joda.time.ReadWritableInstant
    public void setChronology(Chronology chronology) {
        setChronology(chronology);
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDate(int i, int i2, int i3) {
        setDate(getChronology().getDateTimeMillis(i, i2, i3, 0));
    }

    public void setDate(long j) {
        setMillis(getChronology().millisOfDay().set(j, getMillisOfDay()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void setDate(org.joda.time.ReadableInstant r6) {
        /*
            r5 = this;
            r0 = r6
            long r0 = org.joda.time.DateTimeUtils.getInstantMillis(r0)
            r7 = r0
            r0 = r7
            r9 = r0
            r0 = r6
            boolean r0 = r0 instanceof org.joda.time.ReadableDateTime
            if (r0 == 0) goto L_0x0031
            r0 = r6
            org.joda.time.ReadableDateTime r0 = (org.joda.time.ReadableDateTime) r0
            org.joda.time.Chronology r0 = r0.getChronology()
            org.joda.time.Chronology r0 = org.joda.time.DateTimeUtils.getChronology(r0)
            org.joda.time.DateTimeZone r0 = r0.getZone()
            r6 = r0
            r0 = r7
            r9 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0031
            r0 = r6
            r1 = r5
            org.joda.time.DateTimeZone r1 = r1.getZone()
            r2 = r7
            long r0 = r0.getMillisKeepLocal(r1, r2)
            r9 = r0
        L_0x0031:
            r0 = r5
            r1 = r9
            r0.setDate(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.MutableDateTime.setDate(org.joda.time.ReadableInstant):void");
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        setMillis(getChronology().getDateTimeMillis(i, i2, i3, i4, i5, i6, i7));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDayOfMonth(int i) {
        setMillis(getChronology().dayOfMonth().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDayOfWeek(int i) {
        setMillis(getChronology().dayOfWeek().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDayOfYear(int i) {
        setMillis(getChronology().dayOfYear().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setHourOfDay(int i) {
        setMillis(getChronology().hourOfDay().set(getMillis(), i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // org.joda.time.base.BaseDateTime, org.joda.time.ReadWritableInstant
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void setMillis(long r5) {
        /*
            r4 = this;
            r0 = r4
            int r0 = r0.iRoundingMode
            r7 = r0
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L_0x0055
            r0 = r7
            r1 = 2
            if (r0 == r1) goto L_0x0048
            r0 = r7
            r1 = 3
            if (r0 == r1) goto L_0x003b
            r0 = r7
            r1 = 4
            if (r0 == r1) goto L_0x002e
            r0 = r5
            r8 = r0
            r0 = r7
            r1 = 5
            if (r0 != r1) goto L_0x005f
            r0 = r4
            org.joda.time.DateTimeField r0 = r0.iRoundingField
            r1 = r5
            long r0 = r0.roundHalfEven(r1)
            r8 = r0
            goto L_0x005f
        L_0x002e:
            r0 = r4
            org.joda.time.DateTimeField r0 = r0.iRoundingField
            r1 = r5
            long r0 = r0.roundHalfCeiling(r1)
            r8 = r0
            goto L_0x005f
        L_0x003b:
            r0 = r4
            org.joda.time.DateTimeField r0 = r0.iRoundingField
            r1 = r5
            long r0 = r0.roundHalfFloor(r1)
            r8 = r0
            goto L_0x005f
        L_0x0048:
            r0 = r4
            org.joda.time.DateTimeField r0 = r0.iRoundingField
            r1 = r5
            long r0 = r0.roundCeiling(r1)
            r8 = r0
            goto L_0x005f
        L_0x0055:
            r0 = r4
            org.joda.time.DateTimeField r0 = r0.iRoundingField
            r1 = r5
            long r0 = r0.roundFloor(r1)
            r8 = r0
        L_0x005f:
            r0 = r4
            r1 = r8
            r0.setMillis(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.MutableDateTime.setMillis(long):void");
    }

    @Override // org.joda.time.ReadWritableInstant
    public void setMillis(ReadableInstant readableInstant) {
        setMillis(DateTimeUtils.getInstantMillis(readableInstant));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMillisOfDay(int i) {
        setMillis(getChronology().millisOfDay().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMillisOfSecond(int i) {
        setMillis(getChronology().millisOfSecond().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMinuteOfDay(int i) {
        setMillis(getChronology().minuteOfDay().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMinuteOfHour(int i) {
        setMillis(getChronology().minuteOfHour().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMonthOfYear(int i) {
        setMillis(getChronology().monthOfYear().set(getMillis(), i));
    }

    public void setRounding(DateTimeField dateTimeField) {
        setRounding(dateTimeField, 1);
    }

    public void setRounding(DateTimeField dateTimeField, int i) {
        if (dateTimeField == null || (i >= 0 && i <= 5)) {
            this.iRoundingField = i == 0 ? null : dateTimeField;
            if (dateTimeField == null) {
                i = 0;
            }
            this.iRoundingMode = i;
            setMillis(getMillis());
            return;
        }
        StringBuilder sb = new StringBuilder("Illegal rounding mode: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setSecondOfDay(int i) {
        setMillis(getChronology().secondOfDay().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setSecondOfMinute(int i) {
        setMillis(getChronology().secondOfMinute().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setTime(int i, int i2, int i3, int i4) {
        setMillis(getChronology().getDateTimeMillis(getMillis(), i, i2, i3, i4));
    }

    public void setTime(long j) {
        setMillis(getChronology().millisOfDay().set(getMillis(), ISOChronology.getInstanceUTC().millisOfDay().get(j)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void setTime(org.joda.time.ReadableInstant r6) {
        /*
            r5 = this;
            r0 = r6
            long r0 = org.joda.time.DateTimeUtils.getInstantMillis(r0)
            r7 = r0
            r0 = r6
            org.joda.time.Chronology r0 = org.joda.time.DateTimeUtils.getInstantChronology(r0)
            org.joda.time.DateTimeZone r0 = r0.getZone()
            r6 = r0
            r0 = r7
            r9 = r0
            r0 = r6
            if (r0 == 0) goto L_0x001e
            r0 = r6
            org.joda.time.DateTimeZone r1 = org.joda.time.DateTimeZone.UTC
            r2 = r7
            long r0 = r0.getMillisKeepLocal(r1, r2)
            r9 = r0
        L_0x001e:
            r0 = r5
            r1 = r9
            r0.setTime(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.MutableDateTime.setTime(org.joda.time.ReadableInstant):void");
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setWeekOfWeekyear(int i) {
        setMillis(getChronology().weekOfWeekyear().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setWeekyear(int i) {
        setMillis(getChronology().weekyear().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setYear(int i) {
        setMillis(getChronology().year().set(getMillis(), i));
    }

    @Override // org.joda.time.ReadWritableInstant
    public void setZone(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        Chronology chronology = getChronology();
        if (chronology.getZone() != zone) {
            setChronology(chronology.withZone(zone));
        }
    }

    @Override // org.joda.time.ReadWritableInstant
    public void setZoneRetainFields(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        DateTimeZone zone2 = DateTimeUtils.getZone(getZone());
        if (zone != zone2) {
            long millisKeepLocal = zone2.getMillisKeepLocal(zone, getMillis());
            setChronology(getChronology().withZone(zone));
            setMillis(millisKeepLocal);
        }
    }

    public Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear() {
        return new Property(this, getChronology().weekyear());
    }

    public Property year() {
        return new Property(this, getChronology().year());
    }

    public Property yearOfCentury() {
        return new Property(this, getChronology().yearOfCentury());
    }

    public Property yearOfEra() {
        return new Property(this, getChronology().yearOfEra());
    }
}
