package o;

import java.util.List;
import o.OnPageChange;
import o.R;
/* loaded from: classes-dex2jar.jar:o/ListenerClass.class */
public final class ListenerClass extends defaultReturn<BN6PembayaranTundaActivity_ViewBinding, BN6PembayaranTundaActivity_ViewBinding> {

    /* loaded from: classes-dex2jar.jar:o/ListenerClass$NONE.class */
    public final class NONE {
        public final ImmutableList d;

        public NONE(ImmutableList immutableList) {
            this.d = immutableList;
        }
    }

    ListenerClass() {
        this(new BN6PembayaranTundaActivity_ViewBinding(1.0f, 1.0f));
    }

    public ListenerClass(List<onClickBcaKlikpay<BN6PembayaranTundaActivity_ViewBinding>> list) {
        super((List) list);
    }

    private ListenerClass(BN6PembayaranTundaActivity_ViewBinding bN6PembayaranTundaActivity_ViewBinding) {
        super(bN6PembayaranTundaActivity_ViewBinding);
    }

    @Override // o.ListenerMethod
    public final OnPageChange.Callback<BN6PembayaranTundaActivity_ViewBinding, BN6PembayaranTundaActivity_ViewBinding> a() {
        return new R.string(this.c);
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
