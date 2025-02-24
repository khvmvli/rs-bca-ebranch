package o;

import java.io.InputStream;
import o.getAmountKliring;
import o.setBankNameKliring;
/* loaded from: classes-dex2jar.jar:o/GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable.class */
public final class GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable implements getAmountKliring<setRefNo, InputStream> {
    public static final getCode<Integer> e = getCode.c("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    private final setBankNameKliring<setRefNo, setRefNo> d;

    /* loaded from: classes-dex2jar.jar:o/GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable$read.class */
    public static final class read implements GetAcctOpeningCategoryDataResponse<setRefNo, InputStream> {
        private final setBankNameKliring<setRefNo, setRefNo> c = new setBankNameKliring<>(500);

        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<setRefNo, InputStream> e(getListCategory getlistcategory) {
            return new GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable(this.c);
        }
    }

    public GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable() {
        this(null);
    }

    public GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable(setBankNameKliring<setRefNo, setRefNo> setbanknamekliring) {
        this.d = setbanknamekliring;
    }

    @Override // o.getAmountKliring
    public final /* bridge */ /* synthetic */ boolean a(setRefNo setrefno) {
        return true;
    }

    @Override // o.getAmountKliring
    public final /* synthetic */ getAmountKliring.write<InputStream> c(setRefNo setrefno, int i, int i2, CategoryResponse categoryResponse) {
        setRefNo setrefno2 = setrefno;
        setBankNameKliring<setRefNo, setRefNo> setbanknamekliring = this.d;
        setRefNo setrefno3 = setrefno2;
        if (setbanknamekliring != null) {
            setrefno3 = setbanknamekliring.b(setrefno2, 0, 0);
            if (setrefno3 == null) {
                this.d.e.e(setBankNameKliring.RemoteActionCompatParcelizer.b(setrefno2, 0, 0), setrefno2);
                setrefno3 = setrefno2;
            }
        }
        getCode<Integer> getcode = e;
        return new getAmountKliring.write<>(setrefno3, new getTxnType(setrefno3, ((Integer) (categoryResponse.c.containsKey(getcode) ? categoryResponse.c.get(getcode) : getcode.a)).intValue()));
    }
}
