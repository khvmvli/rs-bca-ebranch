package o;
/* loaded from: classes2-dex2jar.jar:o/clickPerusahaan.class */
public class clickPerusahaan extends clickSayaSendiri {

    /* loaded from: classes2-dex2jar.jar:o/clickPerusahaan$write.class */
    static final class write {
        public static final Integer a;
        public static final write d = new write();

        /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
        static {
            /*
                o.clickPerusahaan$write r0 = new o.clickPerusahaan$write
                r1 = r0
                r1.<init>()
                o.clickPerusahaan.write.d = r0
                r0 = 0
                r3 = r0
                java.lang.String r0 = "android.os.Build$VERSION"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: all -> 0x0050
                java.lang.String r1 = "SDK_INT"
                java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: all -> 0x0050
                r1 = 0
                java.lang.Object r0 = r0.get(r1)     // Catch: all -> 0x0050
                r4 = r0
                r0 = r4
                boolean r0 = r0 instanceof java.lang.Integer     // Catch: all -> 0x0050
                if (r0 == 0) goto L_0x002a
                r0 = r4
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: all -> 0x0050
                r4 = r0
                goto L_0x002c
            L_0x002a:
                r0 = 0
                r4 = r0
            L_0x002c:
                r0 = r3
                r5 = r0
                r0 = r4
                if (r0 == 0) goto L_0x004b
                r0 = r4
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                if (r0 <= 0) goto L_0x0041
                r0 = 1
                r6 = r0
                goto L_0x0043
            L_0x0041:
                r0 = 0
                r6 = r0
            L_0x0043:
                r0 = r3
                r5 = r0
                r0 = r6
                if (r0 == 0) goto L_0x004b
                r0 = r4
                r5 = r0
            L_0x004b:
                r0 = r5
                o.clickPerusahaan.write.a = r0
                return
            L_0x0050:
                r4 = move-exception
                goto L_0x002a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.clickPerusahaan.write.m317clinit():void");
        }

        private write() {
        }
    }

    @Override // o.clickSayaSendiri
    public final void a(Throwable th, Throwable th2) {
        subscribeReservationRescheduleEvent.e(th, "");
        subscribeReservationRescheduleEvent.e(th2, "");
        if (write.a == null || write.a.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            a(th, th2);
        }
    }
}
