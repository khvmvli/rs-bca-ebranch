package o;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;
/* loaded from: classes2-dex2jar.jar:o/BaseKonfirmasiDialog_ViewBinding.class */
public final class BaseKonfirmasiDialog_ViewBinding extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> c = new BaseKonfirmasiDialog_ViewBinding();
    private final WeakHashMap<Drawable, Integer> e = new WeakHashMap<>();

    private BaseKonfirmasiDialog_ViewBinding() {
        super(Integer.class, "drawableAlphaCompat");
    }

    @Override // android.util.Property
    public final /* synthetic */ Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
