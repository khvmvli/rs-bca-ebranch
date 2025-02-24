package o;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2-dex2jar.jar:o/ScreenshotSuccessDialog_ViewBinding.class */
public final class ScreenshotSuccessDialog_ViewBinding implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler a;
    private final write b;
    private final SettingsDataProvider c;
    final AtomicBoolean d = new AtomicBoolean(false);

    /* loaded from: classes2-dex2jar.jar:o/ScreenshotSuccessDialog_ViewBinding$write.class */
    interface write {
        void a(SettingsDataProvider settingsDataProvider, Thread thread, Throwable th);
    }

    public ScreenshotSuccessDialog_ViewBinding(write write2, SettingsDataProvider settingsDataProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = write2;
        this.c = settingsDataProvider;
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.d.set(true);
        try {
            try {
                if (thread == null) {
                    Logger.getLogger().e("Could not handle uncaught exception; null thread");
                } else if (th == null) {
                    Logger.getLogger().e("Could not handle uncaught exception; null throwable");
                } else {
                    this.b.a(this.c, thread, th);
                }
            } catch (Exception e) {
                Logger.getLogger().e("An error occurred in the uncaught exception handler", e);
            }
            Logger.getLogger().d("Completed exception processing. Invoking default exception handler.");
            this.a.uncaughtException(thread, th);
            this.d.set(false);
        } catch (Throwable th2) {
            Logger.getLogger().d("Completed exception processing. Invoking default exception handler.");
            this.a.uncaughtException(thread, th);
            this.d.set(false);
            throw th2;
        }
    }
}
