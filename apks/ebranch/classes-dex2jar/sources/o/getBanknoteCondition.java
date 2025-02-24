package o;
/* loaded from: classes-dex2jar.jar:o/getBanknoteCondition.class */
public final class getBanknoteCondition<T> extends getServiceType<T> {
    private final Integer a;
    private final getTxbDate b;
    private final T c;

    public getBanknoteCondition(Integer num, T t, getTxbDate gettxbdate) {
        this.a = num;
        if (t != null) {
            this.c = t;
            if (gettxbdate != null) {
                this.b = gettxbdate;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // o.getServiceType
    public final T a() {
        return this.c;
    }

    @Override // o.getServiceType
    public final getTxbDate b() {
        return this.b;
    }

    @Override // o.getServiceType
    public final Integer d() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r3.b.equals(r0.b()) != false) goto L_0x0051;
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
            boolean r0 = r0 instanceof o.getServiceType
            if (r0 == 0) goto L_0x0053
            r0 = r4
            o.getServiceType r0 = (o.getServiceType) r0
            r6 = r0
            r0 = r3
            java.lang.Integer r0 = r0.a
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L_0x0028
            r0 = r6
            java.lang.Integer r0 = r0.d()
            if (r0 != 0) goto L_0x004f
            goto L_0x0033
        L_0x0028:
            r0 = r4
            r1 = r6
            java.lang.Integer r1 = r1.d()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004f
        L_0x0033:
            r0 = r3
            T r0 = r0.c
            r1 = r6
            java.lang.Object r1 = r1.a()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004f
            r0 = r3
            o.getTxbDate r0 = r0.b
            r1 = r6
            o.getTxbDate r1 = r1.b()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0051
        L_0x004f:
            r0 = 0
            r5 = r0
        L_0x0051:
            r0 = r5
            return r0
        L_0x0053:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getBanknoteCondition.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Integer num = this.a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Event{code=");
        sb.append(this.a);
        sb.append(", payload=");
        sb.append(this.c);
        sb.append(", priority=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
