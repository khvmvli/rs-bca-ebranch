package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.stetho.websocket.CloseCodes;
import o.getPathData;
import o.setPageTransformer;
/* loaded from: classes-dex2jar.jar:o/setPageMarginDrawable.class */
public class setPageMarginDrawable extends View implements FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 {
    private int a;
    private boolean b;
    private float c;
    private boolean d;
    private int e;
    private final Paint f;
    private final Paint g;
    private int h;
    private float i;
    private final Paint j;
    private int k;
    private float l;
    private boolean m;
    private setKeepHint n;

    /* renamed from: o  reason: collision with root package name */
    private int f261o;
    private int q;
    private getPathData s;
    private int t;

    public setPageMarginDrawable(Context context) {
        this(context, null);
    }

    public setPageMarginDrawable(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setPageTransformer.RemoteActionCompatParcelizer.a);
    }

    public setPageMarginDrawable(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.j = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        Paint paint3 = new Paint(1);
        this.g = paint3;
        this.m = true;
        this.c = -1.0f;
        this.a = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(setPageTransformer$MediaBrowserCompat$CustomActionResultReceiver.c);
            int color2 = resources.getColor(setPageTransformer$MediaBrowserCompat$CustomActionResultReceiver.d);
            int integer = resources.getInteger(setPageTransformer$MediaBrowserCompat$ItemReceiver.a);
            int color3 = resources.getColor(setPageTransformer$MediaBrowserCompat$CustomActionResultReceiver.a);
            float dimension = resources.getDimension(setPageTransformer.write.e);
            float dimension2 = resources.getDimension(setPageTransformer.write.d);
            boolean z = resources.getBoolean(setPageTransformer.read.a);
            resources.getBoolean(setPageTransformer.read.c);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setPageTransformer$MediaBrowserCompat$MediaItem.i, i, 0);
            this.b = obtainStyledAttributes.getBoolean(setPageTransformer$MediaBrowserCompat$MediaItem.g, z);
            this.h = obtainStyledAttributes.getInt(setPageTransformer$MediaBrowserCompat$MediaItem.j, integer);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(obtainStyledAttributes.getColor(setPageTransformer$MediaBrowserCompat$MediaItem.m, color));
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(obtainStyledAttributes.getColor(setPageTransformer$MediaBrowserCompat$MediaItem.f262o, color3));
            paint2.setStrokeWidth(obtainStyledAttributes.getDimension(setPageTransformer$MediaBrowserCompat$MediaItem.n, dimension));
            paint3.setStyle(Paint.Style.FILL);
            paint3.setColor(obtainStyledAttributes.getColor(setPageTransformer$MediaBrowserCompat$MediaItem.k, color2));
            this.l = obtainStyledAttributes.getDimension(setPageTransformer$MediaBrowserCompat$MediaItem.l, dimension2);
            Drawable drawable = obtainStyledAttributes.getDrawable(setPageTransformer$MediaBrowserCompat$MediaItem.h);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.q = dump.d(ViewConfiguration.get(context));
        }
    }

    private int c(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i2 = size;
        if (mode != 1073741824) {
            if (this.s == null) {
                i2 = size;
            } else {
                int size2 = this.n.e.size();
                float paddingLeft = (float) (getPaddingLeft() + getPaddingRight());
                float f = (float) (size2 << 1);
                float f2 = this.l;
                i2 = (int) (paddingLeft + (f * f2) + (((float) (size2 - 1)) * f2) + 1.0f);
                if (mode == Integer.MIN_VALUE) {
                    i2 = Math.min(i2, size);
                }
            }
        }
        return i2;
    }

    private int e(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i2 = size;
        if (mode != 1073741824) {
            i2 = (int) ((this.l * 2.0f) + ((float) getPaddingTop()) + ((float) getPaddingBottom()) + 1.0f);
            if (mode == Integer.MIN_VALUE) {
                i2 = Math.min(i2, size);
            }
        }
        return i2;
    }

    @Override // o.getPathData$MediaBrowserCompat$ItemReceiver
    public final void a(int i, float f) {
        this.e = i;
        this.i = f;
        invalidate();
    }

    @Override // o.getPathData$MediaBrowserCompat$ItemReceiver
    public final void b(int i) {
        if (this.m || this.f261o == 0) {
            this.e = i;
            this.t = i;
            invalidate();
        }
    }

    @Override // o.getPathData$MediaBrowserCompat$ItemReceiver
    public final void d(int i) {
        this.f261o = i;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int size;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        onDraw(canvas);
        setKeepHint setkeephint = this.n;
        if (setkeephint != null && (size = setkeephint.e.size()) > 1) {
            if (this.h == 0) {
                i4 = getWidth();
                i3 = getPaddingLeft();
                i2 = getPaddingRight();
                i = getPaddingTop();
            } else {
                i4 = getHeight();
                i3 = getPaddingTop();
                i2 = getPaddingBottom();
                i = getPaddingLeft();
            }
            float f2 = this.l;
            float f3 = 3.0f * f2;
            float f4 = ((float) i) + f2;
            float f5 = ((float) i3) + f2;
            float f6 = f5;
            if (this.b) {
                f6 = f5 + ((((float) ((i4 - i3) - i2)) / 2.0f) - ((((float) size) * f3) / 2.0f));
            }
            float f7 = f2;
            if (this.f.getStrokeWidth() > 0.0f) {
                f7 = f2 - (this.f.getStrokeWidth() / 2.0f);
            }
            for (int i5 = 0; i5 < size; i5++) {
                float f8 = (((float) i5) * f3) + f6;
                if (this.h == 0) {
                    f = f4;
                } else {
                    f = f8;
                    f8 = f4;
                }
                if (this.j.getAlpha() > 0) {
                    canvas.drawCircle(f8, f, f7, this.j);
                }
                float f9 = this.l;
                if (f7 != f9) {
                    canvas.drawCircle(f8, f, f9, this.f);
                }
            }
            float f10 = f6 + (((float) (this.t % size)) * f3);
            float f11 = f4;
            float f12 = f10;
            if (this.h == 0) {
                f12 = f4;
                f11 = f10;
            }
            canvas.drawCircle(f11, f12, this.l, this.g);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.h == 0) {
            setMeasuredDimension(c(i), e(i2));
        } else {
            setMeasuredDimension(e(i), c(i2));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        int i = 0;
        if (this.s == null) {
            return false;
        }
        setKeepHint setkeephint = this.n;
        if ((setkeephint.a ? setkeephint.e.size() * 100 : setkeephint.e.size()) == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float e = setCancelable.e(motionEvent, setCancelable.b(motionEvent, this.a));
                    float f = e - this.c;
                    if (!this.d && Math.abs(f) > ((float) this.q)) {
                        this.d = true;
                    }
                    if (!this.d) {
                        return true;
                    }
                    this.c = e;
                    if (!this.s.g) {
                        getPathData getpathdata = this.s;
                        if (!getpathdata.f) {
                            getpathdata.g = true;
                            getpathdata.d(1);
                            getpathdata.k = 0.0f;
                            getpathdata.h = 0.0f;
                            VelocityTracker velocityTracker = getpathdata.q;
                            if (velocityTracker == null) {
                                getpathdata.q = VelocityTracker.obtain();
                            } else {
                                velocityTracker.clear();
                            }
                            long uptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                            getpathdata.q.addMovement(obtain);
                            obtain.recycle();
                            getpathdata.i = uptimeMillis;
                            z = true;
                        }
                        if (!z) {
                            return true;
                        }
                    }
                    this.s.b(f);
                    return true;
                } else if (action != 3) {
                    if (action == 5) {
                        int e2 = setCancelable.e(motionEvent);
                        this.c = setCancelable.e(motionEvent, e2);
                        this.a = setCancelable.a(motionEvent, e2);
                        return true;
                    } else if (action != 6) {
                        return true;
                    } else {
                        int e3 = setCancelable.e(motionEvent);
                        if (setCancelable.a(motionEvent, e3) == this.a) {
                            if (e3 == 0) {
                                i = 1;
                            }
                            this.a = setCancelable.a(motionEvent, i);
                        }
                        this.c = setCancelable.e(motionEvent, setCancelable.b(motionEvent, this.a));
                        return true;
                    }
                }
            }
            if (!this.d) {
                int d = this.s.d.d();
                float width = (float) getWidth();
                float f2 = width / 2.0f;
                float f3 = width / 6.0f;
                if (this.e <= 0 || motionEvent.getX() >= f2 - f3) {
                    if (this.e < d - 1 && motionEvent.getX() > f2 + f3) {
                        if (action == 3) {
                            return true;
                        }
                        this.s.setCurrentItem(this.e + 1);
                        return true;
                    }
                } else if (action == 3) {
                    return true;
                } else {
                    this.s.setCurrentItem(this.e - 1);
                    return true;
                }
            }
            this.d = false;
            this.a = -1;
            if (!this.s.g) {
                return true;
            }
            getPathData getpathdata2 = this.s;
            if (getpathdata2.g) {
                if (getpathdata2.d != null) {
                    VelocityTracker velocityTracker2 = getpathdata2.q;
                    velocityTracker2.computeCurrentVelocity(CloseCodes.NORMAL_CLOSURE, (float) getpathdata2.f151o);
                    int xVelocity = (int) velocityTracker2.getXVelocity(getpathdata2.e);
                    getpathdata2.l = true;
                    int measuredWidth = getpathdata2.getMeasuredWidth();
                    int paddingLeft = getpathdata2.getPaddingLeft();
                    int paddingRight = getpathdata2.getPaddingRight();
                    int scrollX = getpathdata2.getScrollX();
                    getPathData.write e4 = getpathdata2.e();
                    getpathdata2.b(getpathdata2.d(e4.d, ((((float) scrollX) / ((float) ((measuredWidth - paddingLeft) - paddingRight))) - e4.a) / e4.b, xVelocity, (int) (getpathdata2.k - getpathdata2.h)), true, true, xVelocity);
                }
                getpathdata2.f = false;
                getpathdata2.m = false;
                VelocityTracker velocityTracker3 = getpathdata2.q;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    getpathdata2.q = null;
                }
                getpathdata2.g = false;
                return true;
            }
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        this.a = setCancelable.a(motionEvent, 0);
        this.c = motionEvent.getX();
        return true;
    }

    public void setCentered(boolean z) {
        this.b = z;
        invalidate();
    }

    public void setCurrentItem(int i) {
        this.e = i;
        invalidate();
    }

    public void setFillColor(int i) {
        this.g.setColor(i);
        invalidate();
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            this.h = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
    }

    public void setPageColor(int i) {
        this.j.setColor(i);
        invalidate();
    }

    public void setRadius(float f) {
        this.l = f;
        invalidate();
    }

    public void setRealViewCount(int i) {
        this.k = i;
    }

    public void setSnap(boolean z) {
        this.m = z;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.f.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f.setStrokeWidth(f);
        invalidate();
    }

    public void setViewPager(getPathData getpathdata) {
        if (this.s != getpathdata) {
            this.s = getpathdata;
            this.n = (setKeepHint) getpathdata.d;
        }
    }
}
