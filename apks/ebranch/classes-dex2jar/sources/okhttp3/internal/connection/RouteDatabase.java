package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.Route;
/* loaded from: classes-dex2jar.jar:okhttp3/internal/connection/RouteDatabase.class */
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final void connected(Route route) {
        synchronized (this) {
            this.failedRoutes.remove(route);
        }
    }

    public final void failed(Route route) {
        synchronized (this) {
            this.failedRoutes.add(route);
        }
    }

    public final boolean shouldPostpone(Route route) {
        boolean contains;
        synchronized (this) {
            contains = this.failedRoutes.contains(route);
        }
        return contains;
    }
}
