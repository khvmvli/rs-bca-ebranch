package o;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/AskOrangDatangKeCabangDialog_ViewBinding.class */
public final class AskOrangDatangKeCabangDialog_ViewBinding implements AutoLogoutDialog_ViewBinding {
    private final Executor a;
    @Nullable
    private realmSet$kodeJenisWarkat c;
    private final Object e = new Object();

    public AskOrangDatangKeCabangDialog_ViewBinding(Executor executor, realmSet$kodeJenisWarkat realmset_kodejeniswarkat) {
        this.a = executor;
        this.c = realmset_kodejeniswarkat;
    }

    public final void c(setJatuhTempo setjatuhtempo) {
        if (setjatuhtempo.a()) {
            synchronized (this.e) {
                if (this.c != null) {
                    this.a.execute(new setNomorWarkat(this));
                }
            }
        }
    }
}
