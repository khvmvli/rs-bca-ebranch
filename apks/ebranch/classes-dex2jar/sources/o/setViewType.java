package o;

import o.DetailTransactionResponse;
/* loaded from: classes-dex2jar.jar:o/setViewType.class */
public final class setViewType extends getTxnSourceValue<setCode, setIbanFlag<?>> implements DetailTransactionResponse.ValueTxnSubDataDetail {
    private DetailTransactionResponse.ValueTxnSubDataDetail.read e;

    public setViewType(long j) {
        super(j);
    }

    @Override // o.DetailTransactionResponse.ValueTxnSubDataDetail
    public final /* synthetic */ setIbanFlag a(setCode setcode) {
        return e(setcode);
    }

    @Override // o.DetailTransactionResponse.ValueTxnSubDataDetail
    public final void a(int i) {
        if (i >= 40) {
            a();
        } else if (i >= 20 || i == 15) {
            b(c() / 2);
        }
    }

    @Override // o.DetailTransactionResponse.ValueTxnSubDataDetail
    public final void a(DetailTransactionResponse.ValueTxnSubDataDetail.read read) {
        this.e = read;
    }

    @Override // o.getTxnSourceValue
    public final /* bridge */ /* synthetic */ int d(setIbanFlag<?> setibanflag) {
        setIbanFlag<?> setibanflag2 = setibanflag;
        return setibanflag2 == null ? d(null) : setibanflag2.d();
    }

    @Override // o.getTxnSourceValue
    public final /* synthetic */ void d(setCode setcode, setIbanFlag<?> setibanflag) {
        setIbanFlag<?> setibanflag2 = setibanflag;
        DetailTransactionResponse.ValueTxnSubDataDetail.read read = this.e;
        if (read != null && setibanflag2 != null) {
            read.b(setibanflag2);
        }
    }

    @Override // o.DetailTransactionResponse.ValueTxnSubDataDetail
    public final /* bridge */ /* synthetic */ setIbanFlag e(setCode setcode, setIbanFlag setibanflag) {
        return e((setViewType) setcode, (setCode) setibanflag);
    }
}
