package o;

import android.app.Application;
import com.bca.smartbranch.injection.module.AppModule;
/* loaded from: classes-dex2jar.jar:o/setCardCode.class */
public final class setCardCode implements ubahDataLainnya<Application> {
    private final AppModule d;

    public setCardCode(AppModule appModule) {
        this.d = appModule;
    }

    @Override // o.Page6JLFragment_ViewBinding
    public final /* synthetic */ Object c() {
        Application e = this.d.e();
        if (e != null) {
            return e;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
