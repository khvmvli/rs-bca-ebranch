package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.SkipDateTimeField;
/* loaded from: classes2-dex2jar.jar:org/joda/time/chrono/JulianChronology.class */
public final class JulianChronology extends BasicGJChronology {
    private static final int MAX_YEAR = 292272992;
    private static final long MILLIS_PER_MONTH = 2629800000L;
    private static final long MILLIS_PER_YEAR = 31557600000L;
    private static final int MIN_YEAR = -292269054;
    private static final long serialVersionUID = -8731039522547897247L;
    private static final ConcurrentHashMap<DateTimeZone, JulianChronology[]> cCache = new ConcurrentHashMap<>();
    private static final JulianChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    JulianChronology(Chronology chronology, Object obj, int i) {
        super(chronology, obj, i);
    }

    static int adjustYearForSet(int i) {
        int i2 = i;
        if (i <= 0) {
            if (i != 0) {
                i2 = i + 1;
            } else {
                throw new IllegalFieldValueException(DateTimeFieldType.year(), Integer.valueOf(i), (Number) null, (Number) null);
            }
        }
        return i2;
    }

    public static JulianChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static JulianChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    public static JulianChronology getInstance(DateTimeZone dateTimeZone, int i) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, JulianChronology[]> concurrentHashMap = cCache;
        JulianChronology[] julianChronologyArr = concurrentHashMap.get(dateTimeZone2);
        JulianChronology[] julianChronologyArr2 = julianChronologyArr;
        if (julianChronologyArr == null) {
            julianChronologyArr2 = new JulianChronology[7];
            JulianChronology[] putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone2, julianChronologyArr2);
            if (putIfAbsent != null) {
                julianChronologyArr2 = putIfAbsent;
            }
        }
        int i2 = i - 1;
        JulianChronology julianChronology = julianChronologyArr2[i2];
        JulianChronology julianChronology2 = julianChronology;
        if (julianChronology == null) {
            synchronized (julianChronologyArr2) {
                JulianChronology julianChronology3 = julianChronologyArr2[i2];
                julianChronology2 = julianChronology3;
                if (julianChronology3 == null) {
                    julianChronology2 = dateTimeZone2 == DateTimeZone.UTC ? new JulianChronology(null, null, i) : new JulianChronology(ZonedChronology.getInstance(getInstance(DateTimeZone.UTC, i), dateTimeZone2), null, i);
                    julianChronologyArr2[i2] = julianChronology2;
                }
            }
        }
        return julianChronology2;
    }

    public static JulianChronology getInstanceUTC() {
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
        }
    }

    final long calculateFirstDayOfYearMillis(int i) {
        int i2;
        int i3 = i - 1968;
        if (i3 <= 0) {
            i2 = (i3 + 3) >> 2;
        } else {
            int i4 = i3 >> 2;
            i2 = !isLeapYear(i) ? i4 + 1 : i4;
        }
        return (((((long) i3) * 365) + ((long) i2)) * 86400000) - 62035200000L;
    }

    final long getApproxMillisAtEpochDividedByTwo() {
        return 31083663600000L;
    }

    final long getAverageMillisPerMonth() {
        return MILLIS_PER_MONTH;
    }

    final long getAverageMillisPerYear() {
        return MILLIS_PER_YEAR;
    }

    final long getAverageMillisPerYearDividedByTwo() {
        return 15778800000L;
    }

    final long getDateMidnightMillis(int i, int i2, int i3) throws IllegalArgumentException {
        return getDateMidnightMillis(adjustYearForSet(i), i2, i3);
    }

    final int getMaxYear() {
        return MAX_YEAR;
    }

    final int getMinYear() {
        return MIN_YEAR;
    }

    final boolean isLeapYear(int i) {
        return (i & 3) == 0;
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
