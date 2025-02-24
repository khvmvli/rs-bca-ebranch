package com.google.firebase;

import android.text.TextUtils;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/FirebaseException.class */
public class FirebaseException extends Exception {
    @Deprecated
    public FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str, Throwable th) {
        super(str, th);
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Detail message must not be empty");
    }
}
