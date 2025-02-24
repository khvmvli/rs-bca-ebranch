package o;
/* loaded from: classes2-dex2jar.jar:o/getResponseSizeString$com_github_ChuckerTeam_Chucker_library.class */
public final class getResponseSizeString$com_github_ChuckerTeam_Chucker_library {
    public static /* synthetic */ int e(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) getResponseTlsVersion.c(str, (long) i, (long) i2, (long) i3);
    }
}
