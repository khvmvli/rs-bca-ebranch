package o;

import android.graphics.Bitmap;
import java.security.MessageDigest;
/* loaded from: classes-dex2jar.jar:o/setRelationCode.class */
public final class setRelationCode extends GetAcctOpeningCategoryDataResponse$Languange$$Parcelable {
    private static final byte[] d = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(e);

    @Override // o.GetAcctOpeningCategoryDataResponse$Languange$$Parcelable
    protected final Bitmap d(setValueArray setvaluearray, Bitmap bitmap, int i, int i2) {
        return getBranchType.d(setvaluearray, bitmap, i, i2);
    }

    @Override // o.setCode
    public final void e(MessageDigest messageDigest) {
        messageDigest.update(d);
    }

    @Override // o.setCode
    public final boolean equals(Object obj) {
        return obj instanceof setRelationCode;
    }

    @Override // o.setCode
    public final int hashCode() {
        return 1572326941;
    }
}
