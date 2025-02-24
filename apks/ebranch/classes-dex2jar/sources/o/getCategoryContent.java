package o;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.getAmountKliring;
/* loaded from: classes-dex2jar.jar:o/getCategoryContent.class */
public final class getCategoryContent<Data> implements getAmountKliring<Uri, Data> {
    private static final Set<String> c = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final getAmountKliring<setRefNo, Data> b;

    /* loaded from: classes-dex2jar.jar:o/getCategoryContent$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements GetAcctOpeningCategoryDataResponse<Uri, InputStream> {
        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<Uri, InputStream> e(getListCategory getlistcategory) {
            return new getCategoryContent(getlistcategory.b(setRefNo.class, InputStream.class));
        }
    }

    public getCategoryContent(getAmountKliring<setRefNo, Data> getamountkliring) {
        this.b = getamountkliring;
    }

    @Override // o.getAmountKliring
    public final /* synthetic */ boolean a(Uri uri) {
        return c.contains(uri.getScheme());
    }

    @Override // o.getAmountKliring
    public final /* synthetic */ getAmountKliring.write c(Uri uri, int i, int i2, CategoryResponse categoryResponse) {
        return this.b.c(new setRefNo(uri.toString()), i, i2, categoryResponse);
    }
}
