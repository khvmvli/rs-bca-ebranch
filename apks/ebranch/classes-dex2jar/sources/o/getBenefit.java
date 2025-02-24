package o;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.server.http.HttpHeaders;
import io.realm.internal.Property;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* loaded from: classes-dex2jar.jar:o/getBenefit.class */
public final class getBenefit implements Interceptor {
    private static int a = 0;
    private static long b = 346972661452567115L;
    private static int c = 1;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x013e, code lost:
        if (r10 != null) goto L_0x0144;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0154 A[Catch: all -> 0x015b, TRY_ENTER, TryCatch #3 {, blocks: (B:20:0x0144, B:29:0x0154, B:31:0x015a), top: B:36:0x0002 }] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private java.net.HttpURLConnection a() {
        /*
        // Method dump skipped, instructions count: 354
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getBenefit.a():java.net.HttpURLConnection");
    }

    private static String b(RequestBody requestBody) throws IOException {
        setResponseContentType setresponsecontenttype = new setResponseContentType();
        if ((requestBody != null ? (char) 22 : 6) != 22) {
            int i = c + 31;
            a = i % Property.TYPE_ARRAY;
            if ((i % 2 != 0 ? '\t' : 'D') == 'D') {
                return "";
            }
            throw new ArithmeticException("divide by zero");
        }
        a = (c + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
        try {
            requestBody.writeTo(setresponsecontenttype);
            try {
                return setresponsecontenttype.t();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static boolean c(HttpURLConnection httpURLConnection) {
        if ((httpURLConnection instanceof HttpsURLConnection ? 'X' : 'J') != 'X') {
            return true;
        }
        c = (a + 41) % Property.TYPE_ARRAY;
        try {
            Certificate[] serverCertificates = ((HttpsURLConnection) httpURLConnection).getServerCertificates();
            int length = serverCertificates.length;
            int i = 0;
            while (true) {
                if ((i < length ? '8' : ' ') != '8') {
                    return false;
                }
                Certificate certificate = serverCertificates[i];
                if (certificate instanceof X509Certificate) {
                    String a2 = isChecked.a(((RSAPublicKey) certificate.getPublicKey()).getModulus().toString(16));
                    Object[] objArr = new Object[1];
                    e(new char[]{50827, 52594, 50879, 55855, 16218, 16009, 6283, 52828, 3998, 30257, 30687, 47282, 21687, 18916, 44278, 29143, 40251, 32910, 39431, 10966, 57951, 56241, 54104, 58233, 11058, 11618, 2104, 56403, 29159, 25669, 16773, 38228, 18060, 48955, 48849, 20477, 36746, 63200, 63470, 14585, 54334, 51603, 11578, 61918, 7506, 839, 6737, 43557, 25179, 23103, 21303, 25386, 43258, 44367, 35048, 23619, 61909, 58566, 49612, 5796, 50903, 16371, 16098, 53234, 3963, 30415, 29793, 47310}, -TextUtils.lastIndexOf("", '0', 0), objArr);
                    if (!(!a2.equals(((String) objArr[0]).intern()))) {
                        int i2 = c + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct;
                        a = i2 % Property.TYPE_ARRAY;
                        if (i2 % 2 != 0) {
                        }
                        return true;
                    }
                }
                i++;
            }
        } catch (Exception e) {
            return false;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) {
        String str;
        synchronized (CC23CFormKartuKreditFragment.b) {
            char[] b2 = CC23CFormKartuKreditFragment.b(b, cArr, i);
            CC23CFormKartuKreditFragment.a = 4;
            while (CC23CFormKartuKreditFragment.a < b2.length) {
                CC23CFormKartuKreditFragment.d = CC23CFormKartuKreditFragment.a - 4;
                b2[CC23CFormKartuKreditFragment.a] = (char) ((char) ((int) (((long) (b2[CC23CFormKartuKreditFragment.a] ^ b2[CC23CFormKartuKreditFragment.a % 4])) ^ (((long) CC23CFormKartuKreditFragment.d) * b))));
                CC23CFormKartuKreditFragment.a++;
            }
            str = new String(b2, 4, b2.length - 4);
        }
        objArr[0] = str;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Response response;
        BN5PilihRekeningFragment_ViewBinding bN5PilihRekeningFragment_ViewBinding;
        boolean z = true;
        if (!c(a())) {
            response = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(495).message("Pastikan koneksi internet aman dan telah menggunakan eBranch versi terbaru.").body(ResponseBody.create(MediaType.parse("text/html; charset=UTF-8"), "Pastikan koneksi internet aman dan telah menggunakan eBranch versi terbaru.")).build();
        } else {
            Request request = chain.request();
            RequestBody body = request.body();
            Object obj = null;
            Request request2 = request;
            if (body != null) {
                Request.Builder newBuilder = request.newBuilder();
                requestOTP requestotp = new requestOTP();
                try {
                    String obj2 = new StringBuilder(new String(Base64.encode(b(body).getBytes(), 2), Utf8Charset.NAME)).reverse().toString();
                    if (obj2 == null) {
                        int i = c + 47;
                        a = i % Property.TYPE_ARRAY;
                        if (!(i % 2 != 0)) {
                            bN5PilihRekeningFragment_ViewBinding = onSelectNoRek.b;
                        } else {
                            onSelectNoRek onselectnorek = onSelectNoRek.b;
                            throw new NullPointerException();
                        }
                    } else {
                        bN5PilihRekeningFragment_ViewBinding = new onChooseTipeNasabah(obj2);
                    }
                    BaseFragment<String, BN5PilihRekeningFragment_ViewBinding> baseFragment = requestotp.a;
                    if (bN5PilihRekeningFragment_ViewBinding != null) {
                        z = false;
                    }
                    if (z) {
                        int i2 = c + 17;
                        a = i2 % Property.TYPE_ARRAY;
                        if ((i2 % 2 != 0 ? 7 : '4') != 7) {
                            bN5PilihRekeningFragment_ViewBinding = onSelectNoRek.b;
                        } else {
                            bN5PilihRekeningFragment_ViewBinding = onSelectNoRek.b;
                            Object[] objArr = null;
                            int length = objArr.length;
                        }
                    }
                    baseFragment.put("Alpha", bN5PilihRekeningFragment_ViewBinding);
                } catch (UnsupportedEncodingException e) {
                    Log.i("EBRANCH", String.valueOf(e));
                }
                try {
                    request2 = newBuilder.method(request.method(), RequestBody.create(body.contentType(), requestotp.toString())).build();
                } catch (Exception e2) {
                    throw e2;
                }
            }
            Response proceed = chain.proceed(request2);
            if ((proceed.isSuccessful() ? (char) 24 : 28) != 24) {
                response = proceed;
            } else {
                Response.Builder newBuilder2 = proceed.newBuilder();
                String header = proceed.header(HttpHeaders.CONTENT_TYPE);
                String str = header;
                if (TextUtils.isEmpty(header)) {
                    str = "application/json";
                }
                BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding = new BN5PilihNomorOTPFragment_ViewBinding();
                String string = proceed.body().string();
                if (string == null) {
                    int i3 = a + 19;
                    c = i3 % Property.TYPE_ARRAY;
                    if (i3 % 2 == 0) {
                        throw new ArithmeticException("divide by zero");
                    }
                } else {
                    obj = bN5PilihNomorOTPFragment_ViewBinding.b(new StringReader(string), PenggantianKartuATMActivity.class);
                }
                PenggantianKartuATMActivity penggantianKartuATMActivity = (PenggantianKartuATMActivity) onChooseValueFotoID.e(PenggantianKartuATMActivity.class).cast(obj);
                StringBuilder sb = new StringBuilder(penggantianKartuATMActivity.b);
                sb.reverse();
                try {
                    penggantianKartuATMActivity.b = new String(Base64.decode(sb.toString(), 2), Utf8Charset.NAME);
                } catch (UnsupportedEncodingException e3) {
                    Log.i("EBRANCH", String.valueOf(e3));
                }
                newBuilder2.body(ResponseBody.create(MediaType.parse(str), penggantianKartuATMActivity.b));
                return newBuilder2.build();
            }
        }
        return response;
    }
}
