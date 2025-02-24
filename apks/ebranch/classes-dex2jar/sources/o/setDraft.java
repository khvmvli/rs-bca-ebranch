package o;

import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setDraft.class */
public final class setDraft extends setServiceType {
    private final List<TransaksiTunda$$Parcelable> b;

    public setDraft(List<TransaksiTunda$$Parcelable> list) {
        if (list != null) {
            this.b = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override // o.setServiceType
    @Encodable.Field(name = "logRequest")
    public final List<TransaksiTunda$$Parcelable> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof setServiceType) {
            return this.b.equals(((setServiceType) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchedLogRequest{logRequests=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
