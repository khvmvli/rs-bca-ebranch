package o;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/realmSet$NegaraTujuanPenerimaISO.class */
public final class realmSet$NegaraTujuanPenerimaISO {
    private final Map a = new HashMap();
    private final Map c = new HashMap();
    private realmSet$PromoCode d;
    public final realmSet$StatusPendudukPenerima e;

    /* loaded from: classes-dex2jar.jar:o/realmSet$NegaraTujuanPenerimaISO$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        boolean c(setLimitMaxNominalTransaksi setlimitmaxnominaltransaksi);
    }

    public realmSet$NegaraTujuanPenerimaISO(realmSet$StatusPendudukPenerima realmset_statuspendudukpenerima) {
        if (realmset_statuspendudukpenerima != null) {
            this.e = realmset_statuspendudukpenerima;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final setLimitMaxNominalTransaksi a(setNamaBankPenerima setnamabankpenerima) {
        if (setnamabankpenerima instanceof setKategoriTujuanTransaksiKode) {
            setnamabankpenerima.d = 1;
        }
        try {
            if (setnamabankpenerima != null) {
                cascadeDelete a = this.e.a(setnamabankpenerima);
                if (a == null) {
                    return null;
                }
                return setnamabankpenerima.d == 1 ? new setKategoriTujuanTransaksi(a) : new setLimitMaxNominalTransaksi(a);
            }
            throw new NullPointerException("MarkerOptions must not be null.");
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void a(realmSet$NegaraBagianPenerima realmset_negarabagianpenerima) {
        try {
            if (realmset_negarabagianpenerima != null) {
                this.e.d(realmset_negarabagianpenerima.e);
                return;
            }
            throw new NullPointerException("CameraUpdate must not be null.");
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void a(realmSet$NegaraTujuanPenerimaISO$MediaBrowserCompat$CustomActionResultReceiver realmset_negaratujuanpenerimaiso_mediabrowsercompat_customactionresultreceiver) {
        try {
            this.e.c(new setAlamatBankPenerima(this, realmset_negaratujuanpenerimaiso_mediabrowsercompat_customactionresultreceiver) { // from class: o.KirimanUang$$Parcelable
                final /* synthetic */ realmSet$NegaraTujuanPenerimaISO$MediaBrowserCompat$CustomActionResultReceiver a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = r5;
                }

                @Override // o.AbstractC0033setBankBicKey
                public final void d(cascadeDelete cascadedelete) {
                    this.a.b(new setLimitMaxNominalTransaksi(cascadedelete));
                }
            });
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void b(realmSet$NegaraBagianPenerima realmset_negarabagianpenerima) {
        try {
            if (realmset_negarabagianpenerima != null) {
                this.e.b(realmset_negarabagianpenerima.e);
                return;
            }
            throw new NullPointerException("CameraUpdate must not be null.");
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final realmSet$PromoCode c() {
        try {
            if (this.d == null) {
                this.d = new realmSet$PromoCode(this.e.a());
            }
            return this.d;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final setKodePosPenerima c(setKotaBankPenerima setkotabankpenerima) {
        try {
            if (setkotabankpenerima != null) {
                return new setKodePosPenerima(this.e.e(setkotabankpenerima));
            }
            throw new NullPointerException("CircleOptions must not be null.");
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void d(IconCompatParcelizer iconCompatParcelizer) {
        try {
            this.e.c(new setPromoCode(this, iconCompatParcelizer));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final realmSet$NoIBANPenerima e() {
        try {
            return new realmSet$NoIBANPenerima(this.e.c());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
