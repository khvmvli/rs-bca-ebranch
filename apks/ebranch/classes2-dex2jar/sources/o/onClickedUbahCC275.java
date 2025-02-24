package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes2-dex2jar.jar:o/onClickedUbahCC275.class */
public class onClickedUbahCC275 extends ImageView implements ViewTreeObserver.OnGlobalLayoutListener, onFocuscc274 {
    private Interpolator A;
    private final Paint B;
    private Rect C;
    private final Paint D;
    public int a;
    public RectF b;
    public int c;
    public final Matrix d;
    public onClickedUbahCC278 e;
    public final float[] f;
    public final Matrix g;
    public int h;
    public int i;
    public int j;
    private RemoteActionCompatParcelizer k;
    public final Matrix l;
    private int m;
    public Uri n;

    /* renamed from: o */
    private final RectF f78o;
    private int p;
    private onFocuscc2710 q;
    private int r;
    private int s;
    private GestureDetector t;
    private int u;
    private float v;
    private long w;
    private float x;
    private float y;
    private Path z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/onClickedUbahCC275$IconCompatParcelizer.class */
    public final class IconCompatParcelizer implements GestureDetector.OnDoubleTapListener {
        private IconCompatParcelizer() {
            onClickedUbahCC275.this = r4;
        }

        /* synthetic */ IconCompatParcelizer(onClickedUbahCC275 onclickedubahcc275, byte b) {
            this();
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float e = onClickedUbahCC275.this.e();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (e < onClickedUbahCC275.this.y) {
                    onClickedUbahCC275 onclickedubahcc275 = onClickedUbahCC275.this;
                    onClickedUbahCC275.c(onclickedubahcc275, onclickedubahcc275.y, x, y, true);
                    return true;
                } else if (e < onClickedUbahCC275.this.y || e >= onClickedUbahCC275.this.x) {
                    onClickedUbahCC275 onclickedubahcc2752 = onClickedUbahCC275.this;
                    onClickedUbahCC275.c(onclickedubahcc2752, onclickedubahcc2752.v, x, y, true);
                    return true;
                } else {
                    onClickedUbahCC275 onclickedubahcc2753 = onClickedUbahCC275.this;
                    onClickedUbahCC275.c(onclickedubahcc2753, onclickedubahcc2753.x, x, y, true);
                    return true;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                return true;
            }
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return false;
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/onClickedUbahCC275$RemoteActionCompatParcelizer.class */
    final class RemoteActionCompatParcelizer implements Runnable {
        final onFocuscc275 b;
        int c;
        int e;

        public RemoteActionCompatParcelizer(Context context) {
            onClickedUbahCC275.this = r6;
            this.b = new onFocusCc272(context);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.b.c() && this.b.e()) {
                int a = this.b.a();
                int b = this.b.b();
                onClickedUbahCC275.this.l.postTranslate((float) (this.c - a), (float) (this.e - b));
                onClickedUbahCC275 onclickedubahcc275 = onClickedUbahCC275.this;
                onclickedubahcc275.setImageMatrix(onClickedUbahCC275.e(onclickedubahcc275));
                this.c = a;
                this.e = b;
                onClickedUbahCC275.this.postOnAnimation(this);
            }
        }
    }

    public onClickedUbahCC275(Context context) {
        this(context, null);
    }

    public onClickedUbahCC275(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public onClickedUbahCC275(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.v = 1.0f;
        this.y = 3.0f;
        this.x = 6.0f;
        this.w = 200;
        this.d = new Matrix();
        this.l = new Matrix();
        this.g = new Matrix();
        this.f78o = new RectF();
        this.f = new float[9];
        this.A = new AccelerateDecelerateInterpolator();
        this.e = new onClickedUbahCC278(null, 0);
        Paint paint = new Paint();
        this.B = paint;
        Paint paint2 = new Paint();
        this.D = paint2;
        this.m = -1;
        this.z = new Path();
        this.C = new Rect();
        this.c = 1;
        this.a = 1;
        setScaleType(ImageView.ScaleType.MATRIX);
        onFocuscc273 onfocuscc273 = new onFocuscc273(context);
        onfocuscc273.d(this);
        this.q = onfocuscc273;
        GestureDetector gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener());
        this.t = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new IconCompatParcelizer(this, (byte) 0));
        paint.setAntiAlias(true);
        paint.setColor(this.m);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setARGB(191, 0, 0, 0);
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
    }

    private boolean a() {
        this.g.set(this.d);
        this.g.postConcat(this.l);
        RectF d = d(this.g);
        if (d == null) {
            return false;
        }
        float f = 0.0f;
        float f2 = d.top >= this.b.top ? (-d.top) + this.b.top : d.bottom <= this.b.bottom ? this.b.bottom - d.bottom : 0.0f;
        if (d.left >= this.b.left) {
            f = (-d.left) + this.b.left;
        } else if (d.right <= this.b.right) {
            f = this.b.right - d.right;
        }
        this.l.postTranslate(f, f2);
        return true;
    }

    private void c() {
        if (a()) {
            this.g.set(this.d);
            this.g.postConcat(this.l);
            setImageMatrix(this.g);
        }
    }

    static /* synthetic */ void c(onClickedUbahCC275 onclickedubahcc275, float f, float f2, float f3, boolean z) {
        if (f >= onclickedubahcc275.v && f <= onclickedubahcc275.x) {
            onclickedubahcc275.post(new Runnable(onclickedubahcc275.e(), f, f2, f3) { // from class: o.onClickedUbahCC275$MediaBrowserCompat$CustomActionResultReceiver
                private final long b = System.currentTimeMillis();
                private final float c;
                private final float d;
                private final float e;
                private final float i;

                {
                    this.i = r6;
                    this.d = r7;
                    this.c = r8;
                    this.e = r9;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    float interpolation = onClickedUbahCC275.this.A.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.b)) / ((float) onClickedUbahCC275.this.w)));
                    float f4 = this.i;
                    onClickedUbahCC275.this.e((f4 + ((this.d - f4) * interpolation)) / onClickedUbahCC275.this.e(), this.c, this.e);
                    if (interpolation < 1.0f) {
                        onClickedUbahCC275.this.postOnAnimation(this);
                    }
                }
            });
        }
    }

    private void c(onClickedUbahCC278 onclickedubahcc278) {
        Bitmap bitmap = this.e.c;
        this.e = onclickedubahcc278;
        setImageBitmap(onclickedubahcc278.c);
        if (bitmap != null) {
            bitmap.recycle();
        }
        d();
    }

    private void d() {
        int i;
        float f;
        int i2;
        if (this.e.c != null) {
            float width = (float) ((getWidth() - getPaddingLeft()) - getPaddingRight());
            float height = (float) ((getHeight() - getPaddingTop()) - getPaddingBottom());
            onClickedUbahCC278 onclickedubahcc278 = this.e;
            boolean z = true;
            int i3 = 0;
            if (onclickedubahcc278.c == null) {
                i = 0;
            } else {
                i = (onclickedubahcc278.b / 90) % 2 != 0 ? onclickedubahcc278.c.getHeight() : onclickedubahcc278.c.getWidth();
            }
            float f2 = (float) i;
            onClickedUbahCC278 onclickedubahcc2782 = this.e;
            if (onclickedubahcc2782.c != null) {
                if ((onclickedubahcc2782.b / 90) % 2 == 0) {
                    z = false;
                }
                i3 = z ? onclickedubahcc2782.c.getWidth() : onclickedubahcc2782.c.getHeight();
            }
            float f3 = (float) i3;
            this.d.reset();
            float min = Math.min(width / f2, 3.0f);
            float min2 = Math.min(height / f3, 3.0f);
            float min3 = ((Math.min(f2, f3) * 4.0f) / 5.0f) * Math.min(min, min2);
            float max = Math.max(min, min2);
            int i4 = this.c;
            if (i4 == 0 || (i2 = this.a) == 0) {
                f = min3;
            } else if (i4 > i2) {
                f = (((float) i2) * min3) / ((float) i4);
            } else {
                min3 = (((float) i4) * min3) / ((float) i2);
                f = min3;
            }
            float min4 = Math.min((width / min3) * 0.6f, (height / f) * 0.6f);
            float f4 = max;
            float f5 = f;
            float f6 = min3;
            if (min4 > 1.0f) {
                f4 = max * min4;
                f6 = min3 * min4;
                f5 = f * min4;
            }
            float f7 = (width - f6) / 2.0f;
            float f8 = (height - f5) / 2.0f;
            this.b = new RectF(f7, f8, f6 + f7, f5 + f8);
            this.d.postConcat(this.e.b());
            this.d.postScale(f4, f4);
            this.d.postTranslate((width - (f2 * f4)) / 2.0f, (height - (f3 * f4)) / 2.0f);
            this.l.reset();
            this.g.set(this.d);
            this.g.postConcat(this.l);
            setImageMatrix(this.g);
            RectF d = d(this.d);
            this.v = Math.max(this.b.width() / d.width(), this.b.height() / d.height());
        }
    }

    public float e() {
        this.l.getValues(this.f);
        float pow = (float) Math.pow((double) this.f[0], 2.0d);
        this.l.getValues(this.f);
        return (float) Math.sqrt((double) (pow + ((float) Math.pow((double) this.f[3], 2.0d))));
    }

    static /* synthetic */ Matrix e(onClickedUbahCC275 onclickedubahcc275) {
        onclickedubahcc275.g.set(onclickedubahcc275.d);
        onclickedubahcc275.g.postConcat(onclickedubahcc275.l);
        return onclickedubahcc275.g;
    }

    @Override // o.onFocuscc274
    public final void c(float f, float f2) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(getContext());
        this.k = remoteActionCompatParcelizer;
        int i = (int) f;
        int i2 = (int) f2;
        onClickedUbahCC275 onclickedubahcc275 = onClickedUbahCC275.this;
        onclickedubahcc275.g.set(onclickedubahcc275.d);
        onclickedubahcc275.g.postConcat(onclickedubahcc275.l);
        RectF d = onclickedubahcc275.d(onclickedubahcc275.g);
        if (d != null) {
            int round = Math.round(onClickedUbahCC275.this.b.left - d.left);
            int round2 = Math.round(onClickedUbahCC275.this.b.top - d.top);
            int round3 = Math.round(d.width() - onClickedUbahCC275.this.b.width());
            int round4 = Math.round(d.height() - onClickedUbahCC275.this.b.height());
            remoteActionCompatParcelizer.c = round;
            remoteActionCompatParcelizer.e = round2;
            remoteActionCompatParcelizer.b.a(round, round2, i, i2, 0, round3, 0, round4, 0, 0);
        }
        post(this.k);
    }

    public RectF d(Matrix matrix) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        this.f78o.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        matrix.mapRect(this.f78o);
        return this.f78o;
    }

    @Override // o.onFocuscc274
    public final void e(float f, float f2) {
        if (!this.q.d()) {
            this.l.postTranslate(f, f2);
            c();
        }
    }

    @Override // o.onFocuscc274
    public final void e(float f, float f2, float f3) {
        float f4;
        float e = e();
        if (f > 1.0f) {
            float f5 = this.x / e;
            f4 = f;
            if (f >= f5) {
                f4 = f5;
            }
        } else {
            f4 = f;
            if (f < 1.0f) {
                float f6 = this.v / e;
                f4 = f;
                if (f <= f6) {
                    f4 = f6;
                }
            }
        }
        this.l.postScale(f4, f4, f2, f3);
        c();
    }

    public final void e(Context context) {
        Throwable th;
        Uri uri = this.n;
        if (uri != null) {
            File c = onClickedUbahCC277.c(context, uri);
            InputStream inputStream = null;
            inputStream = null;
            try {
                this.h = onClickedUbahCC277.a(context, this.n);
                inputStream = context.getContentResolver().openInputStream(this.n);
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = this.h;
                    c(new onClickedUbahCC278(BitmapFactory.decodeStream(inputStream, null, options), onClickedUbahCC277.a(c)));
                    onClickedUbahCC277.a(inputStream);
                } catch (IOException | OutOfMemoryError e) {
                    onClickedUbahCC277.a(inputStream);
                } catch (Throwable th2) {
                    th = th2;
                    onClickedUbahCC277.a(inputStream);
                    throw th;
                }
            } catch (IOException | OutOfMemoryError e2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.k;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.b.c(true);
            this.k = null;
        }
        GestureDetector gestureDetector = this.t;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
        setImageBitmap(null);
        onClickedUbahCC278 onclickedubahcc278 = this.e;
        Bitmap bitmap = onclickedubahcc278.c;
        if (bitmap != null) {
            bitmap.recycle();
            onclickedubahcc278.c = null;
        }
        onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        onDraw(canvas);
        if (this.b != null) {
            this.z.reset();
            this.z.addRect(this.b.left, this.b.top, this.b.right, this.b.bottom, Path.Direction.CW);
            getDrawingRect(this.C);
            canvas.clipPath(this.z, Region.Op.DIFFERENCE);
            canvas.drawRect(this.C, this.D);
            canvas.drawPath(this.z, this.B);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int top = getTop();
        int bottom = getBottom();
        int left = getLeft();
        int right = getRight();
        if (top != this.u || bottom != this.p || left != this.s || right != this.r) {
            d();
            this.u = top;
            this.p = bottom;
            this.s = left;
            this.r = right;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        r7 = true;
        boolean z = false;
        if (getDrawable() == null || this.b == null) {
            z = false;
        } else {
            if (motionEvent.getAction() == 0 && (remoteActionCompatParcelizer = this.k) != null) {
                remoteActionCompatParcelizer.b.c(true);
                this.k = null;
            }
            onFocuscc2710 onfocuscc2710 = this.q;
            if (onfocuscc2710 != null) {
                z = onfocuscc2710.b(motionEvent);
            }
            GestureDetector gestureDetector = this.t;
            if (gestureDetector == null || gestureDetector.onTouchEvent(motionEvent)) {
            }
        }
        return z;
    }
}
