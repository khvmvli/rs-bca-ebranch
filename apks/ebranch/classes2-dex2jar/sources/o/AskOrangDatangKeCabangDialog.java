package o;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:o/AskOrangDatangKeCabangDialog.class */
public final class AskOrangDatangKeCabangDialog implements AutoLogoutDialog_ViewBinding {
    @Nullable
    private realmSet$jenisWarkat a;
    private final Object d = new Object();
    private final Executor e;

    public AskOrangDatangKeCabangDialog(Executor executor, realmSet$jenisWarkat realmset_jeniswarkat) {
        this.e = executor;
        this.a = realmset_jeniswarkat;
    }

    public static /* bridge */ /* synthetic */ Object a(AskOrangDatangKeCabangDialog askOrangDatangKeCabangDialog) {
        return askOrangDatangKeCabangDialog.d;
    }

    public static /* bridge */ /* synthetic */ realmSet$jenisWarkat c(AskOrangDatangKeCabangDialog askOrangDatangKeCabangDialog) {
        return askOrangDatangKeCabangDialog.a;
    }

    public final void c(setJatuhTempo setjatuhtempo) {
        if (!setjatuhtempo.b() && !setjatuhtempo.a()) {
            synchronized (this.d) {
                if (this.a != null) {
                    this.e.execute(new AgamaDialog_ViewBinding(this, setjatuhtempo));
                }
            }
        }
    }
}
