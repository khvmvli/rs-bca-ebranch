package o;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import o.BaseDialogKotlin;
import o.JenisPekerjaanDialog;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/chooseDokumenBelumLengkap.class */
public final class chooseDokumenBelumLengkap {
    private static final int[] s = {16842912};
    private static final double t = Math.cos(Math.toRadians(45.0d));
    Drawable a;
    int b;
    int c;
    boolean d;
    final JenisKodeBankDialog e;
    LayerDrawable f;
    JenisKodeBankDialog g;
    final JenisKodeBankDialog h;
    Drawable i;
    ColorStateList j;
    ColorStateList l;
    JenisPekerjaanDialog m;
    final chooseSudahTransaksiEchannel n;

    /* renamed from: o  reason: collision with root package name */
    Drawable f57o;
    int q;
    ColorStateList r;
    private JenisKodeBankDialog v;
    final Rect p = new Rect();
    boolean k = false;

    /* JADX WARN: Multi-variable type inference failed */
    public chooseDokumenBelumLengkap(chooseSudahTransaksiEchannel choosesudahtransaksiechannel, AttributeSet attributeSet, int i, int i2) {
        this.n = choosesudahtransaksiechannel;
        JenisKodeBankDialog jenisKodeBankDialog = new JenisKodeBankDialog(choosesudahtransaksiechannel.getContext(), attributeSet, i, i2);
        this.e = jenisKodeBankDialog;
        jenisKodeBankDialog.b(choosesudahtransaksiechannel.getContext());
        jenisKodeBankDialog.a(-12303292);
        JenisPekerjaanDialog.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new JenisPekerjaanDialog.RemoteActionCompatParcelizer(jenisKodeBankDialog.F.l);
        TypedArray obtainStyledAttributes = choosesudahtransaksiechannel.getContext().obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.aw, i, BaseDialogKotlin.MediaDescriptionCompat.e);
        if (obtainStyledAttributes.hasValue(BaseDialogKotlin$MediaSessionCompat$Token.at)) {
            float dimension = obtainStyledAttributes.getDimension(BaseDialogKotlin$MediaSessionCompat$Token.at, 0.0f);
            remoteActionCompatParcelizer.i = new InfoTarikanDialog_ViewBinding(dimension);
            remoteActionCompatParcelizer.k = new InfoTarikanDialog_ViewBinding(dimension);
            remoteActionCompatParcelizer.e = new InfoTarikanDialog_ViewBinding(dimension);
            remoteActionCompatParcelizer.b = new InfoTarikanDialog_ViewBinding(dimension);
        }
        this.h = new JenisKodeBankDialog();
        a(new JenisPekerjaanDialog(remoteActionCompatParcelizer, (byte) 0));
        obtainStyledAttributes.recycle();
    }

    private float f() {
        return setSplitTrack.c.a(((setSplitTrack) this.n).b) + (a() ? d() : 0.0f);
    }

    private float g() {
        return (setSplitTrack.c.a(((setSplitTrack) this.n).b) * 1.5f) + (a() ? d() : 0.0f);
    }

    private Drawable h() {
        if (InfoDialog_ViewBinding.c) {
            this.g = new JenisKodeBankDialog(this.m);
            return new RippleDrawable(this.l, null, this.g);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        JenisKodeBankDialog jenisKodeBankDialog = new JenisKodeBankDialog(this.m);
        this.v = jenisKodeBankDialog;
        jenisKodeBankDialog.c(this.l);
        stateListDrawable.addState(new int[]{16842919}, this.v);
        return stateListDrawable;
    }

    private float i() {
        if (!((setSplitTrack) this.n).e || !((setSplitTrack) this.n).d) {
            return 0.0f;
        }
        return (float) ((1.0d - t) * ((double) this.n.n()));
    }

    private boolean k() {
        return ((setSplitTrack) this.n).e && !this.e.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(JenisPekerjaanDialog jenisPekerjaanDialog) {
        this.m = jenisPekerjaanDialog;
        this.e.setShapeAppearanceModel(jenisPekerjaanDialog);
        JenisKodeBankDialog jenisKodeBankDialog = this.e;
        jenisKodeBankDialog.G = !jenisKodeBankDialog.m();
        JenisKodeBankDialog jenisKodeBankDialog2 = this.h;
        if (jenisKodeBankDialog2 != null) {
            jenisKodeBankDialog2.setShapeAppearanceModel(jenisPekerjaanDialog);
        }
        JenisKodeBankDialog jenisKodeBankDialog3 = this.g;
        if (jenisKodeBankDialog3 != null) {
            jenisKodeBankDialog3.setShapeAppearanceModel(jenisPekerjaanDialog);
        }
        JenisKodeBankDialog jenisKodeBankDialog4 = this.v;
        if (jenisKodeBankDialog4 != null) {
            jenisKodeBankDialog4.setShapeAppearanceModel(jenisPekerjaanDialog);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return ((setSplitTrack) this.n).e && this.e.m() && ((setSplitTrack) this.n).d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        int d = (int) ((k() || a() ? d() : 0.0f) - i());
        this.n.c(this.p.left + d, this.p.top + d, this.p.right + d, this.p.bottom + d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Drawable drawable) {
        this.a = drawable;
        if (drawable != null) {
            Drawable h = getInsetsForType.h(drawable.mutate());
            this.a = h;
            getInsetsForType.e(h, this.j);
        }
        if (this.f != null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable2 = this.a;
            if (drawable2 != null) {
                stateListDrawable.addState(s, drawable2);
            }
            this.f.setDrawableByLayerId(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.L, stateListDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable c() {
        if (this.f57o == null) {
            this.f57o = h();
        }
        if (this.f == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable = this.a;
            if (drawable != null) {
                stateListDrawable.addState(s, drawable);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f57o, this.h, stateListDrawable});
            this.f = layerDrawable;
            layerDrawable.setId(2, BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.L);
        }
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        InfoNegaraORDialog_ViewBinding infoNegaraORDialog_ViewBinding = this.m.g;
        float j = this.e.j();
        float f = 0.0f;
        float f2 = infoNegaraORDialog_ViewBinding instanceof JenisPekerjaanDialog_ViewBinding ? (float) ((1.0d - t) * ((double) j)) : infoNegaraORDialog_ViewBinding instanceof JenisIdDialog ? j / 2.0f : 0.0f;
        InfoNegaraORDialog_ViewBinding infoNegaraORDialog_ViewBinding2 = this.m.f37o;
        float h = this.e.h();
        float max = Math.max(f2, infoNegaraORDialog_ViewBinding2 instanceof JenisPekerjaanDialog_ViewBinding ? (float) ((1.0d - t) * ((double) h)) : infoNegaraORDialog_ViewBinding2 instanceof JenisIdDialog ? h / 2.0f : 0.0f);
        InfoNegaraORDialog_ViewBinding infoNegaraORDialog_ViewBinding3 = this.m.e;
        float i = this.e.i();
        float f3 = infoNegaraORDialog_ViewBinding3 instanceof JenisPekerjaanDialog_ViewBinding ? (float) ((1.0d - t) * ((double) i)) : infoNegaraORDialog_ViewBinding3 instanceof JenisIdDialog ? i / 2.0f : 0.0f;
        InfoNegaraORDialog_ViewBinding infoNegaraORDialog_ViewBinding4 = this.m.a;
        float b = this.e.b();
        if (infoNegaraORDialog_ViewBinding4 instanceof JenisPekerjaanDialog_ViewBinding) {
            f = (float) ((1.0d - t) * ((double) b));
        } else if (infoNegaraORDialog_ViewBinding4 instanceof JenisIdDialog) {
            f = b / 2.0f;
        }
        return Math.max(max, Math.max(f3, f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable d(Drawable drawable) {
        int i;
        int i2;
        if (((setSplitTrack) this.n).d) {
            i2 = (int) Math.ceil((double) g());
            i = (int) Math.ceil((double) f());
        } else {
            i = 0;
            i2 = 0;
        }
        return new InsetDrawable(drawable, i, i2, i, i2) { // from class: o.chooseDokumenBelumLengkap.3
            @Override // android.graphics.drawable.Drawable
            public final int getMinimumHeight() {
                return -1;
            }

            @Override // android.graphics.drawable.Drawable
            public final int getMinimumWidth() {
                return -1;
            }

            @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.Drawable, android.graphics.drawable.DrawableWrapper
            public final boolean getPadding(Rect rect) {
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        Drawable drawable;
        if (!InfoDialog_ViewBinding.c || (drawable = this.f57o) == null) {
            JenisKodeBankDialog jenisKodeBankDialog = this.v;
            if (jenisKodeBankDialog != null) {
                jenisKodeBankDialog.c(this.l);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        if (!this.k) {
            this.n.d(d(this.e));
        }
        this.n.setForeground(d(this.i));
    }
}
