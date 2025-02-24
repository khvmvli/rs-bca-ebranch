package o;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/isMember.class */
public final class isMember implements Runnable {
    final /* synthetic */ realmGet$idType c;
    final /* synthetic */ setCreditCards e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public isMember(realmGet$idType realmget_idtype, setCreditCards setcreditcards) {
        this.c = realmget_idtype;
        this.e = setcreditcards;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v5, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    @Override // java.lang.Runnable
    public final void run() {
        realmSet$isInputAtmPemrek realmset_isinputatmpemrek = this.c.c;
        if (realmset_isinputatmpemrek == null) {
            this.c.q.s_().b().b("Failed to send consent settings to service");
            return;
        }
        try {
            setFotoKtp.b(this.e);
            realmset_isinputatmpemrek.b(this.e);
            this.c.r();
        } catch (RemoteException e) {
            this.c.q.s_().b().e("Failed to send consent settings to the service", e);
        }
    }
}
