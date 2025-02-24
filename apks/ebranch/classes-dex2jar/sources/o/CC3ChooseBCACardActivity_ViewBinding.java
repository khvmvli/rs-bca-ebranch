package o;

import com.bca.smartbranch.activity.DetailFailedTarikanActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC3ChooseBCACardActivity_ViewBinding.class */
public final class CC3ChooseBCACardActivity_ViewBinding {
    private static final String[] e = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC3ChooseBCACardActivity_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<DetailFailedTarikanActivity> a;

        private IconCompatParcelizer(DetailFailedTarikanActivity detailFailedTarikanActivity) {
            this.a = new WeakReference<>(detailFailedTarikanActivity);
        }

        /* synthetic */ IconCompatParcelizer(DetailFailedTarikanActivity detailFailedTarikanActivity, byte b) {
            this(detailFailedTarikanActivity);
        }

        public final void a() {
            DetailFailedTarikanActivity detailFailedTarikanActivity = this.a.get();
            if (detailFailedTarikanActivity != null) {
                setOnHierarchyChangeListener.a(detailFailedTarikanActivity, CC3ChooseBCACardActivity_ViewBinding.e, 28);
            }
        }
    }

    public static void b(DetailFailedTarikanActivity detailFailedTarikanActivity) {
        String[] strArr = e;
        if (Predicate.c(detailFailedTarikanActivity, strArr)) {
            detailFailedTarikanActivity.t();
        } else if (Predicate.b(detailFailedTarikanActivity, strArr)) {
            DetailFailedTarikanActivity.a((LogRedirector.Logger) new IconCompatParcelizer(detailFailedTarikanActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailFailedTarikanActivity, strArr, 28);
        }
    }

    public static void b(DetailFailedTarikanActivity detailFailedTarikanActivity, int i, int[] iArr) {
        if (i == 28 && Predicate.c(iArr)) {
            detailFailedTarikanActivity.t();
        }
    }
}
