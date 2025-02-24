package o;

import android.os.SystemClock;
/* loaded from: classes-dex2jar.jar:o/getUpdatedAt.class */
public final class getUpdatedAt implements getExpID<realmGet$businessField> {

    /* loaded from: classes-dex2jar.jar:o/getUpdatedAt$write.class */
    public static final class write {
        public static final getUpdatedAt e = new getUpdatedAt();
    }

    @Override // o.Page6JLFragment_ViewBinding
    public final /* synthetic */ Object c() {
        return new realmGet$businessField() { // from class: o.realmGet$citizenOthers
            @Override // o.realmGet$businessField
            public final long c() {
                return SystemClock.elapsedRealtime();
            }
        };
    }
}
