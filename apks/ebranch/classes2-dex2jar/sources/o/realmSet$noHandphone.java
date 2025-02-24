package o;

import android.os.Bundle;
import android.text.TextUtils;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:o/realmSet$noHandphone.class */
public final class realmSet$noHandphone implements setBankTransfers {
    final /* synthetic */ realmSet$kirimanUangs c;

    public realmSet$noHandphone(realmSet$kirimanUangs realmset_kirimanuangs) {
        this.c = realmset_kirimanuangs;
    }

    @Override // o.setBankTransfers
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.c.o_().b(new Runnable(str, "_err", bundle) { // from class: o.realmSet$klirings
                final /* synthetic */ Bundle a;
                final /* synthetic */ String b = "_err";
                final /* synthetic */ String c;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.c = r5;
                    this.a = r7;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    realmSet$noHandphone.this.c.b((realmGet.tipeNasabah) setFotoKtp.b(realmSet$noHandphone.this.c.y().d(this.c, this.b, this.a, "auto", realmSet$noHandphone.this.c.q_().e(), false, false)), this.c);
                }
            });
        } else if (this.c.f91o != null) {
            this.c.f91o.s_().b().e("AppId not known when logging event", "_err");
        }
    }
}
