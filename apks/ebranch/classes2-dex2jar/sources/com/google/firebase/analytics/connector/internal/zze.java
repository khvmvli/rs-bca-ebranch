package com.google.firebase.analytics.connector.internal;

import com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorListener;
import java.util.HashSet;
import java.util.Set;
import o.PilihJenisIdentitasDialog;
import o.getNomorRekening;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/analytics/connector/internal/zze.class */
public final class zze implements zza {
    public final Set<String> zza = new HashSet();
    private final AnalyticsConnector$AnalyticsConnectorListener zzb;
    private final getNomorRekening zzc;
    private final PilihJenisIdentitasDialog zzd;

    /* JADX WARN: Type inference failed for: r0v3, types: [o.PilihJenisIdentitasDialog, o.realmSet$SourceAccountOwnerType] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public zze(o.getNomorRekening r5, com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorListener r6) {
        /*
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r6
            r0.zzb = r1
            r0 = r4
            r1 = r5
            r0.zzc = r1
            o.PilihJenisIdentitasDialog r0 = new o.PilihJenisIdentitasDialog
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r6 = r0
            r0 = r4
            r1 = r6
            r0.zzd = r1
            r0 = r5
            o.realmGet$emergencyContactOfficeExt r0 = r0.b
            r1 = r6
            r0.c(r1)
            r0 = r4
            java.util.HashSet r1 = new java.util.HashSet
            r2 = r1
            r2.<init>()
            r0.zza = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.connector.internal.zze.<init>(o.getNomorRekening, com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorListener):void");
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector$AnalyticsConnectorListener zza() {
        return this.zzb;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(Set<String> set) {
        this.zza.clear();
        Set<String> set2 = this.zza;
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (hashSet.size() >= 50) {
                break;
            } else if (zzc.zzj(str) && zzc.zzi(str)) {
                String zzl = zzc.zzl(str);
                if (zzl != null) {
                    hashSet.add(zzl);
                } else {
                    throw new NullPointerException("null reference");
                }
            }
        }
        set2.addAll(hashSet);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
        this.zza.clear();
    }
}
