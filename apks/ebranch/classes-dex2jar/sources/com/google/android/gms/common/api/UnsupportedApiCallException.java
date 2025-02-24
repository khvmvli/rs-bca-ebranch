package com.google.android.gms.common.api;

import o.realmGet$job;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/common/api/UnsupportedApiCallException.class */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final realmGet$job d;

    public UnsupportedApiCallException(realmGet$job realmget_job) {
        this.d = realmget_job;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.d)));
    }
}
