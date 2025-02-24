package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/setTransaksiTunda.class */
public abstract class setTransaksiTunda {

    /* loaded from: classes-dex2jar.jar:o/setTransaksiTunda$RemoteActionCompatParcelizer.class */
    public static abstract class RemoteActionCompatParcelizer {
        protected abstract Map<String, String> a();

        public abstract RemoteActionCompatParcelizer b(long j);

        public abstract RemoteActionCompatParcelizer b(Integer num);

        protected abstract RemoteActionCompatParcelizer b(Map<String, String> map);

        public final RemoteActionCompatParcelizer c(String str, int i) {
            a().put(str, String.valueOf(i));
            return this;
        }

        public abstract RemoteActionCompatParcelizer c(setTxbType settxbtype);

        public abstract setTransaksiTunda c();

        public abstract RemoteActionCompatParcelizer d(long j);

        public final RemoteActionCompatParcelizer d(String str, long j) {
            a().put(str, String.valueOf(j));
            return this;
        }

        public abstract RemoteActionCompatParcelizer e(String str);

        public final RemoteActionCompatParcelizer e(String str, String str2) {
            a().put(str, str2);
            return this;
        }
    }

    public static RemoteActionCompatParcelizer j() {
        getTransaksiTunda$MediaBrowserCompat$CustomActionResultReceiver gettransaksitunda_mediabrowsercompat_customactionresultreceiver = new getTransaksiTunda$MediaBrowserCompat$CustomActionResultReceiver();
        gettransaksitunda_mediabrowsercompat_customactionresultreceiver.a = new HashMap();
        return gettransaksitunda_mediabrowsercompat_customactionresultreceiver;
    }

    public abstract long a();

    public abstract Integer b();

    public abstract String c();

    public final String c(String str) {
        String str2 = d().get(str);
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        return str3;
    }

    public final int d(String str) {
        String str2 = d().get(str);
        return str2 == null ? 0 : Integer.valueOf(str2).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Map<String, String> d();

    public final long e(String str) {
        String str2 = d().get(str);
        return str2 == null ? 0 : Long.valueOf(str2).longValue();
    }

    public abstract setTxbType e();

    public final RemoteActionCompatParcelizer g() {
        getTransaksiTunda$MediaBrowserCompat$CustomActionResultReceiver gettransaksitunda_mediabrowsercompat_customactionresultreceiver = new getTransaksiTunda$MediaBrowserCompat$CustomActionResultReceiver();
        String c = c();
        if (c != null) {
            gettransaksitunda_mediabrowsercompat_customactionresultreceiver.e = c;
            return gettransaksitunda_mediabrowsercompat_customactionresultreceiver.b(b()).c(e()).d(a()).b(h()).b(new HashMap(d()));
        }
        throw new NullPointerException("Null transportName");
    }

    public abstract long h();

    public final Map<String, String> i() {
        return Collections.unmodifiableMap(d());
    }
}
