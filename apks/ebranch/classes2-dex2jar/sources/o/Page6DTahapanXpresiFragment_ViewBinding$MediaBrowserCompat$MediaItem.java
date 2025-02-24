package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
/* loaded from: classes2-dex2jar.jar:o/Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$MediaItem.class */
class Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$MediaItem implements onClickCardPlatinum {
    private final LayoutInflater.Factory2 a;

    public Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$MediaItem(LayoutInflater.Factory2 factory2) {
        subscribeReservationRescheduleEvent.b(factory2, "");
        this.a = factory2;
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        subscribeReservationRescheduleEvent.b(str, "");
        subscribeReservationRescheduleEvent.b(context, "");
        return this.a.onCreateView(view, str, context, attributeSet);
    }

    protected final LayoutInflater.Factory2 c() {
        return this.a;
    }
}
