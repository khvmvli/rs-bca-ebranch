package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:o/Stetho$3.class */
public class Stetho$3 implements Serializable {
    public List b = new LinkedList();
    public List c = new ArrayList();

    public getInspectorModules e(String str) {
        String d = Stetho$DefaultDumperPluginsBuilder.d(str);
        for (getInspectorModules getinspectormodules : this.c) {
            if (d.equals(getinspectormodules.e)) {
                return getinspectormodules;
            }
            if (d.equals(getinspectormodules.a)) {
                return getinspectormodules;
            }
        }
        return null;
    }
}
