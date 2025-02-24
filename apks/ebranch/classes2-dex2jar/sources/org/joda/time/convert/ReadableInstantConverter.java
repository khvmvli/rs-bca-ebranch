package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.ISOChronology;
/* loaded from: classes2-dex2jar.jar:org/joda/time/convert/ReadableInstantConverter.class */
class ReadableInstantConverter extends AbstractConverter implements InstantConverter, PartialConverter {
    static final ReadableInstantConverter INSTANCE = new ReadableInstantConverter();

    protected ReadableInstantConverter() {
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter, org.joda.time.convert.PartialConverter
    public Chronology getChronology(Object obj, Chronology chronology) {
        Chronology chronology2 = chronology;
        if (chronology == null) {
            chronology2 = DateTimeUtils.getChronology(((ReadableInstant) obj).getChronology());
        }
        return chronology2;
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter, org.joda.time.convert.PartialConverter
    public Chronology getChronology(Object obj, DateTimeZone dateTimeZone) {
        ISOChronology chronology = ((ReadableInstant) obj).getChronology();
        if (chronology == null) {
            return ISOChronology.getInstance(dateTimeZone);
        }
        ISOChronology iSOChronology = chronology;
        if (chronology.getZone() != dateTimeZone) {
            ISOChronology withZone = chronology.withZone(dateTimeZone);
            iSOChronology = withZone;
            if (withZone == null) {
                iSOChronology = ISOChronology.getInstance(dateTimeZone);
            }
        }
        return iSOChronology;
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ((ReadableInstant) obj).getMillis();
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return ReadableInstant.class;
    }
}
