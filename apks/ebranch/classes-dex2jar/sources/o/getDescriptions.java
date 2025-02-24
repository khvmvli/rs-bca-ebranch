package o;

import java.util.List;
import okhttp3.HttpUrl;
/* loaded from: classes-dex2jar.jar:o/getDescriptions.class */
public final class getDescriptions {
    public static final read d = new read((byte) 0);
    public final String a;
    public final String b;
    private final int c;
    private final String e;
    private final String f;

    /* loaded from: classes-dex2jar.jar:o/getDescriptions$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static getDescriptions a(HttpUrl httpUrl) {
            String str;
            List<String> pathSegments = httpUrl.pathSegments();
            subscribeReservationRescheduleEvent.d(pathSegments, "");
            String c = onClickUbahDataAlamatIdentitas.c(pathSegments, "/", null, null, 0, null, null, 62);
            String scheme = httpUrl.scheme();
            subscribeReservationRescheduleEvent.d(scheme, "");
            String host = httpUrl.host();
            subscribeReservationRescheduleEvent.d(host, "");
            int port = httpUrl.port();
            if (!CheckOTPSessionPresenter.a(c)) {
                StringBuilder sb = new StringBuilder("/");
                sb.append(c);
                str = sb.toString();
            } else {
                str = "";
            }
            String query = httpUrl.query();
            if (query == null) {
                query = "";
            }
            return new getDescriptions(scheme, host, port, str, query, (byte) 0);
        }

        public static getDescriptions c(HttpUrl httpUrl) {
            String str;
            List<String> encodedPathSegments = httpUrl.encodedPathSegments();
            subscribeReservationRescheduleEvent.d(encodedPathSegments, "");
            String c = onClickUbahDataAlamatIdentitas.c(encodedPathSegments, "/", null, null, 0, null, null, 62);
            String scheme = httpUrl.scheme();
            subscribeReservationRescheduleEvent.d(scheme, "");
            String host = httpUrl.host();
            subscribeReservationRescheduleEvent.d(host, "");
            int port = httpUrl.port();
            if (!CheckOTPSessionPresenter.a(c)) {
                StringBuilder sb = new StringBuilder("/");
                sb.append(c);
                str = sb.toString();
            } else {
                str = "";
            }
            String encodedQuery = httpUrl.encodedQuery();
            if (encodedQuery == null) {
                encodedQuery = "";
            }
            return new getDescriptions(scheme, host, port, str, encodedQuery, (byte) 0);
        }

        public final getDescriptions c(HttpUrl httpUrl, boolean z) {
            subscribeReservationRescheduleEvent.e(httpUrl, "");
            return z ? c(httpUrl) : a(httpUrl);
        }
    }

    private getDescriptions(String str, String str2, int i, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.e = str3;
        this.f = str4;
    }

    public /* synthetic */ getDescriptions(String str, String str2, int i, String str3, String str4, byte b) {
        this(str, str2, i, str3, str4);
    }

    private final boolean a() {
        if (!subscribeReservationRescheduleEvent.b((Object) this.a, (Object) "https") || this.c != 443) {
            return !subscribeReservationRescheduleEvent.b((Object) this.a, (Object) "http") || this.c != 80;
        }
        return false;
    }

    public final String b() {
        String str;
        if (CheckOTPSessionPresenter.a(this.f)) {
            str = this.e;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.e);
            sb.append('?');
            sb.append(this.f);
            str = sb.toString();
        }
        return str;
    }

    public final String e() {
        String str;
        if (a()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("://");
            sb.append(this.b);
            sb.append(':');
            sb.append(this.c);
            sb.append(b());
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.a);
            sb2.append("://");
            sb2.append(this.b);
            sb2.append(b());
            str = sb2.toString();
        }
        return str;
    }
}
