package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.security.InvalidParameterException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import o.onChooseORProduct;
import o.pilihJenisKodeBank;
import o.showInfoValueTodayOR;
/* loaded from: classes2-dex2jar.jar:o/onChooseProductOR.class */
public abstract class onChooseProductOR extends View {
    protected static int a;
    protected static int b;
    protected static int c;
    protected static int d;
    protected static int e;
    protected static int f;
    protected static int g;
    protected static int h;
    protected static int i;
    protected static int j;
    protected int A;
    protected int B;
    protected int C;
    protected onChooseProductOR$MediaBrowserCompat$CustomActionResultReceiver D;
    protected int E;
    protected int F;
    protected int G;
    protected int H;
    protected int I;
    private boolean J;
    private String K;
    private final Calendar L;
    protected int M;
    private int N;
    private SimpleDateFormat P;
    private final RemoteActionCompatParcelizer Q;
    private final StringBuilder R;
    private String S;
    protected int k;
    protected int l;
    protected OR2PilihProductFragment m;
    protected int n;

    /* renamed from: o */
    protected final Calendar f67o;
    protected int p;
    protected Paint q;
    protected int r;
    protected int s;
    protected boolean t;
    protected int u;
    protected Paint v;
    protected int w;
    protected Paint x;
    protected int y;
    protected Paint z;

    /* loaded from: classes2-dex2jar.jar:o/onChooseProductOR$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer extends getReenterTransition {
        private final Calendar a;
        private final Rect h = new Rect();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(View view) {
            super(view);
            onChooseProductOR.this = r5;
            this.a = Calendar.getInstance(r5.m.i());
        }

        private CharSequence a(int i) {
            this.a.set(onChooseProductOR.this.M, onChooseProductOR.this.p, i);
            CharSequence format = DateFormat.format("dd MMMM yyyy", this.a.getTimeInMillis());
            return i == onChooseProductOR.this.B ? onChooseProductOR.this.getContext().getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.i, format) : format;
        }

        public final void a(int i, AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setContentDescription(a(i));
        }

        public final boolean c(int i, int i2) {
            if (i2 != 16) {
                return false;
            }
            onChooseProductOR.this.c(i);
            return true;
        }

        public final int e(float f, float f2) {
            int a = onChooseProductOR.this.a(f, f2);
            if (a >= 0) {
                return a;
            }
            return Integer.MIN_VALUE;
        }

        public final void e(int i, getChildFragmentManager getchildfragmentmanager) {
            Rect rect = this.h;
            int i2 = onChooseProductOR.this.n;
            int b = onChooseProductOR.this.b();
            int i3 = onChooseProductOR.this.C;
            int i4 = (onChooseProductOR.this.H - (onChooseProductOR.this.n << 1)) / onChooseProductOR.this.y;
            int a = (i - 1) + onChooseProductOR.this.a();
            int i5 = a / onChooseProductOR.this.y;
            int i6 = i2 + ((a % onChooseProductOR.this.y) * i4);
            int i7 = b + (i5 * i3);
            rect.set(i6, i7, i4 + i6, i3 + i7);
            getchildfragmentmanager.c(a(i));
            getchildfragmentmanager.d(this.h);
            getchildfragmentmanager.e(16);
            if (i == onChooseProductOR.this.B) {
                getchildfragmentmanager.l(true);
            }
        }

        public final void e(List<Integer> list) {
            for (int i = 1; i <= onChooseProductOR.this.w; i++) {
                list.add(Integer.valueOf(i));
            }
        }
    }

    public onChooseProductOR(Context context) {
        this(context, null, null);
    }

    public onChooseProductOR(Context context, AttributeSet attributeSet, OR2PilihProductFragment oR2PilihProductFragment) {
        super(context, attributeSet);
        this.n = 0;
        this.C = c;
        this.t = false;
        this.B = -1;
        this.E = -1;
        this.F = 1;
        this.y = 7;
        this.w = 7;
        this.A = 6;
        this.N = 0;
        this.m = oR2PilihProductFragment;
        Resources resources = context.getResources();
        this.f67o = Calendar.getInstance(this.m.i(), this.m.d());
        this.L = Calendar.getInstance(this.m.i(), this.m.d());
        this.K = resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.j);
        this.S = resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.p);
        OR2PilihProductFragment oR2PilihProductFragment2 = this.m;
        if (oR2PilihProductFragment2 != null && oR2PilihProductFragment2.l()) {
            this.k = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.k);
            this.s = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.j);
            this.l = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.l);
            this.r = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.n);
        } else {
            this.k = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.m);
            this.s = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.g);
            this.l = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.i);
            this.r = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.f81o);
        }
        this.I = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.w);
        this.G = this.m.a();
        this.u = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.w);
        this.R = new StringBuilder(50);
        j = resources.getDimensionPixelSize(pilihJenisKodeBank.write.j);
        g = resources.getDimensionPixelSize(pilihJenisKodeBank.write.i);
        f = resources.getDimensionPixelSize(pilihJenisKodeBank.write.g);
        i = resources.getDimensionPixelOffset(pilihJenisKodeBank.write.l);
        h = resources.getDimensionPixelOffset(pilihJenisKodeBank.write.f84o);
        d = this.m.n() == showInfoValueTodayOR.write.VERSION_1 ? resources.getDimensionPixelSize(pilihJenisKodeBank.write.f) : resources.getDimensionPixelSize(pilihJenisKodeBank.write.h);
        a = resources.getDimensionPixelSize(pilihJenisKodeBank.write.b);
        e = resources.getDimensionPixelSize(pilihJenisKodeBank.write.e);
        if (this.m.n() == showInfoValueTodayOR.write.VERSION_1) {
            this.C = (resources.getDimensionPixelOffset(pilihJenisKodeBank.write.c) - (this.m.n() == showInfoValueTodayOR.write.VERSION_1 ? i : h)) / 6;
        } else {
            this.C = ((resources.getDimensionPixelOffset(pilihJenisKodeBank.write.d) - (this.m.n() == showInfoValueTodayOR.write.VERSION_1 ? i : h)) - (f << 1)) / 6;
        }
        this.n = this.m.n() == showInfoValueTodayOR.write.VERSION_1 ? 0 : context.getResources().getDimensionPixelSize(pilihJenisKodeBank.write.a);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this);
        this.Q = remoteActionCompatParcelizer;
        findFragmentByWho.d(this, remoteActionCompatParcelizer);
        findFragmentByWho.j(this, 1);
        this.J = true;
        this.v = new Paint();
        if (this.m.n() == showInfoValueTodayOR.write.VERSION_1) {
            this.v.setFakeBoldText(true);
        }
        this.v.setAntiAlias(true);
        this.v.setTextSize((float) g);
        this.v.setTypeface(Typeface.create(this.S, 1));
        this.v.setColor(this.k);
        this.v.setTextAlign(Paint.Align.CENTER);
        this.v.setStyle(Paint.Style.FILL);
        Paint paint = new Paint();
        this.z = paint;
        paint.setFakeBoldText(true);
        this.z.setAntiAlias(true);
        this.z.setColor(this.G);
        this.z.setTextAlign(Paint.Align.CENTER);
        this.z.setStyle(Paint.Style.FILL);
        this.z.setAlpha(255);
        Paint paint2 = new Paint();
        this.q = paint2;
        paint2.setAntiAlias(true);
        this.q.setTextSize((float) f);
        this.q.setColor(this.s);
        this.v.setTypeface(Typeface.create(this.K, 1));
        this.q.setStyle(Paint.Style.FILL);
        this.q.setTextAlign(Paint.Align.CENTER);
        this.q.setFakeBoldText(true);
        Paint paint3 = new Paint();
        this.x = paint3;
        paint3.setAntiAlias(true);
        this.x.setTextSize((float) j);
        this.x.setStyle(Paint.Style.FILL);
        this.x.setTextAlign(Paint.Align.CENTER);
        this.x.setFakeBoldText(false);
    }

    private void b(Canvas canvas) {
        int i2 = this.m.n() == showInfoValueTodayOR.write.VERSION_1 ? i : h;
        int i3 = f / 2;
        int i4 = (this.H - (this.n << 1)) / (this.y << 1);
        int i5 = 0;
        while (true) {
            int i6 = this.y;
            if (i5 < i6) {
                int i7 = this.n;
                this.f67o.set(7, (this.F + i5) % i6);
                Calendar calendar = this.f67o;
                Locale d2 = this.m.d();
                if (this.P == null) {
                    this.P = new SimpleDateFormat("EEEEE", d2);
                }
                canvas.drawText(this.P.format(calendar.getTime()), (float) ((((i5 << 1) + 1) * i4) + i7), (float) (i2 - i3), this.q);
                i5++;
            } else {
                return;
            }
        }
    }

    public void c(int i2) {
        if (!this.m.b(this.M, this.p, i2)) {
            onChooseProductOR$MediaBrowserCompat$CustomActionResultReceiver onchooseproductor_mediabrowsercompat_customactionresultreceiver = this.D;
            if (onchooseproductor_mediabrowsercompat_customactionresultreceiver != null) {
                onchooseproductor_mediabrowsercompat_customactionresultreceiver.a(new onChooseORProduct.IconCompatParcelizer(this.M, this.p, i2, this.m.i()));
            }
            this.Q.d(i2, 1);
        }
    }

    private void e(Canvas canvas) {
        int i2 = (this.C + j) / 2;
        int i3 = b;
        int i4 = this.m.n() == showInfoValueTodayOR.write.VERSION_1 ? i : h;
        int i5 = this.H;
        int i6 = this.n;
        int i7 = this.y;
        int i8 = (i5 - (i6 << 1)) / (i7 << 1);
        int i9 = this.N;
        int i10 = this.F;
        int i11 = i9;
        if (i9 < i10) {
            i11 = i9 + i7;
        }
        int i12 = i11 - i10;
        int i13 = (i2 - i3) + i4;
        for (int i14 = 1; i14 <= this.w; i14++) {
            b(canvas, this.M, this.p, i14, (((i12 << 1) + 1) * i8) + this.n, i13);
            int i15 = i12 + 1;
            i13 = i13;
            i12 = i15;
            if (i15 == this.y) {
                i13 += this.C;
                i12 = 0;
            }
        }
    }

    protected final int a() {
        int i2 = this.N;
        int i3 = this.F;
        int i4 = i2;
        if (i2 < i3) {
            i4 = i2 + this.y;
        }
        return i4 - i3;
    }

    public final int a(float f2, float f3) {
        int i2;
        int i3 = this.n;
        float f4 = (float) i3;
        if (f2 < f4 || f2 > ((float) (this.H - i3))) {
            i2 = -1;
        } else {
            int i4 = ((int) (f3 - ((float) (this.m.n() == showInfoValueTodayOR.write.VERSION_1 ? i : h)))) / this.C;
            int i5 = this.y;
            int i6 = (int) (((f2 - f4) * ((float) i5)) / ((float) ((this.H - i3) - this.n)));
            int i7 = this.N;
            int i8 = this.F;
            int i9 = i7;
            if (i7 < i8) {
                i9 = i7 + i5;
            }
            i2 = (i6 - (i9 - i8)) + 1 + (i4 * this.y);
        }
        if (i2 <= 0 || i2 > this.w) {
            return -1;
        }
        return i2;
    }

    protected final boolean a(int i2, int i3, int i4) {
        return this.m.d(i2, i3, i4);
    }

    protected final int b() {
        return this.m.n() == showInfoValueTodayOR.write.VERSION_1 ? i : h;
    }

    public abstract void b(Canvas canvas, int i2, int i3, int i4, int i5, int i6);

    public final int c() {
        return (this.H - (this.n << 1)) / this.y;
    }

    public final boolean c(onChooseORProduct.IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer.d != this.M || iconCompatParcelizer.c != this.p || iconCompatParcelizer.b > this.w) {
            return false;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.Q;
        remoteActionCompatParcelizer.c(onChooseProductOR.this).d(iconCompatParcelizer.b, 64, (Bundle) null);
        return true;
    }

    public final onChooseORProduct.IconCompatParcelizer d() {
        int i2 = ((getReenterTransition) this.Q).c;
        if (i2 >= 0) {
            return new onChooseORProduct.IconCompatParcelizer(this.M, this.p, i2, this.m.i());
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.Q.b(motionEvent) || dispatchHoverEvent(motionEvent);
    }

    public final int e() {
        return this.n;
    }

    public final int f() {
        return (this.m.n() == showInfoValueTodayOR.write.VERSION_1 ? i : h) - (f * (this.m.n() == showInfoValueTodayOR.write.VERSION_1 ? 2 : 3));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2;
        int i3 = this.H / 2;
        if (this.m.n() == showInfoValueTodayOR.write.VERSION_1) {
            i2 = ((this.m.n() == showInfoValueTodayOR.write.VERSION_1 ? i : h) - f) / 2;
        } else {
            i2 = ((this.m.n() == showInfoValueTodayOR.write.VERSION_1 ? i : h) / 2) - f;
        }
        Locale d2 = this.m.d();
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(d2, "MMMM yyyy");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(bestDateTimePattern, d2);
        simpleDateFormat.setTimeZone(this.m.i());
        simpleDateFormat.applyLocalizedPattern(bestDateTimePattern);
        this.R.setLength(0);
        canvas.drawText(simpleDateFormat.format(this.L.getTime()), (float) i3, (float) i2, this.v);
        b(canvas);
        e(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(View.MeasureSpec.getSize(i2), (this.C * this.A) + (this.m.n() == showInfoValueTodayOR.write.VERSION_1 ? i : h));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        this.H = i2;
        this.Q.c();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a2;
        if (motionEvent.getAction() != 1 || (a2 = a(motionEvent.getX(), motionEvent.getY())) < 0) {
            return true;
        }
        c(a2);
        return true;
    }

    @Override // android.view.View
    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        if (!this.J) {
            setAccessibilityDelegate(accessibilityDelegate);
        }
    }

    public void setMonthParams(int i2, int i3, int i4, int i5) {
        if (i4 == -1 && i3 == -1) {
            throw new InvalidParameterException("You must specify month and year for this view");
        }
        this.B = i2;
        this.p = i4;
        this.M = i3;
        Calendar instance = Calendar.getInstance(this.m.i(), this.m.d());
        int i6 = 0;
        this.t = false;
        this.E = -1;
        this.L.set(2, this.p);
        this.L.set(1, this.M);
        this.L.set(5, 1);
        this.N = this.L.get(7);
        if (i5 != -1) {
            this.F = i5;
        } else {
            this.F = this.L.getFirstDayOfWeek();
        }
        this.w = this.L.getActualMaximum(5);
        int i7 = 0;
        while (i7 < this.w) {
            int i8 = i7 + 1;
            i7 = i8;
            if (this.M == instance.get(1) && this.p == instance.get(2) && i8 == instance.get(5)) {
                this.t = true;
                this.E = i8;
                i7 = i8;
            }
        }
        int i9 = this.N;
        int i10 = this.F;
        int i11 = i9;
        if (i9 < i10) {
            i11 = i9 + this.y;
        }
        int i12 = this.w;
        int i13 = this.y;
        int i14 = (i11 - i10) + i12;
        int i15 = i14 / i13;
        if (i14 % i13 > 0) {
            i6 = 1;
        }
        this.A = i15 + i6;
        this.Q.c();
    }

    public void setOnDayClickListener(onChooseProductOR$MediaBrowserCompat$CustomActionResultReceiver onchooseproductor_mediabrowsercompat_customactionresultreceiver) {
        this.D = onchooseproductor_mediabrowsercompat_customactionresultreceiver;
    }

    public void setSelectedDay(int i2) {
        this.B = i2;
    }
}
