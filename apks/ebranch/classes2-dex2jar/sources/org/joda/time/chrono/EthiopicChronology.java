package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.SkipDateTimeField;
/* loaded from: classes2-dex2jar.jar:org/joda/time/chrono/EthiopicChronology.class */
public final class EthiopicChronology extends BasicFixedMonthChronology {
    public static final int EE = 1;
    private static final int MAX_YEAR = 292272984;
    private static final int MIN_YEAR = -292269337;
    private static final long serialVersionUID = -5972804258688333942L;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("EE");
    private static final ConcurrentHashMap<DateTimeZone, EthiopicChronology[]> cCache = new ConcurrentHashMap<>();
    private static final EthiopicChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    EthiopicChronology(Chronology chronology, Object obj, int i) {
        super(chronology, obj, i);
    }

    public static EthiopicChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static EthiopicChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    public static EthiopicChronology getInstance(DateTimeZone dateTimeZone, int i) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, EthiopicChronology[]> concurrentHashMap = cCache;
        EthiopicChronology[] ethiopicChronologyArr = concurrentHashMap.get(dateTimeZone2);
        EthiopicChronology[] ethiopicChronologyArr2 = ethiopicChronologyArr;
        if (ethiopicChronologyArr == null) {
            ethiopicChronologyArr2 = new EthiopicChronology[7];
            EthiopicChronology[] putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone2, ethiopicChronologyArr2);
            if (putIfAbsent != null) {
                ethiopicChronologyArr2 = putIfAbsent;
            }
        }
        int i2 = i - 1;
        EthiopicChronology ethiopicChronology = ethiopicChronologyArr2[i2];
        EthiopicChronology ethiopicChronology2 = ethiopicChronology;
        if (ethiopicChronology == null) {
            synchronized (ethiopicChronologyArr2) {
                EthiopicChronology ethiopicChronology3 = ethiopicChronologyArr2[i2];
                ethiopicChronology2 = ethiopicChronology3;
                if (ethiopicChronology3 == null) {
                    if (dateTimeZone2 == DateTimeZone.UTC) {
                        EthiopicChronology ethiopicChronology4 = new EthiopicChronology(null, null, i);
                        ethiopicChronology2 = new EthiopicChronology(LimitChronology.getInstance(ethiopicChronology4, new DateTime(1, 1, 1, 0, 0, 0, 0, ethiopicChronology4), null), null, i);
                    } else {
                        ethiopicChronology2 = new EthiopicChronology(ZonedChronology.getInstance(getInstance(DateTimeZone.UTC, i), dateTimeZone2), null, i);
                    }
                    ethiopicChronologyArr2[i2] = ethiopicChronology2;
                }
            }
        }
        return ethiopicChronology2;
    }

    public static EthiopicChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        return getInstance(base == null ? DateTimeZone.UTC : base.getZone(), getMinimumDaysInFirstWeek());
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
        int i3 = i - 1963;
        if (i3 <= 0) {
            i2 = (i3 + 3) >> 2;
        } else {
            int i4 = i3 >> 2;
            i2 = !isLeapYear(i) ? i4 + 1 : i4;
        }
        return (((((long) i3) * 365) + ((long) i2)) * 86400000) + 21859200000L;
    }

    final long getApproxMillisAtEpochDividedByTwo() {
        return 30962844000000L;
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
