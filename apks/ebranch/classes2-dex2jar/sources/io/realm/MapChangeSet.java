package io.realm;
/* loaded from: classes2-dex2jar.jar:io/realm/MapChangeSet.class */
public interface MapChangeSet<T> {
    T[] getChanges();

    T[] getDeletions();

    T[] getInsertions();

    boolean isEmpty();
}
