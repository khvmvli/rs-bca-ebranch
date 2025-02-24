package o;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import o.realmGet$occupationFlagFreeText;
import o.realmSet;
/* loaded from: classes-dex2jar.jar:o/realmGet$updatedAt.class */
public final class realmGet$updatedAt {
    private final Map a = Collections.synchronizedMap(new WeakHashMap());
    private final Map c = Collections.synchronizedMap(new WeakHashMap());

    private final void e(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new HashMap(this.a);
        }
        synchronized (this.c) {
            hashMap2 = new HashMap(this.c);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((realmGet$purposePemRekOthers) entry.getKey()).b(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((setJenisWarkat) entry2.getKey()).c(new ApiException(status));
            }
        }
    }

    public final void b() {
        e(false, realmGet$resCity.a);
    }

    public final boolean c() {
        return !this.a.isEmpty() || !this.c.isEmpty();
    }

    public final void d(realmGet$purposePemRekOthers realmget_purposepemrekothers, boolean z) {
        this.a.put(realmget_purposepemrekothers, Boolean.valueOf(z));
        realmget_purposepemrekothers.b(new realmGet$occupationFlagFreeText.IconCompatParcelizer(realmget_purposepemrekothers) { // from class: o.realmSet$businessFieldFlagFreeText
            final /* synthetic */ realmGet$purposePemRekOthers d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.d = r5;
            }

            @Override // o.realmGet$occupationFlagFreeText.IconCompatParcelizer
            public final void d(Status status) {
                realmGet$updatedAt.this.a.remove(this.d);
            }
        });
    }

    public final void e(int i, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        e(true, new Status(20, sb.toString()));
    }

    public final void e(setJenisWarkat setjeniswarkat, boolean z) {
        this.c.put(setjeniswarkat, Boolean.valueOf(z));
        setjeniswarkat.c().d((realmSet.localClearingCodeBank) new realmSet.localClearingCodeBank(setjeniswarkat) { // from class: o.realmGet$typeID
            final /* synthetic */ setJenisWarkat c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.c = r5;
            }

            public final void b(setJatuhTempo setjatuhtempo) {
                realmGet$updatedAt.this.c.remove(this.c);
            }
        });
    }
}
