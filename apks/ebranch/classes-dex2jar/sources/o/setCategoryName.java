package o;

import java.io.InputStream;
import java.net.URL;
import o.getAmountKliring;
/* loaded from: classes-dex2jar.jar:o/setCategoryName.class */
public final class setCategoryName implements getAmountKliring<URL, InputStream> {
    private final getAmountKliring<setRefNo, InputStream> c;

    /* loaded from: classes-dex2jar.jar:o/setCategoryName$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements GetAcctOpeningCategoryDataResponse<URL, InputStream> {
        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<URL, InputStream> e(getListCategory getlistcategory) {
            return new setCategoryName(getlistcategory.b(setRefNo.class, InputStream.class));
        }
    }

    public setCategoryName(getAmountKliring<setRefNo, InputStream> getamountkliring) {
        this.c = getamountkliring;
    }

    @Override // o.getAmountKliring
    public final /* bridge */ /* synthetic */ boolean a(URL url) {
        return true;
    }

    @Override // o.getAmountKliring
    public final /* synthetic */ getAmountKliring.write<InputStream> c(URL url, int i, int i2, CategoryResponse categoryResponse) {
        return this.c.c(new setRefNo(url), i, i2, categoryResponse);
    }
}
