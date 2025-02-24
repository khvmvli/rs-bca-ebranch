package o;

import java.util.concurrent.Callable;
/* loaded from: classes2-dex2jar.jar:o/bindViews.class */
final class bindViews implements Runnable {
    final /* synthetic */ BahasaLayananDialog d;
    final /* synthetic */ Callable e;

    bindViews(BahasaLayananDialog bahasaLayananDialog, Callable callable) {
        this.d = bahasaLayananDialog;
        this.e = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.d.e(this.e.call());
        } catch (Exception e) {
            this.d.c(e);
        } catch (Throwable th) {
            this.d.c(new RuntimeException(th));
        }
    }
}
