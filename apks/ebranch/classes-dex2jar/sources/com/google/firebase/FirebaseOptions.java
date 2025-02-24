package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import o.setFlagIB;
import o.setFotoNpwp;
/* loaded from: classes-dex2jar.jar:com/google/firebase/FirebaseOptions.class */
public final class FirebaseOptions {
    private static final String API_KEY_RESOURCE_NAME = "google_api_key";
    private static final String APP_ID_RESOURCE_NAME = "google_app_id";
    private static final String DATABASE_URL_RESOURCE_NAME = "firebase_database_url";
    private static final String GA_TRACKING_ID_RESOURCE_NAME = "ga_trackingId";
    private static final String GCM_SENDER_ID_RESOURCE_NAME = "gcm_defaultSenderId";
    private static final String PROJECT_ID_RESOURCE_NAME = "project_id";
    private static final String STORAGE_BUCKET_RESOURCE_NAME = "google_storage_bucket";
    private final String apiKey;
    private final String applicationId;
    private final String databaseUrl;
    private final String gaTrackingId;
    private final String gcmSenderId;
    private final String projectId;
    private final String storageBucket;

    private FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (true ^ (str == null || str.trim().isEmpty())) {
            this.applicationId = str;
            this.apiKey = str2;
            this.databaseUrl = str3;
            this.gaTrackingId = str4;
            this.gcmSenderId = str5;
            this.storageBucket = str6;
            this.projectId = str7;
            return;
        }
        throw new IllegalStateException("ApplicationId must be set.");
    }

    public static FirebaseOptions fromResource(Context context) {
        setFotoNpwp setfotonpwp = new setFotoNpwp(context);
        String a = setfotonpwp.a(APP_ID_RESOURCE_NAME);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new FirebaseOptions(a, setfotonpwp.a(API_KEY_RESOURCE_NAME), setfotonpwp.a(DATABASE_URL_RESOURCE_NAME), setfotonpwp.a(GA_TRACKING_ID_RESOURCE_NAME), setfotonpwp.a(GCM_SENDER_ID_RESOURCE_NAME), setfotonpwp.a(STORAGE_BUCKET_RESOURCE_NAME), setfotonpwp.a(PROJECT_ID_RESOURCE_NAME));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        String str = this.applicationId;
        String str2 = firebaseOptions.applicationId;
        boolean z = false;
        if (str == str2 || (str != null && str.equals(str2))) {
            String str3 = this.apiKey;
            String str4 = firebaseOptions.apiKey;
            z = false;
            if (str3 == str4 || (str3 != null && str3.equals(str4))) {
                String str5 = this.databaseUrl;
                String str6 = firebaseOptions.databaseUrl;
                z = false;
                if (str5 == str6 || (str5 != null && str5.equals(str6))) {
                    String str7 = this.gaTrackingId;
                    String str8 = firebaseOptions.gaTrackingId;
                    z = false;
                    if (str7 == str8 || (str7 != null && str7.equals(str8))) {
                        String str9 = this.gcmSenderId;
                        String str10 = firebaseOptions.gcmSenderId;
                        z = false;
                        if (str9 == str10 || (str9 != null && str9.equals(str10))) {
                            String str11 = this.storageBucket;
                            String str12 = firebaseOptions.storageBucket;
                            z = false;
                            if (str11 == str12 || (str11 != null && str11.equals(str12))) {
                                String str13 = this.projectId;
                                String str14 = firebaseOptions.projectId;
                                z = false;
                                if (str13 == str14 || (str13 != null && str13.equals(str14))) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getDatabaseUrl() {
        return this.databaseUrl;
    }

    public final String getGaTrackingId() {
        return this.gaTrackingId;
    }

    public final String getGcmSenderId() {
        return this.gcmSenderId;
    }

    public final String getProjectId() {
        return this.projectId;
    }

    public final String getStorageBucket() {
        return this.storageBucket;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId});
    }

    public final String toString() {
        return new setFlagIB.IconCompatParcelizer(this).b("applicationId", this.applicationId).b("apiKey", this.apiKey).b("databaseUrl", this.databaseUrl).b("gcmSenderId", this.gcmSenderId).b("storageBucket", this.storageBucket).b("projectId", this.projectId).toString();
    }
}
