package o;

import java.io.ObjectStreamException;
import java.io.Serializable;
/* loaded from: classes-dex2jar.jar:o/TransaksiBerhasilFragment.class */
public abstract class TransaksiBerhasilFragment implements AccountOpeningPresenter, Serializable {
    public static final Object c = RemoteActionCompatParcelizer.d;
    protected final Object a;
    private final Class b;
    private final boolean d;
    private final String e;
    private final String h;
    private transient AccountOpeningPresenter j;

    /* loaded from: classes-dex2jar.jar:o/TransaksiBerhasilFragment$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer implements Serializable {
        private static final RemoteActionCompatParcelizer d = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }

        private Object readResolve() throws ObjectStreamException {
            return d;
        }
    }

    public TransaksiBerhasilFragment() {
        this(c);
    }

    private TransaksiBerhasilFragment(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TransaksiBerhasilFragment(Object obj, Class cls, String str, String str2, boolean z) {
        this.a = obj;
        this.b = cls;
        this.e = str;
        this.h = str2;
        this.d = z;
    }

    public final AccountOpeningPresenter a() {
        AccountOpeningPresenter accountOpeningPresenter = this.j;
        AccountOpeningPresenter accountOpeningPresenter2 = accountOpeningPresenter;
        if (accountOpeningPresenter == null) {
            accountOpeningPresenter2 = e();
            this.j = accountOpeningPresenter2;
        }
        return accountOpeningPresenter2;
    }

    public final Object b() {
        return this.a;
    }

    public final String c() {
        return this.e;
    }

    public final AdminFeesPresenter d() {
        Class cls = this.b;
        return cls == null ? null : this.d ? subscriberLoadDraftBankTransferEvent.b(cls) : subscriberLoadDraftBankTransferEvent.a(cls);
    }

    @Override // o.AccountOpeningPresenter
    public final Object e(Object... objArr) {
        return f().e(objArr);
    }

    protected abstract AccountOpeningPresenter e();

    /* JADX INFO: Access modifiers changed from: protected */
    public AccountOpeningPresenter f() {
        AccountOpeningPresenter accountOpeningPresenter = this.j;
        AccountOpeningPresenter accountOpeningPresenter2 = accountOpeningPresenter;
        if (accountOpeningPresenter == null) {
            accountOpeningPresenter2 = e();
            this.j = accountOpeningPresenter2;
        }
        if (accountOpeningPresenter2 != this) {
            return accountOpeningPresenter2;
        }
        throw new onHubungiCabangTarikanEvent();
    }

    public final String j() {
        return this.h;
    }
}
