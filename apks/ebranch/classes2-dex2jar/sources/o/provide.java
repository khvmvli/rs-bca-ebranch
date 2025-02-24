package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2-dex2jar.jar:o/provide.class */
public class provide implements Serializable {
    Map e = new HashMap();
    private Map d = new HashMap();
    List a = new ArrayList();
    private Map c = new HashMap();

    public final Stetho$BuilderBasedInitializer a(getInspectorModules getinspectormodules) {
        Map map = this.c;
        String str = getinspectormodules.e;
        String str2 = str;
        if (str == null) {
            str2 = getinspectormodules.a;
        }
        return (Stetho$BuilderBasedInitializer) map.get(str2);
    }

    public final boolean a(String str) {
        String d = Stetho$DefaultDumperPluginsBuilder.d(str);
        return this.e.containsKey(d) || this.d.containsKey(d);
    }

    public final getInspectorModules c(String str) {
        String d = Stetho$DefaultDumperPluginsBuilder.d(str);
        return this.e.containsKey(d) ? (getInspectorModules) this.e.get(d) : (getInspectorModules) this.d.get(d);
    }

    public final provide c(getInspectorModules getinspectormodules) {
        String str = getinspectormodules.e;
        String str2 = str;
        if (str == null) {
            str2 = getinspectormodules.a;
        }
        if (getinspectormodules.a != null) {
            this.d.put(getinspectormodules.a, getinspectormodules);
        }
        if (getinspectormodules.f) {
            if (this.a.contains(str2)) {
                List list = this.a;
                list.remove(list.indexOf(str2));
            }
            this.a.add(str2);
        }
        this.e.put(str2, getinspectormodules);
        return this;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[ Options: [ short ");
        stringBuffer.append(this.e.toString());
        stringBuffer.append(" ] [ long ");
        stringBuffer.append(this.d);
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }
}
