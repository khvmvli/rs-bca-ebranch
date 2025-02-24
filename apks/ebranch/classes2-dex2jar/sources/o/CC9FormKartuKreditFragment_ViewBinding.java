package o;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.onChooseTanggalJatuhTempo;
/* loaded from: classes2-dex2jar.jar:o/CC9FormKartuKreditFragment_ViewBinding.class */
public final class CC9FormKartuKreditFragment_ViewBinding {
    private static final long p = TimeUnit.SECONDS.toNanos(5);
    int a;
    public final Bitmap.Config b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final boolean g;
    int h;
    public final onChooseTanggalJatuhTempo.read i;
    public final int j;
    public final float k;
    public final String l;
    long m;
    public final float n;

    /* renamed from: o */
    public final int f18o;
    public final Uri q;
    public final List<onChooseJenisWarkat> s;
    public final int t;

    /* loaded from: classes2-dex2jar.jar:o/CC9FormKartuKreditFragment_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        boolean a;
        boolean b;
        boolean c;
        Bitmap.Config d;
        boolean e;
        float f;
        float g;
        int h;
        float i;
        onChooseTanggalJatuhTempo.read j;
        int k;
        String l;
        int m;
        List<onChooseJenisWarkat> n;

        /* renamed from: o */
        Uri f19o;

        public IconCompatParcelizer(Uri uri, int i, Bitmap.Config config) {
            this.f19o = uri;
            this.h = i;
            this.d = config;
        }

        public final IconCompatParcelizer e(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.m = i;
                this.k = i2;
                return this;
            }
        }
    }

    private CC9FormKartuKreditFragment_ViewBinding(Uri uri, int i, String str, List<onChooseJenisWarkat> list, int i2, int i3, boolean z, boolean z2, boolean z3, float f, float f2, float f3, boolean z4, Bitmap.Config config, onChooseTanggalJatuhTempo.read read) {
        this.q = uri;
        this.j = i;
        this.l = str;
        if (list == null) {
            this.s = null;
        } else {
            this.s = Collections.unmodifiableList(list);
        }
        this.t = i2;
        this.f18o = i3;
        this.d = z;
        this.c = z2;
        this.g = z3;
        this.f = f;
        this.k = f2;
        this.n = f3;
        this.e = z4;
        this.b = config;
        this.i = read;
    }

    public /* synthetic */ CC9FormKartuKreditFragment_ViewBinding(Uri uri, int i, String str, List list, int i2, int i3, boolean z, boolean z2, boolean z3, float f, float f2, float f3, boolean z4, Bitmap.Config config, onChooseTanggalJatuhTempo.read read, byte b) {
        this(uri, i, str, list, i2, i3, z, z2, z3, f, f2, f3, z4, config, read);
    }

    public final String b() {
        long nanoTime = System.nanoTime() - this.m;
        if (nanoTime > p) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder("[R");
            sb2.append(this.a);
            sb2.append(']');
            sb.append(sb2.toString());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
            return sb.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder("[R");
        sb4.append(this.a);
        sb4.append(']');
        sb3.append(sb4.toString());
        sb3.append('+');
        sb3.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
        sb3.append("ms");
        return sb3.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.j;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.q);
        }
        List<onChooseJenisWarkat> list = this.s;
        if (list != null && !list.isEmpty()) {
            for (onChooseJenisWarkat onchoosejeniswarkat : this.s) {
                sb.append(' ');
                sb.append(onchoosejeniswarkat.a());
            }
        }
        if (this.l != null) {
            sb.append(" stableKey(");
            sb.append(this.l);
            sb.append(')');
        }
        if (this.t > 0) {
            sb.append(" resize(");
            sb.append(this.t);
            sb.append(',');
            sb.append(this.f18o);
            sb.append(')');
        }
        if (this.d) {
            sb.append(" centerCrop");
        }
        if (this.c) {
            sb.append(" centerInside");
        }
        if (this.f != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f);
            if (this.e) {
                sb.append(" @ ");
                sb.append(this.k);
                sb.append(',');
                sb.append(this.n);
            }
            sb.append(')');
        }
        if (this.b != null) {
            sb.append(' ');
            sb.append(this.b);
        }
        sb.append('}');
        return sb.toString();
    }
}
