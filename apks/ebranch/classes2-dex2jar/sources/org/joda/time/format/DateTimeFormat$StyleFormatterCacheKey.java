package org.joda.time.format;

import java.util.Locale;
/* loaded from: classes2-dex2jar.jar:org/joda/time/format/DateTimeFormat$StyleFormatterCacheKey.class */
class DateTimeFormat$StyleFormatterCacheKey {
    private final int combinedTypeAndStyle;
    private final Locale locale;

    public DateTimeFormat$StyleFormatterCacheKey(int i, int i2, int i3, Locale locale) {
        this.locale = locale;
        this.combinedTypeAndStyle = i + (i2 << 4) + (i3 << 8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DateTimeFormat$StyleFormatterCacheKey)) {
            return false;
        }
        DateTimeFormat$StyleFormatterCacheKey dateTimeFormat$StyleFormatterCacheKey = (DateTimeFormat$StyleFormatterCacheKey) obj;
        if (this.combinedTypeAndStyle != dateTimeFormat$StyleFormatterCacheKey.combinedTypeAndStyle) {
            return false;
        }
        Locale locale = this.locale;
        return locale == null ? dateTimeFormat$StyleFormatterCacheKey.locale == null : locale.equals(dateTimeFormat$StyleFormatterCacheKey.locale);
    }

    public int hashCode() {
        int i = this.combinedTypeAndStyle;
        Locale locale = this.locale;
        return ((i + 31) * 31) + (locale == null ? 0 : locale.hashCode());
    }
}
