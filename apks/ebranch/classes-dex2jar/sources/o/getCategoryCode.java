package o;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import o.getAmountKliring;
/* loaded from: classes-dex2jar.jar:o/getCategoryCode.class */
public final class getCategoryCode<Data> implements getAmountKliring<String, Data> {
    private final getAmountKliring<Uri, Data> e;

    /* loaded from: classes-dex2jar.jar:o/getCategoryCode$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements GetAcctOpeningCategoryDataResponse<String, ParcelFileDescriptor> {
        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<String, ParcelFileDescriptor> e(getListCategory getlistcategory) {
            return new getCategoryCode(getlistcategory.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getCategoryCode$read.class */
    public static final class read implements GetAcctOpeningCategoryDataResponse<String, InputStream> {
        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<String, InputStream> e(getListCategory getlistcategory) {
            return new getCategoryCode(getlistcategory.b(Uri.class, InputStream.class));
        }
    }

    public getCategoryCode(getAmountKliring<Uri, Data> getamountkliring) {
        this.e = getamountkliring;
    }

    @Override // o.getAmountKliring
    public final /* bridge */ /* synthetic */ boolean a(String str) {
        return true;
    }

    @Override // o.getAmountKliring
    public final /* synthetic */ getAmountKliring.write c(String str, int i, int i2, CategoryResponse categoryResponse) {
        Uri uri;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uri = null;
        } else if (str2.charAt(0) == '/') {
            uri = Uri.fromFile(new File(str2));
        } else {
            uri = Uri.parse(str2);
            if (uri.getScheme() == null) {
                uri = Uri.fromFile(new File(str2));
            }
        }
        if (uri == null || !this.e.a(uri)) {
            return null;
        }
        return this.e.c(uri, i, i2, categoryResponse);
    }
}
