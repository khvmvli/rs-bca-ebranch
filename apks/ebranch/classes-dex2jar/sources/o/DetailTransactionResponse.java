package o;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/DetailTransactionResponse.class */
public interface DetailTransactionResponse {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/DetailTransactionResponse$TxnDataDetail.class */
    public final class TxnDataDetail<K extends getTotalPayment, V> {
        private final RemoteActionCompatParcelizer<K, V> b = new RemoteActionCompatParcelizer<>();
        private final Map<K, RemoteActionCompatParcelizer<K, V>> c = new HashMap();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes-dex2jar.jar:o/DetailTransactionResponse$TxnDataDetail$RemoteActionCompatParcelizer.class */
        public static final class RemoteActionCompatParcelizer<K, V> {
            final K a;
            RemoteActionCompatParcelizer<K, V> b;
            List<V> d;
            RemoteActionCompatParcelizer<K, V> e;

            RemoteActionCompatParcelizer() {
                this(null);
            }

            RemoteActionCompatParcelizer(K k) {
                this.e = this;
                this.b = this;
                this.a = k;
            }
        }

        public final void a(K k, V v) {
            RemoteActionCompatParcelizer<K, V> remoteActionCompatParcelizer;
            RemoteActionCompatParcelizer<K, V> remoteActionCompatParcelizer2 = this.c.get(k);
            if (remoteActionCompatParcelizer2 == null) {
                RemoteActionCompatParcelizer<K, V> remoteActionCompatParcelizer3 = new RemoteActionCompatParcelizer<>(k);
                remoteActionCompatParcelizer3.e.b = remoteActionCompatParcelizer3.b;
                remoteActionCompatParcelizer3.b.e = remoteActionCompatParcelizer3.e;
                remoteActionCompatParcelizer3.e = this.b.e;
                remoteActionCompatParcelizer3.b = this.b;
                remoteActionCompatParcelizer3.b.e = remoteActionCompatParcelizer3;
                remoteActionCompatParcelizer3.e.b = remoteActionCompatParcelizer3;
                this.c.put(k, remoteActionCompatParcelizer3);
                remoteActionCompatParcelizer = remoteActionCompatParcelizer3;
            } else {
                k.d();
                remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
            }
            if (remoteActionCompatParcelizer.d == null) {
                remoteActionCompatParcelizer.d = new ArrayList();
            }
            remoteActionCompatParcelizer.d.add(v);
        }

        public final V c() {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.b.e;
            while (true) {
                V v = null;
                if (remoteActionCompatParcelizer.equals(this.b)) {
                    return null;
                }
                List<V> list = remoteActionCompatParcelizer.d;
                int size = list != null ? list.size() : 0;
                if (size > 0) {
                    v = remoteActionCompatParcelizer.d.remove(size - 1);
                }
                if (v != null) {
                    return v;
                }
                remoteActionCompatParcelizer.e.b = remoteActionCompatParcelizer.b;
                remoteActionCompatParcelizer.b.e = remoteActionCompatParcelizer.e;
                this.c.remove(remoteActionCompatParcelizer.a);
                ((getTotalPayment) remoteActionCompatParcelizer.a).d();
                remoteActionCompatParcelizer = remoteActionCompatParcelizer.e;
            }
        }

        public final V c(K k) {
            RemoteActionCompatParcelizer<K, V> remoteActionCompatParcelizer;
            RemoteActionCompatParcelizer<K, V> remoteActionCompatParcelizer2 = this.c.get(k);
            if (remoteActionCompatParcelizer2 == null) {
                RemoteActionCompatParcelizer<K, V> remoteActionCompatParcelizer3 = new RemoteActionCompatParcelizer<>(k);
                this.c.put(k, remoteActionCompatParcelizer3);
                remoteActionCompatParcelizer = remoteActionCompatParcelizer3;
            } else {
                k.d();
                remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
            }
            remoteActionCompatParcelizer.e.b = remoteActionCompatParcelizer.b;
            remoteActionCompatParcelizer.b.e = remoteActionCompatParcelizer.e;
            remoteActionCompatParcelizer.e = this.b;
            remoteActionCompatParcelizer.b = this.b.b;
            remoteActionCompatParcelizer.b.e = remoteActionCompatParcelizer;
            remoteActionCompatParcelizer.e.b = remoteActionCompatParcelizer;
            List<V> list = remoteActionCompatParcelizer.d;
            int size = list != null ? list.size() : 0;
            return size > 0 ? remoteActionCompatParcelizer.d.remove(size - 1) : null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.b.b;
            boolean z = false;
            while (!remoteActionCompatParcelizer.equals(this.b)) {
                sb.append('{');
                sb.append(remoteActionCompatParcelizer.a);
                sb.append(':');
                List<V> list = remoteActionCompatParcelizer.d;
                sb.append(list != null ? list.size() : 0);
                sb.append("}, ");
                remoteActionCompatParcelizer = remoteActionCompatParcelizer.b;
                z = true;
            }
            if (z) {
                sb.delete(sb.length() - 2, sb.length());
            }
            sb.append(" )");
            return sb.toString();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/DetailTransactionResponse$ValueTxnDataDetail.class */
    interface ValueTxnDataDetail {
        String a(int i, int i2, Bitmap.Config config);

        Bitmap b();

        int c(Bitmap bitmap);

        Bitmap d(int i, int i2, Bitmap.Config config);

        void d(Bitmap bitmap);

        String e(Bitmap bitmap);
    }

    /* loaded from: classes-dex2jar.jar:o/DetailTransactionResponse$ValueTxnSubDataDetail.class */
    public interface ValueTxnSubDataDetail {

        /* loaded from: classes-dex2jar.jar:o/DetailTransactionResponse$ValueTxnSubDataDetail$read.class */
        public interface read {
            void b(setIbanFlag<?> setibanflag);
        }

        setIbanFlag<?> a(setCode setcode);

        void a();

        void a(int i);

        void a(read read2);

        setIbanFlag<?> e(setCode setcode, setIbanFlag<?> setibanflag);
    }

    <T> T a(int i, Class<T> cls);

    void a();

    <T> T b(int i, Class<T> cls);

    void d(int i);

    <T> void e(T t);
}
