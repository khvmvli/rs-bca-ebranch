package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;
import o.BaseDialogKotlin;
/* loaded from: classes2-dex2jar.jar:o/PendidikanTerakhirDialog.class */
class PendidikanTerakhirDialog extends View {
    final RectF a;
    private final float b;
    final List<RemoteActionCompatParcelizer> c;
    final int d;
    private boolean e;
    private boolean f;
    private int g;
    private double h;
    private float i;
    private float j;
    private float k;
    private ValueAnimator l;
    private final Paint m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private IconCompatParcelizer f51o;
    private final int q;
    private int r;

    /* loaded from: classes2-dex2jar.jar:o/PendidikanTerakhirDialog$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void e(float f, boolean z);
    }

    /* loaded from: classes2-dex2jar.jar:o/PendidikanTerakhirDialog$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void d(float f, boolean z);
    }

    public PendidikanTerakhirDialog(Context context) {
        this(context, null);
    }

    public PendidikanTerakhirDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.D);
    }

    public PendidikanTerakhirDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new ArrayList();
        Paint paint = new Paint();
        this.m = paint;
        this.a = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.by, i, BaseDialogKotlin.MediaDescriptionCompat.z);
        this.g = obtainStyledAttributes.getDimensionPixelSize(BaseDialogKotlin$MediaSessionCompat$Token.bD, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(BaseDialogKotlin$MediaSessionCompat$Token.bA, 0);
        Resources resources = getResources();
        this.q = resources.getDimensionPixelSize(BaseDialogKotlin.read.n);
        this.b = (float) resources.getDimensionPixelSize(BaseDialogKotlin.read.m);
        int color = obtainStyledAttributes.getColor(BaseDialogKotlin$MediaSessionCompat$Token.bE, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.r = ViewConfiguration.get(context).getScaledTouchSlop();
        findFragmentByWho.j(this, 2);
        obtainStyledAttributes.recycle();
    }

    private int a(float f, float f2) {
        int width = getWidth() / 2;
        double d = (double) (f - ((float) width));
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f2 - ((float) (getHeight() / 2))), d))) + 90;
        int i = degrees;
        if (degrees < 0) {
            i = degrees + 360;
        }
        return i;
    }

    void e(float f, boolean z) {
        float f2 = f % 360.0f;
        this.k = f2;
        this.h = Math.toRadians((double) (f2 - 90.0f));
        int height = getHeight() / 2;
        float width = ((float) (getWidth() / 2)) + (((float) this.g) * ((float) Math.cos(this.h)));
        float sin = ((float) height) + (((float) this.g) * ((float) Math.sin(this.h)));
        RectF rectF = this.a;
        float f3 = (float) this.d;
        rectF.set(width - f3, sin - f3, width + f3, sin + f3);
        for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.c) {
            remoteActionCompatParcelizer.d(f2, z);
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float f2 = (float) this.g;
        float cos = (float) Math.cos(this.h);
        float f3 = (float) height;
        float f4 = (float) this.g;
        float sin = (float) Math.sin(this.h);
        this.m.setStrokeWidth(0.0f);
        canvas.drawCircle((f2 * cos) + f, (f4 * sin) + f3, (float) this.d, this.m);
        double sin2 = Math.sin(this.h);
        double cos2 = Math.cos(this.h);
        double d = (double) ((float) (this.g - this.d));
        this.m.setStrokeWidth((float) this.q);
        canvas.drawLine(f, f3, (float) (width + ((int) (cos2 * d))), (float) (height + ((int) (d * sin2))), this.m);
        canvas.drawCircle(f, f3, this.b, this.m);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        onLayout(z, i, i2, i3, i4);
        setHandRotation(this.k);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        IconCompatParcelizer iconCompatParcelizer;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.j);
                int i2 = (int) (y - this.i);
                this.n = (i * i) + (i2 * i2) > this.r;
                z = this.f;
                z2 = actionMasked == 1;
            } else {
                z2 = false;
                z = false;
            }
            z3 = false;
        } else {
            this.j = x;
            this.i = y;
            this.n = true;
            this.f = false;
            z2 = false;
            z = false;
            z3 = true;
        }
        boolean z5 = this.f;
        float a = (float) a(x, y);
        boolean z6 = this.k != a;
        if (!z3 || !z6) {
            if (z6 || z) {
                boolean z7 = false;
                if (z2) {
                    z7 = false;
                    if (this.e) {
                        z7 = true;
                    }
                }
                setHandRotation(a, z7);
            } else {
                boolean z8 = z4 | z5;
                this.f = z8;
                if (z8 || !z2 || (iconCompatParcelizer = this.f51o) == null) {
                    return true;
                }
                iconCompatParcelizer.e((float) a(x, y), this.n);
                return true;
            }
        }
        z4 = true;
        boolean z82 = z4 | z5;
        this.f = z82;
        return z82 ? true : true;
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.e = z;
    }

    public void setCircleRadius(int i) {
        this.g = i;
        invalidate();
    }

    public void setHandRotation(float f) {
        setHandRotation(f, false);
    }

    public void setHandRotation(float f, boolean z) {
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            e(f, false);
            return;
        }
        float f2 = this.k;
        float f3 = f;
        float f4 = f2;
        if (Math.abs(f2 - f) > 180.0f) {
            float f5 = f;
            if (f2 > 180.0f) {
                f5 = f;
                if (f < 180.0f) {
                    f5 = f + 360.0f;
                }
            }
            f3 = f5;
            f4 = f2;
            if (f2 < 180.0f) {
                f3 = f5;
                f4 = f2;
                if (f5 > 180.0f) {
                    f4 = f2 + 360.0f;
                    f3 = f5;
                }
            }
        }
        Pair pair = new Pair(Float.valueOf(f4), Float.valueOf(f3));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        this.l = ofFloat;
        ofFloat.setDuration(200L);
        this.l.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.PendidikanTerakhirDialog.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                PendidikanTerakhirDialog.this.e(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        this.l.addListener(new AnimatorListenerAdapter() { // from class: o.PendidikanTerakhirDialog.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
        this.l.start();
    }

    public void setOnActionUpListener(IconCompatParcelizer iconCompatParcelizer) {
        this.f51o = iconCompatParcelizer;
    }
}
