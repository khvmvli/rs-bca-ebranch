package o;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import o.getBankKey;
import o.setBranchLists;
/* loaded from: classes-dex2jar.jar:o/getDistanceToBranch.class */
public final class getDistanceToBranch implements CategoryResponse$$Parcelable<InputStream, Bitmap> {
    private final getBankKey a;
    private final DetailTransactionResponse c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getDistanceToBranch$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements getBankKey.read {
        private final getTxnCategoryPurpose a;
        private final GetBranchROResponse$$Parcelable d;

        IconCompatParcelizer(GetBranchROResponse$$Parcelable getBranchROResponse$$Parcelable, getTxnCategoryPurpose gettxncategorypurpose) {
            this.d = getBranchROResponse$$Parcelable;
            this.a = gettxncategorypurpose;
        }

        @Override // o.getBankKey.read
        public final void b() {
            GetBranchROResponse$$Parcelable getBranchROResponse$$Parcelable = this.d;
            synchronized (getBranchROResponse$$Parcelable) {
                getBranchROResponse$$Parcelable.b = getBranchROResponse$$Parcelable.a.length;
            }
        }

        @Override // o.getBankKey.read
        public final void e(setValueArray setvaluearray, Bitmap bitmap) throws IOException {
            IOException iOException = this.a.c;
            if (iOException != null) {
                if (bitmap != null) {
                    setvaluearray.b(bitmap);
                }
                throw iOException;
            }
        }
    }

    public getDistanceToBranch(getBankKey getbankkey, DetailTransactionResponse detailTransactionResponse) {
        this.a = getbankkey;
        this.c = detailTransactionResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public setIbanFlag<Bitmap> d(InputStream inputStream, int i, int i2, CategoryResponse categoryResponse) throws IOException {
        boolean z;
        GetBranchROResponse$$Parcelable getBranchROResponse$$Parcelable;
        if (inputStream instanceof GetBranchROResponse$$Parcelable) {
            getBranchROResponse$$Parcelable = (GetBranchROResponse$$Parcelable) inputStream;
            z = false;
        } else {
            getBranchROResponse$$Parcelable = new GetBranchROResponse$$Parcelable(inputStream, this.c);
            z = true;
        }
        getTxnCategoryPurpose d = getTxnCategoryPurpose.d(getBranchROResponse$$Parcelable);
        getWarkat getwarkat = new getWarkat(d);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(getBranchROResponse$$Parcelable, d);
        try {
            getBankKey getbankkey = this.a;
            setIbanFlag<Bitmap> c = getbankkey.c(new setBranchLists.read(getwarkat, getbankkey.h, getbankkey.f), i, i2, categoryResponse, iconCompatParcelizer);
            d.c = null;
            d.a = null;
            Queue<getTxnCategoryPurpose> queue = getTxnCategoryPurpose.b;
            synchronized (queue) {
                try {
                    queue.offer(d);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                getBranchROResponse$$Parcelable.d();
            }
            return c;
        } catch (Throwable th2) {
            d.c = null;
            d.a = null;
            Queue<getTxnCategoryPurpose> queue2 = getTxnCategoryPurpose.b;
            synchronized (queue2) {
                try {
                    queue2.offer(d);
                    if (z) {
                        getBranchROResponse$$Parcelable.d();
                    }
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* bridge */ /* synthetic */ boolean a(InputStream inputStream, CategoryResponse categoryResponse) throws IOException {
        return true;
    }
}
