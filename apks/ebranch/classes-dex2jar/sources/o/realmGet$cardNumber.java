package o;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import o.realmGet$occupation;
/* loaded from: classes-dex2jar.jar:o/realmGet$cardNumber.class */
public class realmGet$cardNumber extends setDollarCurrCode<setMetodePengirimanPenerima> {
    private final String g;
    protected final realmGet$bankName<setMetodePengirimanPenerima> h = new getCardNumber(this);

    public realmGet$cardNumber(Context context, Looper looper, realmGet$occupation.IconCompatParcelizer iconCompatParcelizer, realmGet$occupation.read read, String str, setDob setdob) {
        super(context, looper, 23, setdob, iconCompatParcelizer, read);
        this.g = str;
    }

    public static /* synthetic */ void d(realmGet$cardNumber realmget_cardnumber) {
        realmget_cardnumber.l();
    }

    @Override // o.setCitizenValue
    public final String A() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // o.setCitizenValue
    public final String D() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // o.setCitizenValue, o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final int a() {
        return 11717000;
    }

    @Override // o.setCitizenValue
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        IInterface iInterface;
        if (iBinder == null) {
            iInterface = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            iInterface = queryLocalInterface instanceof setMetodePengirimanPenerima ? (setMetodePengirimanPenerima) queryLocalInterface : new setBeritaPenerima(iBinder);
        }
        return iInterface;
    }

    @Override // o.setCitizenValue
    public final realmGet$job[] q() {
        return realmSet$NegaraBagianBankPenerima.j;
    }

    @Override // o.setCitizenValue
    public final Bundle w() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.g);
        return bundle;
    }
}
