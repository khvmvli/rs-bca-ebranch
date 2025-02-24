package o;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
/* loaded from: classes-dex2jar.jar:o/setOldCustFlag.class */
public final class setOldCustFlag extends setOccupationValue {
    private setCitizenValue a;
    private final int b;

    public setOldCustFlag(setCitizenValue setcitizenvalue, int i) {
        this.a = setcitizenvalue;
        this.b = i;
    }

    @Override // o.setFlagDifResidency
    public final void b(int i, IBinder iBinder, Bundle bundle) {
        setFotoKtp.a(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.a(i, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override // o.setFlagDifResidency
    public final void c(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // o.setFlagDifResidency
    public final void d(int i, IBinder iBinder, setReligion setreligion) {
        setCitizenValue setcitizenvalue = this.a;
        setFotoKtp.a(setcitizenvalue, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        setFotoKtp.b(setreligion);
        setCitizenValue.c(setcitizenvalue, setreligion);
        b(i, iBinder, setreligion.d);
    }
}
