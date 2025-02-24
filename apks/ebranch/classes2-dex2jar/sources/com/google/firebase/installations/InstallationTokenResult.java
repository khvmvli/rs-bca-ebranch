package com.google.firebase.installations;

import o.TanggalDialog;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/installations/InstallationTokenResult.class */
public abstract class InstallationTokenResult {

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/installations/InstallationTokenResult$Builder.class */
    public static abstract class Builder {
        public abstract InstallationTokenResult build();

        public abstract Builder setToken(String str);

        public abstract Builder setTokenCreationTimestamp(long j);

        public abstract Builder setTokenExpirationTimestamp(long j);
    }

    public static Builder builder() {
        return new TanggalDialog.read();
    }

    public abstract String getToken();

    public abstract long getTokenCreationTimestamp();

    public abstract long getTokenExpirationTimestamp();

    public abstract Builder toBuilder();
}
