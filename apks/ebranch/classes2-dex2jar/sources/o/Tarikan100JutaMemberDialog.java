package o;

import com.google.firebase.installations.remote.TokenResult;
/* loaded from: classes2-dex2jar.jar:o/Tarikan100JutaMemberDialog.class */
final class Tarikan100JutaMemberDialog extends TokenResult {
    private final TokenResult.ResponseCode a;
    private final String c;
    private final long d;

    /* loaded from: classes2-dex2jar.jar:o/Tarikan100JutaMemberDialog$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends TokenResult.Builder {
        private String a;
        private TokenResult.ResponseCode c;
        private Long d;

        public RemoteActionCompatParcelizer() {
        }

        private RemoteActionCompatParcelizer(TokenResult tokenResult) {
            this.a = tokenResult.getToken();
            this.d = Long.valueOf(tokenResult.getTokenExpirationTimestamp());
            this.c = tokenResult.getResponseCode();
        }

        /* synthetic */ RemoteActionCompatParcelizer(TokenResult tokenResult, byte b) {
            this(tokenResult);
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public final TokenResult build() {
            String str = this.d == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new Tarikan100JutaMemberDialog(this.a, this.d.longValue(), this.c, (byte) 0);
            }
            StringBuilder sb = new StringBuilder("Missing required properties:");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public final TokenResult.Builder setResponseCode(TokenResult.ResponseCode responseCode) {
            this.c = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public final TokenResult.Builder setToken(String str) {
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public final TokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.d = Long.valueOf(j);
            return this;
        }
    }

    private Tarikan100JutaMemberDialog(String str, long j, TokenResult.ResponseCode responseCode) {
        this.c = str;
        this.d = j;
        this.a = responseCode;
    }

    /* synthetic */ Tarikan100JutaMemberDialog(String str, long j, TokenResult.ResponseCode responseCode, byte b) {
        this(str, j, responseCode);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.c;
        if (str != null ? str.equals(tokenResult.getToken()) : tokenResult.getToken() == null) {
            if (this.d == tokenResult.getTokenExpirationTimestamp()) {
                if ((r0 = this.a) == null) {
                }
            }
        }
        z = false;
        return z;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final TokenResult.ResponseCode getResponseCode() {
        return this.a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final String getToken() {
        return this.c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final long getTokenExpirationTimestamp() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.c;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i2 = (int) (j ^ (j >>> 32));
        TokenResult.ResponseCode responseCode = this.a;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final TokenResult.Builder toBuilder() {
        return new RemoteActionCompatParcelizer(this, (byte) 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.c);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.d);
        sb.append(", responseCode=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
