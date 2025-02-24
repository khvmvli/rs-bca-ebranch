package com.google.firebase.crashlytics.internal.common;

import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/common/CommonUtils$read.class */
enum CommonUtils$read {
    X86_32,
    X86_64,
    ARM_UNKNOWN,
    PPC,
    PPC64,
    ARMV6,
    ARMV7,
    UNKNOWN,
    ARMV7S,
    ARM64;
    
    private static final Map<String, CommonUtils$read> l;

    static {
        CommonUtils$read commonUtils$read = X86_32;
        CommonUtils$read commonUtils$read2 = ARMV6;
        CommonUtils$read commonUtils$read3 = ARMV7;
        CommonUtils$read commonUtils$read4 = ARM64;
        HashMap hashMap = new HashMap(4);
        l = hashMap;
        hashMap.put("armeabi-v7a", commonUtils$read3);
        hashMap.put("armeabi", commonUtils$read2);
        hashMap.put("arm64-v8a", commonUtils$read4);
        hashMap.put("x86", commonUtils$read);
    }

    static CommonUtils$read c() {
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str)) {
            Logger.getLogger().v("Architecture#getValue()::Build.CPU_ABI returned null or empty");
            return UNKNOWN;
        }
        CommonUtils$read commonUtils$read = l.get(str.toLowerCase(Locale.US));
        CommonUtils$read commonUtils$read2 = commonUtils$read;
        if (commonUtils$read == null) {
            commonUtils$read2 = UNKNOWN;
        }
        return commonUtils$read2;
    }
}
