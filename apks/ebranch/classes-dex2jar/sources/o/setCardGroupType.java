package o;

import com.bca.smartbranch.injection.module.NetworkModule;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
/* loaded from: classes-dex2jar.jar:o/setCardGroupType.class */
public final class setCardGroupType implements ubahDataLainnya<Retrofit> {
    private final Page6JLFragment_ViewBinding<OkHttpClient> a;
    private final Page6JLFragment_ViewBinding<HttpUrl> b;
    private final NetworkModule c;

    public setCardGroupType(NetworkModule networkModule, Page6JLFragment_ViewBinding<HttpUrl> page6JLFragment_ViewBinding, Page6JLFragment_ViewBinding<OkHttpClient> page6JLFragment_ViewBinding2) {
        this.c = networkModule;
        this.b = page6JLFragment_ViewBinding;
        this.a = page6JLFragment_ViewBinding2;
    }

    @Override // o.Page6JLFragment_ViewBinding
    public final /* synthetic */ Object c() {
        Retrofit a = this.c.a(this.b.c(), this.a.c());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
