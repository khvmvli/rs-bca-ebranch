package o;

import java.io.Serializable;
import o.ProsesTarikanFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/ReviewSetoranFragment.class */
public final class ReviewSetoranFragment implements ProsesTarikanFragment_ViewBinding, Serializable {
    public static final ReviewSetoranFragment e = new ReviewSetoranFragment();

    private ReviewSetoranFragment() {
    }

    private final Object readResolve() {
        return e;
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public final <E extends ProsesTarikanFragment_ViewBinding.IconCompatParcelizer> E b(ProsesTarikanFragment_ViewBinding.read<E> read) {
        subscribeReservationRescheduleEvent.e(read, "");
        return null;
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public final ProsesTarikanFragment_ViewBinding b(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding) {
        subscribeReservationRescheduleEvent.e(prosesTarikanFragment_ViewBinding, "");
        return prosesTarikanFragment_ViewBinding;
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public final <R> R e(R r, onClickInfo<? super R, ? super ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, ? extends R> onclickinfo) {
        subscribeReservationRescheduleEvent.e(onclickinfo, "");
        return r;
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public final ProsesTarikanFragment_ViewBinding e(ProsesTarikanFragment_ViewBinding.read<?> read) {
        subscribeReservationRescheduleEvent.e(read, "");
        return this;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.Object
    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
