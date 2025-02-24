package o;

import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setIncomeSource.class */
public final class setIncomeSource extends setHphoneMB {
    final /* synthetic */ realmGet$religionValue a;
    final /* synthetic */ Intent c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setIncomeSource(Intent intent, realmGet$religionValue realmget_religionvalue, int i) {
        this.c = intent;
        this.a = realmget_religionvalue;
    }

    @Override // o.setHphoneMB
    public final void a() {
        Intent intent = this.c;
        if (intent != null) {
            this.a.startActivityForResult(intent, 2);
        }
    }
}
