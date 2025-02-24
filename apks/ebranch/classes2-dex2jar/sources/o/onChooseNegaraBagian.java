package o;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import o.OR4DataBankPenerimaFragment_ViewBinding;
import o.pilihJenisKodeBank;
/* loaded from: classes2-dex2jar.jar:o/onChooseNegaraBagian.class */
public final class onChooseNegaraBagian extends View {
    private float A;
    private String[] B;
    private float C;
    private float D;
    private Typeface E;
    private Typeface F;
    private read G;
    private int H;
    private int I;
    ObjectAnimator a;
    private float b;
    private float c;
    ObjectAnimator d;
    private float f;
    private boolean g;
    private boolean i;
    private float j;
    private float[] k;
    private float l;
    private float m;
    private float[] n;

    /* renamed from: o */
    private float f66o;
    private String[] p;
    private onChooseNegaraBagian$MediaBrowserCompat$CustomActionResultReceiver r;
    private float s;
    private boolean t;
    private boolean u;
    private float[] v;
    private float[] x;
    private float z;
    private final Paint w = new Paint();
    private final Paint y = new Paint();
    private final Paint h = new Paint();
    int e = -1;
    private boolean q = false;

    /* loaded from: classes2-dex2jar.jar:o/onChooseNegaraBagian$read.class */
    public interface read {
        boolean b(int i);
    }

    public onChooseNegaraBagian(Context context) {
        super(context);
    }

    private void b(Canvas canvas, float f, Typeface typeface, String[] strArr, float[] fArr, float[] fArr2) {
        this.w.setTextSize(f);
        this.w.setTypeface(typeface);
        Paint[] paintArr = new Paint[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            int parseInt = Integer.parseInt(strArr[i]);
            if (parseInt == this.e) {
                paintArr[i] = this.y;
            } else if (this.G.b(parseInt)) {
                paintArr[i] = this.w;
            } else {
                paintArr[i] = this.h;
            }
        }
        canvas.drawText(strArr[0], fArr[3], fArr2[0], paintArr[0]);
        canvas.drawText(strArr[1], fArr[4], fArr2[1], paintArr[1]);
        canvas.drawText(strArr[2], fArr[5], fArr2[2], paintArr[2]);
        canvas.drawText(strArr[3], fArr[6], fArr2[3], paintArr[3]);
        canvas.drawText(strArr[4], fArr[5], fArr2[4], paintArr[4]);
        canvas.drawText(strArr[5], fArr[4], fArr2[5], paintArr[5]);
        canvas.drawText(strArr[6], fArr[3], fArr2[6], paintArr[6]);
        canvas.drawText(strArr[7], fArr[2], fArr2[5], paintArr[7]);
        canvas.drawText(strArr[8], fArr[1], fArr2[4], paintArr[8]);
        canvas.drawText(strArr[9], fArr[0], fArr2[3], paintArr[9]);
        canvas.drawText(strArr[10], fArr[1], fArr2[2], paintArr[10]);
        canvas.drawText(strArr[11], fArr[2], fArr2[1], paintArr[11]);
    }

    private void e(float f, float f2, float f3, float f4, float[] fArr, float[] fArr2) {
        float sqrt = (((float) Math.sqrt(3.0d)) * f) / 2.0f;
        float f5 = f / 2.0f;
        this.w.setTextSize(f4);
        this.y.setTextSize(f4);
        this.h.setTextSize(f4);
        float descent = f3 - ((this.w.descent() + this.w.ascent()) / 2.0f);
        fArr[0] = descent - f;
        fArr2[0] = f2 - f;
        fArr[1] = descent - sqrt;
        fArr2[1] = f2 - sqrt;
        fArr[2] = descent - f5;
        fArr2[2] = f2 - f5;
        fArr[3] = descent;
        fArr2[3] = f2;
        fArr[4] = descent + f5;
        fArr2[4] = f5 + f2;
        fArr[5] = descent + sqrt;
        fArr2[5] = sqrt + f2;
        fArr[6] = descent + f;
        fArr2[6] = f2 + f;
    }

    public final ObjectAnimator b() {
        ObjectAnimator objectAnimator;
        if (this.q && this.i && (objectAnimator = this.d) != null) {
            return objectAnimator;
        }
        Log.e("RadialTextsView", "RadialTextView was not ready for animation.");
        return null;
    }

    public final void b(Context context, String[] strArr, String[] strArr2, onChooseTipeTujuanTransaksiPenerima onchoosetipetujuantransaksipenerima, read read2, boolean z) {
        if (this.q) {
            Log.e("RadialTextsView", "This RadialTextsView may only be initialized once.");
            return;
        }
        Resources resources = context.getResources();
        this.w.setColor(copyWindowDataInto.a(context, onchoosetipetujuantransaksipenerima.h() ? pilihJenisKodeBank.IconCompatParcelizer.w : pilihJenisKodeBank.IconCompatParcelizer.s));
        this.E = Typeface.create(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.r), 0);
        this.F = Typeface.create(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.p), 0);
        this.w.setAntiAlias(true);
        this.w.setTextAlign(Paint.Align.CENTER);
        this.y.setColor(copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.w));
        this.y.setAntiAlias(true);
        this.y.setTextAlign(Paint.Align.CENTER);
        this.h.setColor(copyWindowDataInto.a(context, onchoosetipetujuantransaksipenerima.h() ? pilihJenisKodeBank.IconCompatParcelizer.l : pilihJenisKodeBank.IconCompatParcelizer.i));
        this.h.setAntiAlias(true);
        this.h.setTextAlign(Paint.Align.CENTER);
        this.B = strArr;
        this.p = strArr2;
        boolean a = onchoosetipetujuantransaksipenerima.a();
        this.t = a;
        this.g = strArr2 != null;
        if (a || onchoosetipetujuantransaksipenerima.e() != OR4DataBankPenerimaFragment_ViewBinding.write.VERSION_1) {
            this.f = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.b));
        } else {
            this.f = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.e));
            this.c = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.c));
        }
        this.v = new float[7];
        this.x = new float[7];
        if (this.g) {
            this.s = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.k));
            this.m = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.m));
            if (onchoosetipetujuantransaksipenerima.e() == OR4DataBankPenerimaFragment_ViewBinding.write.VERSION_1) {
                this.z = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.z));
                this.l = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.y));
            } else {
                this.z = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.C));
                this.l = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.D));
            }
            this.n = new float[7];
            this.k = new float[7];
        } else {
            this.s = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.l));
            this.z = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.A));
        }
        this.b = 1.0f;
        int i = -1;
        this.C = (((float) (z ? -1 : 1)) * 0.05f) + 1.0f;
        if (z) {
            i = 1;
        }
        this.D = (((float) i) * 0.3f) + 1.0f;
        this.r = new onChooseNegaraBagian$MediaBrowserCompat$CustomActionResultReceiver(this, (byte) 0);
        this.G = read2;
        this.u = true;
        this.q = true;
    }

    public final ObjectAnimator d() {
        ObjectAnimator objectAnimator;
        if (this.q && this.i && (objectAnimator = this.a) != null) {
            return objectAnimator;
        }
        Log.e("RadialTextsView", "RadialTextView was not ready for animation.");
        return null;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getWidth() != 0 && this.q) {
            if (!this.i) {
                this.I = getWidth() / 2;
                int height = getHeight() / 2;
                this.H = height;
                float min = ((float) Math.min(this.I, height)) * this.f;
                this.j = min;
                if (!this.t) {
                    this.H = (int) (((double) this.H) - (((double) (this.c * min)) * 0.75d));
                }
                this.A = this.z * min;
                if (this.g) {
                    this.f66o = min * this.l;
                }
                ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, this.C), Keyframe.ofFloat(1.0f, this.D)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration(500L);
                this.d = duration;
                duration.addUpdateListener(this.r);
                ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, this.D), Keyframe.ofFloat(0.2f, this.D), Keyframe.ofFloat(0.84f, this.C), Keyframe.ofFloat(1.0f, 1.0f)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.2f, 0.0f), Keyframe.ofFloat(1.0f, 1.0f))).setDuration(625L);
                this.a = duration2;
                duration2.addUpdateListener(this.r);
                this.u = true;
                this.i = true;
            }
            if (this.u) {
                e(this.j * this.s * this.b, (float) this.I, (float) this.H, this.A, this.v, this.x);
                if (this.g) {
                    e(this.j * this.m * this.b, (float) this.I, (float) this.H, this.f66o, this.n, this.k);
                }
                this.u = false;
            }
            b(canvas, this.A, this.E, this.B, this.x, this.v);
            if (this.g) {
                b(canvas, this.f66o, this.F, this.p, this.k, this.n);
            }
        }
    }

    public final void setAnimationRadiusMultiplier(float f) {
        this.b = f;
        this.u = true;
    }
}
