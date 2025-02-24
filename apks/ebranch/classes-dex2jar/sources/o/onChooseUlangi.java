package o;
/* loaded from: classes-dex2jar.jar:o/onChooseUlangi.class */
public final class onChooseUlangi {
    @infoContactPersonDialogEvent(c = "hp_number", e = {"HPNum"})
    public String a;
    @infoContactPersonDialogEvent(c = "id_num", e = {"IDNum"})
    public String b;
    @infoContactPersonDialogEvent(c = "id_type", e = {"IDType"})
    public String c;
    @infoContactPersonDialogEvent(c = "cust_name", e = {"CustName"})
    public String d;
    @infoContactPersonDialogEvent(c = "acct_no", e = {"AcctNo"})
    public String e;
    @infoContactPersonDialogEvent(c = "membership", e = {"Membership"})
    public String f;
    @infoContactPersonDialogEvent(c = "session_id", e = {"SessionId"})
    public String g;
    @infoContactPersonDialogEvent(c = "upgrade_url", e = {"UpgradeURL"})
    public String h;
    @infoContactPersonDialogEvent(c = "upgrade_type", e = {"UpgradeType"})
    public String i;
    @infoContactPersonDialogEvent(c = "upgrade_message", e = {"UpgradeMessage"})
    public String j;
    @infoContactPersonDialogEvent(c = "flag_verified", e = {"Verified"})
    public String k;
    @infoContactPersonDialogEvent(c = "app_new_version", e = {"AppNewVersion"})

    /* renamed from: o  reason: collision with root package name */
    private String f167o;

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginResponse{sessionId='");
        sb.append(this.g);
        sb.append("', custName='");
        sb.append(this.d);
        sb.append("', hpNum='");
        sb.append(this.a);
        sb.append("', acctNo='");
        sb.append(this.e);
        sb.append("', verified='");
        sb.append(this.k);
        sb.append("', upgradeType='");
        sb.append(this.i);
        sb.append("', upgradeMessage='");
        sb.append(this.j);
        sb.append("', upgradeUrl='");
        sb.append(this.h);
        sb.append("', appNewVersion='");
        sb.append(this.f167o);
        sb.append("'}");
        return sb.toString();
    }
}
