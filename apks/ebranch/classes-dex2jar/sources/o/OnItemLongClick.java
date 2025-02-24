package o;

import android.graphics.Path;
import java.util.List;
import o.BindFont;
import o.OnPageChange;
import o.R;
import o.setSnap;
/* loaded from: classes-dex2jar.jar:o/OnItemLongClick.class */
public final class OnItemLongClick implements OnItemClick, OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver {
    private boolean b;
    private final boolean c;
    private final setText d;
    private final String e;
    private final OnPageChange.Callback<?, Path> g;
    private final Path a = new Path();
    private BindFont.TypefaceStyle f = new BindFont.TypefaceStyle();

    public OnItemLongClick(setText settext, setPageColor setpagecolor, getTintedDrawable gettinteddrawable) {
        this.e = gettinteddrawable.b;
        this.c = gettinteddrawable.a;
        this.d = settext;
        R.drawable drawable = new R.drawable(gettinteddrawable.e.c);
        this.g = drawable;
        setpagecolor.e.add(drawable);
        drawable.d.add(this);
    }

    @Override // o.OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver
    public final void a() {
        this.b = false;
        this.d.invalidateSelf();
    }

    @Override // o.OnItemClick
    public final Path b() {
        if (this.b) {
            return this.a;
        }
        this.a.reset();
        if (this.c) {
            this.b = true;
            return this.a;
        }
        this.a.set(this.g.h());
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.f.a(this.a);
        this.b = true;
        return this.a;
    }

    @Override // o.style
    public final void b(List<style> list, List<style> list2) {
        for (int i = 0; i < list.size(); i++) {
            style style = list.get(i);
            if (style instanceof OnTouch) {
                OnTouch onTouch = (OnTouch) style;
                if (onTouch.i == setSnap.write.SIMULTANEOUSLY) {
                    this.f.d.add(onTouch);
                    onTouch.d.add(this);
                }
            }
        }
    }

    @Override // o.style
    public final String e() {
        return this.e;
    }
}
