package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setMeasureWithLargestChildEnabled.class */
public class setMeasureWithLargestChildEnabled extends ListView {
    private boolean a;
    boolean b;
    IconCompatParcelizer c;
    private boolean d;
    private generateActivityResultKey e;
    private Field h;
    private getFragmentManager i;
    private int j;
    private RemoteActionCompatParcelizer m;
    private final Rect n = new Rect();
    private int f = 0;
    private int l = 0;
    private int k = 0;
    private int g = 0;

    /* loaded from: classes-dex2jar.jar:o/setMeasureWithLargestChildEnabled$IconCompatParcelizer.class */
    public final class IconCompatParcelizer implements Runnable {
        IconCompatParcelizer() {
            setMeasureWithLargestChildEnabled.this = r4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            setMeasureWithLargestChildEnabled.this.c = null;
            setMeasureWithLargestChildEnabled.this.drawableStateChanged();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setMeasureWithLargestChildEnabled$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends setSubtitle {
        boolean c = true;

        RemoteActionCompatParcelizer(Drawable drawable) {
            super(drawable);
        }

        @Override // o.setSubtitle, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.c) {
                draw(canvas);
            }
        }

        @Override // o.setSubtitle, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f2) {
            if (this.c) {
                setHotspot(f, f2);
            }
        }

        @Override // o.setSubtitle, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.c) {
                setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // o.setSubtitle, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.c) {
                return setState(iArr);
            }
            return false;
        }

        @Override // o.setSubtitle, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z, boolean z2) {
            if (this.c) {
                return setVisible(z, z2);
            }
            return false;
        }
    }

    public setMeasureWithLargestChildEnabled(Context context, boolean z) {
        super(context, null, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.D);
        this.d = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void a() {
        Drawable selector = getSelector();
        if (selector != null && this.a && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            i8 = i8;
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            View view2 = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = layoutParams;
            if (layoutParams == null) {
                layoutParams2 = generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams2);
            }
            view2.measure(i, layoutParams2.height > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view2.forceLayout();
            int i10 = i6;
            if (i7 > 0) {
                i10 = i6 + dividerHeight;
            }
            i6 = i10 + view2.getMeasuredHeight();
            if (i6 >= i4) {
                int i11 = i4;
                if (i5 >= 0) {
                    i11 = i4;
                    if (i7 > i5) {
                        i11 = i4;
                        if (i9 > 0) {
                            i11 = i4;
                            if (i6 != i4) {
                                i11 = i9;
                            }
                        }
                    }
                }
                return i11;
            }
            i9 = i9;
            if (i5 >= 0) {
                i9 = i9;
                if (i7 >= i5) {
                    i9 = i6;
                }
            }
            i7++;
            view = view2;
        }
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0 != 3) goto L_0x0212;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0291  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean c(android.view.MotionEvent r7, int r8) {
        /*
        // Method dump skipped, instructions count: 675
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setMeasureWithLargestChildEnabled.c(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.n.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.n);
            selector.draw(canvas);
        }
        dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.c == null) {
            drawableStateChanged();
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.m;
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.c = true;
            }
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.d || hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.d || hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.d || isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.d && this.b) || isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View, android.widget.AdapterView
    protected void onDetachedFromWindow() {
        this.c = null;
        onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.c == null) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
            this.c = iconCompatParcelizer;
            setMeasureWithLargestChildEnabled.this.post(iconCompatParcelizer);
        }
        boolean onHoverEvent = onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.j = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        IconCompatParcelizer iconCompatParcelizer = this.c;
        if (iconCompatParcelizer != null) {
            setMeasureWithLargestChildEnabled.this.c = null;
            setMeasureWithLargestChildEnabled.this.removeCallbacks(iconCompatParcelizer);
        }
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = drawable != null ? new RemoteActionCompatParcelizer(drawable) : null;
        this.m = remoteActionCompatParcelizer;
        setSelector(remoteActionCompatParcelizer);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f = rect.left;
        this.l = rect.top;
        this.k = rect.right;
        this.g = rect.bottom;
    }
}
