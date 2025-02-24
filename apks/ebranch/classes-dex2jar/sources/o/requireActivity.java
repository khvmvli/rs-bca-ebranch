package o;

import android.app.Application;
import android.content.Context;
/* loaded from: classes-dex2jar.jar:o/requireActivity.class */
public class requireActivity extends Application {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        attachBaseContext(context);
        requireFragmentManager.d(this);
    }
}
