package o;

import java.util.Arrays;
import o.TransaksiTundaDetail;
/* loaded from: classes-dex2jar.jar:o/setStatus.class */
final class setStatus extends TransaksiTundaDetail {
    private final long a;
    private final byte[] b;
    private final Integer c;
    private final long d;
    private final setTypeDraft e;
    private final String f;
    private final long h;

    /* loaded from: classes-dex2jar.jar:o/setStatus$write.class */
    public static final class write extends TransaksiTundaDetail.write {
        private Long a;
        private setTypeDraft b;
        private Long c;
        private byte[] d;
        private Integer e;
        private String i;
        private Long j;

        @Override // o.TransaksiTundaDetail.write
        public final TransaksiTundaDetail.write a(long j) {
            this.j = Long.valueOf(j);
            return this;
        }

        @Override // o.TransaksiTundaDetail.write
        public final TransaksiTundaDetail.write a(setTypeDraft settypedraft) {
            this.b = settypedraft;
            return this;
        }

        @Override // o.TransaksiTundaDetail.write
        public final TransaksiTundaDetail.write b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // o.TransaksiTundaDetail.write
        public final TransaksiTundaDetail.write b(Integer num) {
            this.e = num;
            return this;
        }

        @Override // o.TransaksiTundaDetail.write
        public final TransaksiTundaDetail.write e(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.TransaksiTundaDetail.write
        public final TransaksiTundaDetail.write e(String str) {
            this.i = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.TransaksiTundaDetail.write
        public final TransaksiTundaDetail.write e(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        @Override // o.TransaksiTundaDetail.write
        public final TransaksiTundaDetail e() {
            String str = this.c == null ? " eventTimeMs" : "";
            String str2 = str;
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" eventUptimeMs");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.j == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" timezoneOffsetSeconds");
                str3 = sb2.toString();
            }
            if (str3.isEmpty()) {
                return new setStatus(this.c.longValue(), this.e, this.a.longValue(), this.d, this.i, this.j.longValue(), this.b, (byte) 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str3);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private setStatus(long j, Integer num, long j2, byte[] bArr, String str, long j3, setTypeDraft settypedraft) {
        this.a = j;
        this.c = num;
        this.d = j2;
        this.b = bArr;
        this.f = str;
        this.h = j3;
        this.e = settypedraft;
    }

    /* synthetic */ setStatus(long j, Integer num, long j2, byte[] bArr, String str, long j3, setTypeDraft settypedraft, byte b) {
        this(j, num, j2, bArr, str, j3, settypedraft);
    }

    @Override // o.TransaksiTundaDetail
    public final long a() {
        return this.d;
    }

    @Override // o.TransaksiTundaDetail
    public final long b() {
        return this.a;
    }

    @Override // o.TransaksiTundaDetail
    public final Integer c() {
        return this.c;
    }

    @Override // o.TransaksiTundaDetail
    public final byte[] d() {
        return this.b;
    }

    @Override // o.TransaksiTundaDetail
    public final setTypeDraft e() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
        if (r5.h != r0.f()) goto L_0x00b9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
        if ((r0 = r5.e) != null) goto L_0x00ae;
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
            boolean r0 = r0 instanceof o.TransaksiTundaDetail
            if (r0 == 0) goto L_0x00bd
            r0 = r6
            o.TransaksiTundaDetail r0 = (o.TransaksiTundaDetail) r0
            r8 = r0
            r0 = r5
            long r0 = r0.a
            r1 = r8
            long r1 = r1.b()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b9
            r0 = r5
            java.lang.Integer r0 = r0.c
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0034
            r0 = r8
            java.lang.Integer r0 = r0.c()
            if (r0 != 0) goto L_0x00b9
            goto L_0x003f
        L_0x0034:
            r0 = r6
            r1 = r8
            java.lang.Integer r1 = r1.c()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
        L_0x003f:
            r0 = r5
            long r0 = r0.d
            r1 = r8
            long r1 = r1.a()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b9
            r0 = r5
            byte[] r0 = r0.b
            r9 = r0
            r0 = r8
            boolean r0 = r0 instanceof o.setStatus
            if (r0 == 0) goto L_0x0063
            r0 = r8
            o.setStatus r0 = (o.setStatus) r0
            byte[] r0 = r0.b
            r6 = r0
            goto L_0x0068
        L_0x0063:
            r0 = r8
            byte[] r0 = r0.d()
            r6 = r0
        L_0x0068:
            r0 = r9
            r1 = r6
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L_0x00b9
            r0 = r5
            java.lang.String r0 = r0.f
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0084
            r0 = r8
            java.lang.String r0 = r0.j()
            if (r0 != 0) goto L_0x00b9
            goto L_0x008f
        L_0x0084:
            r0 = r6
            r1 = r8
            java.lang.String r1 = r1.j()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
        L_0x008f:
            r0 = r5
            long r0 = r0.h
            r1 = r8
            long r1 = r1.f()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b9
            r0 = r5
            o.setTypeDraft r0 = r0.e
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L_0x00ae
            r0 = r8
            o.setTypeDraft r0 = r0.e()
            if (r0 != 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00ae:
            r0 = r6
            r1 = r8
            o.setTypeDraft r1 = r1.e()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00bb
        L_0x00b9:
            r0 = 0
            r7 = r0
        L_0x00bb:
            r0 = r7
            return r0
        L_0x00bd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setStatus.equals(java.lang.Object):boolean");
    }

    @Override // o.TransaksiTundaDetail
    public final long f() {
        return this.h;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (int) (j ^ (j >>> 32));
        Integer num = this.c;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.d;
        int i3 = (int) (j2 ^ (j2 >>> 32));
        int hashCode2 = Arrays.hashCode(this.b);
        String str = this.f;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.h;
        int i4 = (int) (j3 ^ (j3 >>> 32));
        setTypeDraft settypedraft = this.e;
        if (settypedraft != null) {
            i2 = settypedraft.hashCode();
        }
        return ((((((((((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ i3) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i4) * 1000003) ^ i2;
    }

    @Override // o.TransaksiTundaDetail
    public final String j() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEvent{eventTimeMs=");
        sb.append(this.a);
        sb.append(", eventCode=");
        sb.append(this.c);
        sb.append(", eventUptimeMs=");
        sb.append(this.d);
        sb.append(", sourceExtension=");
        sb.append(Arrays.toString(this.b));
        sb.append(", sourceExtensionJsonProto3=");
        sb.append(this.f);
        sb.append(", timezoneOffsetSeconds=");
        sb.append(this.h);
        sb.append(", networkConnectionInfo=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
