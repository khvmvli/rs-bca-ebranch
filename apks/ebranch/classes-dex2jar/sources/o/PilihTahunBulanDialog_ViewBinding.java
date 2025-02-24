package o;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.inject.Provider;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:o/PilihTahunBulanDialog_ViewBinding.class */
public abstract class PilihTahunBulanDialog_ViewBinding implements ComponentContainer {
    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(Class<T> cls) {
        Provider<T> provider = getProvider(cls);
        if (provider == null) {
            return null;
        }
        return provider.get();
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Set<T> setOf(Class<T> cls) {
        return setOfProvider(cls).get();
    }
}
