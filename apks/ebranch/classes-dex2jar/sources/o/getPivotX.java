package o;

import android.view.View;
import android.view.WindowId;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/getPivotX.class */
public class getPivotX implements getScaleX {
    private final WindowId a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getPivotX(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof getPivotX) && ((getPivotX) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
