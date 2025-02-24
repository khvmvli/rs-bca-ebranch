package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/setDistanceToTriggerSync.class */
public final class setDistanceToTriggerSync extends getLocalMatrix {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setDistanceToTriggerSync$write.class */
    public static final class write extends AnimatorListenerAdapter {
        private boolean d = false;
        private final View e;

        write(View view) {
            this.e = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            setStrokeColor.d(this.e, 1.0f);
            if (this.d) {
                this.e.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (findFragmentByWho.D(this.e) && this.e.getLayerType() == 0) {
                this.d = true;
                this.e.setLayerType(2, null);
            }
        }
    }

    public setDistanceToTriggerSync() {
    }

    public setDistanceToTriggerSync(int i) {
        a(i);
    }

    public setDistanceToTriggerSync(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setProgressViewOffset.d);
        a(isVisible.d(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, l()));
        obtainStyledAttributes.recycle();
    }

    private static float a(getStrokeColor getstrokecolor, float f) {
        float f2 = f;
        if (getstrokecolor != null) {
            Float f3 = (Float) getstrokecolor.c.get("android:fade:transitionAlpha");
            f2 = f;
            if (f3 != null) {
                f2 = f3.floatValue();
            }
        }
        return f2;
    }

    private Animator c(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        setStrokeColor.d(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, setStrokeColor.c, f2);
        ofFloat.addListener(new write(view));
        c(new setRefreshing() { // from class: o.setDistanceToTriggerSync.5
            @Override // o.setRefreshing, o.setSlingshotDistance.read
            public final void c(setSlingshotDistance setslingshotdistance) {
                setStrokeColor.d(view, 1.0f);
                setStrokeColor.c(view);
                setslingshotdistance.e(this);
            }
        });
        return ofFloat;
    }

    @Override // o.getLocalMatrix
    public final Animator a(View view, getStrokeColor getstrokecolor) {
        float f = 0.0f;
        float a = a(getstrokecolor, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return c(view, f, 1.0f);
    }

    @Override // o.getLocalMatrix, o.setSlingshotDistance
    public final void a(getStrokeColor getstrokecolor) {
        a(getstrokecolor);
        getstrokecolor.c.put("android:fade:transitionAlpha", Float.valueOf(setStrokeColor.b(getstrokecolor.a)));
    }

    @Override // o.getLocalMatrix
    public final Animator b(View view, getStrokeColor getstrokecolor) {
        setStrokeColor.e(view);
        return c(view, a(getstrokecolor, 1.0f), 0.0f);
    }
}
