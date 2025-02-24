package o;

import o.ProsesTarikanFragment_ViewBinding;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/DefaultImageHeaderParser$Reader$EndOfFileException.class */
public final class DefaultImageHeaderParser$Reader$EndOfFileException implements ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, ProsesTarikanFragment_ViewBinding.read<DefaultImageHeaderParser$Reader$EndOfFileException> {
    public static final DefaultImageHeaderParser$Reader$EndOfFileException d = new DefaultImageHeaderParser$Reader$EndOfFileException();

    private DefaultImageHeaderParser$Reader$EndOfFileException() {
    }

    @Override // o.ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, o.ProsesTarikanFragment_ViewBinding
    public final <E extends ProsesTarikanFragment_ViewBinding.IconCompatParcelizer> E b(ProsesTarikanFragment_ViewBinding.read<E> read) {
        DefaultImageHeaderParser$Reader$EndOfFileException defaultImageHeaderParser$Reader$EndOfFileException;
        subscribeReservationRescheduleEvent.e(read, "");
        if (subscribeReservationRescheduleEvent.b(d(), read)) {
            subscribeReservationRescheduleEvent.c(this);
            defaultImageHeaderParser$Reader$EndOfFileException = this;
        } else {
            defaultImageHeaderParser$Reader$EndOfFileException = null;
        }
        return defaultImageHeaderParser$Reader$EndOfFileException;
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public final ProsesTarikanFragment_ViewBinding b(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding) {
        subscribeReservationRescheduleEvent.e(prosesTarikanFragment_ViewBinding, "");
        return ProsesTarikanFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(this, prosesTarikanFragment_ViewBinding);
    }

    @Override // o.ProsesTarikanFragment_ViewBinding.IconCompatParcelizer
    public final ProsesTarikanFragment_ViewBinding.read<?> d() {
        return this;
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public final <R> R e(R r, onClickInfo<? super R, ? super ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, ? extends R> onclickinfo) {
        subscribeReservationRescheduleEvent.e(onclickinfo, "");
        return (R) onclickinfo.invoke(r, this);
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public final ProsesTarikanFragment_ViewBinding e(ProsesTarikanFragment_ViewBinding.read<?> read) {
        subscribeReservationRescheduleEvent.e(read, "");
        return subscribeReservationRescheduleEvent.b(d(), read) ? ReviewSetoranFragment.e : this;
    }
}
