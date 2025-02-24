package com.google.firebase.crashlytics;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/CustomKeysAndValues$Builder.class */
public class CustomKeysAndValues$Builder {
    private Map<String, String> keysAndValues = new HashMap();

    public CustomKeysAndValues build() {
        return new CustomKeysAndValues(this);
    }

    public CustomKeysAndValues$Builder putBoolean(String str, boolean z) {
        this.keysAndValues.put(str, Boolean.toString(z));
        return this;
    }

    public CustomKeysAndValues$Builder putDouble(String str, double d) {
        this.keysAndValues.put(str, Double.toString(d));
        return this;
    }

    public CustomKeysAndValues$Builder putFloat(String str, float f) {
        this.keysAndValues.put(str, Float.toString(f));
        return this;
    }

    public CustomKeysAndValues$Builder putInt(String str, int i) {
        this.keysAndValues.put(str, Integer.toString(i));
        return this;
    }

    public CustomKeysAndValues$Builder putLong(String str, long j) {
        this.keysAndValues.put(str, Long.toString(j));
        return this;
    }

    public CustomKeysAndValues$Builder putString(String str, String str2) {
        this.keysAndValues.put(str, str2);
        return this;
    }
}
