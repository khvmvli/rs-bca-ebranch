package org.joda.time.chrono;

import java.io.IOException;
import java.io.ObjectInputStream;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
/* loaded from: classes-dex2jar.jar:org/joda/time/chrono/AssembledChronology.class */
public abstract class AssembledChronology extends BaseChronology {
    private static final long serialVersionUID;
    private final Chronology iBase;
    private transient int iBaseFlags;
    private transient DurationField iCenturies;
    private transient DateTimeField iCenturyOfEra;
    private transient DateTimeField iClockhourOfDay;
    private transient DateTimeField iClockhourOfHalfday;
    private transient DateTimeField iDayOfMonth;
    private transient DateTimeField iDayOfWeek;
    private transient DateTimeField iDayOfYear;
    private transient DurationField iDays;
    private transient DateTimeField iEra;
    private transient DurationField iEras;
    private transient DateTimeField iHalfdayOfDay;
    private transient DurationField iHalfdays;
    private transient DateTimeField iHourOfDay;
    private transient DateTimeField iHourOfHalfday;
    private transient DurationField iHours;
    private transient DurationField iMillis;
    private transient DateTimeField iMillisOfDay;
    private transient DateTimeField iMillisOfSecond;
    private transient DateTimeField iMinuteOfDay;
    private transient DateTimeField iMinuteOfHour;
    private transient DurationField iMinutes;
    private transient DateTimeField iMonthOfYear;
    private transient DurationField iMonths;
    private final Object iParam;
    private transient DateTimeField iSecondOfDay;
    private transient DateTimeField iSecondOfMinute;
    private transient DurationField iSeconds;
    private transient DateTimeField iWeekOfWeekyear;
    private transient DurationField iWeeks;
    private transient DateTimeField iWeekyear;
    private transient DateTimeField iWeekyearOfCentury;
    private transient DurationField iWeekyears;
    private transient DateTimeField iYear;
    private transient DateTimeField iYearOfCentury;
    private transient DateTimeField iYearOfEra;
    private transient DurationField iYears;

    /* loaded from: classes-dex2jar.jar:org/joda/time/chrono/AssembledChronology$Fields.class */
    public static final class Fields {
        public DurationField centuries;
        public DateTimeField centuryOfEra;
        public DateTimeField clockhourOfDay;
        public DateTimeField clockhourOfHalfday;
        public DateTimeField dayOfMonth;
        public DateTimeField dayOfWeek;
        public DateTimeField dayOfYear;
        public DurationField days;
        public DateTimeField era;
        public DurationField eras;
        public DateTimeField halfdayOfDay;
        public DurationField halfdays;
        public DateTimeField hourOfDay;
        public DateTimeField hourOfHalfday;
        public DurationField hours;
        public DurationField millis;
        public DateTimeField millisOfDay;
        public DateTimeField millisOfSecond;
        public DateTimeField minuteOfDay;
        public DateTimeField minuteOfHour;
        public DurationField minutes;
        public DateTimeField monthOfYear;
        public DurationField months;
        public DateTimeField secondOfDay;
        public DateTimeField secondOfMinute;
        public DurationField seconds;
        public DateTimeField weekOfWeekyear;
        public DurationField weeks;
        public DateTimeField weekyear;
        public DateTimeField weekyearOfCentury;
        public DurationField weekyears;
        public DateTimeField year;
        public DateTimeField yearOfCentury;
        public DateTimeField yearOfEra;
        public DurationField years;

        Fields() {
        }

        private static boolean isSupported(DateTimeField dateTimeField) {
            return dateTimeField == null ? false : dateTimeField.isSupported();
        }

        private static boolean isSupported(DurationField durationField) {
            return durationField == null ? false : durationField.isSupported();
        }

        public final void copyFieldsFrom(Chronology chronology) {
            DurationField millis = chronology.millis();
            if (isSupported(millis)) {
                this.millis = millis;
            }
            DurationField seconds = chronology.seconds();
            if (isSupported(seconds)) {
                this.seconds = seconds;
            }
            DurationField minutes = chronology.minutes();
            if (isSupported(minutes)) {
                this.minutes = minutes;
            }
            DurationField hours = chronology.hours();
            if (isSupported(hours)) {
                this.hours = hours;
            }
            DurationField halfdays = chronology.halfdays();
            if (isSupported(halfdays)) {
                this.halfdays = halfdays;
            }
            DurationField days = chronology.days();
            if (isSupported(days)) {
                this.days = days;
            }
            DurationField weeks = chronology.weeks();
            if (isSupported(weeks)) {
                this.weeks = weeks;
            }
            DurationField weekyears = chronology.weekyears();
            if (isSupported(weekyears)) {
                this.weekyears = weekyears;
            }
            DurationField months = chronology.months();
            if (isSupported(months)) {
                this.months = months;
            }
            DurationField years = chronology.years();
            if (isSupported(years)) {
                this.years = years;
            }
            DurationField centuries = chronology.centuries();
            if (isSupported(centuries)) {
                this.centuries = centuries;
            }
            DurationField eras = chronology.eras();
            if (isSupported(eras)) {
                this.eras = eras;
            }
            DateTimeField millisOfSecond = chronology.millisOfSecond();
            if (isSupported(millisOfSecond)) {
                this.millisOfSecond = millisOfSecond;
            }
            DateTimeField millisOfDay = chronology.millisOfDay();
            if (isSupported(millisOfDay)) {
                this.millisOfDay = millisOfDay;
            }
            DateTimeField secondOfMinute = chronology.secondOfMinute();
            if (isSupported(secondOfMinute)) {
                this.secondOfMinute = secondOfMinute;
            }
            DateTimeField secondOfDay = chronology.secondOfDay();
            if (isSupported(secondOfDay)) {
                this.secondOfDay = secondOfDay;
            }
            DateTimeField minuteOfHour = chronology.minuteOfHour();
            if (isSupported(minuteOfHour)) {
                this.minuteOfHour = minuteOfHour;
            }
            DateTimeField minuteOfDay = chronology.minuteOfDay();
            if (isSupported(minuteOfDay)) {
                this.minuteOfDay = minuteOfDay;
            }
            DateTimeField hourOfDay = chronology.hourOfDay();
            if (isSupported(hourOfDay)) {
                this.hourOfDay = hourOfDay;
            }
            DateTimeField clockhourOfDay = chronology.clockhourOfDay();
            if (isSupported(clockhourOfDay)) {
                this.clockhourOfDay = clockhourOfDay;
            }
            DateTimeField hourOfHalfday = chronology.hourOfHalfday();
            if (isSupported(hourOfHalfday)) {
                this.hourOfHalfday = hourOfHalfday;
            }
            DateTimeField clockhourOfHalfday = chronology.clockhourOfHalfday();
            if (isSupported(clockhourOfHalfday)) {
                this.clockhourOfHalfday = clockhourOfHalfday;
            }
            DateTimeField halfdayOfDay = chronology.halfdayOfDay();
            if (isSupported(halfdayOfDay)) {
                this.halfdayOfDay = halfdayOfDay;
            }
            DateTimeField dayOfWeek = chronology.dayOfWeek();
            if (isSupported(dayOfWeek)) {
                this.dayOfWeek = dayOfWeek;
            }
            DateTimeField dayOfMonth = chronology.dayOfMonth();
            if (isSupported(dayOfMonth)) {
                this.dayOfMonth = dayOfMonth;
            }
            DateTimeField dayOfYear = chronology.dayOfYear();
            if (isSupported(dayOfYear)) {
                this.dayOfYear = dayOfYear;
            }
            DateTimeField weekOfWeekyear = chronology.weekOfWeekyear();
            if (isSupported(weekOfWeekyear)) {
                this.weekOfWeekyear = weekOfWeekyear;
            }
            DateTimeField weekyear = chronology.weekyear();
            if (isSupported(weekyear)) {
                this.weekyear = weekyear;
            }
            DateTimeField weekyearOfCentury = chronology.weekyearOfCentury();
            if (isSupported(weekyearOfCentury)) {
                this.weekyearOfCentury = weekyearOfCentury;
            }
            DateTimeField monthOfYear = chronology.monthOfYear();
            if (isSupported(monthOfYear)) {
                this.monthOfYear = monthOfYear;
            }
            DateTimeField year = chronology.year();
            if (isSupported(year)) {
                this.year = year;
            }
            DateTimeField yearOfEra = chronology.yearOfEra();
            if (isSupported(yearOfEra)) {
                this.yearOfEra = yearOfEra;
            }
            DateTimeField yearOfCentury = chronology.yearOfCentury();
            if (isSupported(yearOfCentury)) {
                this.yearOfCentury = yearOfCentury;
            }
            DateTimeField centuryOfEra = chronology.centuryOfEra();
            if (isSupported(centuryOfEra)) {
                this.centuryOfEra = centuryOfEra;
            }
            DateTimeField era = chronology.era();
            if (isSupported(era)) {
                this.era = era;
            }
        }
    }

    public AssembledChronology(Chronology chronology, Object obj) {
        this.iBase = chronology;
        this.iParam = obj;
        setFields();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        setFields();
    }

    private void setFields() {
        Fields fields = new Fields();
        Chronology chronology = this.iBase;
        if (chronology != null) {
            fields.copyFieldsFrom(chronology);
        }
        assemble(fields);
        DurationField durationField = fields.millis;
        DurationField durationField2 = durationField;
        if (durationField == null) {
            durationField2 = millis();
        }
        this.iMillis = durationField2;
        DurationField durationField3 = fields.seconds;
        DurationField durationField4 = durationField3;
        if (durationField3 == null) {
            durationField4 = seconds();
        }
        this.iSeconds = durationField4;
        DurationField durationField5 = fields.minutes;
        DurationField durationField6 = durationField5;
        if (durationField5 == null) {
            durationField6 = minutes();
        }
        this.iMinutes = durationField6;
        DurationField durationField7 = fields.hours;
        DurationField durationField8 = durationField7;
        if (durationField7 == null) {
            durationField8 = hours();
        }
        this.iHours = durationField8;
        DurationField durationField9 = fields.halfdays;
        DurationField durationField10 = durationField9;
        if (durationField9 == null) {
            durationField10 = halfdays();
        }
        this.iHalfdays = durationField10;
        DurationField durationField11 = fields.days;
        DurationField durationField12 = durationField11;
        if (durationField11 == null) {
            durationField12 = days();
        }
        this.iDays = durationField12;
        DurationField durationField13 = fields.weeks;
        DurationField durationField14 = durationField13;
        if (durationField13 == null) {
            durationField14 = weeks();
        }
        this.iWeeks = durationField14;
        DurationField durationField15 = fields.weekyears;
        DurationField durationField16 = durationField15;
        if (durationField15 == null) {
            durationField16 = weekyears();
        }
        this.iWeekyears = durationField16;
        DurationField durationField17 = fields.months;
        DurationField durationField18 = durationField17;
        if (durationField17 == null) {
            durationField18 = months();
        }
        this.iMonths = durationField18;
        DurationField durationField19 = fields.years;
        DurationField durationField20 = durationField19;
        if (durationField19 == null) {
            durationField20 = years();
        }
        this.iYears = durationField20;
        DurationField durationField21 = fields.centuries;
        DurationField durationField22 = durationField21;
        if (durationField21 == null) {
            durationField22 = centuries();
        }
        this.iCenturies = durationField22;
        DurationField durationField23 = fields.eras;
        DurationField durationField24 = durationField23;
        if (durationField23 == null) {
            durationField24 = eras();
        }
        this.iEras = durationField24;
        DateTimeField dateTimeField = fields.millisOfSecond;
        DateTimeField dateTimeField2 = dateTimeField;
        if (dateTimeField == null) {
            dateTimeField2 = millisOfSecond();
        }
        this.iMillisOfSecond = dateTimeField2;
        DateTimeField dateTimeField3 = fields.millisOfDay;
        DateTimeField dateTimeField4 = dateTimeField3;
        if (dateTimeField3 == null) {
            dateTimeField4 = millisOfDay();
        }
        this.iMillisOfDay = dateTimeField4;
        DateTimeField dateTimeField5 = fields.secondOfMinute;
        DateTimeField dateTimeField6 = dateTimeField5;
        if (dateTimeField5 == null) {
            dateTimeField6 = secondOfMinute();
        }
        this.iSecondOfMinute = dateTimeField6;
        DateTimeField dateTimeField7 = fields.secondOfDay;
        DateTimeField dateTimeField8 = dateTimeField7;
        if (dateTimeField7 == null) {
            dateTimeField8 = secondOfDay();
        }
        this.iSecondOfDay = dateTimeField8;
        DateTimeField dateTimeField9 = fields.minuteOfHour;
        DateTimeField dateTimeField10 = dateTimeField9;
        if (dateTimeField9 == null) {
            dateTimeField10 = minuteOfHour();
        }
        this.iMinuteOfHour = dateTimeField10;
        DateTimeField dateTimeField11 = fields.minuteOfDay;
        DateTimeField dateTimeField12 = dateTimeField11;
        if (dateTimeField11 == null) {
            dateTimeField12 = minuteOfDay();
        }
        this.iMinuteOfDay = dateTimeField12;
        DateTimeField dateTimeField13 = fields.hourOfDay;
        DateTimeField dateTimeField14 = dateTimeField13;
        if (dateTimeField13 == null) {
            dateTimeField14 = hourOfDay();
        }
        this.iHourOfDay = dateTimeField14;
        DateTimeField dateTimeField15 = fields.clockhourOfDay;
        DateTimeField dateTimeField16 = dateTimeField15;
        if (dateTimeField15 == null) {
            dateTimeField16 = clockhourOfDay();
        }
        this.iClockhourOfDay = dateTimeField16;
        DateTimeField dateTimeField17 = fields.hourOfHalfday;
        DateTimeField dateTimeField18 = dateTimeField17;
        if (dateTimeField17 == null) {
            dateTimeField18 = hourOfHalfday();
        }
        this.iHourOfHalfday = dateTimeField18;
        DateTimeField dateTimeField19 = fields.clockhourOfHalfday;
        DateTimeField dateTimeField20 = dateTimeField19;
        if (dateTimeField19 == null) {
            dateTimeField20 = clockhourOfHalfday();
        }
        this.iClockhourOfHalfday = dateTimeField20;
        DateTimeField dateTimeField21 = fields.halfdayOfDay;
        DateTimeField dateTimeField22 = dateTimeField21;
        if (dateTimeField21 == null) {
            dateTimeField22 = halfdayOfDay();
        }
        this.iHalfdayOfDay = dateTimeField22;
        DateTimeField dateTimeField23 = fields.dayOfWeek;
        DateTimeField dateTimeField24 = dateTimeField23;
        if (dateTimeField23 == null) {
            dateTimeField24 = dayOfWeek();
        }
        this.iDayOfWeek = dateTimeField24;
        DateTimeField dateTimeField25 = fields.dayOfMonth;
        DateTimeField dateTimeField26 = dateTimeField25;
        if (dateTimeField25 == null) {
            dateTimeField26 = dayOfMonth();
        }
        this.iDayOfMonth = dateTimeField26;
        DateTimeField dateTimeField27 = fields.dayOfYear;
        DateTimeField dateTimeField28 = dateTimeField27;
        if (dateTimeField27 == null) {
            dateTimeField28 = dayOfYear();
        }
        this.iDayOfYear = dateTimeField28;
        DateTimeField dateTimeField29 = fields.weekOfWeekyear;
        DateTimeField dateTimeField30 = dateTimeField29;
        if (dateTimeField29 == null) {
            dateTimeField30 = weekOfWeekyear();
        }
        this.iWeekOfWeekyear = dateTimeField30;
        DateTimeField dateTimeField31 = fields.weekyear;
        DateTimeField dateTimeField32 = dateTimeField31;
        if (dateTimeField31 == null) {
            dateTimeField32 = weekyear();
        }
        this.iWeekyear = dateTimeField32;
        DateTimeField dateTimeField33 = fields.weekyearOfCentury;
        DateTimeField dateTimeField34 = dateTimeField33;
        if (dateTimeField33 == null) {
            dateTimeField34 = weekyearOfCentury();
        }
        this.iWeekyearOfCentury = dateTimeField34;
        DateTimeField dateTimeField35 = fields.monthOfYear;
        DateTimeField dateTimeField36 = dateTimeField35;
        if (dateTimeField35 == null) {
            dateTimeField36 = monthOfYear();
        }
        this.iMonthOfYear = dateTimeField36;
        DateTimeField dateTimeField37 = fields.year;
        DateTimeField dateTimeField38 = dateTimeField37;
        if (dateTimeField37 == null) {
            dateTimeField38 = year();
        }
        this.iYear = dateTimeField38;
        DateTimeField dateTimeField39 = fields.yearOfEra;
        DateTimeField dateTimeField40 = dateTimeField39;
        if (dateTimeField39 == null) {
            dateTimeField40 = yearOfEra();
        }
        this.iYearOfEra = dateTimeField40;
        DateTimeField dateTimeField41 = fields.yearOfCentury;
        DateTimeField dateTimeField42 = dateTimeField41;
        if (dateTimeField41 == null) {
            dateTimeField42 = yearOfCentury();
        }
        this.iYearOfCentury = dateTimeField42;
        DateTimeField dateTimeField43 = fields.centuryOfEra;
        DateTimeField dateTimeField44 = dateTimeField43;
        if (dateTimeField43 == null) {
            dateTimeField44 = centuryOfEra();
        }
        this.iCenturyOfEra = dateTimeField44;
        DateTimeField dateTimeField45 = fields.era;
        DateTimeField dateTimeField46 = dateTimeField45;
        if (dateTimeField45 == null) {
            dateTimeField46 = era();
        }
        this.iEra = dateTimeField46;
        Chronology chronology2 = this.iBase;
        int i = 0;
        if (chronology2 != null) {
            int i2 = (this.iHourOfDay == chronology2.hourOfDay() && this.iMinuteOfHour == this.iBase.minuteOfHour() && this.iSecondOfMinute == this.iBase.secondOfMinute() && this.iMillisOfSecond == this.iBase.millisOfSecond()) ? 1 : 0;
            int i3 = this.iMillisOfDay == this.iBase.millisOfDay() ? 2 : 0;
            int i4 = 0;
            if (this.iYear == this.iBase.year()) {
                i4 = 0;
                if (this.iMonthOfYear == this.iBase.monthOfYear()) {
                    i4 = 0;
                    if (this.iDayOfMonth == this.iBase.dayOfMonth()) {
                        i4 = 4;
                    }
                }
            }
            i = i4 | i2 | i3;
        }
        this.iBaseFlags = i;
    }

    protected abstract void assemble(Fields fields);

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField centuries() {
        return this.iCenturies;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField centuryOfEra() {
        return this.iCenturyOfEra;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField clockhourOfDay() {
        return this.iClockhourOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField clockhourOfHalfday() {
        return this.iClockhourOfHalfday;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField dayOfMonth() {
        return this.iDayOfMonth;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField dayOfWeek() {
        return this.iDayOfWeek;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField dayOfYear() {
        return this.iDayOfYear;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField days() {
        return this.iDays;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField era() {
        return this.iEra;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField eras() {
        return this.iEras;
    }

    protected final Chronology getBase() {
        return this.iBase;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        Chronology chronology = this.iBase;
        return (chronology == null || (this.iBaseFlags & 6) != 6) ? getDateTimeMillis(i, i2, i3, i4) : chronology.getDateTimeMillis(i, i2, i3, i4);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        Chronology chronology = this.iBase;
        return (chronology == null || (this.iBaseFlags & 5) != 5) ? getDateTimeMillis(i, i2, i3, i4, i5, i6, i7) : chronology.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(long j, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        Chronology chronology = this.iBase;
        return (chronology == null || (this.iBaseFlags & 1) != 1) ? getDateTimeMillis(j, i, i2, i3, i4) : chronology.getDateTimeMillis(j, i, i2, i3, i4);
    }

    protected final Object getParam() {
        return this.iParam;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        Chronology chronology = this.iBase;
        if (chronology != null) {
            return chronology.getZone();
        }
        return null;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField halfdayOfDay() {
        return this.iHalfdayOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField halfdays() {
        return this.iHalfdays;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField hourOfDay() {
        return this.iHourOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField hourOfHalfday() {
        return this.iHourOfHalfday;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField hours() {
        return this.iHours;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField millis() {
        return this.iMillis;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField millisOfDay() {
        return this.iMillisOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField millisOfSecond() {
        return this.iMillisOfSecond;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField minuteOfDay() {
        return this.iMinuteOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField minuteOfHour() {
        return this.iMinuteOfHour;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField minutes() {
        return this.iMinutes;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField monthOfYear() {
        return this.iMonthOfYear;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField months() {
        return this.iMonths;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField secondOfDay() {
        return this.iSecondOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField secondOfMinute() {
        return this.iSecondOfMinute;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField seconds() {
        return this.iSeconds;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField weekOfWeekyear() {
        return this.iWeekOfWeekyear;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField weeks() {
        return this.iWeeks;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField weekyear() {
        return this.iWeekyear;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField weekyearOfCentury() {
        return this.iWeekyearOfCentury;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField weekyears() {
        return this.iWeekyears;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField year() {
        return this.iYear;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField yearOfCentury() {
        return this.iYearOfCentury;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField yearOfEra() {
        return this.iYearOfEra;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField years() {
        return this.iYears;
    }
}
