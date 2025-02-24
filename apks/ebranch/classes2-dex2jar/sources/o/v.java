package o;

import android.os.Parcel;
import java.util.Map;
import o.ListUtil;
/* loaded from: classes2-dex2jar.jar:o/v.class */
public abstract class v<K, V, M extends Map<K, V>> implements ListUtil.ThreeItemImmutableList<Map<K, V>, M> {
    public abstract V a(Parcel parcel);

    public abstract M a();

    public abstract void a(K k, Parcel parcel);

    public abstract K c(Parcel parcel);

    @Override // o.ListUtil.ThreeItemImmutableList
    public final /* synthetic */ Object d(Parcel parcel) {
        Object obj;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            obj = null;
        } else {
            M a = a();
            for (int i = 0; i < readInt; i++) {
                a.put(c(parcel), a(parcel));
            }
            obj = a;
        }
        return obj;
    }

    @Override // o.ListUtil.ThreeItemImmutableList
    public final /* synthetic */ void d(Object obj, Parcel parcel) {
        Map map = (Map) obj;
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            a(entry.getKey(), parcel);
            e(entry.getValue(), parcel);
        }
    }

    public abstract void e(V v, Parcel parcel);
}
