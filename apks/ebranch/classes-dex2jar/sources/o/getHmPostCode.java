package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.getHmVillage;
import o.getHphoneMB;
/* loaded from: classes-dex2jar.jar:o/getHmPostCode.class */
public final class getHmPostCode implements getExpID<getHmVillage> {
    private final Page6JLFragment_ViewBinding<realmGet$businessField> c;

    public getHmPostCode(Page6JLFragment_ViewBinding<realmGet$businessField> page6JLFragment_ViewBinding) {
        this.c = page6JLFragment_ViewBinding;
    }

    @Override // o.Page6JLFragment_ViewBinding
    public final /* synthetic */ Object c() {
        realmGet$businessField c = this.c.c();
        getHmVillage.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new getHmVillage.RemoteActionCompatParcelizer();
        getTxbDate gettxbdate = getTxbDate.DEFAULT;
        getHphoneMB.IconCompatParcelizer iconCompatParcelizer = new getHphoneMB.IconCompatParcelizer();
        Set<getHmVillage.read> emptySet = Collections.emptySet();
        if (emptySet != null) {
            iconCompatParcelizer.c = emptySet;
            remoteActionCompatParcelizer.c.put(gettxbdate, iconCompatParcelizer.e(30000).c(86400000).c());
            getTxbDate gettxbdate2 = getTxbDate.HIGHEST;
            getHphoneMB.IconCompatParcelizer iconCompatParcelizer2 = new getHphoneMB.IconCompatParcelizer();
            Set<getHmVillage.read> emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                iconCompatParcelizer2.c = emptySet2;
                remoteActionCompatParcelizer.c.put(gettxbdate2, iconCompatParcelizer2.e(1000).c(86400000).c());
                getTxbDate gettxbdate3 = getTxbDate.VERY_LOW;
                getHphoneMB.IconCompatParcelizer iconCompatParcelizer3 = new getHphoneMB.IconCompatParcelizer();
                Set<getHmVillage.read> emptySet3 = Collections.emptySet();
                if (emptySet3 != null) {
                    iconCompatParcelizer3.c = emptySet3;
                    remoteActionCompatParcelizer.c.put(gettxbdate3, iconCompatParcelizer3.e(86400000).c(86400000).c(Collections.unmodifiableSet(new HashSet(Arrays.asList(getHmVillage.read.NETWORK_UNMETERED, getHmVillage.read.DEVICE_IDLE)))).c());
                    remoteActionCompatParcelizer.d = c;
                    if (remoteActionCompatParcelizer.d == null) {
                        throw new NullPointerException("missing required property: clock");
                    } else if (remoteActionCompatParcelizer.c.keySet().size() >= getTxbDate.values().length) {
                        Map<getTxbDate, getHmVillage.IconCompatParcelizer> map = remoteActionCompatParcelizer.c;
                        remoteActionCompatParcelizer.c = new HashMap();
                        return new getHmSubDistrict(remoteActionCompatParcelizer.d, map);
                    } else {
                        throw new IllegalStateException("Not all priorities have been configured");
                    }
                } else {
                    throw new NullPointerException("Null flags");
                }
            } else {
                throw new NullPointerException("Null flags");
            }
        } else {
            throw new NullPointerException("Null flags");
        }
    }
}
