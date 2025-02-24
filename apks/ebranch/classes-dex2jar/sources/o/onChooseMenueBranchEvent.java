package o;
/* loaded from: classes-dex2jar.jar:o/onChooseMenueBranchEvent.class */
public final class onChooseMenueBranchEvent {
    @infoContactPersonDialogEvent(c = "address")
    private String a;
    @infoContactPersonDialogEvent(c = "source_account_owner_id")
    private String b;
    @infoContactPersonDialogEvent(c = "phone_number")
    private String c;
    @infoContactPersonDialogEvent(c = "name")
    private String d;

    public onChooseMenueBranchEvent() {
        this(null, null, null, null, 15);
    }

    public onChooseMenueBranchEvent(String str, String str2, String str3, String str4) {
        this.b = str;
        this.d = str2;
        this.a = str3;
        this.c = str4;
    }

    public /* synthetic */ onChooseMenueBranchEvent(String str, String str2, String str3, String str4, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onChooseMenueBranchEvent)) {
            return false;
        }
        onChooseMenueBranchEvent onchoosemenuebranchevent = (onChooseMenueBranchEvent) obj;
        return subscribeReservationRescheduleEvent.b((Object) this.b, (Object) onchoosemenuebranchevent.b) && subscribeReservationRescheduleEvent.b((Object) this.d, (Object) onchoosemenuebranchevent.d) && subscribeReservationRescheduleEvent.b((Object) this.a, (Object) onchoosemenuebranchevent.a) && subscribeReservationRescheduleEvent.b((Object) this.c, (Object) onchoosemenuebranchevent.c);
    }

    public final int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.d;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.a;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.c;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateDaftarPemilikSumberDanaRequest(sourceAccountOwnerId=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", address=");
        sb.append(this.a);
        sb.append(", phoneNumber=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
