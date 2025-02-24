package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/realmGet$job.class */
public final class realmGet$job extends setFotoPribadi {
    public static final Parcelable.Creator<realmGet$job> CREATOR = new Parcelable.Creator() { // from class: o.realmGet$noHpKontakPengirim
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            long j = -1;
            int i = 0;
            String str = null;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                int b2 = SafeParcelReader.b(b);
                if (b2 == 1) {
                    str = SafeParcelReader.b(parcel, b);
                } else if (b2 == 2) {
                    i = SafeParcelReader.k(parcel, b);
                } else if (b2 != 3) {
                    SafeParcelReader.p(parcel, b);
                } else {
                    j = SafeParcelReader.r(parcel, b);
                }
            }
            SafeParcelReader.d(parcel, a);
            return new realmGet$job(str, i, j);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new realmGet$job[i];
        }
    };
    @Deprecated
    private final int a;
    private final long b;
    private final String e;

    public realmGet$job(String str, int i, long j) {
        this.e = str;
        this.a = i;
        this.b = j;
    }

    public realmGet$job(String str, long j) {
        this.e = str;
        this.b = 1;
        this.a = -1;
    }

    public final String b() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final long c() {
        /*
            r5 = this;
            r0 = r5
            long r0 = r0.b
            r6 = r0
            r0 = r6
            r8 = r0
            r0 = r6
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            r0 = r5
            int r0 = r0.a
            long r0 = (long) r0
            r8 = r0
        L_0x0015:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$job.c():long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [long] */
    /* JADX WARN: Type inference failed for: r0v9, types: [long] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Unknown variable types count: 4 */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof o.realmGet$job
            if (r0 == 0) goto L_0x0066
            r0 = r6
            o.realmGet$job r0 = (o.realmGet$job) r0
            r7 = r0
            r0 = r5
            java.lang.String r0 = r0.e
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0020
            r0 = r6
            r1 = r7
            java.lang.String r1 = r1.e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002e
        L_0x0020:
            r0 = r5
            java.lang.String r0 = r0.e
            if (r0 != 0) goto L_0x0066
            r0 = r7
            java.lang.String r0 = r0.e
            if (r0 != 0) goto L_0x0066
        L_0x002e:
            r0 = r5
            long r0 = r0.b
            r8 = r0
            r0 = r8
            r10 = r0
            r0 = r8
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            r0 = r5
            int r0 = r0.a
            long r0 = (long) r0
            r10 = r0
        L_0x0045:
            r0 = r7
            long r0 = r0.b
            r12 = r0
            r0 = r12
            r8 = r0
            r0 = r12
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005d
            r0 = r7
            int r0 = r0.a
            long r0 = (long) r0
            r8 = r0
        L_0x005d:
            r0 = r10
            r1 = r8
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0066
            r0 = 1
            return r0
        L_0x0066:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$job.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [long] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final int hashCode() {
        /*
            r6 = this;
            r0 = r6
            java.lang.String r0 = r0.e
            r7 = r0
            r0 = r6
            long r0 = r0.b
            r8 = r0
            r0 = r8
            r10 = r0
            r0 = r8
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            r0 = r6
            int r0 = r0.a
            long r0 = (long) r0
            r10 = r0
        L_0x001c:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r7
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r10
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1[r2] = r3
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$job.hashCode():int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [long] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.lang.String toString() {
        /*
            r5 = this;
            o.setFlagIB$IconCompatParcelizer r0 = new o.setFlagIB$IconCompatParcelizer
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            java.lang.String r1 = "name"
            r2 = r5
            java.lang.String r2 = r2.e
            o.setFlagIB$IconCompatParcelizer r0 = r0.b(r1, r2)
            r0 = r5
            long r0 = r0.b
            r7 = r0
            r0 = r7
            r9 = r0
            r0 = r7
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002b
            r0 = r5
            int r0 = r0.a
            long r0 = (long) r0
            r9 = r0
        L_0x002b:
            r0 = r6
            java.lang.String r1 = "version"
            r2 = r9
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            o.setFlagIB$IconCompatParcelizer r0 = r0.b(r1, r2)
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$job.toString():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [long] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    @Override // android.os.Parcelable
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void writeToParcel(android.os.Parcel r6, int r7) {
        /*
            r5 = this;
            r0 = r6
            r1 = -45243(0xffffffffffff4f45, float:NaN)
            r0.writeInt(r1)
            r0 = r6
            r1 = 0
            r0.writeInt(r1)
            r0 = r6
            int r0 = r0.dataPosition()
            r7 = r0
            r0 = r5
            java.lang.String r0 = r0.e
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L_0x004c
            r0 = r6
            r1 = -65535(0xffffffffffff0001, float:NaN)
            r0.writeInt(r1)
            r0 = r6
            r1 = 0
            r0.writeInt(r1)
            r0 = r6
            int r0 = r0.dataPosition()
            r9 = r0
            r0 = r6
            r1 = r8
            r0.writeString(r1)
            r0 = r6
            int r0 = r0.dataPosition()
            r10 = r0
            r0 = r6
            r1 = r9
            r2 = 4
            int r1 = r1 - r2
            r0.setDataPosition(r1)
            r0 = r6
            r1 = r10
            r2 = r9
            int r1 = r1 - r2
            r0.writeInt(r1)
            r0 = r6
            r1 = r10
            r0.setDataPosition(r1)
        L_0x004c:
            r0 = r5
            int r0 = r0.a
            r9 = r0
            r0 = r6
            r1 = 262146(0x40002, float:3.67345E-40)
            r0.writeInt(r1)
            r0 = r6
            r1 = r9
            r0.writeInt(r1)
            r0 = r5
            long r0 = r0.b
            r11 = r0
            r0 = r11
            r13 = r0
            r0 = r11
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0078
            r0 = r5
            int r0 = r0.a
            long r0 = (long) r0
            r13 = r0
        L_0x0078:
            r0 = r6
            r1 = 524291(0x80003, float:7.34688E-40)
            r0.writeInt(r1)
            r0 = r6
            r1 = r13
            r0.writeLong(r1)
            r0 = r6
            int r0 = r0.dataPosition()
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = 4
            int r1 = r1 - r2
            r0.setDataPosition(r1)
            r0 = r6
            r1 = r9
            r2 = r7
            int r1 = r1 - r2
            r0.writeInt(r1)
            r0 = r6
            r1 = r9
            r0.setDataPosition(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$job.writeToParcel(android.os.Parcel, int):void");
    }
}
