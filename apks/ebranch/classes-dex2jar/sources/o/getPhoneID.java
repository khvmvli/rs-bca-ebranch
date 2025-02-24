package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.CustDataResponse$Account$$Parcelable;
import o.getAmountKliring;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/getPhoneID.class */
public final class getPhoneID<Transcode> {
    DaftarTransferResponse a;
    boolean b;
    getCategories c;
    int d;
    CustDataResponse$Account$$Parcelable.RemoteActionCompatParcelizer e;
    CategoryResponse f;
    Object g;
    Class<?> h;
    boolean i;
    setCategories j;
    setCode k;
    Class<Transcode> l;
    Map<Class<?>, getReservationDate<?>> m;

    /* renamed from: o  reason: collision with root package name */
    int f152o;
    private boolean q;
    private boolean t;
    private final List<getAmountKliring.write<?>> s = new ArrayList();
    private final List<setCode> n = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c = null;
        this.g = null;
        this.k = null;
        this.h = null;
        this.l = null;
        this.f = null;
        this.j = null;
        this.m = null;
        this.a = null;
        this.s.clear();
        this.t = false;
        this.n.clear();
        this.q = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(Class<?> cls) {
        return this.c.h.a(cls, this.h, this.l) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<setCode> d() {
        if (!this.q) {
            this.q = true;
            this.n.clear();
            List<getAmountKliring.write<?>> e = e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                getAmountKliring.write<?> write = e.get(i);
                if (!this.n.contains(write.b)) {
                    this.n.add(write.b);
                }
                for (int i2 = 0; i2 < write.c.size(); i2++) {
                    if (!this.n.contains(write.c.get(i2))) {
                        this.n.add(write.c.get(i2));
                    }
                }
            }
        }
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <Z> getReservationDate<Z> d(Class<Z> cls) {
        getReservationDate<?> getreservationdate = this.m.get(cls);
        getReservationDate<Z> getreservationdate2 = (getReservationDate<Z>) getreservationdate;
        if (getreservationdate == null) {
            Iterator<Map.Entry<Class<?>, getReservationDate<?>>> it = this.m.entrySet().iterator();
            while (true) {
                getreservationdate2 = (getReservationDate<Z>) getreservationdate;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, getReservationDate<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    getreservationdate2 = (getReservationDate<Z>) next.getValue();
                    break;
                }
            }
        }
        if (getreservationdate2 != null) {
            return getreservationdate2;
        }
        if (!this.m.isEmpty() || !this.i) {
            return GetAcctOpeningCategoryDataResponse$Content$$Parcelable.e();
        }
        StringBuilder sb = new StringBuilder("Missing transformation for ");
        sb.append(cls);
        sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<getAmountKliring.write<?>> e() {
        if (!this.t) {
            this.t = true;
            this.s.clear();
            List b = this.c.h.b(this.g);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                getAmountKliring.write<?> c = ((getAmountKliring) b.get(i)).c(this.g, this.f152o, this.d, this.f);
                if (c != null) {
                    this.s.add(c);
                }
            }
        }
        return this.s;
    }
}
