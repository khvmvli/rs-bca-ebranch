package o;

import android.graphics.Bitmap;
import o.setCategoryEn;
/* loaded from: classes-dex2jar.jar:o/getPrioritasKiosk.class */
public final class getPrioritasKiosk implements setCategoryEn.IconCompatParcelizer {
    private final DetailTransactionResponse a;
    private final setValueArray e;

    public getPrioritasKiosk(setValueArray setvaluearray, DetailTransactionResponse detailTransactionResponse) {
        this.e = setvaluearray;
        this.a = detailTransactionResponse;
    }

    @Override // o.setCategoryEn.IconCompatParcelizer
    public final void a(byte[] bArr) {
        DetailTransactionResponse detailTransactionResponse = this.a;
        if (detailTransactionResponse != null) {
            detailTransactionResponse.e(bArr);
        }
    }

    @Override // o.setCategoryEn.IconCompatParcelizer
    public final byte[] b(int i) {
        DetailTransactionResponse detailTransactionResponse = this.a;
        return detailTransactionResponse == null ? new byte[i] : (byte[]) detailTransactionResponse.b(i, byte[].class);
    }

    @Override // o.setCategoryEn.IconCompatParcelizer
    public final void d(Bitmap bitmap) {
        this.e.b(bitmap);
    }

    @Override // o.setCategoryEn.IconCompatParcelizer
    public final Bitmap e(int i, int i2, Bitmap.Config config) {
        return this.e.a(i, i2, config);
    }

    @Override // o.setCategoryEn.IconCompatParcelizer
    public final void e(int[] iArr) {
        DetailTransactionResponse detailTransactionResponse = this.a;
        if (detailTransactionResponse != null) {
            detailTransactionResponse.e(iArr);
        }
    }

    @Override // o.setCategoryEn.IconCompatParcelizer
    public final int[] e(int i) {
        DetailTransactionResponse detailTransactionResponse = this.a;
        return detailTransactionResponse == null ? new int[i] : (int[]) detailTransactionResponse.b(i, int[].class);
    }
}
