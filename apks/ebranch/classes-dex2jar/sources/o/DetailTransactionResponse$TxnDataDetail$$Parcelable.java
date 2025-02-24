package o;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Set;
import o.DetailTransactionResponse;
/* loaded from: classes-dex2jar.jar:o/DetailTransactionResponse$TxnDataDetail$$Parcelable.class */
public final class DetailTransactionResponse$TxnDataDetail$$Parcelable implements setValueArray {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private int b;
    private long c;
    private final Set<Bitmap.Config> d;
    private int e;
    private int f;
    private final long g;
    private long h;
    private int i;
    private final DetailTransactionResponse.ValueTxnDataDetail j;
    private final read m;

    /* loaded from: classes-dex2jar.jar:o/DetailTransactionResponse$TxnDataDetail$$Parcelable$IconCompatParcelizer.class */
    static final class IconCompatParcelizer implements read {
        IconCompatParcelizer() {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/DetailTransactionResponse$TxnDataDetail$$Parcelable$read.class */
    interface read {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public DetailTransactionResponse$TxnDataDetail$$Parcelable(long r7) {
        /*
            r6 = this;
            o.getNoreffAnak r0 = new o.getNoreffAnak
            r1 = r0
            r1.<init>()
            r9 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            android.graphics.Bitmap$Config[] r2 = android.graphics.Bitmap.Config.values()
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            r10 = r0
            r0 = r10
            r1 = 0
            boolean r0 = r0.add(r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0033
            r0 = r10
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            boolean r0 = r0.remove(r1)
        L_0x0033:
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r10
            java.util.Set r3 = java.util.Collections.unmodifiableSet(r3)
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DetailTransactionResponse$TxnDataDetail$$Parcelable.<init>(long):void");
    }

    private DetailTransactionResponse$TxnDataDetail$$Parcelable(long j, DetailTransactionResponse.ValueTxnDataDetail valueTxnDataDetail, Set<Bitmap.Config> set) {
        this.g = j;
        this.h = j;
        this.j = valueTxnDataDetail;
        this.d = set;
        this.m = new IconCompatParcelizer();
    }

    private void a() {
        StringBuilder sb = new StringBuilder("Hits=");
        sb.append(this.e);
        sb.append(", misses=");
        sb.append(this.f);
        sb.append(", puts=");
        sb.append(this.i);
        sb.append(", evictions=");
        sb.append(this.b);
        sb.append(", currentSize=");
        sb.append(this.c);
        sb.append(", maxSize=");
        sb.append(this.h);
        sb.append("\nStrategy=");
        sb.append(this.j);
        Log.v("LruBitmapPool", sb.toString());
    }

    private void b() {
        e(this.h);
    }

    private Bitmap d(int i, int i2, Bitmap.Config config) {
        Bitmap d;
        synchronized (this) {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                StringBuilder sb = new StringBuilder("Cannot create a mutable Bitmap with config: ");
                sb.append(config);
                sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                throw new IllegalArgumentException(sb.toString());
            }
            d = this.j.d(i, i2, config != null ? config : a);
            if (d == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder("Missing bitmap=");
                    sb2.append(this.j.a(i, i2, config));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                this.f++;
            } else {
                this.e++;
                this.c -= (long) this.j.c(d);
                d.setHasAlpha(true);
                d.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Get bitmap=");
                sb3.append(this.j.a(i, i2, config));
                Log.v("LruBitmapPool", sb3.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                a();
            }
        }
        return d;
    }

    private void e(long j) {
        synchronized (this) {
            while (this.c > j) {
                Bitmap b = this.j.b();
                if (b == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        a();
                    }
                    this.c = 0;
                    return;
                }
                this.c -= (long) this.j.c(b);
                this.b++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    sb.append(this.j.e(b));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                b.recycle();
            }
        }
    }

    @Override // o.setValueArray
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap d = d(i, i2, config);
        Bitmap bitmap = d;
        if (d == null) {
            Bitmap.Config config2 = config;
            if (config == null) {
                config2 = a;
            }
            bitmap = Bitmap.createBitmap(i, i2, config2);
        }
        return bitmap;
    }

    @Override // o.setValueArray
    public final void a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder sb = new StringBuilder("trimMemory, level=");
            sb.append(i);
            Log.d("LruBitmapPool", sb.toString());
        }
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            e();
        } else if (i >= 20 || i == 15) {
            e(this.h / 2);
        }
    }

    @Override // o.setValueArray
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap;
        Bitmap d = d(i, i2, config);
        if (d != null) {
            d.eraseColor(0);
            bitmap = d;
        } else {
            Bitmap.Config config2 = config;
            if (config == null) {
                config2 = a;
            }
            bitmap = Bitmap.createBitmap(i, i2, config2);
        }
        return bitmap;
    }

    @Override // o.setValueArray
    public final void b(Bitmap bitmap) {
        synchronized (this) {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            } else if (!bitmap.isRecycled()) {
                if (bitmap.isMutable() && ((long) this.j.c(bitmap)) <= this.h && this.d.contains(bitmap.getConfig())) {
                    int c = this.j.c(bitmap);
                    this.j.d(bitmap);
                    this.i++;
                    this.c += (long) c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        sb.append(this.j.e(bitmap));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        a();
                    }
                    b();
                    return;
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                    sb2.append(this.j.e(bitmap));
                    sb2.append(", is mutable: ");
                    sb2.append(bitmap.isMutable());
                    sb2.append(", is allowed config: ");
                    sb2.append(this.d.contains(bitmap.getConfig()));
                    Log.v("LruBitmapPool", sb2.toString());
                }
                bitmap.recycle();
            } else {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
        }
    }

    @Override // o.setValueArray
    public final void e() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        e(0);
    }
}
