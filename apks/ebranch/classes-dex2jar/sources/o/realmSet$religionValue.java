package o;

import android.util.Log;
import o.realmGet$occupation;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmSet$religionValue.class */
public final class realmSet$religionValue implements realmGet$occupation.read {
    public final realmGet$occupation.read b;
    public final realmGet$occupation c;
    final /* synthetic */ realmSet$resAddress d;
    public final int e;

    public realmSet$religionValue(realmSet$resAddress realmset_resaddress, int i, realmGet$occupation realmget_occupation, realmGet$occupation.read read) {
        this.d = realmset_resaddress;
        this.e = i;
        this.c = realmget_occupation;
        this.b = read;
    }

    @Override // o.realmGet$resProvince
    public final void b(realmGet$jobValue realmget_jobvalue) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(String.valueOf(realmget_jobvalue))));
        this.d.b(realmget_jobvalue, this.e);
    }
}
