package o;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmSet$phoneNumber.class */
public final class realmSet$phoneNumber<T> extends realmSet$preferredMailingAddress<T> {
    static final realmSet$phoneNumber<Object> b = new realmSet$phoneNumber<>();

    private realmSet$phoneNumber() {
    }

    @Override // o.realmSet$preferredMailingAddress
    public final boolean a() {
        return false;
    }

    @Override // o.realmSet$preferredMailingAddress
    public final T c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // java.lang.Object
    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return 2040732332;
    }

    @Override // java.lang.Object
    public final String toString() {
        return "Optional.absent()";
    }
}
