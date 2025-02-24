package o;

import java.lang.reflect.Method;
/* loaded from: classes2-dex2jar.jar:o/clickSayaSendiri.class */
public class clickSayaSendiri {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/clickSayaSendiri$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        public static final Method a;
        public static final IconCompatParcelizer c = new IconCompatParcelizer();
        public static final Method e;

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
            if (o.subscribeReservationRescheduleEvent.b(r0.length == 1 ? r0[0] : null, java.lang.Throwable.class) != false) goto L_0x007d;
         */
        static {
            /*
                o.clickSayaSendiri$IconCompatParcelizer r0 = new o.clickSayaSendiri$IconCompatParcelizer
                r1 = r0
                r1.<init>()
                o.clickSayaSendiri.IconCompatParcelizer.c = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r0 = r0.getMethods()
                r3 = r0
                r0 = r3
                java.lang.String r1 = ""
                o.subscribeReservationRescheduleEvent.d(r0, r1)
                r0 = r3
                int r0 = r0.length
                r4 = r0
                r0 = 0
                r5 = r0
                r0 = 0
                r6 = r0
            L_0x001d:
                r0 = 0
                r7 = r0
                r0 = r6
                r1 = r4
                if (r0 >= r1) goto L_0x008c
                r0 = r3
                r1 = r6
                r0 = r0[r1]
                r8 = r0
                r0 = r8
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "addSuppressed"
                boolean r0 = o.subscribeReservationRescheduleEvent.b(r0, r1)
                r9 = r0
                r0 = 1
                r10 = r0
                r0 = r9
                if (r0 == 0) goto L_0x007a
                r0 = r8
                java.lang.Class[] r0 = r0.getParameterTypes()
                r11 = r0
                r0 = r11
                java.lang.String r1 = ""
                o.subscribeReservationRescheduleEvent.d(r0, r1)
                r0 = r11
                java.lang.Object[] r0 = (java.lang.Object[]) r0
                r11 = r0
                r0 = r11
                java.lang.String r1 = ""
                o.subscribeReservationRescheduleEvent.e(r0, r1)
                r0 = r11
                int r0 = r0.length
                r1 = 1
                if (r0 != r1) goto L_0x006a
                r0 = r11
                r1 = 0
                r0 = r0[r1]
                r11 = r0
                goto L_0x006d
            L_0x006a:
                r0 = 0
                r11 = r0
            L_0x006d:
                r0 = r11
                java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
                boolean r0 = o.subscribeReservationRescheduleEvent.b(r0, r1)
                if (r0 == 0) goto L_0x007a
                goto L_0x007d
            L_0x007a:
                r0 = 0
                r10 = r0
            L_0x007d:
                r0 = r8
                r11 = r0
                r0 = r10
                if (r0 != 0) goto L_0x008f
                int r6 = r6 + 1
                goto L_0x001d
            L_0x008c:
                r0 = 0
                r11 = r0
            L_0x008f:
                r0 = r11
                o.clickSayaSendiri.IconCompatParcelizer.e = r0
                r0 = r3
                int r0 = r0.length
                r10 = r0
                r0 = r5
                r6 = r0
            L_0x009a:
                r0 = r7
                r11 = r0
                r0 = r6
                r1 = r10
                if (r0 >= r1) goto L_0x00bc
                r0 = r3
                r1 = r6
                r0 = r0[r1]
                r11 = r0
                r0 = r11
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "getSuppressed"
                boolean r0 = o.subscribeReservationRescheduleEvent.b(r0, r1)
                if (r0 != 0) goto L_0x00bc
                int r6 = r6 + 1
                goto L_0x009a
            L_0x00bc:
                r0 = r11
                o.clickSayaSendiri.IconCompatParcelizer.a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.clickSayaSendiri.IconCompatParcelizer.m318clinit():void");
        }

        private IconCompatParcelizer() {
        }
    }

    public void a(Throwable th, Throwable th2) {
        subscribeReservationRescheduleEvent.e(th, "");
        subscribeReservationRescheduleEvent.e(th2, "");
        Method method = IconCompatParcelizer.e;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public setImageUri d() {
        return new subscriberLoadDraftSetoranEvent();
    }
}
