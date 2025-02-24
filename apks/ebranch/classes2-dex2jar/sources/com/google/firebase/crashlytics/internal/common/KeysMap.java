package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/common/KeysMap.class */
public class KeysMap {
    private final Map<String, String> keys = new HashMap();
    private int maxEntries;
    private int maxEntryLength;

    public KeysMap(int i, int i2) {
        this.maxEntries = i;
        this.maxEntryLength = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String sanitizeKey(String str) {
        if (str != null) {
            return sanitizeAttribute(str);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    private void setSyncKeys(Map<String, String> map) {
        synchronized (this) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String sanitizeKey = sanitizeKey(entry.getKey());
                String sanitizeAttribute = entry.getValue() == null ? "" : sanitizeAttribute(entry.getValue());
                if (this.keys.containsKey(sanitizeKey)) {
                    hashMap.put(sanitizeKey, sanitizeAttribute);
                } else {
                    hashMap2.put(sanitizeKey, sanitizeAttribute);
                }
            }
            this.keys.putAll(hashMap);
            int size = this.keys.size();
            int size2 = hashMap2.size();
            int i = this.maxEntries;
            if (size + size2 > i) {
                int size3 = this.keys.size();
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder();
                sb.append("Exceeded maximum number of custom attributes (");
                sb.append(this.maxEntries);
                sb.append(").");
                logger.v(sb.toString());
                hashMap2.keySet().retainAll(new ArrayList(hashMap2.keySet()).subList(0, i - size3));
            }
            this.keys.putAll(hashMap2);
        }
    }

    public Map<String, String> getKeys() {
        return Collections.unmodifiableMap(this.keys);
    }

    public String sanitizeAttribute(String str) {
        String str2 = str;
        if (str != null) {
            String trim = str.trim();
            int length = trim.length();
            int i = this.maxEntryLength;
            str2 = trim;
            if (length > i) {
                str2 = trim.substring(0, i);
            }
        }
        return str2;
    }

    public void setKey(String str, String str2) {
        setSyncKeys(new HashMap<String, String>(str, str2) { // from class: com.google.firebase.crashlytics.internal.common.KeysMap.4
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            {
                this.c = r7;
                this.b = r8;
                put(KeysMap.this.sanitizeKey(r7), KeysMap.this.sanitizeAttribute(r8));
            }
        });
    }

    public void setKeys(Map<String, String> map) {
        setSyncKeys(map);
    }
}
