package o;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/realmSet$flagOtherCC.class */
public final class realmSet$flagOtherCC implements realmSet$flagSubmitSupplement {
    private final ContentObserver a;
    private final ContentResolver b;
    private final Uri d;
    private volatile Map<String, String> f;
    private static final Map<Uri, realmSet$flagOtherCC> e = new setThumbTextPadding();
    public static final String[] c = {"key", "value"};
    private final Object j = new Object();
    private final List<realmSet$flagPromotionCode> h = new ArrayList();

    private realmSet$flagOtherCC(ContentResolver contentResolver, Uri uri) {
        realmSet$flagAgreeDisclosure realmset_flagagreedisclosure = new ContentObserver(null) { // from class: o.realmSet$flagAgreeDisclosure
            @Override // android.database.ContentObserver
            public final void onChange(boolean z) {
                realmSet$flagOtherCC.this.d();
            }
        };
        this.a = realmset_flagagreedisclosure;
        contentResolver.getClass();
        uri.getClass();
        this.b = contentResolver;
        this.d = uri;
        contentResolver.registerContentObserver(uri, false, realmset_flagagreedisclosure);
    }

    public static realmSet$flagOtherCC b(ContentResolver contentResolver, Uri uri) {
        realmSet$flagOtherCC realmset_flagothercc;
        synchronized (realmSet$flagOtherCC.class) {
            try {
                Map<Uri, realmSet$flagOtherCC> map = e;
                realmSet$flagOtherCC realmset_flagothercc2 = map.get(uri);
                realmset_flagothercc = realmset_flagothercc2;
                if (realmset_flagothercc2 == null) {
                    try {
                        realmset_flagothercc = new realmSet$flagOtherCC(contentResolver, uri);
                        try {
                            map.put(uri, realmset_flagothercc);
                        } catch (SecurityException e2) {
                        }
                    } catch (SecurityException e3) {
                        realmset_flagothercc = realmset_flagothercc2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return realmset_flagothercc;
    }

    public static void e() {
        synchronized (realmSet$flagOtherCC.class) {
            try {
                for (realmSet$flagOtherCC realmset_flagothercc : e.values()) {
                    realmset_flagothercc.b.unregisterContentObserver(realmset_flagothercc.a);
                }
                e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map<String, String> a() {
        Map<String, String> map = this.f;
        Map<String, String> map2 = map;
        if (map == null) {
            synchronized (this.j) {
                Map<String, String> map3 = this.f;
                map2 = map3;
                if (map3 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map2 = (Map) realmSet$flagAgreeLifeInsurance.e(new realmSet$flagCardKrisFlyer(this) { // from class: o.realmSet$emergencyContactRelation
                            private final realmSet$flagOtherCC d;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.d = r4;
                            }

                            @Override // o.realmSet$flagCardKrisFlyer
                            public final Object a() {
                                return this.d.b();
                            }
                        });
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException e2) {
                        Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map2 = null;
                    }
                    this.f = map2;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    @Override // o.realmSet$flagSubmitSupplement
    public final /* synthetic */ Object b(String str) {
        return a().get(str);
    }

    public final /* synthetic */ Map b() {
        Cursor query = this.b.query(this.d, c, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map setthumbtextpadding = count <= 256 ? new setThumbTextPadding(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                setthumbtextpadding.put(query.getString(0), query.getString(1));
            }
            return setthumbtextpadding;
        } finally {
            query.close();
        }
    }

    public final void d() {
        synchronized (this.j) {
            this.f = null;
            realmSet$nationality.c();
        }
        synchronized (this) {
            for (realmSet$flagPromotionCode realmset_flagpromotioncode : this.h) {
                realmset_flagpromotioncode.c();
            }
        }
    }
}
