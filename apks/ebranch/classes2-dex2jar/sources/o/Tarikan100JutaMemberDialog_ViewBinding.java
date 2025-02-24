package o;

import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
/* loaded from: classes2-dex2jar.jar:o/Tarikan100JutaMemberDialog_ViewBinding.class */
final class Tarikan100JutaMemberDialog_ViewBinding extends InstallationResponse {
    private final String a;
    private final TokenResult b;
    private final String c;
    private final String d;
    private final InstallationResponse.ResponseCode e;

    /* loaded from: classes2-dex2jar.jar:o/Tarikan100JutaMemberDialog_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends InstallationResponse.Builder {
        private TokenResult a;
        private String b;
        private String c;
        private String d;
        private InstallationResponse.ResponseCode e;

        public RemoteActionCompatParcelizer() {
        }

        private RemoteActionCompatParcelizer(InstallationResponse installationResponse) {
            this.c = installationResponse.getUri();
            this.b = installationResponse.getFid();
            this.d = installationResponse.getRefreshToken();
            this.a = installationResponse.getAuthToken();
            this.e = installationResponse.getResponseCode();
        }

        /* synthetic */ RemoteActionCompatParcelizer(InstallationResponse installationResponse, byte b) {
            this(installationResponse);
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final InstallationResponse build() {
            return new Tarikan100JutaMemberDialog_ViewBinding(this.c, this.b, this.d, this.a, this.e, (byte) 0);
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final InstallationResponse.Builder setAuthToken(TokenResult tokenResult) {
            this.a = tokenResult;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final InstallationResponse.Builder setFid(String str) {
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final InstallationResponse.Builder setRefreshToken(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final InstallationResponse.Builder setResponseCode(InstallationResponse.ResponseCode responseCode) {
            this.e = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final InstallationResponse.Builder setUri(String str) {
            this.c = str;
            return this;
        }
    }

    private Tarikan100JutaMemberDialog_ViewBinding(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.c = str;
        this.d = str2;
        this.a = str3;
        this.b = tokenResult;
        this.e = responseCode;
    }

    /* synthetic */ Tarikan100JutaMemberDialog_ViewBinding(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode, byte b) {
        this(str, str2, str3, tokenResult, responseCode);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.c;
        if (str != null ? str.equals(installationResponse.getUri()) : installationResponse.getUri() == null) {
            String str2 = this.d;
            if (str2 != null ? str2.equals(installationResponse.getFid()) : installationResponse.getFid() == null) {
                String str3 = this.a;
                if (str3 != null ? str3.equals(installationResponse.getRefreshToken()) : installationResponse.getRefreshToken() == null) {
                    TokenResult tokenResult = this.b;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.getAuthToken()) : installationResponse.getAuthToken() == null) {
                        InstallationResponse.ResponseCode responseCode = this.e;
                        return responseCode != null ? z : z;
                    }
                }
            }
        }
        z = false;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final TokenResult getAuthToken() {
        return this.b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String getFid() {
        return this.d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String getRefreshToken() {
        return this.a;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final InstallationResponse.ResponseCode getResponseCode() {
        return this.e;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String getUri() {
        return this.c;
    }

    public final int hashCode() {
        String str = this.c;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.d;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.a;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        TokenResult tokenResult = this.b;
        int hashCode4 = tokenResult == null ? 0 : tokenResult.hashCode();
        InstallationResponse.ResponseCode responseCode = this.e;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final InstallationResponse.Builder toBuilder() {
        return new RemoteActionCompatParcelizer(this, (byte) 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.c);
        sb.append(", fid=");
        sb.append(this.d);
        sb.append(", refreshToken=");
        sb.append(this.a);
        sb.append(", authToken=");
        sb.append(this.b);
        sb.append(", responseCode=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
