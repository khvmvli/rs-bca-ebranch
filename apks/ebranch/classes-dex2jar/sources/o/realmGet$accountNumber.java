package o;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Map;
import o.BankTransferPenerima$$Parcelable;
import o.realmGet$occupation;
import o.realmGet$resRT;
/* loaded from: classes-dex2jar.jar:o/realmGet$accountNumber.class */
public final class realmGet$accountNumber extends realmGet$cardNumber {
    private final BankTransferPenerima$$Parcelable.AnonymousClass1 g;

    public realmGet$accountNumber(Context context, Looper looper, realmGet$occupation.IconCompatParcelizer iconCompatParcelizer, realmGet$occupation.read read, String str, setDob setdob) {
        super(context, looper, iconCompatParcelizer, read, str, setdob);
        this.g = new Object(context, this.h) { // from class: o.BankTransferPenerima$$Parcelable.1
            private final realmGet$bankName<setMetodePengirimanPenerima> b;
            private final Context d;
            private boolean c = false;
            private final Map<realmGet$resRT.RemoteActionCompatParcelizer<realmSet$CodewordBankPenerima>, setStatusPendudukPenerima> a = new HashMap();
            private final Map<realmGet$resRT.RemoteActionCompatParcelizer, setTipeNasabahPenerima> e = new HashMap();
            private final Map<realmGet$resRT.RemoteActionCompatParcelizer<realmSet$BeritaTransaksi>, setTipeNasabahPenerimaId> j = new HashMap();

            {
                this.d = r5;
                this.b = r6;
            }

            public final void a() throws RemoteException {
                synchronized (this.a) {
                    for (setStatusPendudukPenerima setstatuspendudukpenerima : this.a.values()) {
                        if (setstatuspendudukpenerima != null) {
                            ((getCardNumber) this.b).e().b(realmSet$accountNumber.a(setstatuspendudukpenerima, null));
                        }
                    }
                    this.a.clear();
                }
                synchronized (this.j) {
                    for (setTipeNasabahPenerimaId settipenasabahpenerimaid : this.j.values()) {
                        if (settipenasabahpenerimaid != null) {
                            ((getCardNumber) this.b).e().b(realmSet$accountNumber.d(settipenasabahpenerimaid, null));
                        }
                    }
                    this.j.clear();
                }
                synchronized (this.e) {
                    for (setTipeNasabahPenerima settipenasabahpenerima : this.e.values()) {
                        if (settipenasabahpenerima != null) {
                            ((getCardNumber) this.b).e().d(new realmSet$expired(2, null, settipenasabahpenerima, null));
                        }
                    }
                    this.e.clear();
                }
            }

            public final void b(boolean z) throws RemoteException {
                realmGet$cardNumber.d(((getCardNumber) this.b).e);
                ((getCardNumber) this.b).e().e(z);
                this.c = z;
            }

            public final void d() throws RemoteException {
                if (this.c) {
                    b(false);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void d(LocationRequest locationRequest, realmGet$resRT<realmSet$CodewordBankPenerima> realmget_resrt, setBankTujuanPenerima setbanktujuanpenerima) throws RemoteException {
                setStatusPendudukPenerima setstatuspendudukpenerima;
                setStatusPendudukPenerima setstatuspendudukpenerima2;
                realmGet$cardNumber.d(((getCardNumber) this.b).e);
                realmGet$resRT.RemoteActionCompatParcelizer<realmSet$CodewordBankPenerima> b = realmget_resrt.b();
                if (b == null) {
                    setstatuspendudukpenerima = null;
                } else {
                    synchronized (this.a) {
                        setStatusPendudukPenerima setstatuspendudukpenerima3 = this.a.get(b);
                        setstatuspendudukpenerima2 = setstatuspendudukpenerima3;
                        if (setstatuspendudukpenerima3 == null) {
                            setstatuspendudukpenerima2 = new setStatusPendudukPenerima(realmget_resrt);
                        }
                        this.a.put(b, setstatuspendudukpenerima2);
                    }
                    setstatuspendudukpenerima = setstatuspendudukpenerima2;
                }
                if (setstatuspendudukpenerima != null) {
                    ((getCardNumber) this.b).e().b(new realmSet$accountNumber(1, C0008getAccounttype.a(null, locationRequest), setstatuspendudukpenerima, null, null, setbanktujuanpenerima));
                }
            }
        };
    }

    @Override // o.setCitizenValue
    public final boolean I() {
        return true;
    }

    public final void a(realmSet$FlagHubunganKeuanganTransaksi realmset_flaghubungankeuangantransaksi, realmGet$religionOthers$MediaBrowserCompat$CustomActionResultReceiver<realmSet$FlagBicCode> realmget_religionothers_mediabrowsercompat_customactionresultreceiver, String str) throws RemoteException {
        l();
        boolean z = false;
        setFotoKtp.d(realmset_flaghubungankeuangantransaksi != null, "locationSettingsRequest can't be null nor empty.");
        if (realmget_religionothers_mediabrowsercompat_customactionresultreceiver != null) {
            z = true;
        }
        setFotoKtp.d(z, "listener can't be null.");
        ((setMetodePengirimanPenerima) u()).e(realmset_flaghubungankeuangantransaksi, new setNamaPenerima(realmget_religionothers_mediabrowsercompat_customactionresultreceiver) { // from class: o.BankTransferPenerima$$Parcelable
            private realmGet$religionOthers$MediaBrowserCompat$CustomActionResultReceiver<realmSet$FlagBicCode> a;

            {
                setFotoKtp.d(r4 != null, "listener can't be null.");
                this.a = r4;
            }

            @Override // o.setBiayaTransfer
            public final void c(realmSet$FlagBicCode realmset_flagbiccode) throws RemoteException {
                this.a.d(realmset_flagbiccode);
                this.a = null;
            }
        }, null);
    }

    public final void c(LocationRequest locationRequest, realmGet$resRT<realmSet$CodewordBankPenerima> realmget_resrt, setBankTujuanPenerima setbanktujuanpenerima) throws RemoteException {
        synchronized (this.g) {
            this.g.d(locationRequest, realmget_resrt, setbanktujuanpenerima);
        }
    }

    @Override // o.setCitizenValue, o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final void e() {
        synchronized (this.g) {
            if (j()) {
                try {
                    this.g.a();
                    this.g.d();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            e();
        }
    }
}
