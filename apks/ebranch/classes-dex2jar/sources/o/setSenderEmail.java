package o;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
/* loaded from: classes-dex2jar.jar:o/setSenderEmail.class */
public abstract class setSenderEmail {

    /* loaded from: classes-dex2jar.jar:o/setSenderEmail$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends setSenderEmail {
        final Spanned b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(Spanned spanned) {
            super((byte) 0);
            subscribeReservationRescheduleEvent.e(spanned, "");
            this.b = spanned;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setSenderEmail$write.class */
    public static final class write extends setSenderEmail {
        SpannableStringBuilder d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(SpannableStringBuilder spannableStringBuilder) {
            super((byte) 0);
            subscribeReservationRescheduleEvent.e(spannableStringBuilder, "");
            this.d = spannableStringBuilder;
        }
    }

    private setSenderEmail() {
    }

    public /* synthetic */ setSenderEmail(byte b) {
        this();
    }
}
