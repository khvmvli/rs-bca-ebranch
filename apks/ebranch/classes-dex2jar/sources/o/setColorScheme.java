package o;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setColorScheme.class */
public final class setColorScheme extends ImageView {
    private Animation.AnimationListener b;
    int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setColorScheme(Context context, int i) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        this.c = (int) (3.5f * f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        findFragmentByWho.b(this, f * 4.0f);
        shapeDrawable.getPaint().setColor(-328966);
        findFragmentByWho.b(this, shapeDrawable);
    }

    @Override // android.view.View
    public final void onAnimationEnd() {
        onAnimationEnd();
        Animation.AnimationListener animationListener = this.b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        onAnimationStart();
        Animation.AnimationListener animationListener = this.b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        onMeasure(i, i2);
    }

    public final void setAnimationListener(Animation.AnimationListener animationListener) {
        this.b = animationListener;
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    public final void setBackgroundColorRes(int i) {
        setBackgroundColor(copyWindowDataInto.a(getContext(), i));
    }
}
