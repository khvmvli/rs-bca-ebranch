package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2-dex2jar.jar:o/SuratPernyataanBNDialog_ViewBinding.class */
public final class SuratPernyataanBNDialog_ViewBinding extends CrashlyticsReport.Session.Event.Log {
    private final String b;

    /* loaded from: classes2-dex2jar.jar:o/SuratPernyataanBNDialog_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends CrashlyticsReport.Session.Event.Log.Builder {
        private String c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public final CrashlyticsReport.Session.Event.Log build() {
            String str = this.c == null ? " content" : "";
            if (str.isEmpty()) {
                return new SuratPernyataanBNDialog_ViewBinding(this.c, (byte) 0);
            }
            StringBuilder sb = new StringBuilder("Missing required properties:");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public final CrashlyticsReport.Session.Event.Log.Builder setContent(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    private SuratPernyataanBNDialog_ViewBinding(String str) {
        this.b = str;
    }

    /* synthetic */ SuratPernyataanBNDialog_ViewBinding(String str, byte b) {
        this(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Log) {
            return this.b.equals(((CrashlyticsReport.Session.Event.Log) obj).getContent());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log
    public final String getContent() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Log{content=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
