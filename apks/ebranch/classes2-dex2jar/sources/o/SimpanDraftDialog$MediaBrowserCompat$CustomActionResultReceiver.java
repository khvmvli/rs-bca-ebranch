package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2-dex2jar.jar:o/SimpanDraftDialog$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class SimpanDraftDialog$MediaBrowserCompat$CustomActionResultReceiver extends CrashlyticsReport.CustomAttribute.Builder {
    private String b;
    private String c;

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
    public final CrashlyticsReport.CustomAttribute build() {
        String str = this.c == null ? " key" : "";
        String str2 = str;
        if (this.b == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" value");
            str2 = sb.toString();
        }
        if (str2.isEmpty()) {
            return new SimpanDraftDialog(this.c, this.b, (byte) 0);
        }
        StringBuilder sb2 = new StringBuilder("Missing required properties:");
        sb2.append(str2);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
    public final CrashlyticsReport.CustomAttribute.Builder setKey(String str) {
        if (str != null) {
            this.c = str;
            return this;
        }
        throw new NullPointerException("Null key");
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
    public final CrashlyticsReport.CustomAttribute.Builder setValue(String str) {
        if (str != null) {
            this.b = str;
            return this;
        }
        throw new NullPointerException("Null value");
    }
}
