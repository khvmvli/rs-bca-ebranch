package o;

import com.bca.smartbranch.activity.DetailTundaEChannelActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC4BCACardInfoActivity.class */
public final class CC4BCACardInfoActivity {
    private static final String[] b = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC4BCACardInfoActivity$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<DetailTundaEChannelActivity> e;

        private IconCompatParcelizer(DetailTundaEChannelActivity detailTundaEChannelActivity) {
            this.e = new WeakReference<>(detailTundaEChannelActivity);
        }

        /* synthetic */ IconCompatParcelizer(DetailTundaEChannelActivity detailTundaEChannelActivity, byte b) {
            this(detailTundaEChannelActivity);
        }

        public final void a() {
            DetailTundaEChannelActivity detailTundaEChannelActivity = this.e.get();
            if (detailTundaEChannelActivity != null) {
                setOnHierarchyChangeListener.a(detailTundaEChannelActivity, CC4BCACardInfoActivity.b, 32);
            }
        }
    }

    public static void a(DetailTundaEChannelActivity detailTundaEChannelActivity, int i, int[] iArr) {
        if (i == 32 && Predicate.c(iArr)) {
            detailTundaEChannelActivity.v();
        }
    }

    public static void e(DetailTundaEChannelActivity detailTundaEChannelActivity) {
        String[] strArr = b;
        if (Predicate.c(detailTundaEChannelActivity, strArr)) {
            detailTundaEChannelActivity.v();
        } else if (Predicate.b(detailTundaEChannelActivity, strArr)) {
            DetailTundaEChannelActivity.a((LogRedirector.Logger) new IconCompatParcelizer(detailTundaEChannelActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailTundaEChannelActivity, strArr, 32);
        }
    }
}
