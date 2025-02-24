package o;

import com.bca.smartbranch.activity.BranchMapActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/onChooseValueSimpanDraft.class */
public final class onChooseValueSimpanDraft {
    private static final String[] b = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/onChooseValueSimpanDraft$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<BranchMapActivity> d;

        private IconCompatParcelizer(BranchMapActivity branchMapActivity) {
            this.d = new WeakReference<>(branchMapActivity);
        }

        /* synthetic */ IconCompatParcelizer(BranchMapActivity branchMapActivity, byte b) {
            this(branchMapActivity);
        }

        public final void a() {
            BranchMapActivity branchMapActivity = this.d.get();
            if (branchMapActivity != null) {
                setOnHierarchyChangeListener.a(branchMapActivity, onChooseValueSimpanDraft.b, 7);
            }
        }
    }

    public static void a(BranchMapActivity branchMapActivity) {
        String[] strArr = b;
        if (Predicate.c(branchMapActivity, strArr)) {
            branchMapActivity.A();
        } else if (Predicate.b(branchMapActivity, strArr)) {
            BranchMapActivity.c((LogRedirector.Logger) new IconCompatParcelizer(branchMapActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(branchMapActivity, strArr, 7);
        }
    }

    public static void a(BranchMapActivity branchMapActivity, int i, int[] iArr) {
        if (i != 7) {
            return;
        }
        if (Predicate.c(iArr)) {
            branchMapActivity.A();
        } else {
            branchMapActivity.k();
        }
    }
}
