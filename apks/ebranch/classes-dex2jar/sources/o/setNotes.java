package o;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.util.LongSparseArray;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setNotes.class */
public final class setNotes {
    final Context b;
    public final NotificationManager d;
    private final onChooseValueSumberPenghasilan i;
    private final onChooseValueSumberPenghasilan j;
    public static final RemoteActionCompatParcelizer c = new RemoteActionCompatParcelizer((byte) 0);
    private static final LongSparseArray<HttpTransaction> a = new LongSparseArray<>();
    private static final HashSet<Long> e = new HashSet<>();

    /* loaded from: classes-dex2jar.jar:o/setNotes$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<PendingIntent> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer() {
            super(0);
            setNotes.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ PendingIntent invoke() {
            return PendingIntent.getActivity(setNotes.this.b, 1138, setFlag_iban.b(setNotes.this.b), setNotes.d(setNotes.this) | 134217728);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setNotes$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setNotes$read.class */
    public static final class read extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<PendingIntent> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read() {
            super(0);
            setNotes.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ PendingIntent invoke() {
            return PendingIntent.getActivity(setNotes.this.b, 3546, setFlag_iban.e(setNotes.this.b, 2), setNotes.d(setNotes.this) | 134217728);
        }
    }

    public setNotes(Context context) {
        subscribeReservationRescheduleEvent.e(context, "");
        this.b = context;
        Object systemService = context.getSystemService("notification");
        if (systemService != null) {
            NotificationManager notificationManager = (NotificationManager) systemService;
            this.d = notificationManager;
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
            subscribeReservationRescheduleEvent.e(iconCompatParcelizer, "");
            this.i = new Page6KLFragment_ViewBinding(iconCompatParcelizer, null, 2);
            read read2 = new read();
            subscribeReservationRescheduleEvent.e(read2, "");
            this.j = new Page6KLFragment_ViewBinding(read2, null, 2);
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel[] notificationChannelArr = {new NotificationChannel("chucker_transactions", context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.r), 2), new NotificationChannel("chucker_errors", context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.S), 2)};
                subscribeReservationRescheduleEvent.e(notificationChannelArr, "");
                subscribeReservationRescheduleEvent.e(notificationChannelArr, "");
                List<NotificationChannel> asList = Arrays.asList(notificationChannelArr);
                subscribeReservationRescheduleEvent.d(asList, "");
                notificationManager.createNotificationChannels(asList);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    public static final /* synthetic */ HashSet b() {
        return e;
    }

    public static final /* synthetic */ int d(setNotes setnotes) {
        return Build.VERSION.SDK_INT >= 23 ? 67108864 : 0;
    }

    public static final /* synthetic */ LongSparseArray d() {
        return a;
    }
}
