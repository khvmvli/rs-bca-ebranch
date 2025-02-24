package o;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import o.realmSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/getNoHandphone.class */
public final class getNoHandphone implements Runnable {
    final /* synthetic */ realmGet$idType a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ setCreditCards d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getNoHandphone(realmGet$idType realmget_idtype, AtomicReference atomicReference, setCreditCards setcreditcards) {
        this.a = realmget_idtype;
        this.b = atomicReference;
        this.d = setcreditcards;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v43, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v48, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v56, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v65, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v8, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.b) {
            try {
            } catch (RemoteException e) {
                this.a.q.s_().b().e("Failed to get app instance id", e);
                atomicReference = this.b;
            }
            if (!this.a.q.q().c().d()) {
                this.a.q.s_().f().b("Analytics storage consent denied; will not get app instance id");
                ((realmSet.descTransaksi) this.a).q.x().e(null);
                this.a.q.q().e.d(null);
                this.b.set(null);
                this.b.notify();
                return;
            }
            realmSet$isInputAtmPemrek realmset_isinputatmpemrek = this.a.c;
            if (realmset_isinputatmpemrek == null) {
                this.a.q.s_().b().b("Failed to get app instance id");
                this.b.notify();
                return;
            }
            setFotoKtp.b(this.d);
            this.b.set(realmset_isinputatmpemrek.c(this.d));
            String str = (String) this.b.get();
            if (str != null) {
                ((realmSet.descTransaksi) this.a).q.x().e(str);
                this.a.q.q().e.d(str);
            }
            this.a.r();
            atomicReference = this.b;
            atomicReference.notify();
        }
    }
}
