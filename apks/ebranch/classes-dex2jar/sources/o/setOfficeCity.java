package o;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setOfficeCity.class */
public final class setOfficeCity extends getTipeNasabahPenerima {
    final /* synthetic */ setCitizenValue a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setOfficeCity(setCitizenValue setcitizenvalue, Looper looper) {
        super(looper);
        this.a = setcitizenvalue;
    }

    private static final void c(Message message) {
        setOfficeProvince setofficeprovince = (setOfficeProvince) message.obj;
        setofficeprovince.e();
        setofficeprovince.a();
    }

    private static final boolean e(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a.d.get() != message.arg1) {
            if (e(message)) {
                c(message);
            }
        } else if ((message.what == 1 || message.what == 7 || ((message.what == 4 && !this.a.k()) || message.what == 5)) && !this.a.f()) {
            c(message);
        } else {
            PendingIntent pendingIntent = null;
            if (message.what == 4) {
                this.a.g = new realmGet$jobValue(message.arg2);
                if (setCitizenValue.j(this.a)) {
                    setCitizenValue setcitizenvalue = this.a;
                    if (!(setcitizenvalue.f)) {
                        setcitizenvalue.d(3, (IInterface) null);
                        return;
                    }
                }
                setCitizenValue setcitizenvalue2 = this.a;
                realmGet$jobValue realmget_jobvalue = setcitizenvalue2.g != null ? setcitizenvalue2.g : new realmGet$jobValue(8);
                this.a.a.c(realmget_jobvalue);
                this.a.a(realmget_jobvalue);
            } else if (message.what == 5) {
                setCitizenValue setcitizenvalue3 = this.a;
                realmGet$jobValue realmget_jobvalue2 = setcitizenvalue3.g != null ? setcitizenvalue3.g : new realmGet$jobValue(8);
                this.a.a.c(realmget_jobvalue2);
                this.a.a(realmget_jobvalue2);
            } else if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                realmGet$jobValue realmget_jobvalue3 = new realmGet$jobValue(message.arg2, pendingIntent);
                this.a.a.c(realmget_jobvalue3);
                this.a.a(realmget_jobvalue3);
            } else if (message.what == 6) {
                this.a.d(5, (IInterface) null);
                setCitizenValue setcitizenvalue4 = this.a;
                if (setcitizenvalue4.A != null) {
                    setcitizenvalue4.A.a(message.arg2);
                }
                this.a.e(message.arg2);
                setCitizenValue.a(this.a, 5, 1, (IInterface) null);
            } else if (message.what == 2 && !this.a.j()) {
                c(message);
            } else if (e(message)) {
                ((setOfficeProvince) message.obj).c();
            } else {
                int i = message.what;
                Log.wtf("GmsClient", "Don't know how to handle message: " + i, new Exception());
            }
        }
    }
}
