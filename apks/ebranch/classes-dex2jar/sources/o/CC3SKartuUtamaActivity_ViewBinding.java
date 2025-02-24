package o;

import com.bca.smartbranch.activity.DetailOpenTellerActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC3SKartuUtamaActivity_ViewBinding.class */
public final class CC3SKartuUtamaActivity_ViewBinding {
    private static final String[] e = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] d = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC3SKartuUtamaActivity_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<DetailOpenTellerActivity> e;

        private IconCompatParcelizer(DetailOpenTellerActivity detailOpenTellerActivity) {
            this.e = new WeakReference<>(detailOpenTellerActivity);
        }

        /* synthetic */ IconCompatParcelizer(DetailOpenTellerActivity detailOpenTellerActivity, byte b) {
            this(detailOpenTellerActivity);
        }

        public final void a() {
            DetailOpenTellerActivity detailOpenTellerActivity = this.e.get();
            if (detailOpenTellerActivity != null) {
                setOnHierarchyChangeListener.a(detailOpenTellerActivity, CC3SKartuUtamaActivity_ViewBinding.e, 29);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC3SKartuUtamaActivity_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<DetailOpenTellerActivity> d;

        private RemoteActionCompatParcelizer(DetailOpenTellerActivity detailOpenTellerActivity) {
            this.d = new WeakReference<>(detailOpenTellerActivity);
        }

        /* synthetic */ RemoteActionCompatParcelizer(DetailOpenTellerActivity detailOpenTellerActivity, byte b) {
            this(detailOpenTellerActivity);
        }

        public final void a() {
            DetailOpenTellerActivity detailOpenTellerActivity = this.d.get();
            if (detailOpenTellerActivity != null) {
                setOnHierarchyChangeListener.a(detailOpenTellerActivity, CC3SKartuUtamaActivity_ViewBinding.d, 30);
            }
        }
    }

    public static void a(DetailOpenTellerActivity detailOpenTellerActivity) {
        String[] strArr = e;
        if (Predicate.c(detailOpenTellerActivity, strArr)) {
            detailOpenTellerActivity.t();
        } else if (Predicate.b(detailOpenTellerActivity, strArr)) {
            DetailOpenTellerActivity.b((LogRedirector.Logger) new IconCompatParcelizer(detailOpenTellerActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailOpenTellerActivity, strArr, 29);
        }
    }

    public static void b(DetailOpenTellerActivity detailOpenTellerActivity) {
        String[] strArr = d;
        if (Predicate.c(detailOpenTellerActivity, strArr)) {
            detailOpenTellerActivity.v();
        } else if (Predicate.b(detailOpenTellerActivity, strArr)) {
            DetailOpenTellerActivity.b((LogRedirector.Logger) new RemoteActionCompatParcelizer(detailOpenTellerActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailOpenTellerActivity, strArr, 30);
        }
    }

    public static void c(DetailOpenTellerActivity detailOpenTellerActivity, int i, int[] iArr) {
        if (i != 29) {
            if (i == 30 && Predicate.c(iArr)) {
                detailOpenTellerActivity.v();
            }
        } else if (Predicate.c(iArr)) {
            detailOpenTellerActivity.t();
        }
    }
}
