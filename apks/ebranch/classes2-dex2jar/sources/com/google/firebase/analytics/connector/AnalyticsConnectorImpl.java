package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.internal.zza;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.analytics.connector.internal.zzg;
import com.google.firebase.events.Event;
import com.google.firebase.events.Subscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.PilihRekeningSumberDanaDialog_ViewBinding;
import o.getNomorRekening;
import o.realmGet;
import o.search;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/analytics/connector/AnalyticsConnectorImpl.class */
public class AnalyticsConnectorImpl implements AnalyticsConnector {
    private static volatile AnalyticsConnector zzc;
    final getNomorRekening zza;
    final Map<String, zza> zzb;

    AnalyticsConnectorImpl(getNomorRekening getnomorrekening) {
        if (getnomorrekening != null) {
            this.zza = getnomorrekening;
            this.zzb = new ConcurrentHashMap();
            return;
        }
        throw new NullPointerException("null reference");
    }

    public static AnalyticsConnector getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public static AnalyticsConnector getInstance(FirebaseApp firebaseApp) {
        return (AnalyticsConnector) firebaseApp.get(AnalyticsConnector.class);
    }

    public static AnalyticsConnector getInstance(FirebaseApp firebaseApp, Context context, Subscriber subscriber) {
        if (firebaseApp == null) {
            throw new NullPointerException("null reference");
        } else if (context == null) {
            throw new NullPointerException("null reference");
        } else if (subscriber == null) {
            throw new NullPointerException("null reference");
        } else if (context.getApplicationContext() != null) {
            if (zzc == null) {
                synchronized (AnalyticsConnectorImpl.class) {
                    try {
                        if (zzc == null) {
                            Bundle bundle = new Bundle(1);
                            if (firebaseApp.isDefaultApp()) {
                                subscriber.subscribe(DataCollectionDefaultChange.class, search.e, PilihRekeningSumberDanaDialog_ViewBinding.a);
                                bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                            }
                            zzc = new AnalyticsConnectorImpl(realmGet.emergencyContactOfficeExt.e(context, (String) null, (String) null, (String) null, bundle).e());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return zzc;
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public static final /* synthetic */ void zza(Event event) {
        boolean z = ((DataCollectionDefaultChange) event.getPayload()).enabled;
        synchronized (AnalyticsConnectorImpl.class) {
            try {
                AnalyticsConnectorImpl analyticsConnectorImpl = zzc;
                if (analyticsConnectorImpl != null) {
                    analyticsConnectorImpl.zza.b.c(z);
                } else {
                    throw new NullPointerException("null reference");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(String str) {
        return !str.isEmpty() && this.zzb.containsKey(str) && this.zzb.get(str) != null;
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || zzc.zzb(str2, bundle)) {
            this.zza.b.a(str, str2, bundle);
        }
    }

    public List<AnalyticsConnector$ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.zza.b.d(str, str2)) {
            arrayList.add(zzc.zzh(bundle));
        }
        return arrayList;
    }

    public int getMaxUserProperties(String str) {
        return this.zza.b.b(str);
    }

    public Map<String, Object> getUserProperties(boolean z) {
        return this.zza.b.c((String) null, (String) null, z);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        if (zzc.zza(str) && zzc.zzb(str2, bundle2) && zzc.zzf(str, str2, bundle2)) {
            zzc.zzm(str, str2, bundle2);
            this.zza.b.d(str, str2, bundle2);
        }
    }

    public AnalyticsConnector$AnalyticsConnectorHandle registerAnalyticsConnectorListener(final String str, AnalyticsConnector$AnalyticsConnectorListener analyticsConnector$AnalyticsConnectorListener) {
        if (analyticsConnector$AnalyticsConnectorListener == null) {
            throw new NullPointerException("null reference");
        } else if (!zzc.zza(str) || zzc(str)) {
            return null;
        } else {
            getNomorRekening getnomorrekening = this.zza;
            zza zze = "fiam".equals(str) ? new zze(getnomorrekening, analyticsConnector$AnalyticsConnectorListener) : ("crash".equals(str) || "clx".equals(str)) ? new zzg(getnomorrekening, analyticsConnector$AnalyticsConnectorListener) : null;
            if (zze == null) {
                return null;
            }
            this.zzb.put(str, zze);
            return new AnalyticsConnector$AnalyticsConnectorHandle() { // from class: com.google.firebase.analytics.connector.AnalyticsConnectorImpl.1
                @Override // com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorHandle
                public final void registerEventNames(Set<String> set) {
                    if (AnalyticsConnectorImpl.this.zzc(str) && str.equals("fiam") && set != null && !set.isEmpty()) {
                        AnalyticsConnectorImpl.this.zzb.get(str).zzb(set);
                    }
                }

                @Override // com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorHandle
                public final void unregister() {
                    if (AnalyticsConnectorImpl.this.zzc(str)) {
                        AnalyticsConnector$AnalyticsConnectorListener zza = AnalyticsConnectorImpl.this.zzb.get(str).zza();
                        if (zza != null) {
                            zza.onMessageTriggered(0, null);
                        }
                        AnalyticsConnectorImpl.this.zzb.remove(str);
                    }
                }

                @Override // com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorHandle
                public final void unregisterEventNames() {
                    if (AnalyticsConnectorImpl.this.zzc(str) && str.equals("fiam")) {
                        AnalyticsConnectorImpl.this.zzb.get(str).zzc();
                    }
                }
            };
        }
    }

    public void setConditionalUserProperty(AnalyticsConnector$ConditionalUserProperty analyticsConnector$ConditionalUserProperty) {
        if (zzc.zze(analyticsConnector$ConditionalUserProperty)) {
            getNomorRekening getnomorrekening = this.zza;
            getnomorrekening.b.e(zzc.zzg(analyticsConnector$ConditionalUserProperty));
        }
    }

    public void setUserProperty(String str, String str2, Object obj) {
        if (zzc.zza(str) && zzc.zzd(str, str2)) {
            this.zza.b.b(str, str2, obj, true);
        }
    }
}
