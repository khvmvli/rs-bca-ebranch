package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setOfficePosition.class */
final class setOfficePosition extends setReferenceSalesCode {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private setOfficePosition() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setOfficePosition(setPrevCompanyName setprevcompanyname) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v20 */
    @Override // o.setReferenceSalesCode
    public final <E> void b(Object obj, Object obj2, long j) {
        ArrayList arrayList;
        List list = (List) realmGet$jobSector.f(obj2, j);
        int size = list.size();
        List list2 = (List) realmGet$jobSector.f(obj, j);
        if (list2.isEmpty()) {
            setPrevWorkPeriod setprevworkperiod = list2 instanceof setReferalCode ? new setPrevWorkPeriod(size) : (!(list2 instanceof realmSet$annualFeeAddOnAmount) || !(list2 instanceof setMonthlyIncome)) ? new ArrayList(size) : ((setMonthlyIncome) list2).e(size);
            realmGet$jobSector.e(obj, j, setprevworkperiod);
            arrayList = setprevworkperiod;
        } else if (c.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList2 = new ArrayList(list2.size() + size);
            arrayList2.addAll(list2);
            realmGet$jobSector.e(obj, j, arrayList2);
            arrayList = arrayList2;
        } else if (list2 instanceof getRelationship) {
            setPrevWorkPeriod setprevworkperiod2 = new setPrevWorkPeriod(list2.size() + size);
            setprevworkperiod2.addAll(setprevworkperiod2.size(), (getRelationship) list2);
            realmGet$jobSector.e(obj, j, setprevworkperiod2);
            arrayList = setprevworkperiod2;
        } else {
            arrayList = list2;
            if (list2 instanceof realmSet$annualFeeAddOnAmount) {
                arrayList = list2;
                if (list2 instanceof setMonthlyIncome) {
                    setMonthlyIncome setmonthlyincome = (setMonthlyIncome) list2;
                    arrayList = list2;
                    if (!setmonthlyincome.c()) {
                        setMonthlyIncome<E> e = setmonthlyincome.e(list2.size() + size);
                        realmGet$jobSector.e(obj, j, e);
                        arrayList = e;
                    }
                }
            }
        }
        int size2 = arrayList.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            arrayList.addAll(list);
        }
        List list3 = arrayList;
        if (size2 <= 0) {
            list3 = list;
        }
        realmGet$jobSector.e(obj, j, list3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setReferenceSalesCode
    public final void e(Object obj, long j) {
        Object obj2;
        List list = (List) realmGet$jobSector.f(obj, j);
        if (list instanceof setReferalCode) {
            obj2 = ((setReferalCode) list).e();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof realmSet$annualFeeAddOnAmount) || !(list instanceof setMonthlyIncome)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                setMonthlyIncome setmonthlyincome = (setMonthlyIncome) list;
                if (setmonthlyincome.c()) {
                    setmonthlyincome.b();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        realmGet$jobSector.e(obj, j, obj2);
    }
}
