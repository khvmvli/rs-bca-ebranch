package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;
import o.GetBranchROResponse;
/* loaded from: classes-dex2jar.jar:o/setEnglish.class */
public final class setEnglish<DataType> implements CategoryResponse$$Parcelable<DataType, BitmapDrawable> {
    private final CategoryResponse$$Parcelable<DataType, Bitmap> a;
    private final Resources e;

    public setEnglish(Resources resources, CategoryResponse$$Parcelable<DataType, Bitmap> categoryResponse$$Parcelable) {
        if (resources != null) {
            this.e = resources;
            if (categoryResponse$$Parcelable != null) {
                this.a = categoryResponse$$Parcelable;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // o.CategoryResponse$$Parcelable
    public final boolean a(DataType datatype, CategoryResponse categoryResponse) throws IOException {
        return this.a.a(datatype, categoryResponse);
    }

    @Override // o.CategoryResponse$$Parcelable
    public final setIbanFlag<BitmapDrawable> d(DataType datatype, int i, int i2, CategoryResponse categoryResponse) throws IOException {
        setIbanFlag<Bitmap> d = this.a.d(datatype, i, i2, categoryResponse);
        Resources resources = this.e;
        if (d == null) {
            return null;
        }
        return new GetBranchROResponse.DetailBranch(resources, d);
    }
}
