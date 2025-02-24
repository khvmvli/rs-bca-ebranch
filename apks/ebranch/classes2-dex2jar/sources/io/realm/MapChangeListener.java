package io.realm;
/* loaded from: classes2-dex2jar.jar:io/realm/MapChangeListener.class */
public interface MapChangeListener<K, V> {
    void onChange(RealmMap<K, V> realmMap, MapChangeSet<K> mapChangeSet);
}
