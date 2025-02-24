package o;

import com.google.firebase.components.Preconditions;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* loaded from: classes2-dex2jar.jar:o/QRCodeDialog_ViewBinding.class */
public class QRCodeDialog_ViewBinding implements Subscriber, Publisher {
    private final Map<Class<?>, ConcurrentHashMap<EventHandler<Object>, Executor>> a = new HashMap();
    public Queue<Event<?>> c = new ArrayDeque();
    private final Executor d;

    public QRCodeDialog_ViewBinding(Executor executor) {
        this.d = executor;
    }

    private Set<Map.Entry<EventHandler<Object>, Executor>> b(Event<?> event) {
        Set<Map.Entry<EventHandler<Object>, Executor>> emptySet;
        synchronized (this) {
            ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap = this.a.get(event.getType());
            emptySet = concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
        }
        return emptySet;
    }

    @Override // com.google.firebase.events.Publisher
    public void publish(Event<?> event) {
        Preconditions.checkNotNull(event);
        synchronized (this) {
            Queue<Event<?>> queue = this.c;
            if (queue != null) {
                queue.add(event);
                return;
            }
            for (Map.Entry<EventHandler<Object>, Executor> entry : b(event)) {
                entry.getValue().execute(new Runnable(entry, event) { // from class: com.google.firebase.components.EventBus$$ExternalSyntheticLambda0
                    public final /* synthetic */ Map.Entry f$0;
                    public final /* synthetic */ Event f$1;

                    {
                        this.f$0 = r4;
                        this.f$1 = r5;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ((EventHandler) this.f$0.getKey()).handle(this.f$1);
                    }
                });
            }
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public <T> void subscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        subscribe(cls, this.d, eventHandler);
    }

    @Override // com.google.firebase.events.Subscriber
    public <T> void subscribe(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler) {
        synchronized (this) {
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(eventHandler);
            Preconditions.checkNotNull(executor);
            if (!this.a.containsKey(cls)) {
                this.a.put(cls, new ConcurrentHashMap<>());
            }
            this.a.get(cls).put(eventHandler, executor);
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public <T> void unsubscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        synchronized (this) {
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(eventHandler);
            if (this.a.containsKey(cls)) {
                ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap = this.a.get(cls);
                concurrentHashMap.remove(eventHandler);
                if (concurrentHashMap.isEmpty()) {
                    this.a.remove(cls);
                }
            }
        }
    }
}
