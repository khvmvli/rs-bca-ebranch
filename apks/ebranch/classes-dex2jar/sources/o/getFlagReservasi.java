package o;

import java.util.Arrays;
import o.TransaksiTundaDetail$$Parcelable;
/* loaded from: classes-dex2jar.jar:o/getFlagReservasi.class */
final class getFlagReservasi extends TransaksiTundaDetail$$Parcelable {
    private final byte[] b;
    private final getTxbDate d;
    private final String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getFlagReservasi$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends TransaksiTundaDetail$$Parcelable.RemoteActionCompatParcelizer {
        private String b;
        getTxbDate d;
        private byte[] e;

        @Override // o.TransaksiTundaDetail$$Parcelable.RemoteActionCompatParcelizer
        public final TransaksiTundaDetail$$Parcelable.RemoteActionCompatParcelizer a(byte[] bArr) {
            this.e = bArr;
            return this;
        }

        @Override // o.TransaksiTundaDetail$$Parcelable.RemoteActionCompatParcelizer
        public final TransaksiTundaDetail$$Parcelable.RemoteActionCompatParcelizer d(getTxbDate gettxbdate) {
            if (gettxbdate != null) {
                this.d = gettxbdate;
                return this;
            }
            throw new NullPointerException("Null priority");
        }

        @Override // o.TransaksiTundaDetail$$Parcelable.RemoteActionCompatParcelizer
        public final TransaksiTundaDetail$$Parcelable.RemoteActionCompatParcelizer e(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // o.TransaksiTundaDetail$$Parcelable.RemoteActionCompatParcelizer
        public final TransaksiTundaDetail$$Parcelable e() {
            String str = this.b == null ? " backendName" : "";
            String str2 = str;
            if (this.d == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" priority");
                str2 = sb.toString();
            }
            if (str2.isEmpty()) {
                return new getFlagReservasi(this.b, this.e, this.d, (byte) 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str2);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private getFlagReservasi(String str, byte[] bArr, getTxbDate gettxbdate) {
        this.e = str;
        this.b = bArr;
        this.d = gettxbdate;
    }

    /* synthetic */ getFlagReservasi(String str, byte[] bArr, getTxbDate gettxbdate, byte b) {
        this(str, bArr, gettxbdate);
    }

    @Override // o.TransaksiTundaDetail$$Parcelable
    public final getTxbDate a() {
        return this.d;
    }

    @Override // o.TransaksiTundaDetail$$Parcelable
    public final byte[] b() {
        return this.b;
    }

    @Override // o.TransaksiTundaDetail$$Parcelable
    public final String c() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r3.d.equals(r0.a()) != false) goto L_0x0059;
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
            boolean r0 = r0 instanceof o.TransaksiTundaDetail$$Parcelable
            if (r0 == 0) goto L_0x005b
            r0 = r4
            o.TransaksiTundaDetail$$Parcelable r0 = (o.TransaksiTundaDetail$$Parcelable) r0
            r6 = r0
            r0 = r3
            java.lang.String r0 = r0.e
            r1 = r6
            java.lang.String r1 = r1.c()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0057
            r0 = r3
            byte[] r0 = r0.b
            r7 = r0
            r0 = r6
            boolean r0 = r0 instanceof o.getFlagReservasi
            if (r0 == 0) goto L_0x003b
            r0 = r6
            o.getFlagReservasi r0 = (o.getFlagReservasi) r0
            byte[] r0 = r0.b
            r4 = r0
            goto L_0x0040
        L_0x003b:
            r0 = r6
            byte[] r0 = r0.b()
            r4 = r0
        L_0x0040:
            r0 = r7
            r1 = r4
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L_0x0057
            r0 = r3
            o.getTxbDate r0 = r0.d
            r1 = r6
            o.getTxbDate r1 = r1.a()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0059
        L_0x0057:
            r0 = 0
            r5 = r0
        L_0x0059:
            r0 = r5
            return r0
        L_0x005b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getFlagReservasi.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((((this.e.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.d.hashCode();
    }
}
