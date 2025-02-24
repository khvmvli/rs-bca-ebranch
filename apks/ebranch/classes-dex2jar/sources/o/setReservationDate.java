package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/setReservationDate.class */
public final class setReservationDate {
    private static final setReservationTime$MediaBrowserCompat$CustomActionResultReceiver<?> c = new setReservationTime$MediaBrowserCompat$CustomActionResultReceiver<Object>() { // from class: o.setReservationDate.1
        @Override // o.setReservationTime$MediaBrowserCompat$CustomActionResultReceiver
        public final Class<Object> c() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // o.setReservationTime$MediaBrowserCompat$CustomActionResultReceiver
        public final setReservationTime<Object> d(Object obj) {
            return new IconCompatParcelizer(obj);
        }
    };
    public final Map<Class<?>, setReservationTime$MediaBrowserCompat$CustomActionResultReceiver<?>> a = new HashMap();

    /* loaded from: classes-dex2jar.jar:o/setReservationDate$IconCompatParcelizer.class */
    static final class IconCompatParcelizer implements setReservationTime<Object> {
        private final Object a;

        IconCompatParcelizer(Object obj) {
            this.a = obj;
        }

        @Override // o.setReservationTime
        public final Object a() {
            return this.a;
        }

        @Override // o.setReservationTime
        public final void d() {
        }
    }

    public final <T> setReservationTime<T> c(T t) {
        setReservationTime<T> setreservationtime;
        synchronized (this) {
            if (t != null) {
                setReservationTime$MediaBrowserCompat$CustomActionResultReceiver<?> setreservationtime_mediabrowsercompat_customactionresultreceiver = this.a.get(t.getClass());
                setReservationTime$MediaBrowserCompat$CustomActionResultReceiver<?> setreservationtime_mediabrowsercompat_customactionresultreceiver2 = setreservationtime_mediabrowsercompat_customactionresultreceiver;
                if (setreservationtime_mediabrowsercompat_customactionresultreceiver == null) {
                    Iterator<setReservationTime$MediaBrowserCompat$CustomActionResultReceiver<?>> it = this.a.values().iterator();
                    do {
                        setreservationtime_mediabrowsercompat_customactionresultreceiver2 = setreservationtime_mediabrowsercompat_customactionresultreceiver;
                        if (!it.hasNext()) {
                            break;
                        }
                        setreservationtime_mediabrowsercompat_customactionresultreceiver2 = it.next();
                    } while (!setreservationtime_mediabrowsercompat_customactionresultreceiver2.c().isAssignableFrom(t.getClass()));
                }
                setReservationTime$MediaBrowserCompat$CustomActionResultReceiver<?> setreservationtime_mediabrowsercompat_customactionresultreceiver3 = setreservationtime_mediabrowsercompat_customactionresultreceiver2;
                if (setreservationtime_mediabrowsercompat_customactionresultreceiver2 == null) {
                    setreservationtime_mediabrowsercompat_customactionresultreceiver3 = c;
                }
                setreservationtime = (setReservationTime<T>) setreservationtime_mediabrowsercompat_customactionresultreceiver3.d(t);
            } else {
                throw new NullPointerException("Argument must not be null");
            }
        }
        return setreservationtime;
    }
}
