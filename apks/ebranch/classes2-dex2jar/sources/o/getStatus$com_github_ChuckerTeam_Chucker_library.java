package o;
/* loaded from: classes2-dex2jar.jar:o/getStatus$com_github_ChuckerTeam_Chucker_library.class */
public final /* synthetic */ class getStatus$com_github_ChuckerTeam_Chucker_library {
    private static final int d = Runtime.getRuntime().availableProcessors();

    public static final int e() {
        return d;
    }

    public static final String e(String str) {
        String str2;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException e) {
            str2 = null;
        }
        return str2;
    }
}
