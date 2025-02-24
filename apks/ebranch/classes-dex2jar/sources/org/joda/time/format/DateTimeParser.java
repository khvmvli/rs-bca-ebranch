package org.joda.time.format;
/* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeParser.class */
public interface DateTimeParser {
    @Override // org.joda.time.format.InternalParser
    int estimateParsedLength();

    int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i);
}
