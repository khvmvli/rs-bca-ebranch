package o;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
/* loaded from: classes2-dex2jar.jar:o/KategoriTujuanTransaksiORDialog_ViewBinding.class */
public final class KategoriTujuanTransaksiORDialog_ViewBinding {
    private final JenisKodeBankDialog_ViewBinding[] d = new JenisKodeBankDialog_ViewBinding[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] j = new Matrix[4];
    private final PointF h = new PointF();
    private final Path f = new Path();
    private final Path e = new Path();
    private final JenisKodeBankDialog_ViewBinding l = new JenisKodeBankDialog_ViewBinding();
    private final float[] g = new float[2];
    private final float[] n = new float[2];
    private final Path i = new Path();
    private final Path c = new Path();
    private boolean a = true;

    /* loaded from: classes2-dex2jar.jar:o/KategoriTujuanTransaksiORDialog_ViewBinding$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void a(JenisKodeBankDialog_ViewBinding jenisKodeBankDialog_ViewBinding, Matrix matrix, int i);

        void e(JenisKodeBankDialog_ViewBinding jenisKodeBankDialog_ViewBinding, Matrix matrix, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/KategoriTujuanTransaksiORDialog_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        public final Path a;
        public final IconCompatParcelizer b;
        public final RectF c;
        public final JenisPekerjaanDialog d;
        public final float e;

        RemoteActionCompatParcelizer(JenisPekerjaanDialog jenisPekerjaanDialog, float f, RectF rectF, IconCompatParcelizer iconCompatParcelizer, Path path) {
            this.b = iconCompatParcelizer;
            this.d = jenisPekerjaanDialog;
            this.e = f;
            this.c = rectF;
            this.a = path;
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/KategoriTujuanTransaksiORDialog_ViewBinding$write.class */
    public static final class write {
        public static final KategoriTujuanTransaksiORDialog_ViewBinding a = new KategoriTujuanTransaksiORDialog_ViewBinding();
    }

    public KategoriTujuanTransaksiORDialog_ViewBinding() {
        for (int i = 0; i < 4; i++) {
            this.d[i] = new JenisKodeBankDialog_ViewBinding();
            this.b[i] = new Matrix();
            this.j[i] = new Matrix();
        }
    }

    private void a(int i) {
        this.g[0] = this.d[i].a;
        this.g[1] = this.d[i].e;
        this.b[i].mapPoints(this.g);
        this.j[i].reset();
        Matrix matrix = this.j[i];
        float[] fArr = this.g;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.j[i].preRotate((float) ((i + 1) * 90));
    }

    private void a(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        int i2 = (i + 1) % 4;
        this.g[0] = this.d[i].a;
        this.g[1] = this.d[i].e;
        this.b[i].mapPoints(this.g);
        this.n[0] = this.d[i2].i;
        this.n[1] = this.d[i2].j;
        this.b[i2].mapPoints(this.n);
        float[] fArr = this.g;
        float f = fArr[0];
        float[] fArr2 = this.n;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        RectF rectF = remoteActionCompatParcelizer.c;
        this.g[0] = this.d[i].a;
        this.g[1] = this.d[i].e;
        this.b[i].mapPoints(this.g);
        float abs = (i == 1 || i == 3) ? Math.abs(rectF.centerX() - this.g[0]) : Math.abs(rectF.centerY() - this.g[1]);
        this.l.e(0.0f, 0.0f, 270.0f, 0.0f);
        JenisPekerjaanDialog jenisPekerjaanDialog = remoteActionCompatParcelizer.d;
        (i != 1 ? i != 2 ? i != 3 ? jenisPekerjaanDialog.h : jenisPekerjaanDialog.j : jenisPekerjaanDialog.f : jenisPekerjaanDialog.d).b(max, abs, remoteActionCompatParcelizer.e, this.l);
        this.i.reset();
        this.l.e(this.j[i], this.i);
        if (!this.a || (!a(this.i, i) && !a(this.i, i2))) {
            this.l.e(this.j[i], remoteActionCompatParcelizer.a);
        } else {
            Path path = this.i;
            path.op(path, this.e, Path.Op.DIFFERENCE);
            this.g[0] = this.l.i;
            this.g[1] = this.l.j;
            this.j[i].mapPoints(this.g);
            Path path2 = this.f;
            float[] fArr3 = this.g;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.l.e(this.j[i], this.f);
        }
        if (remoteActionCompatParcelizer.b != null) {
            remoteActionCompatParcelizer.b.a(this.l, this.j[i], i);
        }
    }

    private boolean a(Path path, int i) {
        this.c.reset();
        this.d[i].e(this.b[i], this.c);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.c.computeBounds(rectF, true);
        path.op(this.c, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        boolean z = true;
        if (rectF.isEmpty()) {
            z = rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return z;
    }

    private void b(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        JenisPekerjaanDialog jenisPekerjaanDialog = remoteActionCompatParcelizer.d;
        IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding = i != 1 ? i != 2 ? i != 3 ? jenisPekerjaanDialog.l : jenisPekerjaanDialog.m : jenisPekerjaanDialog.c : jenisPekerjaanDialog.i;
        JenisPekerjaanDialog jenisPekerjaanDialog2 = remoteActionCompatParcelizer.d;
        (i != 1 ? i != 2 ? i != 3 ? jenisPekerjaanDialog2.f37o : jenisPekerjaanDialog2.g : jenisPekerjaanDialog2.a : jenisPekerjaanDialog2.e).b(this.d[i], 90.0f, remoteActionCompatParcelizer.e, isiPernyataanDialog_ViewBinding.e(remoteActionCompatParcelizer.c));
        float f = (float) ((i + 1) * 90);
        this.b[i].reset();
        RectF rectF = remoteActionCompatParcelizer.c;
        PointF pointF = this.h;
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
        this.b[i].setTranslate(this.h.x, this.h.y);
        this.b[i].preRotate(f);
    }

    private void d(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        this.g[0] = this.d[i].i;
        this.g[1] = this.d[i].j;
        this.b[i].mapPoints(this.g);
        if (i == 0) {
            Path path = remoteActionCompatParcelizer.a;
            float[] fArr = this.g;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = remoteActionCompatParcelizer.a;
            float[] fArr2 = this.g;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.d[i].e(this.b[i], remoteActionCompatParcelizer.a);
        if (remoteActionCompatParcelizer.b != null) {
            remoteActionCompatParcelizer.b.e(this.d[i], this.b[i], i);
        }
    }

    public final void b(JenisPekerjaanDialog jenisPekerjaanDialog, float f, RectF rectF, IconCompatParcelizer iconCompatParcelizer, Path path) {
        path.rewind();
        this.f.rewind();
        this.e.rewind();
        this.e.addRect(rectF, Path.Direction.CW);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(jenisPekerjaanDialog, f, rectF, iconCompatParcelizer, path);
        for (int i = 0; i < 4; i++) {
            b(remoteActionCompatParcelizer, i);
            a(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            d(remoteActionCompatParcelizer, i2);
            a(remoteActionCompatParcelizer, i2);
        }
        path.close();
        this.f.close();
        if (!this.f.isEmpty()) {
            path.op(this.f, Path.Op.UNION);
        }
    }
}
