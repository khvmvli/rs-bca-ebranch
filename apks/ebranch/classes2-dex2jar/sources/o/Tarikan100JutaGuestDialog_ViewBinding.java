package o;

import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
/* loaded from: classes2-dex2jar.jar:o/Tarikan100JutaGuestDialog_ViewBinding.class */
final class Tarikan100JutaGuestDialog_ViewBinding extends PersistedInstallationEntry {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final long e;
    private final PersistedInstallation.RegistrationStatus g;
    private final long j;

    /* loaded from: classes2-dex2jar.jar:o/Tarikan100JutaGuestDialog_ViewBinding$write.class */
    public static final class write extends PersistedInstallationEntry.Builder {
        private Long a;
        private String b;
        private String c;
        private String d;
        private String e;
        private Long f;
        private PersistedInstallation.RegistrationStatus h;

        public write() {
        }

        private write(PersistedInstallationEntry persistedInstallationEntry) {
            this.d = persistedInstallationEntry.getFirebaseInstallationId();
            this.h = persistedInstallationEntry.getRegistrationStatus();
            this.b = persistedInstallationEntry.getAuthToken();
            this.e = persistedInstallationEntry.getRefreshToken();
            this.a = Long.valueOf(persistedInstallationEntry.getExpiresInSecs());
            this.f = Long.valueOf(persistedInstallationEntry.getTokenCreationEpochInSecs());
            this.c = persistedInstallationEntry.getFisError();
        }

        /* synthetic */ write(PersistedInstallationEntry persistedInstallationEntry, byte b) {
            this(persistedInstallationEntry);
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry build() {
            String str = this.h == null ? " registrationStatus" : "";
            String str2 = str;
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" expiresInSecs");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.f == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" tokenCreationEpochInSecs");
                str3 = sb2.toString();
            }
            if (str3.isEmpty()) {
                return new Tarikan100JutaGuestDialog_ViewBinding(this.d, this.h, this.b, this.e, this.a.longValue(), this.f.longValue(), this.c, (byte) 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str3);
            throw new IllegalStateException(sb3.toString());
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder setAuthToken(String str) {
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder setExpiresInSecs(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder setFirebaseInstallationId(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder setFisError(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder setRefreshToken(String str) {
            this.e = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder setRegistrationStatus(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus != null) {
                this.h = registrationStatus;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder setTokenCreationEpochInSecs(long j) {
            this.f = Long.valueOf(j);
            return this;
        }
    }

    private Tarikan100JutaGuestDialog_ViewBinding(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.b = str;
        this.g = registrationStatus;
        this.a = str2;
        this.d = str3;
        this.e = j;
        this.j = j2;
        this.c = str4;
    }

    /* synthetic */ Tarikan100JutaGuestDialog_ViewBinding(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4, byte b) {
        this(str, registrationStatus, str2, str3, j, j2, str4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        if ((r0 = r5.d) != null) goto L_0x0072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r5.e != r0.getExpiresInSecs()) goto L_0x00b3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (r5.j != r0.getTokenCreationEpochInSecs()) goto L_0x00b3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
        if ((r0 = r5.c) != null) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            r7 = r0
            r0 = r6
            r1 = r5
            if (r0 != r1) goto L_0x0009
            r0 = 1
            return r0
        L_0x0009:
            r0 = r6
            boolean r0 = r0 instanceof com.google.firebase.installations.local.PersistedInstallationEntry
            if (r0 == 0) goto L_0x00b7
            r0 = r6
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = (com.google.firebase.installations.local.PersistedInstallationEntry) r0
            r6 = r0
            r0 = r5
            java.lang.String r0 = r0.b
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L_0x0028
            r0 = r6
            java.lang.String r0 = r0.getFirebaseInstallationId()
            if (r0 != 0) goto L_0x00b3
            goto L_0x0033
        L_0x0028:
            r0 = r8
            r1 = r6
            java.lang.String r1 = r1.getFirebaseInstallationId()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
        L_0x0033:
            r0 = r5
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = r0.g
            r1 = r6
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = r1.getRegistrationStatus()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r0 = r5
            java.lang.String r0 = r0.a
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L_0x0054
            r0 = r6
            java.lang.String r0 = r0.getAuthToken()
            if (r0 != 0) goto L_0x00b3
            goto L_0x005f
        L_0x0054:
            r0 = r8
            r1 = r6
            java.lang.String r1 = r1.getAuthToken()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
        L_0x005f:
            r0 = r5
            java.lang.String r0 = r0.d
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L_0x0072
            r0 = r6
            java.lang.String r0 = r0.getRefreshToken()
            if (r0 != 0) goto L_0x00b3
            goto L_0x007d
        L_0x0072:
            r0 = r8
            r1 = r6
            java.lang.String r1 = r1.getRefreshToken()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
        L_0x007d:
            r0 = r5
            long r0 = r0.e
            r1 = r6
            long r1 = r1.getExpiresInSecs()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b3
            r0 = r5
            long r0 = r0.j
            r1 = r6
            long r1 = r1.getTokenCreationEpochInSecs()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b3
            r0 = r5
            java.lang.String r0 = r0.c
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L_0x00a8
            r0 = r6
            java.lang.String r0 = r0.getFisError()
            if (r0 != 0) goto L_0x00b3
            goto L_0x00b5
        L_0x00a8:
            r0 = r8
            r1 = r6
            java.lang.String r1 = r1.getFisError()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b5
        L_0x00b3:
            r0 = 0
            r7 = r0
        L_0x00b5:
            r0 = r7
            return r0
        L_0x00b7:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Tarikan100JutaGuestDialog_ViewBinding.equals(java.lang.Object):boolean");
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String getAuthToken() {
        return this.a;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final long getExpiresInSecs() {
        return this.e;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String getFirebaseInstallationId() {
        return this.b;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String getFisError() {
        return this.c;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String getRefreshToken() {
        return this.d;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final PersistedInstallation.RegistrationStatus getRegistrationStatus() {
        return this.g;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final long getTokenCreationEpochInSecs() {
        return this.j;
    }

    public final int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.g.hashCode();
        String str2 = this.a;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.d;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        long j = this.e;
        int i2 = (int) (j ^ (j >>> 32));
        long j2 = this.j;
        int i3 = (int) (j2 ^ (j2 >>> 32));
        String str4 = this.c;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final PersistedInstallationEntry.Builder toBuilder() {
        return new write(this, (byte) 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", registrationStatus=");
        sb.append(this.g);
        sb.append(", authToken=");
        sb.append(this.a);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.j);
        sb.append(", fisError=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
