package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import o.Page6CFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/Page6CSFragment.class */
public class Page6CSFragment extends ImageView {
    private static final ImageView.ScaleType b = ImageView.ScaleType.CENTER_CROP;
    private static final Bitmap.Config d = Bitmap.Config.ARGB_8888;
    private int a;
    private final Paint c;
    private Bitmap e;
    private final Paint f;
    private int g;
    private int h;
    private BitmapShader i;
    private boolean j;
    private final RectF k;
    private int l;
    private float m;
    private final Paint n;

    /* renamed from: o  reason: collision with root package name */
    private int f46o;
    private float p;
    private boolean q;
    private final RectF r;
    private boolean s;
    private ColorFilter t;
    private final Matrix w;
    private boolean x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/Page6CSFragment$write.class */
    public final class write extends ViewOutlineProvider {
        private write() {
        }

        /* synthetic */ write(Page6CSFragment page6CSFragment, byte b) {
            this();
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Rect rect = new Rect();
            Page6CSFragment.this.k.roundOut(rect);
            outline.setRoundRect(rect, ((float) rect.width()) / 2.0f);
        }
    }

    public Page6CSFragment(Context context) {
        super(context);
        this.r = new RectF();
        this.k = new RectF();
        this.w = new Matrix();
        this.c = new Paint();
        this.f = new Paint();
        this.n = new Paint();
        this.g = -16777216;
        this.f46o = 0;
        this.l = 0;
        c();
    }

    public Page6CSFragment(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Page6CSFragment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = new RectF();
        this.k = new RectF();
        this.w = new Matrix();
        this.c = new Paint();
        this.f = new Paint();
        this.n = new Paint();
        this.g = -16777216;
        this.f46o = 0;
        this.l = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Page6CFragment_ViewBinding.write.d, i, 0);
        this.f46o = obtainStyledAttributes.getDimensionPixelSize(Page6CFragment_ViewBinding.write.a, 0);
        this.g = obtainStyledAttributes.getColor(Page6CFragment_ViewBinding.write.b, -16777216);
        this.j = obtainStyledAttributes.getBoolean(Page6CFragment_ViewBinding.write.c, false);
        if (obtainStyledAttributes.hasValue(Page6CFragment_ViewBinding.write.e)) {
            this.l = obtainStyledAttributes.getColor(Page6CFragment_ViewBinding.write.e, 0);
        } else if (obtainStyledAttributes.hasValue(Page6CFragment_ViewBinding.write.h)) {
            this.l = obtainStyledAttributes.getColor(Page6CFragment_ViewBinding.write.h, 0);
        }
        obtainStyledAttributes.recycle();
        c();
    }

    private void a() {
        float f;
        float f2;
        this.w.set(null);
        float f3 = 0.0f;
        if (((float) this.h) * this.r.height() > this.r.width() * ((float) this.a)) {
            f = this.r.height() / ((float) this.a);
            f3 = (this.r.width() - (((float) this.h) * f)) * 0.5f;
            f2 = 0.0f;
        } else {
            f = this.r.width() / ((float) this.h);
            f2 = (this.r.height() - (((float) this.a) * f)) * 0.5f;
        }
        this.w.setScale(f, f);
        this.w.postTranslate(((float) ((int) (f3 + 0.5f))) + this.r.left, ((float) ((int) (f2 + 0.5f))) + this.r.top);
        this.i.setLocalMatrix(this.w);
    }

    private RectF b() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int min = Math.min(width, height);
        float paddingLeft = ((float) getPaddingLeft()) + (((float) (width - min)) / 2.0f);
        float paddingTop = ((float) getPaddingTop()) + (((float) (height - min)) / 2.0f);
        float f = (float) min;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
    }

    private void c() {
        setScaleType(b);
        this.q = true;
        setOutlineProvider(new write(this, (byte) 0));
        if (this.x) {
            d();
            this.x = false;
        }
    }

    private static Bitmap d(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, d) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), d);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void d() {
        int i;
        if (!this.q) {
            this.x = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            if (this.e == null) {
                invalidate();
                return;
            }
            Bitmap bitmap = this.e;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.i = new BitmapShader(bitmap, tileMode, tileMode);
            this.c.setAntiAlias(true);
            this.c.setShader(this.i);
            this.f.setStyle(Paint.Style.STROKE);
            this.f.setAntiAlias(true);
            this.f.setColor(this.g);
            this.f.setStrokeWidth((float) this.f46o);
            this.n.setStyle(Paint.Style.FILL);
            this.n.setAntiAlias(true);
            this.n.setColor(this.l);
            this.a = this.e.getHeight();
            this.h = this.e.getWidth();
            this.k.set(b());
            this.m = Math.min((this.k.height() - ((float) this.f46o)) / 2.0f, (this.k.width() - ((float) this.f46o)) / 2.0f);
            this.r.set(this.k);
            if (!this.j && (i = this.f46o) > 0) {
                float f = ((float) i) - 1.0f;
                this.r.inset(f, f);
            }
            this.p = Math.min(this.r.height() / 2.0f, this.r.width() / 2.0f);
            Paint paint = this.c;
            if (paint != null) {
                paint.setColorFilter(this.t);
            }
            a();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.t;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return b;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.s) {
            onDraw(canvas);
        } else if (this.e != null) {
            if (this.l != 0) {
                canvas.drawCircle(this.r.centerX(), this.r.centerY(), this.p, this.n);
            }
            canvas.drawCircle(this.r.centerX(), this.r.centerY(), this.p, this.c);
            if (this.f46o > 0) {
                canvas.drawCircle(this.k.centerX(), this.k.centerY(), this.m, this.f);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        onSizeChanged(i, i2, i3, i4);
        d();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i) {
        if (i != this.g) {
            this.g = i;
            this.f.setColor(i);
            invalidate();
        }
    }

    @Deprecated
    public void setBorderColorResource(int i) {
        setBorderColor(getContext().getResources().getColor(i));
    }

    public void setBorderOverlay(boolean z) {
        if (z != this.j) {
            this.j = z;
            d();
        }
    }

    public void setBorderWidth(int i) {
        if (i != this.f46o) {
            this.f46o = i;
            d();
        }
    }

    public void setCircleBackgroundColor(int i) {
        if (i != this.l) {
            this.l = i;
            this.n.setColor(i);
            invalidate();
        }
    }

    public void setCircleBackgroundColorResource(int i) {
        setCircleBackgroundColor(getContext().getResources().getColor(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.t) {
            this.t = colorFilter;
            Paint paint = this.c;
            if (paint != null) {
                paint.setColorFilter(colorFilter);
            }
            invalidate();
        }
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.s != z) {
            this.s = z;
            if (z) {
                this.e = null;
            } else {
                this.e = d(getDrawable());
            }
            d();
        }
    }

    @Deprecated
    public void setFillColor(int i) {
        setCircleBackgroundColor(i);
    }

    @Deprecated
    public void setFillColorResource(int i) {
        setCircleBackgroundColorResource(i);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap);
        if (this.s) {
            this.e = null;
        } else {
            this.e = d(getDrawable());
        }
        d();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        setImageDrawable(drawable);
        if (this.s) {
            this.e = null;
        } else {
            this.e = d(getDrawable());
        }
        d();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        setImageResource(i);
        if (this.s) {
            this.e = null;
        } else {
            this.e = d(getDrawable());
        }
        d();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        setImageURI(uri);
        if (this.s) {
            this.e = null;
        } else {
            this.e = d(getDrawable());
        }
        d();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        setPadding(i, i2, i3, i4);
        d();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        setPaddingRelative(i, i2, i3, i4);
        d();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != b) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }
}
