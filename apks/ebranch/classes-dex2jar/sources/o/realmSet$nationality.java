package o;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/realmSet$nationality.class */
public abstract class realmSet$nationality<T> {
    @Nullable
    private static volatile realmSet$isKrisFlyer b;
    public static final /* synthetic */ int c;
    final realmSet$monthlyIncome a;
    final String e;
    private volatile int g = -1;
    private final T j;
    private volatile T k;
    private final boolean n;
    private static final Object d = new Object();
    private static final AtomicReference<Collection<realmSet$nationality<?>>> i = new AtomicReference<>();
    private static final realmSet$noCardKrisFlyer h = new Object(realmSet$hmKelurahan.c) { // from class: o.realmSet$noCardKrisFlyer
        {
            int i2 = realmSet$nationality.c;
        }
    };
    private static final AtomicInteger f = new AtomicInteger();

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ realmSet$nationality(realmSet$monthlyIncome realmset_monthlyincome, String str, Object obj, boolean z, realmSet$hmStayPeriod realmset_hmstayperiod) {
        if (realmset_monthlyincome.c != null) {
            this.a = realmset_monthlyincome;
            this.e = str;
            this.j = obj;
            this.n = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static void c() {
        f.incrementAndGet();
    }

    @Deprecated
    public static void d(Context context) {
        synchronized (d) {
            realmSet$isKrisFlyer realmset_iskrisflyer = b;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (realmset_iskrisflyer == null || realmset_iskrisflyer.c() != context) {
                realmSet$flagOtherCC.e();
                realmSet$officePosition.d();
                realmSet$flagReferenceSales.a();
                b = new realmSet$isKrisFlyer(context, realmSet$referenceSalesCode.d(new realmSet$promotionCode(context) { // from class: o.realmSet$identityCardType
                    private final Context a;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = r4;
                    }

                    @Override // o.realmSet$promotionCode
                    /* Code decompiled incorrectly, please refer to instructions dump */
                    public final java.lang.Object c() {
                        /*
                        // Method dump skipped, instructions count: 617
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.realmSet$identityCardType.c():java.lang.Object");
                    }
                })) { // from class: o.realmSet$emergencyContactPostalCode
                    private final realmSet$promotionCode<realmSet$preferredMailingAddress<realmSet$flagReferalCode>> a;
                    private final Context d;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        if (r5 != null) {
                            this.d = r5;
                            this.a = r6;
                            return;
                        }
                        throw new NullPointerException("Null context");
                    }

                    @Override // o.realmSet$isKrisFlyer
                    final Context c() {
                        return this.d;
                    }

                    @Override // o.realmSet$isKrisFlyer
                    @Nullable
                    final realmSet$promotionCode<realmSet$preferredMailingAddress<realmSet$flagReferalCode>> d() {
                        return this.a;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof realmSet$isKrisFlyer)) {
                            return false;
                        }
                        realmSet$isKrisFlyer realmset_iskrisflyer2 = (realmSet$isKrisFlyer) obj;
                        if (!this.d.equals(realmset_iskrisflyer2.c())) {
                            return false;
                        }
                        realmSet$promotionCode<realmSet$preferredMailingAddress<realmSet$flagReferalCode>> realmset_promotioncode = this.a;
                        return realmset_promotioncode == null ? realmset_iskrisflyer2.d() == null : realmset_promotioncode.equals(realmset_iskrisflyer2.d());
                    }

                    public final int hashCode() {
                        int hashCode = this.d.hashCode();
                        realmSet$promotionCode<realmSet$preferredMailingAddress<realmSet$flagReferalCode>> realmset_promotioncode = this.a;
                        return ((hashCode ^ 1000003) * 1000003) ^ (realmset_promotioncode == null ? 0 : realmset_promotioncode.hashCode());
                    }

                    public final String toString() {
                        String valueOf = String.valueOf(this.d);
                        String valueOf2 = String.valueOf(this.a);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
                        sb.append("FlagsContext{context=");
                        sb.append(valueOf);
                        sb.append(", hermeticFileOverrides=");
                        sb.append(valueOf2);
                        sb.append("}");
                        return sb.toString();
                    }
                };
                f.incrementAndGet();
            }
        }
    }

    public final String b() {
        String str = this.a.d;
        return this.e;
    }

    abstract T c(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:43:0x0118 A[Catch: all -> 0x01db, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:12:0x002c, B:14:0x0034, B:16:0x003c, B:18:0x005e, B:20:0x006b, B:22:0x0074, B:24:0x0083, B:25:0x008d, B:27:0x0099, B:28:0x00a1, B:30:0x00ab, B:32:0x00bc, B:34:0x00df, B:37:0x00f7, B:39:0x0106, B:43:0x0118, B:45:0x0151, B:49:0x0166, B:51:0x016c, B:53:0x017b, B:55:0x0181, B:57:0x01af, B:58:0x01b7, B:60:0x01be, B:61:0x01ca, B:62:0x01d5, B:64:0x01d7), top: B:73:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0181 A[Catch: all -> 0x01db, TRY_LEAVE, TryCatch #0 {, blocks: (B:12:0x002c, B:14:0x0034, B:16:0x003c, B:18:0x005e, B:20:0x006b, B:22:0x0074, B:24:0x0083, B:25:0x008d, B:27:0x0099, B:28:0x00a1, B:30:0x00ab, B:32:0x00bc, B:34:0x00df, B:37:0x00f7, B:39:0x0106, B:43:0x0118, B:45:0x0151, B:49:0x0166, B:51:0x016c, B:53:0x017b, B:55:0x0181, B:57:0x01af, B:58:0x01b7, B:60:0x01be, B:61:0x01ca, B:62:0x01d5, B:64:0x01d7), top: B:73:0x002c }] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final T e() {
        /*
        // Method dump skipped, instructions count: 485
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmSet$nationality.e():java.lang.Object");
    }
}
