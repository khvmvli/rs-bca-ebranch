package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
/* loaded from: classes2-dex2jar.jar:o/setRequestHeaders.class */
public class setRequestHeaders extends FrameLayout {
    private int a;
    public int b;
    private ValueAnimator c;
    private Interpolator d;
    private float e;
    private write g;
    private int h;
    private float i;

    /* loaded from: classes2-dex2jar.jar:o/setRequestHeaders$com_github_ChuckerTeam_Chucker_library.class */
    public final class com_github_ChuckerTeam_Chucker_library extends setMethod {
        public final Runnable d;

        public com_github_ChuckerTeam_Chucker_library(Runnable runnable, long j, setPath$com_github_ChuckerTeam_Chucker_library setpath_com_github_chuckerteam_chucker_library) {
            super(j, setpath_com_github_chuckerteam_chucker_library);
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.d.run();
            } finally {
                this.g.c();
            }
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder sb = new StringBuilder("Task[");
            sb.append(this.d.getClass().getSimpleName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this.d)));
            sb.append(", ");
            sb.append(this.j);
            sb.append(", ");
            sb.append(this.g);
            sb.append(']');
            return sb.toString();
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/setRequestHeaders$write.class */
    public interface write {
    }

    public setRequestHeaders(Context context) {
        this(context, null);
    }

    public setRequestHeaders(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 300;
        this.d = new setResponseCode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, setRequestDate$MediaBrowserCompat$CustomActionResultReceiver.b);
            this.a = obtainStyledAttributes.getInt(setRequestDate$MediaBrowserCompat$CustomActionResultReceiver.d, 300);
            int i = 0;
            this.e = obtainStyledAttributes.getBoolean(setRequestDate$MediaBrowserCompat$CustomActionResultReceiver.e, false) ? 1.0f : 0.0f;
            this.h = obtainStyledAttributes.getInt(setRequestDate$MediaBrowserCompat$CustomActionResultReceiver.c, 1);
            this.i = obtainStyledAttributes.getFloat(setRequestDate$MediaBrowserCompat$CustomActionResultReceiver.a, 1.0f);
            obtainStyledAttributes.recycle();
            this.b = this.e != 0.0f ? 3 : i;
            setParallax(this.i);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        onConfigurationChanged(configuration);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i3 = this.h == 0 ? measuredWidth : measuredHeight;
        setVisibility((this.e == 0.0f && i3 == 0) ? 8 : 0);
        int round = i3 - Math.round(((float) i3) * this.e);
        float f = this.i;
        if (f > 0.0f) {
            float f2 = ((float) round) * f;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (this.h == 0) {
                    int i5 = 1;
                    if (getLayoutDirection() != 1) {
                        i5 = -1;
                    }
                    childAt.setTranslationX(((float) i5) * f2);
                } else {
                    childAt.setTranslationY(-f2);
                }
            }
        }
        if (this.h == 0) {
            setMeasuredDimension(measuredWidth - round, measuredHeight);
        } else {
            setMeasuredDimension(measuredWidth, measuredHeight - round);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        float f = bundle.getFloat("expansion");
        this.e = f;
        this.b = f == 1.0f ? 3 : 0;
        onRestoreInstanceState(bundle.getParcelable("super_state"));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = onSaveInstanceState();
        Bundle bundle = new Bundle();
        int i = this.b;
        float f = i == 2 || i == 3 ? 1.0f : 0.0f;
        this.e = f;
        bundle.putFloat("expansion", f);
        bundle.putParcelable("super_state", onSaveInstanceState);
        return bundle;
    }

    public void setDuration(int i) {
        this.a = i;
    }

    public void setExpanded(boolean z) {
        setExpanded(z, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setExpanded(boolean z, boolean z2) {
        int i = this.b;
        if (z != (i == 2 || i == 3)) {
            if (z2) {
                ValueAnimator valueAnimator = this.c;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.c = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e, z ? 1.0f : 0.0f);
                this.c = ofFloat;
                ofFloat.setInterpolator(this.d);
                this.c.setDuration((long) this.a);
                this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.setRequestHeaders.3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        setRequestHeaders.this.setExpansion(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                    }
                });
                this.c.addListener(new Animator.AnimatorListener(z) { // from class: o.setRequestHeaders$MediaBrowserCompat$CustomActionResultReceiver
                    private boolean b;
                    private int c;

                    {
                        this.c = r5;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        this.b = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        if (!this.b) {
                            setRequestHeaders.this.b = this.c == 0 ? 0 : 3;
                            setRequestHeaders.this.setExpansion((float) this.c);
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        setRequestHeaders.this.b = this.c == 0 ? 1 : 2;
                    }
                });
                this.c.start();
                return;
            }
            setExpansion(z ? 1.0f : 0.0f);
        }
    }

    public void setExpansion(float f) {
        float f2 = this.e;
        if (f2 != f) {
            float f3 = f - f2;
            int i = 0;
            if (f == 0.0f) {
                this.b = 0;
            } else if (f == 1.0f) {
                this.b = 3;
            } else if (f3 < 0.0f) {
                this.b = 1;
            } else if (f3 > 0.0f) {
                this.b = 2;
            }
            if (this.b == 0) {
                i = 8;
            }
            setVisibility(i);
            this.e = f;
            requestLayout();
        }
    }

    public void setInterpolator(Interpolator interpolator) {
        this.d = interpolator;
    }

    public void setOnExpansionUpdateListener(write write2) {
        this.g = write2;
    }

    public void setOrientation(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("Orientation must be either 0 (horizontal) or 1 (vertical)");
        }
        this.h = i;
    }

    public void setParallax(float f) {
        this.i = Math.min(1.0f, Math.max(0.0f, f));
    }
}
