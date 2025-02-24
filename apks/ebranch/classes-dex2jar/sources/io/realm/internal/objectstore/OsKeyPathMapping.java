package io.realm.internal.objectstore;

import io.realm.internal.NativeContext;
import io.realm.internal.NativeObject;
/* loaded from: classes-dex2jar.jar:io/realm/internal/objectstore/OsKeyPathMapping.class */
public class OsKeyPathMapping implements NativeObject {
    private static final long nativeFinalizerPtr = nativeGetFinalizerMethodPtr();
    public long mappingPointer;

    public OsKeyPathMapping(long j) {
        this.mappingPointer = -1;
        this.mappingPointer = nativeCreateMapping(j);
        NativeContext.dummyContext.addReference(this);
    }

    private static native long nativeCreateMapping(long j);

    private static native long nativeGetFinalizerMethodPtr();

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.mappingPointer;
    }
}
