package o;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setResPostCode.class */
public final class setResPostCode implements Handler.Callback {
    final /* synthetic */ setResRT d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setResPostCode(setResRT setresrt, setResProvince setresprovince) {
        this.d = setresrt;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.d.c) {
                setResCountry setrescountry = (setResCountry) message.obj;
                setResCity setrescity = (setResCity) this.d.c.get(setrescountry);
                if (setrescity != null && setrescity.b()) {
                    if (setrescity.a()) {
                        setrescity.a("GmsClientSupervisor");
                    }
                    this.d.c.remove(setrescountry);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.d.c) {
                setResCountry setrescountry2 = (setResCountry) message.obj;
                setResCity setrescity2 = (setResCity) this.d.c.get(setrescountry2);
                if (setrescity2 != null && setrescity2.e() == 3) {
                    String valueOf = String.valueOf(setrescountry2);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                    ComponentName c = setrescity2.c();
                    ComponentName componentName = c;
                    if (c == null) {
                        componentName = setrescountry2.e();
                    }
                    ComponentName componentName2 = componentName;
                    if (componentName == null) {
                        String d = setrescountry2.d();
                        setFotoKtp.b(d);
                        componentName2 = new ComponentName(d, "unknown");
                    }
                    setrescity2.onServiceDisconnected(componentName2);
                }
            }
            return true;
        }
    }
}
