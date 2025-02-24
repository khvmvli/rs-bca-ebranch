package com.google.android.gms.tasks;

import o.setJatuhTempo;
/* loaded from: classes2-dex2jar.jar:com/google/android/gms/tasks/DuplicateTaskCompletionException.class */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException e(setJatuhTempo<?> setjatuhtempo) {
        if (!setjatuhtempo.e()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception d = setjatuhtempo.d();
        return new DuplicateTaskCompletionException("Complete with: ".concat(d != null ? "failure" : setjatuhtempo.b() ? "result ".concat(String.valueOf(String.valueOf(setjatuhtempo.c()))) : setjatuhtempo.a() ? "cancellation" : "unknown issue"), d);
    }
}
