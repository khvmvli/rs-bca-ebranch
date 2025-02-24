package o;

import android.graphics.Bitmap;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/getVendorKiosk.class */
public final class getVendorKiosk implements CategoryResponse$$Parcelable<setCategoryEn, Bitmap> {
    private final setValueArray e;

    public getVendorKiosk(setValueArray setvaluearray) {
        this.e = setvaluearray;
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* bridge */ /* synthetic */ boolean a(setCategoryEn setcategoryen, CategoryResponse categoryResponse) throws IOException {
        return true;
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* synthetic */ setIbanFlag<Bitmap> d(setCategoryEn setcategoryen, int i, int i2, CategoryResponse categoryResponse) throws IOException {
        Bitmap h = setcategoryen.h();
        setValueArray setvaluearray = this.e;
        if (h == null) {
            return null;
        }
        return new setIndonesian(h, setvaluearray);
    }
}
