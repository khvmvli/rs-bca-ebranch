package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import o.Page6DTahapanBCASFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$SearchResultReceiver.class */
class Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$SearchResultReceiver implements LayoutInflater.Factory2 {
    private final Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$MediaItem d;

    public Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$SearchResultReceiver(LayoutInflater.Factory2 factory2) {
        subscribeReservationRescheduleEvent.b(factory2, "");
        this.d = new Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$MediaItem(factory2);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        subscribeReservationRescheduleEvent.b(str, "");
        subscribeReservationRescheduleEvent.b(context, "");
        Page6DTahapanBCASFragment_ViewBinding.read read = Page6DTahapanBCASFragment_ViewBinding.e;
        Page6DTahapanBCASFragment_ViewBinding a = Page6DTahapanBCASFragment_ViewBinding.a();
        Page6DTahapanBCASFragment_ViewBinding page6DTahapanBCASFragment_ViewBinding = a;
        if (a == null) {
            page6DTahapanBCASFragment_ViewBinding = new Page6DTahapanBCASFragment_ViewBinding.IconCompatParcelizer().b();
            Page6DTahapanBCASFragment_ViewBinding.a(page6DTahapanBCASFragment_ViewBinding);
        }
        Page6DTahapanBCAFragment page6DTahapanBCAFragment = new Page6DTahapanBCAFragment(str, context, attributeSet, view, this.d);
        subscribeReservationRescheduleEvent.b(page6DTahapanBCAFragment, "");
        return new Page6DTapresFragment_ViewBinding(page6DTahapanBCASFragment_ViewBinding.c, 0, page6DTahapanBCAFragment).e(page6DTahapanBCAFragment).b;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        subscribeReservationRescheduleEvent.b(str, "");
        subscribeReservationRescheduleEvent.b(context, "");
        return onCreateView(null, str, context, attributeSet);
    }
}
