package com.google.android.gms.common.api;

import android.text.TextUtils;
import java.util.ArrayList;
import o.realmGet$jobValue;
import o.realmGet$religion;
import o.setThumbTextPadding;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/common/api/AvailabilityException.class */
public class AvailabilityException extends Exception {
    private final setThumbTextPadding a;

    public AvailabilityException(setThumbTextPadding setthumbtextpadding) {
        this.a = setthumbtextpadding;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (realmGet$religion realmget_religion : this.a.keySet()) {
            realmGet$jobValue realmget_jobvalue = (realmGet$jobValue) this.a.get(realmget_religion);
            if (realmget_jobvalue != null) {
                realmGet$jobValue realmget_jobvalue2 = realmget_jobvalue;
                z &= !(realmget_jobvalue2.a == 0);
                String str = realmget_religion.e.b;
                String valueOf = String.valueOf(realmget_jobvalue2);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(": ");
                sb.append(valueOf);
                arrayList.add(sb.toString());
            } else {
                throw new NullPointerException("null reference");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
