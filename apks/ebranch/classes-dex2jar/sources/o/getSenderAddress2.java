package o;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* loaded from: classes-dex2jar.jar:o/getSenderAddress2.class */
public abstract class getSenderAddress2<Z> extends GetTxnTellerDetailResponse<ImageView, Z> {
    private Animatable c;

    public getSenderAddress2(ImageView imageView) {
        super(imageView);
    }

    private void d(Z z) {
        b((getSenderAddress2<Z>) z);
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.c = animatable;
            animatable.start();
            return;
        }
        this.c = null;
    }

    @Override // o.GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable, o.setVendorKiosk
    public final void a() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // o.GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable, o.getCurrencyName
    public final void a(Drawable drawable) {
        a(drawable);
        d(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // o.GetTxnTellerDetailResponse, o.GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable, o.getCurrencyName
    public final void b(Drawable drawable) {
        b(drawable);
        d(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    protected abstract void b(Z z);

    @Override // o.GetTxnTellerDetailResponse, o.GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable, o.getCurrencyName
    public final void c(Drawable drawable) {
        c(drawable);
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        d(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // o.GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable, o.setVendorKiosk
    public final void d() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // o.getCurrencyName
    public final void e(Z z, getFlag_iban<? super Z> getflag_iban) {
        d(z);
    }
}
