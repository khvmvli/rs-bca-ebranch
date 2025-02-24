package o;

import com.bca.smartbranch.activity.BranchMapROActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/BN7PengambilanUpdateReceiverActivity_ViewBinding.class */
public final class BN7PengambilanUpdateReceiverActivity_ViewBinding {
    private static final String[] d = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/BN7PengambilanUpdateReceiverActivity_ViewBinding$read.class */
    public static final class read implements LogRedirector.Logger {
        private final WeakReference<BranchMapROActivity> a;

        private read(BranchMapROActivity branchMapROActivity) {
            this.a = new WeakReference<>(branchMapROActivity);
        }

        /* synthetic */ read(BranchMapROActivity branchMapROActivity, byte b) {
            this(branchMapROActivity);
        }

        public final void a() {
            BranchMapROActivity branchMapROActivity = this.a.get();
            if (branchMapROActivity != null) {
                setOnHierarchyChangeListener.a(branchMapROActivity, BN7PengambilanUpdateReceiverActivity_ViewBinding.d, 8);
            }
        }
    }

    public static void a(BranchMapROActivity branchMapROActivity, int i, int[] iArr) {
        if (i != 8) {
            return;
        }
        if (Predicate.c(iArr)) {
            branchMapROActivity.D();
        } else {
            branchMapROActivity.k();
        }
    }

    public static void d(BranchMapROActivity branchMapROActivity) {
        String[] strArr = d;
        if (Predicate.c(branchMapROActivity, strArr)) {
            branchMapROActivity.D();
        } else if (Predicate.b(branchMapROActivity, strArr)) {
            BranchMapROActivity.d((LogRedirector.Logger) new read(branchMapROActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(branchMapROActivity, strArr, 8);
        }
    }
}
