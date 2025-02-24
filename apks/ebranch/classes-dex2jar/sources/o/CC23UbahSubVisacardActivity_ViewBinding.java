package o;

import com.bca.smartbranch.activity.DetailBerhasilORActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC23UbahSubVisacardActivity_ViewBinding.class */
public final class CC23UbahSubVisacardActivity_ViewBinding {
    private static final String[] d = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC23UbahSubVisacardActivity_ViewBinding$write.class */
    public static final class write implements LogRedirector.Logger {
        private final WeakReference<DetailBerhasilORActivity> b;

        private write(DetailBerhasilORActivity detailBerhasilORActivity) {
            this.b = new WeakReference<>(detailBerhasilORActivity);
        }

        /* synthetic */ write(DetailBerhasilORActivity detailBerhasilORActivity, byte b) {
            this(detailBerhasilORActivity);
        }

        public final void a() {
            DetailBerhasilORActivity detailBerhasilORActivity = this.b.get();
            if (detailBerhasilORActivity != null) {
                setOnHierarchyChangeListener.a(detailBerhasilORActivity, CC23UbahSubVisacardActivity_ViewBinding.d, 20);
            }
        }
    }

    public static void a(DetailBerhasilORActivity detailBerhasilORActivity) {
        String[] strArr = d;
        if (Predicate.c(detailBerhasilORActivity, strArr)) {
            detailBerhasilORActivity.u();
        } else if (Predicate.b(detailBerhasilORActivity, strArr)) {
            DetailBerhasilORActivity.c((LogRedirector.Logger) new write(detailBerhasilORActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBerhasilORActivity, strArr, 20);
        }
    }

    public static void a(DetailBerhasilORActivity detailBerhasilORActivity, int i, int[] iArr) {
        if (i == 20 && Predicate.c(iArr)) {
            detailBerhasilORActivity.u();
        }
    }
}
