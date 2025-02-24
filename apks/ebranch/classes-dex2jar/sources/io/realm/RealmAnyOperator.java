package io.realm;

import io.realm.RealmAny;
import io.realm.exceptions.RealmException;
import io.realm.internal.core.NativeRealmAny;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:io/realm/RealmAnyOperator.class */
public abstract class RealmAnyOperator {
    @Nullable
    private NativeRealmAny nativeRealmAny;
    private RealmAny.Type type;

    public RealmAnyOperator(RealmAny.Type type) {
        this.type = type;
    }

    public RealmAnyOperator(RealmAny.Type type, NativeRealmAny nativeRealmAny) {
        this.type = type;
        this.nativeRealmAny = nativeRealmAny;
    }

    public static RealmAnyOperator fromNativeRealmAny(BaseRealm baseRealm, NativeRealmAny nativeRealmAny) {
        RealmAny.Type type = nativeRealmAny.getType();
        switch (1.$SwitchMap$io$realm$RealmAny$Type[type.ordinal()]) {
            case 1:
                return new IntegerRealmAnyOperator(nativeRealmAny);
            case 2:
                return new BooleanRealmAnyOperator(nativeRealmAny);
            case 3:
                return new StringRealmAnyOperator(nativeRealmAny);
            case 4:
                return new BinaryRealmAnyOperator(nativeRealmAny);
            case 5:
                return new DateRealmAnyOperator(nativeRealmAny);
            case 6:
                return new FloatRealmAnyOperator(nativeRealmAny);
            case 7:
                return new DoubleRealmAnyOperator(nativeRealmAny);
            case 8:
                return new Decimal128RealmAnyOperator(nativeRealmAny);
            case 9:
                return new ObjectIdRealmAnyOperator(nativeRealmAny);
            case 10:
                return new UUIDRealmAnyOperator(nativeRealmAny);
            case 11:
                if (baseRealm instanceof Realm) {
                    try {
                        return new RealmModelOperator(baseRealm, nativeRealmAny, nativeRealmAny.getModelClass(baseRealm.sharedRealm, baseRealm.configuration.getSchemaMediator()));
                    } catch (RealmException e) {
                    }
                }
                return new DynamicRealmModelRealmAnyOperator(baseRealm, nativeRealmAny);
            case 12:
                return new NullRealmAnyOperator(nativeRealmAny);
            default:
                StringBuilder sb = new StringBuilder("Couldn't cast to ");
                sb.append(type);
                throw new ClassCastException(sb.toString());
        }
    }

    private NativeRealmAny getNativeRealmAny() {
        NativeRealmAny nativeRealmAny;
        synchronized (this) {
            if (this.nativeRealmAny == null) {
                this.nativeRealmAny = createNativeRealmAny();
            }
            nativeRealmAny = this.nativeRealmAny;
        }
        return nativeRealmAny;
    }

    public void checkValidObject(BaseRealm baseRealm) {
    }

    public boolean coercedEquals(RealmAnyOperator realmAnyOperator) {
        return getNativeRealmAny().coercedEquals(realmAnyOperator.getNativeRealmAny());
    }

    protected abstract NativeRealmAny createNativeRealmAny();

    public long getNativePtr() {
        return getNativeRealmAny().getNativePtr();
    }

    public RealmAny.Type getType() {
        return this.type;
    }

    public Class<?> getTypedClass() {
        return this.type.getTypedClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <T> T getValue(Class<T> cls);
}
