package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.server.http.HttpHeaders;
import com.facebook.stetho.server.http.HttpStatus;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import o.TransaksiTunda$$Parcelable;
import o.TransaksiTundaDetail;
import o.getDollarCurrCode;
import o.setBanknoteCondition;
import o.setDataId;
import o.setHeader;
import o.setStatus;
import o.setStatusType;
import o.setTransaksiTunda;
import o.setTransaksiTundaDetailList;
import o.setTxbDateFormatted;
import o.setTypeDraft;
/* loaded from: classes-dex2jar.jar:o/setBanknoteCondition.class */
public final class setBanknoteCondition implements getFlagEKTP {
    private final ConnectivityManager a;
    private final Context b;
    final URL c;
    private final int d;
    private final DataEncoder e;
    private final realmGet$businessField f;
    private final realmGet$businessField h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setBanknoteCondition$read.class */
    public static final class read {
        final long a;
        final URL c;
        final int d;

        read(int i, URL url, long j) {
            this.d = i;
            this.c = url;
            this.a = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setBanknoteCondition$write.class */
    public static final class write {
        final setServiceType b;
        final URL c;
        final String d;

        public write(URL url, setServiceType setservicetype, String str) {
            this.c = url;
            this.b = setservicetype;
            this.d = str;
        }
    }

    public setBanknoteCondition(Context context, realmGet$businessField realmget_businessfield, realmGet$businessField realmget_businessfield2) {
        this(context, realmget_businessfield, realmget_businessfield2, 40000);
    }

    private setBanknoteCondition(Context context, realmGet$businessField realmget_businessfield, realmGet$businessField realmget_businessfield2, int i) {
        this.e = new JsonDataEncoderBuilder().configureWith(setFlagRating.c).ignoreNullValues(true).build();
        this.b = context;
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
        this.c = d(isDraft.a);
        this.f = realmget_businessfield2;
        this.h = realmget_businessfield;
        this.d = 40000;
    }

    private static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb = new StringBuilder("TransportRuntime.");
            sb.append("CctTransportBackend");
            Log.e(sb.toString(), "Unable to find version code for package", e);
            return -1;
        }
    }

    private static URL d(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            StringBuilder sb = new StringBuilder("Invalid url: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    private setServiceType e(getEmailAddr getemailaddr) {
        TransaksiTundaDetail.write e;
        HashMap hashMap = new HashMap();
        for (setTransaksiTunda settransaksitunda : getemailaddr.d()) {
            String c = settransaksitunda.c();
            if (!hashMap.containsKey(c)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(settransaksitunda);
                hashMap.put(c, arrayList);
            } else {
                ((List) hashMap.get(c)).add(settransaksitunda);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            setTransaksiTunda settransaksitunda2 = (setTransaksiTunda) ((List) entry.getValue()).get(0);
            TransaksiTunda$$Parcelable.IconCompatParcelizer e2 = new setTransaksiTundaDetailList.IconCompatParcelizer().d(getTxbType.DEFAULT).b(this.h.c()).e(this.f.c()).e(new setHeader.write().e(setTxbDateFormatted.RemoteActionCompatParcelizer.ANDROID_FIREBASE).c(new setDataId.IconCompatParcelizer().d(Integer.valueOf(settransaksitunda2.d("sdk-version"))).h(settransaksitunda2.c("model")).a(settransaksitunda2.c("hardware")).e(settransaksitunda2.c("device")).m(settransaksitunda2.c("product")).j(settransaksitunda2.c("os-uild")).g(settransaksitunda2.c("manufacturer")).d(settransaksitunda2.c("fingerprint")).c(settransaksitunda2.c("country")).i(settransaksitunda2.c("locale")).f(settransaksitunda2.c("mcc_mnc")).b(settransaksitunda2.c("application_build")).d()).a());
            try {
                e2.a(Integer.valueOf(Integer.parseInt((String) entry.getKey())));
            } catch (NumberFormatException e3) {
                e2.d((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (setTransaksiTunda settransaksitunda3 : (List) entry.getValue()) {
                setTxbType e4 = settransaksitunda3.e();
                getFlagRating getflagrating = e4.b;
                if (getflagrating.equals(new getFlagRating("proto"))) {
                    e = new setStatus.write().e(e4.e);
                } else if (getflagrating.equals(new getFlagRating("json"))) {
                    e = new setStatus.write().e(new String(e4.e, Charset.forName(Utf8Charset.NAME)));
                } else {
                    StringBuilder sb = new StringBuilder("TransportRuntime.");
                    sb.append("CctTransportBackend");
                    Log.w(sb.toString(), String.format("Received event of unsupported encoding %s. Skipping...", getflagrating));
                }
                e.b(settransaksitunda3.a()).e(settransaksitunda3.h()).a(settransaksitunda3.e("tz-offset")).a(new setStatusType.read().d(setTypeDraft.write.s.get(settransaksitunda3.d("net-type"))).a(setTypeDraft.IconCompatParcelizer.x.get(settransaksitunda3.d("mobile-subtype"))).a());
                if (settransaksitunda3.b() != null) {
                    e.b(settransaksitunda3.b());
                }
                arrayList3.add(e.e());
            }
            e2.c(arrayList3);
            arrayList2.add(e2.c());
        }
        return new setDraft(arrayList2);
    }

    @Override // o.getFlagEKTP
    public final setTransaksiTunda a(setTransaksiTunda settransaksitunda) {
        int i;
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        setTransaksiTunda.RemoteActionCompatParcelizer e = settransaksitunda.g().c("sdk-version", Build.VERSION.SDK_INT).e("model", Build.MODEL).e("hardware", Build.HARDWARE).e("device", Build.DEVICE).e("product", Build.PRODUCT).e("os-uild", Build.ID).e("manufacturer", Build.MANUFACTURER).e("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        setTransaksiTunda.RemoteActionCompatParcelizer c = e.d("tz-offset", (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / CloseCodes.NORMAL_CLOSURE)).c("net-type", activeNetworkInfo == null ? setTypeDraft.write.NONE.v : activeNetworkInfo.getType());
        if (activeNetworkInfo == null) {
            i = setTypeDraft.IconCompatParcelizer.UNKNOWN_MOBILE_SUBTYPE.v;
        } else {
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                i = setTypeDraft.IconCompatParcelizer.COMBINED.v;
            } else {
                i = subtype;
                if (setTypeDraft.IconCompatParcelizer.x.get(subtype) == null) {
                    i = 0;
                }
            }
        }
        return c.c("mobile-subtype", i).e("country", Locale.getDefault().getCountry()).e("locale", Locale.getDefault().getLanguage()).e("mcc_mnc", ((TelephonyManager) this.b.getSystemService("phone")).getSimOperator()).e("application_build", Integer.toString(b(this.b))).c();
    }

    @Override // o.getFlagEKTP
    public final getDollarCurrCode b(getEmailAddr getemailaddr) {
        setServiceType e = e(getemailaddr);
        URL url = this.c;
        byte[] e2 = getemailaddr.e();
        String str = null;
        String str2 = null;
        URL url2 = url;
        if (e2 != null) {
            try {
                String str3 = new String(getemailaddr.e(), Charset.forName(Utf8Charset.NAME));
                if (str3.startsWith("1$")) {
                    String[] split = str3.substring(2).split(Pattern.quote("\\"), 2);
                    if (split.length == 2) {
                        String str4 = split[0];
                        if (!str4.isEmpty()) {
                            String str5 = split[1];
                            String str6 = str5;
                            if (str5.isEmpty()) {
                                str6 = null;
                            }
                            isDraft isdraft = new isDraft(str4, str6);
                            if (isdraft.c != null) {
                                str2 = isdraft.c;
                            }
                            url2 = url;
                            str = str2;
                            if (isdraft.g != null) {
                                url2 = d(isdraft.g);
                                str = str2;
                            }
                        } else {
                            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
                        }
                    } else {
                        throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
                    }
                } else {
                    throw new IllegalArgumentException("Version marker missing from extras");
                }
            } catch (IllegalArgumentException e3) {
                return new getCobIsoCode(getDollarCurrCode.RemoteActionCompatParcelizer.FATAL_ERROR, -1);
            }
        }
        try {
            read read2 = (read) getFlagNPWP.a(5, new write(url2, e, str), new getFotoNpwp() { // from class: o.getTypeDraft
                @Override // o.getFotoNpwp
                public final Object e(Object obj) {
                    return setBanknoteCondition.this.d((setBanknoteCondition.write) obj);
                }
            }, new getHmAddress() { // from class: o.isHeader
                @Override // o.getHmAddress
                public final Object a(Object obj, Object obj2) {
                    setBanknoteCondition.write write2 = (setBanknoteCondition.write) obj;
                    setBanknoteCondition.read read3 = (setBanknoteCondition.read) obj2;
                    if (read3.c == null) {
                        return null;
                    }
                    URL url3 = read3.c;
                    StringBuilder sb = new StringBuilder("TransportRuntime.");
                    sb.append("CctTransportBackend");
                    Log.d(sb.toString(), String.format("Following redirect to: %s", url3));
                    return new setBanknoteCondition.write(read3.c, write2.b, write2.d);
                }
            });
            if (read2.d == 200) {
                return new getCobIsoCode(getDollarCurrCode.RemoteActionCompatParcelizer.OK, read2.a);
            }
            if (read2.d < 500 && read2.d != 404) {
                return new getCobIsoCode(getDollarCurrCode.RemoteActionCompatParcelizer.FATAL_ERROR, -1);
            }
            return new getCobIsoCode(getDollarCurrCode.RemoteActionCompatParcelizer.TRANSIENT_ERROR, -1);
        } catch (IOException e4) {
            StringBuilder sb = new StringBuilder("TransportRuntime.");
            sb.append("CctTransportBackend");
            Log.e(sb.toString(), "Could not make request to the backend", e4);
            return new getCobIsoCode(getDollarCurrCode.RemoteActionCompatParcelizer.TRANSIENT_ERROR, -1);
        }
    }

    public read d(write write2) throws IOException {
        Throwable e;
        IOException e2;
        URL url = write2.c;
        StringBuilder sb = new StringBuilder("TransportRuntime.");
        sb.append("CctTransportBackend");
        Log.d(sb.toString(), String.format("Making request to: %s", url));
        HttpURLConnection httpURLConnection = (HttpURLConnection) write2.c.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.d);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.0.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        if (write2.d != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", write2.d);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.e.encode(write2.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                StringBuilder sb2 = new StringBuilder("Status Code: ");
                sb2.append(responseCode);
                String obj = sb2.toString();
                StringBuilder sb3 = new StringBuilder("TransportRuntime.");
                sb3.append("CctTransportBackend");
                Log.i(sb3.toString(), obj);
                StringBuilder sb4 = new StringBuilder("Content-Type: ");
                sb4.append(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_TYPE));
                String obj2 = sb4.toString();
                StringBuilder sb5 = new StringBuilder("TransportRuntime.");
                sb5.append("CctTransportBackend");
                Log.i(sb5.toString(), obj2);
                StringBuilder sb6 = new StringBuilder("Content-Encoding: ");
                sb6.append(httpURLConnection.getHeaderField("Content-Encoding"));
                String obj3 = sb6.toString();
                StringBuilder sb7 = new StringBuilder("TransportRuntime.");
                sb7.append("CctTransportBackend");
                Log.i(sb7.toString(), obj3);
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new read(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                }
                if (responseCode != 200) {
                    return new read(responseCode, null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                    read read2 = new read(responseCode, null, setTxbDate.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).c());
                    if (gZIPInputStream != null) {
                        gZIPInputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return read2;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ConnectException e3) {
            e = e3;
            StringBuilder sb8 = new StringBuilder("TransportRuntime.");
            sb8.append("CctTransportBackend");
            Log.e(sb8.toString(), "Couldn't open connection, returning with 500", e);
            return new read(HttpStatus.HTTP_INTERNAL_SERVER_ERROR, null, 0);
        } catch (UnknownHostException e4) {
            e = e4;
            StringBuilder sb82 = new StringBuilder("TransportRuntime.");
            sb82.append("CctTransportBackend");
            Log.e(sb82.toString(), "Couldn't open connection, returning with 500", e);
            return new read(HttpStatus.HTTP_INTERNAL_SERVER_ERROR, null, 0);
        } catch (EncodingException e5) {
            e2 = e5;
            StringBuilder sb9 = new StringBuilder("TransportRuntime.");
            sb9.append("CctTransportBackend");
            Log.e(sb9.toString(), "Couldn't encode request, returning with 400", e2);
            return new read(400, null, 0);
        } catch (IOException e6) {
            e2 = e6;
            StringBuilder sb92 = new StringBuilder("TransportRuntime.");
            sb92.append("CctTransportBackend");
            Log.e(sb92.toString(), "Couldn't encode request, returning with 400", e2);
            return new read(400, null, 0);
        }
    }
}
