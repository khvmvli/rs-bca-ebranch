package o;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* loaded from: classes-dex2jar.jar:o/realmSet$preferredMailingAddress.class */
public abstract class realmSet$preferredMailingAddress<T> implements Serializable {
    public static <T> realmSet$preferredMailingAddress<T> a(T t) {
        return new realmSet$preferredMailingAddress<T>(t) { // from class: o.realmSet$referalCode
            private final T d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.d = r4;
            }

            @Override // o.realmSet$preferredMailingAddress
            public final boolean a() {
                return true;
            }

            @Override // o.realmSet$preferredMailingAddress
            public final T c() {
                return this.d;
            }

            @Override // java.lang.Object
            public final boolean equals(@NullableDecl Object obj) {
                if (obj instanceof realmSet$referalCode) {
                    return this.d.equals(((realmSet$referalCode) obj).d);
                }
                return false;
            }

            @Override // java.lang.Object
            public final int hashCode() {
                return this.d.hashCode() + 1502476572;
            }

            @Override // java.lang.Object
            public final String toString() {
                String valueOf = String.valueOf(this.d);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
                sb.append("Optional.of(");
                sb.append(valueOf);
                sb.append(")");
                return sb.toString();
            }
        };
    }

    public static <T> realmSet$preferredMailingAddress<T> b() {
        return realmSet$phoneNumber.b;
    }

    public abstract boolean a();

    public abstract T c();
}
