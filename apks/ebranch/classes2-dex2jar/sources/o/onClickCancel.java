package o;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import o.HapusTransaksiWarkatDialog_ViewBinding;
import o.getPivotY;
/* loaded from: classes2-dex2jar.jar:o/onClickCancel.class */
public final class onClickCancel<S extends HapusTransaksiWarkatDialog_ViewBinding> extends HubunganDialog {
    HariDialog_ViewBinding<S> c;
    onSelectHari<ObjectAnimator> e;

    public onClickCancel(Context context, HapusTransaksiWarkatDialog_ViewBinding hapusTransaksiWarkatDialog_ViewBinding, HariDialog_ViewBinding<S> hariDialog_ViewBinding, onSelectHari<ObjectAnimator> onselecthari) {
        super(context, hapusTransaksiWarkatDialog_ViewBinding);
        this.c = hariDialog_ViewBinding;
        hariDialog_ViewBinding.d(this);
        this.e = onselecthari;
        onselecthari.a(this);
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

    @Override // o.HubunganDialog
    public final boolean c(boolean z, boolean z2, boolean z3) {
        boolean c = c(z, z2, z3);
        if (!isRunning()) {
            this.e.a();
        }
        float f = Settings.Global.getFloat(this.g.getContentResolver(), "animator_duration_scale", 1.0f);
        if (z && (z3 || (Build.VERSION.SDK_INT <= 21 && f > 0.0f))) {
            this.e.d();
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
            this.c.c(canvas, e());
            this.c.a(canvas, this.j);
            for (int i = 0; i < this.e.h.length; i++) {
                int i2 = i << 1;
                this.c.a(canvas, this.j, this.e.f[i2], this.e.f[i2 + 1], this.e.h[i]);
            }
            canvas.restore();
        }
    }

    @Override // o.HubunganDialog, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getAlpha() {
        return getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c.c();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c.b();
    }

    @Override // o.HubunganDialog, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return getOpacity();
    }

    @Override // o.HubunganDialog
    public final /* bridge */ /* synthetic */ boolean isRunning() {
        return isRunning();
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
