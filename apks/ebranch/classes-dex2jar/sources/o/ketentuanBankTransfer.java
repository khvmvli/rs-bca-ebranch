package o;
/* loaded from: classes-dex2jar.jar:o/ketentuanBankTransfer.class */
public final class ketentuanBankTransfer {
    private static final int e;

    static {
        String property = System.getProperty("java.version");
        int d = d(property);
        int i = d;
        if (d == -1) {
            i = e(property);
        }
        int i2 = i;
        if (i == -1) {
            i2 = 6;
        }
        e = i2;
    }

    public static int a() {
        return e;
    }

    public static boolean c() {
        return e >= 9;
    }

    private static int d(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException e2) {
            return -1;
        }
    }

    private static int e(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e2) {
            return -1;
        }
    }
}
