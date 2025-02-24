package o;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;
/* loaded from: classes-dex2jar.jar:o/getMinimumMaxLifecycleState.class */
public final class getMinimumMaxLifecycleState {
    private Object b;

    private getMinimumMaxLifecycleState(Object obj) {
        this.b = obj;
    }

    public static getMinimumMaxLifecycleState e(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? new getMinimumMaxLifecycleState(PointerIcon.getSystemIcon(context, i)) : new getMinimumMaxLifecycleState(null);
    }

    public final Object b() {
        return this.b;
    }
}
