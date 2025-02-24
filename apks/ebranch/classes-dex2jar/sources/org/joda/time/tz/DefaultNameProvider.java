package org.joda.time.tz;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:org/joda/time/tz/DefaultNameProvider.class */
public class DefaultNameProvider implements NameProvider {
    private HashMap<Locale, Map<String, Map<String, Object>>> iByLocaleCache = createCache();
    private HashMap<Locale, Map<String, Map<Boolean, Object>>> iByLocaleCache2 = createCache();

    private HashMap createCache() {
        return new HashMap(7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private java.lang.String[] getNameSet(java.util.Locale r9, java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 404
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DefaultNameProvider.getNameSet(java.util.Locale, java.lang.String, java.lang.String):java.lang.String[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.Map] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private java.lang.String[] getNameSet(java.util.Locale r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 339
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DefaultNameProvider.getNameSet(java.util.Locale, java.lang.String, java.lang.String, boolean):java.lang.String[]");
    }

    @Override // org.joda.time.tz.NameProvider
    public String getName(Locale locale, String str, String str2) {
        String[] nameSet = getNameSet(locale, str, str2);
        return nameSet == null ? null : nameSet[1];
    }

    public String getName(Locale locale, String str, String str2, boolean z) {
        String[] nameSet = getNameSet(locale, str, str2, z);
        return nameSet == null ? null : nameSet[1];
    }

    @Override // org.joda.time.tz.NameProvider
    public String getShortName(Locale locale, String str, String str2) {
        String[] nameSet = getNameSet(locale, str, str2);
        return nameSet == null ? null : nameSet[0];
    }

    public String getShortName(Locale locale, String str, String str2, boolean z) {
        String[] nameSet = getNameSet(locale, str, str2, z);
        return nameSet == null ? null : nameSet[0];
    }
}
