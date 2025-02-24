package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes-dex2jar.jar:o/getBranchLists.class */
public final class getBranchLists implements CategoryResponse$$Parcelable<InputStream, Bitmap> {
    private final GetBankSpecialRelationResponse c = new GetBankSpecialRelationResponse();

    @Override // o.CategoryResponse$$Parcelable
    public final /* bridge */ /* synthetic */ boolean a(InputStream inputStream, CategoryResponse categoryResponse) throws IOException {
        return true;
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* synthetic */ setIbanFlag<Bitmap> d(InputStream inputStream, int i, int i2, CategoryResponse categoryResponse) throws IOException {
        return this.c.d(ImageDecoder.createSource(getLimitMin.c(inputStream)), i, i2, categoryResponse);
    }
}
