package o;

import o.getTxnPurposeValue;
import o.onFindViewById;
import o.setBankStatesName;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/getReceiverAddress.class */
public final class getReceiverAddress<Z> implements setIbanFlag<Z>, getTxnPurposeValue.RemoteActionCompatParcelizer {
    private static final onFindViewById.write<getReceiverAddress<?>> b = getTxnPurposeValue.a(20, new getTxnPurposeValue.read<getReceiverAddress<?>>() { // from class: o.getReceiverAddress.5
        @Override // o.getTxnPurposeValue.read
        public final /* synthetic */ getReceiverAddress<?> b() {
            return new getReceiverAddress<>();
        }
    });
    private setIbanFlag<Z> a;
    private boolean c;
    private boolean d;
    private final setBankStatesName e = new setBankStatesName.write();

    getReceiverAddress() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <Z> getReceiverAddress<Z> e(setIbanFlag<Z> setibanflag) {
        getReceiverAddress<?> a = b.a();
        if (a != null) {
            getReceiverAddress<Z> getreceiveraddress = (getReceiverAddress<Z>) a;
            ((getReceiverAddress) getreceiveraddress).d = false;
            ((getReceiverAddress) getreceiveraddress).c = true;
            ((getReceiverAddress) getreceiveraddress).a = setibanflag;
            return getreceiveraddress;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // o.setIbanFlag
    public final Z a() {
        return this.a.a();
    }

    @Override // o.setIbanFlag
    public final void b() {
        synchronized (this) {
            this.e.c();
            this.d = true;
            if (!this.c) {
                this.a.b();
                this.a = null;
                b.c(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        synchronized (this) {
            this.e.c();
            if (this.c) {
                this.c = false;
                if (this.d) {
                    b();
                }
            } else {
                throw new IllegalStateException("Already unlocked");
            }
        }
    }

    @Override // o.setIbanFlag
    public final int d() {
        return this.a.d();
    }

    @Override // o.setIbanFlag
    public final Class<Z> e() {
        return this.a.e();
    }

    @Override // o.getTxnPurposeValue.RemoteActionCompatParcelizer
    public final setBankStatesName j_() {
        return this.e;
    }
}
