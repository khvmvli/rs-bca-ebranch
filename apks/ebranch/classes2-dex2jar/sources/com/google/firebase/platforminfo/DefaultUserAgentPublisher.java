package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import java.util.Iterator;
import java.util.Set;
import o.BN3PilihCabangFragment;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/platforminfo/DefaultUserAgentPublisher.class */
public class DefaultUserAgentPublisher implements UserAgentPublisher {
    private final GlobalLibraryVersionRegistrar gamesSDKRegistrar;
    private final String javaSDKVersionUserAgent;

    DefaultUserAgentPublisher(Set<BN3PilihCabangFragment> set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.javaSDKVersionUserAgent = toUserAgent(set);
        this.gamesSDKRegistrar = globalLibraryVersionRegistrar;
    }

    public static Component<UserAgentPublisher> component() {
        return Component.builder(UserAgentPublisher.class).add(Dependency.setOf(BN3PilihCabangFragment.class)).factory(new ComponentFactory() { // from class: com.google.firebase.platforminfo.DefaultUserAgentPublisher$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return DefaultUserAgentPublisher.lambda$component$0(componentContainer);
            }
        }).build();
    }

    public static /* synthetic */ UserAgentPublisher lambda$component$0(ComponentContainer componentContainer) {
        return new DefaultUserAgentPublisher(componentContainer.setOf(BN3PilihCabangFragment.class), GlobalLibraryVersionRegistrar.getInstance());
    }

    private static String toUserAgent(Set<BN3PilihCabangFragment> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<BN3PilihCabangFragment> it = set.iterator();
        while (it.hasNext()) {
            BN3PilihCabangFragment next = it.next();
            sb.append(next.d());
            sb.append('/');
            sb.append(next.e());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public String getUserAgent() {
        if (this.gamesSDKRegistrar.getRegisteredVersions().isEmpty()) {
            return this.javaSDKVersionUserAgent;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.javaSDKVersionUserAgent);
        sb.append(' ');
        sb.append(toUserAgent(this.gamesSDKRegistrar.getRegisteredVersions()));
        return sb.toString();
    }
}
