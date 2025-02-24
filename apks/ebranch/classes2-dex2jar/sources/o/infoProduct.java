package o;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:o/infoProduct.class */
public final class infoProduct implements AutoLogoutDialog_ViewBinding {
    private final Object a = new Object();
    private final Executor b;
    @Nullable
    private realmSet$nominal d;

    public infoProduct(Executor executor, realmSet$nominal realmset_nominal) {
        this.b = executor;
        this.d = realmset_nominal;
    }

    public static /* bridge */ /* synthetic */ Object d(infoProduct infoproduct) {
        return infoproduct.a;
    }

    public static /* bridge */ /* synthetic */ realmSet$nominal e(infoProduct infoproduct) {
        return infoproduct.d;
    }

    public final void c(setJatuhTempo setjatuhtempo) {
        if (setjatuhtempo.b()) {
            synchronized (this.a) {
                if (this.d != null) {
                    this.b.execute(new BCADollarDialog_ViewBinding(this, setjatuhtempo));
                }
            }
        }
    }
}
