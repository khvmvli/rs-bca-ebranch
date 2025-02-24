package com.google.firebase;

import android.text.TextUtils;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/FirebaseOptions$Builder.class */
public final class FirebaseOptions$Builder {
    private String apiKey;
    private String applicationId;
    private String databaseUrl;
    private String gaTrackingId;
    private String gcmSenderId;
    private String projectId;
    private String storageBucket;

    public FirebaseOptions$Builder() {
    }

    public FirebaseOptions$Builder(FirebaseOptions firebaseOptions) {
        this.applicationId = FirebaseOptions.access$000(firebaseOptions);
        this.apiKey = FirebaseOptions.access$100(firebaseOptions);
        this.databaseUrl = FirebaseOptions.access$200(firebaseOptions);
        this.gaTrackingId = FirebaseOptions.access$300(firebaseOptions);
        this.gcmSenderId = FirebaseOptions.access$400(firebaseOptions);
        this.storageBucket = FirebaseOptions.access$500(firebaseOptions);
        this.projectId = FirebaseOptions.access$600(firebaseOptions);
    }

    public final FirebaseOptions build() {
        return new FirebaseOptions(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId, (FirebaseOptions$5) null);
    }

    public final FirebaseOptions$Builder setApiKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.apiKey = str;
            return this;
        }
        throw new IllegalArgumentException("ApiKey must be set.");
    }

    public final FirebaseOptions$Builder setApplicationId(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.applicationId = str;
            return this;
        }
        throw new IllegalArgumentException("ApplicationId must be set.");
    }

    public final FirebaseOptions$Builder setDatabaseUrl(String str) {
        this.databaseUrl = str;
        return this;
    }

    public final FirebaseOptions$Builder setGaTrackingId(String str) {
        this.gaTrackingId = str;
        return this;
    }

    public final FirebaseOptions$Builder setGcmSenderId(String str) {
        this.gcmSenderId = str;
        return this;
    }

    public final FirebaseOptions$Builder setProjectId(String str) {
        this.projectId = str;
        return this;
    }

    public final FirebaseOptions$Builder setStorageBucket(String str) {
        this.storageBucket = str;
        return this;
    }
}
