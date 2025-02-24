package o;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.List;
import o.realmGet$name.RemoteActionCompatParcelizer;
import o.realmGet$occupation;
/* loaded from: classes-dex2jar.jar:o/realmGet$name.class */
public final class realmGet$name<O extends RemoteActionCompatParcelizer> {
    public final String b;
    final realmGet$name$MediaBrowserCompat$MediaItem d;
    final IconCompatParcelizer e;

    /* loaded from: classes-dex2jar.jar:o/realmGet$name$IconCompatParcelizer.class */
    public static abstract class IconCompatParcelizer<T extends realmGet$name$MediaBrowserCompat$SearchResultReceiver, O> extends write<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, setDob setdob, O o2, realmGet$occupation.IconCompatParcelizer iconCompatParcelizer, realmGet$occupation.read read) {
            return b(context, looper, setdob, o2, iconCompatParcelizer, read);
        }

        public T b(Context context, Looper looper, setDob setdob, O o2, realmGet$resCountry realmget_rescountry, realmGet$resProvince realmget_resprovince) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* loaded from: classes-dex2jar.jar:o/realmGet$name$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        public static final C0006RemoteActionCompatParcelizer d = new C0006RemoteActionCompatParcelizer((byte) 0);

        /* renamed from: o.realmGet$name$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer */
        /* loaded from: classes-dex2jar.jar:o/realmGet$name$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer.class */
        public static final class C0006RemoteActionCompatParcelizer implements realmGet$motherMaidenName {
            private C0006RemoteActionCompatParcelizer() {
            }

            /* synthetic */ C0006RemoteActionCompatParcelizer(byte b) {
            }
        }

        /* loaded from: classes-dex2jar.jar:o/realmGet$name$RemoteActionCompatParcelizer$read.class */
        public interface read extends realmGet$maritalStatusValue, realmGet$motherMaidenName {
            Account a();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/realmGet$name$read.class */
    public static class read<C extends realmGet$name$MediaBrowserCompat$CustomActionResultReceiver> {
    }

    /* loaded from: classes-dex2jar.jar:o/realmGet$name$write.class */
    public static abstract class write<T extends realmGet$name$MediaBrowserCompat$CustomActionResultReceiver, O> {
        public List<Scope> b(O o2) {
            return Collections.emptyList();
        }

        public int c() {
            return Integer.MAX_VALUE;
        }
    }

    public <C extends realmGet$name$MediaBrowserCompat$SearchResultReceiver> realmGet$name(String str, IconCompatParcelizer<C, O> iconCompatParcelizer, realmGet$name$MediaBrowserCompat$MediaItem<C> realmget_name_mediabrowsercompat_mediaitem) {
        if (iconCompatParcelizer == null) {
            throw new NullPointerException("Cannot construct an Api with a null ClientBuilder");
        } else if (realmget_name_mediabrowsercompat_mediaitem != null) {
            this.b = str;
            this.e = iconCompatParcelizer;
            this.d = realmget_name_mediabrowsercompat_mediaitem;
        } else {
            throw new NullPointerException("Cannot construct an Api with a null ClientKey");
        }
    }

    public final IconCompatParcelizer a() {
        return this.e;
    }

    public final write b() {
        return this.e;
    }

    public final String c() {
        return this.b;
    }

    public final read d() {
        return this.d;
    }
}
