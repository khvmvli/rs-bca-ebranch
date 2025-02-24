package o;
/* loaded from: classes2-dex2jar.jar:o/ubahDataRekening.class */
public final class ubahDataRekening {
    public static final Throwable a = new Throwable() { // from class: o.ubahDataRekening$MediaBrowserCompat$CustomActionResultReceiver
        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    };

    public static RuntimeException d(Throwable th) {
        if (!(th instanceof Error)) {
            return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
        }
        throw ((Error) th);
    }
}
