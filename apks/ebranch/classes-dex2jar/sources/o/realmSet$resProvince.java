package o;

import android.app.Dialog;
import android.app.PendingIntent;
/* loaded from: classes-dex2jar.jar:o/realmSet$resProvince.class */
public final class realmSet$resProvince implements Runnable {
    final /* synthetic */ realmSet$resPhoneNumber b;
    private final realmSet$resHouseStatus e;

    public realmSet$resProvince(realmSet$resPhoneNumber realmset_resphonenumber, realmSet$resHouseStatus realmset_reshousestatus) {
        this.b = realmset_resphonenumber;
        this.e = realmset_reshousestatus;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a) {
            realmGet$jobValue e = this.e.e();
            if (e.b()) {
                realmSet$resPhoneNumber realmset_resphonenumber = this.b;
                realmset_resphonenumber.e.startActivityForResult(realmGet$officeAddress.b(realmset_resphonenumber.d(), (PendingIntent) setFotoKtp.b(e.a()), this.e.b(), false), 1);
                return;
            }
            realmSet$resPhoneNumber realmset_resphonenumber2 = this.b;
            if (realmset_resphonenumber2.b.a(realmset_resphonenumber2.d(), e.d(), null) != null) {
                realmSet$resPhoneNumber realmset_resphonenumber3 = this.b;
                realmset_resphonenumber3.b.b(realmset_resphonenumber3.d(), realmset_resphonenumber3.e, e.d(), 2, this.b);
            } else if (e.d() == 18) {
                realmSet$resPhoneNumber realmset_resphonenumber4 = this.b;
                Dialog e2 = realmset_resphonenumber4.b.e(realmset_resphonenumber4.d(), realmset_resphonenumber4);
                realmSet$resPhoneNumber realmset_resphonenumber5 = this.b;
                realmset_resphonenumber5.b.c(realmset_resphonenumber5.d().getApplicationContext(), new realmSet$job(e2) { // from class: o.realmSet$resCity
                    final /* synthetic */ Dialog b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.b = r5;
                    }

                    @Override // o.realmSet$job
                    public final void d() {
                        realmSet$resProvince.this.b.i();
                        if (this.b.isShowing()) {
                            this.b.dismiss();
                        }
                    }
                });
            } else {
                this.b.d(e, this.e.b());
            }
        }
    }
}
