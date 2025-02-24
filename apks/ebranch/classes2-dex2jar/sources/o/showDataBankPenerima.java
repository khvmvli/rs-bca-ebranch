package o;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
/* loaded from: classes2-dex2jar.jar:o/showDataBankPenerima.class */
public final class showDataBankPenerima implements Serializable {
    private final Set f;
    private final retryPpuNumber i;
    private final long m;
    private static final Pattern g = Pattern.compile("^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?");
    private static final Pattern h = Pattern.compile("^\\p{Alpha}[\\p{Alnum}\\+\\-\\.]*");
    private static final Pattern c = Pattern.compile("^([\\p{Alnum}\\-\\.]*)(:\\d*)?(.*)?");
    private static final Pattern d = Pattern.compile("^(/[-\\w:@&?=+,.!/~*'%$_;\\(\\)]*)?$");
    private static final Pattern j = Pattern.compile("^(.*)$");
    private static final Pattern e = Pattern.compile("^:(\\d{1,5})$");
    private static final String[] a = {"http", "https", "ftp"};
    private static final showDataBankPenerima b = new showDataBankPenerima();

    public showDataBankPenerima() {
        this(null);
    }

    private showDataBankPenerima(String[] strArr) {
        this(strArr, 0);
    }

    public showDataBankPenerima(String[] strArr, long j2) {
        this(strArr, null, j2);
    }

    private showDataBankPenerima(String[] strArr, retryPpuNumber retryppunumber, long j2) {
        this.m = j2;
        if ((j2 & 1) > 0) {
            this.f = Collections.EMPTY_SET;
        } else {
            String[] strArr2 = strArr == null ? a : strArr;
            this.f = new HashSet(strArr2.length);
            for (String str : strArr2) {
                this.f.add(str.toLowerCase(Locale.ENGLISH));
            }
        }
        this.i = retryppunumber;
    }

    public static showDataBankPenerima c() {
        return b;
    }

    private static int d(String str, String str2) {
        int i = 0;
        int i2 = 0;
        while (i != -1) {
            int indexOf = str2.indexOf(str, i);
            i = indexOf;
            if (indexOf >= 0) {
                i = indexOf + 1;
                i2++;
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0104, code lost:
        if ((r0.d(r0) || r0.c(r0)) == false) goto L_0x0089;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011f, code lost:
        if (o.showDataBankPenerima.e.matcher(r0).matches() == false) goto L_0x0089;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013a, code lost:
        if (r0.trim().length() > 0) goto L_0x0089;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean c(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 525
        */
        throw new UnsupportedOperationException("Method not decompiled: o.showDataBankPenerima.c(java.lang.String):boolean");
    }
}
