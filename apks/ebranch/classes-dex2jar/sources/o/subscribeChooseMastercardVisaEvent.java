package o;

import com.bca.smartbranch.activity.DetailTundaNotificationActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/subscribeChooseMastercardVisaEvent.class */
public final class subscribeChooseMastercardVisaEvent {
    private static final String[] a = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/subscribeChooseMastercardVisaEvent$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<DetailTundaNotificationActivity> e;

        private IconCompatParcelizer(DetailTundaNotificationActivity detailTundaNotificationActivity) {
            this.e = new WeakReference<>(detailTundaNotificationActivity);
        }

        /* synthetic */ IconCompatParcelizer(DetailTundaNotificationActivity detailTundaNotificationActivity, byte b) {
            this(detailTundaNotificationActivity);
        }

        public final void a() {
            DetailTundaNotificationActivity detailTundaNotificationActivity = this.e.get();
            if (detailTundaNotificationActivity != null) {
                setOnHierarchyChangeListener.a(detailTundaNotificationActivity, subscribeChooseMastercardVisaEvent.a, 34);
            }
        }
    }

    public static void d(DetailTundaNotificationActivity detailTundaNotificationActivity, int i, int[] iArr) {
        if (i == 34 && Predicate.c(iArr)) {
            detailTundaNotificationActivity.y();
        }
    }

    public static void e(DetailTundaNotificationActivity detailTundaNotificationActivity) {
        String[] strArr = a;
        if (Predicate.c(detailTundaNotificationActivity, strArr)) {
            detailTundaNotificationActivity.y();
        } else if (Predicate.b(detailTundaNotificationActivity, strArr)) {
            DetailTundaNotificationActivity.d((LogRedirector.Logger) new IconCompatParcelizer(detailTundaNotificationActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailTundaNotificationActivity, strArr, 34);
        }
    }
}
