package o;

import com.google.firebase.installations.InstallationTokenResult;
/* loaded from: classes2-dex2jar.jar:o/TanggalDialog.class */
final class TanggalDialog extends InstallationTokenResult {
    private final long a;
    private final long b;
    private final String c;

    /* loaded from: classes2-dex2jar.jar:o/TanggalDialog$read.class */
    public static final class read extends InstallationTokenResult.Builder {
        private String b;
        private Long c;
        private Long e;

        public read() {
        }

        private read(InstallationTokenResult installationTokenResult) {
            this.b = installationTokenResult.getToken();
            this.e = Long.valueOf(installationTokenResult.getTokenExpirationTimestamp());
            this.c = Long.valueOf(installationTokenResult.getTokenCreationTimestamp());
        }

        /* synthetic */ read(InstallationTokenResult installationTokenResult, byte b) {
            this(installationTokenResult);
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public final InstallationTokenResult build() {
            String str = this.b == null ? " token" : "";
            String str2 = str;
            if (this.e == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" tokenExpirationTimestamp");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" tokenCreationTimestamp");
                str3 = sb2.toString();
            }
            if (str3.isEmpty()) {
                return new TanggalDialog(this.b, this.e.longValue(), this.c.longValue(), (byte) 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str3);
            throw new IllegalStateException(sb3.toString());
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public final InstallationTokenResult.Builder setToken(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public final InstallationTokenResult.Builder setTokenCreationTimestamp(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public final InstallationTokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    private TanggalDialog(String str, long j, long j2) {
        this.c = str;
        this.a = j;
        this.b = j2;
    }

    /* synthetic */ TanggalDialog(String str, long j, long j2, byte b) {
        this(str, j, j2);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationTokenResult)) {
            return false;
        }
        InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
        if (!(this.c.equals(installationTokenResult.getToken()) && this.a == installationTokenResult.getTokenExpirationTimestamp() && this.b == installationTokenResult.getTokenCreationTimestamp())) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final String getToken() {
        return this.c;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final long getTokenCreationTimestamp() {
        return this.b;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final long getTokenExpirationTimestamp() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        long j = this.a;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.b;
        return ((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final InstallationTokenResult.Builder toBuilder() {
        return new read(this, (byte) 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.c);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.a);
        sb.append(", tokenCreationTimestamp=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
