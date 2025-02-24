package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import java.util.UUID;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:io/realm/UUIDListOperator.class */
public final class UUIDListOperator extends ManagedListOperator<UUID> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public UUIDListOperator(BaseRealm baseRealm, OsList osList, Class<UUID> cls) {
        super(baseRealm, osList, cls);
    }

    @Override // io.realm.ManagedListOperator
    public final void appendValue(Object obj) {
        this.osList.addUUID((UUID) obj);
    }

    @Override // io.realm.ManagedListOperator
    protected final void checkValidValue(@Nullable Object obj) {
        if (obj != null && !(obj instanceof UUID)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.util.UUID", obj.getClass().getName()));
        }
    }

    @Override // io.realm.ManagedListOperator
    public final boolean forRealmModel() {
        return false;
    }

    @Override // io.realm.ManagedListOperator
    @Nullable
    public final UUID get(int i) {
        return (UUID) this.osList.getValue((long) i);
    }

    @Override // io.realm.ManagedListOperator
    public final void insertValue(int i, Object obj) {
        this.osList.insertUUID((long) i, (UUID) obj);
    }

    @Override // io.realm.ManagedListOperator
    protected final void setValue(int i, Object obj) {
        this.osList.setUUID((long) i, (UUID) obj);
    }
}
