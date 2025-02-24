package o;

import o.BaseFragment;
/* loaded from: classes-dex2jar.jar:o/fragmentBackPressedEvent.class */
final class fragmentBackPressedEvent extends BaseFragment.RemoteActionCompatParcelizer {
    final /* synthetic */ BaseFragment.write d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fragmentBackPressedEvent(BaseFragment.write write) {
        super();
        this.d = write;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return c();
    }
}
