package o;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmGet$cardType.class */
public final class realmGet$cardType {
    private static final realmGet$cardType d = new realmGet$cardType();
    private final ConcurrentMap<Class<?>, realmSet$annualFeeBasicDisplayAmount<?>> a = new ConcurrentHashMap();
    private final realmSet$benefit c = new setTotalSupplementCard();

    private realmGet$cardType() {
    }

    public static realmGet$cardType d() {
        return d;
    }

    public final <T> realmSet$annualFeeBasicDisplayAmount<T> b(Class<T> cls) {
        setNationality.e(cls, "messageType");
        realmSet$annualFeeBasicDisplayAmount<?> realmset_annualfeebasicdisplayamount = this.a.get(cls);
        realmSet$annualFeeBasicDisplayAmount<T> realmset_annualfeebasicdisplayamount2 = (realmSet$annualFeeBasicDisplayAmount<T>) realmset_annualfeebasicdisplayamount;
        if (realmset_annualfeebasicdisplayamount == null) {
            realmset_annualfeebasicdisplayamount2 = this.c.d(cls);
            setNationality.e(cls, "messageType");
            setNationality.e(realmset_annualfeebasicdisplayamount2, "schema");
            realmSet$annualFeeBasicDisplayAmount<T> realmset_annualfeebasicdisplayamount3 = (realmSet$annualFeeBasicDisplayAmount<T>) this.a.putIfAbsent(cls, realmset_annualfeebasicdisplayamount2);
            if (realmset_annualfeebasicdisplayamount3 != null) {
                return realmset_annualfeebasicdisplayamount3;
            }
        }
        return realmset_annualfeebasicdisplayamount2;
    }
}
