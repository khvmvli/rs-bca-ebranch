package io.realm;
/* loaded from: classes-dex2jar.jar:io/realm/ObjectChangeSet.class */
public interface ObjectChangeSet {
    String[] getChangedFields();

    boolean isDeleted();

    boolean isFieldChanged(String str);
}
