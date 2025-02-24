package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
/* loaded from: classes2-dex2jar.jar:org/joda/time/convert/InstantConverter.class */
public interface InstantConverter extends Converter {
    @Override // org.joda.time.convert.PartialConverter
    Chronology getChronology(Object obj, Chronology chronology);

    @Override // org.joda.time.convert.PartialConverter
    Chronology getChronology(Object obj, DateTimeZone dateTimeZone);

    long getInstantMillis(Object obj, Chronology chronology);
}
