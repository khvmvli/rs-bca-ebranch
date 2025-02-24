package io.realm;

import io.realm.internal.OsMapChangeSet;
/* loaded from: classes2-dex2jar.jar:io/realm/StringMapChangeSet.class */
class StringMapChangeSet implements MapChangeSet<String> {
    private final OsMapChangeSet osMapChangeSet;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StringMapChangeSet(long j) {
        this.osMapChangeSet = new OsMapChangeSet(j);
    }

    @Override // io.realm.MapChangeSet
    public String[] getChanges() {
        return this.osMapChangeSet.getStringKeyModifications();
    }

    @Override // io.realm.MapChangeSet
    public String[] getDeletions() {
        return this.osMapChangeSet.getStringKeyDeletions();
    }

    @Override // io.realm.MapChangeSet
    public String[] getInsertions() {
        return this.osMapChangeSet.getStringKeyInsertions();
    }

    @Override // io.realm.MapChangeSet
    public boolean isEmpty() {
        return this.osMapChangeSet.isEmpty();
    }
}
