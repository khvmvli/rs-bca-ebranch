package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import o.onChooseTanggalJatuhTempo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/showDataAlamat.class */
public abstract class showDataAlamat<T> {
    final int a;
    final Drawable b;
    final int c;
    final String d;
    boolean e;
    final Object f;
    final onChooseTanggalJatuhTempo g;
    final boolean h;
    final int i;
    final CC9FormKartuKreditFragment_ViewBinding j;
    boolean m;
    final WeakReference<T> n;

    /* loaded from: classes2-dex2jar.jar:o/showDataAlamat$IconCompatParcelizer.class */
    static final class IconCompatParcelizer<M> extends WeakReference<M> {
        final showDataAlamat e;

        public IconCompatParcelizer(showDataAlamat showdataalamat, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.e = showdataalamat;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public showDataAlamat(onChooseTanggalJatuhTempo onchoosetanggaljatuhtempo, T t, CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        this.g = onchoosetanggaljatuhtempo;
        this.j = cC9FormKartuKreditFragment_ViewBinding;
        this.n = t == null ? null : new IconCompatParcelizer(this, t, onchoosetanggaljatuhtempo.g);
        this.c = i;
        this.i = i2;
        this.h = z;
        this.a = i3;
        this.b = drawable;
        this.d = str;
        this.f = obj == null ? this : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(Bitmap bitmap, onChooseTanggalJatuhTempo.write write);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.e = true;
    }
}
