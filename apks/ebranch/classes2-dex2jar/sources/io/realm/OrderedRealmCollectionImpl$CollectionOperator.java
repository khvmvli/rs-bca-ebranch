package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.UncheckedRow;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:io/realm/OrderedRealmCollectionImpl$CollectionOperator.class */
abstract class OrderedRealmCollectionImpl$CollectionOperator<T> {
    protected final BaseRealm baseRealm;
    @Nullable
    protected final String className;
    @Nullable
    protected final Class<T> classSpec;
    protected final OsResults osResults;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OrderedRealmCollectionImpl$CollectionOperator(BaseRealm baseRealm, OsResults osResults, @Nullable Class<T> cls, @Nullable String str) {
        this.baseRealm = baseRealm;
        this.osResults = osResults;
        this.classSpec = cls;
        this.className = str;
    }

    public abstract T convertRowToObject(UncheckedRow uncheckedRow);

    protected T convertToObject(@Nullable UncheckedRow uncheckedRow, boolean z, @Nullable T t) {
        if (uncheckedRow != null) {
            return (T) this.baseRealm.get(this.classSpec, this.className, uncheckedRow);
        }
        if (!z) {
            return t;
        }
        throw new IndexOutOfBoundsException("No results were found.");
    }

    @Nullable
    public abstract T firstImpl(boolean z, @Nullable T t);

    public abstract T get(int i);

    public abstract T getFromResults(int i, OsResults osResults);

    @Nullable
    public abstract T lastImpl(boolean z, @Nullable T t);
}
