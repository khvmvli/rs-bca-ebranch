package io.realm;
/* loaded from: classes2-dex2jar.jar:io/realm/MapChangeSetImpl.class */
class MapChangeSetImpl<K> implements MapChangeSet<K> {
    private final MapChangeSet<K> delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapChangeSetImpl(MapChangeSet<K> mapChangeSet) {
        this.delegate = mapChangeSet;
    }

    @Override // io.realm.MapChangeSet
    public K[] getChanges() {
        return this.delegate.getChanges();
    }

    @Override // io.realm.MapChangeSet
    public K[] getDeletions() {
        return this.delegate.getDeletions();
    }

    @Override // io.realm.MapChangeSet
    public K[] getInsertions() {
        return this.delegate.getInsertions();
    }

    @Override // io.realm.MapChangeSet
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }
}
