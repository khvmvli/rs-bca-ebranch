package o;

import com.bca.smartbranch.injection.module.NetworkModule;
import retrofit2.Retrofit;
/* loaded from: classes-dex2jar.jar:o/setCardImageOrientation.class */
public final class setCardImageOrientation implements ubahDataLainnya<setIncomeDisplayAmount> {
    private final Page6JLFragment_ViewBinding<Retrofit> a;
    private final NetworkModule b;

    public setCardImageOrientation(NetworkModule networkModule, Page6JLFragment_ViewBinding<Retrofit> page6JLFragment_ViewBinding) {
        this.b = networkModule;
        this.a = page6JLFragment_ViewBinding;
    }

    @Override // o.Page6JLFragment_ViewBinding
    public final /* synthetic */ Object c() {
        setIncomeDisplayAmount a = this.b.a(this.a.c());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
