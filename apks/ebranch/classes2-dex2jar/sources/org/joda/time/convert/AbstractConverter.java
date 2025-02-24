package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;
/* loaded from: classes2-dex2jar.jar:org/joda/time/convert/AbstractConverter.class */
public abstract class AbstractConverter implements Converter {
    @Override // org.joda.time.convert.InstantConverter, org.joda.time.convert.PartialConverter
    public Chronology getChronology(Object obj, Chronology chronology) {
        return DateTimeUtils.getChronology(chronology);
    }

    @Override // org.joda.time.convert.InstantConverter, org.joda.time.convert.PartialConverter
    public Chronology getChronology(Object obj, DateTimeZone dateTimeZone) {
        return ISOChronology.getInstance(dateTimeZone);
    }

    @Override // org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return DateTimeUtils.currentTimeMillis();
    }

    @Override // org.joda.time.convert.PartialConverter
    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, Chronology chronology) {
        return chronology.get(readablePartial, getInstantMillis(obj, chronology));
    }

    @Override // org.joda.time.convert.PartialConverter
    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, Chronology chronology, DateTimeFormatter dateTimeFormatter) {
        return getPartialValues(readablePartial, obj, chronology);
    }

    @Override // org.joda.time.convert.PeriodConverter
    public PeriodType getPeriodType(Object obj) {
        return PeriodType.standard();
    }

    @Override // org.joda.time.convert.IntervalConverter
    public boolean isReadableInterval(Object obj, Chronology chronology) {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Converter[");
        sb.append(getSupportedType() == null ? "null" : getSupportedType().getName());
        sb.append("]");
        return sb.toString();
    }
}
