package o;

import android.graphics.drawable.Drawable;
/* loaded from: classes-dex2jar.jar:o/GetTxnTellerDetailKUResponse$$Parcelable.class */
public abstract class GetTxnTellerDetailKUResponse$$Parcelable<T> implements getCurrencyName<T> {
    private final int a;
    private final int b;
    private getNextCategory e;

    public GetTxnTellerDetailKUResponse$$Parcelable() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    private GetTxnTellerDetailKUResponse$$Parcelable(int i, int i2) {
        if (getTxnNotes2.d(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.a = Integer.MIN_VALUE;
            this.b = Integer.MIN_VALUE;
            return;
        }
        StringBuilder sb = new StringBuilder("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb.append(Integer.MIN_VALUE);
        sb.append(" and height: ");
        sb.append(Integer.MIN_VALUE);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // o.setVendorKiosk
    public final void a() {
    }

    @Override // o.getCurrencyName
    public final void a(Drawable drawable) {
    }

    @Override // o.getCurrencyName
    public final void b(Drawable drawable) {
    }

    @Override // o.getCurrencyName
    public final void b(GetTxnTellerDetailResponse$$Parcelable getTxnTellerDetailResponse$$Parcelable) {
    }

    @Override // o.setVendorKiosk
    public final void c() {
    }

    @Override // o.setVendorKiosk
    public final void d() {
    }

    @Override // o.getCurrencyName
    public final getNextCategory e() {
        return this.e;
    }

    @Override // o.getCurrencyName
    public final void e(GetTxnTellerDetailResponse$$Parcelable getTxnTellerDetailResponse$$Parcelable) {
        getTxnTellerDetailResponse$$Parcelable.c(this.a, this.b);
    }

    @Override // o.getCurrencyName
    public final void e(getNextCategory getnextcategory) {
        this.e = getnextcategory;
    }
}
