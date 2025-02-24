package o;

import android.os.RemoteException;
import o.realmSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/getUserPhoto.class */
public final class getUserPhoto implements Runnable {
    final /* synthetic */ setCreditCards b;
    final /* synthetic */ realmGet$idType c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getUserPhoto(realmGet$idType realmget_idtype, setCreditCards setcreditcards) {
        this.c = realmget_idtype;
        this.b = setcreditcards;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v5, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    @Override // java.lang.Runnable
    public final void run() {
        realmSet$isInputAtmPemrek realmset_isinputatmpemrek = this.c.c;
        if (realmset_isinputatmpemrek == null) {
            this.c.q.s_().b().b("Discarding data. Failed to send app launch");
            return;
        }
        try {
            setFotoKtp.b(this.b);
            realmset_isinputatmpemrek.a(this.b);
            ((realmSet.descTransaksi) this.c).q.v().j();
            this.c.e(realmset_isinputatmpemrek, null, this.b);
            this.c.r();
        } catch (RemoteException e) {
            this.c.q.s_().b().e("Failed to send app launch to the service", e);
        }
    }
}
