package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/components/ComponentRuntime$Builder.class */
public final class ComponentRuntime$Builder {
    private final Executor defaultExecutor;
    private final List<Provider<ComponentRegistrar>> lazyRegistrars = new ArrayList();
    private final List<Component<?>> additionalComponents = new ArrayList();

    ComponentRuntime$Builder(Executor executor) {
        this.defaultExecutor = executor;
    }

    public static /* synthetic */ ComponentRegistrar lambda$addComponentRegistrar$0(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    public final ComponentRuntime$Builder addComponent(Component<?> component) {
        this.additionalComponents.add(component);
        return this;
    }

    public final ComponentRuntime$Builder addComponentRegistrar(ComponentRegistrar componentRegistrar) {
        this.lazyRegistrars.add(new Provider() { // from class: com.google.firebase.components.ComponentRuntime$Builder$$ExternalSyntheticLambda0
            public final Object get() {
                return ComponentRuntime$Builder.lambda$addComponentRegistrar$0(ComponentRegistrar.this);
            }
        });
        return this;
    }

    public final ComponentRuntime$Builder addLazyComponentRegistrars(Collection<Provider<ComponentRegistrar>> collection) {
        this.lazyRegistrars.addAll(collection);
        return this;
    }

    public final ComponentRuntime build() {
        return new ComponentRuntime(this.defaultExecutor, this.lazyRegistrars, this.additionalComponents, (ComponentRuntime$3) null);
    }
}
