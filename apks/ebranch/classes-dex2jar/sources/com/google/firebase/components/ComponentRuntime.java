package com.google.firebase.components;

import android.util.Log;
import com.google.firebase.components.ComponentRuntime$;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o.PilihTahunBulanDialog;
import o.PilihTahunBulanDialog_ViewBinding;
import o.QRCodeDialog;
import o.QRCodeDialog_ViewBinding;
import o.ReservasiTellerDialog;
import o.saveImage;
/* loaded from: classes-dex2jar.jar:com/google/firebase/components/ComponentRuntime.class */
public class ComponentRuntime extends PilihTahunBulanDialog_ViewBinding implements ComponentLoader {
    private static final Provider<Set<Object>> EMPTY_PROVIDER = new Provider() { // from class: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda4
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return Collections.emptySet();
        }
    };
    private final Map<Component<?>, Provider<?>> components;
    private final AtomicReference<Boolean> eagerComponentsInitializedWith;
    private final QRCodeDialog_ViewBinding eventBus;
    private final Map<Class<?>, Provider<?>> lazyInstanceMap;
    private final Map<Class<?>, QRCodeDialog<?>> lazySetMap;
    private final List<Provider<ComponentRegistrar>> unprocessedRegistrarProviders;

    private ComponentRuntime(Executor executor, Iterable<Provider<ComponentRegistrar>> iterable, Collection<Component<?>> collection) {
        this.components = new HashMap();
        this.lazyInstanceMap = new HashMap();
        this.lazySetMap = new HashMap();
        this.eagerComponentsInitializedWith = new AtomicReference<>();
        QRCodeDialog_ViewBinding qRCodeDialog_ViewBinding = new QRCodeDialog_ViewBinding(executor);
        this.eventBus = qRCodeDialog_ViewBinding;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Component.of(qRCodeDialog_ViewBinding, QRCodeDialog_ViewBinding.class, new Class[]{Subscriber.class, Publisher.class}));
        arrayList.add(Component.of(this, ComponentLoader.class, new Class[0]));
        for (Component<?> component : collection) {
            if (component != null) {
                arrayList.add(component);
            }
        }
        this.unprocessedRegistrarProviders = iterableToList(iterable);
        discoverComponents(arrayList);
    }

    @Deprecated
    public ComponentRuntime(Executor executor, Iterable<ComponentRegistrar> iterable, Component<?>... componentArr) {
        this(executor, toProviders(iterable), Arrays.asList(componentArr));
    }

    public static Builder builder(Executor executor) {
        return new Builder(executor);
    }

    private void discoverComponents(List<Component<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<Provider<ComponentRegistrar>> it = this.unprocessedRegistrarProviders.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(componentRegistrar.getComponents());
                        it.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.components.isEmpty()) {
                saveImage.b(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.components.keySet());
                arrayList2.addAll(list);
                saveImage.b(arrayList2);
            }
            for (Component<?> component : list) {
                this.components.put(component, new Lazy((Provider) new ComponentRuntime$.ExternalSyntheticLambda1(this, component)));
            }
            arrayList.addAll(processInstanceComponents(list));
            arrayList.addAll(processSetComponents());
            processDependencies();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        maybeInitializeEagerComponents();
    }

    private void doInitializeEagerComponents(Map<Component<?>, Provider<?>> map, boolean z) {
        Queue<Event> queue;
        for (Map.Entry<Component<?>, Provider<?>> entry : map.entrySet()) {
            Component<?> key = entry.getKey();
            Provider<?> value = entry.getValue();
            if (key.isAlwaysEager() || (key.isEagerInDefaultApp() && z)) {
                value.get();
            }
        }
        QRCodeDialog_ViewBinding qRCodeDialog_ViewBinding = this.eventBus;
        synchronized (qRCodeDialog_ViewBinding) {
            queue = qRCodeDialog_ViewBinding.c;
            if (queue != null) {
                qRCodeDialog_ViewBinding.c = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (Event event : queue) {
                qRCodeDialog_ViewBinding.publish(event);
            }
        }
    }

    private static <T> List<T> iterableToList(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(t);
        }
        return arrayList;
    }

    static /* synthetic */ void lambda$processInstanceComponents$2(PilihTahunBulanDialog pilihTahunBulanDialog, Provider provider) {
        Deferred.DeferredHandler deferredHandler;
        if (pilihTahunBulanDialog.a == PilihTahunBulanDialog.d) {
            synchronized (pilihTahunBulanDialog) {
                deferredHandler = pilihTahunBulanDialog.b;
                pilihTahunBulanDialog.b = null;
                pilihTahunBulanDialog.a = provider;
            }
            deferredHandler.handle(provider);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    static /* synthetic */ void lambda$processSetComponents$3(QRCodeDialog qRCodeDialog, Provider provider) {
        synchronized (qRCodeDialog) {
            if (qRCodeDialog.c == null) {
                qRCodeDialog.d.add(provider);
            } else {
                qRCodeDialog.c.add(provider.get());
            }
        }
    }

    static /* synthetic */ ComponentRegistrar lambda$toProviders$1(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    private void maybeInitializeEagerComponents() {
        Boolean bool = this.eagerComponentsInitializedWith.get();
        if (bool != null) {
            doInitializeEagerComponents(this.components, bool.booleanValue());
        }
    }

    private void processDependencies() {
        for (Component<?> component : this.components.keySet()) {
            for (Dependency dependency : component.getDependencies()) {
                if (dependency.isSet() && !this.lazySetMap.containsKey(dependency.getInterface())) {
                    this.lazySetMap.put(dependency.getInterface(), QRCodeDialog.b(Collections.emptySet()));
                } else if (this.lazyInstanceMap.containsKey(dependency.getInterface())) {
                    continue;
                } else if (dependency.isRequired()) {
                    throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", component, dependency.getInterface()));
                } else if (!dependency.isSet()) {
                    this.lazyInstanceMap.put(dependency.getInterface(), PilihTahunBulanDialog.a());
                }
            }
        }
    }

    private List<Runnable> processInstanceComponents(List<Component<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (Component<?> component : list) {
            if (component.isValue()) {
                Provider<?> provider = this.components.get(component);
                for (Class<?> cls : component.getProvidedInterfaces()) {
                    if (!this.lazyInstanceMap.containsKey(cls)) {
                        this.lazyInstanceMap.put(cls, provider);
                    } else {
                        arrayList.add(new ComponentRuntime$.ExternalSyntheticLambda0((Provider) this.lazyInstanceMap.get(cls), provider));
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> processSetComponents() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<Component<?>, Provider<?>> entry : this.components.entrySet()) {
            Component<?> key = entry.getKey();
            if (!key.isValue()) {
                Provider<?> value = entry.getValue();
                for (Class cls : key.getProvidedInterfaces()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.lazySetMap.containsKey(entry2.getKey())) {
                this.lazySetMap.put((Class) entry2.getKey(), QRCodeDialog.b((Collection) entry2.getValue()));
            } else {
                QRCodeDialog<?> qRCodeDialog = this.lazySetMap.get(entry2.getKey());
                for (Provider provider : (Set) entry2.getValue()) {
                    arrayList.add(new ComponentRuntime$.ExternalSyntheticLambda2(qRCodeDialog, provider));
                }
            }
        }
        return arrayList;
    }

    private static Iterable<Provider<ComponentRegistrar>> toProviders(Iterable<ComponentRegistrar> iterable) {
        ArrayList arrayList = new ArrayList();
        for (ComponentRegistrar componentRegistrar : iterable) {
            arrayList.add(new ComponentRuntime$.ExternalSyntheticLambda3(componentRegistrar));
        }
        return arrayList;
    }

    @Override // com.google.firebase.dynamicloading.ComponentLoader
    public void discoverComponents() {
        synchronized (this) {
            if (!this.unprocessedRegistrarProviders.isEmpty()) {
                discoverComponents(new ArrayList());
            }
        }
    }

    @Override // o.PilihTahunBulanDialog_ViewBinding, com.google.firebase.components.ComponentContainer
    public /* bridge */ /* synthetic */ Object get(Class cls) {
        return get(cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> getDeferred(Class<T> cls) {
        PilihTahunBulanDialog provider = getProvider(cls);
        return provider == null ? PilihTahunBulanDialog.a() : provider instanceof PilihTahunBulanDialog ? provider : PilihTahunBulanDialog.e(provider);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<T> getProvider(Class<T> cls) {
        Provider<T> provider;
        synchronized (this) {
            Preconditions.checkNotNull(cls, "Null interface requested.");
            provider = (Provider<T>) this.lazyInstanceMap.get(cls);
        }
        return provider;
    }

    public void initializeAllComponentsForTests() {
        for (Provider<?> provider : this.components.values()) {
            provider.get();
        }
    }

    public void initializeEagerComponents(boolean z) {
        boolean z2;
        HashMap hashMap;
        AtomicReference<Boolean> atomicReference = this.eagerComponentsInitializedWith;
        while (true) {
            if (!atomicReference.compareAndSet(null, Boolean.valueOf(z))) {
                if (atomicReference.get() != null) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        if (z2) {
            synchronized (this) {
                hashMap = new HashMap(this.components);
            }
            doInitializeEagerComponents(hashMap, z);
        }
    }

    /* renamed from: lambda$discoverComponents$0$com-google-firebase-components-ComponentRuntime  reason: not valid java name */
    /* synthetic */ Object m231xc080f8d8(Component component) {
        return component.getFactory().create(new ReservasiTellerDialog(component, this));
    }

    @Override // o.PilihTahunBulanDialog_ViewBinding, com.google.firebase.components.ComponentContainer
    public /* bridge */ /* synthetic */ Set setOf(Class cls) {
        return setOf(cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<Set<T>> setOfProvider(Class<T> cls) {
        synchronized (this) {
            QRCodeDialog<?> qRCodeDialog = this.lazySetMap.get(cls);
            if (qRCodeDialog != null) {
                return qRCodeDialog;
            }
            return (Provider<Set<T>>) EMPTY_PROVIDER;
        }
    }
}
