package com.facebook.stetho.inspector.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.File;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/database/DefaultDatabaseConnectionProvider.class */
public class DefaultDatabaseConnectionProvider implements DatabaseConnectionProvider {
    protected int determineOpenOptions(File file) {
        String parent = file.getParent();
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append("-wal");
        return new File(parent, sb.toString()).exists() ? 1 : 0;
    }

    @Override // com.facebook.stetho.inspector.database.DatabaseConnectionProvider
    public SQLiteDatabase openDatabase(File file) throws SQLiteException {
        return performOpen(file, determineOpenOptions(file));
    }

    protected SQLiteDatabase performOpen(File file, int i) {
        SQLiteDatabaseCompat instance = SQLiteDatabaseCompat.getInstance();
        SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, instance.provideOpenFlags(i));
        instance.enableFeatures(i, openDatabase);
        return openDatabase;
    }
}
