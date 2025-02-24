package o;
/* loaded from: classes-dex2jar.jar:o/InfoProductActivity_ViewBinding.class */
public final class InfoProductActivity_ViewBinding {
    @infoContactPersonDialogEvent(c = "Type")
    public final String a;
    @infoContactPersonDialogEvent(c = "SessionId")
    public final String c;
    @infoContactPersonDialogEvent(c = "Email")
    public final String d;
    @infoContactPersonDialogEvent(c = "IMEI")
    public final String e;

    public InfoProductActivity_ViewBinding() {
        this(null, null, null, null, 15);
    }

    public InfoProductActivity_ViewBinding(String str, String str2, String str3, String str4) {
        this.d = str;
        this.c = str2;
        this.e = str3;
        this.a = str4;
    }

    public /* synthetic */ InfoProductActivity_ViewBinding(String str, String str2, String str3, String str4, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoProductActivity_ViewBinding)) {
            return false;
        }
        InfoProductActivity_ViewBinding infoProductActivity_ViewBinding = (InfoProductActivity_ViewBinding) obj;
        return subscribeReservationRescheduleEvent.b((Object) this.d, (Object) infoProductActivity_ViewBinding.d) && subscribeReservationRescheduleEvent.b((Object) this.c, (Object) infoProductActivity_ViewBinding.c) && subscribeReservationRescheduleEvent.b((Object) this.e, (Object) infoProductActivity_ViewBinding.e) && subscribeReservationRescheduleEvent.b((Object) this.a, (Object) infoProductActivity_ViewBinding.a);
    }

    public final int hashCode() {
        String str = this.d;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.c;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.a;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetDaftarPemilikSumberDanaRequest(email=");
        sb.append(this.d);
        sb.append(", sessionId=");
        sb.append(this.c);
        sb.append(", imei=");
        sb.append(this.e);
        sb.append(", type=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
