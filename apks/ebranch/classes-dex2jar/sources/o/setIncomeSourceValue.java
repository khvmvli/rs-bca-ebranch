package o;

import android.content.Intent;
import androidx.fragment.app.Fragment;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setIncomeSourceValue.class */
public final class setIncomeSourceValue extends setHphoneMB {
    final /* synthetic */ int b;
    final /* synthetic */ Fragment c;
    final /* synthetic */ Intent e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setIncomeSourceValue(Intent intent, Fragment fragment, int i) {
        this.e = intent;
        this.c = fragment;
        this.b = i;
    }

    @Override // o.setHphoneMB
    public final void a() {
        Intent intent = this.e;
        if (intent != null) {
            this.c.startActivityForResult(intent, this.b);
        }
    }
}
