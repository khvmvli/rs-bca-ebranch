package o;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
/* loaded from: classes2-dex2jar.jar:o/FiturSignUpDialog.class */
public class FiturSignUpDialog extends setOnStartEnterTransitionListener implements setCustomSelectionActionModeCallback {
    public FiturSignUpDialog(Context context) {
        this(context, null);
    }

    public FiturSignUpDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FiturSignUpDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    public final void c(setOnDismissListener setondismisslistener) {
    }
}
