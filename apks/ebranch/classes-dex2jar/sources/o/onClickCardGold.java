package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/onClickCardGold.class */
public final class onClickCardGold {
    public static final MediaBrowserCompat.CustomActionResultReceiver a = new MediaBrowserCompat.CustomActionResultReceiver((byte) 0);
    public final View b;
    public final AttributeSet c;
    final String d;
    public final Context e;

    /* loaded from: classes-dex2jar.jar:o/onClickCardGold$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        public AttributeSet a;
        public Context b;
        public View c;
        public String d;

        public IconCompatParcelizer() {
        }

        public IconCompatParcelizer(onClickCardGold onclickcardgold) {
            subscribeReservationRescheduleEvent.b((Object) onclickcardgold, "");
            this.c = onclickcardgold.b;
            this.d = onclickcardgold.d;
            this.b = onclickcardgold.e;
            this.a = onclickcardgold.c;
        }
    }

    public onClickCardGold(View view, String str, Context context, AttributeSet attributeSet) {
        subscribeReservationRescheduleEvent.b((Object) str, "");
        subscribeReservationRescheduleEvent.b((Object) context, "");
        this.b = view;
        this.d = str;
        this.e = context;
        this.c = attributeSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onClickCardGold)) {
            return false;
        }
        onClickCardGold onclickcardgold = (onClickCardGold) obj;
        return subscribeReservationRescheduleEvent.b(this.b, onclickcardgold.b) && subscribeReservationRescheduleEvent.b((Object) this.d, (Object) onclickcardgold.d) && subscribeReservationRescheduleEvent.b(this.e, onclickcardgold.e) && subscribeReservationRescheduleEvent.b(this.c, onclickcardgold.c);
    }

    public final int hashCode() {
        View view = this.b;
        int i = 0;
        int hashCode = view != null ? view.hashCode() : 0;
        String str = this.d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        Context context = this.e;
        int hashCode3 = context != null ? context.hashCode() : 0;
        AttributeSet attributeSet = this.c;
        if (attributeSet != null) {
            i = attributeSet.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InflateResult(view=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", context=");
        sb.append(this.e);
        sb.append(", attrs=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
