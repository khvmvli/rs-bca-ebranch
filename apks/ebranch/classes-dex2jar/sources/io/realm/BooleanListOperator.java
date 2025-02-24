package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:io/realm/BooleanListOperator.class */
public final class BooleanListOperator extends ManagedListOperator<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BooleanListOperator(BaseRealm baseRealm, OsList osList, Class<Boolean> cls) {
        super(baseRealm, osList, cls);
    }

    @Override // io.realm.ManagedListOperator
    public final void appendValue(Object obj) {
        this.osList.addBoolean(((Boolean) obj).booleanValue());
    }

    @Override // io.realm.ManagedListOperator
    protected final void checkValidValue(@Nullable Object obj) {
        if (obj != null && !(obj instanceof Boolean)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Boolean", obj.getClass().getName()));
        }
    }

    @Override // io.realm.ManagedListOperator
    public final boolean forRealmModel() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.ManagedListOperator
    @Nullable
    public final Boolean get(int i) {
        return (Boolean) this.osList.getValue((long) i);
    }

    @Override // io.realm.ManagedListOperator
    public final void insertValue(int i, Object obj) {
        this.osList.insertBoolean((long) i, ((Boolean) obj).booleanValue());
    }

    @Override // io.realm.ManagedListOperator
    protected final void setValue(int i, Object obj) {
        this.osList.setBoolean((long) i, ((Boolean) obj).booleanValue());
    }
}
