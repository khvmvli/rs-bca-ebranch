package io.realm;

import io.realm.internal.OsCollectionChangeSet;
/* loaded from: classes2-dex2jar.jar:io/realm/SetChangeSet.class */
public class SetChangeSet {
    private final OsCollectionChangeSet osCollectionChangeSet;

    public SetChangeSet(OsCollectionChangeSet osCollectionChangeSet) {
        this.osCollectionChangeSet = osCollectionChangeSet;
    }

    public int getNumberOfDeletions() {
        return this.osCollectionChangeSet.getDeletions().length;
    }

    public int getNumberOfInsertions() {
        return this.osCollectionChangeSet.getInsertions().length;
    }

    public boolean isEmpty() {
        return this.osCollectionChangeSet.getNativePtr() == 0;
    }
}
