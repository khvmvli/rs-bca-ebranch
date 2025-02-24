package o;

import android.content.Context;
import android.os.Looper;
import o.realmGet$name;
import o.realmGet$occupation;
/* loaded from: classes-dex2jar.jar:o/realmSet$AlamatLengkapPenerima.class */
public final class realmSet$AlamatLengkapPenerima {
    private static final realmGet$name$MediaBrowserCompat$MediaItem<realmGet$accountNumber> a;
    public static final realmGet$name<realmGet$name.RemoteActionCompatParcelizer.C0006RemoteActionCompatParcelizer> d;
    private static final realmGet$name.IconCompatParcelizer<realmGet$accountNumber, realmGet$name.RemoteActionCompatParcelizer.C0006RemoteActionCompatParcelizer> h;
    @Deprecated
    public static final realmSet$BankBicKey b = new realmSet$code();
    @Deprecated
    public static final realmSet$AlamatBankPenerima c = new setBankTujuanCode();
    @Deprecated
    public static final realmSet$FlagAlamatBankPenerimaBelumSesuai e = new C0032setAccounttype();

    static {
        realmGet$name$MediaBrowserCompat$MediaItem<realmGet$accountNumber> realmget_name_mediabrowsercompat_mediaitem = new realmGet$name$MediaBrowserCompat$MediaItem<>();
        a = realmget_name_mediabrowsercompat_mediaitem;
        realmSet$KategoriTujuanTransaksiKode realmset_kategoritujuantransaksikode = new realmGet$name.IconCompatParcelizer<realmGet$accountNumber, realmGet$name.RemoteActionCompatParcelizer.C0006RemoteActionCompatParcelizer>() { // from class: o.realmSet$KategoriTujuanTransaksiKode
            @Override // o.realmGet$name.IconCompatParcelizer
            public final /* synthetic */ realmGet$accountNumber a(Context context, Looper looper, setDob setdob, realmGet$name.RemoteActionCompatParcelizer.C0006RemoteActionCompatParcelizer remoteActionCompatParcelizer, realmGet$occupation.IconCompatParcelizer iconCompatParcelizer, realmGet$occupation.read read) {
                return new realmGet$accountNumber(context, looper, iconCompatParcelizer, read, "locationServices", setdob);
            }
        };
        h = realmset_kategoritujuantransaksikode;
        d = new realmGet$name<>("LocationServices.API", realmset_kategoritujuantransaksikode, realmget_name_mediabrowsercompat_mediaitem);
    }
}
