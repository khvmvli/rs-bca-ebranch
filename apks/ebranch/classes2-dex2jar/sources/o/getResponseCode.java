package o;

import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
/* loaded from: classes2-dex2jar.jar:o/getResponseCode.class */
public final class getResponseCode {
    private static final boolean b = true;

    public static final Registry$NoModelLoaderAvailableException a(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        getResponseMessage getresponsemessage;
        try {
            getresponsemessage = mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            getresponsemessage = b(th, mainDispatcherFactory.hintOnError());
        }
        return getresponsemessage;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final getResponseMessage b(Throwable th, String str) {
        if (b) {
            return new getResponseMessage(th, str);
        }
        if (th == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        throw th;
    }
}
