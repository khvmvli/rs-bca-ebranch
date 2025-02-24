package o;

import com.bca.smartbranch.activity.DetailBerhasilEChannelActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC22SubBCACardInfoActivity_ViewBinding.class */
public final class CC22SubBCACardInfoActivity_ViewBinding {
    private static final String[] e = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC22SubBCACardInfoActivity_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<DetailBerhasilEChannelActivity> d;

        private IconCompatParcelizer(DetailBerhasilEChannelActivity detailBerhasilEChannelActivity) {
            this.d = new WeakReference<>(detailBerhasilEChannelActivity);
        }

        /* synthetic */ IconCompatParcelizer(DetailBerhasilEChannelActivity detailBerhasilEChannelActivity, byte b) {
            this(detailBerhasilEChannelActivity);
        }

        public final void a() {
            DetailBerhasilEChannelActivity detailBerhasilEChannelActivity = this.d.get();
            if (detailBerhasilEChannelActivity != null) {
                setOnHierarchyChangeListener.a(detailBerhasilEChannelActivity, CC22SubBCACardInfoActivity_ViewBinding.e, 16);
            }
        }
    }

    public static void a(DetailBerhasilEChannelActivity detailBerhasilEChannelActivity) {
        String[] strArr = e;
        if (Predicate.c(detailBerhasilEChannelActivity, strArr)) {
            detailBerhasilEChannelActivity.y();
        } else if (Predicate.b(detailBerhasilEChannelActivity, strArr)) {
            DetailBerhasilEChannelActivity.e((LogRedirector.Logger) new IconCompatParcelizer(detailBerhasilEChannelActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBerhasilEChannelActivity, strArr, 16);
        }
    }

    public static void a(DetailBerhasilEChannelActivity detailBerhasilEChannelActivity, int i, int[] iArr) {
        if (i == 16 && Predicate.c(iArr)) {
            detailBerhasilEChannelActivity.y();
        }
    }
}
