package o;

import java.util.List;
import o.Page6DTahapanBCASFragment;
/* loaded from: classes2-dex2jar.jar:o/Page6DTapresFragment_ViewBinding.class */
public final class Page6DTapresFragment_ViewBinding implements Page6DTahapanBCASFragment.write {
    private final List<Page6DTahapanBCASFragment> a;
    private final Page6DTahapanBCAFragment b;
    private final int e;

    public Page6DTapresFragment_ViewBinding(List<? extends Page6DTahapanBCASFragment> list, int i, Page6DTahapanBCAFragment page6DTahapanBCAFragment) {
        subscribeReservationRescheduleEvent.b(list, "");
        subscribeReservationRescheduleEvent.b(page6DTahapanBCAFragment, "");
        this.a = list;
        this.e = i;
        this.b = page6DTahapanBCAFragment;
    }

    public final Page6DTahapanBCAFragment b() {
        return this.b;
    }

    public final onClickCardGold e(Page6DTahapanBCAFragment page6DTahapanBCAFragment) {
        subscribeReservationRescheduleEvent.b(page6DTahapanBCAFragment, "");
        if (this.e < this.a.size()) {
            return this.a.get(this.e).intercept(new Page6DTapresFragment_ViewBinding(this.a, this.e + 1, page6DTahapanBCAFragment));
        }
        throw new AssertionError("no interceptors added to the chain");
    }
}
