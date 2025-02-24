package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setDistanceToBranch.class */
public final class setDistanceToBranch {
    private final List<RemoteActionCompatParcelizer<?, ?>> a = new ArrayList();

    /* loaded from: classes-dex2jar.jar:o/setDistanceToBranch$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer<Z, R> {
        final setEmergencyCloseStartDate<Z, R> a;
        final Class<Z> d;
        final Class<R> e;

        RemoteActionCompatParcelizer(Class<Z> cls, Class<R> cls2, setEmergencyCloseStartDate<Z, R> setemergencyclosestartdate) {
            this.d = cls;
            this.e = cls2;
            this.a = setemergencyclosestartdate;
        }
    }

    public final <Z, R> List<Class<R>> a(Class<Z> cls, Class<R> cls2) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            if (cls2.isAssignableFrom(cls)) {
                arrayList.add(cls2);
                return arrayList;
            }
            for (RemoteActionCompatParcelizer<?, ?> remoteActionCompatParcelizer : this.a) {
                if (remoteActionCompatParcelizer.d.isAssignableFrom(cls) && cls2.isAssignableFrom(remoteActionCompatParcelizer.e)) {
                    arrayList.add(cls2);
                }
            }
            return arrayList;
        }
    }

    public final <Z, R> void c(Class<Z> cls, Class<R> cls2, setEmergencyCloseStartDate<Z, R> setemergencyclosestartdate) {
        synchronized (this) {
            this.a.add(new RemoteActionCompatParcelizer<>(cls, cls2, setemergencyclosestartdate));
        }
    }

    public final <Z, R> setEmergencyCloseStartDate<Z, R> d(Class<Z> cls, Class<R> cls2) {
        RemoteActionCompatParcelizer<?, ?> next;
        synchronized (this) {
            if (cls2.isAssignableFrom(cls)) {
                return setFlagReservationTellerSolitaire.e();
            }
            Iterator<RemoteActionCompatParcelizer<?, ?>> it = this.a.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No transcoder registered to transcode from ");
                    sb.append(cls);
                    sb.append(" to ");
                    sb.append(cls2);
                    throw new IllegalArgumentException(sb.toString());
                }
            } while (!(next.d.isAssignableFrom(cls) && cls2.isAssignableFrom(next.e)));
            return (setEmergencyCloseStartDate<Z, R>) next.a;
        }
    }
}
