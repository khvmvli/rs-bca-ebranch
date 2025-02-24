package o;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/setMember.class */
public final class setMember {
    private String a;
    final /* synthetic */ setVerified b;
    private BitSet c;
    private realmSet.currCompanyPosition d;
    private boolean e;
    private BitSet h;
    private Map<Integer, List<Long>> i;
    private Map<Integer, Long> j;

    public /* synthetic */ setMember(setVerified setverified, String str, realmSet.currCompanyPosition currcompanyposition, BitSet bitSet, BitSet bitSet2, Map map, Map map2, setIdType setidtype) {
        this.b = setverified;
        this.a = str;
        this.c = bitSet;
        this.h = bitSet2;
        this.j = map;
        this.i = new setThumbTextPadding();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.i.put(num, arrayList);
        }
        this.e = false;
        this.d = currcompanyposition;
    }

    public /* synthetic */ setMember(setVerified setverified, String str, setIdType setidtype) {
        this.b = setverified;
        this.a = str;
        this.e = true;
        this.c = new BitSet();
        this.h = new BitSet();
        this.j = new setThumbTextPadding();
        this.i = new setThumbTextPadding();
    }

    public static /* synthetic */ BitSet e(setMember setmember) {
        return setmember.c;
    }

    public final void d(setKirimanUangs setkirimanuangs) {
        int c = setkirimanuangs.c();
        Boolean bool = setkirimanuangs.e;
        if (bool != null) {
            this.h.set(c, bool.booleanValue());
        }
        Boolean bool2 = setkirimanuangs.a;
        if (bool2 != null) {
            this.c.set(c, bool2.booleanValue());
        }
        if (setkirimanuangs.h != null) {
            Map<Integer, Long> map = this.j;
            Integer valueOf = Integer.valueOf(c);
            Long l = map.get(valueOf);
            long longValue = setkirimanuangs.h.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.j.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (setkirimanuangs.g != null) {
            Map<Integer, List<Long>> map2 = this.i;
            Integer valueOf2 = Integer.valueOf(c);
            List<Long> list = map2.get(valueOf2);
            List<Long> list2 = list;
            if (list == null) {
                list2 = new ArrayList<>();
                this.i.put(valueOf2, list2);
            }
            if (setkirimanuangs.d()) {
                list2.clear();
            }
            getNegaraBagianBankPenerima.e();
            if (this.b.q.t().c(this.a, realmSet.hasDone.D) && setkirimanuangs.a()) {
                list2.clear();
            }
            getNegaraBagianBankPenerima.e();
            if (this.b.q.t().c(this.a, realmSet.hasDone.D)) {
                Long valueOf3 = Long.valueOf(setkirimanuangs.g.longValue() / 1000);
                if (!list2.contains(valueOf3)) {
                    list2.add(valueOf3);
                    return;
                }
                return;
            }
            list2.add(Long.valueOf(setkirimanuangs.g.longValue() / 1000));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final o.realmGet.referenceBranchCode e(int r5) {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setMember.e(int):o.realmGet$referenceBranchCode");
    }
}
