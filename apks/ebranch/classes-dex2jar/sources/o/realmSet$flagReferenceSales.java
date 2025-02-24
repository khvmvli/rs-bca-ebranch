package o;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/realmSet$flagReferenceSales.class */
public final class realmSet$flagReferenceSales implements realmSet$flagSubmitSupplement {
    private static realmSet$flagReferenceSales e;
    @Nullable
    private final ContentObserver a;
    @Nullable
    private final Context b;

    private realmSet$flagReferenceSales() {
        this.b = null;
        this.a = null;
    }

    private realmSet$flagReferenceSales(Context context) {
        this.b = context;
        realmSet$gender realmset_gender = new ContentObserver(this, null) { // from class: o.realmSet$gender
            @Override // android.database.ContentObserver
            public final void onChange(boolean z) {
                realmSet$nationality.c();
            }
        };
        this.a = realmset_gender;
        context.getContentResolver().registerContentObserver(realmSet$flagAgreeAutodebet.d, true, realmset_gender);
    }

    public static void a() {
        Context context;
        synchronized (realmSet$flagReferenceSales.class) {
            try {
                realmSet$flagReferenceSales realmset_flagreferencesales = e;
                if (!(realmset_flagreferencesales == null || (context = realmset_flagreferencesales.b) == null || realmset_flagreferencesales.a == null)) {
                    context.getContentResolver().unregisterContentObserver(e.a);
                }
                e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static realmSet$flagReferenceSales b(Context context) {
        realmSet$flagReferenceSales realmset_flagreferencesales;
        synchronized (realmSet$flagReferenceSales.class) {
            try {
                if (e == null) {
                    e = getMandatorySystemGestureInsets.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new realmSet$flagReferenceSales(context) : new realmSet$flagReferenceSales();
                }
                realmset_flagreferencesales = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return realmset_flagreferencesales;
    }

    /* renamed from: a */
    public final String b(String str) {
        if (this.b == null) {
            return null;
        }
        try {
            return (String) realmSet$flagAgreeLifeInsurance.e(new realmSet$flagCardKrisFlyer(this, str) { // from class: o.realmSet$hmKecamatan
                private final realmSet$flagReferenceSales a;
                private final String e;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = r4;
                    this.e = r5;
                }

                @Override // o.realmSet$flagCardKrisFlyer
                public final Object a() {
                    return this.a.c(this.e);
                }
            });
        } catch (IllegalStateException | SecurityException e2) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e2);
            return null;
        }
    }

    public final /* synthetic */ String c(String str) {
        return realmSet$flagAgreeAutodebet.c(this.b.getContentResolver(), str, null);
    }
}
