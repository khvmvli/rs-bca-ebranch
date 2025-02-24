package o;
/* loaded from: classes-dex2jar.jar:o/detailRTGSCNY.class */
public final class detailRTGSCNY {
    @infoContactPersonDialogEvent(c = "error_code")
    public String a;
    @infoContactPersonDialogEvent(c = "ErrorMessage")
    public String b;
    @infoContactPersonDialogEvent(c = "ErrorCode")
    public String c;
    @infoContactPersonDialogEvent(c = "error_message")
    public detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver e;

    public final boolean e() {
        String str = this.a;
        if (str != null) {
            return str.length() > 3 && "EBR-1".equalsIgnoreCase(this.a.substring(0, 5));
        }
        String str2 = this.c;
        if (str2 == null || str2.length() <= 3) {
            return false;
        }
        String str3 = this.c;
        return "000".equalsIgnoreCase(str3.substring(str3.length() - 3));
    }
}
