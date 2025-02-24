package io.realm.exceptions;
/* loaded from: classes-dex2jar.jar:io/realm/exceptions/RealmMigrationNeededException.class */
public final class RealmMigrationNeededException extends RuntimeException {
    private final String canonicalRealmPath;

    public RealmMigrationNeededException(String str, String str2) {
        super(str2);
        this.canonicalRealmPath = str;
    }

    public final String getPath() {
        return this.canonicalRealmPath;
    }
}
