package o;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getFloat.class */
public final class getFloat {
    public boolean c;
    public PointF d;
    public final List<Unbinder$$ExternalSyntheticLambda0> e;

    public getFloat() {
        this.e = new ArrayList();
    }

    public getFloat(PointF pointF, boolean z, List<Unbinder$$ExternalSyntheticLambda0> list) {
        this.d = pointF;
        this.c = z;
        this.e = new ArrayList(list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.e.size());
        sb.append("closed=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
