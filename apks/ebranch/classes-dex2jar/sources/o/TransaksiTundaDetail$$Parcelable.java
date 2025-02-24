package o;

import android.util.Base64;
import o.getFlagReservasi;
/* loaded from: classes-dex2jar.jar:o/TransaksiTundaDetail$$Parcelable.class */
public abstract class TransaksiTundaDetail$$Parcelable {

    /* loaded from: classes-dex2jar.jar:o/TransaksiTundaDetail$$Parcelable$RemoteActionCompatParcelizer.class */
    public static abstract class RemoteActionCompatParcelizer {
        public abstract RemoteActionCompatParcelizer a(byte[] bArr);

        public abstract RemoteActionCompatParcelizer d(getTxbDate gettxbdate);

        public abstract RemoteActionCompatParcelizer e(String str);

        public abstract TransaksiTundaDetail$$Parcelable e();
    }

    public static RemoteActionCompatParcelizer e() {
        getFlagReservasi.IconCompatParcelizer iconCompatParcelizer = new getFlagReservasi.IconCompatParcelizer();
        getTxbDate gettxbdate = getTxbDate.DEFAULT;
        if (gettxbdate != null) {
            iconCompatParcelizer.d = gettxbdate;
            return iconCompatParcelizer;
        }
        throw new NullPointerException("Null priority");
    }

    public abstract getTxbDate a();

    public abstract byte[] b();

    public abstract String c();

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", c(), a(), b() == null ? "" : Base64.encodeToString(b(), 2));
    }
}
