package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import java.util.Arrays;
import o.BaseDialogKotlin;
import o.HapusTransaksiWarkatDialog_ViewBinding;
import o.getPivotY;
import org.joda.time.DateTimeConstants;
/* loaded from: classes2-dex2jar.jar:o/HapusTransaksiBerkalaDialog.class */
public abstract class HapusTransaksiBerkalaDialog<S extends HapusTransaksiWarkatDialog_ViewBinding> extends ProgressBar {
    static final int a = BaseDialogKotlin.MediaDescriptionCompat.C;
    final int b;
    int g;
    boolean i;
    S j;
    private final int l;
    long e = -1;
    boolean d = false;
    int f = 4;
    private final Runnable m = new Runnable() { // from class: o.HapusTransaksiBerkalaDialog.5
        @Override // java.lang.Runnable
        public final void run() {
            HapusTransaksiBerkalaDialog hapusTransaksiBerkalaDialog = HapusTransaksiBerkalaDialog.this;
            if (hapusTransaksiBerkalaDialog.b > 0) {
                hapusTransaksiBerkalaDialog.e = SystemClock.uptimeMillis();
            }
            hapusTransaksiBerkalaDialog.setVisibility(0);
        }
    };
    private final Runnable h = new Runnable() { // from class: o.HapusTransaksiBerkalaDialog.2
        @Override // java.lang.Runnable
        public final void run() {
            HapusTransaksiBerkalaDialog.e(HapusTransaksiBerkalaDialog.this);
            HapusTransaksiBerkalaDialog.this.e = -1;
        }
    };
    private final getPivotY.IconCompatParcelizer n = new getPivotY.IconCompatParcelizer() { // from class: o.HapusTransaksiBerkalaDialog.3
        public final void a(Drawable drawable) {
            HapusTransaksiBerkalaDialog.this.setIndeterminate(false);
            HapusTransaksiBerkalaDialog.this.setProgressCompat(0, false);
            HapusTransaksiBerkalaDialog hapusTransaksiBerkalaDialog = HapusTransaksiBerkalaDialog.this;
            hapusTransaksiBerkalaDialog.setProgressCompat(hapusTransaksiBerkalaDialog.g, HapusTransaksiBerkalaDialog.this.i);
        }
    };
    private final getPivotY.IconCompatParcelizer k = new getPivotY.IconCompatParcelizer() { // from class: o.HapusTransaksiBerkalaDialog.1
        public final void a(Drawable drawable) {
            a(drawable);
            if (!HapusTransaksiBerkalaDialog.this.d) {
                HapusTransaksiBerkalaDialog hapusTransaksiBerkalaDialog = HapusTransaksiBerkalaDialog.this;
                hapusTransaksiBerkalaDialog.setVisibility(hapusTransaksiBerkalaDialog.f);
            }
        }
    };
    HapusDaftarTransferDialog_ViewBinding c = new HapusDaftarTransferDialog_ViewBinding();

    /* renamed from: o  reason: collision with root package name */
    private boolean f29o = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public HapusTransaksiBerkalaDialog(Context context, AttributeSet attributeSet, int i, int i2) {
        super(MataUangDialog_ViewBinding.a(context, attributeSet, i, a), attributeSet, i);
        Context context2 = getContext();
        this.j = d(context2, attributeSet);
        TypedArray c = GuestWarningWebViewDialog_ViewBinding.c(context2, attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.z, i, i2, new int[0]);
        this.l = c.getInt(BaseDialogKotlin$MediaSessionCompat$Token.H, -1);
        this.b = Math.min(c.getInt(BaseDialogKotlin$MediaSessionCompat$Token.E, -1), (int) DateTimeConstants.MILLIS_PER_SECOND);
        c.recycle();
    }

    private void a(boolean z) {
        if (this.f29o) {
            ((HubunganDialog) getCurrentDrawable()).d(findFragmentByWho.F(this) && getWindowVisibility() == 0 && a(), false, z);
        }
    }

    private boolean a() {
        View view = this;
        while (true) {
            boolean z = false;
            if (view.getVisibility() != 0) {
                return false;
            }
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() == 0) {
                    z = true;
                }
                return z;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
    }

    private boolean d() {
        return findFragmentByWho.F(this) && getWindowVisibility() == 0 && a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (((o.onClickCancel) r5.getIndeterminateDrawable()).isVisible() != false) goto L_0x0044;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    static /* synthetic */ void e(o.HapusTransaksiBerkalaDialog r5) {
        /*
            r0 = r5
            android.graphics.drawable.Drawable r0 = r0.getCurrentDrawable()
            o.HubunganDialog r0 = (o.HubunganDialog) r0
            r6 = r0
            r0 = 1
            r7 = r0
            r0 = r6
            r1 = 0
            r2 = 0
            r3 = 1
            boolean r0 = r0.d(r1, r2, r3)
            r0 = r5
            android.graphics.drawable.Drawable r0 = r0.getProgressDrawable()
            o.onClickOk r0 = (o.onClickOk) r0
            if (r0 == 0) goto L_0x0029
            r0 = r5
            android.graphics.drawable.Drawable r0 = r0.getProgressDrawable()
            o.onClickOk r0 = (o.onClickOk) r0
            boolean r0 = r0.isVisible()
            if (r0 != 0) goto L_0x0044
        L_0x0029:
            r0 = r7
            r8 = r0
            r0 = r5
            android.graphics.drawable.Drawable r0 = r0.getIndeterminateDrawable()
            o.onClickCancel r0 = (o.onClickCancel) r0
            if (r0 == 0) goto L_0x0046
            r0 = r7
            r8 = r0
            r0 = r5
            android.graphics.drawable.Drawable r0 = r0.getIndeterminateDrawable()
            o.onClickCancel r0 = (o.onClickCancel) r0
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L_0x0046
        L_0x0044:
            r0 = 0
            r8 = r0
        L_0x0046:
            r0 = r8
            if (r0 == 0) goto L_0x004f
            r0 = r5
            r1 = 4
            r0.setVisibility(r1)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.HapusTransaksiBerkalaDialog.e(o.HapusTransaksiBerkalaDialog):void");
    }

    abstract S d(Context context, AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? (onClickCancel) getIndeterminateDrawable() : (onClickOk) getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    public /* bridge */ /* synthetic */ Drawable getIndeterminateDrawable() {
        return (onClickCancel) getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public /* bridge */ /* synthetic */ Drawable getProgressDrawable() {
        return (onClickOk) getProgressDrawable();
    }

    @Override // android.view.View
    public void invalidate() {
        invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        onAttachedToWindow();
        if (!(((onClickOk) getProgressDrawable()) == null || ((onClickCancel) getIndeterminateDrawable()) == null)) {
            ((onClickCancel) getIndeterminateDrawable()).e.d(this.n);
        }
        if (((onClickOk) getProgressDrawable()) != null) {
            ((onClickOk) getProgressDrawable()).b(this.k);
        }
        if (((onClickCancel) getIndeterminateDrawable()) != null) {
            ((onClickCancel) getIndeterminateDrawable()).b(this.k);
        }
        if (findFragmentByWho.F(this) && getWindowVisibility() == 0 && a()) {
            if (this.b > 0) {
                this.e = SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.h);
        removeCallbacks(this.m);
        ((HubunganDialog) getCurrentDrawable()).d();
        if (((onClickCancel) getIndeterminateDrawable()) != null) {
            ((onClickCancel) getIndeterminateDrawable()).a(this.k);
            ((onClickCancel) getIndeterminateDrawable()).e.b();
        }
        if (((onClickOk) getProgressDrawable()) != null) {
            ((onClickOk) getProgressDrawable()).a(this.k);
        }
        onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDraw(Canvas canvas) {
        synchronized (this) {
            int save = canvas.save();
            if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onMeasure(int i, int i2) {
        synchronized (this) {
            onMeasure(i, i2);
            HariDialog_ViewBinding<S> hariDialog_ViewBinding = null;
            if (isIndeterminate()) {
                if (((onClickCancel) getIndeterminateDrawable()) != null) {
                    hariDialog_ViewBinding = ((onClickCancel) getIndeterminateDrawable()).c;
                }
            } else if (((onClickOk) getProgressDrawable()) != null) {
                hariDialog_ViewBinding = ((onClickOk) getProgressDrawable()).e;
            }
            if (hariDialog_ViewBinding != null) {
                int b = hariDialog_ViewBinding.b();
                int c = hariDialog_ViewBinding.c();
                setMeasuredDimension(b < 0 ? getMeasuredWidth() : b + getPaddingLeft() + getPaddingRight(), c < 0 ? getMeasuredHeight() : c + getPaddingTop() + getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        onVisibilityChanged(view, i);
        a(i == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        onWindowVisibilityChanged(i);
        a(false);
    }

    public void setAnimatorDurationScaleProvider(HapusDaftarTransferDialog_ViewBinding hapusDaftarTransferDialog_ViewBinding) {
        this.c = hapusDaftarTransferDialog_ViewBinding;
        if (((onClickOk) getProgressDrawable()) != null) {
            ((onClickOk) getProgressDrawable()).b = hapusDaftarTransferDialog_ViewBinding;
        }
        if (((onClickCancel) getIndeterminateDrawable()) != null) {
            ((onClickCancel) getIndeterminateDrawable()).b = hapusDaftarTransferDialog_ViewBinding;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.j.a = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminate(boolean z) {
        synchronized (this) {
            if (z != isIndeterminate()) {
                if (!(findFragmentByWho.F(this) && getWindowVisibility() == 0 && a()) || !z) {
                    HubunganDialog hubunganDialog = (HubunganDialog) getCurrentDrawable();
                    if (hubunganDialog != null) {
                        hubunganDialog.d();
                    }
                    setIndeterminate(z);
                    HubunganDialog hubunganDialog2 = (HubunganDialog) getCurrentDrawable();
                    if (hubunganDialog2 != null) {
                        hubunganDialog2.d(d(), false, false);
                    }
                    this.d = false;
                    return;
                }
                throw new IllegalStateException("Cannot switch to indeterminate mode while the progress indicator is visible.");
            }
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            setIndeterminateDrawable(null);
        } else if (drawable instanceof onClickCancel) {
            ((HubunganDialog) drawable).d();
            setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        int[] iArr2 = iArr;
        if (iArr.length == 0) {
            iArr2 = new int[]{DaftarTransferORBerhasilDiupdateDialog.d(getContext(), BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.l, -1)};
        }
        if (!Arrays.equals(this.j.d, iArr2)) {
            this.j.d = iArr2;
            ((onClickCancel) getIndeterminateDrawable()).e.c();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        synchronized (this) {
            if (!isIndeterminate()) {
                setProgressCompat(i, false);
            }
        }
    }

    public void setProgressCompat(int i, boolean z) {
        if (!isIndeterminate()) {
            setProgress(i);
            if (((onClickOk) getProgressDrawable()) != null && !z) {
                ((onClickOk) getProgressDrawable()).jumpToCurrentState();
            }
        } else if (((onClickOk) getProgressDrawable()) != null) {
            this.g = i;
            this.i = z;
            this.d = true;
            if (!((onClickCancel) getIndeterminateDrawable()).isVisible() || Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                this.n.a((onClickCancel) getIndeterminateDrawable());
            } else {
                ((onClickCancel) getIndeterminateDrawable()).e.e();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            setProgressDrawable(null);
        } else if (drawable instanceof onClickOk) {
            onClickOk onclickok = (onClickOk) drawable;
            onclickok.d();
            setProgressDrawable(onclickok);
            onclickok.setLevel((int) ((((float) getProgress()) / ((float) getMax())) * 10000.0f));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.j.e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        if (this.j.c != i) {
            this.j.c = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        if (this.j.b != i) {
            S s = this.j;
            s.b = Math.min(i, s.i / 2);
        }
    }

    public void setTrackThickness(int i) {
        if (this.j.i != i) {
            this.j.i = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.f = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }
}
