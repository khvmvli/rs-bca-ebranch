package o;

import com.bca.smartbranch.injection.module.NetworkModule;
import okhttp3.OkHttpClient;
/* loaded from: classes-dex2jar.jar:o/setCardImagePath.class */
public final class setCardImagePath implements ubahDataLainnya<OkHttpClient> {
    private final NetworkModule d;

    public setCardImagePath(NetworkModule networkModule) {
        this.d = networkModule;
    }

    @Override // o.Page6JLFragment_ViewBinding
    public final /* synthetic */ Object c() {
        OkHttpClient d = this.d.d();
        if (d != null) {
            return d;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
