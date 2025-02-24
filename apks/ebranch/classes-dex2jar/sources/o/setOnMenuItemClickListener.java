package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import o.setCustomSelectionActionModeCallback;
import o.setOnDismissListener;
import o.setSupportCompoundDrawablesTintMode;
/* loaded from: classes-dex2jar.jar:o/setOnMenuItemClickListener.class */
public class setOnMenuItemClickListener extends setTypeface implements setCustomSelectionActionModeCallback.read, View.OnClickListener, setSupportCompoundDrawablesTintMode.IconCompatParcelizer {
    private boolean a;
    RemoteActionCompatParcelizer b;
    setExpandActivityOverflowButtonDrawable c;
    setOnDismissListener.read e;
    private int f;
    private Drawable g;
    private boolean h;
    private int i;
    private setOrientation j;
    private int l;
    private CharSequence n;

    /* loaded from: classes-dex2jar.jar:o/setOnMenuItemClickListener$RemoteActionCompatParcelizer.class */
    public static abstract class RemoteActionCompatParcelizer {
        public abstract setSupportBackgroundTintMode c();
    }

    /* loaded from: classes-dex2jar.jar:o/setOnMenuItemClickListener$write.class */
    final class write extends setOrientation {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write() {
            super(r4);
            setOnMenuItemClickListener.this = r4;
        }

        @Override // o.setOrientation
        public final boolean c() {
            boolean z = false;
            if (setOnMenuItemClickListener.this.e != null) {
                z = false;
                if (setOnMenuItemClickListener.this.e.c(setOnMenuItemClickListener.this.c)) {
                    setSupportBackgroundTintMode d = d();
                    z = false;
                    if (d != null) {
                        z = false;
                        if (d.f()) {
                            z = true;
                        }
                    }
                }
            }
            return z;
        }

        @Override // o.setOrientation
        public final setSupportBackgroundTintMode d() {
            if (setOnMenuItemClickListener.this.b != null) {
                return setOnMenuItemClickListener.this.b.c();
            }
            return null;
        }
    }

    public setOnMenuItemClickListener(Context context) {
        this(context, null);
    }

    public setOnMenuItemClickListener(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public setOnMenuItemClickListener(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.a = b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.y, i, 0);
        this.f = obtainStyledAttributes.getDimensionPixelSize(setHasDecor$MediaBrowserCompat$MediaItem.u, 0);
        obtainStyledAttributes.recycle();
        this.i = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.l = -1;
        setSaveEnabled(false);
    }

    private boolean b() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r3.h != false) goto L_0x0042;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void g() {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnMenuItemClickListener.g():void");
    }

    @Override // o.setCustomSelectionActionModeCallback.read
    public final setExpandActivityOverflowButtonDrawable a() {
        return this.c;
    }

    @Override // o.setSupportCompoundDrawablesTintMode.IconCompatParcelizer
    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // o.setSupportCompoundDrawablesTintMode.IconCompatParcelizer
    public final boolean d() {
        boolean z = true;
        if (!(!TextUtils.isEmpty(getText())) || this.c.getIcon() != null) {
            z = false;
        }
        return z;
    }

    @Override // o.setCustomSelectionActionModeCallback.read
    public final void e(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        this.c = setexpandactivityoverflowbuttondrawable;
        setIcon(setexpandactivityoverflowbuttondrawable.getIcon());
        setTitle(e() ? setexpandactivityoverflowbuttondrawable.getTitleCondensed() : setexpandactivityoverflowbuttondrawable.getTitle());
        setId(setexpandactivityoverflowbuttondrawable.getItemId());
        setVisibility(setexpandactivityoverflowbuttondrawable.isVisible() ? 0 : 8);
        setEnabled(setexpandactivityoverflowbuttondrawable.isEnabled());
        if (setexpandactivityoverflowbuttondrawable.hasSubMenu() && this.j == null) {
            this.j = new write();
        }
    }

    @Override // o.setCustomSelectionActionModeCallback.read
    public final boolean e() {
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        setOnDismissListener.read read = this.e;
        if (read != null) {
            read.c(this.c);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.a = b();
        g();
    }

    @Override // o.setTypeface, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z = !TextUtils.isEmpty(getText());
        if (z && (i3 = this.l) >= 0) {
            setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f) : this.f;
        if (mode != 1073741824 && this.f > 0 && measuredWidth < min) {
            onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!z && this.g != null) {
            setPadding((getMeasuredWidth() - this.g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        setOrientation setorientation;
        if (!this.c.hasSubMenu() || (setorientation = this.j) == null || !setorientation.onTouch(this, motionEvent)) {
            return onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.h != z) {
            this.h = z;
            setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = this.c;
            if (setexpandactivityoverflowbuttondrawable != null) {
                setOnDismissListener setondismisslistener = setexpandactivityoverflowbuttondrawable.a;
                setondismisslistener.i = true;
                setondismisslistener.e(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.i;
            int i2 = intrinsicWidth;
            int i3 = intrinsicHeight;
            if (intrinsicWidth > i) {
                i3 = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                i2 = i;
            }
            if (i3 > i) {
                i2 = (int) (((float) i2) * (((float) i) / ((float) i3)));
            } else {
                i = i3;
            }
            drawable.setBounds(0, 0, i2, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        g();
    }

    public void setItemInvoker(setOnDismissListener.read read) {
        this.e = read;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.l = i;
        setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.b = remoteActionCompatParcelizer;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTitle(CharSequence charSequence) {
        this.n = charSequence;
        g();
    }
}
