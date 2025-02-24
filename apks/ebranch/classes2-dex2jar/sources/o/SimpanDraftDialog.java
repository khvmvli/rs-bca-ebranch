package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2-dex2jar.jar:o/SimpanDraftDialog.class */
public final class SimpanDraftDialog extends CrashlyticsReport.CustomAttribute {
    private final String a;
    private final String c;

    private SimpanDraftDialog(String str, String str2) {
        this.a = str;
        this.c = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ SimpanDraftDialog(String str, String str2, byte b) {
        this(str, str2);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.CustomAttribute)) {
            return false;
        }
        CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
        if (!this.a.equals(customAttribute.getKey()) || !this.c.equals(customAttribute.getValue())) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    public final String getKey() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    public final String getValue() {
        return this.c;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
