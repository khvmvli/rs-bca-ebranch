package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
/* loaded from: classes-dex2jar.jar:o/setDividerDrawable.class */
public class setDividerDrawable extends FrameLayout {
    private TypedValue a;
    private TypedValue b;
    private RemoteActionCompatParcelizer c;
    private TypedValue d;
    private final Rect e;
    private TypedValue f;
    private TypedValue h;
    private TypedValue i;

    /* loaded from: classes-dex2jar.jar:o/setDividerDrawable$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void c();

        void d();
    }

    public setDividerDrawable(Context context) {
        this(context, null);
    }

    public setDividerDrawable(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public setDividerDrawable(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new Rect();
    }

    public TypedValue a() {
        if (this.d == null) {
            this.d = new TypedValue();
        }
        return this.d;
    }

    public TypedValue b() {
        if (this.a == null) {
            this.a = new TypedValue();
        }
        return this.a;
    }

    public TypedValue c() {
        if (this.h == null) {
            this.h = new TypedValue();
        }
        return this.h;
    }

    public TypedValue d() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue e() {
        if (this.b == null) {
            this.b = new TypedValue();
        }
        return this.b;
    }

    public TypedValue j() {
        if (this.i == null) {
            this.i = new TypedValue();
        }
        return this.i;
    }

    @Override // android.view.View, android.view.ViewGroup
    protected void onAttachedToWindow() {
        onAttachedToWindow();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.c;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.d();
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    protected void onDetachedFromWindow() {
        onDetachedFromWindow();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.c;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected void onMeasure(int r5, int r6) {
        /*
        // Method dump skipped, instructions count: 533
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setDividerDrawable.onMeasure(int, int):void");
    }

    public void setAttachListener(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.c = remoteActionCompatParcelizer;
    }

    public void setDecorPadding(int i, int i2, int i3, int i4) {
        this.e.set(i, i2, i3, i4);
        if (findFragmentByWho.G(this)) {
            requestLayout();
        }
    }
}
