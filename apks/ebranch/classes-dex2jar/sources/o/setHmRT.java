package o;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
/* loaded from: classes-dex2jar.jar:o/setHmRT.class */
public final class setHmRT extends setDollarCurrCode {
    private final setHmCity h;

    public setHmRT(Context context, Looper looper, setDob setdob, setHmCity sethmcity, realmGet$resCountry realmget_rescountry, realmGet$resProvince realmget_resprovince) {
        super(context, looper, 270, setdob, realmget_rescountry, realmget_resprovince);
        this.h = sethmcity;
    }

    @Override // o.setCitizenValue
    public final String A() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // o.setCitizenValue
    public final boolean B() {
        return true;
    }

    @Override // o.setCitizenValue
    public final String D() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // o.setCitizenValue, o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final int a() {
        return 203400000;
    }

    @Override // o.setCitizenValue
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        setHmPostCode sethmpostcode;
        if (iBinder == null) {
            sethmpostcode = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
            sethmpostcode = queryLocalInterface instanceof setHmPostCode ? (setHmPostCode) queryLocalInterface : new setHmPostCode(iBinder);
        }
        return sethmpostcode;
    }

    @Override // o.setCitizenValue
    public final realmGet$job[] q() {
        return setSumberDanaTransaksiCode.e;
    }

    @Override // o.setCitizenValue
    public final Bundle w() {
        return this.h.c();
    }
}
