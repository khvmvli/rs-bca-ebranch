package o;

import android.graphics.Path;
import java.util.List;
import o.OnPageChange;
import o.R;
/* loaded from: classes-dex2jar.jar:o/callbacks.class */
public final class callbacks extends defaultReturn<getFloat, Path> {
    public callbacks(List<onClickBcaKlikpay<getFloat>> list) {
        super((List) list);
    }

    @Override // o.ListenerMethod
    public final OnPageChange.Callback<getFloat, Path> a() {
        return new R.drawable(this.c);
    }

    @Override // o.defaultReturn, o.ListenerMethod
    public final /* bridge */ /* synthetic */ List d() {
        return d();
    }

    @Override // o.defaultReturn, o.ListenerMethod
    public final /* bridge */ /* synthetic */ boolean e() {
        return e();
    }

    @Override // o.defaultReturn
    public final /* bridge */ /* synthetic */ String toString() {
        return toString();
    }
}
