package o;

import com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC3UbahBCACardActivity_ViewBinding.class */
public final class CC3UbahBCACardActivity_ViewBinding {
    private static final String[] d = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC3UbahBCACardActivity_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<DetailTundaNotificationBookedActivity> d;

        private RemoteActionCompatParcelizer(DetailTundaNotificationBookedActivity detailTundaNotificationBookedActivity) {
            this.d = new WeakReference<>(detailTundaNotificationBookedActivity);
        }

        /* synthetic */ RemoteActionCompatParcelizer(DetailTundaNotificationBookedActivity detailTundaNotificationBookedActivity, byte b) {
            this(detailTundaNotificationBookedActivity);
        }

        public final void a() {
            DetailTundaNotificationBookedActivity detailTundaNotificationBookedActivity = this.d.get();
            if (detailTundaNotificationBookedActivity != null) {
                setOnHierarchyChangeListener.a(detailTundaNotificationBookedActivity, CC3UbahBCACardActivity_ViewBinding.d, 35);
            }
        }
    }

    public static void b(DetailTundaNotificationBookedActivity detailTundaNotificationBookedActivity) {
        String[] strArr = d;
        if (Predicate.c(detailTundaNotificationBookedActivity, strArr)) {
            detailTundaNotificationBookedActivity.v();
        } else if (Predicate.b(detailTundaNotificationBookedActivity, strArr)) {
            DetailTundaNotificationBookedActivity.b((LogRedirector.Logger) new RemoteActionCompatParcelizer(detailTundaNotificationBookedActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailTundaNotificationBookedActivity, strArr, 35);
        }
    }

    public static void b(DetailTundaNotificationBookedActivity detailTundaNotificationBookedActivity, int i, int[] iArr) {
        if (i == 35 && Predicate.c(iArr)) {
            detailTundaNotificationBookedActivity.v();
        }
    }
}
