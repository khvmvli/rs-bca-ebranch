package o;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;
/* loaded from: classes2-dex2jar.jar:o/getResponseDate.class */
public final class getResponseDate {
    public static final getResponseDate a = new getResponseDate();
    private static final boolean d;
    public static final Registry$NoModelLoaderAvailableException e;

    static {
        String e2 = getStatus$com_github_ChuckerTeam_Chucker_library.e("kotlinx.coroutines.fast.service.loader");
        d = e2 != null ? Boolean.parseBoolean(e2) : true;
        e = a();
    }

    private getResponseDate() {
    }

    private static Registry$NoModelLoaderAvailableException a() {
        getResponseMessage getresponsemessage;
        Object obj;
        try {
            List<MainDispatcherFactory> c = d ? getRequestSizeString$com_github_ChuckerTeam_Chucker_library.a.c() : CancelReservationPresenter.d(CancelReservationPresenter.b(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
            Iterator it = c.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) obj).getLoadPriority();
                    obj = obj;
                    do {
                        Object next = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next).getLoadPriority();
                        loadPriority = loadPriority;
                        if (loadPriority < loadPriority2) {
                            obj = next;
                            loadPriority = loadPriority2;
                        }
                        obj = obj;
                    } while (it.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
            getresponsemessage = mainDispatcherFactory == null ? getResponseCode.b(null, null) : getResponseCode.a(mainDispatcherFactory, c);
        } catch (Throwable th) {
            getresponsemessage = getResponseCode.b(th, null);
        }
        return getresponsemessage;
    }
}
