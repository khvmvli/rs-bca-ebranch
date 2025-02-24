package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;
/* loaded from: classes2-dex2jar.jar:o/StatusNPWPDialog_ViewBinding.class */
public final class StatusNPWPDialog_ViewBinding extends CrashlyticsReport.FilesPayload.File {
    private final byte[] c;
    private final String d;

    /* loaded from: classes2-dex2jar.jar:o/StatusNPWPDialog_ViewBinding$write.class */
    public static final class write extends CrashlyticsReport.FilesPayload.File.Builder {
        private String b;
        private byte[] d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public final CrashlyticsReport.FilesPayload.File build() {
            String str = this.b == null ? " filename" : "";
            String str2 = str;
            if (this.d == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" contents");
                str2 = sb.toString();
            }
            if (str2.isEmpty()) {
                return new StatusNPWPDialog_ViewBinding(this.b, this.d, (byte) 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str2);
            throw new IllegalStateException(sb2.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public final CrashlyticsReport.FilesPayload.File.Builder setContents(byte[] bArr) {
            if (bArr != null) {
                this.d = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public final CrashlyticsReport.FilesPayload.File.Builder setFilename(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    private StatusNPWPDialog_ViewBinding(String str, byte[] bArr) {
        this.d = str;
        this.c = bArr;
    }

    /* synthetic */ StatusNPWPDialog_ViewBinding(String str, byte[] bArr, byte b) {
        this(str, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (java.util.Arrays.equals(r3.c, r0 instanceof o.StatusNPWPDialog_ViewBinding ? ((o.StatusNPWPDialog_ViewBinding) r0).c : r0.getContents()) == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = r3
            if (r0 != r1) goto L_0x0009
            r0 = 1
            return r0
        L_0x0009:
            r0 = r4
            boolean r0 = r0 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
            if (r0 == 0) goto L_0x004b
            r0 = r4
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File r0 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File) r0
            r4 = r0
            r0 = r3
            java.lang.String r0 = r0.d
            r1 = r4
            java.lang.String r1 = r1.getFilename()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0047
            r0 = r3
            byte[] r0 = r0.c
            r6 = r0
            r0 = r4
            boolean r0 = r0 instanceof o.StatusNPWPDialog_ViewBinding
            if (r0 == 0) goto L_0x003a
            r0 = r4
            o.StatusNPWPDialog_ViewBinding r0 = (o.StatusNPWPDialog_ViewBinding) r0
            byte[] r0 = r0.c
            r4 = r0
            goto L_0x003f
        L_0x003a:
            r0 = r4
            byte[] r0 = r0.getContents()
            r4 = r0
        L_0x003f:
            r0 = r6
            r1 = r4
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L_0x0049
        L_0x0047:
            r0 = 0
            r5 = r0
        L_0x0049:
            r0 = r5
            return r0
        L_0x004b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.StatusNPWPDialog_ViewBinding.equals(java.lang.Object):boolean");
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public final byte[] getContents() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public final String getFilename() {
        return this.d;
    }

    public final int hashCode() {
        return ((this.d.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("File{filename=");
        sb.append(this.d);
        sb.append(", contents=");
        sb.append(Arrays.toString(this.c));
        sb.append("}");
        return sb.toString();
    }
}
