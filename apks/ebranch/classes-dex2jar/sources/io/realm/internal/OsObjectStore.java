package io.realm.internal;

import io.realm.RealmConfiguration;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:io/realm/internal/OsObjectStore.class */
public class OsObjectStore {
    public static final long SCHEMA_NOT_VERSIONED = -1;

    public static boolean callWithLock(RealmConfiguration realmConfiguration, Runnable runnable) {
        return nativeCallWithLock(realmConfiguration.getPath(), runnable);
    }

    public static boolean deleteTableForObject(OsSharedRealm osSharedRealm, String str) {
        return nativeDeleteTableForObject(osSharedRealm.getNativePtr(), str);
    }

    @Nullable
    public static String getPrimaryKeyForObject(OsSharedRealm osSharedRealm, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Util.getTablePrefix());
        sb.append(str);
        return nativeGetPrimaryKeyForObject(osSharedRealm.getNativePtr(), sb.toString());
    }

    public static long getSchemaVersion(OsSharedRealm osSharedRealm) {
        return nativeGetSchemaVersion(osSharedRealm.getNativePtr());
    }

    private static native boolean nativeCallWithLock(String str, Runnable runnable);

    private static native boolean nativeDeleteTableForObject(long j, String str);

    @Nullable
    private static native String nativeGetPrimaryKeyForObject(long j, String str);

    private static native long nativeGetSchemaVersion(long j);

    private static native void nativeSetPrimaryKeyForObject(long j, String str, @Nullable String str2);

    private static native void nativeSetSchemaVersion(long j, long j2);

    public static void setPrimaryKeyForObject(OsSharedRealm osSharedRealm, String str, @Nullable String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(Util.getTablePrefix());
        sb.append(str);
        nativeSetPrimaryKeyForObject(osSharedRealm.getNativePtr(), sb.toString(), str2);
    }

    public static void setSchemaVersion(OsSharedRealm osSharedRealm, long j) {
        nativeSetSchemaVersion(osSharedRealm.getNativePtr(), j);
    }
}
