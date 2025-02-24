package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
/* loaded from: classes-dex2jar.jar:o/setPob.class */
public final class setPob extends setMaritalStatusValue {
    public final IBinder e;
    final /* synthetic */ setCitizenValue f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setPob(setCitizenValue setcitizenvalue, int i, IBinder iBinder, Bundle bundle) {
        super(setcitizenvalue, i, bundle);
        this.f = setcitizenvalue;
        this.e = iBinder;
    }

    @Override // o.setMaritalStatusValue
    protected final void c(realmGet$jobValue realmget_jobvalue) {
        if (this.f.C != null) {
            this.f.C.b(realmget_jobvalue);
        }
        this.f.a(realmget_jobvalue);
    }

    @Override // o.setMaritalStatusValue
    protected final boolean d() {
        try {
            IBinder iBinder = this.e;
            setFotoKtp.b(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f.A().equals(interfaceDescriptor)) {
                String A = this.f.A();
                Log.w("GmsClient", "service descriptor mismatch: " + A + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface d = this.f.d(this.e);
            if (d == null) {
                return false;
            }
            if (!setCitizenValue.a(this.f, 2, 4, d) && !setCitizenValue.a(this.f, 3, 4, d)) {
                return false;
            }
            this.f.g = null;
            setCitizenValue setcitizenvalue = this.f;
            Bundle p = setcitizenvalue.p();
            if (setcitizenvalue.A == null) {
                return true;
            }
            this.f.A.b(p);
            return true;
        } catch (RemoteException e) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
