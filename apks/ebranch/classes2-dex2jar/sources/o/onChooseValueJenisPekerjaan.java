package o;
/* loaded from: classes2-dex2jar.jar:o/onChooseValueJenisPekerjaan.class */
public final class onChooseValueJenisPekerjaan implements Comparable<onChooseValueJenisPekerjaan> {
    public static final read a = new read((byte) 0);
    public static final onChooseValueJenisPekerjaan b = onClickRetry.e();
    private final int c = 1;
    private final int d = 7;
    private final int e = 0;
    private final int i;

    /* loaded from: classes2-dex2jar.jar:o/onChooseValueJenisPekerjaan$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public onChooseValueJenisPekerjaan(int r6, int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onChooseValueJenisPekerjaan.<init>(int, int, int):void");
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(onChooseValueJenisPekerjaan onchoosevaluejenispekerjaan) {
        onChooseValueJenisPekerjaan onchoosevaluejenispekerjaan2 = onchoosevaluejenispekerjaan;
        subscribeReservationRescheduleEvent.e(onchoosevaluejenispekerjaan2, "");
        return this.i - onchoosevaluejenispekerjaan2.i;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        onChooseValueJenisPekerjaan onchoosevaluejenispekerjaan = obj instanceof onChooseValueJenisPekerjaan ? (onChooseValueJenisPekerjaan) obj : null;
        if (onchoosevaluejenispekerjaan == null) {
            return false;
        }
        if (this.i != onchoosevaluejenispekerjaan.i) {
            z = false;
        }
        return z;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.i;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append('.');
        sb.append(this.d);
        sb.append('.');
        sb.append(this.e);
        return sb.toString();
    }
}
