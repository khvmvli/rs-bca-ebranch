package o;

import android.graphics.Bitmap;
import java.security.MessageDigest;
/* loaded from: classes-dex2jar.jar:o/getRelationCode.class */
public final class getRelationCode extends GetAcctOpeningCategoryDataResponse$Languange$$Parcelable {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(e);

    @Override // o.GetAcctOpeningCategoryDataResponse$Languange$$Parcelable
    protected final Bitmap d(setValueArray setvaluearray, Bitmap bitmap, int i, int i2) {
        return getBranchType.a(setvaluearray, bitmap, i, i2);
    }

    @Override // o.setCode
    public final void e(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // o.setCode
    public final boolean equals(Object obj) {
        return obj instanceof getRelationCode;
    }

    @Override // o.setCode
    public final int hashCode() {
        return -599754482;
    }
}
