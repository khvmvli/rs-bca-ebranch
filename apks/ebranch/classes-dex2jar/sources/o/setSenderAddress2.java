package o;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* loaded from: classes-dex2jar.jar:o/setSenderAddress2.class */
public final class setSenderAddress2 extends getSenderAddress2<Drawable> {
    public setSenderAddress2(ImageView imageView) {
        super(imageView);
    }

    @Override // o.getSenderAddress2
    protected final /* synthetic */ void b(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}
