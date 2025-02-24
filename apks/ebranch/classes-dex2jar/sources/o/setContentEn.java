package o;

import android.graphics.Bitmap;
import android.util.Log;
import io.realm.internal.Property;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import o.setCategoryEn;
/* loaded from: classes-dex2jar.jar:o/setContentEn.class */
public final class setContentEn implements setCategoryEn {
    private static final String a = "StandardGifDecoder";
    private Bitmap.Config b;
    private byte[] c;
    private int[] d;
    private final setCategoryEn.IconCompatParcelizer e;
    private int f;
    private Boolean g;
    private setCategoryCd h;
    private int i;
    private int j;
    private int[] k;
    private byte[] l;
    private final int[] m;
    private short[] n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f208o;
    private Bitmap p;
    private boolean q;
    private int r;
    private int s;
    private ByteBuffer t;
    private byte[] w;

    private setContentEn(setCategoryEn.IconCompatParcelizer iconCompatParcelizer) {
        this.m = new int[Property.TYPE_SET];
        this.b = Bitmap.Config.ARGB_8888;
        this.e = iconCompatParcelizer;
        this.h = new setCategoryCd();
    }

    public setContentEn(setCategoryEn.IconCompatParcelizer iconCompatParcelizer, setCategoryCd setcategorycd, ByteBuffer byteBuffer, int i) {
        this(iconCompatParcelizer);
        synchronized (this) {
            if (i > 0) {
                int highestOneBit = Integer.highestOneBit(i);
                this.s = 0;
                this.h = setcategorycd;
                this.f = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.t = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.t.order(ByteOrder.LITTLE_ENDIAN);
                this.q = false;
                Iterator<getContentOrder> it = setcategorycd.d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().e == 3) {
                            this.q = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.r = highestOneBit;
                this.j = setcategorycd.n / highestOneBit;
                this.i = setcategorycd.f / highestOneBit;
                this.f208o = this.e.b(setcategorycd.n * setcategorycd.f);
                this.k = this.e.e(this.j * this.i);
            } else {
                StringBuilder sb = new StringBuilder("Sample size must be >=0, not: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r9.h.c == r10.i) goto L_0x0081;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private android.graphics.Bitmap a(o.getContentOrder r10, o.getContentOrder r11) {
        /*
        // Method dump skipped, instructions count: 2595
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentEn.a(o.getContentOrder, o.getContentOrder):android.graphics.Bitmap");
    }

    private Bitmap g() {
        Boolean bool = this.g;
        Bitmap e = this.e.e(this.j, this.i, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.b);
        e.setHasAlpha(true);
        return e;
    }

    @Override // o.setCategoryEn
    public final void a() {
        this.f = (this.f + 1) % this.h.b;
    }

    @Override // o.setCategoryEn
    public final void a(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.b = config;
            return;
        }
        StringBuilder sb = new StringBuilder("Unsupported format: ");
        sb.append(config);
        sb.append(", must be one of ");
        sb.append(Bitmap.Config.ARGB_8888);
        sb.append(" or ");
        sb.append(Bitmap.Config.RGB_565);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // o.setCategoryEn
    public final int b() {
        return this.f;
    }

    @Override // o.setCategoryEn
    public final int c() {
        return this.t.limit() + this.f208o.length + (this.k.length << 2);
    }

    @Override // o.setCategoryEn
    public final void d() {
        this.h = null;
        byte[] bArr = this.f208o;
        if (bArr != null) {
            this.e.a(bArr);
        }
        int[] iArr = this.k;
        if (iArr != null) {
            this.e.e(iArr);
        }
        Bitmap bitmap = this.p;
        if (bitmap != null) {
            this.e.d(bitmap);
        }
        this.p = null;
        this.t = null;
        this.g = null;
        byte[] bArr2 = this.c;
        if (bArr2 != null) {
            this.e.a(bArr2);
        }
    }

    @Override // o.setCategoryEn
    public final ByteBuffer e() {
        return this.t;
    }

    @Override // o.setCategoryEn
    public final int f() {
        return this.h.b;
    }

    @Override // o.setCategoryEn
    public final Bitmap h() {
        synchronized (this) {
            if (this.h.b <= 0 || this.f < 0) {
                String str = a;
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder("Unable to decode frame, frameCount=");
                    sb.append(this.h.b);
                    sb.append(", framePointer=");
                    sb.append(this.f);
                    Log.d(str, sb.toString());
                }
                this.s = 1;
            }
            int i = this.s;
            if (i == 1 || i == 2) {
                String str2 = a;
                if (Log.isLoggable(str2, 3)) {
                    StringBuilder sb2 = new StringBuilder("Unable to decode frame, status=");
                    sb2.append(this.s);
                    Log.d(str2, sb2.toString());
                }
                return null;
            }
            this.s = 0;
            if (this.c == null) {
                this.c = this.e.b(255);
            }
            getContentOrder getcontentorder = this.h.d.get(this.f);
            int i2 = this.f - 1;
            getContentOrder getcontentorder2 = i2 >= 0 ? this.h.d.get(i2) : null;
            int[] iArr = getcontentorder.j != null ? getcontentorder.j : this.h.i;
            this.d = iArr;
            if (iArr == null) {
                String str3 = a;
                if (Log.isLoggable(str3, 3)) {
                    StringBuilder sb3 = new StringBuilder("No valid color table found for frame #");
                    sb3.append(this.f);
                    Log.d(str3, sb3.toString());
                }
                this.s = 1;
                return null;
            }
            if (getcontentorder.n) {
                int[] iArr2 = this.d;
                System.arraycopy(iArr2, 0, this.m, 0, iArr2.length);
                int[] iArr3 = this.m;
                this.d = iArr3;
                iArr3[getcontentorder.i] = 0;
                if (getcontentorder.e == 2 && this.f == 0) {
                    this.g = Boolean.TRUE;
                }
            }
            return a(getcontentorder, getcontentorder2);
        }
    }

    @Override // o.setCategoryEn
    public final void i() {
        this.f = -1;
    }

    @Override // o.setCategoryEn
    public final int j() {
        int i;
        if (this.h.b <= 0 || (i = this.f) < 0) {
            return 0;
        }
        return (i < 0 || i >= this.h.b) ? -1 : this.h.d.get(i).d;
    }
}
