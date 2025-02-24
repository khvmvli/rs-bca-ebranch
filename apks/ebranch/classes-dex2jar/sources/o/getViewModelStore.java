package o;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
/* loaded from: classes-dex2jar.jar:o/getViewModelStore.class */
public abstract class getViewModelStore {
    @Deprecated
    public static Fragment c(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    public abstract boolean d();

    public abstract View e(int i);
}
