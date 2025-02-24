package o;

import android.os.Build;
import android.view.DisplayCutout;
/* loaded from: classes-dex2jar.jar:o/onStart.class */
public final class onStart {
    private final Object a;

    private onStart(Object obj) {
        this.a = obj;
    }

    public static onStart b(Object obj) {
        return obj == null ? null : new onStart(obj);
    }

    public final int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.a).getSafeInsetTop();
        }
        return 0;
    }

    public final int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.a).getSafeInsetBottom();
        }
        return 0;
    }

    public final int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.a).getSafeInsetLeft();
        }
        return 0;
    }

    public final int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.a).getSafeInsetRight();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return onDetach.a(this.a, ((onStart) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        return obj == null ? 0 : obj.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayCutoutCompat{");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
