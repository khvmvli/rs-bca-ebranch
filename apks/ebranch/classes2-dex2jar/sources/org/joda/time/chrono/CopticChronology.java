package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.SkipDateTimeField;
/* loaded from: classes2-dex2jar.jar:org/joda/time/chrono/CopticChronology.class */
public final class CopticChronology extends BasicFixedMonthChronology {
    public static final int AM = 1;
    private static final int MAX_YEAR = 292272708;
    private static final int MIN_YEAR = -292269337;
    private static final long serialVersionUID = -5972804258688333942L;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("AM");
    private static final ConcurrentHashMap<DateTimeZone, CopticChronology[]> cCache = new ConcurrentHashMap<>();
    private static final CopticChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    CopticChronology(Chronology chronology, Object obj, int i) {
        super(chronology, obj, i);
    }

    public static CopticChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static CopticChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    public static CopticChronology getInstance(DateTimeZone dateTimeZone, int i) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, CopticChronology[]> concurrentHashMap = cCache;
        CopticChronology[] copticChronologyArr = concurrentHashMap.get(dateTimeZone2);
        CopticChronology[] copticChronologyArr2 = copticChronologyArr;
        if (copticChronologyArr == null) {
            copticChronologyArr2 = new CopticChronology[7];
            CopticChronology[] putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone2, copticChronologyArr2);
            if (putIfAbsent != null) {
                copticChronologyArr2 = putIfAbsent;
            }
        }
        int i2 = i - 1;
        CopticChronology copticChronology = copticChronologyArr2[i2];
        CopticChronology copticChronology2 = copticChronology;
        if (copticChronology == null) {
            synchronized (copticChronologyArr2) {
                CopticChronology copticChronology3 = copticChronologyArr2[i2];
                copticChronology2 = copticChronology3;
                if (copticChronology3 == null) {
                    if (dateTimeZone2 == DateTimeZone.UTC) {
                        CopticChronology copticChronology4 = new CopticChronology(null, null, i);
                        copticChronology2 = new CopticChronology(LimitChronology.getInstance(copticChronology4, new DateTime(1, 1, 1, 0, 0, 0, 0, copticChronology4), null), null, i);
                    } else {
                        copticChronology2 = new CopticChronology(ZonedChronology.getInstance(getInstance(DateTimeZone.UTC, i), dateTimeZone2), null, i);
                    }
                    copticChronologyArr2[i2] = copticChronology2;
                }
            }
        }
        return copticChronology2;
    }

    public static CopticChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        int minimumDaysInFirstWeek = getMinimumDaysInFirstWeek();
        int i = minimumDaysInFirstWeek;
        if (minimumDaysInFirstWeek == 0) {
            i = 4;
        }
        return getInstance(base == null ? DateTimeZone.UTC : base.getZone(), i);
    }

    protected final void assemble(AssembledChronology.Fields fields) {
        if (getBase() == null) {
            assemble(fields);
            fields.year = new SkipDateTimeField(this, fields.year);
            fields.weekyear = new SkipDateTimeField(this, fields.weekyear);
            fields.era = ERA_FIELD;
            fields.monthOfYear = new BasicMonthOfYearDateTimeField(this, 13);
            fields.months = fields.monthOfYear.getDurationField();
        }
    }

    final long calculateFirstDayOfYearMillis(int i) {
        int i2;
        int i3 = i - 1687;
        if (i3 <= 0) {
            i2 = (i3 + 3) >> 2;
        } else {
            int i4 = i3 >> 2;
            i2 = !isLeapYear(i) ? i4 + 1 : i4;
        }
        return (((((long) i3) * 365) + ((long) i2)) * 86400000) + 21859200000L;
    }

    final long getApproxMillisAtEpochDividedByTwo() {
        return 26607895200000L;
    }

    final int getMaxYear() {
        return MAX_YEAR;
    }

    final int getMinYear() {
        return MIN_YEAR;
    }

    final boolean isLeapDay(long j) {
        return dayOfMonth().get(j) == 6 && monthOfYear().isLeap(j);
    }

    public final Chronology withUTC() {
        return INSTANCE_UTC;
    }

    public final Chronology withZone(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        return dateTimeZone2 == getZone() ? this : getInstance(dateTimeZone2);
    }
}
