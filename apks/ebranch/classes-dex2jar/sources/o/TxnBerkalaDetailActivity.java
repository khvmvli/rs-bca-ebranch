package o;
/* loaded from: classes-dex2jar.jar:o/TxnBerkalaDetailActivity.class */
public final class TxnBerkalaDetailActivity {
    public final String d;
    public static final IconCompatParcelizer c = new IconCompatParcelizer((byte) 0);
    private static final String e = "EVENT_EDIT_SUCCESS";
    private static final String a = "EVENT_DELETE_CONFIRM";
    private static final String b = "EVENT_DELETE_SUCCESS";

    /* loaded from: classes-dex2jar.jar:o/TxnBerkalaDetailActivity$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public TxnBerkalaDetailActivity() {
        this(null, 1);
    }

    public TxnBerkalaDetailActivity(String str) {
        this.d = str;
    }

    private /* synthetic */ TxnBerkalaDetailActivity(String str, int i) {
        this(e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TxnBerkalaDetailActivity) && subscribeReservationRescheduleEvent.b((Object) this.d, (Object) ((TxnBerkalaDetailActivity) obj).d);
    }

    public final int hashCode() {
        String str = this.d;
        return str == null ? 0 : str.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventPemilikSumberDanaSuccess(flag=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
