package com.facebook.stetho.inspector.database;

import android.database.sqlite.SQLiteDatabase;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/database/SQLiteDatabaseCompat.class */
public abstract class SQLiteDatabaseCompat {
    public static final int ENABLE_FOREIGN_KEY_CONSTRAINTS = 2;
    public static final int ENABLE_WRITE_AHEAD_LOGGING = 1;
    private static final SQLiteDatabaseCompat sInstance = new JellyBeanAndBeyondImpl();

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/database/SQLiteDatabaseCompat$HoneycombImpl.class */
    static class HoneycombImpl extends SQLiteDatabaseCompat {
        private HoneycombImpl() {
        }

        @Override // com.facebook.stetho.inspector.database.SQLiteDatabaseCompat
        public void enableFeatures(int i, SQLiteDatabase sQLiteDatabase) {
            if ((i & 1) != 0) {
                sQLiteDatabase.enableWriteAheadLogging();
            }
            if ((i & 2) != 0) {
                sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
            }
        }

        @Override // com.facebook.stetho.inspector.database.SQLiteDatabaseCompat
        public int provideOpenFlags(int i) {
            return 0;
        }
    }

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/database/SQLiteDatabaseCompat$JellyBeanAndBeyondImpl.class */
    static class JellyBeanAndBeyondImpl extends SQLiteDatabaseCompat {
        private JellyBeanAndBeyondImpl() {
        }

        @Override // com.facebook.stetho.inspector.database.SQLiteDatabaseCompat
        public void enableFeatures(int i, SQLiteDatabase sQLiteDatabase) {
            if ((i & 2) != 0) {
                sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
            }
        }

        @Override // com.facebook.stetho.inspector.database.SQLiteDatabaseCompat
        public int provideOpenFlags(int i) {
            return (i & 1) != 0 ? 536870912 : 0;
        }
    }

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/database/SQLiteDatabaseCompat$NoopImpl.class */
    static class NoopImpl extends SQLiteDatabaseCompat {
        private NoopImpl() {
        }

        @Override // com.facebook.stetho.inspector.database.SQLiteDatabaseCompat
        public void enableFeatures(int i, SQLiteDatabase sQLiteDatabase) {
        }

        @Override // com.facebook.stetho.inspector.database.SQLiteDatabaseCompat
        public int provideOpenFlags(int i) {
            return 0;
        }
    }

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/database/SQLiteDatabaseCompat$SQLiteOpenOptions.class */
    public @interface SQLiteOpenOptions {
    }

    public static SQLiteDatabaseCompat getInstance() {
        return sInstance;
    }

    public abstract void enableFeatures(int i, SQLiteDatabase sQLiteDatabase);

    public abstract int provideOpenFlags(int i);
}
