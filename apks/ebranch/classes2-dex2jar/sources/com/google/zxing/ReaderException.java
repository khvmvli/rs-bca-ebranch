package com.google.zxing;
/* loaded from: classes2-dex2jar.jar:com/google/zxing/ReaderException.class */
public abstract class ReaderException extends Exception {
    protected static final StackTraceElement[] c;
    protected static final boolean e;

    static {
        e = System.getProperty("surefire.test.class.path") != null;
        c = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return null;
    }
}
