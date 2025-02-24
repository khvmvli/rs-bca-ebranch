package com.google.android.gms.common;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/common/GooglePlayServicesManifestException.class */
public class GooglePlayServicesManifestException extends IllegalStateException {
    private final int b;

    public GooglePlayServicesManifestException(int i, String str) {
        super(str);
        this.b = i;
    }
}
