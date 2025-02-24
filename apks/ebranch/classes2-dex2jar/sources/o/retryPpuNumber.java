package o;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2-dex2jar.jar:o/retryPpuNumber.class */
public final class retryPpuNumber implements Serializable {
    private final Pattern[] c;

    public retryPpuNumber(String str) {
        this(str, true);
    }

    public retryPpuNumber(String str, boolean z) {
        this(new String[]{str}, z);
    }

    public retryPpuNumber(String[] strArr) {
        this(strArr, true);
    }

    private retryPpuNumber(String[] strArr, boolean z) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("Regular expressions are missing");
        }
        this.c = new Pattern[strArr.length];
        int i = z ? 0 : 2;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (str == null || str.length() == 0) {
                StringBuilder sb = new StringBuilder("Regular expression[");
                sb.append(i2);
                sb.append("] is missing");
                throw new IllegalArgumentException(sb.toString());
            }
            this.c[i2] = Pattern.compile(strArr[i2], i);
        }
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            Pattern[] patternArr = this.c;
            if (i2 >= patternArr.length) {
                return null;
            }
            Matcher matcher = patternArr[i2].matcher(str);
            if (matcher.matches()) {
                int groupCount = matcher.groupCount();
                if (groupCount == 1) {
                    return matcher.group(1);
                }
                StringBuffer stringBuffer = new StringBuffer();
                while (i < groupCount) {
                    int i3 = i + 1;
                    String group = matcher.group(i3);
                    i = i3;
                    if (group != null) {
                        stringBuffer.append(group);
                        i = i3;
                    }
                }
                return stringBuffer.toString();
            }
            i2++;
        }
    }

    public final boolean c(String str) {
        if (str == null) {
            return false;
        }
        int i = 0;
        while (true) {
            Pattern[] patternArr = this.c;
            if (i >= patternArr.length) {
                return false;
            }
            if (patternArr[i].matcher(str).matches()) {
                return true;
            }
            i++;
        }
    }

    public final String[] e(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            Pattern[] patternArr = this.c;
            if (i2 >= patternArr.length) {
                return null;
            }
            Matcher matcher = patternArr[i2].matcher(str);
            if (matcher.matches()) {
                int groupCount = matcher.groupCount();
                String[] strArr = new String[groupCount];
                while (i < groupCount) {
                    i++;
                    strArr[i] = matcher.group(i);
                }
                return strArr;
            }
            i2++;
        }
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("RegexValidator{");
        for (int i = 0; i < this.c.length; i++) {
            if (i > 0) {
                stringBuffer.append(",");
            }
            stringBuffer.append(this.c[i].pattern());
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
