package o;

import android.os.Parcel;
import java.util.Collection;
import o.ListUtil;
/* loaded from: classes2-dex2jar.jar:o/d.class */
public abstract class d<T, C extends Collection<T>> implements ListUtil.ThreeItemImmutableList<Collection<T>, C> {
    public abstract void a(T t, Parcel parcel);

    /* renamed from: b */
    public final void d(Collection<T> collection, Parcel parcel) {
        if (collection == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(collection.size());
        for (T t : collection) {
            a(t, parcel);
        }
    }

    /* renamed from: c */
    public final C d(Parcel parcel) {
        C c;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            c = null;
        } else {
            C e = e();
            for (int i = 0; i < readInt; i++) {
                e.add(e(parcel));
            }
            c = e;
        }
        return c;
    }

    public abstract T e(Parcel parcel);

    public abstract C e();
}
