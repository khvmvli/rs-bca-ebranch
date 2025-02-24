package o;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.Transformation;
import android.widget.ImageView;
/* loaded from: classes-dex2jar.jar:o/setMessage.class */
public final class setMessage {
    public int a;
    public Animation b;
    public RotateAnimation c;
    private AnimationSet d;
    private int h = 1;
    public int e = 0;

    public void b(View view) {
        int i = ((int) (((float) this.a) / view.getContext().getResources().getDisplayMetrics().density)) * this.h;
        this.e = i;
        this.b.setDuration((long) i);
        view.startAnimation(this.b);
    }

    public final void b(final View view, ImageView imageView) {
        if (view.getVisibility() == 8) {
            c(view);
            this.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            e(imageView);
            return;
        }
        this.a = view.getMeasuredHeight();
        this.b = new Animation() { // from class: o.setMessage.1
            @Override // android.view.animation.Animation
            protected final void applyTransformation(float f, Transformation transformation) {
                if (((int) f) == 1) {
                    view.setVisibility(8);
                    return;
                }
                view.getLayoutParams().height = setMessage.this.a - ((int) (((float) setMessage.this.a) * f));
                view.requestLayout();
            }

            @Override // android.view.animation.Animation
            public final boolean willChangeBounds() {
                return true;
            }
        };
        b(view);
        this.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        e(imageView);
    }

    public final void c(final View view) {
        view.measure(-1, -2);
        this.a = view.getMeasuredHeight();
        view.getLayoutParams().height = 1;
        view.setVisibility(0);
        this.b = new Animation() { // from class: o.setMessage.5
            @Override // android.view.animation.Animation
            protected final void applyTransformation(float f, Transformation transformation) {
                int i = (int) f;
                view.getLayoutParams().height = i == 1 ? -2 : (int) (((float) setMessage.this.a) * f);
                view.requestLayout();
            }

            @Override // android.view.animation.Animation
            public final boolean willChangeBounds() {
                return true;
            }
        };
        b(view);
    }

    public void e(View view) {
        AnimationSet animationSet = new AnimationSet(true);
        this.d = animationSet;
        animationSet.setInterpolator(new DecelerateInterpolator());
        this.d.setFillAfter(true);
        this.d.setFillEnabled(true);
        this.c.setDuration((long) this.e);
        this.c.setFillAfter(true);
        this.d.addAnimation(this.c);
        view.startAnimation(this.d);
    }
}
