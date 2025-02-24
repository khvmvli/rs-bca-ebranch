package com.google.firebase.inject;
/* loaded from: classes-dex2jar.jar:com/google/firebase/inject/Deferred.class */
public interface Deferred<T> {
    void whenAvailable(DeferredHandler<T> deferredHandler);
}
