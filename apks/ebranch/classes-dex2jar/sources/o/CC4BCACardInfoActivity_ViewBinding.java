package o;

import com.bca.smartbranch.activity.DetailTundaActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC4BCACardInfoActivity_ViewBinding.class */
public final class CC4BCACardInfoActivity_ViewBinding {
    private static final String[] e = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC4BCACardInfoActivity_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<DetailTundaActivity> e;

        private IconCompatParcelizer(DetailTundaActivity detailTundaActivity) {
            this.e = new WeakReference<>(detailTundaActivity);
        }

        /* synthetic */ IconCompatParcelizer(DetailTundaActivity detailTundaActivity, byte b) {
            this(detailTundaActivity);
        }

        public final void a() {
            DetailTundaActivity detailTundaActivity = this.e.get();
            if (detailTundaActivity != null) {
                setOnHierarchyChangeListener.a(detailTundaActivity, CC4BCACardInfoActivity_ViewBinding.e, 31);
            }
        }
    }

    public static void d(DetailTundaActivity detailTundaActivity) {
        String[] strArr = e;
        if (Predicate.c(detailTundaActivity, strArr)) {
            detailTundaActivity.v();
        } else if (Predicate.b(detailTundaActivity, strArr)) {
            DetailTundaActivity.b((LogRedirector.Logger) new IconCompatParcelizer(detailTundaActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailTundaActivity, strArr, 31);
        }
    }

    public static void e(DetailTundaActivity detailTundaActivity, int i, int[] iArr) {
        if (i == 31 && Predicate.c(iArr)) {
            detailTundaActivity.v();
        }
    }
}
