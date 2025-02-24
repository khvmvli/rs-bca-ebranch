package o;

import android.os.Bundle;
/* loaded from: classes-dex2jar.jar:o/setBusinessFieldFlagFreeText.class */
final class setBusinessFieldFlagFreeText implements Runnable {
    final /* synthetic */ realmGet$resAddress b;
    final /* synthetic */ String c;
    final /* synthetic */ setAcctType d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setBusinessFieldFlagFreeText(setAcctType setaccttype, realmGet$resAddress realmget_resaddress, String str) {
        this.d = setaccttype;
        this.b = realmget_resaddress;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        setAcctType setaccttype = this.d;
        if (setaccttype.d > 0) {
            realmGet$resAddress realmget_resaddress = this.b;
            if (setaccttype.e != null) {
                bundle = setaccttype.e.getBundle(this.c);
            } else {
                bundle = null;
            }
            realmget_resaddress.e(bundle);
        }
        if (this.d.d >= 2) {
            this.b.c();
        }
        if (this.d.d >= 3) {
            this.b.e();
        }
        if (this.d.d >= 4) {
            this.b.b();
        }
        if (this.d.d >= 5) {
            this.b.a();
        }
    }
}
