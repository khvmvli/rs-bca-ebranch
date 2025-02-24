package o;
/* loaded from: classes-dex2jar.jar:o/getTxbDateFormatted.class */
public final class getTxbDateFormatted {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
