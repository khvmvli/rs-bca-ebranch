package o;

import com.bca.smartbranch.activity.DetailBNBerhasilActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC21UbahSubBCACardActivity_ViewBinding.class */
public final class CC21UbahSubBCACardActivity_ViewBinding {
    private static final String[] a = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC21UbahSubBCACardActivity_ViewBinding$read.class */
    public static final class read implements LogRedirector.Logger {
        private final WeakReference<DetailBNBerhasilActivity> a;

        private read(DetailBNBerhasilActivity detailBNBerhasilActivity) {
            this.a = new WeakReference<>(detailBNBerhasilActivity);
        }

        /* synthetic */ read(DetailBNBerhasilActivity detailBNBerhasilActivity, byte b) {
            this(detailBNBerhasilActivity);
        }

        public final void a() {
            DetailBNBerhasilActivity detailBNBerhasilActivity = this.a.get();
            if (detailBNBerhasilActivity != null) {
                setOnHierarchyChangeListener.a(detailBNBerhasilActivity, CC21UbahSubBCACardActivity_ViewBinding.a, 11);
            }
        }
    }

    public static void c(DetailBNBerhasilActivity detailBNBerhasilActivity) {
        String[] strArr = a;
        if (Predicate.c(detailBNBerhasilActivity, strArr)) {
            detailBNBerhasilActivity.v();
        } else if (Predicate.b(detailBNBerhasilActivity, strArr)) {
            DetailBNBerhasilActivity.b((LogRedirector.Logger) new read(detailBNBerhasilActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBNBerhasilActivity, strArr, 11);
        }
    }

    public static void e(DetailBNBerhasilActivity detailBNBerhasilActivity, int i, int[] iArr) {
        if (i == 11 && Predicate.c(iArr)) {
            detailBNBerhasilActivity.v();
        }
    }
}
