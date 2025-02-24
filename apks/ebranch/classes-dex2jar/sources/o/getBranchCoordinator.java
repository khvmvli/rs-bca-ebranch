package o;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import o.setBranchLists;
/* loaded from: classes-dex2jar.jar:o/getBranchCoordinator.class */
public final class getBranchCoordinator implements CategoryResponse$$Parcelable<ParcelFileDescriptor, Bitmap> {
    private final getBankKey e;

    public getBranchCoordinator(getBankKey getbankkey) {
        this.e = getbankkey;
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* synthetic */ boolean a(ParcelFileDescriptor parcelFileDescriptor, CategoryResponse categoryResponse) throws IOException {
        return getBankKey.b();
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* synthetic */ setIbanFlag<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, CategoryResponse categoryResponse) throws IOException {
        getBankKey getbankkey = this.e;
        return getbankkey.c(new setBranchLists.write(parcelFileDescriptor, getbankkey.h, getbankkey.f), i, i2, categoryResponse, getBankKey.d);
    }
}
