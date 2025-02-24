package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import o.Tarikan$;
import o.realmGet;
import o.realmSet;
/* loaded from: classes-dex2jar.jar:o/realmGet$emergencyContactOfficeExt.class */
public final class realmGet$emergencyContactOfficeExt {
    private static volatile realmGet$emergencyContactOfficeExt d;
    private final String a;
    protected final ExecutorService b;
    private final getNomorRekening c;
    protected final getNoTelpKontakPengirim e;
    private boolean f;
    private final List<Pair<realmSet.SourceAccountOwnerType, realmGet$customerName>> h;
    private volatile getPrevWorkPeriod i;
    private final String j;

    protected realmGet$emergencyContactOfficeExt(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !b(str2, str3)) {
            this.a = "FA";
        } else {
            this.a = str;
        }
        this.e = getSaranaPembayaranPengirim.a();
        boolean z = true;
        this.b = getOfficePosition.b().e(new ThreadFactory(this) { // from class: o.realmGet$currOfficeBusinessField
            private final ThreadFactory c = Executors.defaultThreadFactory();

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread newThread = this.c.newThread(runnable);
                newThread.setName("ScionFrontendApi");
                return newThread;
            }
        }, 1);
        this.c = new getNomorRekening(this);
        this.h = new ArrayList();
        try {
            if (Tarikan$.Parcelable.c(context, "google_app_id", realmGet.RepresentativeRelationship.c(context)) != null && !c()) {
                this.j = null;
                this.f = true;
                Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException e) {
        }
        if (!b(str2, str3)) {
            this.j = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 != null ? false : z)) {
                    Log.w(this.a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        } else {
            this.j = str2;
        }
        a(new realmGet$customerFullName(str2, str3, context, bundle) { // from class: o.realmGet$creditCardOptions
            final /* synthetic */ Context a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ Bundle d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = r6;
                this.c = r7;
                this.a = r8;
                this.d = r9;
            }

            @Override // o.realmGet$customerFullName
            public final void c() {
                String str4;
                String str5;
                String str6;
                try {
                    realmGet$emergencyContactOfficeExt realmget_emergencycontactofficeext = realmGet$emergencyContactOfficeExt.this;
                    if (realmGet$emergencyContactOfficeExt.b(this.b, this.c)) {
                        str4 = this.c;
                        str6 = this.b;
                        str5 = realmGet$emergencyContactOfficeExt.this.a;
                    } else {
                        str5 = null;
                        str4 = null;
                        str6 = null;
                    }
                    setFotoKtp.b(this.a);
                    realmGet$emergencyContactOfficeExt realmget_emergencycontactofficeext2 = realmGet$emergencyContactOfficeExt.this;
                    realmget_emergencycontactofficeext2.i = realmget_emergencycontactofficeext2.e(this.a, true);
                    if (realmGet$emergencyContactOfficeExt.this.i == null) {
                        Log.w(realmGet$emergencyContactOfficeExt.this.a, "Failed to connect to measurement client.");
                        return;
                    }
                    int c = DynamiteModule.c(this.a, "com.google.android.gms.measurement.dynamite");
                    int e2 = DynamiteModule.e(this.a, "com.google.android.gms.measurement.dynamite");
                    ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).c(realmSet$jenisWarkatTransaksi.d(this.a), new realmGet$bcaDebitCardType(42004, (long) Math.max(c, e2), e2 < c, str5, str6, str4, this.d, realmGet.RepresentativeRelationship.c(this.a)), this.j);
                } catch (Exception e3) {
                    realmGet$emergencyContactOfficeExt.this.c(e3, true, false);
                }
            }
        });
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new realmGet$emergencyContactRelation(this));
        }
    }

    public final void a(realmGet$customerFullName realmget_customerfullname) {
        this.b.execute(realmget_customerfullname);
    }

    public static final boolean b(String str, String str2) {
        return (str2 == null || str == null || c()) ? false : true;
    }

    public final void c(Exception exc, boolean z, boolean z2) {
        this.f |= z;
        if (z) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            d(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.a, "Error with data collection. Data lost.", exc);
    }

    protected static final boolean c() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    private final void d(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        a(new realmGet$customerFullName(l, str, str2, bundle, z, z2) { // from class: o.realmGet$currWorkPeriod
            final /* synthetic */ Bundle a;
            final /* synthetic */ String b;
            final /* synthetic */ Long c;
            final /* synthetic */ boolean d;
            final /* synthetic */ String e;
            final /* synthetic */ boolean g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.c = r6;
                this.b = r7;
                this.e = r8;
                this.a = r9;
                this.d = r10;
                this.g = r11;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                Long l2 = this.c;
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).e(this.b, this.e, this.a, this.d, this.g, l2 == null ? this.j : l2.longValue());
            }
        });
    }

    public static realmGet$emergencyContactOfficeExt e(Context context, String str, String str2, String str3, Bundle bundle) {
        setFotoKtp.b(context);
        if (d == null) {
            synchronized (realmGet$emergencyContactOfficeExt.class) {
                try {
                    if (d == null) {
                        d = new realmGet$emergencyContactOfficeExt(context, str, str2, str3, bundle);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final String a() {
        getNoCardKrisFlyer getnocardkrisflyer = new getNoCardKrisFlyer();
        a(new realmGet$customerFullName(getnocardkrisflyer) { // from class: o.realmGet$currOfficeExtensionNumber
            final /* synthetic */ getNoCardKrisFlyer e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r6;
            }

            @Override // o.realmGet$customerFullName
            protected final void a() {
                this.e.c((Bundle) null);
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).a(this.e);
            }
        });
        return getnocardkrisflyer.c(120000);
    }

    public final void a(long j) {
        a(new realmGet$customerFullName(j) { // from class: o.realmGet$currCompanyName
            final /* synthetic */ long e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r6;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).a(this.e);
            }
        });
    }

    public final void a(Bundle bundle) {
        a(new realmGet$customerFullName(bundle) { // from class: o.realmGet$currOfficeEmailAddress
            final /* synthetic */ Bundle e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r6;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).d(this.e);
            }
        });
    }

    public final void a(String str) {
        a(new realmGet$customerFullName(str) { // from class: o.realmGet$birthDate
            final /* synthetic */ String a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = r6;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).a(this.a, this.j);
            }
        });
    }

    public final void a(String str, Bundle bundle) {
        d(null, str, bundle, false, true, null);
    }

    public final void a(String str, String str2, Bundle bundle) {
        a(new realmGet$customerFullName(str, str2, bundle) { // from class: o.realmGet$bcaAccountNumber
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ Bundle e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.c = r6;
                this.d = r7;
                this.e = r8;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).e(this.c, this.d, this.e);
            }
        });
    }

    public final int b(String str) {
        getNoCardKrisFlyer getnocardkrisflyer = new getNoCardKrisFlyer();
        a(new realmGet$customerFullName(str, getnocardkrisflyer) { // from class: o.realmGet$currOfficeAddress
            final /* synthetic */ getNoCardKrisFlyer a;
            final /* synthetic */ String d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.d = r6;
                this.a = r7;
            }

            @Override // o.realmGet$customerFullName
            protected final void a() {
                this.a.c((Bundle) null);
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).d(this.d, this.a);
            }
        });
        Integer num = (Integer) getNoCardKrisFlyer.d(getnocardkrisflyer.d(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void b() {
        a(new realmGet$customerFullName() { // from class: o.realmGet$creditCardSupplements
            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).c(this.j);
            }
        });
    }

    public final void b(Activity activity, String str, String str2) {
        a(new realmGet$customerFullName(activity, str, str2) { // from class: o.realmGet$birthPlace
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ Activity e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r6;
                this.c = r7;
                this.b = r8;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).d(realmSet$jenisWarkatTransaksi.d(this.e), this.c, this.b, this.j);
            }
        });
    }

    public final void b(String str, String str2, Object obj, boolean z) {
        a(new realmGet$customerFullName(str, str2, obj, z) { // from class: o.realmGet$currOfficePostCode
            final /* synthetic */ Object a;
            final /* synthetic */ boolean b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.c = r6;
                this.d = r7;
                this.a = r8;
                this.b = r9;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).d(this.c, this.d, realmSet$jenisWarkatTransaksi.d(this.a), this.b, this.j);
            }
        });
    }

    public final Map<String, Object> c(String str, String str2, boolean z) {
        getNoCardKrisFlyer getnocardkrisflyer = new getNoCardKrisFlyer();
        a(new realmGet$customerFullName(str, str2, z, getnocardkrisflyer) { // from class: o.realmGet$currCompanyPosition
            final /* synthetic */ String b;
            final /* synthetic */ boolean c;
            final /* synthetic */ getNoCardKrisFlyer d;
            final /* synthetic */ String e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r6;
                this.b = r7;
                this.c = r8;
                this.d = r9;
            }

            @Override // o.realmGet$customerFullName
            protected final void a() {
                this.d.c((Bundle) null);
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).c(this.e, this.b, this.c, this.d);
            }
        });
        Bundle d2 = getnocardkrisflyer.d(5000);
        if (d2 == null || d2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(d2.size());
        for (String str3 : d2.keySet()) {
            Object obj = d2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void c(realmSet.SourceAccountOwnerType sourceAccountOwnerType) {
        setFotoKtp.b(sourceAccountOwnerType);
        synchronized (this.h) {
            for (int i = 0; i < this.h.size(); i++) {
                if (sourceAccountOwnerType.equals(this.h.get(i).first)) {
                    Log.w(this.a, "OnEventListener already registered.");
                    return;
                }
            }
            realmGet$customerName realmget_customername = new realmGet$customerName(sourceAccountOwnerType);
            this.h.add(new Pair<>(sourceAccountOwnerType, realmget_customername));
            if (this.i != null) {
                try {
                    this.i.c(realmget_customername);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException e) {
                    Log.w(this.a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            a(new realmGet$customerFullName(realmget_customername) { // from class: o.realmGet$currOfficePhoneNumber
                final /* synthetic */ realmGet$customerName a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = r6;
                }

                @Override // o.realmGet$customerFullName
                final void c() throws RemoteException {
                    ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).c(this.a);
                }
            });
        }
    }

    public final void c(boolean z) {
        a(new realmGet$customerFullName(z) { // from class: o.realmGet$currOfficeCity
            final /* synthetic */ boolean d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.d = r6;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).e(this.d);
            }
        });
    }

    public final List<Bundle> d(String str, String str2) {
        getNoCardKrisFlyer getnocardkrisflyer = new getNoCardKrisFlyer();
        a(new realmGet$customerFullName(str, str2, getnocardkrisflyer) { // from class: o.realmGet$ccOtherBankAccounts
            final /* synthetic */ getNoCardKrisFlyer c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r6;
                this.d = r7;
                this.c = r8;
            }

            @Override // o.realmGet$customerFullName
            protected final void a() {
                this.c.c((Bundle) null);
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).d(this.e, this.d, this.c);
            }
        });
        List<Bundle> list = (List) getNoCardKrisFlyer.d(getnocardkrisflyer.d(5000), List.class);
        List<Bundle> list2 = list;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final void d(int i, String str, Object obj, Object obj2, Object obj3) {
        a(new realmGet$customerFullName(false, 5, str, obj, null, null) { // from class: o.realmGet$currCompanyBusinessType
            final /* synthetic */ String a;
            final /* synthetic */ Object c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = r8;
                this.c = r9;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).a(5, this.a, realmSet$jenisWarkatTransaksi.d(this.c), realmSet$jenisWarkatTransaksi.d((Object) null), realmSet$jenisWarkatTransaksi.d((Object) null));
            }
        });
    }

    public final void d(Bundle bundle) {
        a(new realmGet$customerFullName(bundle) { // from class: o.realmGet$country
            final /* synthetic */ Bundle e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r6;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).d(this.e, this.j);
            }
        });
    }

    public final void d(String str, String str2, Bundle bundle) {
        d(str, str2, bundle, true, true, null);
    }

    public final getNomorRekening e() {
        return this.c;
    }

    public final getPrevWorkPeriod e(Context context, boolean z) {
        try {
            return getPrevCompanyName.a(DynamiteModule.a(context, DynamiteModule.e, "com.google.android.gms.measurement.dynamite").a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            c((Exception) e, true, false);
            return null;
        }
    }

    public final void e(Bundle bundle) {
        a(new realmGet$customerFullName(bundle) { // from class: o.realmGet$autodebetAccountNumber
            final /* synthetic */ Bundle e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r6;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).c(this.e, this.j);
            }
        });
    }

    public final void e(Boolean bool) {
        a(new realmGet$customerFullName(bool) { // from class: o.realmGet$ccOtherBankCreditCards
            final /* synthetic */ Boolean b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = r6;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                if (this.b != null) {
                    ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).d(this.b.booleanValue(), this.j);
                } else {
                    ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactOfficeExt.this.i)).b(this.j);
                }
            }
        });
    }
}
