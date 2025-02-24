package o;

import android.app.Application;
import android.content.SharedPreferences;
import com.bca.smartbranch.injection.module.DataModule;
/* loaded from: classes-dex2jar.jar:o/setCardName.class */
public final class setCardName implements ubahDataLainnya<SharedPreferences> {
    private final DataModule a;
    private final Page6JLFragment_ViewBinding<Application> e;

    public setCardName(DataModule dataModule, Page6JLFragment_ViewBinding<Application> page6JLFragment_ViewBinding) {
        this.a = dataModule;
        this.e = page6JLFragment_ViewBinding;
    }

    @Override // o.Page6JLFragment_ViewBinding
    public final /* synthetic */ Object c() {
        SharedPreferences c = this.a.c(this.e.c());
        if (c != null) {
            return c;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
