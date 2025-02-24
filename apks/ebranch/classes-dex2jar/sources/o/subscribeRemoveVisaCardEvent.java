package o;

import com.bca.smartbranch.activity.DetailTundaReservasiROActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/subscribeRemoveVisaCardEvent.class */
public final class subscribeRemoveVisaCardEvent {
    private static final String[] b = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/subscribeRemoveVisaCardEvent$read.class */
    public static final class read implements LogRedirector.Logger {
        private final WeakReference<DetailTundaReservasiROActivity> b;

        private read(DetailTundaReservasiROActivity detailTundaReservasiROActivity) {
            this.b = new WeakReference<>(detailTundaReservasiROActivity);
        }

        /* synthetic */ read(DetailTundaReservasiROActivity detailTundaReservasiROActivity, byte b) {
            this(detailTundaReservasiROActivity);
        }

        public final void a() {
            DetailTundaReservasiROActivity detailTundaReservasiROActivity = this.b.get();
            if (detailTundaReservasiROActivity != null) {
                setOnHierarchyChangeListener.a(detailTundaReservasiROActivity, subscribeRemoveVisaCardEvent.b, 36);
            }
        }
    }

    public static void b(DetailTundaReservasiROActivity detailTundaReservasiROActivity) {
        String[] strArr = b;
        if (Predicate.c(detailTundaReservasiROActivity, strArr)) {
            detailTundaReservasiROActivity.y();
        } else if (Predicate.b(detailTundaReservasiROActivity, strArr)) {
            DetailTundaReservasiROActivity.e((LogRedirector.Logger) new read(detailTundaReservasiROActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailTundaReservasiROActivity, strArr, 36);
        }
    }

    public static void e(DetailTundaReservasiROActivity detailTundaReservasiROActivity, int i, int[] iArr) {
        if (i == 36 && Predicate.c(iArr)) {
            detailTundaReservasiROActivity.y();
        }
    }
}
