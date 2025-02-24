package o;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/Warkat$$Parcelable.class */
final class Warkat$$Parcelable implements AutoLogoutDialog_ViewBinding {
    private final Executor b;
    private final realmSet.kodeBank c;
    private final BahasaLayananDialog e;

    public Warkat$$Parcelable(Executor executor, realmSet.kodeBank kodebank, BahasaLayananDialog bahasaLayananDialog) {
        this.b = executor;
        this.c = kodebank;
        this.e = bahasaLayananDialog;
    }

    public final void c(final setJatuhTempo setjatuhtempo) {
        this.b.execute(new Runnable() { // from class: o.Warkat$$Parcelable.1
            @Override // java.lang.Runnable
            public final void run() {
                if (setjatuhtempo.a()) {
                    Warkat$$Parcelable.this.e.j();
                    return;
                }
                try {
                    Warkat$$Parcelable.this.e.e(Warkat$$Parcelable.this.c.then(setjatuhtempo));
                } catch (RuntimeExecutionException e) {
                    if (e.getCause() instanceof Exception) {
                        Warkat$$Parcelable.this.e.c((Exception) e.getCause());
                    } else {
                        Warkat$$Parcelable.this.e.c(e);
                    }
                } catch (Exception e2) {
                    Warkat$$Parcelable.this.e.c(e2);
                }
            }
        });
    }
}
