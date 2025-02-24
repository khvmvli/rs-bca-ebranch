package org.joda.time.tz;

import java.util.Locale;
/* loaded from: classes-dex2jar.jar:org/joda/time/tz/NameProvider.class */
public interface NameProvider {
    String getName(Locale locale, String str, String str2);

    String getShortName(Locale locale, String str, String str2);
}
