package okhttp3.internal.http;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import o.setResponseContentType;
import o.setResponseMessage;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/http/HttpHeaders.class */
public final class HttpHeaders {
    private static final setResponseMessage QUOTED_STRING_DELIMITERS = setResponseMessage.a("\"\\");
    private static final setResponseMessage TOKEN_DELIMITERS = setResponseMessage.a("\t ,=");

    private HttpHeaders() {
    }

    public static long contentLength(Headers headers) {
        return stringToLong(headers.get("Content-Length"));
    }

    public static long contentLength(Response response) {
        return contentLength(response.headers());
    }

    public static boolean hasBody(Response response) {
        if (response.request().method().equals("HEAD")) {
            return false;
        }
        int code = response.code();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && contentLength(response) == -1 && !"chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) ? false : true;
    }

    public static boolean hasVaryAll(Headers headers) {
        return varyFields(headers).contains("*");
    }

    public static boolean hasVaryAll(Response response) {
        return hasVaryAll(response.headers());
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0081, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f2, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f2, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static void parseChallengeHeader(java.util.List<okhttp3.Challenge> r7, o.setResponseContentType r8) {
        /*
        // Method dump skipped, instructions count: 385
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.parseChallengeHeader(java.util.List, o.setResponseContentType):void");
    }

    public static List<Challenge> parseChallenges(Headers headers, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < headers.size(); i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                parseChallengeHeader(arrayList, new setResponseContentType().d(headers.value(i)));
            }
        }
        return arrayList;
    }

    public static int parseSeconds(String str, int i) {
        long parseLong;
        try {
            parseLong = Long.parseLong(str);
        } catch (NumberFormatException e) {
        }
        if (parseLong > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (parseLong < 0) {
            return 0;
        }
        i = (int) parseLong;
        return i;
    }

    private static String readQuotedString(setResponseContentType setresponsecontenttype) {
        if (setresponsecontenttype.i() == 34) {
            setResponseContentType setresponsecontenttype2 = new setResponseContentType();
            while (true) {
                long c = setresponsecontenttype.c(QUOTED_STRING_DELIMITERS, 0);
                if (c == -1) {
                    return null;
                }
                if (setresponsecontenttype.b(c) == 34) {
                    setresponsecontenttype2.write(setresponsecontenttype, c);
                    setresponsecontenttype.i();
                    return setresponsecontenttype2.t();
                } else if (setresponsecontenttype.b == c + 1) {
                    return null;
                } else {
                    setresponsecontenttype2.write(setresponsecontenttype, c);
                    setresponsecontenttype.i();
                    setresponsecontenttype2.write(setresponsecontenttype, 1);
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [long] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static java.lang.String readToken(o.setResponseContentType r5) {
        /*
            r0 = r5
            o.setResponseMessage r1 = okhttp3.internal.http.HttpHeaders.TOKEN_DELIMITERS     // Catch: EOFException -> 0x002e
            r2 = 0
            long r0 = r0.c(r1, r2)     // Catch: EOFException -> 0x002e
            r6 = r0
            r0 = r6
            r8 = r0
            r0 = r6
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0018
            r0 = r5
            long r0 = r0.b     // Catch: EOFException -> 0x002e
            r8 = r0
        L_0x0018:
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x002a
            r0 = r5
            r1 = r8
            java.nio.charset.Charset r2 = o.defaultDumperPluginsProvider.a     // Catch: EOFException -> 0x002e
            java.lang.String r0 = r0.e(r1, r2)     // Catch: EOFException -> 0x002e
            r5 = r0
            goto L_0x002c
        L_0x002a:
            r0 = 0
            r5 = r0
        L_0x002c:
            r0 = r5
            return r0
        L_0x002e:
            r5 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readToken(o.setResponseContentType):java.lang.String");
    }

    public static void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.parseAll(httpUrl, headers);
            if (!parseAll.isEmpty()) {
                cookieJar.saveFromResponse(httpUrl, parseAll);
            }
        }
    }

    private static String repeat(char c, int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, c);
        return new String(cArr);
    }

    private static int skipAll(setResponseContentType setresponsecontenttype, byte b) {
        int i = 0;
        while (true) {
            if ((setresponsecontenttype.b == 0) || setresponsecontenttype.b(0) != b) {
                break;
            }
            i++;
            setresponsecontenttype.i();
        }
        return i;
    }

    public static int skipUntil(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int skipWhitespace(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == '\t')) {
            i++;
        }
        return i;
    }

    private static boolean skipWhitespaceAndCommas(setResponseContentType setresponsecontenttype) {
        boolean z = false;
        while (true) {
            if (!(setresponsecontenttype.b == 0)) {
                byte b = setresponsecontenttype.b(0);
                if (b != 44) {
                    if (b != 32 && b != 9) {
                        break;
                    }
                    setresponsecontenttype.i();
                } else {
                    setresponsecontenttype.i();
                    z = true;
                }
            } else {
                break;
            }
        }
        return z;
    }

    private static long stringToLong(String str) {
        long j = -1;
        if (str == null) {
            return -1;
        }
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException e) {
        }
        return j;
    }

    public static Set<String> varyFields(Headers headers) {
        Set<String> emptySet = Collections.emptySet();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            emptySet = emptySet;
            if ("Vary".equalsIgnoreCase(headers.name(i))) {
                String value = headers.value(i);
                Set<String> set = emptySet;
                if (emptySet.isEmpty()) {
                    set = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                String[] split = value.split(",");
                int length = split.length;
                int i2 = 0;
                while (true) {
                    emptySet = set;
                    if (i2 < length) {
                        set.add(split[i2].trim());
                        i2++;
                    }
                }
            }
        }
        return emptySet;
    }

    private static Set<String> varyFields(Response response) {
        return varyFields(response.headers());
    }

    public static Headers varyHeaders(Headers headers, Headers headers2) {
        Set<String> varyFields = varyFields(headers2);
        if (varyFields.isEmpty()) {
            return new Headers.Builder().build();
        }
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            if (varyFields.contains(name)) {
                builder.add(name, headers.value(i));
            }
        }
        return builder.build();
    }

    public static Headers varyHeaders(Response response) {
        return varyHeaders(response.networkResponse().request().headers(), response.headers());
    }

    public static boolean varyMatches(Response response, Headers headers, Request request) {
        for (String str : varyFields(response)) {
            if (!Util.equal(headers.values(str), request.headers(str))) {
                return false;
            }
        }
        return true;
    }
}
