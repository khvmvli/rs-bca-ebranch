package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes2-dex2jar.jar:o/pilihHubunganKeuanganOR.class */
public final class pilihHubunganKeuanganOR implements Serializable {
    private static final pilihHubunganKeuanganOR a = new pilihHubunganKeuanganOR();
    private final retryPpuNumber e = new retryPpuNumber("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");

    public static pilihHubunganKeuanganOR b() {
        return a;
    }

    public final boolean c(String str) {
        boolean z = str.indexOf("::") >= 0;
        if (z && str.indexOf("::") != str.lastIndexOf("::")) {
            return false;
        }
        if (str.startsWith(":") && !str.startsWith("::")) {
            return false;
        }
        if (str.endsWith(":") && !str.endsWith("::")) {
            return false;
        }
        String[] split = str.split(":");
        Object[] objArr = split;
        if (z) {
            ArrayList arrayList = new ArrayList(Arrays.asList(split));
            if (str.endsWith("::")) {
                arrayList.add("");
            } else if (str.startsWith("::") && !arrayList.isEmpty()) {
                arrayList.remove(0);
            }
            objArr = arrayList.toArray();
        }
        if (objArr.length > 8) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            String str2 = (String) objArr[i3];
            if (str2.length() == 0) {
                int i4 = i2 + 1;
                i2 = i4;
                if (i4 > 1) {
                    return false;
                }
            } else if (str2.indexOf(".") >= 0) {
                if (!str.endsWith(str2) || i3 > objArr.length - 1 || i3 > 6 || !d(str2)) {
                    return false;
                }
                i += 2;
                i2 = 0;
            } else if (str2.length() > 4) {
                return false;
            } else {
                try {
                    int intValue = Integer.valueOf(str2, 16).intValue();
                    if (intValue < 0 || intValue > 65535) {
                        return false;
                    }
                    i2 = 0;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
            i++;
        }
        return i >= 8 || z;
    }

    public final boolean d(String str) {
        String[] e = this.e.e(str);
        if (e == null) {
            return false;
        }
        for (int i = 0; i <= 3; i++) {
            String str2 = e[i];
            if (str2 == null || str2.length() == 0) {
                return false;
            }
            try {
                if (Integer.parseInt(str2) > 255) {
                    return false;
                }
                if (str2.length() > 1 && str2.startsWith("0")) {
                    return false;
                }
            } catch (NumberFormatException e2) {
                return false;
            }
        }
        return true;
    }
}
