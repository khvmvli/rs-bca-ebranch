package rx.exceptions;
/* loaded from: classes2-dex2jar.jar:rx/exceptions/AssemblyStackTraceException.class */
public final class AssemblyStackTraceException extends RuntimeException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return this;
    }
}
