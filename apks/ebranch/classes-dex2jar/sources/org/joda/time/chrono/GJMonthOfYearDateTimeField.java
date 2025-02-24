package org.joda.time.chrono;

import java.util.Locale;
/* loaded from: classes-dex2jar.jar:org/joda/time/chrono/GJMonthOfYearDateTimeField.class */
final class GJMonthOfYearDateTimeField extends BasicMonthOfYearDateTimeField {
    private static final long serialVersionUID = -4748157875845286249L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GJMonthOfYearDateTimeField(BasicChronology basicChronology) {
        super(basicChronology, 2);
    }

    @Override // org.joda.time.field.BaseDateTimeField
    public final int convertText(String str, Locale locale) {
        return GJLocaleSymbols.forLocale(locale).monthOfYearTextToValue(str);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final String getAsShortText(int i, Locale locale) {
        return GJLocaleSymbols.forLocale(locale).monthOfYearValueToShortText(i);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final String getAsText(int i, Locale locale) {
        return GJLocaleSymbols.forLocale(locale).monthOfYearValueToText(i);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumShortTextLength(Locale locale) {
        return GJLocaleSymbols.forLocale(locale).getMonthMaxShortTextLength();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumTextLength(Locale locale) {
        return GJLocaleSymbols.forLocale(locale).getMonthMaxTextLength();
    }
}
