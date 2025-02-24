package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* loaded from: classes2-dex2jar.jar:o/InfoNegaraORDialog.class */
public final class InfoNegaraORDialog extends Drawable implements KategoriTujuanTransaksiORDialog, getVisibleInsets {
    private read b;

    /* loaded from: classes2-dex2jar.jar:o/InfoNegaraORDialog$read.class */
    static final class read extends Drawable.ConstantState {
        JenisKodeBankDialog b;
        boolean e;

        public read(read read) {
            this.b = (JenisKodeBankDialog) read.b.getConstantState().newDrawable();
            this.e = read.e;
        }

        public read(JenisKodeBankDialog jenisKodeBankDialog) {
            this.b = jenisKodeBankDialog;
            this.e = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final /* synthetic */ Drawable newDrawable() {
            return new InfoNegaraORDialog(new read(this), (byte) 0);
        }
    }

    private InfoNegaraORDialog(read read2) {
        this.b = read2;
    }

    /* synthetic */ InfoNegaraORDialog(read read2, byte b) {
        this(read2);
    }

    public InfoNegaraORDialog(JenisPekerjaanDialog jenisPekerjaanDialog) {
        this(new read(new JenisKodeBankDialog(jenisPekerjaanDialog)));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.b.e) {
            this.b.b.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.b.b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final /* synthetic */ Drawable mutate() {
        this.b = new read(this.b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        onBoundsChange(rect);
        this.b.b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        boolean onStateChange = onStateChange(iArr);
        onStateChange = true;
        if (this.b.b.setState(iArr)) {
            onStateChange = true;
        }
        boolean d = InfoDialog_ViewBinding.d(iArr);
        if (this.b.e != d) {
            this.b.e = d;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.b.setColorFilter(colorFilter);
    }

    @Override // o.KategoriTujuanTransaksiORDialog
    public final void setShapeAppearanceModel(JenisPekerjaanDialog jenisPekerjaanDialog) {
        this.b.b.setShapeAppearanceModel(jenisPekerjaanDialog);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.b.b.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.b.b.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.b.b.setTintMode(mode);
    }
}
