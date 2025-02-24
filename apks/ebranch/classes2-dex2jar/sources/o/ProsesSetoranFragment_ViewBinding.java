package o;

import o.ProsesTarikanFragment_ViewBinding;
import o.ProsesTarikanFragment_ViewBinding.IconCompatParcelizer;
/* loaded from: classes2-dex2jar.jar:o/ProsesSetoranFragment_ViewBinding.class */
public abstract class ProsesSetoranFragment_ViewBinding<B extends ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, E extends B> implements ProsesTarikanFragment_ViewBinding.read<E> {
    public final T1TransaksiTarikanUbahFragment_ViewBinding<ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, E> b;
    public final ProsesTarikanFragment_ViewBinding.read<?> d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [o.T1TransaksiTarikanUbahFragment_ViewBinding<o.ProsesTarikanFragment_ViewBinding$IconCompatParcelizer, E extends B>, o.T1TransaksiTarikanUbahFragment_ViewBinding<? super o.ProsesTarikanFragment_ViewBinding$IconCompatParcelizer, ? extends E extends B>, java.lang.Object] */
    public ProsesSetoranFragment_ViewBinding(ProsesTarikanFragment_ViewBinding.read<B> read, T1TransaksiTarikanUbahFragment_ViewBinding<? super ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, ? extends E> t1TransaksiTarikanUbahFragment_ViewBinding) {
        subscribeReservationRescheduleEvent.e(read, "");
        subscribeReservationRescheduleEvent.e((Object) t1TransaksiTarikanUbahFragment_ViewBinding, "");
        this.b = t1TransaksiTarikanUbahFragment_ViewBinding;
        this.d = read instanceof ProsesSetoranFragment_ViewBinding ? ((ProsesSetoranFragment_ViewBinding) read).d : read;
    }
}
