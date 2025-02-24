package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import java.util.Collections;
import java.util.List;
import o.Account;
import o.getCitizen;
import o.getStatusType;
import o.isDraft;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/datatransport/TransportRegistrar.class */
public class TransportRegistrar implements ComponentRegistrar {
    public static /* synthetic */ getStatusType lambda$getComponents$0(ComponentContainer componentContainer) {
        getCitizen.e((Context) componentContainer.get(Context.class));
        Account account = getCitizen.e;
        if (account != null) {
            return account.b().a(isDraft.e);
        }
        throw new IllegalStateException("Not initialized!");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Collections.singletonList(Component.builder(getStatusType.class).add(Dependency.required(Context.class)).factory(new ComponentFactory() { // from class: com.google.firebase.datatransport.TransportRegistrar$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return TransportRegistrar.lambda$getComponents$0(componentContainer);
            }
        }).build());
    }
}
