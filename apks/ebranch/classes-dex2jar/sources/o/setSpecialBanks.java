package o;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.setBranchLists;
/* loaded from: classes-dex2jar.jar:o/setSpecialBanks.class */
public final class setSpecialBanks implements CategoryResponse$$Parcelable<ByteBuffer, Bitmap> {
    private final getBankKey a;

    public setSpecialBanks(getBankKey getbankkey) {
        this.a = getbankkey;
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* bridge */ /* synthetic */ boolean a(ByteBuffer byteBuffer, CategoryResponse categoryResponse) throws IOException {
        return true;
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* synthetic */ setIbanFlag<Bitmap> d(ByteBuffer byteBuffer, int i, int i2, CategoryResponse categoryResponse) throws IOException {
        InputStream b = getLimitMin.b(byteBuffer);
        getBankKey getbankkey = this.a;
        return getbankkey.c(new setBranchLists.read(b, getbankkey.h, getbankkey.f), i, i2, categoryResponse, getBankKey.d);
    }
}
