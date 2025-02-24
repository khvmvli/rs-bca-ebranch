package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
/* loaded from: classes2-dex2jar.jar:org/joda/time/chrono/BuddhistChronology.class */
public final class BuddhistChronology extends AssembledChronology {
    public static final int BE = 1;
    private static final int BUDDHIST_OFFSET = 543;
    private static final long serialVersionUID = -3474595157769370126L;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("BE");
    private static final ConcurrentHashMap<DateTimeZone, BuddhistChronology> cCache = new ConcurrentHashMap<>();
    private static final BuddhistChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    private BuddhistChronology(Chronology chronology, Object obj) {
        super(chronology, obj);
    }

    public static BuddhistChronology getInstance() {
        return getInstance(DateTimeZone.getDefault());
    }

    public static BuddhistChronology getInstance(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, BuddhistChronology> concurrentHashMap = cCache;
        BuddhistChronology buddhistChronology = concurrentHashMap.get(dateTimeZone2);
        BuddhistChronology buddhistChronology2 = buddhistChronology;
        if (buddhistChronology == null) {
            BuddhistChronology buddhistChronology3 = new BuddhistChronology(GJChronology.getInstance(dateTimeZone2, null), null);
            buddhistChronology2 = new BuddhistChronology(LimitChronology.getInstance(buddhistChronology3, new DateTime(1, 1, 1, 0, 0, 0, 0, buddhistChronology3), null), "");
            BuddhistChronology putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone2, buddhistChronology2);
            if (putIfAbsent != null) {
                buddhistChronology2 = putIfAbsent;
            }
        }
        return buddhistChronology2;
    }

    public static BuddhistChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        return base == null ? getInstanceUTC() : getInstance(base.getZone());
    }

    protected final void assemble(AssembledChronology.Fields fields) {
        if (getParam() == null) {
            fields.eras = UnsupportedDurationField.getInstance(DurationFieldType.eras());
            fields.year = new OffsetDateTimeField(new SkipUndoDateTimeField(this, fields.year), (int) BUDDHIST_OFFSET);
            fields.yearOfEra = new DelegatedDateTimeField(fields.year, fields.eras, DateTimeFieldType.yearOfEra());
            fields.weekyear = new OffsetDateTimeField(new SkipUndoDateTimeField(this, fields.weekyear), (int) BUDDHIST_OFFSET);
            fields.centuryOfEra = new DividedDateTimeField(new OffsetDateTimeField(fields.yearOfEra, 99), fields.eras, DateTimeFieldType.centuryOfEra(), 100);
            fields.centuries = fields.centuryOfEra.getDurationField();
            fields.yearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField(fields.centuryOfEra), DateTimeFieldType.yearOfCentury(), 1);
            fields.weekyearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField(fields.weekyear, fields.centuries, DateTimeFieldType.weekyearOfCentury(), 100), DateTimeFieldType.weekyearOfCentury(), 1);
            fields.era = ERA_FIELD;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuddhistChronology) {
            return getZone().equals(((BuddhistChronology) obj).getZone());
        }
        return false;
    }

    public final int hashCode() {
        return getZone().hashCode() + 499287079;
    }

    public final String toString() {
        String str;
        DateTimeZone zone = getZone();
        if (zone != null) {
            StringBuilder sb = new StringBuilder("BuddhistChronology[");
            sb.append(zone.getID());
            sb.append(']');
            str = sb.toString();
        } else {
            str = "BuddhistChronology";
        }
        return str;
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
