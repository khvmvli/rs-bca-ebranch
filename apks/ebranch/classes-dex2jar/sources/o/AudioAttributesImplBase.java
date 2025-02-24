package o;

import o.ProsesTarikanFragment_ViewBinding;
/* loaded from: classes-dex2jar.jar:o/AudioAttributesImplBase.class */
public final class AudioAttributesImplBase implements ProsesTarikanFragment_ViewBinding.IconCompatParcelizer {
    public static final IconCompatParcelizer b = new IconCompatParcelizer((byte) 0);
    final ProsesORFragment c;

    /* loaded from: classes-dex2jar.jar:o/AudioAttributesImplBase$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements ProsesTarikanFragment_ViewBinding.read<AudioAttributesImplBase> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final <E extends ProsesTarikanFragment_ViewBinding.IconCompatParcelizer> E b(ProsesTarikanFragment_ViewBinding.read<E> read) {
        AudioAttributesImplBase audioAttributesImplBase;
        subscribeReservationRescheduleEvent.e(read, "");
        if (subscribeReservationRescheduleEvent.b(d(), read)) {
            subscribeReservationRescheduleEvent.c(this);
            audioAttributesImplBase = this;
        } else {
            audioAttributesImplBase = null;
        }
        return audioAttributesImplBase;
    }

    public final ProsesTarikanFragment_ViewBinding b(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding) {
        subscribeReservationRescheduleEvent.e(prosesTarikanFragment_ViewBinding, "");
        return ProsesTarikanFragment_ViewBinding.MediaBrowserCompat.CustomActionResultReceiver.b((ProsesTarikanFragment_ViewBinding) this, prosesTarikanFragment_ViewBinding);
    }

    public final ProsesTarikanFragment_ViewBinding.read<AudioAttributesImplBase> d() {
        return b;
    }

    public final <R> R e(R r, onClickInfo<? super R, ? super ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, ? extends R> onclickinfo) {
        subscribeReservationRescheduleEvent.e(onclickinfo, "");
        return (R) onclickinfo.invoke(r, this);
    }

    public final ProsesTarikanFragment_ViewBinding e(ProsesTarikanFragment_ViewBinding.read<?> read) {
        subscribeReservationRescheduleEvent.e(read, "");
        return (ProsesTarikanFragment_ViewBinding) (subscribeReservationRescheduleEvent.b(d(), read) ? ReviewSetoranFragment.e : this);
    }
}
