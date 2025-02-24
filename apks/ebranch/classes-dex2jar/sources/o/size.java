package o;

import java.util.List;
import o.OnPageChange;
/* loaded from: classes-dex2jar.jar:o/size.class */
public final class size extends defaultReturn<Integer, Integer> {
    public size() {
        super(100);
    }

    public size(List<onClickBcaKlikpay<Integer>> list) {
        super((List) list);
    }

    @Override // o.ListenerMethod
    public final OnPageChange.Callback<Integer, Integer> a() {
        return new Optional(this.c);
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
