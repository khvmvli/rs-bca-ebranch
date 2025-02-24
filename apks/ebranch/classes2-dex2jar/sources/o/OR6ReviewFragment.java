package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:o/OR6ReviewFragment.class */
public final class OR6ReviewFragment implements Serializable {
    public static final OR6DataLainnyaFragment_ViewBinding a;
    public static final OR6DataLainnyaFragment_ViewBinding b;
    public static final OR6DataLainnyaFragment_ViewBinding c;
    public static final OR6DataLainnyaFragment_ViewBinding d;
    public static final OR6DataLainnyaFragment_ViewBinding e;
    private static final retryPpuNumber h;
    private static final setTvUbahDataTransaksi i;
    private final List f;

    static {
        setTvUbahDataTransaksi settvubahdatatransaksi = updateDataToDraft.b;
        i = settvubahdatatransaksi;
        b = new OR6DataLainnyaFragment_ViewBinding("^(3[47]\\d{13})$", settvubahdatatransaksi);
        e = new OR6DataLainnyaFragment_ViewBinding("^(30[0-5]\\d{11}|3095\\d{10}|36\\d{12}|3[8-9]\\d{12})$", settvubahdatatransaksi);
        retryPpuNumber retryppunumber = new retryPpuNumber(new String[]{"^(6011\\d{12})$", "^(64[4-9]\\d{13})$", "^(65\\d{14})$"});
        h = retryppunumber;
        c = new OR6DataLainnyaFragment_ViewBinding(retryppunumber, settvubahdatatransaksi);
        a = new OR6DataLainnyaFragment_ViewBinding("^(5[1-5]\\d{14})$", settvubahdatatransaksi);
        d = new OR6DataLainnyaFragment_ViewBinding("^(4)(\\d{12}|\\d{15})$", settvubahdatatransaksi);
    }

    public OR6ReviewFragment() {
        this(15);
    }

    public OR6ReviewFragment(long j) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        boolean z = true;
        if ((2 & j) > 0) {
            arrayList.add(d);
        }
        if ((1 & j) > 0) {
            arrayList.add(b);
        }
        if ((4 & j) > 0) {
            arrayList.add(a);
        }
        if ((8 & j) > 0) {
            arrayList.add(c);
        }
        if ((j & 16) <= 0) {
            z = false;
        }
        if (z) {
            arrayList.add(e);
        }
    }

    public final boolean e(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            if (((OR6DataLainnyaFragment_ViewBinding) this.f.get(i2)).d(str) != null) {
                return true;
            }
        }
        return false;
    }
}
