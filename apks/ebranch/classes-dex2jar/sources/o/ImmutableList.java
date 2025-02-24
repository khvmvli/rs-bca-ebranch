package o;

import java.util.List;
import o.OnPageChange;
/* loaded from: classes-dex2jar.jar:o/ImmutableList.class */
public final class ImmutableList extends defaultReturn<Float, Float> {
    ImmutableList() {
        super(Float.valueOf(0.0f));
    }

    public ImmutableList(List<onClickBcaKlikpay<Float>> list) {
        super((List) list);
    }

    @Override // o.ListenerMethod
    public final OnPageChange.Callback<Float, Float> a() {
        return new OnPageChange(this.c);
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
