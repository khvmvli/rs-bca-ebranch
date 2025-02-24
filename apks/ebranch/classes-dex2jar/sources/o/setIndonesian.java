package o;

import android.graphics.Bitmap;
/* loaded from: classes-dex2jar.jar:o/setIndonesian.class */
public final class setIndonesian implements setIbanFlag<Bitmap>, getAliasName {
    private final Bitmap a;
    private final setValueArray e;

    public setIndonesian(Bitmap bitmap, setValueArray setvaluearray) {
        if (bitmap != null) {
            this.a = bitmap;
            if (setvaluearray != null) {
                this.e = setvaluearray;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    @Override // o.setIbanFlag
    public final /* bridge */ /* synthetic */ Bitmap a() {
        return this.a;
    }

    @Override // o.setIbanFlag
    public final void b() {
        this.e.b(this.a);
    }

    @Override // o.getAliasName
    public final void c() {
        this.a.prepareToDraw();
    }

    @Override // o.setIbanFlag
    public final int d() {
        return getTxnNotes2.a(this.a);
    }

    @Override // o.setIbanFlag
    public final Class<Bitmap> e() {
        return Bitmap.class;
    }
}
