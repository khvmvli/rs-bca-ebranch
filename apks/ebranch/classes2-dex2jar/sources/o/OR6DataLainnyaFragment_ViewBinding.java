package o;

import java.io.Serializable;
/* loaded from: classes2-dex2jar.jar:o/OR6DataLainnyaFragment_ViewBinding.class */
public final class OR6DataLainnyaFragment_ViewBinding implements Serializable {
    private final int a;
    private final retryPpuNumber b;
    private final setTvUbahDataTransaksi c;
    private final int e;

    private OR6DataLainnyaFragment_ViewBinding(String str, int i, int i2, setTvUbahDataTransaksi settvubahdatatransaksi) {
        if (str == null || str.length() <= 0) {
            this.b = null;
        } else {
            this.b = new retryPpuNumber(str);
        }
        this.e = i;
        this.a = i2;
        this.c = settvubahdatatransaksi;
    }

    public OR6DataLainnyaFragment_ViewBinding(String str, int i, setTvUbahDataTransaksi settvubahdatatransaksi) {
        this(str, i, i, settvubahdatatransaksi);
    }

    public OR6DataLainnyaFragment_ViewBinding(String str, setTvUbahDataTransaksi settvubahdatatransaksi) {
        this(str, -1, -1, settvubahdatatransaksi);
    }

    private OR6DataLainnyaFragment_ViewBinding(retryPpuNumber retryppunumber, int i, int i2, setTvUbahDataTransaksi settvubahdatatransaksi) {
        this.b = retryppunumber;
        this.e = -1;
        this.a = -1;
        this.c = settvubahdatatransaksi;
    }

    public OR6DataLainnyaFragment_ViewBinding(retryPpuNumber retryppunumber, setTvUbahDataTransaksi settvubahdatatransaksi) {
        this(retryppunumber, -1, -1, settvubahdatatransaksi);
    }

    public final Object d(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return null;
        }
        retryPpuNumber retryppunumber = this.b;
        String str2 = trim;
        if (retryppunumber != null) {
            String b = retryppunumber.b(trim);
            str2 = b;
            if (b == null) {
                return null;
            }
        }
        if (this.e >= 0 && str2.length() < this.e) {
            return null;
        }
        if (this.a >= 0 && str2.length() > this.a) {
            return null;
        }
        setTvUbahDataTransaksi settvubahdatatransaksi = this.c;
        if (settvubahdatatransaksi == null || settvubahdatatransaksi.a(str2)) {
            return str2;
        }
        return null;
    }
}
