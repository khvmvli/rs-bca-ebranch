package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2-dex2jar.jar:o/TahapanBCADialog.class */
public final class TahapanBCADialog extends CrashlyticsReport.Session.User {
    private final String d;

    /* loaded from: classes2-dex2jar.jar:o/TahapanBCADialog$write.class */
    public static final class write extends CrashlyticsReport.Session.User.Builder {
        private String a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public final CrashlyticsReport.Session.User build() {
            String str = this.a == null ? " identifier" : "";
            if (str.isEmpty()) {
                return new TahapanBCADialog(this.a, (byte) 0);
            }
            StringBuilder sb = new StringBuilder("Missing required properties:");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public final CrashlyticsReport.Session.User.Builder setIdentifier(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    private TahapanBCADialog(String str) {
        this.d = str;
    }

    /* synthetic */ TahapanBCADialog(String str, byte b) {
        this(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.User) {
            return this.d.equals(((CrashlyticsReport.Session.User) obj).getIdentifier());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User
    public final String getIdentifier() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User{identifier=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
