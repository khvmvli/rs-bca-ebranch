package o;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import o.JenisKodeBankDialog_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/JenisKodeBankDialog_ViewBinding.class */
public final class JenisKodeBankDialog_ViewBinding {
    @Deprecated
    public float a;
    boolean b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float i;
    @Deprecated
    public float j;
    private final List<read> h = new ArrayList();
    private final List<MediaDescriptionCompat> g = new ArrayList();

    /* loaded from: classes2-dex2jar.jar:o/JenisKodeBankDialog_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends MediaDescriptionCompat {
        private final write b;

        public IconCompatParcelizer(write write) {
            this.b = write;
        }

        @Override // o.JenisKodeBankDialog_ViewBinding.MediaDescriptionCompat
        public final void e(Matrix matrix, InfoEchannelDialog_ViewBinding infoEchannelDialog_ViewBinding, int i, Canvas canvas) {
            float f = this.b.c;
            float f2 = this.b.d;
            RectF rectF = new RectF(this.b.b, this.b.j, this.b.e, this.b.a);
            boolean z = f2 < 0.0f;
            Path path = infoEchannelDialog_ViewBinding.i;
            if (z) {
                int[] iArr = InfoEchannelDialog_ViewBinding.a;
                iArr[0] = 0;
                iArr[1] = infoEchannelDialog_ViewBinding.f;
                iArr[2] = infoEchannelDialog_ViewBinding.h;
                iArr[3] = infoEchannelDialog_ViewBinding.l;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = (float) (-i);
                rectF.inset(f3, f3);
                int[] iArr2 = InfoEchannelDialog_ViewBinding.a;
                iArr2[0] = 0;
                iArr2[1] = infoEchannelDialog_ViewBinding.l;
                iArr2[2] = infoEchannelDialog_ViewBinding.h;
                iArr2[3] = infoEchannelDialog_ViewBinding.f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f4 = 1.0f - (((float) i) / width);
                float f5 = (1.0f - f4) / 2.0f;
                float[] fArr = InfoEchannelDialog_ViewBinding.c;
                fArr[1] = f4;
                fArr[2] = f5 + f4;
                infoEchannelDialog_ViewBinding.b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, InfoEchannelDialog_ViewBinding.a, fArr, Shader.TileMode.CLAMP));
                canvas.save();
                canvas.concat(matrix);
                canvas.scale(1.0f, rectF.height() / rectF.width());
                if (!z) {
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                    canvas.drawPath(path, infoEchannelDialog_ViewBinding.f34o);
                }
                canvas.drawArc(rectF, f, f2, true, infoEchannelDialog_ViewBinding.b);
                canvas.restore();
            }
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/JenisKodeBankDialog_ViewBinding$MediaDescriptionCompat.class */
    public static abstract class MediaDescriptionCompat {
        static final Matrix e = new Matrix();

        public abstract void e(Matrix matrix, InfoEchannelDialog_ViewBinding infoEchannelDialog_ViewBinding, int i, Canvas canvas);
    }

    /* loaded from: classes2-dex2jar.jar:o/JenisKodeBankDialog_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends read {
        float a;
        float b;

        @Override // o.JenisKodeBankDialog_ViewBinding.read
        public final void e(Matrix matrix, Path path) {
            Matrix matrix2 = this.i;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.a);
            path.transform(matrix);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/JenisKodeBankDialog_ViewBinding$read.class */
    public static abstract class read {
        protected final Matrix i = new Matrix();

        public abstract void e(Matrix matrix, Path path);
    }

    /* loaded from: classes2-dex2jar.jar:o/JenisKodeBankDialog_ViewBinding$write.class */
    public static final class write extends read {
        private static final RectF f = new RectF();
        @Deprecated
        public float a;
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float j;

        public write(float f2, float f3, float f4, float f5) {
            this.b = f2;
            this.j = f3;
            this.e = f4;
            this.a = f5;
        }

        @Override // o.JenisKodeBankDialog_ViewBinding.read
        public final void e(Matrix matrix, Path path) {
            Matrix matrix2 = this.i;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f;
            rectF.set(this.b, this.j, this.e, this.a);
            path.arcTo(rectF, this.c, this.d, false);
            path.transform(matrix);
        }
    }

    public JenisKodeBankDialog_ViewBinding() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    private void d(float f) {
        float f2 = this.d;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = this.a;
                float f5 = this.e;
                write write2 = new write(f4, f5, f4, f5);
                write2.c = this.d;
                write2.d = f3;
                this.g.add(new IconCompatParcelizer(write2));
                this.d = f;
            }
        }
    }

    public final MediaDescriptionCompat c(Matrix matrix) {
        d(this.c);
        final Matrix matrix2 = new Matrix(matrix);
        final ArrayList arrayList = new ArrayList(this.g);
        return new MediaDescriptionCompat() { // from class: o.JenisKodeBankDialog_ViewBinding.3
            @Override // o.JenisKodeBankDialog_ViewBinding.MediaDescriptionCompat
            public final void e(Matrix matrix3, InfoEchannelDialog_ViewBinding infoEchannelDialog_ViewBinding, int i, Canvas canvas) {
                for (MediaDescriptionCompat mediaDescriptionCompat : arrayList) {
                    mediaDescriptionCompat.e(matrix2, infoEchannelDialog_ViewBinding, i, canvas);
                }
            }
        };
    }

    public final void c(float f, float f2) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        remoteActionCompatParcelizer.b = f;
        remoteActionCompatParcelizer.a = f2;
        this.h.add(remoteActionCompatParcelizer);
        JenisKodeBankDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver jenisKodeBankDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = new MediaDescriptionCompat(remoteActionCompatParcelizer, this.a, this.e) { // from class: o.JenisKodeBankDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver
            private final float a;
            private final float c;
            private final JenisKodeBankDialog_ViewBinding.RemoteActionCompatParcelizer d;

            {
                this.d = r4;
                this.c = r5;
                this.a = r6;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public final float c() {
                return (float) Math.toDegrees(Math.atan((double) ((this.d.a - this.a) / (this.d.b - this.c))));
            }

            @Override // o.JenisKodeBankDialog_ViewBinding.MediaDescriptionCompat
            public final void e(Matrix matrix, InfoEchannelDialog_ViewBinding infoEchannelDialog_ViewBinding, int i, Canvas canvas) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.d.a - this.a), (double) (this.d.b - this.c)), 0.0f);
                Matrix matrix2 = new Matrix(matrix);
                matrix2.preTranslate(this.c, this.a);
                matrix2.preRotate(c());
                rectF.bottom += (float) i;
                rectF.offset(0.0f, (float) (-i));
                int[] iArr = InfoEchannelDialog_ViewBinding.d;
                iArr[0] = infoEchannelDialog_ViewBinding.f;
                iArr[1] = infoEchannelDialog_ViewBinding.h;
                iArr[2] = infoEchannelDialog_ViewBinding.l;
                infoEchannelDialog_ViewBinding.g.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, iArr, InfoEchannelDialog_ViewBinding.e, Shader.TileMode.CLAMP));
                canvas.save();
                canvas.concat(matrix2);
                canvas.drawRect(rectF, infoEchannelDialog_ViewBinding.g);
                canvas.restore();
            }
        };
        float c = jenisKodeBankDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.c();
        float c2 = jenisKodeBankDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.c();
        d(c + 270.0f);
        this.g.add(jenisKodeBankDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver);
        this.d = c2 + 270.0f;
        this.a = f;
        this.e = f2;
    }

    public final void e(float f, float f2, float f3, float f4) {
        this.i = f;
        this.j = f2;
        this.a = f;
        this.e = f2;
        this.d = f3;
        this.c = (f3 + f4) % 360.0f;
        this.h.clear();
        this.g.clear();
        this.b = false;
    }

    public final void e(float f, float f2, float f3, float f4, float f5, float f6) {
        write write2 = new write(f, f2, f3, f4);
        write2.c = f5;
        write2.d = f6;
        this.h.add(write2);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(write2);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        float f8 = f5;
        if (z) {
            f8 = (f5 + 180.0f) % 360.0f;
        }
        float f9 = z ? (180.0f + f7) % 360.0f : f7;
        d(f8);
        this.g.add(iconCompatParcelizer);
        this.d = f9;
        double d = (double) f7;
        this.a = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d))));
        this.e = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d))));
    }

    public final void e(Matrix matrix, Path path) {
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            this.h.get(i).e(matrix, path);
        }
    }
}
