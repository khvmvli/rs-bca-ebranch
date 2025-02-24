package o;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:o/realmGet$localClearingCodeBank.class */
public final class realmGet$localClearingCodeBank {
    static final realmGet.name.IconCompatParcelizer a;
    public static final realmGet.name.IconCompatParcelizer c;
    public static final realmGet.name.MediaBrowserCompat.MediaItem d;
    public static final realmGet.name.MediaBrowserCompat.MediaItem e;
    public static final realmGet.name g;
    public static final realmGet.name i;
    public static final Scope b = new Scope("profile");
    public static final Scope j = new Scope("email");

    static {
        realmGet.name.MediaBrowserCompat.MediaItem mediaItem = new realmGet.name.MediaBrowserCompat.MediaItem();
        e = mediaItem;
        realmGet.name.MediaBrowserCompat.MediaItem mediaItem2 = new realmGet.name.MediaBrowserCompat.MediaItem();
        d = mediaItem2;
        realmGet$jatuhTempo realmget_jatuhtempo = new realmGet.name.IconCompatParcelizer() { // from class: o.realmGet$jatuhTempo
            public final /* synthetic */ realmGet.name.MediaBrowserCompat.SearchResultReceiver a(Context context, Looper looper, setDob setdob, Object obj, realmGet.occupation.IconCompatParcelizer iconCompatParcelizer, realmGet.occupation.read read) {
                setNoHandphone setnohandphone = (setNoHandphone) obj;
                return new Warkat(context, looper, true, setdob, Warkat.e(setdob), iconCompatParcelizer, read);
            }
        };
        c = realmget_jatuhtempo;
        getNomorWarkat getnomorwarkat = new getNomorWarkat();
        a = getnomorwarkat;
        i = new realmGet.name("SignIn.API", realmget_jatuhtempo, mediaItem);
        g = new realmGet.name("SignIn.INTERNAL_API", getnomorwarkat, mediaItem2);
    }
}
