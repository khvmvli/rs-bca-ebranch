package o;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
/* loaded from: classes2-dex2jar.jar:o/showDataKartuTambahan2.class */
public final class showDataKartuTambahan2 implements ViewTreeObserver.OnPreDrawListener {
    showDataKartuTambahan1 c;
    final WeakReference<ImageView> d;
    final showKtpPage e;

    public showDataKartuTambahan2(showKtpPage showktppage, ImageView imageView, showDataKartuTambahan1 showdatakartutambahan1) {
        this.e = showktppage;
        this.d = new WeakReference<>(imageView);
        this.c = showdatakartutambahan1;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public final void d() {
        this.c = null;
        ImageView imageView = this.d.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ImageView imageView = this.d.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width <= 0 || height <= 0) {
            return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        showKtpPage showktppage = this.e;
        showktppage.e = false;
        showktppage.d.e(width, height);
        showktppage.a(imageView, this.c);
        return true;
    }
}
