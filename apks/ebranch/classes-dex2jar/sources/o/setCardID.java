package o;

import com.bca.smartbranch.injection.module.NetworkModule;
import okhttp3.HttpUrl;
/* loaded from: classes-dex2jar.jar:o/setCardID.class */
public final class setCardID implements ubahDataLainnya<HttpUrl> {
    private final NetworkModule c;

    public setCardID(NetworkModule networkModule) {
        this.c = networkModule;
    }

    @Override // o.Page6JLFragment_ViewBinding
    public final /* synthetic */ Object c() {
        HttpUrl a = this.c.a();
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
