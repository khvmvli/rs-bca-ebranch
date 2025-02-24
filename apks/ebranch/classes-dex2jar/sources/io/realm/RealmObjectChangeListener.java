package io.realm;

import io.realm.RealmModel;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:io/realm/RealmObjectChangeListener.class */
public interface RealmObjectChangeListener<T extends RealmModel> {
    void onChange(T t, @Nullable ObjectChangeSet objectChangeSet);
}
