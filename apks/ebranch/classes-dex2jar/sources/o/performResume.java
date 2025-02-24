package o;

import o.performPictureInPictureModeChanged;
import o.performStop;
/* loaded from: classes-dex2jar.jar:o/performResume.class */
public final class performResume<VM extends performPictureInPictureModeChanged> implements onChooseValueSumberPenghasilan<VM> {
    private final pilihNoRek<performPrimaryNavigationFragmentChanged> a;
    private final pilihNoRek<performStop.read> c;
    private final setEmptyView<VM> d;
    private VM e;

    /* JADX WARN: Multi-variable type inference failed */
    public performResume(setEmptyView<VM> setemptyview, pilihNoRek<? extends performPrimaryNavigationFragmentChanged> pilihnorek, pilihNoRek<? extends performStop.read> pilihnorek2) {
        subscribeReservationRescheduleEvent.e(setemptyview, "");
        subscribeReservationRescheduleEvent.e(pilihnorek, "");
        subscribeReservationRescheduleEvent.e(pilihnorek2, "");
        this.d = setemptyview;
        this.a = pilihnorek;
        this.c = pilihnorek2;
    }

    @Override // o.onChooseValueSumberPenghasilan
    public final /* synthetic */ Object d() {
        VM vm = this.e;
        VM vm2 = vm;
        if (vm == null) {
            performStop performstop = new performStop(this.a.invoke(), this.c.invoke());
            setEmptyView<VM> setemptyview = this.d;
            subscribeReservationRescheduleEvent.e(setemptyview, "");
            Class<?> d = ((TransaksiBerhasilFragment_ViewBinding) setemptyview).d();
            subscribeReservationRescheduleEvent.c(d);
            vm2 = (VM) performstop.c(d);
            this.e = vm2;
            subscribeReservationRescheduleEvent.d(vm2, "");
        }
        return vm2;
    }
}
