package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:o/setArguments.class */
public final class setArguments extends setOnStartEnterTransitionListener.MediaMetadataCompat {
    private static final int[] c = {16843284};
    private final Rect a = new Rect();
    private int d;
    private Drawable e;

    public setArguments(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(c);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.e = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        this.d = 1;
    }

    @Override // o.setOnStartEnterTransitionListener.MediaMetadataCompat
    public final void d(Canvas canvas, setOnStartEnterTransitionListener setonstartentertransitionlistener) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!(setonstartentertransitionlistener.z == null || this.e == null)) {
            if (this.d == 1) {
                canvas.save();
                if (setonstartentertransitionlistener.getClipToPadding()) {
                    i4 = setonstartentertransitionlistener.getPaddingLeft();
                    i3 = setonstartentertransitionlistener.getWidth() - setonstartentertransitionlistener.getPaddingRight();
                    canvas.clipRect(i4, setonstartentertransitionlistener.getPaddingTop(), i3, setonstartentertransitionlistener.getHeight() - setonstartentertransitionlistener.getPaddingBottom());
                } else {
                    i3 = setonstartentertransitionlistener.getWidth();
                    i4 = 0;
                }
                int childCount = setonstartentertransitionlistener.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = setonstartentertransitionlistener.getChildAt(i5);
                    setOnStartEnterTransitionListener.a(childAt, this.a);
                    int round = this.a.bottom + Math.round(childAt.getTranslationY());
                    this.e.setBounds(i4, round - this.e.getIntrinsicHeight(), i3, round);
                    this.e.draw(canvas);
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (setonstartentertransitionlistener.getClipToPadding()) {
                i = setonstartentertransitionlistener.getPaddingTop();
                i2 = setonstartentertransitionlistener.getHeight() - setonstartentertransitionlistener.getPaddingBottom();
                canvas.clipRect(setonstartentertransitionlistener.getPaddingLeft(), i, setonstartentertransitionlistener.getWidth() - setonstartentertransitionlistener.getPaddingRight(), i2);
            } else {
                i2 = setonstartentertransitionlistener.getHeight();
                i = 0;
            }
            int childCount2 = setonstartentertransitionlistener.getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt2 = setonstartentertransitionlistener.getChildAt(i6);
                setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = setonstartentertransitionlistener.z;
                setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.d(childAt2, this.a);
                int round2 = this.a.right + Math.round(childAt2.getTranslationX());
                this.e.setBounds(round2 - this.e.getIntrinsicWidth(), i, round2, i2);
                this.e.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // o.setOnStartEnterTransitionListener.MediaMetadataCompat
    public final void e(Rect rect, View view, setOnStartEnterTransitionListener setonstartentertransitionlistener, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        Drawable drawable = this.e;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.d == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
