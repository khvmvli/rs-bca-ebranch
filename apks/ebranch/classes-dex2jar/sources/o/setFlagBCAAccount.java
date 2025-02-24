package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.setFlagAgreeLifeInsurance;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setFlagBCAAccount.class */
public final class setFlagBCAAccount<T extends setFlagAgreeLifeInsurance<T>> {
    private static final setFlagBCAAccount e = new setFlagBCAAccount(true);
    private boolean b;
    final realmSet$cardName<T, Object> c = new realmSet$cardCode(16);
    private boolean d;

    private setFlagBCAAccount() {
    }

    private setFlagBCAAccount(boolean z) {
        b();
        b();
    }

    public static <T extends setFlagAgreeLifeInsurance<T>> setFlagBCAAccount<T> a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static final void b(T r8, java.lang.Object r9) {
        /*
            r0 = r8
            o.EChannel r0 = r0.c()
            r10 = r0
            r0 = r9
            java.lang.Object r0 = o.setNationality.c(r0)
            o.EChannel r0 = o.EChannel.DOUBLE
            r11 = r0
            o.setSupplementCardLimit r0 = o.setSupplementCardLimit.INT
            r11 = r0
            r0 = r10
            o.setSupplementCardLimit r0 = r0.e()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x00af;
                case 1: goto L_0x00a6;
                case 2: goto L_0x009d;
                case 3: goto L_0x0094;
                case 4: goto L_0x008b;
                case 5: goto L_0x0082;
                case 6: goto L_0x0071;
                case 7: goto L_0x0060;
                case 8: goto L_0x004f;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x00bb
        L_0x004f:
            r0 = r9
            boolean r0 = r0 instanceof o.realmGet$cardDescription
            if (r0 != 0) goto L_0x00ba
            r0 = r9
            boolean r0 = r0 instanceof o.setNoCardKrisFlyer
            if (r0 == 0) goto L_0x00bb
            goto L_0x00ba
        L_0x0060:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x00ba
            r0 = r9
            boolean r0 = r0 instanceof o.setIdentityCardType
            if (r0 == 0) goto L_0x00bb
            goto L_0x00ba
        L_0x0071:
            r0 = r9
            boolean r0 = r0 instanceof o.setCurrOfficePostCode
            if (r0 != 0) goto L_0x00ba
            r0 = r9
            boolean r0 = r0 instanceof byte[]
            if (r0 == 0) goto L_0x00bb
            goto L_0x00ba
        L_0x0082:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.String
            r12 = r0
            goto L_0x00b5
        L_0x008b:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Boolean
            r12 = r0
            goto L_0x00b5
        L_0x0094:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Double
            r12 = r0
            goto L_0x00b5
        L_0x009d:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Float
            r12 = r0
            goto L_0x00b5
        L_0x00a6:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Long
            r12 = r0
            goto L_0x00b5
        L_0x00af:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Integer
            r12 = r0
        L_0x00b5:
            r0 = r12
            if (r0 == 0) goto L_0x00bb
        L_0x00ba:
            return
        L_0x00bb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            int r6 = r6.e()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r8
            o.EChannel r6 = r6.c()
            o.setSupplementCardLimit r6 = r6.e()
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = r9
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setFlagBCAAccount.b(o.setFlagAgreeLifeInsurance, java.lang.Object):void");
    }

    public final void b() {
        if (!this.b) {
            this.c.d();
            this.b = true;
        }
    }

    public final void c(T t, Object obj) {
        if (!t.d()) {
            b(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                b(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof setNoCardKrisFlyer) {
            this.d = true;
        }
        this.c.put(t, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        setFlagBCAAccount setflagbcaaccount = new setFlagBCAAccount();
        for (int i = 0; i < this.c.b(); i++) {
            Map.Entry<T, Object> d = this.c.d(i);
            setflagbcaaccount.c(d.getKey(), d.getValue());
        }
        for (Map.Entry<T, Object> entry : this.c.c()) {
            setflagbcaaccount.c(entry.getKey(), entry.getValue());
        }
        setflagbcaaccount.d = this.d;
        return setflagbcaaccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFlagBCAAccount)) {
            return false;
        }
        return this.c.equals(((setFlagBCAAccount) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
