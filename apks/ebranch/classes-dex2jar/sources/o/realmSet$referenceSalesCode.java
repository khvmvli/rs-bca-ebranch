package o;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* loaded from: classes-dex2jar.jar:o/realmSet$referenceSalesCode.class */
public final class realmSet$referenceSalesCode {
    public static <T> realmSet$promotionCode<T> a(@NullableDecl T t) {
        return new Object(t) { // from class: o.realmSet$totalDependent
            @NullableDecl
            final T b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = r4;
            }

            @Override // o.realmSet$promotionCode
            public final T c() {
                return this.b;
            }

            @Override // java.lang.Object
            public final boolean equals(@NullableDecl Object obj) {
                if (!(obj instanceof realmSet$totalDependent)) {
                    return false;
                }
                T t2 = this.b;
                T t3 = ((realmSet$totalDependent) obj).b;
                return t2 == t3 || t2.equals(t3);
            }

            @Override // java.lang.Object
            public final int hashCode() {
                return Arrays.hashCode(new Object[]{this.b});
            }

            @Override // java.lang.Object
            public final String toString() {
                String valueOf = String.valueOf(this.b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Suppliers.ofInstance(");
                sb.append(valueOf);
                sb.append(")");
                return sb.toString();
            }
        };
    }

    public static <T> realmSet$promotionCode<T> d(realmSet$promotionCode<T> realmset_promotioncode) {
        if ((realmset_promotioncode instanceof realmSet$referenceSalesName) || (realmset_promotioncode instanceof realmSet$selectedCardOptions)) {
            return realmset_promotioncode;
        }
        return realmset_promotioncode instanceof Serializable ? new Object(realmset_promotioncode) { // from class: o.realmSet$selectedCardOptions
            final realmSet$promotionCode<T> b;
            volatile transient boolean d;
            @NullableDecl
            transient T e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                r4.getClass();
                this.b = r4;
            }

            @Override // o.realmSet$promotionCode
            public final T c() {
                if (!this.d) {
                    synchronized (this) {
                        if (!this.d) {
                            T c = this.b.c();
                            this.e = c;
                            this.d = true;
                            return c;
                        }
                    }
                }
                return this.e;
            }

            @Override // java.lang.Object
            public final String toString() {
                Object obj;
                if (this.d) {
                    String valueOf = String.valueOf(this.e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("<supplier that returned ");
                    sb.append(valueOf);
                    sb.append(">");
                    obj = sb.toString();
                } else {
                    obj = this.b;
                }
                String valueOf2 = String.valueOf(obj);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
                sb2.append("Suppliers.memoize(");
                sb2.append(valueOf2);
                sb2.append(")");
                return sb2.toString();
            }
        } : new realmSet$promotionCode<T>(realmset_promotioncode) { // from class: o.realmSet$referenceSalesName
            volatile boolean a;
            volatile realmSet$promotionCode<T> b;
            @NullableDecl
            T e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                r4.getClass();
                this.b = r4;
            }

            @Override // o.realmSet$promotionCode
            public final T c() {
                if (!this.a) {
                    synchronized (this) {
                        if (!this.a) {
                            T c = this.b.c();
                            this.e = c;
                            this.a = true;
                            this.b = null;
                            return c;
                        }
                    }
                }
                return this.e;
            }

            public final String toString() {
                realmSet$promotionCode<T> realmset_promotioncode2 = this.b;
                String str = realmset_promotioncode2;
                if (realmset_promotioncode2 == null) {
                    String valueOf = String.valueOf(this.e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("<supplier that returned ");
                    sb.append(valueOf);
                    sb.append(">");
                    str = sb.toString();
                }
                String valueOf2 = String.valueOf(str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
                sb2.append("Suppliers.memoize(");
                sb2.append(valueOf2);
                sb2.append(")");
                return sb2.toString();
            }
        };
    }
}
