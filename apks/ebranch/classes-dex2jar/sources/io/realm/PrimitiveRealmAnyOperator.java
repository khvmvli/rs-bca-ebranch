package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:io/realm/PrimitiveRealmAnyOperator.class */
public abstract class PrimitiveRealmAnyOperator extends RealmAnyOperator {
    @Nullable
    private final Object value;

    public PrimitiveRealmAnyOperator(@Nullable Object obj, @Nonnull RealmAny.Type type) {
        super(type);
        this.value = obj;
    }

    public PrimitiveRealmAnyOperator(@Nullable Object obj, @Nonnull RealmAny.Type type, @Nonnull NativeRealmAny nativeRealmAny) {
        super(type, nativeRealmAny);
        this.value = obj;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            if (!getClass().equals(obj.getClass())) {
                z = false;
            } else {
                Object obj2 = this.value;
                Object obj3 = ((PrimitiveRealmAnyOperator) obj).value;
                if (obj2 == null) {
                    z = false;
                    if (obj3 == null) {
                        z = true;
                    }
                } else {
                    z = obj2.equals(obj3);
                }
            }
        }
        return z;
    }

    @Override // io.realm.RealmAnyOperator
    public <T> T getValue(Class<T> cls) {
        return cls.cast(this.value);
    }

    public final int hashCode() {
        Object obj = this.value;
        return obj == null ? 0 : obj.hashCode();
    }

    public String toString() {
        return this.value.toString();
    }
}
