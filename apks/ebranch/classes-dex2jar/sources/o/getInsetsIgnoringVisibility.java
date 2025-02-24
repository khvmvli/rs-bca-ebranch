package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes-dex2jar.jar:o/getInsetsIgnoringVisibility.class */
public final class getInsetsIgnoringVisibility implements Iterable<Intent> {
    public final ArrayList<Intent> a = new ArrayList<>();
    public final Context c;

    /* loaded from: classes-dex2jar.jar:o/getInsetsIgnoringVisibility$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        Intent j();
    }

    public getInsetsIgnoringVisibility(Context context) {
        this.c = context;
    }

    public final getInsetsIgnoringVisibility d(ComponentName componentName) {
        int size = this.a.size();
        try {
            Intent e = setStatusBarBackgroundResource.e(this.c, componentName);
            while (e != null) {
                this.a.add(size, e);
                e = setStatusBarBackgroundResource.e(this.c, e.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.a.iterator();
    }
}
