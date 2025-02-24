package o;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;
/* loaded from: classes2-dex2jar.jar:o/showDataKartuTambahan3.class */
public final class showDataKartuTambahan3 implements showDataDiri {
    private int a;
    private int c;
    private final int d;
    final LinkedHashMap<String, Bitmap> e;
    private int f;
    private int i;
    private int j;

    private showDataKartuTambahan3(int i) {
        if (i > 0) {
            this.d = i;
            this.e = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("Max size must be positive.");
    }

    public showDataKartuTambahan3(Context context) {
        this(OR1DataPengirimFragment.d(context));
    }

    @Override // o.showDataDiri
    public final int a() {
        int i;
        synchronized (this) {
            i = this.i;
        }
        return i;
    }

    @Override // o.showDataDiri
    public final int c() {
        int i;
        synchronized (this) {
            i = this.d;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
        return;
     */
    @Override // o.showDataDiri
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void d(java.lang.String r5, android.graphics.Bitmap r6) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: o.showDataKartuTambahan3.d(java.lang.String, android.graphics.Bitmap):void");
    }

    @Override // o.showDataDiri
    public final Bitmap e(String str) {
        if (str != null) {
            synchronized (this) {
                Bitmap bitmap = this.e.get(str);
                if (bitmap != null) {
                    this.c++;
                    return bitmap;
                }
                this.j++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }
}
