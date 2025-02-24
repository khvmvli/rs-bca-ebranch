package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2-dex2jar.jar:o/StatusTempatTinggalDialog$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class StatusTempatTinggalDialog$MediaBrowserCompat$CustomActionResultReceiver extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {
    private Long b;
    private Long c;
    private String d;
    private String e;

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
    public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage build() {
        String str = this.c == null ? " baseAddress" : "";
        String str2 = str;
        if (this.b == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" size");
            str2 = sb.toString();
        }
        String str3 = str2;
        if (this.e == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" name");
            str3 = sb2.toString();
        }
        if (str3.isEmpty()) {
            return new StatusTempatTinggalDialog(this.c.longValue(), this.b.longValue(), this.e, this.d, (byte) 0);
        }
        StringBuilder sb3 = new StringBuilder("Missing required properties:");
        sb3.append(str3);
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
    public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setBaseAddress(long j) {
        this.c = Long.valueOf(j);
        return this;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
    public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setName(String str) {
        if (str != null) {
            this.e = str;
            return this;
        }
        throw new NullPointerException("Null name");
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
    public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setSize(long j) {
        this.b = Long.valueOf(j);
        return this;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
    public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setUuid(String str) {
        this.d = str;
        return this;
    }
}
