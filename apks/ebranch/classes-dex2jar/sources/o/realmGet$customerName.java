package o;

import android.os.Bundle;
import o.realmSet;
/* loaded from: classes-dex2jar.jar:o/realmGet$customerName.class */
final class realmGet$customerName extends isKrisFlyer {
    private final realmSet.SourceAccountOwnerType d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmGet$customerName(realmSet.SourceAccountOwnerType sourceAccountOwnerType) {
        this.d = sourceAccountOwnerType;
    }

    @Override // o.getSelectedCardOptions
    public final int e() {
        return System.identityHashCode(this.d);
    }

    @Override // o.getSelectedCardOptions
    public final void e(String str, String str2, Bundle bundle, long j) {
        this.d.d(str, str2, bundle, j);
    }
}
