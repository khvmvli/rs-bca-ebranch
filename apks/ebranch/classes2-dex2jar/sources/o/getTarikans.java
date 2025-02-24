package o;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/getTarikans.class */
public final class getTarikans implements Runnable {
    final /* synthetic */ getAcctNo c;
    final /* synthetic */ realmGet$idType d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getTarikans(realmGet$idType realmget_idtype, getAcctNo getacctno) {
        this.d = realmget_idtype;
        this.c = getacctno;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v5, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r4v1, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r4v6, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    @Override // java.lang.Runnable
    public final void run() {
        realmSet$isInputAtmPemrek realmset_isinputatmpemrek = this.d.c;
        if (realmset_isinputatmpemrek == null) {
            this.d.q.s_().b().b("Failed to send current screen to service");
            return;
        }
        try {
            getAcctNo getacctno = this.c;
            if (getacctno == null) {
                realmset_isinputatmpemrek.e(0, (String) null, (String) null, this.d.q.t_().getPackageName());
            } else {
                realmset_isinputatmpemrek.e(getacctno.b, getacctno.c, getacctno.e, this.d.q.t_().getPackageName());
            }
            this.d.r();
        } catch (RemoteException e) {
            this.d.q.s_().b().e("Failed to send current screen to the service", e);
        }
    }
}
