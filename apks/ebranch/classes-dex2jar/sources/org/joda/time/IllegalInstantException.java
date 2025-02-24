package org.joda.time;

import org.joda.time.format.DateTimeFormat;
/* loaded from: classes-dex2jar.jar:org/joda/time/IllegalInstantException.class */
public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID;

    public IllegalInstantException(long j, String str) {
        super(createMessage(j, str));
    }

    public IllegalInstantException(String str) {
        super(str);
    }

    private static String createMessage(long j, String str) {
        String str2;
        String print = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new Instant(j));
        if (str != null) {
            StringBuilder sb = new StringBuilder(" (");
            sb.append(str);
            sb.append(")");
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        StringBuilder sb2 = new StringBuilder("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ");
        sb2.append(print);
        sb2.append(str2);
        return sb2.toString();
    }

    public static boolean isIllegalInstant(Throwable th) {
        while (!(th instanceof IllegalInstantException)) {
            if (th.getCause() == null || th.getCause() == th) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }
}
