package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import o.onChooseTanggalJatuhTempo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/showDataPekerjaan.class */
public final class showDataPekerjaan extends showDataAlamat<ImageView> {

    /* renamed from: o  reason: collision with root package name */
    showDataKartuTambahan1 f95o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public showDataPekerjaan(onChooseTanggalJatuhTempo onchoosetanggaljatuhtempo, ImageView imageView, CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding, int i, int i2, int i3, Drawable drawable, String str, Object obj, showDataKartuTambahan1 showdatakartutambahan1, boolean z) {
        super(onchoosetanggaljatuhtempo, imageView, cC9FormKartuKreditFragment_ViewBinding, i, i2, i3, drawable, str, obj, z);
        this.f95o = showdatakartutambahan1;
    }

    @Override // o.showDataAlamat
    public final void c() {
        ImageView imageView = (ImageView) this.n.get();
        if (imageView != null) {
            if (this.a != 0) {
                imageView.setImageResource(this.a);
            } else if (this.b != null) {
                imageView.setImageDrawable(this.b);
            }
        }
    }

    @Override // o.showDataAlamat
    public final void d(Bitmap bitmap, onChooseTanggalJatuhTempo.write write) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.n.get();
            if (imageView != null) {
                onBackPressedEvent.b(imageView, this.g.a, bitmap, write, this.h, this.g.j);
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.showDataAlamat
    public final void e() {
        e();
        if (this.f95o != null) {
            this.f95o = null;
        }
    }
}
