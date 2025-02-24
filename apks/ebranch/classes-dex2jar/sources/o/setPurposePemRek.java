package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes-dex2jar.jar:o/setPurposePemRek.class */
public final class setPurposePemRek implements ServiceConnection {
    private final int a;
    final /* synthetic */ setCitizenValue d;

    public setPurposePemRek(setCitizenValue setcitizenvalue, int i) {
        this.d = setcitizenvalue;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        setCitizenValue setcitizenvalue = this.d;
        if (iBinder == null) {
            setCitizenValue.d(setcitizenvalue, 16);
            return;
        }
        synchronized (setcitizenvalue.w) {
            setCitizenValue setcitizenvalue2 = this.d;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            setcitizenvalue2.x = (queryLocalInterface == null || !(queryLocalInterface instanceof setEmailIB)) ? new setNpwp(iBinder) : (setEmailIB) queryLocalInterface;
        }
        this.d.a(0, null, this.a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.d.w) {
            this.d.x = null;
        }
        setCitizenValue setcitizenvalue = this.d;
        setcitizenvalue.c.sendMessage(setcitizenvalue.c.obtainMessage(6, this.a, 1));
    }
}
