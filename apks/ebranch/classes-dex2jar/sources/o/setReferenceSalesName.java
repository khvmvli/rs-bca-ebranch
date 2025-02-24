package o;
/* loaded from: classes-dex2jar.jar:o/setReferenceSalesName.class */
final class setReferenceSalesName extends setReferenceSalesCode {
    private setReferenceSalesName() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setReferenceSalesName(setPrevCompanyName setprevcompanyname) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [o.setMonthlyIncome] */
    @Override // o.setReferenceSalesCode
    public final <E> void b(Object obj, Object obj2, long j) {
        setMonthlyIncome setmonthlyincome = (setMonthlyIncome) realmGet$jobSector.f(obj, j);
        setMonthlyIncome setmonthlyincome2 = (setMonthlyIncome) realmGet$jobSector.f(obj2, j);
        int size = setmonthlyincome.size();
        int size2 = setmonthlyincome2.size();
        setMonthlyIncome setmonthlyincome3 = setmonthlyincome;
        if (size > 0) {
            setmonthlyincome3 = setmonthlyincome;
            if (size2 > 0) {
                setMonthlyIncome<E> setmonthlyincome4 = setmonthlyincome;
                if (!setmonthlyincome.c()) {
                    setmonthlyincome4 = setmonthlyincome.e(size2 + size);
                }
                setmonthlyincome4.addAll(setmonthlyincome2);
                setmonthlyincome3 = setmonthlyincome4;
            }
        }
        if (size <= 0) {
            setmonthlyincome3 = setmonthlyincome2;
        }
        realmGet$jobSector.e(obj, j, setmonthlyincome3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setReferenceSalesCode
    public final void e(Object obj, long j) {
        ((setMonthlyIncome) realmGet$jobSector.f(obj, j)).b();
    }
}
