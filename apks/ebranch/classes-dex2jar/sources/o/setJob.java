package o;

import android.os.Bundle;
import o.setCitizenValue;
/* loaded from: classes-dex2jar.jar:o/setJob.class */
final class setJob implements setCitizenValue.IconCompatParcelizer {
    final /* synthetic */ realmGet$resCountry b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setJob(realmGet$resCountry realmget_rescountry) {
        this.b = realmget_rescountry;
    }

    @Override // o.setCitizenValue.IconCompatParcelizer
    public final void a(int i) {
        this.b.e(i);
    }

    @Override // o.setCitizenValue.IconCompatParcelizer
    public final void b(Bundle bundle) {
        this.b.e(bundle);
    }
}
