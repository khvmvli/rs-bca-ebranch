package o;

import android.app.Activity;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setIncomeSourceOthers.class */
public final class setIncomeSourceOthers extends setHphoneMB {
    final /* synthetic */ int b;
    final /* synthetic */ Intent c;
    final /* synthetic */ Activity e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setIncomeSourceOthers(Intent intent, Activity activity, int i) {
        this.c = intent;
        this.e = activity;
        this.b = i;
    }

    @Override // o.setHphoneMB
    public final void a() {
        Intent intent = this.c;
        if (intent != null) {
            this.e.startActivityForResult(intent, this.b);
        }
    }
}
