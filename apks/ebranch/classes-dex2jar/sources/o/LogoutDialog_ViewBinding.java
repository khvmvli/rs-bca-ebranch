package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.BaseDialogKotlin;
import o.FingerprintStatusDialog;
import o.JenisPekerjaanDialog;
/* loaded from: classes-dex2jar.jar:o/LogoutDialog_ViewBinding.class */
public class LogoutDialog_ViewBinding extends LinearLayout {
    private static final int x = BaseDialogKotlin.MediaDescriptionCompat.l;
    private int A;
    private int B;
    private int C;
    private final int D;
    private int E;
    private int F;
    private JenisKodeBankDialog G;
    private int H;
    private int I;
    private ColorStateList J;
    private int K;
    private int L;
    private ColorStateList M;
    private int N;
    private int O;
    private Drawable P;
    private int Q;
    private int R;
    private final SparseArray<LinkActivationDialog> S;
    private PorterDuff.Mode T;
    private View.OnLongClickListener U;
    private int V;
    private final LinearLayout W;
    boolean a;
    private CharSequence aA;
    private Drawable aB;
    private ColorStateList aC;
    private PorterDuff.Mode aD;
    private final LinearLayout aE;
    private final clickedOk aF;
    private View.OnLongClickListener aG;
    private ColorStateList aH;
    private final Rect aI;
    private final Rect aJ;
    private final RectF aK;
    private final TextView aL;
    private Typeface aQ;
    private final clickedOk aa;
    private View.OnLongClickListener ab;
    private ColorStateList ac;
    private int ad;
    private ColorStateList ae;
    private boolean af;
    private int ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private int al;
    private boolean am;
    private int an;
    private int ao;
    private final FrameLayout ap;
    private int aq;
    private boolean ar;
    private ColorStateList as;
    private Drawable at;
    private CharSequence au;
    private int av;
    private TextView aw;
    private int ax;
    private final TextView ay;
    private JenisPekerjaanDialog az;
    JenisKodeBankDialog b;
    int c;
    final FingerprintStatusDialog d;
    int e;
    public EditText f;
    public ColorStateList g;
    boolean h;
    TextView i;
    int j;
    ColorStateList k;
    final clickedOk l;
    final FrameLayout m;
    final LinkedHashSet<RemoteActionCompatParcelizer> n;

    /* renamed from: o */
    final LinkedHashSet<MediaBrowserCompat.CustomActionResultReceiver> f120o;
    boolean p;
    final LinkUbahPINDialog q;
    boolean r;
    CharSequence s;
    public boolean t;
    CharSequence u;
    boolean v;
    boolean w;
    CharSequence y;
    private ValueAnimator z;

    public LogoutDialog_ViewBinding(Context context) {
        this(context, null);
    }

    public LogoutDialog_ViewBinding(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin.MediaBrowserCompat.CustomActionResultReceiver.W);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public LogoutDialog_ViewBinding(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
        // Method dump skipped, instructions count: 2890
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LogoutDialog_ViewBinding.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private int a() {
        float f;
        if (!this.t) {
            return 0;
        }
        int i = this.e;
        if (i == 0 || i == 1) {
            f = this.d.d();
        } else if (i != 2) {
            return 0;
        } else {
            f = this.d.d() / 2.0f;
        }
        return (int) f;
    }

    private int a(int i, boolean z) {
        int compoundPaddingRight = i - this.f.getCompoundPaddingRight();
        int i2 = compoundPaddingRight;
        if (this.aA != null) {
            i2 = compoundPaddingRight;
            if (z) {
                i2 = compoundPaddingRight + (this.ay.getMeasuredWidth() - this.ay.getPaddingRight());
            }
        }
        return i2;
    }

    private void a(EditText editText) {
        if (this.f == null) {
            if (this.V != 3 && !(editText instanceof LogoutDialog)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f = editText;
            setMinWidth(this.ao);
            setMaxWidth(this.aq);
            g();
            setTextInputAccessibilityDelegate(new IconCompatParcelizer(this));
            this.d.d(this.f.getTypeface());
            FingerprintStatusDialog fingerprintStatusDialog = this.d;
            float textSize = this.f.getTextSize();
            if (fingerprintStatusDialog.w != textSize) {
                fingerprintStatusDialog.w = textSize;
                fingerprintStatusDialog.a();
            }
            int gravity = this.f.getGravity();
            FingerprintStatusDialog fingerprintStatusDialog2 = this.d;
            int i = (gravity & -113) | 48;
            if (fingerprintStatusDialog2.l != i) {
                fingerprintStatusDialog2.l = i;
                fingerprintStatusDialog2.a();
            }
            FingerprintStatusDialog fingerprintStatusDialog3 = this.d;
            if (fingerprintStatusDialog3.v != gravity) {
                fingerprintStatusDialog3.v = gravity;
                fingerprintStatusDialog3.a();
            }
            this.f.addTextChangedListener(new 5(this));
            if (this.g == null) {
                this.g = this.f.getHintTextColors();
            }
            if (this.t) {
                if (TextUtils.isEmpty(this.s)) {
                    CharSequence hint = this.f.getHint();
                    this.au = hint;
                    setHint(hint);
                    this.f.setHint((CharSequence) null);
                }
                this.r = true;
            }
            if (this.i != null) {
                c(this.f.getText().length());
            }
            e();
            this.q.a();
            this.aE.bringToFront();
            this.W.bringToFront();
            this.m.bringToFront();
            this.aa.bringToFront();
            Iterator<MediaBrowserCompat.CustomActionResultReceiver> it = this.f120o.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
            q();
            u();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            b(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private static void a(clickedOk clickedok, View.OnLongClickListener onLongClickListener) {
        boolean A = findFragmentByWho.A(clickedok);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (A || z2) {
            z = true;
        }
        clickedok.setFocusable(z);
        clickedok.setClickable(A);
        clickedok.setPressable(A);
        clickedok.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        findFragmentByWho.j(clickedok, i);
    }

    private void a(boolean z) {
        ValueAnimator valueAnimator = this.z;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.z.cancel();
        }
        if (!z || !this.ai) {
            this.d.e(1.0f);
        } else {
            d(1.0f);
        }
        int i = 0;
        this.p = false;
        if (b()) {
            h();
        }
        EditText editText = this.f;
        if (editText != null) {
            i = editText.getText().length();
        }
        if (i != 0 || this.p) {
            TextView textView = this.aw;
            if (textView != null && this.w) {
                textView.setText((CharSequence) null);
                this.aw.setVisibility(4);
            }
        } else {
            n();
        }
        s();
        w();
    }

    private boolean b() {
        return this.t && !TextUtils.isEmpty(this.s) && (this.b instanceof LimitPengaturanPINDialog);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void c() {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LogoutDialog_ViewBinding.c():void");
    }

    private static void c(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? BaseDialogKotlin.MediaBrowserCompat.SearchResultReceiver.c : BaseDialogKotlin.MediaBrowserCompat.SearchResultReceiver.a, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private static void c(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                c((ViewGroup) childAt, z);
            }
        }
    }

    private void c(boolean z) {
        if (this.w != z) {
            if (z) {
                setTypeface settypeface = new setTypeface(getContext());
                this.aw = settypeface;
                settypeface.setId(BaseDialogKotlin.MediaBrowserCompat.ItemReceiver.ab);
                findFragmentByWho.a(this.aw, 1);
                setPlaceholderTextAppearance(this.av);
                setPlaceholderTextColor(this.as);
                TextView textView = this.aw;
                if (textView != null) {
                    this.ap.addView(textView);
                    this.aw.setVisibility(0);
                }
            } else {
                TextView textView2 = this.aw;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                this.aw = null;
            }
            this.w = z;
        }
    }

    private void d(float f) {
        if (this.d.t != f) {
            if (this.z == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.z = valueAnimator;
                valueAnimator.setInterpolator(unbindViews.d);
                this.z.setDuration(167L);
                this.z.addUpdateListener(new 1(this));
            }
            this.z.setFloatValues(this.d.t, f);
            this.z.start();
        }
    }

    private void d(boolean z) {
        ValueAnimator valueAnimator = this.z;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.z.cancel();
        }
        if (!z || !this.ai) {
            this.d.e(0.0f);
        } else {
            d(0.0f);
        }
        if (b() && (!this.b.d.isEmpty()) && b()) {
            this.b.a(0.0f, 0.0f, 0.0f, 0.0f);
        }
        this.p = true;
        TextView textView = this.aw;
        if (textView != null && this.w) {
            textView.setText((CharSequence) null);
            this.aw.setVisibility(4);
        }
        s();
        w();
    }

    private int e(int i, boolean z) {
        int compoundPaddingLeft = i + this.f.getCompoundPaddingLeft();
        int i2 = compoundPaddingLeft;
        if (this.aA != null) {
            i2 = compoundPaddingLeft;
            if (!z) {
                i2 = (compoundPaddingLeft - this.ay.getMeasuredWidth()) + this.ay.getPaddingLeft();
            }
        }
        return i2;
    }

    private void e(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.s)) {
            this.s = charSequence;
            FingerprintStatusDialog fingerprintStatusDialog = this.d;
            if (charSequence == null || !TextUtils.equals(fingerprintStatusDialog.F, charSequence)) {
                fingerprintStatusDialog.F = charSequence;
                fingerprintStatusDialog.H = null;
                Bitmap bitmap = fingerprintStatusDialog.u;
                if (bitmap != null) {
                    bitmap.recycle();
                    fingerprintStatusDialog.u = null;
                }
                fingerprintStatusDialog.a();
            }
            if (!this.p) {
                h();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r6 != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static void e(o.clickedOk r3, boolean r4, android.content.res.ColorStateList r5, boolean r6, android.graphics.PorterDuff.Mode r7) {
        /*
            r0 = r3
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r8 = r0
            r0 = r8
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L_0x0042
            r0 = r4
            if (r0 != 0) goto L_0x001b
            r0 = r8
            r9 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0042
        L_0x001b:
            r0 = r8
            android.graphics.drawable.Drawable r0 = o.getInsetsForType.h(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r8 = r0
            r0 = r4
            if (r0 == 0) goto L_0x002f
            r0 = r8
            r1 = r5
            o.getInsetsForType.e(r0, r1)
        L_0x002f:
            r0 = r8
            r9 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0042
            r0 = r8
            r1 = r7
            o.getInsetsForType.d(r0, r1)
            r0 = r8
            r9 = r0
        L_0x0042:
            r0 = r3
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r1 = r9
            if (r0 == r1) goto L_0x0051
            r0 = r3
            r1 = r9
            r0.setImageDrawable(r1)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LogoutDialog_ViewBinding.e(o.clickedOk, boolean, android.content.res.ColorStateList, boolean, android.graphics.PorterDuff$Mode):void");
    }

    private void e(boolean z) {
        int i = 8;
        boolean z2 = false;
        this.aa.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.m;
        if (!z) {
            i = 0;
        }
        frameLayout.setVisibility(i);
        u();
        if (this.V != 0) {
            z2 = true;
        }
        if (!z2) {
            t();
        }
    }

    private void e(boolean z, boolean z2) {
        int defaultColor = this.aH.getDefaultColor();
        int colorForState = this.aH.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.aH.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.B = colorForState2;
        } else if (z2) {
            this.B = colorForState;
        } else {
            this.B = defaultColor;
        }
    }

    private clickedOk f() {
        if (this.aa.getVisibility() == 0) {
            return this.aa;
        }
        boolean z = true;
        if (!(this.V != 0)) {
            return null;
        }
        if (this.m.getVisibility() != 0 || this.l.getVisibility() != 0) {
            z = false;
        }
        if (z) {
            return this.l;
        }
        return null;
    }

    private void g() {
        int i = this.e;
        boolean z = true;
        if (i == 0) {
            this.b = null;
            this.G = null;
        } else if (i == 1) {
            this.b = new JenisKodeBankDialog(this.az);
            this.G = new JenisKodeBankDialog();
        } else if (i == 2) {
            if (!this.t || (this.b instanceof LimitPengaturanPINDialog)) {
                this.b = new JenisKodeBankDialog(this.az);
            } else {
                this.b = new LimitPengaturanPINDialog(this.az);
            }
            this.G = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.e);
            sb.append(" is illegal; only @BoxBackgroundMode constants are supported.");
            throw new IllegalArgumentException(sb.toString());
        }
        EditText editText = this.f;
        if ((editText == null || this.b == null || editText.getBackground() != null || this.e == 0) ? false : true) {
            findFragmentByWho.b((View) this.f, (Drawable) this.b);
        }
        d();
        if (this.e == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.A = getResources().getDimensionPixelSize(BaseDialogKotlin.read.x);
            } else {
                if (getContext().getResources().getConfiguration().fontScale >= 1.3f) {
                    this.A = getResources().getDimensionPixelSize(BaseDialogKotlin.read.r);
                }
            }
        }
        if (this.f != null && this.e == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText2 = this.f;
                findFragmentByWho.c(editText2, findFragmentByWho.t(editText2), getResources().getDimensionPixelSize(BaseDialogKotlin.read.s), findFragmentByWho.s(this.f), getResources().getDimensionPixelSize(BaseDialogKotlin.read.q));
            } else {
                if (getContext().getResources().getConfiguration().fontScale < 1.3f) {
                    z = false;
                }
                if (z) {
                    EditText editText3 = this.f;
                    findFragmentByWho.c(editText3, findFragmentByWho.t(editText3), getResources().getDimensionPixelSize(BaseDialogKotlin.read.t), findFragmentByWho.s(this.f), getResources().getDimensionPixelSize(BaseDialogKotlin.read.p));
                }
            }
        }
        if (this.e != 0) {
            p();
        }
    }

    private void g(boolean z) {
        if (!z || this.l.getDrawable() == null) {
            e(this.l, this.ah, this.k, this.ak, this.T);
            return;
        }
        Drawable mutate = getInsetsForType.h(this.l.getDrawable()).mutate();
        TextView textView = this.q.i;
        getInsetsForType.b(mutate, textView != null ? textView.getCurrentTextColor() : -1);
        this.l.setImageDrawable(mutate);
    }

    private void h() {
        if (b()) {
            RectF rectF = this.aK;
            this.d.e(rectF, this.f.getWidth(), this.f.getGravity());
            rectF.left -= (float) this.D;
            rectF.right += (float) this.D;
            this.C = this.H;
            rectF.top = 0.0f;
            rectF.bottom = (float) this.C;
            rectF.offset((float) (-getPaddingLeft()), 0.0f);
            this.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        if ((r2.m.getVisibility() == 0 && r2.l.getVisibility() == 0) == false) goto L_0x003f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r2.y != null) goto L_0x0046;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r2.W.getMeasuredWidth() > 0) goto L_0x0055;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean i() {
        /*
            r2 = this;
            r0 = r2
            o.clickedOk r0 = r0.aa
            int r0 = r0.getVisibility()
            r3 = r0
            r0 = 1
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0046
            r0 = r2
            int r0 = r0.V
            if (r0 == 0) goto L_0x001a
            r0 = 1
            r3 = r0
            goto L_0x001c
        L_0x001a:
            r0 = 0
            r3 = r0
        L_0x001c:
            r0 = r3
            if (r0 == 0) goto L_0x003f
            r0 = r2
            android.widget.FrameLayout r0 = r0.m
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0039
            r0 = r2
            o.clickedOk r0 = r0.l
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0039
            r0 = 1
            r3 = r0
            goto L_0x003b
        L_0x0039:
            r0 = 0
            r3 = r0
        L_0x003b:
            r0 = r3
            if (r0 != 0) goto L_0x0046
        L_0x003f:
            r0 = r2
            java.lang.CharSequence r0 = r0.y
            if (r0 == 0) goto L_0x0053
        L_0x0046:
            r0 = r2
            android.widget.LinearLayout r0 = r0.W
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r0 = 0
            r4 = r0
        L_0x0055:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LogoutDialog_ViewBinding.i():boolean");
    }

    private LinkActivationDialog j() {
        LinkActivationDialog linkActivationDialog = this.S.get(this.V);
        LinkActivationDialog linkActivationDialog2 = linkActivationDialog;
        if (linkActivationDialog == null) {
            linkActivationDialog2 = this.S.get(0);
        }
        return linkActivationDialog2;
    }

    private void k() {
        if (this.i != null) {
            EditText editText = this.f;
            c(editText == null ? 0 : editText.getText().length());
        }
    }

    private void l() {
        if (b() && !this.p && this.C != this.H) {
            if (b()) {
                this.b.a(0.0f, 0.0f, 0.0f, 0.0f);
            }
            h();
        }
    }

    private boolean m() {
        return !(this.aF.getDrawable() == null && this.aA == null) && this.aE.getMeasuredWidth() > 0;
    }

    private void n() {
        TextView textView = this.aw;
        if (textView != null && this.w) {
            textView.setText(this.u);
            this.aw.setVisibility(0);
            this.aw.bringToFront();
        }
    }

    private void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.i;
        if (textView != null) {
            b(textView, this.h ? this.I : this.L);
            if (!this.h && (colorStateList2 = this.J) != null) {
                this.i.setTextColor(colorStateList2);
            }
            if (this.h && (colorStateList = this.M) != null) {
                this.i.setTextColor(colorStateList);
            }
        }
    }

    private void p() {
        if (this.e != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ap.getLayoutParams();
            int a = a();
            if (a != layoutParams.topMargin) {
                layoutParams.topMargin = a;
                this.ap.requestLayout();
            }
        }
    }

    private void q() {
        if (this.f != null) {
            int i = 0;
            if (!(this.aF.getVisibility() == 0)) {
                i = findFragmentByWho.t(this.f);
            }
            findFragmentByWho.c(this.ay, i, this.f.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(BaseDialogKotlin.read.u), this.f.getCompoundPaddingBottom());
        }
    }

    private void r() {
        EditText editText = this.f;
        if ((editText == null ? 0 : editText.getText().length()) != 0 || this.p) {
            TextView textView = this.aw;
            if (textView != null && this.w) {
                textView.setText((CharSequence) null);
                this.aw.setVisibility(4);
                return;
            }
            return;
        }
        n();
    }

    private void s() {
        this.ay.setVisibility((this.aA == null || this.p) ? 8 : 0);
        t();
    }

    private boolean t() {
        if (this.f == null) {
            return false;
        }
        boolean z = true;
        if (m()) {
            int measuredWidth = this.aE.getMeasuredWidth() - this.f.getPaddingLeft();
            if (this.aB == null || this.ax != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.aB = colorDrawable;
                this.ax = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] b = getParentFragment.b(this.f);
            Drawable drawable = b[0];
            Drawable drawable2 = this.aB;
            if (drawable != drawable2) {
                getParentFragment.c(this.f, drawable2, b[1], b[2], b[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.aB != null) {
                Drawable[] b2 = getParentFragment.b(this.f);
                getParentFragment.c(this.f, null, b2[1], b2[2], b2[3]);
                this.aB = null;
                z = true;
            }
            z = false;
        }
        if (i()) {
            int measuredWidth2 = this.aL.getMeasuredWidth() - this.f.getPaddingRight();
            clickedOk f = f();
            int i = measuredWidth2;
            if (f != null) {
                i = measuredWidth2 + f.getMeasuredWidth() + requireDialog.b((ViewGroup.MarginLayoutParams) f.getLayoutParams());
            }
            Drawable[] b3 = getParentFragment.b(this.f);
            Drawable drawable3 = this.P;
            if (drawable3 == null || this.O == i) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.P = colorDrawable2;
                    this.O = i;
                    colorDrawable2.setBounds(0, 0, i, 1);
                }
                Drawable drawable4 = b3[2];
                Drawable drawable5 = this.P;
                if (drawable4 != drawable5) {
                    this.at = drawable4;
                    getParentFragment.c(this.f, b3[0], b3[1], drawable5, b3[3]);
                    z = true;
                }
            } else {
                this.O = i;
                drawable3.setBounds(0, 0, i, 1);
                getParentFragment.c(this.f, b3[0], b3[1], this.P, b3[3]);
                z = true;
            }
        } else {
            z = z;
            if (this.P != null) {
                Drawable[] b4 = getParentFragment.b(this.f);
                if (b4[2] == this.P) {
                    getParentFragment.c(this.f, b4[0], b4[1], this.at, b4[3]);
                }
                this.P = null;
            }
            return z;
        }
        return z;
    }

    private void u() {
        if (this.f != null) {
            boolean z = true;
            int i = 0;
            if (!(this.m.getVisibility() == 0 && this.l.getVisibility() == 0)) {
                if (this.aa.getVisibility() != 0) {
                    z = false;
                }
                i = 0;
                if (!z) {
                    i = findFragmentByWho.s(this.f);
                }
            }
            findFragmentByWho.c(this.aL, getContext().getResources().getDimensionPixelSize(BaseDialogKotlin.read.u), this.f.getPaddingTop(), i, this.f.getPaddingBottom());
        }
    }

    private void w() {
        int visibility = this.aL.getVisibility();
        int i = 0;
        boolean z = this.y != null && !this.p;
        TextView textView = this.aL;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.aL.getVisibility()) {
            j().e(z);
        }
        t();
    }

    void a(int i) {
        if (i != 0 || this.p) {
            TextView textView = this.aw;
            if (textView != null && this.w) {
                textView.setText((CharSequence) null);
                this.aw.setVisibility(4);
                return;
            }
            return;
        }
        n();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.ap.addView(view, layoutParams2);
            this.ap.setLayoutParams(layoutParams);
            p();
            a((EditText) view);
            return;
        }
        addView(view, i, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final void b(android.widget.TextView r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r7 = r0
            r0 = r5
            r1 = r6
            o.getParentFragment.e(r0, r1)     // Catch: Exception -> 0x0028
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x0028
            r1 = 23
            if (r0 < r1) goto L_0x0023
            r0 = r5
            android.content.res.ColorStateList r0 = r0.getTextColors()     // Catch: Exception -> 0x0028
            int r0 = r0.getDefaultColor()     // Catch: Exception -> 0x0028
            r6 = r0
            r0 = r6
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r0 != r1) goto L_0x0023
            r0 = r7
            r6 = r0
            goto L_0x002c
        L_0x0023:
            r0 = 0
            r6 = r0
            goto L_0x002c
        L_0x0028:
            r8 = move-exception
            r0 = r7
            r6 = r0
        L_0x002c:
            r0 = r6
            if (r0 == 0) goto L_0x0045
            r0 = r5
            int r1 = o.BaseDialogKotlin.MediaDescriptionCompat.d
            o.getParentFragment.e(r0, r1)
            r0 = r5
            r1 = r4
            android.content.Context r1 = r1.getContext()
            int r2 = o.BaseDialogKotlin.RemoteActionCompatParcelizer.a
            int r1 = o.copyWindowDataInto.a(r1, r2)
            r0.setTextColor(r1)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LogoutDialog_ViewBinding.b(android.widget.TextView, int):void");
    }

    final void b(boolean z) {
        b(z, false);
    }

    void b(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean b = this.q.b();
        ColorStateList colorStateList2 = this.g;
        if (colorStateList2 != null) {
            FingerprintStatusDialog fingerprintStatusDialog = this.d;
            if (fingerprintStatusDialog.h != colorStateList2) {
                fingerprintStatusDialog.h = colorStateList2;
                fingerprintStatusDialog.a();
            }
            FingerprintStatusDialog fingerprintStatusDialog2 = this.d;
            ColorStateList colorStateList3 = this.g;
            if (fingerprintStatusDialog2.x != colorStateList3) {
                fingerprintStatusDialog2.x = colorStateList3;
                fingerprintStatusDialog2.a();
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.g;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.Q) : this.Q;
            FingerprintStatusDialog fingerprintStatusDialog3 = this.d;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (fingerprintStatusDialog3.h != valueOf) {
                fingerprintStatusDialog3.h = valueOf;
                fingerprintStatusDialog3.a();
            }
            FingerprintStatusDialog fingerprintStatusDialog4 = this.d;
            ColorStateList valueOf2 = ColorStateList.valueOf(colorForState);
            if (fingerprintStatusDialog4.x != valueOf2) {
                fingerprintStatusDialog4.x = valueOf2;
                fingerprintStatusDialog4.a();
            }
        } else if (b) {
            FingerprintStatusDialog fingerprintStatusDialog5 = this.d;
            TextView textView2 = this.q.i;
            ColorStateList textColors = textView2 != null ? textView2.getTextColors() : null;
            if (fingerprintStatusDialog5.h != textColors) {
                fingerprintStatusDialog5.h = textColors;
                fingerprintStatusDialog5.a();
            }
        } else if (this.h && (textView = this.i) != null) {
            FingerprintStatusDialog fingerprintStatusDialog6 = this.d;
            ColorStateList textColors2 = textView.getTextColors();
            if (fingerprintStatusDialog6.h != textColors2) {
                fingerprintStatusDialog6.h = textColors2;
                fingerprintStatusDialog6.a();
            }
        } else if (z4 && (colorStateList = this.ae) != null) {
            FingerprintStatusDialog fingerprintStatusDialog7 = this.d;
            if (fingerprintStatusDialog7.h != colorStateList) {
                fingerprintStatusDialog7.h = colorStateList;
                fingerprintStatusDialog7.a();
            }
        }
        if (z3 || !this.af || (isEnabled() && z4)) {
            if (z2 || this.p) {
                a(z);
            }
        } else if (z2 || !this.p) {
            d(z);
        }
    }

    final void c(int i) {
        boolean z = this.h;
        int i2 = this.j;
        if (i2 == -1) {
            this.i.setText(String.valueOf(i));
            this.i.setContentDescription(null);
            this.h = false;
        } else {
            this.h = i > i2;
            c(getContext(), this.i, i, this.j, this.h);
            if (z != this.h) {
                o();
            }
            this.i.setText(dismissAllowingStateLoss.d().d(getContext().getString(BaseDialogKotlin.MediaBrowserCompat.SearchResultReceiver.b, Integer.valueOf(i), Integer.valueOf(this.j))));
        }
        if (this.f != null && z != this.h) {
            b(false, false);
            d();
            e();
        }
    }

    final void d() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.b != null && this.e != 0) {
            boolean z = isFocused() || ((editText2 = this.f) != null && editText2.hasFocus());
            boolean z2 = isHovered() || ((editText = this.f) != null && editText.isHovered());
            if (!isEnabled()) {
                this.B = this.Q;
            } else if (this.q.b()) {
                if (this.aH != null) {
                    e(z, z2);
                } else {
                    TextView textView2 = this.q.i;
                    this.B = textView2 != null ? textView2.getCurrentTextColor() : -1;
                }
            } else if (!this.h || (textView = this.i) == null) {
                if (z) {
                    this.B = this.ag;
                } else if (z2) {
                    this.B = this.an;
                } else {
                    this.B = this.K;
                }
            } else if (this.aH != null) {
                e(z, z2);
            } else {
                this.B = textView.getCurrentTextColor();
            }
            boolean z3 = false;
            if (this.aa.getDrawable() != null) {
                z3 = false;
                if (this.q.d) {
                    z3 = false;
                    if (this.q.b()) {
                        z3 = true;
                    }
                }
            }
            e(z3);
            d(this.aa, this.ac);
            d(this.aF, this.aC);
            d(this.l, this.k);
            if (j().a()) {
                g(this.q.b());
            }
            if (!z || !isEnabled()) {
                this.H = this.F;
            } else {
                this.H = this.E;
            }
            if (this.e == 2) {
                l();
            }
            if (this.e == 1) {
                if (!isEnabled()) {
                    this.c = this.R;
                } else if (z2 && !z) {
                    this.c = this.al;
                } else if (z) {
                    this.c = this.ad;
                } else {
                    this.c = this.N;
                }
            }
            c();
        }
    }

    void d(clickedOk clickedok, ColorStateList colorStateList) {
        Drawable drawable = clickedok.getDrawable();
        if (clickedok.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = getDrawableState();
            int[] drawableState2 = clickedok.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = getInsetsForType.h(drawable).mutate();
            getInsetsForType.e(mutate, ColorStateList.valueOf(colorForState));
            clickedok.setImageDrawable(mutate);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f;
        if (editText == null) {
            dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.au != null) {
            boolean z = this.r;
            this.r = false;
            CharSequence hint = editText.getHint();
            this.f.setHint(this.au);
            try {
                dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.f.setHint(hint);
                this.r = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.ap.getChildCount());
            for (int i2 = 0; i2 < this.ap.getChildCount(); i2++) {
                View childAt = this.ap.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f) {
                    newChild.setHint(this.t ? this.s : null);
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.v = true;
        dispatchRestoreInstanceState(sparseArray);
        this.v = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        draw(canvas);
        if (this.t) {
            FingerprintStatusDialog fingerprintStatusDialog = this.d;
            int save = canvas.save();
            if (fingerprintStatusDialog.H != null && fingerprintStatusDialog.q) {
                float lineStart = fingerprintStatusDialog.B > 1 ? (float) fingerprintStatusDialog.I.getLineStart(0) : fingerprintStatusDialog.I.getLineLeft(0);
                float f = fingerprintStatusDialog.k;
                float f2 = fingerprintStatusDialog.r;
                fingerprintStatusDialog.G.setTextSize(fingerprintStatusDialog.m);
                float f3 = fingerprintStatusDialog.k;
                float f4 = fingerprintStatusDialog.n;
                boolean z = fingerprintStatusDialog.K && fingerprintStatusDialog.u != null;
                float f5 = fingerprintStatusDialog.A;
                if (f5 != 1.0f && !fingerprintStatusDialog.C) {
                    canvas.scale(f5, f5, f3, f4);
                }
                if (z) {
                    canvas.drawBitmap(fingerprintStatusDialog.u, f3, f4, fingerprintStatusDialog.N);
                } else if (!fingerprintStatusDialog.c() || (fingerprintStatusDialog.C && fingerprintStatusDialog.t <= fingerprintStatusDialog.D)) {
                    canvas.translate(f3, f4);
                    fingerprintStatusDialog.I.draw(canvas);
                } else {
                    int alpha = fingerprintStatusDialog.G.getAlpha();
                    canvas.translate((f + lineStart) - (f2 * 2.0f), f4);
                    TextPaint textPaint = fingerprintStatusDialog.G;
                    float f6 = fingerprintStatusDialog.y;
                    float f7 = (float) alpha;
                    textPaint.setAlpha((int) (f6 * f7));
                    fingerprintStatusDialog.I.draw(canvas);
                    fingerprintStatusDialog.G.setAlpha((int) (fingerprintStatusDialog.g * f7));
                    int lineBaseline = fingerprintStatusDialog.I.getLineBaseline(0);
                    CharSequence charSequence = fingerprintStatusDialog.L;
                    int length = charSequence.length();
                    float f8 = (float) lineBaseline;
                    canvas.drawText(charSequence, 0, length, 0.0f, f8, fingerprintStatusDialog.G);
                    if (!fingerprintStatusDialog.C) {
                        String trim = fingerprintStatusDialog.L.toString().trim();
                        String str = trim;
                        if (trim.endsWith("…")) {
                            str = trim.substring(0, trim.length() - 1);
                        }
                        fingerprintStatusDialog.G.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(fingerprintStatusDialog.I.getLineEnd(0), str.length()), 0.0f, f8, (Paint) fingerprintStatusDialog.G);
                    }
                }
                canvas.restoreToCount(save);
            }
        }
        JenisKodeBankDialog jenisKodeBankDialog = this.G;
        if (jenisKodeBankDialog != null) {
            Rect bounds = jenisKodeBankDialog.getBounds();
            bounds.top = bounds.bottom - this.H;
            this.G.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    @Override // android.view.View, android.view.ViewGroup
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected void drawableStateChanged() {
        /*
            r4 = this;
            r0 = r4
            boolean r0 = r0.ar
            if (r0 == 0) goto L_0x0008
            return
        L_0x0008:
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            r0.ar = r1
            r0 = r4
            r0.drawableStateChanged()
            r0 = r4
            int[] r0 = r0.getDrawableState()
            r6 = r0
            r0 = r4
            o.FingerprintStatusDialog r0 = r0.d
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L_0x005e
            r0 = r7
            r1 = r6
            r0.E = r1
            r0 = r7
            android.content.res.ColorStateList r0 = r0.h
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0036
            r0 = r6
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0046
        L_0x0036:
            r0 = r7
            android.content.res.ColorStateList r0 = r0.x
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L_0x004c
            r0 = r6
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x004c
        L_0x0046:
            r0 = 1
            r8 = r0
            goto L_0x004f
        L_0x004c:
            r0 = 0
            r8 = r0
        L_0x004f:
            r0 = r8
            if (r0 == 0) goto L_0x005e
            r0 = r7
            r0.a()
            r0 = 1
            r8 = r0
            goto L_0x0061
        L_0x005e:
            r0 = 0
            r8 = r0
        L_0x0061:
            r0 = r4
            android.widget.EditText r0 = r0.f
            if (r0 == 0) goto L_0x007e
            r0 = r4
            boolean r0 = o.findFragmentByWho.G(r0)
            if (r0 == 0) goto L_0x0076
            r0 = r4
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x0078
        L_0x0076:
            r0 = 0
            r5 = r0
        L_0x0078:
            r0 = r4
            r1 = r5
            r2 = 0
            r0.b(r1, r2)
        L_0x007e:
            r0 = r4
            r0.e()
            r0 = r4
            r0.d()
            r0 = r8
            if (r0 == 0) goto L_0x008f
            r0 = r4
            r0.invalidate()
        L_0x008f:
            r0 = r4
            r1 = 0
            r0.ar = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LogoutDialog_ViewBinding.drawableStateChanged():void");
    }

    final void e() {
        Drawable background;
        TextView textView;
        EditText editText = this.f;
        if (editText != null && this.e == 0 && (background = editText.getBackground()) != null) {
            Drawable drawable = background;
            if (setOnFitSystemWindowsListener.c(background)) {
                drawable = background.mutate();
            }
            if (this.q.b()) {
                TextView textView2 = this.q.i;
                drawable.setColorFilter(setImageResource.d(textView2 != null ? textView2.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
            } else if (!this.h || (textView = this.i) == null) {
                getInsetsForType.d(drawable);
                this.f.refreshDrawableState();
            } else {
                drawable.setColorFilter(setImageResource.d(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f;
        return editText != null ? editText.getBaseline() + getPaddingTop() + a() : getBaseline();
    }

    @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        onLayout(z, i, i2, i3, i4);
        EditText editText = this.f;
        if (editText != null) {
            Rect rect = this.aJ;
            rect.set(0, 0, editText.getWidth(), editText.getHeight());
            FingerprintDialog_ViewBinding.b(this, editText, rect);
            if (this.G != null) {
                this.G.setBounds(rect.left, rect.bottom - this.E, rect.right, rect.bottom);
            }
            if (this.t) {
                FingerprintStatusDialog fingerprintStatusDialog = this.d;
                float textSize = this.f.getTextSize();
                if (fingerprintStatusDialog.w != textSize) {
                    fingerprintStatusDialog.w = textSize;
                    fingerprintStatusDialog.a();
                }
                int gravity = this.f.getGravity();
                FingerprintStatusDialog fingerprintStatusDialog2 = this.d;
                int i5 = (gravity & -113) | 48;
                if (fingerprintStatusDialog2.l != i5) {
                    fingerprintStatusDialog2.l = i5;
                    fingerprintStatusDialog2.a();
                }
                FingerprintStatusDialog fingerprintStatusDialog3 = this.d;
                if (fingerprintStatusDialog3.v != gravity) {
                    fingerprintStatusDialog3.v = gravity;
                    fingerprintStatusDialog3.a();
                }
                FingerprintStatusDialog fingerprintStatusDialog4 = this.d;
                if (this.f != null) {
                    Rect rect2 = this.aI;
                    boolean z2 = findFragmentByWho.k(this) == 1;
                    rect2.bottom = rect.bottom;
                    int i6 = this.e;
                    if (i6 == 1) {
                        rect2.left = e(rect.left, z2);
                        rect2.top = rect.top + this.A;
                        rect2.right = a(rect.right, z2);
                    } else if (i6 != 2) {
                        rect2.left = e(rect.left, z2);
                        rect2.top = getPaddingTop();
                        rect2.right = a(rect.right, z2);
                    } else {
                        rect2.left = rect.left + this.f.getPaddingLeft();
                        rect2.top = rect.top - a();
                        rect2.right = rect.right - this.f.getPaddingRight();
                    }
                    int i7 = rect2.left;
                    int i8 = rect2.top;
                    int i9 = rect2.right;
                    int i10 = rect2.bottom;
                    if (!FingerprintStatusDialog.e(fingerprintStatusDialog4.a, i7, i8, i9, i10)) {
                        fingerprintStatusDialog4.a.set(i7, i8, i9, i10);
                        fingerprintStatusDialog4.d = true;
                        fingerprintStatusDialog4.b();
                    }
                    FingerprintStatusDialog fingerprintStatusDialog5 = this.d;
                    if (this.f != null) {
                        Rect rect3 = this.aI;
                        TextPaint textPaint = fingerprintStatusDialog5.J;
                        textPaint.setTextSize(fingerprintStatusDialog5.w);
                        textPaint.setTypeface(fingerprintStatusDialog5.z);
                        textPaint.setLetterSpacing(fingerprintStatusDialog5.s);
                        float f = -fingerprintStatusDialog5.J.ascent();
                        rect3.left = rect.left + this.f.getCompoundPaddingLeft();
                        rect3.top = this.e == 1 && this.f.getMinLines() <= 1 ? (int) (((float) rect.centerY()) - (f / 2.0f)) : rect.top + this.f.getCompoundPaddingTop();
                        rect3.right = rect.right - this.f.getCompoundPaddingRight();
                        boolean z3 = false;
                        if (this.e == 1) {
                            z3 = this.f.getMinLines() <= 1;
                        }
                        rect3.bottom = z3 ? (int) (((float) rect3.top) + f) : rect.bottom - this.f.getCompoundPaddingBottom();
                        int i11 = rect3.left;
                        int i12 = rect3.top;
                        int i13 = rect3.right;
                        int i14 = rect3.bottom;
                        if (!FingerprintStatusDialog.e(fingerprintStatusDialog5.p, i11, i12, i13, i14)) {
                            fingerprintStatusDialog5.p.set(i11, i12, i13, i14);
                            fingerprintStatusDialog5.d = true;
                            fingerprintStatusDialog5.b();
                        }
                        this.d.a();
                        if (b() && !this.p) {
                            h();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int max;
        onMeasure(i, i2);
        if (this.f == null || this.f.getMeasuredHeight() >= (max = Math.max(this.W.getMeasuredHeight(), this.aE.getMeasuredHeight()))) {
            z = false;
        } else {
            this.f.setMinimumHeight(max);
            z = true;
        }
        boolean t = t();
        if (z || t) {
            this.f.post(new 3(this));
        }
        if (!(this.aw == null || (editText = this.f) == null)) {
            this.aw.setGravity(editText.getGravity());
            this.aw.setPadding(this.f.getCompoundPaddingLeft(), this.f.getCompoundPaddingTop(), this.f.getCompoundPaddingRight(), this.f.getCompoundPaddingBottom());
        }
        q();
        u();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof read)) {
            onRestoreInstanceState(parcelable);
            return;
        }
        read read = (read) parcelable;
        onRestoreInstanceState(read.d);
        setError(read.c);
        if (read.h) {
            this.l.post(new 2(this));
        }
        setHint(read.a);
        setHelperText(read.e);
        setPlaceholderText(read.i);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        read read = new read(onSaveInstanceState());
        CharSequence charSequence = null;
        if (this.q.b()) {
            read.c = this.q.d ? this.q.g : null;
        }
        boolean z = true;
        if (!(this.V != 0) || !this.l.isChecked()) {
            z = false;
        }
        read.h = z;
        read.a = this.t ? this.s : null;
        read.e = this.q.o ? this.q.k : null;
        if (this.w) {
            charSequence = this.u;
        }
        read.i = charSequence;
        return read;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.c != i) {
            this.c = i;
            this.N = i;
            this.ad = i;
            this.al = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(copyWindowDataInto.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.N = defaultColor;
        this.c = defaultColor;
        this.R = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.ad = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.al = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.e) {
            this.e = i;
            if (this.f != null) {
                g();
            }
        }
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        JenisKodeBankDialog jenisKodeBankDialog = this.b;
        if (jenisKodeBankDialog == null || jenisKodeBankDialog.j() != f || this.b.h() != f2 || this.b.i() != f4 || this.b.b() != f3) {
            JenisPekerjaanDialog.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new JenisPekerjaanDialog.RemoteActionCompatParcelizer(this.az);
            remoteActionCompatParcelizer.i = new InfoTarikanDialog_ViewBinding(f);
            remoteActionCompatParcelizer.k = new InfoTarikanDialog_ViewBinding(f2);
            remoteActionCompatParcelizer.e = new InfoTarikanDialog_ViewBinding(f4);
            remoteActionCompatParcelizer.b = new InfoTarikanDialog_ViewBinding(f3);
            this.az = new JenisPekerjaanDialog(remoteActionCompatParcelizer, (byte) 0);
            c();
        }
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(int i) {
        if (this.ag != i) {
            this.ag = i;
            d();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.K = colorStateList.getDefaultColor();
            this.Q = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.an = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.ag = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.ag != colorStateList.getDefaultColor()) {
            this.ag = colorStateList.getDefaultColor();
        }
        d();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.aH != colorStateList) {
            this.aH = colorStateList;
            d();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.F = i;
        d();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.E = i;
        d();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.a != z) {
            if (z) {
                setTypeface settypeface = new setTypeface(getContext());
                this.i = settypeface;
                settypeface.setId(BaseDialogKotlin.MediaBrowserCompat.ItemReceiver.U);
                Typeface typeface = this.aQ;
                if (typeface != null) {
                    this.i.setTypeface(typeface);
                }
                this.i.setMaxLines(1);
                this.q.a(this.i, 2);
                requireDialog.b((ViewGroup.MarginLayoutParams) this.i.getLayoutParams(), getResources().getDimensionPixelOffset(BaseDialogKotlin.read.af));
                o();
                k();
            } else {
                this.q.c(this.i, 2);
                this.i = null;
            }
            this.a = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.j != i) {
            if (i > 0) {
                this.j = i;
            } else {
                this.j = -1;
            }
            if (this.a) {
                k();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.I != i) {
            this.I = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.L != i) {
            this.L = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.g = colorStateList;
        this.ae = colorStateList;
        if (this.f != null) {
            b(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        c(this, z);
        setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.l.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.l.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (this.l.getContentDescription() != charSequence) {
            this.l.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? setPrimaryBackground.c(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.l.setImageDrawable(drawable);
        d(this.l, this.k);
    }

    public void setEndIconMode(int i) {
        int i2 = this.V;
        this.V = i;
        Iterator<RemoteActionCompatParcelizer> it = this.n.iterator();
        while (it.hasNext()) {
            it.next().d(this, i2);
        }
        setEndIconVisible(i != 0);
        if (j().e(this.e)) {
            j().d();
            e(this.l, this.ah, this.k, this.ak, this.T);
            return;
        }
        StringBuilder sb = new StringBuilder("The current box background mode ");
        sb.append(this.e);
        sb.append(" is not supported by the end icon mode ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        clickedOk clickedok = this.l;
        View.OnLongClickListener onLongClickListener = this.U;
        clickedok.setOnClickListener(onClickListener);
        a(clickedok, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.U = onLongClickListener;
        clickedOk clickedok = this.l;
        clickedok.setOnLongClickListener(onLongClickListener);
        a(clickedok, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            this.ah = true;
            e(this.l, true, colorStateList, this.ak, this.T);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.T != mode) {
            this.T = mode;
            this.ak = true;
            e(this.l, this.ah, this.k, true, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        int i = 0;
        if ((this.m.getVisibility() == 0 && this.l.getVisibility() == 0) != z) {
            clickedOk clickedok = this.l;
            if (!z) {
                i = 8;
            }
            clickedok.setVisibility(i);
            u();
            t();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.q.d) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            LinkUbahPINDialog linkUbahPINDialog = this.q;
            Animator animator = linkUbahPINDialog.a;
            if (animator != null) {
                animator.cancel();
            }
            linkUbahPINDialog.g = charSequence;
            linkUbahPINDialog.i.setText(charSequence);
            int i = linkUbahPINDialog.b;
            if (i != 1) {
                linkUbahPINDialog.c = 1;
            }
            linkUbahPINDialog.e(i, linkUbahPINDialog.c, linkUbahPINDialog.e(linkUbahPINDialog.i, charSequence));
            return;
        }
        this.q.c();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        LinkUbahPINDialog linkUbahPINDialog = this.q;
        linkUbahPINDialog.j = charSequence;
        TextView textView = linkUbahPINDialog.i;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        LinkUbahPINDialog linkUbahPINDialog = this.q;
        if (linkUbahPINDialog.d != z) {
            Animator animator = linkUbahPINDialog.a;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                setTypeface settypeface = new setTypeface(linkUbahPINDialog.e);
                linkUbahPINDialog.i = settypeface;
                settypeface.setId(BaseDialogKotlin.MediaBrowserCompat.ItemReceiver.T);
                linkUbahPINDialog.i.setTextAlignment(5);
                Typeface typeface = linkUbahPINDialog.p;
                if (typeface != null) {
                    linkUbahPINDialog.i.setTypeface(typeface);
                }
                int i = linkUbahPINDialog.h;
                linkUbahPINDialog.h = i;
                TextView textView = linkUbahPINDialog.i;
                if (textView != null) {
                    linkUbahPINDialog.s.b(textView, i);
                }
                ColorStateList colorStateList = linkUbahPINDialog.f;
                linkUbahPINDialog.f = colorStateList;
                TextView textView2 = linkUbahPINDialog.i;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = linkUbahPINDialog.j;
                linkUbahPINDialog.j = charSequence;
                TextView textView3 = linkUbahPINDialog.i;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                linkUbahPINDialog.i.setVisibility(4);
                findFragmentByWho.a(linkUbahPINDialog.i, 1);
                linkUbahPINDialog.a(linkUbahPINDialog.i, 0);
            } else {
                linkUbahPINDialog.c();
                linkUbahPINDialog.c(linkUbahPINDialog.i, 0);
                linkUbahPINDialog.i = null;
                linkUbahPINDialog.s.e();
                linkUbahPINDialog.s.d();
            }
            linkUbahPINDialog.d = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? setPrimaryBackground.c(getContext(), i) : null);
        d(this.aa, this.ac);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.aa.setImageDrawable(drawable);
        e(drawable != null && this.q.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        clickedOk clickedok = this.aa;
        View.OnLongClickListener onLongClickListener = this.ab;
        clickedok.setOnClickListener(onClickListener);
        a(clickedok, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.ab = onLongClickListener;
        clickedOk clickedok = this.aa;
        clickedok.setOnLongClickListener(onLongClickListener);
        a(clickedok, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.ac = colorStateList;
        Drawable drawable = this.aa.getDrawable();
        Drawable drawable2 = drawable;
        if (drawable != null) {
            drawable2 = getInsetsForType.h(drawable).mutate();
            getInsetsForType.e(drawable2, colorStateList);
        }
        if (this.aa.getDrawable() != drawable2) {
            this.aa.setImageDrawable(drawable2);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.aa.getDrawable();
        Drawable drawable2 = drawable;
        if (drawable != null) {
            drawable2 = getInsetsForType.h(drawable).mutate();
            getInsetsForType.d(drawable2, mode);
        }
        if (this.aa.getDrawable() != drawable2) {
            this.aa.setImageDrawable(drawable2);
        }
    }

    public void setErrorTextAppearance(int i) {
        LinkUbahPINDialog linkUbahPINDialog = this.q;
        linkUbahPINDialog.h = i;
        TextView textView = linkUbahPINDialog.i;
        if (textView != null) {
            linkUbahPINDialog.s.b(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        LinkUbahPINDialog linkUbahPINDialog = this.q;
        linkUbahPINDialog.f = colorStateList;
        TextView textView = linkUbahPINDialog.i;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.af != z) {
            this.af = z;
            b(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.q.o) {
                setHelperTextEnabled(true);
            }
            LinkUbahPINDialog linkUbahPINDialog = this.q;
            Animator animator = linkUbahPINDialog.a;
            if (animator != null) {
                animator.cancel();
            }
            linkUbahPINDialog.k = charSequence;
            linkUbahPINDialog.n.setText(charSequence);
            int i = linkUbahPINDialog.b;
            if (i != 2) {
                linkUbahPINDialog.c = 2;
            }
            linkUbahPINDialog.e(i, linkUbahPINDialog.c, linkUbahPINDialog.e(linkUbahPINDialog.n, charSequence));
        } else if (this.q.o) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        LinkUbahPINDialog linkUbahPINDialog = this.q;
        linkUbahPINDialog.l = colorStateList;
        TextView textView = linkUbahPINDialog.n;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        LinkUbahPINDialog linkUbahPINDialog = this.q;
        if (linkUbahPINDialog.o != z) {
            Animator animator = linkUbahPINDialog.a;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                setTypeface settypeface = new setTypeface(linkUbahPINDialog.e);
                linkUbahPINDialog.n = settypeface;
                settypeface.setId(BaseDialogKotlin.MediaBrowserCompat.ItemReceiver.ac);
                linkUbahPINDialog.n.setTextAlignment(5);
                Typeface typeface = linkUbahPINDialog.p;
                if (typeface != null) {
                    linkUbahPINDialog.n.setTypeface(typeface);
                }
                linkUbahPINDialog.n.setVisibility(4);
                findFragmentByWho.a(linkUbahPINDialog.n, 1);
                int i = linkUbahPINDialog.m;
                linkUbahPINDialog.m = i;
                TextView textView = linkUbahPINDialog.n;
                if (textView != null) {
                    getParentFragment.e(textView, i);
                }
                ColorStateList colorStateList = linkUbahPINDialog.l;
                linkUbahPINDialog.l = colorStateList;
                TextView textView2 = linkUbahPINDialog.n;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                linkUbahPINDialog.a(linkUbahPINDialog.n, 1);
            } else {
                Animator animator2 = linkUbahPINDialog.a;
                if (animator2 != null) {
                    animator2.cancel();
                }
                int i2 = linkUbahPINDialog.b;
                if (i2 == 2) {
                    linkUbahPINDialog.c = 0;
                }
                linkUbahPINDialog.e(i2, linkUbahPINDialog.c, linkUbahPINDialog.e(linkUbahPINDialog.n, (CharSequence) null));
                linkUbahPINDialog.c(linkUbahPINDialog.n, 1);
                linkUbahPINDialog.n = null;
                linkUbahPINDialog.s.e();
                linkUbahPINDialog.s.d();
            }
            linkUbahPINDialog.o = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        LinkUbahPINDialog linkUbahPINDialog = this.q;
        linkUbahPINDialog.m = i;
        TextView textView = linkUbahPINDialog.n;
        if (textView != null) {
            getParentFragment.e(textView, i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.t) {
            e(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.ai = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.t) {
            this.t = z;
            if (!z) {
                this.r = false;
                if (!TextUtils.isEmpty(this.s) && TextUtils.isEmpty(this.f.getHint())) {
                    this.f.setHint(this.s);
                }
                e((CharSequence) null);
            } else {
                CharSequence hint = this.f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.s)) {
                        setHint(hint);
                    }
                    this.f.setHint((CharSequence) null);
                }
                this.r = true;
            }
            if (this.f != null) {
                p();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        FingerprintStatusDialog fingerprintStatusDialog = this.d;
        InfoCaraPembayaranDialog infoCaraPembayaranDialog = new InfoCaraPembayaranDialog(fingerprintStatusDialog.M.getContext(), i);
        if (infoCaraPembayaranDialog.m != null) {
            fingerprintStatusDialog.h = infoCaraPembayaranDialog.m;
        }
        if (infoCaraPembayaranDialog.n != 0.0f) {
            fingerprintStatusDialog.o = infoCaraPembayaranDialog.n;
        }
        if (infoCaraPembayaranDialog.f != null) {
            fingerprintStatusDialog.b = infoCaraPembayaranDialog.f;
        }
        fingerprintStatusDialog.i = infoCaraPembayaranDialog.g;
        fingerprintStatusDialog.f = infoCaraPembayaranDialog.i;
        fingerprintStatusDialog.j = infoCaraPembayaranDialog.h;
        fingerprintStatusDialog.e = infoCaraPembayaranDialog.b;
        InfoCaraPembayaranDialog_ViewBinding infoCaraPembayaranDialog_ViewBinding = fingerprintStatusDialog.c;
        if (infoCaraPembayaranDialog_ViewBinding != null) {
            infoCaraPembayaranDialog_ViewBinding.a = true;
        }
        FingerprintStatusDialog.4 r0 = new FingerprintStatusDialog.4(fingerprintStatusDialog);
        infoCaraPembayaranDialog.b();
        fingerprintStatusDialog.c = new InfoCaraPembayaranDialog_ViewBinding(r0, infoCaraPembayaranDialog.c);
        infoCaraPembayaranDialog.c(fingerprintStatusDialog.M.getContext(), fingerprintStatusDialog.c);
        fingerprintStatusDialog.a();
        this.ae = this.d.h;
        if (this.f != null) {
            b(false, false);
            p();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.ae != colorStateList) {
            if (this.g == null) {
                FingerprintStatusDialog fingerprintStatusDialog = this.d;
                if (fingerprintStatusDialog.h != colorStateList) {
                    fingerprintStatusDialog.h = colorStateList;
                    fingerprintStatusDialog.a();
                }
            }
            this.ae = colorStateList;
            if (this.f != null) {
                b(false, false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.aq = i;
        EditText editText = this.f;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(int i) {
        this.ao = i;
        EditText editText = this.f;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.l.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? setPrimaryBackground.c(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.l.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.V != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.k = colorStateList;
        this.ah = true;
        e(this.l, true, colorStateList, this.ak, this.T);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.T = mode;
        this.ak = true;
        e(this.l, this.ah, this.k, true, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (!this.w || !TextUtils.isEmpty(charSequence)) {
            if (!this.w) {
                c(true);
            }
            this.u = charSequence;
        } else {
            c(false);
        }
        r();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.av = i;
        TextView textView = this.aw;
        if (textView != null) {
            getParentFragment.e(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.as != colorStateList) {
            this.as = colorStateList;
            TextView textView = this.aw;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.aA = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.ay.setText(charSequence);
        s();
    }

    public void setPrefixTextAppearance(int i) {
        getParentFragment.e(this.ay, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.ay.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.aF.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (this.aF.getContentDescription() != charSequence) {
            this.aF.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? setPrimaryBackground.c(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.aF.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            d(this.aF, this.aC);
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        clickedOk clickedok = this.aF;
        View.OnLongClickListener onLongClickListener = this.aG;
        clickedok.setOnClickListener(onClickListener);
        a(clickedok, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.aG = onLongClickListener;
        clickedOk clickedok = this.aF;
        clickedok.setOnLongClickListener(onLongClickListener);
        a(clickedok, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.aC != colorStateList) {
            this.aC = colorStateList;
            this.aj = true;
            e(this.aF, true, colorStateList, this.am, this.aD);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.aD != mode) {
            this.aD = mode;
            this.am = true;
            e(this.aF, this.aj, this.aC, true, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        int i = 0;
        if ((this.aF.getVisibility() == 0) != z) {
            clickedOk clickedok = this.aF;
            if (!z) {
                i = 8;
            }
            clickedok.setVisibility(i);
            q();
            t();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.aL.setText(charSequence);
        w();
    }

    public void setSuffixTextAppearance(int i) {
        getParentFragment.e(this.aL, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.aL.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(IconCompatParcelizer iconCompatParcelizer) {
        EditText editText = this.f;
        if (editText != null) {
            findFragmentByWho.d((View) editText, (onDismiss) iconCompatParcelizer);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.aQ) {
            this.aQ = typeface;
            this.d.d(typeface);
            LinkUbahPINDialog linkUbahPINDialog = this.q;
            if (typeface != linkUbahPINDialog.p) {
                linkUbahPINDialog.p = typeface;
                TextView textView = linkUbahPINDialog.i;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = linkUbahPINDialog.n;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.i;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }
}
