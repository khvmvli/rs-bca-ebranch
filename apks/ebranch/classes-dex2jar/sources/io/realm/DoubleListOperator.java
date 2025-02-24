package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:io/realm/DoubleListOperator.class */
public final class DoubleListOperator extends ManagedListOperator<Double> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DoubleListOperator(BaseRealm baseRealm, OsList osList, Class<Double> cls) {
        super(baseRealm, osList, cls);
    }

    @Override // io.realm.ManagedListOperator
    public final void appendValue(Object obj) {
        this.osList.addDouble(((Number) obj).doubleValue());
    }

    @Override // io.realm.ManagedListOperator
    protected final void checkValidValue(@Nullable Object obj) {
        if (obj != null && !(obj instanceof Number)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Number", obj.getClass().getName()));
        }
    }

    @Override // io.realm.ManagedListOperator
    public final boolean forRealmModel() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.ManagedListOperator
    @Nullable
    public final Double get(int i) {
        return (Double) this.osList.getValue((long) i);
    }

    @Override // io.realm.ManagedListOperator
    public final void insertValue(int i, Object obj) {
        this.osList.insertDouble((long) i, ((Number) obj).doubleValue());
    }

    @Override // io.realm.ManagedListOperator
    protected final void setValue(int i, Object obj) {
        this.osList.setDouble((long) i, ((Number) obj).doubleValue());
    }
}
