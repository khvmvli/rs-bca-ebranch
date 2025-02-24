package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import o.Page6DTahapanBCASFragment_ViewBinding;
import o.Page6DTahapanXpresiFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$ItemReceiver.class */
final class Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$ItemReceiver implements LayoutInflater.Factory {
    private final onClickCardPlatinum d;

    public Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$ItemReceiver(LayoutInflater.Factory factory) {
        subscribeReservationRescheduleEvent.b(factory, "");
        this.d = new Page6DTahapanXpresiFragment_ViewBinding.MediaDescriptionCompat(factory);
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        subscribeReservationRescheduleEvent.b(str, "");
        subscribeReservationRescheduleEvent.b(context, "");
        Page6DTahapanBCASFragment_ViewBinding.read read = Page6DTahapanBCASFragment_ViewBinding.e;
        Page6DTahapanBCASFragment_ViewBinding a = Page6DTahapanBCASFragment_ViewBinding.a();
        Page6DTahapanBCASFragment_ViewBinding page6DTahapanBCASFragment_ViewBinding = a;
        if (a == null) {
            page6DTahapanBCASFragment_ViewBinding = new Page6DTahapanBCASFragment_ViewBinding.IconCompatParcelizer().b();
            Page6DTahapanBCASFragment_ViewBinding.a(page6DTahapanBCASFragment_ViewBinding);
        }
        Page6DTahapanBCAFragment page6DTahapanBCAFragment = new Page6DTahapanBCAFragment(str, context, attributeSet, null, this.d, 8);
        subscribeReservationRescheduleEvent.b(page6DTahapanBCAFragment, "");
        return new Page6DTapresFragment_ViewBinding(page6DTahapanBCASFragment_ViewBinding.c, 0, page6DTahapanBCAFragment).e(page6DTahapanBCAFragment).b;
    }
}
