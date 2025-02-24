package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;
/* loaded from: classes2-dex2jar.jar:o/StatusTempatTinggalDialog.class */
public final class StatusTempatTinggalDialog extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage {
    private final long a;
    private final long b;
    private final String c;
    private final String d;

    private StatusTempatTinggalDialog(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.d = str;
        this.c = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ StatusTempatTinggalDialog(long j, long j2, String str, String str2, byte b) {
        this(j, j2, str, str2);
    }

    public final boolean equals(Object obj) {
        String str;
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.BinaryImage)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
        if (this.a != binaryImage.getBaseAddress() || this.b != binaryImage.getSize() || !this.d.equals(binaryImage.getName()) || ((str = this.c) != null ? !str.equals(binaryImage.getUuid()) : binaryImage.getUuid() != null)) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public final long getBaseAddress() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public final String getName() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public final long getSize() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @Encodable.Ignore
    public final String getUuid() {
        return this.c;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.b;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        int hashCode = this.d.hashCode();
        String str = this.c;
        return ((((i2 ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ hashCode) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", uuid=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
