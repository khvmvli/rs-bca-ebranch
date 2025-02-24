package o;
/* loaded from: classes-dex2jar.jar:o/OpenCCSuccessActivity.class */
public final class OpenCCSuccessActivity {
    @infoContactPersonDialogEvent(c = "UpgradeMessage")
    public String a;
    @infoContactPersonDialogEvent(c = "AppNewVersion")
    private String b;
    @infoContactPersonDialogEvent(c = "UpgradeURL")
    public String c;
    @infoContactPersonDialogEvent(c = "UpgradeType")
    public String e;

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckVersionResponse{upgradeType='");
        sb.append(this.e);
        sb.append("', upgradeMessage='");
        sb.append(this.a);
        sb.append("', upgradeUrl='");
        sb.append(this.c);
        sb.append("', appNewVersion='");
        sb.append(this.b);
        sb.append("'}");
        return sb.toString();
    }
}
