package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes-dex2jar.jar:o/GetBranchReservationResponse$ReservationBranch.class */
public final class GetBranchReservationResponse$ReservationBranch {
    public boolean d;
    public final Set<getNextCategory> e = Collections.newSetFromMap(new WeakHashMap());
    public final List<getNextCategory> a = new ArrayList();

    public final boolean b(getNextCategory getnextcategory) {
        if (getnextcategory == null) {
            return true;
        }
        boolean remove = this.e.remove(getnextcategory);
        boolean z = true;
        if (!this.a.remove(getnextcategory)) {
            z = remove;
        }
        if (z) {
            getnextcategory.a();
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append("{numRequests=");
        sb.append(this.e.size());
        sb.append(", isPaused=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
