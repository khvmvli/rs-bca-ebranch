package okhttp3.logging;

import io.realm.RealmFieldTypeConstants;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import o.ChuckerDatabase_Impl;
import o.setResponseContentType;
import o.setTookMs;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Interceptor$Chain;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
/* loaded from: classes2-dex2jar.jar:okhttp3/logging/HttpLoggingInterceptor.class */
public final class HttpLoggingInterceptor implements Interceptor {
    private static final Charset UTF8 = Charset.forName("UTF-8");
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    /* loaded from: classes2-dex2jar.jar:okhttp3/logging/HttpLoggingInterceptor$Level.class */
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* loaded from: classes2-dex2jar.jar:okhttp3/logging/HttpLoggingInterceptor$Logger.class */
    public interface Logger {
        public static final Logger DEFAULT = new Logger() { // from class: okhttp3.logging.HttpLoggingInterceptor.Logger.1
            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public void log(String str) {
                Platform.get().log(4, str, (Throwable) null);
            }
        };

        void log(String str);
    }

    public HttpLoggingInterceptor() {
        this(Logger.DEFAULT);
    }

    public HttpLoggingInterceptor(Logger logger) {
        this.headersToRedact = Collections.emptySet();
        this.level = Level.NONE;
        this.logger = logger;
    }

    private static boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        return str != null && !str.equalsIgnoreCase("identity") && !str.equalsIgnoreCase("gzip");
    }

    static boolean isPlaintext(setResponseContentType setresponsecontenttype) {
        int i;
        int i2;
        int i3;
        try {
            setResponseContentType setresponsecontenttype2 = new setResponseContentType();
            setresponsecontenttype.d(setresponsecontenttype2, 0, setresponsecontenttype.b < 64 ? setresponsecontenttype.b : 64);
            int i4 = 0;
            while (true) {
                int i5 = 1;
                if (i4 >= 16) {
                    return true;
                }
                if (setresponsecontenttype2.b == 0) {
                    return true;
                }
                if (setresponsecontenttype2.b != 0) {
                    byte b = setresponsecontenttype2.b(0);
                    if ((b & 128) == 0) {
                        i = b & Byte.MAX_VALUE;
                        i3 = 1;
                        i2 = 0;
                    } else if ((b & 224) == 192) {
                        i = b & 31;
                        i3 = 2;
                        i2 = RealmFieldTypeConstants.LIST_OFFSET;
                    } else if ((b & 240) == 224) {
                        i = b & 15;
                        i3 = 3;
                        i2 = 2048;
                    } else if ((b & 248) == 240) {
                        i = b & 7;
                        i3 = 4;
                        i2 = 65536;
                    } else {
                        setresponsecontenttype2.f(1);
                        i = 65533;
                        if (!Character.isISOControl(i) && !Character.isWhitespace(i)) {
                            return false;
                        }
                        i4++;
                    }
                    long j = setresponsecontenttype2.b;
                    long j2 = (long) i3;
                    if (j >= j2) {
                        while (true) {
                            if (i5 < i3) {
                                long j3 = (long) i5;
                                byte b2 = setresponsecontenttype2.b(j3);
                                if ((b2 & 192) != 128) {
                                    setresponsecontenttype2.f(j3);
                                    i = 65533;
                                    break;
                                }
                                i = (i << 6) | (b2 & 63);
                                i5++;
                            } else {
                                setresponsecontenttype2.f(j2);
                                if (i > 1114111) {
                                    i = 65533;
                                } else if (i >= 55296 && i <= 57343) {
                                    i = 65533;
                                } else if (i < i2) {
                                    i = 65533;
                                }
                            }
                        }
                        if (!Character.isISOControl(i)) {
                        }
                        i4++;
                    } else {
                        StringBuilder sb = new StringBuilder("size < ");
                        sb.append(i3);
                        sb.append(": ");
                        sb.append(setresponsecontenttype2.b);
                        sb.append(" (to read code point prefixed 0x");
                        sb.append(Integer.toHexString(b));
                        sb.append(")");
                        throw new EOFException(sb.toString());
                    }
                } else {
                    throw new EOFException();
                }
            }
        } catch (EOFException e) {
            return false;
        }
    }

    private void logHeader(Headers headers, int i) {
        String value = this.headersToRedact.contains(headers.name(i)) ? "██" : headers.value(i);
        Logger logger = this.logger;
        StringBuilder sb = new StringBuilder();
        sb.append(headers.name(i));
        sb.append(": ");
        sb.append(value);
        logger.log(sb.toString());
    }

    public final Level getLevel() {
        return this.level;
    }

    public final Response intercept(Interceptor$Chain interceptor$Chain) throws IOException {
        String str;
        String str2;
        String str3;
        String str4;
        Throwable th;
        Level level = this.level;
        Request request = interceptor$Chain.request();
        if (level == Level.NONE) {
            return interceptor$Chain.proceed(request);
        }
        boolean z = true;
        boolean z2 = level == Level.BODY;
        boolean z3 = z2 || level == Level.HEADERS;
        RequestBody body = request.body();
        if (body == null) {
            z = false;
        }
        Connection connection = interceptor$Chain.connection();
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(request.method());
        sb.append(' ');
        sb.append(request.url());
        if (connection != null) {
            StringBuilder sb2 = new StringBuilder(" ");
            sb2.append(connection.protocol());
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        String obj = sb.toString();
        if (!z3 && z) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(" (");
            sb3.append(body.contentLength());
            sb3.append("-byte body)");
            obj = sb3.toString();
        }
        this.logger.log(obj);
        if (z3) {
            if (z) {
                if (body.contentType() != null) {
                    Logger logger = this.logger;
                    StringBuilder sb4 = new StringBuilder("Content-Type: ");
                    sb4.append(body.contentType());
                    logger.log(sb4.toString());
                }
                if (body.contentLength() != -1) {
                    Logger logger2 = this.logger;
                    StringBuilder sb5 = new StringBuilder("Content-Length: ");
                    sb5.append(body.contentLength());
                    logger2.log(sb5.toString());
                }
            }
            Headers headers = request.headers();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                if (!"Content-Type".equalsIgnoreCase(name) && !"Content-Length".equalsIgnoreCase(name)) {
                    logHeader(headers, i);
                }
            }
            if (!z2 || !z) {
                Logger logger3 = this.logger;
                StringBuilder sb6 = new StringBuilder("--> END ");
                sb6.append(request.method());
                logger3.log(sb6.toString());
            } else if (bodyHasUnknownEncoding(request.headers())) {
                Logger logger4 = this.logger;
                StringBuilder sb7 = new StringBuilder("--> END ");
                sb7.append(request.method());
                sb7.append(" (encoded body omitted)");
                logger4.log(sb7.toString());
            } else {
                setResponseContentType setresponsecontenttype = new setResponseContentType();
                body.writeTo(setresponsecontenttype);
                Charset charset = UTF8;
                MediaType contentType = body.contentType();
                Charset charset2 = charset;
                if (contentType != null) {
                    charset2 = contentType.charset(charset);
                }
                this.logger.log("");
                if (isPlaintext(setresponsecontenttype)) {
                    this.logger.log(setresponsecontenttype.a(charset2));
                    Logger logger5 = this.logger;
                    StringBuilder sb8 = new StringBuilder("--> END ");
                    sb8.append(request.method());
                    sb8.append(" (");
                    sb8.append(body.contentLength());
                    sb8.append("-byte body)");
                    logger5.log(sb8.toString());
                } else {
                    Logger logger6 = this.logger;
                    StringBuilder sb9 = new StringBuilder("--> END ");
                    sb9.append(request.method());
                    sb9.append(" (binary ");
                    sb9.append(body.contentLength());
                    sb9.append("-byte body omitted)");
                    logger6.log(sb9.toString());
                }
            }
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = interceptor$Chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            long contentLength = body2.contentLength();
            if (contentLength != -1) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(contentLength);
                sb10.append("-byte");
                str2 = sb10.toString();
            } else {
                str2 = "unknown-length";
            }
            Logger logger7 = this.logger;
            StringBuilder sb11 = new StringBuilder("<-- ");
            sb11.append(proceed.code());
            if (proceed.message().isEmpty()) {
                str3 = "";
            } else {
                StringBuilder sb12 = new StringBuilder(" ");
                sb12.append(proceed.message());
                str3 = sb12.toString();
            }
            sb11.append(str3);
            sb11.append(' ');
            sb11.append(proceed.request().url());
            sb11.append(" (");
            sb11.append(millis);
            sb11.append("ms");
            if (!z3) {
                StringBuilder sb13 = new StringBuilder(", ");
                sb13.append(str2);
                sb13.append(" body");
                str4 = sb13.toString();
            } else {
                str4 = "";
            }
            sb11.append(str4);
            sb11.append(')');
            logger7.log(sb11.toString());
            if (z3) {
                Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    logHeader(headers2, i2);
                }
                if (!z2 || !HttpHeaders.hasBody(proceed)) {
                    this.logger.log("<-- END HTTP");
                } else if (bodyHasUnknownEncoding(proceed.headers())) {
                    this.logger.log("<-- END HTTP (encoded body omitted)");
                } else {
                    setTookMs source = body2.source();
                    source.h(Long.MAX_VALUE);
                    setResponseContentType c = source.c();
                    Long l = null;
                    ChuckerDatabase_Impl chuckerDatabase_Impl = null;
                    setResponseContentType setresponsecontenttype2 = c;
                    if ("gzip".equalsIgnoreCase(headers2.get("Content-Encoding"))) {
                        long j = c.b;
                        try {
                            chuckerDatabase_Impl = new ChuckerDatabase_Impl(c.d());
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            setresponsecontenttype2 = new setResponseContentType();
                            setresponsecontenttype2.a(chuckerDatabase_Impl);
                            chuckerDatabase_Impl.close();
                            l = Long.valueOf(j);
                        } catch (Throwable th3) {
                            th = th3;
                            if (chuckerDatabase_Impl != null) {
                                chuckerDatabase_Impl.close();
                            }
                            throw th;
                        }
                    }
                    Charset charset3 = UTF8;
                    MediaType contentType2 = body2.contentType();
                    Charset charset4 = charset3;
                    if (contentType2 != null) {
                        charset4 = contentType2.charset(charset3);
                    }
                    if (!isPlaintext(setresponsecontenttype2)) {
                        this.logger.log("");
                        Logger logger8 = this.logger;
                        StringBuilder sb14 = new StringBuilder("<-- END HTTP (binary ");
                        sb14.append(setresponsecontenttype2.b);
                        sb14.append("-byte body omitted)");
                        logger8.log(sb14.toString());
                        return proceed;
                    }
                    if (contentLength != 0) {
                        this.logger.log("");
                        this.logger.log(setresponsecontenttype2.d().a(charset4));
                    }
                    if (l != null) {
                        Logger logger9 = this.logger;
                        StringBuilder sb15 = new StringBuilder("<-- END HTTP (");
                        sb15.append(setresponsecontenttype2.b);
                        sb15.append("-byte, ");
                        sb15.append(l);
                        sb15.append("-gzipped-byte body)");
                        logger9.log(sb15.toString());
                    } else {
                        Logger logger10 = this.logger;
                        StringBuilder sb16 = new StringBuilder("<-- END HTTP (");
                        sb16.append(setresponsecontenttype2.b);
                        sb16.append("-byte body)");
                        logger10.log(sb16.toString());
                    }
                }
            }
            return proceed;
        } catch (Exception e) {
            Logger logger11 = this.logger;
            StringBuilder sb17 = new StringBuilder("<-- HTTP FAILED: ");
            sb17.append(e);
            logger11.log(sb17.toString());
            throw e;
        }
    }

    public final void redactHeader(String str) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        treeSet.addAll(this.headersToRedact);
        treeSet.add(str);
        this.headersToRedact = treeSet;
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
        if (level != null) {
            this.level = level;
            return this;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }
}
