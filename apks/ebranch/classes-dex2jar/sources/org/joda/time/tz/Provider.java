package org.joda.time.tz;

import java.util.Set;
import org.joda.time.DateTimeZone;
/* loaded from: classes-dex2jar.jar:org/joda/time/tz/Provider.class */
public interface Provider {
    Set<String> getAvailableIDs();

    DateTimeZone getZone(String str);
}
