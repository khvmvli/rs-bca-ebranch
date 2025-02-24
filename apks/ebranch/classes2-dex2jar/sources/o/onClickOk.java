package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.provider.Settings;
import o.HapusTransaksiWarkatDialog_ViewBinding;
import o.getPivotY;
/* loaded from: classes2-dex2jar.jar:o/onClickOk.class */
public final class onClickOk<S extends HapusTransaksiWarkatDialog_ViewBinding> extends HubunganDialog {
    private static final getSharedElementReturnTransition<onClickOk> m = new getSharedElementReturnTransition<onClickOk>("indicatorLevel") { // from class: o.onClickOk.4
        public final /* synthetic */ void c(Object obj, float f) {
            onClickOk onclickok = (onClickOk) obj;
            onclickok.c = f / 10000.0f;
            onclickok.invalidateSelf();
        }

        public final /* bridge */ /* synthetic */ float e(Object obj) {
            return ((onClickOk) obj).c * 10000.0f;
        }
    };
    float c;
    HariDialog_ViewBinding<S> e;
    private final getString k;
    private boolean l = false;

    /* renamed from: o  reason: collision with root package name */
    private final getTag f71o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public onClickOk(Context context, HapusTransaksiWarkatDialog_ViewBinding hapusTransaksiWarkatDialog_ViewBinding, HariDialog_ViewBinding<S> hariDialog_ViewBinding) {
        super(context, hapusTransaksiWarkatDialog_ViewBinding);
        this.e = hariDialog_ViewBinding;
        hariDialog_ViewBinding.d(this);
        getTag gettag = new getTag();
        this.f71o = gettag;
        gettag.b = 1.0d;
        gettag.e = false;
        gettag.b(50.0f);
        getString getstring = new getString(this, m);
        this.k = getstring;
        getstring.u = gettag;
        e(1.0f);
    }

    @Override // o.HubunganDialog
    public final /* bridge */ /* synthetic */ boolean a(getPivotY.IconCompatParcelizer iconCompatParcelizer) {
        return a(iconCompatParcelizer);
    }

    @Override // o.HubunganDialog
    public final /* bridge */ /* synthetic */ void b(getPivotY.IconCompatParcelizer iconCompatParcelizer) {
        b(iconCompatParcelizer);
    }

    @Override // o.HubunganDialog
    public final /* bridge */ /* synthetic */ boolean b() {
        return b();
    }

    @Override // o.HubunganDialog
    public final /* bridge */ /* synthetic */ boolean c() {
        return c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.HubunganDialog
    public final boolean c(boolean z, boolean z2, boolean z3) {
        boolean c = c(z, z2, z3);
        float f = Settings.Global.getFloat(this.g.getContentResolver(), "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.l = true;
        } else {
            this.l = false;
            this.f71o.b(50.0f / f);
        }
        return c;
    }

    @Override // o.HubunganDialog
    public final /* bridge */ /* synthetic */ boolean d() {
        return d();
    }

    @Override // o.HubunganDialog
    public final /* bridge */ /* synthetic */ boolean d(boolean z, boolean z2, boolean z3) {
        return d(z, z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.e.c(canvas, e());
            this.e.a(canvas, this.j);
            int i = this.a.d[0];
            this.e.a(canvas, this.j, 0.0f, this.c, isRound.b(i, (Color.alpha(i) * getAlpha()) / 255));
            canvas.restore();
        }
    }

    @Override // o.HubunganDialog, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getAlpha() {
        return getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.e.c();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.e.b();
    }

    @Override // o.HubunganDialog, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return getOpacity();
    }

    @Override // o.HubunganDialog
    public final /* bridge */ /* synthetic */ boolean isRunning() {
        return isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.k.d();
        this.c = ((float) getLevel()) / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        if (this.l) {
            this.k.d();
            this.c = ((float) i) / 10000.0f;
            invalidateSelf();
            return true;
        }
        getString getstring = this.k;
        ((getSharedElementEnterTransition) getstring).x = this.c * 10000.0f;
        ((getSharedElementEnterTransition) getstring).r = true;
        this.k.d((float) i);
        return true;
    }

    @Override // o.HubunganDialog, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setAlpha(int i) {
        setAlpha(i);
    }

    @Override // o.HubunganDialog, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        setColorFilter(colorFilter);
    }

    @Override // o.HubunganDialog, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return setVisible(z, z2);
    }

    @Override // o.HubunganDialog
    public final /* bridge */ /* synthetic */ void start() {
        start();
    }

    @Override // o.HubunganDialog
    public final /* bridge */ /* synthetic */ void stop() {
        stop();
    }
}
