package o;

import com.bca.smartbranch.activity.BN7PengambilanActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/onUpdateReceiver.class */
public final class onUpdateReceiver {
    private static final String[] e = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] b = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/onUpdateReceiver$read.class */
    public static final class read implements LogRedirector.Logger {
        private final WeakReference<BN7PengambilanActivity> c;

        private read(BN7PengambilanActivity bN7PengambilanActivity) {
            this.c = new WeakReference<>(bN7PengambilanActivity);
        }

        /* synthetic */ read(BN7PengambilanActivity bN7PengambilanActivity, byte b) {
            this(bN7PengambilanActivity);
        }

        public final void a() {
            BN7PengambilanActivity bN7PengambilanActivity = this.c.get();
            if (bN7PengambilanActivity != null) {
                setOnHierarchyChangeListener.a(bN7PengambilanActivity, onUpdateReceiver.e, 3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/onUpdateReceiver$write.class */
    public static final class write implements LogRedirector.Logger {
        private final WeakReference<BN7PengambilanActivity> a;

        private write(BN7PengambilanActivity bN7PengambilanActivity) {
            this.a = new WeakReference<>(bN7PengambilanActivity);
        }

        /* synthetic */ write(BN7PengambilanActivity bN7PengambilanActivity, byte b) {
            this(bN7PengambilanActivity);
        }

        public final void a() {
            BN7PengambilanActivity bN7PengambilanActivity = this.a.get();
            if (bN7PengambilanActivity != null) {
                setOnHierarchyChangeListener.a(bN7PengambilanActivity, onUpdateReceiver.b, 4);
            }
        }
    }

    public static void b(BN7PengambilanActivity bN7PengambilanActivity, int i, int[] iArr) {
        if (i != 3) {
            if (i == 4 && Predicate.c(iArr)) {
                bN7PengambilanActivity.y();
            }
        } else if (Predicate.c(iArr)) {
            bN7PengambilanActivity.t();
        }
    }

    public static void d(BN7PengambilanActivity bN7PengambilanActivity) {
        String[] strArr = e;
        if (Predicate.c(bN7PengambilanActivity, strArr)) {
            bN7PengambilanActivity.t();
        } else if (Predicate.b(bN7PengambilanActivity, strArr)) {
            BN7PengambilanActivity.a((LogRedirector.Logger) new read(bN7PengambilanActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(bN7PengambilanActivity, strArr, 3);
        }
    }

    public static void e(BN7PengambilanActivity bN7PengambilanActivity) {
        String[] strArr = b;
        if (Predicate.c(bN7PengambilanActivity, strArr)) {
            bN7PengambilanActivity.y();
        } else if (Predicate.b(bN7PengambilanActivity, strArr)) {
            BN7PengambilanActivity.a((LogRedirector.Logger) new write(bN7PengambilanActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(bN7PengambilanActivity, strArr, 4);
        }
    }
}
