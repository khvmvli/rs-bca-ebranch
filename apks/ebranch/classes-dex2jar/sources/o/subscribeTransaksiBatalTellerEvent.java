package o;
/* loaded from: classes-dex2jar.jar:o/subscribeTransaksiBatalTellerEvent.class */
public abstract class subscribeTransaksiBatalTellerEvent extends TransaksiBerhasilFragment implements BeneficiaryBankDetailPresenter {
    public subscribeTransaksiBatalTellerEvent() {
    }

    public subscribeTransaksiBatalTellerEvent(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof subscribeTransaksiBatalTellerEvent) {
            subscribeTransaksiBatalTellerEvent subscribetransaksibataltellerevent = (subscribeTransaksiBatalTellerEvent) obj;
            if (!d().equals(subscribetransaksibataltellerevent.d()) || !c().equals(subscribetransaksibataltellerevent.c()) || !j().equals(subscribetransaksibataltellerevent.j()) || !subscribeReservationRescheduleEvent.b(b(), subscribetransaksibataltellerevent.b())) {
                z = false;
            }
            return z;
        } else if (obj instanceof BeneficiaryBankDetailPresenter) {
            return obj.equals(a());
        } else {
            return false;
        }
    }

    @Override // o.TransaksiBerhasilFragment
    protected final /* bridge */ /* synthetic */ AccountOpeningPresenter f() {
        return (BeneficiaryBankDetailPresenter) f();
    }

    protected final BeneficiaryBankDetailPresenter h() {
        return (BeneficiaryBankDetailPresenter) f();
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (((d().hashCode() * 31) + c().hashCode()) * 31) + j().hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        AccountOpeningPresenter a = a();
        if (a != this) {
            return a.toString();
        }
        StringBuilder sb = new StringBuilder("property ");
        sb.append(c());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
