package o;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/getStrokeColor.class */
public final class getStrokeColor {
    public View a;
    public final Map<String, Object> c = new HashMap();
    final ArrayList<setSlingshotDistance> e = new ArrayList<>();

    @Deprecated
    public getStrokeColor() {
    }

    public getStrokeColor(View view) {
        this.a = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getStrokeColor)) {
            return false;
        }
        getStrokeColor getstrokecolor = (getStrokeColor) obj;
        return this.a == getstrokecolor.a && this.c.equals(getstrokecolor.c);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionValues@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(":\n");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("    view = ");
        sb2.append(this.a);
        sb2.append("\n");
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append("    values:");
        String obj3 = sb3.toString();
        for (String str : this.c.keySet()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj3);
            sb4.append("    ");
            sb4.append(str);
            sb4.append(": ");
            sb4.append(this.c.get(str));
            sb4.append("\n");
            obj3 = sb4.toString();
        }
        return obj3;
    }
}
