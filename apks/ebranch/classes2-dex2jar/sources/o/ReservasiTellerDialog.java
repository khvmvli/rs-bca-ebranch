package o;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.DependencyException;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes2-dex2jar.jar:o/ReservasiTellerDialog.class */
public final class ReservasiTellerDialog extends PilihTahunBulanDialog_ViewBinding {
    private final Set<Class<?>> a;
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;
    private final Set<Class<?>> d;
    private final Set<Class<?>> e;
    private final ComponentContainer h;
    private final Set<Class<?>> i;

    /* loaded from: classes2-dex2jar.jar:o/ReservasiTellerDialog$IconCompatParcelizer.class */
    static final class IconCompatParcelizer implements Publisher {
        private final Set<Class<?>> b;
        private final Publisher d;

        public IconCompatParcelizer(Set<Class<?>> set, Publisher publisher) {
            this.b = set;
            this.d = publisher;
        }

        @Override // com.google.firebase.events.Publisher
        public final void publish(Event<?> event) {
            if (this.b.contains(event.getType())) {
                this.d.publish(event);
                return;
            }
            throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", event));
        }
    }

    public ReservasiTellerDialog(Component<?> component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (Dependency dependency : component.getDependencies()) {
            if (dependency.isDirectInjection()) {
                if (dependency.isSet()) {
                    hashSet4.add(dependency.getInterface());
                } else {
                    hashSet.add(dependency.getInterface());
                }
            } else if (dependency.isDeferred()) {
                hashSet3.add(dependency.getInterface());
            } else if (dependency.isSet()) {
                hashSet5.add(dependency.getInterface());
            } else {
                hashSet2.add(dependency.getInterface());
            }
        }
        if (!component.getPublishedEvents().isEmpty()) {
            hashSet.add(Publisher.class);
        }
        this.d = Collections.unmodifiableSet(hashSet);
        this.a = Collections.unmodifiableSet(hashSet2);
        this.e = Collections.unmodifiableSet(hashSet3);
        this.c = Collections.unmodifiableSet(hashSet4);
        this.i = Collections.unmodifiableSet(hashSet5);
        this.b = component.getPublishedEvents();
        this.h = componentContainer;
    }

    public final <T> T get(Class<T> cls) {
        if (this.d.contains(cls)) {
            T t = (T) this.h.get(cls);
            return !cls.equals(Publisher.class) ? t : (T) new IconCompatParcelizer(this.b, (Publisher) t);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    public final <T> Deferred<T> getDeferred(Class<T> cls) {
        if (this.e.contains(cls)) {
            return this.h.getDeferred(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }

    public final <T> Provider<T> getProvider(Class<T> cls) {
        if (this.a.contains(cls)) {
            return this.h.getProvider(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    public final <T> Set<T> setOf(Class<T> cls) {
        if (this.c.contains(cls)) {
            return this.h.setOf(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    public final <T> Provider<Set<T>> setOfProvider(Class<T> cls) {
        if (this.i.contains(cls)) {
            return this.h.setOfProvider(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }
}
