package o;

import android.content.Context;
import o.realmGet$name;
import o.realmGet$numberID;
import o.realmGet$salaryValue;
/* loaded from: classes-dex2jar.jar:o/setHmCountry.class */
public final class setHmCountry extends realmGet$numberID implements setHandPhoneCountryCodeNumber {
    private static final realmGet$name a;
    public static final /* synthetic */ int b;
    private static final realmGet$name.IconCompatParcelizer d;
    private static final realmGet$name$MediaBrowserCompat$MediaItem e;

    static {
        realmGet$name$MediaBrowserCompat$MediaItem realmget_name_mediabrowsercompat_mediaitem = new realmGet$name$MediaBrowserCompat$MediaItem();
        e = realmget_name_mediabrowsercompat_mediaitem;
        setHmHouseStatus sethmhousestatus = new setHmHouseStatus();
        d = sethmhousestatus;
        a = new realmGet$name("ClientTelemetry.API", sethmhousestatus, realmget_name_mediabrowsercompat_mediaitem);
    }

    public setHmCountry(Context context, setHmCity sethmcity) {
        super(context, a, sethmcity, realmGet$numberID.read.c);
    }

    @Override // o.setHandPhoneCountryCodeNumber
    public final setJatuhTempo<Void> d(setHandPhoneNumber sethandphonenumber) {
        realmGet$salaryValue.read b2 = realmGet$salaryValue.b();
        b2.e(setSumberDanaTransaksiCode.a);
        b2.e(false);
        b2.a(new realmGet$salary() { // from class: o.setHmPhoneNumber
            @Override // o.realmGet$salary
            public final void b(Object obj, Object obj2) {
                int i = setHmCountry.b;
                ((setHmPostCode) ((setHmRT) obj).u()).d(setHandPhoneNumber.this);
                ((setJenisWarkat) obj2).e((setJenisWarkat) null);
            }
        });
        return d(b2.c());
    }
}
