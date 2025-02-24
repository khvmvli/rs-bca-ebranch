package o;

import android.os.Binder;
/* loaded from: classes-dex2jar.jar:o/realmSet$flagAgreeLifeInsurance.class */
public final /* synthetic */ class realmSet$flagAgreeLifeInsurance {
    public static <V> V e(realmSet$flagCardKrisFlyer<V> realmset_flagcardkrisflyer) {
        V v;
        try {
            v = realmset_flagcardkrisflyer.a();
        } catch (SecurityException e) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                v = realmset_flagcardkrisflyer.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return v;
    }
}
