package o;
/* loaded from: classes-dex2jar.jar:o/getCategorySttCode.class */
public final class getCategorySttCode {
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public getCategorySttCode(String str, String str2, String str3, String str4) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        this.d = str;
        this.c = str2;
        this.e = str3;
        this.b = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCategorySttCode)) {
            return false;
        }
        getCategorySttCode getcategorysttcode = (getCategorySttCode) obj;
        return subscribeReservationRescheduleEvent.b((Object) this.d, (Object) getcategorysttcode.d) && subscribeReservationRescheduleEvent.b((Object) this.c, (Object) getcategorysttcode.c) && subscribeReservationRescheduleEvent.b((Object) this.e, (Object) getcategorysttcode.e) && subscribeReservationRescheduleEvent.b((Object) this.b, (Object) getcategorysttcode.b);
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = this.c.hashCode();
        String str = this.e;
        int i = 0;
        int hashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogData(title=");
        sb.append(this.d);
        sb.append(", message=");
        sb.append(this.c);
        sb.append(", positiveButtonText=");
        sb.append(this.e);
        sb.append(", negativeButtonText=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
