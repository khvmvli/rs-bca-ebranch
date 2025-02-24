package o;
/* loaded from: classes2-dex2jar.jar:o/clickOrangLain.class */
public final class clickOrangLain {
    public static final clickSayaSendiri c;

    /* JADX WARN: Can't wrap try/catch for region: R(9:2|(4:68|6|70|(3:8|63|64)(2:9|10))|32|66|(4:69|36|67|(3:38|63|64)(2:39|40))|61|62|63|64) */
    static {
        /*
        // Method dump skipped, instructions count: 522
        */
        throw new UnsupportedOperationException("Method not decompiled: o.clickOrangLain.m316clinit():void");
    }

    private static final int c() {
        String property = System.getProperty("java.specification.version");
        int i = 65542;
        if (property == null) {
            return 65542;
        }
        String str = property;
        int d = CheckOTPSessionPresenter.d(str, '.', 0, false);
        if (d < 0) {
            try {
                i = Integer.parseInt(property) << 16;
            } catch (NumberFormatException e) {
            }
            return i;
        }
        int i2 = d + 1;
        int d2 = CheckOTPSessionPresenter.d(str, '.', i2, false);
        int i3 = d2;
        if (d2 < 0) {
            i3 = property.length();
        }
        String substring = property.substring(0, d);
        subscribeReservationRescheduleEvent.d(substring, "");
        String substring2 = property.substring(i2, i3);
        subscribeReservationRescheduleEvent.d(substring2, "");
        try {
            int parseInt = Integer.parseInt(substring);
            i = (parseInt << 16) + Integer.parseInt(substring2);
        } catch (NumberFormatException e2) {
        }
        return i;
    }
}
