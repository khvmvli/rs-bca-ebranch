package kotlinx.coroutines.internal;

import java.util.List;
import o.Registry$NoModelLoaderAvailableException;
/* loaded from: classes2-dex2jar.jar:kotlinx/coroutines/internal/MainDispatcherFactory.class */
public interface MainDispatcherFactory {
    Registry$NoModelLoaderAvailableException createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
