package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import o.setCustomSelectionActionModeCallback;
import o.setDropDownBackgroundResource;
/* loaded from: classes-dex2jar.jar:o/setExpandedActionViewsExclusive.class */
public abstract class setExpandedActionViewsExclusive implements setDropDownBackgroundResource {
    protected LayoutInflater a;
    public setDropDownBackgroundResource.IconCompatParcelizer b;
    public setOnDismissListener c;
    protected Context d;
    public int e;
    protected LayoutInflater f;
    private int g;
    public setCustomSelectionActionModeCallback h;
    private int i;
    protected Context j;

    public setExpandedActionViewsExclusive(Context context, int i, int i2) {
        this.j = context;
        this.f = LayoutInflater.from(context);
        this.g = i;
        this.i = i2;
    }

    @Override // o.setDropDownBackgroundResource
    public final int a() {
        return this.e;
    }

    public setCustomSelectionActionModeCallback a(ViewGroup viewGroup) {
        if (this.h == null) {
            setCustomSelectionActionModeCallback setcustomselectionactionmodecallback = (setCustomSelectionActionModeCallback) this.f.inflate(this.g, viewGroup, false);
            this.h = setcustomselectionactionmodecallback;
            setcustomselectionactionmodecallback.c(this.c);
            c(true);
        }
        return this.h;
    }

    @Override // o.setDropDownBackgroundResource
    public final boolean a(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return false;
    }

    @Override // o.setDropDownBackgroundResource
    public boolean a(setTextAppearance settextappearance) {
        setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer = this.b;
        if (iconCompatParcelizer == null) {
            return false;
        }
        setOnDismissListener setondismisslistener = settextappearance;
        if (settextappearance == null) {
            setondismisslistener = this.c;
        }
        return iconCompatParcelizer.a(setondismisslistener);
    }

    public abstract void b(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable, setCustomSelectionActionModeCallback.read read);

    @Override // o.setDropDownBackgroundResource
    public final void c(setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer) {
        this.b = iconCompatParcelizer;
    }

    @Override // o.setDropDownBackgroundResource
    public void c(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.h;
        if (viewGroup != null) {
            setOnDismissListener setondismisslistener = this.c;
            int i = 0;
            if (setondismisslistener != null) {
                setondismisslistener.a();
                ArrayList<setExpandActivityOverflowButtonDrawable> e = this.c.e();
                int size = e.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = e.get(i2);
                    i = i;
                    if (e(setexpandactivityoverflowbuttondrawable)) {
                        View childAt = viewGroup.getChildAt(i);
                        setExpandActivityOverflowButtonDrawable a = childAt instanceof setCustomSelectionActionModeCallback.read ? ((setCustomSelectionActionModeCallback.read) childAt).a() : null;
                        View d = d(setexpandactivityoverflowbuttondrawable, childAt, viewGroup);
                        if (setexpandactivityoverflowbuttondrawable != a) {
                            d.setPressed(false);
                            d.jumpDrawablesToCurrentState();
                        }
                        if (d != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) d.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(d);
                            }
                            ((ViewGroup) this.h).addView(d, i);
                        }
                        i++;
                    }
                }
            }
            while (i < viewGroup.getChildCount()) {
                if (!c(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    public boolean c(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // o.setDropDownBackgroundResource
    public final boolean c(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return false;
    }

    public View d(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable, View view, ViewGroup viewGroup) {
        setCustomSelectionActionModeCallback.read read = view instanceof setCustomSelectionActionModeCallback.read ? (setCustomSelectionActionModeCallback.read) view : (setCustomSelectionActionModeCallback.read) this.f.inflate(this.i, viewGroup, false);
        b(setexpandactivityoverflowbuttondrawable, read);
        return (View) read;
    }

    @Override // o.setDropDownBackgroundResource
    public void e(Context context, setOnDismissListener setondismisslistener) {
        this.d = context;
        this.a = LayoutInflater.from(context);
        this.c = setondismisslistener;
    }

    @Override // o.setDropDownBackgroundResource
    public void e(setOnDismissListener setondismisslistener, boolean z) {
        setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer = this.b;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.a(setondismisslistener, z);
        }
    }

    @Override // o.setDropDownBackgroundResource
    public boolean e() {
        return false;
    }

    public boolean e(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return true;
    }
}
