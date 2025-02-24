package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:okhttp3/Route.class */
public final class Route {
    final Address address;
    final InetSocketAddress inetSocketAddress;
    final Proxy proxy;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (address == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.address = address;
            this.proxy = proxy;
            this.inetSocketAddress = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public final Address address() {
        return this.address;
    }

    public final boolean equals(@Nullable Object obj) {
        boolean z;
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (route.address.equals(this.address) && route.proxy.equals(this.proxy) && route.inetSocketAddress.equals(this.inetSocketAddress)) {
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    public final int hashCode() {
        return ((((this.address.hashCode() + 527) * 31) + this.proxy.hashCode()) * 31) + this.inetSocketAddress.hashCode();
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress socketAddress() {
        return this.inetSocketAddress;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Route{");
        sb.append(this.inetSocketAddress);
        sb.append("}");
        return sb.toString();
    }
}
