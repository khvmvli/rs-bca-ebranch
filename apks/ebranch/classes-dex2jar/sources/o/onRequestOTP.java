package o;

import java.lang.reflect.Field;
import java.util.Locale;
/* loaded from: classes-dex2jar.jar:o/onRequestOTP.class */
public enum onRequestOTP implements onSelectNomorOTP {
    IDENTITY {
        @Override // o.onSelectNomorOTP
        public final String e(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        @Override // o.onSelectNomorOTP
        public final String e(Field field) {
            return c(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        @Override // o.onSelectNomorOTP
        public final String e(Field field) {
            return c(e(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        @Override // o.onSelectNomorOTP
        public final String e(Field field) {
            return e(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        @Override // o.onSelectNomorOTP
        public final String e(Field field) {
            return e(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        @Override // o.onSelectNomorOTP
        public final String e(Field field) {
            return e(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    /* synthetic */ onRequestOTP(byte b) {
        this();
    }

    static String c(String str) {
        int length = str.length();
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length - 1) {
            i++;
        }
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(upperCase);
            sb.append(str.substring(1));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, i));
        sb2.append(upperCase);
        sb2.append(str.substring(i + 1));
        return sb2.toString();
    }

    static String e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
