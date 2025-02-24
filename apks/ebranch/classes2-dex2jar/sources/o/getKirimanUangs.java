package o;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/getKirimanUangs.class */
public final class getKirimanUangs implements Runnable {
    final /* synthetic */ setCreditCards b;
    final /* synthetic */ realmGet$idType c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getKirimanUangs(realmGet$idType realmget_idtype, setCreditCards setcreditcards) {
        this.c = realmget_idtype;
        this.b = setcreditcards;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v7, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    @Override // java.lang.Runnable
    public final void run() {
        realmSet$isInputAtmPemrek realmset_isinputatmpemrek = this.c.c;
        if (realmset_isinputatmpemrek == null) {
            this.c.q.s_().b().b("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            setFotoKtp.b(this.b);
            realmset_isinputatmpemrek.d(this.b);
        } catch (RemoteException e) {
            this.c.q.s_().b().e("Failed to reset data on the service: remote exception", e);
        }
        this.c.r();
    }
}
