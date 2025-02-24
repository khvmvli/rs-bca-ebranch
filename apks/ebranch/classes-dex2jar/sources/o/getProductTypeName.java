package o;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import o.DetailTransactionResponse;
/* loaded from: classes-dex2jar.jar:o/getProductTypeName.class */
public final class getProductTypeName implements DetailTransactionResponse {
    private final DetailTransactionResponse.TxnDataDetail<RemoteActionCompatParcelizer, Object> a;
    private final int b;
    private final Map<Class<?>, setReceiverAddress<?>> c;
    private final read d;
    private int e;
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getProductTypeName$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements getTotalPayment {
        int a;
        Class<?> b;
        private final read c;

        RemoteActionCompatParcelizer(read read) {
            this.c = read;
        }

        @Override // o.getTotalPayment
        public final void d() {
            read read = this.c;
            if (read.b.size() < 20) {
                read.b.offer(this);
            }
        }

        public final boolean equals(Object obj) {
            boolean z = false;
            if (obj instanceof RemoteActionCompatParcelizer) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
                z = false;
                if (this.a == remoteActionCompatParcelizer.a) {
                    z = false;
                    if (this.b == remoteActionCompatParcelizer.b) {
                        z = true;
                    }
                }
            }
            return z;
        }

        public final int hashCode() {
            int i = this.a;
            Class<?> cls = this.b;
            return (i * 31) + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key{size=");
            sb.append(this.a);
            sb.append("array=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getProductTypeName$read.class */
    static final class read extends DaftarTransferResponse$DaftarTransferOutput$$Parcelable<RemoteActionCompatParcelizer> {
        read() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.DaftarTransferResponse$DaftarTransferOutput$$Parcelable
        public final /* synthetic */ RemoteActionCompatParcelizer b() {
            return new RemoteActionCompatParcelizer(this);
        }
    }

    public getProductTypeName() {
        this.a = new DetailTransactionResponse.TxnDataDetail<>();
        this.d = new read();
        this.f = new HashMap();
        this.c = new HashMap();
        this.b = 4194304;
    }

    public getProductTypeName(int i) {
        this.a = new DetailTransactionResponse.TxnDataDetail<>();
        this.d = new read();
        this.f = new HashMap();
        this.c = new HashMap();
        this.b = i;
    }

    private <T> T a(RemoteActionCompatParcelizer remoteActionCompatParcelizer, Class<T> cls) {
        setReceiverAddress<T> c = c(cls);
        T t = (T) this.a.c(remoteActionCompatParcelizer);
        if (t != null) {
            this.e -= c.b((setReceiverAddress<T>) t) * c.a();
            d(c.b((setReceiverAddress<T>) t), cls);
        }
        T t2 = t;
        if (t == null) {
            if (Log.isLoggable(c.b(), 2)) {
                String b = c.b();
                StringBuilder sb = new StringBuilder("Allocated ");
                sb.append(remoteActionCompatParcelizer.a);
                sb.append(" bytes");
                Log.v(b, sb.toString());
            }
            t2 = c.b(remoteActionCompatParcelizer.a);
        }
        return t2;
    }

    private void a(int i) {
        while (this.e > i) {
            Object c = this.a.c();
            if (c != null) {
                setReceiverAddress c2 = c(c.getClass());
                this.e -= c2.b((setReceiverAddress) c) * c2.a();
                d(c2.b((setReceiverAddress) c), c.getClass());
                if (Log.isLoggable(c2.b(), 2)) {
                    String b = c2.b();
                    StringBuilder sb = new StringBuilder("evicted: ");
                    sb.append(c2.b((setReceiverAddress) c));
                    Log.v(b, sb.toString());
                }
            } else {
                throw new NullPointerException("Argument must not be null");
            }
        }
    }

    private <T> setReceiverAddress<T> c(Class<T> cls) {
        setReceiverAddress<?> setreceiveraddress = this.c.get(cls);
        setTxnDataDetailList settxndatadetaillist = (setReceiverAddress<T>) setreceiveraddress;
        if (setreceiveraddress == null) {
            if (cls.equals(int[].class)) {
                settxndatadetaillist = new setReceiverAddress<int[]>() { // from class: o.DetailTransactionResponse$$Parcelable
                    @Override // o.setReceiverAddress
                    public final int a() {
                        return 4;
                    }

                    @Override // o.setReceiverAddress
                    public final /* bridge */ /* synthetic */ int b(int[] iArr) {
                        return iArr.length;
                    }

                    @Override // o.setReceiverAddress
                    public final /* bridge */ /* synthetic */ int[] b(int i) {
                        return new int[i];
                    }

                    @Override // o.setReceiverAddress
                    public final String b() {
                        return "IntegerArrayPool";
                    }
                };
            } else if (cls.equals(byte[].class)) {
                settxndatadetaillist = new setTxnDataDetailList();
            } else {
                StringBuilder sb = new StringBuilder("No array pool found for: ");
                sb.append(cls.getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            }
            this.c.put(cls, settxndatadetaillist);
        }
        return settxndatadetaillist;
    }

    private NavigableMap<Integer, Integer> d(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f.get(cls);
        NavigableMap<Integer, Integer> navigableMap2 = navigableMap;
        if (navigableMap == null) {
            navigableMap2 = new TreeMap<>();
            this.f.put(cls, navigableMap2);
        }
        return navigableMap2;
    }

    private void d(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> d = d(cls);
        Integer num = (Integer) d.get(Integer.valueOf(i));
        if (num == null) {
            StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
            sb.append(i);
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        } else if (num.intValue() == 1) {
            d.remove(Integer.valueOf(i));
        } else {
            d.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.DetailTransactionResponse
    public final <T> T a(int i, Class<T> cls) {
        T t;
        synchronized (this) {
            read read2 = this.d;
            getTotalPayment gettotalpayment = (getTotalPayment) read2.b.poll();
            getTotalPayment gettotalpayment2 = gettotalpayment;
            if (gettotalpayment == null) {
                gettotalpayment2 = read2.b();
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) gettotalpayment2;
            remoteActionCompatParcelizer.a = 8;
            remoteActionCompatParcelizer.b = cls;
            t = (T) a(remoteActionCompatParcelizer, cls);
        }
        return t;
    }

    @Override // o.DetailTransactionResponse
    public final void a() {
        synchronized (this) {
            a(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[Catch: all -> 0x00d3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:7:0x001b, B:9:0x0026, B:16:0x0043, B:23:0x005c, B:26:0x007e, B:28:0x0085, B:29:0x0096, B:32:0x00b3, B:34:0x00ba, B:36:0x00c9), top: B:44:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[Catch: all -> 0x00d3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:7:0x001b, B:9:0x0026, B:16:0x0043, B:23:0x005c, B:26:0x007e, B:28:0x0085, B:29:0x0096, B:32:0x00b3, B:34:0x00ba, B:36:0x00c9), top: B:44:0x0002 }] */
    @Override // o.DetailTransactionResponse
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final <T> T b(int r5, java.lang.Class<T> r6) {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getProductTypeName.b(int, java.lang.Class):java.lang.Object");
    }

    @Override // o.DetailTransactionResponse
    public final void d(int i) {
        synchronized (this) {
            if (i >= 40) {
                synchronized (this) {
                    a(0);
                }
            } else if (i >= 20 || i == 15) {
                a(this.b / 2);
            }
        }
    }

    @Override // o.DetailTransactionResponse
    public final <T> void e(T t) {
        synchronized (this) {
            Class<?> cls = t.getClass();
            setReceiverAddress<T> c = c(cls);
            int b = c.b((setReceiverAddress<T>) t);
            int a = c.a() * b;
            int i = 1;
            if (a <= this.b / 2) {
                read read2 = this.d;
                getTotalPayment gettotalpayment = (getTotalPayment) read2.b.poll();
                getTotalPayment gettotalpayment2 = gettotalpayment;
                if (gettotalpayment == null) {
                    gettotalpayment2 = read2.b();
                }
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) gettotalpayment2;
                remoteActionCompatParcelizer.a = b;
                remoteActionCompatParcelizer.b = cls;
                this.a.a(remoteActionCompatParcelizer, t);
                NavigableMap<Integer, Integer> d = d(cls);
                Integer num = (Integer) d.get(Integer.valueOf(remoteActionCompatParcelizer.a));
                int i2 = remoteActionCompatParcelizer.a;
                if (num != null) {
                    i = 1 + num.intValue();
                }
                d.put(Integer.valueOf(i2), Integer.valueOf(i));
                this.e += a;
                a(this.b);
            }
        }
    }
}
