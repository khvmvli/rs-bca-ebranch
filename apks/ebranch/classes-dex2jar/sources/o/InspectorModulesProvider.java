package o;

import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/InspectorModulesProvider.class */
public final class InspectorModulesProvider {
    @Nullable
    static Stetho b;
    static long d;

    private InspectorModulesProvider() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Stetho c() {
        synchronized (InspectorModulesProvider.class) {
            try {
                Stetho stetho = b;
                if (stetho == null) {
                    return new Stetho();
                }
                b = stetho.a;
                stetho.a = null;
                d -= 8192;
                return stetho;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Stetho stetho) {
        if (stetho.a != null || stetho.g != null) {
            throw new IllegalArgumentException();
        } else if (!stetho.i) {
            synchronized (InspectorModulesProvider.class) {
                try {
                    long j = d + 8192;
                    if (j <= 65536) {
                        d = j;
                        stetho.a = b;
                        stetho.c = 0;
                        stetho.b = 0;
                        b = stetho;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
