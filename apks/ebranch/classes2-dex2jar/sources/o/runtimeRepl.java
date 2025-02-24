package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:o/runtimeRepl.class */
final class runtimeRepl {
    private static final List<runtimeRepl> a = new ArrayList();
    store b;
    runtimeRepl d;
    Object e;

    private runtimeRepl(Object obj, store store) {
        this.e = obj;
        this.b = store;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static runtimeRepl c(store store, Object obj) {
        List<runtimeRepl> list = a;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new runtimeRepl(obj, store);
            }
            runtimeRepl remove = list.remove(size - 1);
            remove.e = obj;
            remove.b = store;
            remove.d = null;
            return remove;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(runtimeRepl runtimerepl) {
        runtimerepl.e = null;
        runtimerepl.b = null;
        runtimerepl.d = null;
        List<runtimeRepl> list = a;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(runtimerepl);
            }
        }
    }
}
