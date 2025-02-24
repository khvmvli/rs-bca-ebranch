package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/getEmergencyCloseStartDate.class */
public final class getEmergencyCloseStartDate implements CategoryResponse$$Parcelable<Uri, Bitmap> {
    private final setValueArray a;
    private final getFlagWeekendBankingSunday b;

    public getEmergencyCloseStartDate(getFlagWeekendBankingSunday getflagweekendbankingsunday, setValueArray setvaluearray) {
        this.b = getflagweekendbankingsunday;
        this.a = setvaluearray;
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* synthetic */ boolean a(Uri uri, CategoryResponse categoryResponse) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* synthetic */ setIbanFlag<Bitmap> d(Uri uri, int i, int i2, CategoryResponse categoryResponse) throws IOException {
        setIbanFlag<Drawable> a = this.b.a(uri);
        if (a == null) {
            return null;
        }
        return setBankKey.e(this.a, a.a(), i, i2);
    }
}
