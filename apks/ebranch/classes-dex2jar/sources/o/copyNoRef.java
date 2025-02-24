package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
/* loaded from: classes-dex2jar.jar:o/copyNoRef.class */
public final class copyNoRef {
    private static final ThreadLocal<PathMeasure> a = new ThreadLocal<PathMeasure>() { // from class: o.copyNoRef.5
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> e = new ThreadLocal<Path>() { // from class: o.copyNoRef.2
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> g = new ThreadLocal<Path>() { // from class: o.copyNoRef.1
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> d = new ThreadLocal<float[]>() { // from class: o.copyNoRef.4
        @Override // java.lang.ThreadLocal
        protected final /* bridge */ /* synthetic */ float[] initialValue() {
            return new float[4];
        }
    };
    private static final float b = (float) (Math.sqrt(2.0d) / 2.0d);
    private static float c = -1.0f;

    public static Path a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void a(Path path, OnTouch onTouch) {
        if (onTouch != null && !onTouch.c) {
            d(path, ((OnPageChange) onTouch.a).i() / 100.0f, ((OnPageChange) onTouch.b).i() / 100.0f, ((OnPageChange) onTouch.e).i() / 360.0f);
        }
    }

    public static boolean a(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static int b(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        int i2 = i;
        if (f2 != 0.0f) {
            i2 = (int) (((float) (i * 31)) * f2);
        }
        int i3 = i2;
        if (f3 != 0.0f) {
            i3 = (int) (((float) (i2 * 31)) * f3);
        }
        int i4 = i3;
        if (f4 != 0.0f) {
            i4 = (int) (((float) (i3 * 31)) * f4);
        }
        return i4;
    }

    public static Bitmap b(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static boolean b(Matrix matrix) {
        float[] fArr = d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static float d() {
        if (c == -1.0f) {
            c = Resources.getSystem().getDisplayMetrics().density;
        }
        return c;
    }

    public static float d(Matrix matrix) {
        float[] fArr = d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = b;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }

    public static void d(Canvas canvas, RectF rectF, Paint paint) {
        d(canvas, rectF, paint, 31);
    }

    public static void d(Canvas canvas, RectF rectF, Paint paint, int i) {
        apply.c("Utils#saveLayer");
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        apply.d("Utils#saveLayer");
    }

    public static void d(Path path, float f, float f2, float f3) {
        apply.c("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = a.get();
        Path path2 = e.get();
        Path path3 = g.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            apply.d("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            apply.d("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float min = Math.min(f4, f5);
            float max = Math.max(f4, f5);
            float f6 = f3 * length;
            float f7 = min + f6;
            float f8 = max + f6;
            float f9 = f7;
            float f10 = f8;
            if (f7 >= length) {
                f9 = f7;
                f10 = f8;
                if (f8 >= length) {
                    f9 = (float) BN6PembayaranActivity.c(f7, length);
                    f10 = (float) BN6PembayaranActivity.c(f8, length);
                }
            }
            float f11 = f9;
            if (f9 < 0.0f) {
                f11 = (float) BN6PembayaranActivity.c(f9, length);
            }
            float f12 = f10;
            if (f10 < 0.0f) {
                f12 = (float) BN6PembayaranActivity.c(f10, length);
            }
            int i = (f11 > f12 ? 1 : (f11 == f12 ? 0 : -1));
            if (i == 0) {
                path.reset();
                apply.d("applyTrimPathIfNeeded");
                return;
            }
            float f13 = f11;
            if (i >= 0) {
                f13 = f11 - length;
            }
            path2.reset();
            pathMeasure.getSegment(f13, f12, path2, true);
            if (f12 > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, f12 % length, path3, true);
                path2.addPath(path3);
            } else if (f13 < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(f13 + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            apply.d("applyTrimPathIfNeeded");
        }
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
            }
        }
    }

    public static float e(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static boolean e(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z = false;
        if (i < 4) {
            return false;
        }
        if (i > 4) {
            return true;
        }
        if (i2 < 4) {
            return false;
        }
        if (i2 > 4) {
            return true;
        }
        if (i3 >= 0) {
            z = true;
        }
        return z;
    }
}
