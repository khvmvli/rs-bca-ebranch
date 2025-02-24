package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import o.setTranslateX;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setTranslateX$MediaBrowserCompat$MediaItem.class */
public class setTranslateX$MediaBrowserCompat$MediaItem {
    private static final Matrix n = new Matrix();
    Boolean a;
    int b;
    float c;
    float d;
    Paint e;
    Paint f;
    final setTranslateX$MediaBrowserCompat$CustomActionResultReceiver g;
    String h;
    final setThumbTextPadding<String, Object> i;
    float j;
    private int k;
    private final Matrix l;
    float m;

    /* renamed from: o  reason: collision with root package name */
    private final Path f286o;
    private final Path p;
    private PathMeasure s;

    public setTranslateX$MediaBrowserCompat$MediaItem() {
        this.l = new Matrix();
        this.d = 0.0f;
        this.c = 0.0f;
        this.m = 0.0f;
        this.j = 0.0f;
        this.b = 255;
        this.h = null;
        this.a = null;
        this.i = new setThumbTextPadding<>();
        this.g = new setTranslateX$MediaBrowserCompat$CustomActionResultReceiver();
        this.f286o = new Path();
        this.p = new Path();
    }

    public setTranslateX$MediaBrowserCompat$MediaItem(setTranslateX$MediaBrowserCompat$MediaItem settranslatex_mediabrowsercompat_mediaitem) {
        this.l = new Matrix();
        this.d = 0.0f;
        this.c = 0.0f;
        this.m = 0.0f;
        this.j = 0.0f;
        this.b = 255;
        this.h = null;
        this.a = null;
        setThumbTextPadding<String, Object> setthumbtextpadding = new setThumbTextPadding<>();
        this.i = setthumbtextpadding;
        this.g = new setTranslateX$MediaBrowserCompat$CustomActionResultReceiver(settranslatex_mediabrowsercompat_mediaitem.g, setthumbtextpadding);
        this.f286o = new Path(settranslatex_mediabrowsercompat_mediaitem.f286o);
        this.p = new Path(settranslatex_mediabrowsercompat_mediaitem.p);
        this.d = settranslatex_mediabrowsercompat_mediaitem.d;
        this.c = settranslatex_mediabrowsercompat_mediaitem.c;
        this.m = settranslatex_mediabrowsercompat_mediaitem.m;
        this.j = settranslatex_mediabrowsercompat_mediaitem.j;
        this.k = settranslatex_mediabrowsercompat_mediaitem.k;
        this.b = settranslatex_mediabrowsercompat_mediaitem.b;
        this.h = settranslatex_mediabrowsercompat_mediaitem.h;
        String str = settranslatex_mediabrowsercompat_mediaitem.h;
        if (str != null) {
            setthumbtextpadding.put(str, this);
        }
        this.a = settranslatex_mediabrowsercompat_mediaitem.a;
    }

    private void a(setTranslateX$MediaBrowserCompat$CustomActionResultReceiver settranslatex_mediabrowsercompat_customactionresultreceiver, setTranslateX.IconCompatParcelizer iconCompatParcelizer, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        float f = ((float) i) / this.m;
        float f2 = ((float) i2) / this.j;
        float min = Math.min(f, f2);
        Matrix matrix = settranslatex_mediabrowsercompat_customactionresultreceiver.a;
        this.l.set(matrix);
        this.l.postScale(f, f2);
        float c = c(matrix);
        if (c != 0.0f) {
            iconCompatParcelizer.d(this.f286o);
            Path path = this.f286o;
            this.p.reset();
            if (iconCompatParcelizer.c()) {
                this.p.setFillType(iconCompatParcelizer.k == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.p.addPath(path, this.l);
                canvas.clipPath(this.p);
                return;
            }
            setTranslateX.read read = (setTranslateX.read) iconCompatParcelizer;
            if (!(read.l == 0.0f && read.j == 1.0f)) {
                float f3 = read.l;
                float f4 = read.g;
                float f5 = read.j;
                float f6 = read.g;
                if (this.s == null) {
                    this.s = new PathMeasure();
                }
                this.s.setPath(this.f286o, false);
                float length = this.s.getLength();
                float f7 = ((f3 + f4) % 1.0f) * length;
                float f8 = ((f5 + f6) % 1.0f) * length;
                path.reset();
                if (f7 > f8) {
                    this.s.getSegment(f7, length, path, true);
                    this.s.getSegment(0.0f, f8, path, true);
                } else {
                    this.s.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.p.addPath(path, this.l);
            if (read.e.c()) {
                getSystemWindowInsets getsystemwindowinsets = read.e;
                if (this.e == null) {
                    Paint paint = new Paint(1);
                    this.e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.e;
                if (getsystemwindowinsets.b()) {
                    Shader e = getsystemwindowinsets.e();
                    e.setLocalMatrix(this.l);
                    paint2.setShader(e);
                    paint2.setAlpha(Math.round(read.b * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(setTranslateX.b(getsystemwindowinsets.d(), read.b));
                }
                paint2.setColorFilter(colorFilter);
                this.p.setFillType(read.k == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.p, paint2);
            }
            if (read.a.c()) {
                getSystemWindowInsets getsystemwindowinsets2 = read.a;
                if (this.f == null) {
                    Paint paint3 = new Paint(1);
                    this.f = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f;
                if (read.h != null) {
                    paint4.setStrokeJoin(read.h);
                }
                if (read.d != null) {
                    paint4.setStrokeCap(read.d);
                }
                paint4.setStrokeMiter(read.i);
                if (getsystemwindowinsets2.b()) {
                    Shader e2 = getsystemwindowinsets2.e();
                    e2.setLocalMatrix(this.l);
                    paint4.setShader(e2);
                    paint4.setAlpha(Math.round(read.c * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(setTranslateX.b(getsystemwindowinsets2.d(), read.c));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(read.f * min * c);
                canvas.drawPath(this.p, paint4);
            }
        }
    }

    private float c(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float hypot = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
        float hypot2 = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
        float e = e(fArr[0], fArr[1], fArr[2], fArr[3]);
        float max = Math.max(hypot, hypot2);
        float f = 0.0f;
        if (max > 0.0f) {
            f = Math.abs(e) / max;
        }
        return f;
    }

    private void d(setTranslateX$MediaBrowserCompat$CustomActionResultReceiver settranslatex_mediabrowsercompat_customactionresultreceiver, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        settranslatex_mediabrowsercompat_customactionresultreceiver.a.set(matrix);
        settranslatex_mediabrowsercompat_customactionresultreceiver.a.preConcat(settranslatex_mediabrowsercompat_customactionresultreceiver.d);
        canvas.save();
        for (int i3 = 0; i3 < settranslatex_mediabrowsercompat_customactionresultreceiver.e.size(); i3++) {
            setTranslateX.RemoteActionCompatParcelizer remoteActionCompatParcelizer = settranslatex_mediabrowsercompat_customactionresultreceiver.e.get(i3);
            if (remoteActionCompatParcelizer instanceof setTranslateX$MediaBrowserCompat$CustomActionResultReceiver) {
                d((setTranslateX$MediaBrowserCompat$CustomActionResultReceiver) remoteActionCompatParcelizer, settranslatex_mediabrowsercompat_customactionresultreceiver.a, canvas, i, i2, colorFilter);
            } else if (remoteActionCompatParcelizer instanceof setTranslateX.IconCompatParcelizer) {
                a(settranslatex_mediabrowsercompat_customactionresultreceiver, (setTranslateX.IconCompatParcelizer) remoteActionCompatParcelizer, canvas, i, i2, colorFilter);
            }
        }
        canvas.restore();
    }

    private static float e(float f, float f2, float f3, float f4) {
        return (f * f4) - (f2 * f3);
    }

    public void b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        d(this.g, n, canvas, i, i2, colorFilter);
    }

    public boolean d() {
        if (this.a == null) {
            this.a = Boolean.valueOf(this.g.d());
        }
        return this.a.booleanValue();
    }

    public boolean e(int[] iArr) {
        return this.g.a(iArr);
    }

    public float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public int getRootAlpha() {
        return this.b;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.b = i;
    }
}
