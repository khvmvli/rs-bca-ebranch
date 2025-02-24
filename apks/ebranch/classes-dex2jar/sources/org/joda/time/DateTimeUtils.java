package org.joda.time;

import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.ISOChronology;
/* loaded from: classes-dex2jar.jar:org/joda/time/DateTimeUtils.class */
public class DateTimeUtils {
    public static final MillisProvider SYSTEM_MILLIS_PROVIDER;
    private static volatile MillisProvider cMillisProvider;
    private static final AtomicReference<Map<String, DateTimeZone>> cZoneNames = new AtomicReference<>();

    /* loaded from: classes-dex2jar.jar:org/joda/time/DateTimeUtils$MillisProvider.class */
    public interface MillisProvider {
        long getMillis();
    }

    /* loaded from: classes-dex2jar.jar:org/joda/time/DateTimeUtils$SystemMillisProvider.class */
    static class SystemMillisProvider implements MillisProvider {
        SystemMillisProvider() {
        }

        @Override // org.joda.time.DateTimeUtils.MillisProvider
        public long getMillis() {
            return System.currentTimeMillis();
        }
    }

    static {
        SystemMillisProvider systemMillisProvider = new SystemMillisProvider();
        SYSTEM_MILLIS_PROVIDER = systemMillisProvider;
        cMillisProvider = systemMillisProvider;
    }

    protected DateTimeUtils() {
    }

    private static Map<String, DateTimeZone> buildDefaultTimeZoneNames() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("UT", DateTimeZone.UTC);
        linkedHashMap.put("UTC", DateTimeZone.UTC);
        linkedHashMap.put("GMT", DateTimeZone.UTC);
        put(linkedHashMap, "EST", "America/New_York");
        put(linkedHashMap, "EDT", "America/New_York");
        put(linkedHashMap, "CST", "America/Chicago");
        put(linkedHashMap, "CDT", "America/Chicago");
        put(linkedHashMap, "MST", "America/Denver");
        put(linkedHashMap, "MDT", "America/Denver");
        put(linkedHashMap, "PST", "America/Los_Angeles");
        put(linkedHashMap, "PDT", "America/Los_Angeles");
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static void checkPermission() throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("CurrentTime.setProvider"));
        }
    }

    public static final long currentTimeMillis() {
        return cMillisProvider.getMillis();
    }

    public static final long fromJulianDay(double d) {
        return (long) ((d - 2440587.5d) * 8.64E7d);
    }

    public static final Chronology getChronology(Chronology chronology) {
        Chronology chronology2 = chronology;
        if (chronology == null) {
            chronology2 = ISOChronology.getInstance();
        }
        return chronology2;
    }

    public static final DateFormatSymbols getDateFormatSymbols(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        } catch (Exception e) {
            return new DateFormatSymbols(locale);
        }
    }

    public static final Map<String, DateTimeZone> getDefaultTimeZoneNames() {
        boolean z;
        AtomicReference<Map<String, DateTimeZone>> atomicReference = cZoneNames;
        Map<String, DateTimeZone> map = atomicReference.get();
        Map<String, DateTimeZone> map2 = map;
        if (map == null) {
            map2 = buildDefaultTimeZoneNames();
            while (true) {
                if (!atomicReference.compareAndSet(null, map2)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                map2 = atomicReference.get();
            }
        }
        return map2;
    }

    public static final long getDurationMillis(ReadableDuration readableDuration) {
        if (readableDuration == null) {
            return 0;
        }
        return readableDuration.getMillis();
    }

    public static final Chronology getInstantChronology(ReadableInstant readableInstant) {
        if (readableInstant == null) {
            return ISOChronology.getInstance();
        }
        Chronology chronology = readableInstant.getChronology();
        Chronology chronology2 = chronology;
        if (chronology == null) {
            chronology2 = ISOChronology.getInstance();
        }
        return chronology2;
    }

    public static final long getInstantMillis(ReadableInstant readableInstant) {
        return readableInstant == null ? currentTimeMillis() : readableInstant.getMillis();
    }

    public static final Chronology getIntervalChronology(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        Chronology chronology = readableInstant != null ? readableInstant.getChronology() : readableInstant2 != null ? readableInstant2.getChronology() : null;
        Chronology chronology2 = chronology;
        if (chronology == null) {
            chronology2 = ISOChronology.getInstance();
        }
        return chronology2;
    }

    public static final Chronology getIntervalChronology(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            return ISOChronology.getInstance();
        }
        Chronology chronology = readableInterval.getChronology();
        Chronology chronology2 = chronology;
        if (chronology == null) {
            chronology2 = ISOChronology.getInstance();
        }
        return chronology2;
    }

    public static final PeriodType getPeriodType(PeriodType periodType) {
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = PeriodType.standard();
        }
        return periodType2;
    }

    public static final ReadableInterval getReadableInterval(ReadableInterval readableInterval) {
        ReadableInterval readableInterval2 = readableInterval;
        if (readableInterval == null) {
            long currentTimeMillis = currentTimeMillis();
            readableInterval2 = new Interval(currentTimeMillis, currentTimeMillis);
        }
        return readableInterval2;
    }

    public static final DateTimeZone getZone(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        return dateTimeZone2;
    }

    public static final boolean isContiguous(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            DurationFieldType durationFieldType = null;
            for (int i = 0; i < readablePartial.size(); i++) {
                DateTimeField field = readablePartial.getField(i);
                if (i > 0 && (field.getRangeDurationField() == null || field.getRangeDurationField().getType() != durationFieldType)) {
                    return false;
                }
                durationFieldType = field.getDurationField().getType();
            }
            return true;
        }
        throw new IllegalArgumentException("Partial must not be null");
    }

    private static void put(Map<String, DateTimeZone> map, String str, String str2) {
        try {
            map.put(str, DateTimeZone.forID(str2));
        } catch (RuntimeException e) {
        }
    }

    public static final void setCurrentMillisFixed(long j) throws SecurityException {
        checkPermission();
        cMillisProvider = new FixedMillisProvider(j);
    }

    public static final void setCurrentMillisOffset(long j) throws SecurityException {
        checkPermission();
        if (j == 0) {
            cMillisProvider = SYSTEM_MILLIS_PROVIDER;
        } else {
            cMillisProvider = new OffsetMillisProvider(j);
        }
    }

    public static final void setCurrentMillisProvider(MillisProvider millisProvider) throws SecurityException {
        if (millisProvider != null) {
            checkPermission();
            cMillisProvider = millisProvider;
            return;
        }
        throw new IllegalArgumentException("The MillisProvider must not be null");
    }

    public static final void setCurrentMillisSystem() throws SecurityException {
        checkPermission();
        cMillisProvider = SYSTEM_MILLIS_PROVIDER;
    }

    public static final void setDefaultTimeZoneNames(Map<String, DateTimeZone> map) {
        cZoneNames.set(Collections.unmodifiableMap(new HashMap(map)));
    }

    public static final double toJulianDay(long j) {
        return (((double) j) / 8.64E7d) + 2440587.5d;
    }

    public static final long toJulianDayNumber(long j) {
        return (long) Math.floor(toJulianDay(j) + 0.5d);
    }
}
