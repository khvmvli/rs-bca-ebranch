package o;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes2-dex2jar.jar:o/Stetho$BuilderBasedInitializer.class */
public final class Stetho$BuilderBasedInitializer implements Serializable {
    public String a;
    boolean d;
    private Map e = new HashMap();

    @Override // java.lang.Object
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            getInspectorModules getinspectormodules = (getInspectorModules) it.next();
            if (getinspectormodules.e != null) {
                stringBuffer.append("-");
                stringBuffer.append(getinspectormodules.e);
            } else {
                stringBuffer.append("--");
                stringBuffer.append(getinspectormodules.a);
            }
            stringBuffer.append(" ");
            stringBuffer.append(getinspectormodules.b);
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
