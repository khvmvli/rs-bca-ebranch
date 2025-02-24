package o;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
/* loaded from: classes-dex2jar.jar:o/setCurrCompanyPosition.class */
public final class setCurrCompanyPosition {
    final Map<String, Callable<? extends getCurrCompanyBusinessType>> b = new HashMap();

    public final void b(String str, Callable<? extends getCurrCompanyBusinessType> callable) {
        this.b.put(str, callable);
    }
}
