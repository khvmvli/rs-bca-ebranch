package androidx.core.os;

import o.onDetach;
/* loaded from: classes-dex2jar.jar:androidx/core/os/OperationCanceledException.class */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    private OperationCanceledException(String str) {
        super(onDetach.a((Object) str, "The operation has been canceled."));
    }
}
