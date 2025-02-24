package o;

import o.ProsesTarikanFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/ProsesORFragment_ViewBinding.class */
public abstract class ProsesORFragment_ViewBinding implements ProsesTarikanFragment_ViewBinding.IconCompatParcelizer {
    private final ProsesTarikanFragment_ViewBinding.read<?> d;

    public ProsesORFragment_ViewBinding(ProsesTarikanFragment_ViewBinding.read<?> read) {
        subscribeReservationRescheduleEvent.e(read, "");
        this.d = read;
    }

    @Override // o.ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, o.ProsesTarikanFragment_ViewBinding
    public <E extends ProsesTarikanFragment_ViewBinding.IconCompatParcelizer> E b(ProsesTarikanFragment_ViewBinding.read<E> read) {
        ProsesORFragment_ViewBinding prosesORFragment_ViewBinding;
        subscribeReservationRescheduleEvent.e(read, "");
        if (subscribeReservationRescheduleEvent.b(d(), read)) {
            subscribeReservationRescheduleEvent.c(this);
            prosesORFragment_ViewBinding = this;
        } else {
            prosesORFragment_ViewBinding = null;
        }
        return prosesORFragment_ViewBinding;
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public final ProsesTarikanFragment_ViewBinding b(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding) {
        subscribeReservationRescheduleEvent.e(prosesTarikanFragment_ViewBinding, "");
        return ProsesTarikanFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(this, prosesTarikanFragment_ViewBinding);
    }

    @Override // o.ProsesTarikanFragment_ViewBinding.IconCompatParcelizer
    public final ProsesTarikanFragment_ViewBinding.read<?> d() {
        return this.d;
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public final <R> R e(R r, onClickInfo<? super R, ? super ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, ? extends R> onclickinfo) {
        subscribeReservationRescheduleEvent.e(onclickinfo, "");
        return (R) onclickinfo.invoke(r, this);
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public ProsesTarikanFragment_ViewBinding e(ProsesTarikanFragment_ViewBinding.read<?> read) {
        subscribeReservationRescheduleEvent.e(read, "");
        return subscribeReservationRescheduleEvent.b(d(), read) ? ReviewSetoranFragment.e : this;
    }
}
