package org.joda.time.tz;

import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeZone;
/* loaded from: classes-dex2jar.jar:org/joda/time/tz/UTCProvider.class */
public final class UTCProvider implements Provider {
    private static final Set<String> AVAILABLE_IDS = Collections.singleton("UTC");

    @Override // org.joda.time.tz.Provider
    public final Set<String> getAvailableIDs() {
        return AVAILABLE_IDS;
    }

    @Override // org.joda.time.tz.Provider
    public final DateTimeZone getZone(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return DateTimeZone.UTC;
        }
        return null;
    }
}
