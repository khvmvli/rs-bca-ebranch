package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes2-dex2jar.jar:o/Page6DTahapanBCAFragment.class */
public final class Page6DTahapanBCAFragment {
    public static final RemoteActionCompatParcelizer e = new RemoteActionCompatParcelizer((byte) 0);
    public final AttributeSet a;
    public final String b;
    public final Context c;
    public final onClickCardPlatinum d;
    public final View i;

    /* loaded from: classes2-dex2jar.jar:o/Page6DTahapanBCAFragment$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    public Page6DTahapanBCAFragment(String str, Context context, AttributeSet attributeSet, View view, onClickCardPlatinum onclickcardplatinum) {
        subscribeReservationRescheduleEvent.b(str, "");
        subscribeReservationRescheduleEvent.b(context, "");
        subscribeReservationRescheduleEvent.b(onclickcardplatinum, "");
        this.b = str;
        this.c = context;
        this.a = attributeSet;
        this.i = view;
        this.d = onclickcardplatinum;
    }

    public /* synthetic */ Page6DTahapanBCAFragment(String str, Context context, AttributeSet attributeSet, View view, onClickCardPlatinum onclickcardplatinum, int i) {
        this(str, context, attributeSet, null, onclickcardplatinum);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Page6DTahapanBCAFragment)) {
            return false;
        }
        Page6DTahapanBCAFragment page6DTahapanBCAFragment = (Page6DTahapanBCAFragment) obj;
        return subscribeReservationRescheduleEvent.b(this.b, page6DTahapanBCAFragment.b) && subscribeReservationRescheduleEvent.b(this.c, page6DTahapanBCAFragment.c) && subscribeReservationRescheduleEvent.b(this.a, page6DTahapanBCAFragment.a) && subscribeReservationRescheduleEvent.b(this.i, page6DTahapanBCAFragment.i) && subscribeReservationRescheduleEvent.b(this.d, page6DTahapanBCAFragment.d);
    }

    public final int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Context context = this.c;
        int hashCode2 = context != null ? context.hashCode() : 0;
        AttributeSet attributeSet = this.a;
        int hashCode3 = attributeSet != null ? attributeSet.hashCode() : 0;
        View view = this.i;
        int hashCode4 = view != null ? view.hashCode() : 0;
        onClickCardPlatinum onclickcardplatinum = this.d;
        if (onclickcardplatinum != null) {
            i = onclickcardplatinum.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InflateRequest(name=");
        sb.append(this.b);
        sb.append(", context=");
        sb.append(this.c);
        sb.append(", attrs=");
        sb.append(this.a);
        sb.append(", parent=");
        sb.append(this.i);
        sb.append(", fallbackViewCreator=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
