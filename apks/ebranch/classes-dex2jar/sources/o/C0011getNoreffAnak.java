package o;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import o.DetailTransactionResponse;
/* renamed from: o.getNoreffAnak */
/* loaded from: classes-dex2jar.jar:o/getNoreffAnak.class */
public final class C0011getNoreffAnak implements DetailTransactionResponse.ValueTxnDataDetail {
    private static final Bitmap.Config[] a;
    private static final Bitmap.Config[] b;
    private static final Bitmap.Config[] c;
    private static final Bitmap.Config[] d;
    private static final Bitmap.Config[] e;
    private final getNoreffAnak$MediaBrowserCompat$CustomActionResultReceiver i = new getNoreffAnak$MediaBrowserCompat$CustomActionResultReceiver();
    private final DetailTransactionResponse.TxnDataDetail<IconCompatParcelizer, Bitmap> j = new DetailTransactionResponse.TxnDataDetail<>();
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> g = new HashMap();

    /* renamed from: o.getNoreffAnak$3 */
    /* loaded from: classes-dex2jar.jar:o/getNoreffAnak$3.class */
    static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            b = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                b[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                b[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                b[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.getNoreffAnak$IconCompatParcelizer */
    /* loaded from: classes-dex2jar.jar:o/getNoreffAnak$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements getTotalPayment {
        int c;
        private final getNoreffAnak$MediaBrowserCompat$CustomActionResultReceiver d;
        Bitmap.Config e;

        public IconCompatParcelizer(getNoreffAnak$MediaBrowserCompat$CustomActionResultReceiver getnoreffanak_mediabrowsercompat_customactionresultreceiver) {
            this.d = getnoreffanak_mediabrowsercompat_customactionresultreceiver;
        }

        @Override // o.getTotalPayment
        public final void d() {
            getNoreffAnak$MediaBrowserCompat$CustomActionResultReceiver getnoreffanak_mediabrowsercompat_customactionresultreceiver = this.d;
            if (getnoreffanak_mediabrowsercompat_customactionresultreceiver.b.size() < 20) {
                getnoreffanak_mediabrowsercompat_customactionresultreceiver.b.offer(this);
            }
        }

        public final boolean equals(Object obj) {
            boolean z = false;
            if (obj instanceof IconCompatParcelizer) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                z = false;
                if (this.c == iconCompatParcelizer.c) {
                    z = false;
                    if (getTxnNotes2.a(this.e, iconCompatParcelizer.e)) {
                        z = true;
                    }
                }
            }
            return z;
        }

        public final int hashCode() {
            int i = this.c;
            Bitmap.Config config = this.e;
            return (i * 31) + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return C0011getNoreffAnak.e(this.c, this.e);
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        Bitmap.Config[] configArr2 = configArr;
        if (Build.VERSION.SDK_INT >= 26) {
            configArr2 = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr2[configArr2.length - 1] = Bitmap.Config.RGBA_F16;
        }
        d = configArr2;
        e = configArr2;
        c = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        a = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        b = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> b2 = b(bitmap.getConfig());
        Integer num2 = (Integer) b2.get(num);
        if (num2 == null) {
            StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
            sb.append(num);
            sb.append(", removed: ");
            sb.append(e(getTxnNotes2.a(bitmap), bitmap.getConfig()));
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        } else if (num2.intValue() == 1) {
            b2.remove(num);
        } else {
            b2.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> b(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.g.get(config);
        NavigableMap<Integer, Integer> navigableMap2 = navigableMap;
        if (navigableMap == null) {
            navigableMap2 = new TreeMap<>();
            this.g.put(config, navigableMap2);
        }
        return navigableMap2;
    }

    static String e(int i, Bitmap.Config config) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(i);
        sb.append("](");
        sb.append(config);
        sb.append(")");
        return sb.toString();
    }

    @Override // o.DetailTransactionResponse.ValueTxnDataDetail
    public final String a(int i, int i2, Bitmap.Config config) {
        return e(getTxnNotes2.b(i, i2, config), config);
    }

    @Override // o.DetailTransactionResponse.ValueTxnDataDetail
    public final Bitmap b() {
        Bitmap c2 = this.j.c();
        if (c2 != null) {
            a(Integer.valueOf(getTxnNotes2.a(c2)), c2);
        }
        return c2;
    }

    @Override // o.DetailTransactionResponse.ValueTxnDataDetail
    public final int c(Bitmap bitmap) {
        return getTxnNotes2.a(bitmap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0100, code lost:
        if (r8 != null) goto L_0x0113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0110, code lost:
        if (r0.equals(r8) == false) goto L_0x0113;
     */
    @Override // o.DetailTransactionResponse.ValueTxnDataDetail
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final android.graphics.Bitmap d(int r6, int r7, android.graphics.Bitmap.Config r8) {
        /*
        // Method dump skipped, instructions count: 427
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0011getNoreffAnak.d(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    @Override // o.DetailTransactionResponse.ValueTxnDataDetail
    public final void d(Bitmap bitmap) {
        int a2 = getTxnNotes2.a(bitmap);
        getNoreffAnak$MediaBrowserCompat$CustomActionResultReceiver getnoreffanak_mediabrowsercompat_customactionresultreceiver = this.i;
        Bitmap.Config config = bitmap.getConfig();
        getTotalPayment gettotalpayment = (getTotalPayment) getnoreffanak_mediabrowsercompat_customactionresultreceiver.b.poll();
        getTotalPayment gettotalpayment2 = gettotalpayment;
        if (gettotalpayment == null) {
            gettotalpayment2 = getnoreffanak_mediabrowsercompat_customactionresultreceiver.b();
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) gettotalpayment2;
        iconCompatParcelizer.c = a2;
        iconCompatParcelizer.e = config;
        this.j.a(iconCompatParcelizer, bitmap);
        NavigableMap<Integer, Integer> b2 = b(bitmap.getConfig());
        Integer num = (Integer) b2.get(Integer.valueOf(iconCompatParcelizer.c));
        int i = iconCompatParcelizer.c;
        int i2 = 1;
        if (num != null) {
            i2 = 1 + num.intValue();
        }
        b2.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // o.DetailTransactionResponse.ValueTxnDataDetail
    public final String e(Bitmap bitmap) {
        return e(getTxnNotes2.a(bitmap), bitmap.getConfig());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.j);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.g.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.g.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
