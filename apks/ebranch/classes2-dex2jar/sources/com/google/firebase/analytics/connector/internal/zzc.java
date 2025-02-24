package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.connector.AnalyticsConnector$ConditionalUserProperty;
import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.Tarikan$$Parcelable;
import o.getNoHpKontakPengirim;
import o.realmSet$SenderEmail;
import o.realmSet$SenderName;
import o.realmSet$SenderPhone;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/analytics/connector/internal/zzc.class */
public final class zzc {
    private static final Set<String> zza = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.Event.CAMPAIGN_DETAILS, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
    private static final List<String> zzb = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    private static final List<String> zzc = Arrays.asList("auto", "app", "am");
    private static final List<String> zzd = Arrays.asList("_r", "_dbg");
    private static final List<String> zze = Arrays.asList((String[]) getNoHpKontakPengirim.d(new String[][]{realmSet$SenderPhone.e, realmSet$SenderPhone.c}));
    private static final List<String> zzf = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static boolean zza(String str) {
        return !zzc.contains(str);
    }

    public static boolean zzb(String str, Bundle bundle) {
        if (zzb.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String str2 : zzd) {
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzc(String str) {
        return !zza.contains(str);
    }

    public static boolean zzd(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(Constants.ScionAnalytics.ORIGIN_FCM) || str.equals("frc");
        }
        if (Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION.equals(str2)) {
            return str.equals(Constants.ScionAnalytics.ORIGIN_FCM) || str.equals("fiam");
        }
        if (zze.contains(str2)) {
            return false;
        }
        for (String str3 : zzf) {
            if (str2.matches(str3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean zze(AnalyticsConnector$ConditionalUserProperty analyticsConnector$ConditionalUserProperty) {
        String str;
        if (analyticsConnector$ConditionalUserProperty == null || (str = analyticsConnector$ConditionalUserProperty.origin) == null || str.isEmpty()) {
            return false;
        }
        if ((analyticsConnector$ConditionalUserProperty.value != null && Tarikan$$Parcelable.b(analyticsConnector$ConditionalUserProperty.value) == null) || !zza(str) || !zzd(str, analyticsConnector$ConditionalUserProperty.name)) {
            return false;
        }
        if (analyticsConnector$ConditionalUserProperty.expiredEventName != null && (!zzb(analyticsConnector$ConditionalUserProperty.expiredEventName, analyticsConnector$ConditionalUserProperty.expiredEventParams) || !zzf(str, analyticsConnector$ConditionalUserProperty.expiredEventName, analyticsConnector$ConditionalUserProperty.expiredEventParams))) {
            return false;
        }
        if (analyticsConnector$ConditionalUserProperty.triggeredEventName != null && (!zzb(analyticsConnector$ConditionalUserProperty.triggeredEventName, analyticsConnector$ConditionalUserProperty.triggeredEventParams) || !zzf(str, analyticsConnector$ConditionalUserProperty.triggeredEventName, analyticsConnector$ConditionalUserProperty.triggeredEventParams))) {
            return false;
        }
        if (analyticsConnector$ConditionalUserProperty.timedOutEventName != null) {
            return zzb(analyticsConnector$ConditionalUserProperty.timedOutEventName, analyticsConnector$ConditionalUserProperty.timedOutEventParams) && zzf(str, analyticsConnector$ConditionalUserProperty.timedOutEventName, analyticsConnector$ConditionalUserProperty.timedOutEventParams);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static boolean zzf(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
        /*
            java.lang.String r0 = "_cmp"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x000b
            r0 = 1
            return r0
        L_0x000b:
            r0 = r4
            boolean r0 = zza(r0)
            if (r0 != 0) goto L_0x0014
            r0 = 0
            return r0
        L_0x0014:
            r0 = r6
            if (r0 != 0) goto L_0x001a
            r0 = 0
            return r0
        L_0x001a:
            java.util.List<java.lang.String> r0 = com.google.firebase.analytics.connector.internal.zzc.zzd
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L_0x0023:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x003e
            r0 = r6
            r1 = r5
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0023
            r0 = 0
            return r0
        L_0x003e:
            r0 = r4
            int r0 = r0.hashCode()
            r7 = r0
            r0 = r7
            r1 = 101200(0x18b50, float:1.41811E-40)
            if (r0 == r1) goto L_0x0071
            r0 = r7
            r1 = 101230(0x18b6e, float:1.41853E-40)
            if (r0 == r1) goto L_0x0063
            r0 = r7
            r1 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r0 != r1) goto L_0x007f
            r0 = r4
            java.lang.String r1 = "fiam"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007f
            r0 = 2
            r7 = r0
            goto L_0x0081
        L_0x0063:
            r0 = r4
            java.lang.String r1 = "fdl"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007f
            r0 = 1
            r7 = r0
            goto L_0x0081
        L_0x0071:
            r0 = r4
            java.lang.String r1 = "fcm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007f
            r0 = 0
            r7 = r0
            goto L_0x0081
        L_0x007f:
            r0 = -1
            r7 = r0
        L_0x0081:
            r0 = r7
            if (r0 == 0) goto L_0x00a5
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L_0x009b
            r0 = r7
            r1 = 2
            if (r0 == r1) goto L_0x0091
            r0 = 0
            return r0
        L_0x0091:
            r0 = r6
            java.lang.String r1 = "_cis"
            java.lang.String r2 = "fiam_integration"
            r0.putString(r1, r2)
            r0 = 1
            return r0
        L_0x009b:
            r0 = r6
            java.lang.String r1 = "_cis"
            java.lang.String r2 = "fdl_integration"
            r0.putString(r1, r2)
            r0 = 1
            return r0
        L_0x00a5:
            r0 = r6
            java.lang.String r1 = "_cis"
            java.lang.String r2 = "fcm_integration"
            r0.putString(r1, r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.connector.internal.zzc.zzf(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }

    public static Bundle zzg(AnalyticsConnector$ConditionalUserProperty analyticsConnector$ConditionalUserProperty) {
        Bundle bundle = new Bundle();
        if (analyticsConnector$ConditionalUserProperty.origin != null) {
            bundle.putString(FirebaseAnalytics.Param.ORIGIN, analyticsConnector$ConditionalUserProperty.origin);
        }
        if (analyticsConnector$ConditionalUserProperty.name != null) {
            bundle.putString("name", analyticsConnector$ConditionalUserProperty.name);
        }
        if (analyticsConnector$ConditionalUserProperty.value != null) {
            realmSet$SenderEmail.d(bundle, analyticsConnector$ConditionalUserProperty.value);
        }
        if (analyticsConnector$ConditionalUserProperty.triggerEventName != null) {
            bundle.putString("trigger_event_name", analyticsConnector$ConditionalUserProperty.triggerEventName);
        }
        bundle.putLong("trigger_timeout", analyticsConnector$ConditionalUserProperty.triggerTimeout);
        if (analyticsConnector$ConditionalUserProperty.timedOutEventName != null) {
            bundle.putString("timed_out_event_name", analyticsConnector$ConditionalUserProperty.timedOutEventName);
        }
        if (analyticsConnector$ConditionalUserProperty.timedOutEventParams != null) {
            bundle.putBundle("timed_out_event_params", analyticsConnector$ConditionalUserProperty.timedOutEventParams);
        }
        if (analyticsConnector$ConditionalUserProperty.triggeredEventName != null) {
            bundle.putString("triggered_event_name", analyticsConnector$ConditionalUserProperty.triggeredEventName);
        }
        if (analyticsConnector$ConditionalUserProperty.triggeredEventParams != null) {
            bundle.putBundle("triggered_event_params", analyticsConnector$ConditionalUserProperty.triggeredEventParams);
        }
        bundle.putLong("time_to_live", analyticsConnector$ConditionalUserProperty.timeToLive);
        if (analyticsConnector$ConditionalUserProperty.expiredEventName != null) {
            bundle.putString("expired_event_name", analyticsConnector$ConditionalUserProperty.expiredEventName);
        }
        if (analyticsConnector$ConditionalUserProperty.expiredEventParams != null) {
            bundle.putBundle("expired_event_params", analyticsConnector$ConditionalUserProperty.expiredEventParams);
        }
        bundle.putLong("creation_timestamp", analyticsConnector$ConditionalUserProperty.creationTimestamp);
        bundle.putBoolean("active", analyticsConnector$ConditionalUserProperty.active);
        bundle.putLong("triggered_timestamp", analyticsConnector$ConditionalUserProperty.triggeredTimestamp);
        return bundle;
    }

    public static AnalyticsConnector$ConditionalUserProperty zzh(Bundle bundle) {
        if (bundle != null) {
            AnalyticsConnector$ConditionalUserProperty analyticsConnector$ConditionalUserProperty = new AnalyticsConnector$ConditionalUserProperty();
            String str = (String) realmSet$SenderEmail.a(bundle, FirebaseAnalytics.Param.ORIGIN, String.class, null);
            if (str != null) {
                analyticsConnector$ConditionalUserProperty.origin = str;
                String str2 = (String) realmSet$SenderEmail.a(bundle, "name", String.class, null);
                if (str2 != null) {
                    analyticsConnector$ConditionalUserProperty.name = str2;
                    analyticsConnector$ConditionalUserProperty.value = realmSet$SenderEmail.a(bundle, FirebaseAnalytics.Param.VALUE, Object.class, null);
                    analyticsConnector$ConditionalUserProperty.triggerEventName = (String) realmSet$SenderEmail.a(bundle, "trigger_event_name", String.class, null);
                    analyticsConnector$ConditionalUserProperty.triggerTimeout = ((Long) realmSet$SenderEmail.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
                    analyticsConnector$ConditionalUserProperty.timedOutEventName = (String) realmSet$SenderEmail.a(bundle, "timed_out_event_name", String.class, null);
                    analyticsConnector$ConditionalUserProperty.timedOutEventParams = (Bundle) realmSet$SenderEmail.a(bundle, "timed_out_event_params", Bundle.class, null);
                    analyticsConnector$ConditionalUserProperty.triggeredEventName = (String) realmSet$SenderEmail.a(bundle, "triggered_event_name", String.class, null);
                    analyticsConnector$ConditionalUserProperty.triggeredEventParams = (Bundle) realmSet$SenderEmail.a(bundle, "triggered_event_params", Bundle.class, null);
                    analyticsConnector$ConditionalUserProperty.timeToLive = ((Long) realmSet$SenderEmail.a(bundle, "time_to_live", Long.class, 0L)).longValue();
                    analyticsConnector$ConditionalUserProperty.expiredEventName = (String) realmSet$SenderEmail.a(bundle, "expired_event_name", String.class, null);
                    analyticsConnector$ConditionalUserProperty.expiredEventParams = (Bundle) realmSet$SenderEmail.a(bundle, "expired_event_params", Bundle.class, null);
                    analyticsConnector$ConditionalUserProperty.active = ((Boolean) realmSet$SenderEmail.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
                    analyticsConnector$ConditionalUserProperty.creationTimestamp = ((Long) realmSet$SenderEmail.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
                    analyticsConnector$ConditionalUserProperty.triggeredTimestamp = ((Long) realmSet$SenderEmail.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
                    return analyticsConnector$ConditionalUserProperty;
                }
                throw new NullPointerException("null reference");
            }
            throw new NullPointerException("null reference");
        }
        throw new NullPointerException("null reference");
    }

    public static boolean zzi(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static boolean zzj(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static String zzk(String str) {
        String a = realmSet$SenderName.a(str);
        return a != null ? a : str;
    }

    public static String zzl(String str) {
        String c = realmSet$SenderName.c(str);
        return c != null ? c : str;
    }

    public static void zzm(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }
}
