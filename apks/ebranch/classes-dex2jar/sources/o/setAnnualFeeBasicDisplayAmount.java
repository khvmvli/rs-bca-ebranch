package o;

import android.content.SharedPreferences;
import com.bca.smartbranch.injection.module.DataModule;
/* loaded from: classes-dex2jar.jar:o/setAnnualFeeBasicDisplayAmount.class */
public final class setAnnualFeeBasicDisplayAmount implements ubahDataLainnya<SharedPreferences.Editor> {
    private final Page6JLFragment_ViewBinding<SharedPreferences> a;
    private final DataModule e;

    public setAnnualFeeBasicDisplayAmount(DataModule dataModule, Page6JLFragment_ViewBinding<SharedPreferences> page6JLFragment_ViewBinding) {
        this.e = dataModule;
        this.a = page6JLFragment_ViewBinding;
    }

    @Override // o.Page6JLFragment_ViewBinding
    public final /* synthetic */ Object c() {
        SharedPreferences.Editor a = this.e.a(this.a.c());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
