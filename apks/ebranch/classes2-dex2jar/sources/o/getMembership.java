package o;

import android.os.Bundle;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/getMembership.class */
public final class getMembership implements Runnable {
    final /* synthetic */ Bundle b;
    final /* synthetic */ setCreditCards c;
    final /* synthetic */ realmGet$idType d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getMembership(realmGet$idType realmget_idtype, setCreditCards setcreditcards, Bundle bundle) {
        this.d = realmget_idtype;
        this.c = setcreditcards;
        this.b = bundle;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v5, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    @Override // java.lang.Runnable
    public final void run() {
        realmSet$isInputAtmPemrek realmset_isinputatmpemrek = this.d.c;
        if (realmset_isinputatmpemrek == null) {
            this.d.q.s_().b().b("Failed to send default event parameters to service");
            return;
        }
        try {
            setFotoKtp.b(this.c);
            realmset_isinputatmpemrek.b(this.b, this.c);
        } catch (RemoteException e) {
            this.d.q.s_().b().e("Failed to send default event parameters to service", e);
        }
    }
}
