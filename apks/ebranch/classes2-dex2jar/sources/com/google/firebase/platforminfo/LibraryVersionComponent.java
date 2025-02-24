package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import o.BN3PilihCabangFragment;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/platforminfo/LibraryVersionComponent.class */
public class LibraryVersionComponent {

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/platforminfo/LibraryVersionComponent$VersionExtractor.class */
    public interface VersionExtractor<T> {
        String extract(T t);
    }

    private LibraryVersionComponent() {
    }

    public static Component<?> create(String str, String str2) {
        return Component.intoSet(BN3PilihCabangFragment.c(str, str2), BN3PilihCabangFragment.class);
    }

    public static Component<?> fromContext(String str, VersionExtractor<Context> versionExtractor) {
        return Component.intoSetBuilder(BN3PilihCabangFragment.class).add(Dependency.required(Context.class)).factory(new ComponentFactory(str, versionExtractor) { // from class: com.google.firebase.platforminfo.LibraryVersionComponent$$ExternalSyntheticLambda0
            public final /* synthetic */ String f$0;
            public final /* synthetic */ LibraryVersionComponent.VersionExtractor f$1;

            {
                this.f$0 = r4;
                this.f$1 = r5;
            }

            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return BN3PilihCabangFragment.c(this.f$0, this.f$1.extract((Context) componentContainer.get(Context.class)));
            }
        }).build();
    }
}
