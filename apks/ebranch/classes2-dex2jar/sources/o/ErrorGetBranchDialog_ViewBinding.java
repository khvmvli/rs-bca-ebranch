package o;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;
/* loaded from: classes2-dex2jar.jar:o/ErrorGetBranchDialog_ViewBinding.class */
abstract class ErrorGetBranchDialog_ViewBinding<S> extends Fragment {
    protected final LinkedHashSet<ErrorGetBranchDialog<S>> l = new LinkedHashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(ErrorGetBranchDialog<S> errorGetBranchDialog) {
        return this.l.add(errorGetBranchDialog);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        this.l.clear();
    }
}
