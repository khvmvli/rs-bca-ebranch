package o;

import java.io.EOFException;
import java.io.IOException;
import o.onClickUbahCabang;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/proses.class */
public final class proses extends onClickUbahCabang {
    private final setResponseContentType l;
    private long m;
    private int n = 0;

    /* renamed from: o  reason: collision with root package name */
    private int f176o;
    private String q;
    private final setTookMs r;
    private static final setResponseMessage i = setResponseMessage.a("'\\");
    private static final setResponseMessage j = setResponseMessage.a("\"\\");
    private static final setResponseMessage k = setResponseMessage.a("{}[]:, \n\t\r\f/\\;#=");
    private static final setResponseMessage h = setResponseMessage.a("\n\r");
    private static final setResponseMessage f = setResponseMessage.a("*/");

    /* JADX INFO: Access modifiers changed from: package-private */
    public proses(setTookMs settookms) {
        if (settookms != null) {
            this.r = settookms;
            this.l = settookms.c();
            e(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    private boolean a(int i2) throws IOException {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (!(i2 == 47 || i2 == 61)) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cn:
                        case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ck:
                            return false;
                        case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cj:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        if (this.a) {
            return false;
        }
        throw c("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private int b(String str, onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver onclickubahcabang_mediabrowsercompat_customactionresultreceiver) {
        int length = onclickubahcabang_mediabrowsercompat_customactionresultreceiver.e.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(onclickubahcabang_mediabrowsercompat_customactionresultreceiver.e[i2])) {
                this.n = 0;
                this.e[this.g - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        r4.l.f((long) (r0 - 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r0 != 47) goto L_0x00bd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
        if (r4.r.h(2) != false) goto L_0x005d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r4.a == false) goto L_0x00b6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        r0 = r4.l.b(1L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
        if (r0 == 42) goto L_0x0095;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r0 == 47) goto L_0x007e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
        r4.l.i();
        r4.l.i();
        q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
        r4.l.i();
        r4.l.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
        if (r() == false) goto L_0x00af;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b5, code lost:
        throw c("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
        throw c("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
        if (r0 != 35) goto L_0x00d8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c7, code lost:
        if (r4.a == false) goto L_0x00d1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
        q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
        throw c("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private int b(boolean r5) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: o.proses.b(boolean):int");
    }

    private String b(setResponseMessage setresponsemessage) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long c = this.r.c(setresponsemessage);
            if (c == -1) {
                throw c("Unterminated string");
            } else if (this.l.b(c) == 92) {
                StringBuilder sb2 = sb;
                if (sb == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.l.e(c, defaultDumperPluginsProvider.a));
                this.l.i();
                sb2.append(t());
                sb = sb2;
            } else if (sb == null) {
                String e = this.l.e(c, defaultDumperPluginsProvider.a);
                this.l.i();
                return e;
            } else {
                sb.append(this.l.e(c, defaultDumperPluginsProvider.a));
                this.l.i();
                return sb.toString();
            }
        }
    }

    private void e(setResponseMessage setresponsemessage) throws IOException {
        while (true) {
            long c = this.r.c(setresponsemessage);
            if (c == -1) {
                throw c("Unterminated string");
            } else if (this.l.b(c) == 92) {
                this.l.f(c + 1);
                t();
            } else {
                this.l.f(c + 1);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0345, code lost:
        if (a(r0) != false) goto L_0x03c7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03cf, code lost:
        if (r13 != 2) goto L_0x0419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03d3, code lost:
        if (r8 == false) goto L_0x0419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03dc, code lost:
        if (r15 != Long.MIN_VALUE) goto L_0x03e4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03e1, code lost:
        if (r11 == false) goto L_0x0419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03e8, code lost:
        if (r15 != 0) goto L_0x03f0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03ed, code lost:
        if (r11 != false) goto L_0x0419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03f0, code lost:
        r18 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03f6, code lost:
        if (r11 != false) goto L_0x03fe;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03f9, code lost:
        r18 = -r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03fe, code lost:
        r5.m = r18 == true ? 1 : 0;
        r5.l.f((long) r6);
        r5.n = 16;
        r6 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x041c, code lost:
        if (r13 == 2) goto L_0x042f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0422, code lost:
        if (r13 == 4) goto L_0x042f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0429, code lost:
        if (r13 == 7) goto L_0x042f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x042f, code lost:
        r5.f176o = r6;
        r5.n = 17;
        r6 = 17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0443  */
    /* JADX WARN: Type inference failed for: r0v175, types: [long] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [long] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8, types: [long] */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private int o() throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1504
        */
        throw new UnsupportedOperationException("Method not decompiled: o.proses.o():int");
    }

    private String p() throws IOException {
        long c = this.r.c(k);
        return c != -1 ? this.l.e(c, defaultDumperPluginsProvider.a) : this.l.t();
    }

    private void q() throws IOException {
        long c = this.r.c(h);
        setResponseContentType setresponsecontenttype = this.l;
        setresponsecontenttype.f(c != -1 ? c + 1 : setresponsecontenttype.b);
    }

    private boolean r() throws IOException {
        setTookMs settookms = this.r;
        setResponseMessage setresponsemessage = f;
        long d = settookms.d(setresponsemessage);
        boolean z = d != -1;
        setResponseContentType setresponsecontenttype = this.l;
        setresponsecontenttype.f(z ? d + ((long) setresponsemessage.g()) : setresponsecontenttype.b);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void s() throws java.io.IOException {
        /*
            r5 = this;
            r0 = r5
            o.setTookMs r0 = r0.r
            o.setResponseMessage r1 = o.proses.k
            long r0 = r0.c(r1)
            r6 = r0
            r0 = r5
            o.setResponseContentType r0 = r0.l
            r8 = r0
            r0 = r6
            r9 = r0
            r0 = r6
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0023
            r0 = r8
            long r0 = r0.b
            r9 = r0
        L_0x0023:
            r0 = r8
            r1 = r9
            r0.f(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.proses.s():void");
    }

    private char t() throws IOException {
        int i2;
        int i3;
        if (this.r.h(1)) {
            byte i4 = this.l.i();
            if (i4 == 10 || i4 == 34 || i4 == 39 || i4 == 47 || i4 == 92) {
                return (char) i4;
            }
            if (i4 == 98) {
                return '\b';
            }
            if (i4 == 102) {
                return '\f';
            }
            if (i4 == 110) {
                return '\n';
            }
            if (i4 == 114) {
                return '\r';
            }
            if (i4 == 116) {
                return '\t';
            }
            if (i4 != 117) {
                if (this.a) {
                    return (char) i4;
                }
                StringBuilder sb = new StringBuilder("Invalid escape sequence: \\");
                sb.append((char) i4);
                throw c(sb.toString());
            } else if (this.r.h(4)) {
                char c = 0;
                for (int i5 = 0; i5 < 4; i5++) {
                    byte b = this.l.b((long) i5);
                    char c2 = (char) (c << 4);
                    if (b < 48 || b > 57) {
                        if (b >= 97 && b <= 102) {
                            i3 = b - 97;
                        } else if (b < 65 || b > 70) {
                            StringBuilder sb2 = new StringBuilder("\\u");
                            sb2.append(this.l.e(4, defaultDumperPluginsProvider.a));
                            throw c(sb2.toString());
                        } else {
                            i3 = b - 65;
                        }
                        i2 = i3 + 10;
                    } else {
                        i2 = b - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.l.f(4L);
                return c;
            } else {
                StringBuilder sb3 = new StringBuilder("Unterminated escape sequence at path ");
                sb3.append(c());
                throw new EOFException(sb3.toString());
            }
        } else {
            throw c("Unterminated escape sequence");
        }
    }

    @Override // o.onClickUbahCabang
    public final int a(onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver onclickubahcabang_mediabrowsercompat_customactionresultreceiver) throws IOException {
        int i2 = this.n;
        int i3 = i2;
        if (i2 == 0) {
            i3 = o();
        }
        if (i3 < 12 || i3 > 15) {
            return -1;
        }
        if (i3 == 15) {
            return b(this.q, onclickubahcabang_mediabrowsercompat_customactionresultreceiver);
        }
        int c = this.r.c(onclickubahcabang_mediabrowsercompat_customactionresultreceiver.a);
        if (c != -1) {
            this.n = 0;
            this.e[this.g - 1] = onclickubahcabang_mediabrowsercompat_customactionresultreceiver.e[c];
            return c;
        }
        String str = this.e[this.g - 1];
        String f2 = f();
        int b = b(f2, onclickubahcabang_mediabrowsercompat_customactionresultreceiver);
        if (b == -1) {
            this.n = 15;
            this.q = f2;
            this.e[this.g - 1] = str;
        }
        return b;
    }

    @Override // o.onClickUbahCabang
    public final void a() throws IOException {
        int i2 = this.n;
        int i3 = i2;
        if (i2 == 0) {
            i3 = o();
        }
        if (i3 == 4) {
            this.g--;
            int[] iArr = this.b;
            int i4 = this.g - 1;
            iArr[i4] = iArr[i4] + 1;
            this.n = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
        sb.append(n());
        sb.append(" at path ");
        sb.append(c());
        throw new onGetBranchEvent(sb.toString());
    }

    @Override // o.onClickUbahCabang
    public final void b() throws IOException {
        int i2 = this.n;
        int i3 = i2;
        if (i2 == 0) {
            i3 = o();
        }
        if (i3 == 2) {
            this.g--;
            this.e[this.g] = null;
            int[] iArr = this.b;
            int i4 = this.g - 1;
            iArr[i4] = iArr[i4] + 1;
            this.n = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
        sb.append(n());
        sb.append(" at path ");
        sb.append(c());
        throw new onGetBranchEvent(sb.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.n = 0;
        this.d[0] = 8;
        this.g = 1;
        setResponseContentType setresponsecontenttype = this.l;
        try {
            setresponsecontenttype.f(setresponsecontenttype.b);
            this.r.close();
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // o.onClickUbahCabang
    public final void d() throws IOException {
        int i2 = this.n;
        int i3 = i2;
        if (i2 == 0) {
            i3 = o();
        }
        if (i3 == 1) {
            e(3);
            this.n = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
        sb.append(n());
        sb.append(" at path ");
        sb.append(c());
        throw new onGetBranchEvent(sb.toString());
    }

    @Override // o.onClickUbahCabang
    public final void e() throws IOException {
        int i2 = this.n;
        int i3 = i2;
        if (i2 == 0) {
            i3 = o();
        }
        if (i3 == 3) {
            e(1);
            this.b[this.g - 1] = 0;
            this.n = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
        sb.append(n());
        sb.append(" at path ");
        sb.append(c());
        throw new onGetBranchEvent(sb.toString());
    }

    @Override // o.onClickUbahCabang
    public final String f() throws IOException {
        String str;
        int i2 = this.n;
        int i3 = i2;
        if (i2 == 0) {
            i3 = o();
        }
        if (i3 == 14) {
            str = p();
        } else if (i3 == 13) {
            str = b(j);
        } else if (i3 == 12) {
            str = b(i);
        } else if (i3 == 15) {
            str = this.q;
        } else {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(n());
            sb.append(" at path ");
            sb.append(c());
            throw new onGetBranchEvent(sb.toString());
        }
        this.n = 0;
        this.e[this.g - 1] = str;
        return str;
    }

    @Override // o.onClickUbahCabang
    public final boolean g() throws IOException {
        int i2 = this.n;
        int i3 = i2;
        if (i2 == 0) {
            i3 = o();
        }
        if (i3 == 5) {
            this.n = 0;
            int[] iArr = this.b;
            int i4 = this.g - 1;
            iArr[i4] = iArr[i4] + 1;
            return true;
        } else if (i3 == 6) {
            this.n = 0;
            int[] iArr2 = this.b;
            int i5 = this.g - 1;
            iArr2[i5] = iArr2[i5] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(n());
            sb.append(" at path ");
            sb.append(c());
            throw new onGetBranchEvent(sb.toString());
        }
    }

    @Override // o.onClickUbahCabang
    public final double h() throws IOException {
        int i2 = this.n;
        int i3 = i2;
        if (i2 == 0) {
            i3 = o();
        }
        if (i3 == 16) {
            this.n = 0;
            int[] iArr = this.b;
            int i4 = this.g - 1;
            iArr[i4] = iArr[i4] + 1;
            return (double) this.m;
        }
        if (i3 == 17) {
            this.q = this.l.e((long) this.f176o, defaultDumperPluginsProvider.a);
        } else if (i3 == 9) {
            this.q = b(j);
        } else if (i3 == 8) {
            this.q = b(i);
        } else if (i3 == 10) {
            this.q = p();
        } else if (i3 != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(n());
            sb.append(" at path ");
            sb.append(c());
            throw new onGetBranchEvent(sb.toString());
        }
        this.n = 11;
        try {
            double parseDouble = Double.parseDouble(this.q);
            if (this.a || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.q = null;
                this.n = 0;
                int[] iArr2 = this.b;
                int i5 = this.g - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseDouble;
            }
            StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
            sb2.append(parseDouble);
            sb2.append(" at path ");
            sb2.append(c());
            throw new onChooseCabangEvent(sb2.toString());
        } catch (NumberFormatException e) {
            StringBuilder sb3 = new StringBuilder("Expected a double but was ");
            sb3.append(this.q);
            sb3.append(" at path ");
            sb3.append(c());
            throw new onGetBranchEvent(sb3.toString());
        }
    }

    @Override // o.onClickUbahCabang
    public final boolean i() throws IOException {
        int i2 = this.n;
        int i3 = i2;
        if (i2 == 0) {
            i3 = o();
        }
        return (i3 == 2 || i3 == 4 || i3 == 18) ? false : true;
    }

    @Override // o.onClickUbahCabang
    public final int j() throws IOException {
        int i2 = this.n;
        int i3 = i2;
        if (i2 == 0) {
            i3 = o();
        }
        if (i3 == 16) {
            long j2 = this.m;
            int i4 = (int) j2;
            if (j2 == ((long) i4)) {
                this.n = 0;
                int[] iArr = this.b;
                int i5 = this.g - 1;
                iArr[i5] = iArr[i5] + 1;
                return i4;
            }
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(this.m);
            sb.append(" at path ");
            sb.append(c());
            throw new onGetBranchEvent(sb.toString());
        }
        if (i3 == 17) {
            this.q = this.l.e((long) this.f176o, defaultDumperPluginsProvider.a);
        } else if (i3 == 9 || i3 == 8) {
            String b = i3 == 9 ? b(j) : b(i);
            this.q = b;
            try {
                int parseInt = Integer.parseInt(b);
                this.n = 0;
                int[] iArr2 = this.b;
                int i6 = this.g - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseInt;
            } catch (NumberFormatException e) {
            }
        } else if (i3 != 11) {
            StringBuilder sb2 = new StringBuilder("Expected an int but was ");
            sb2.append(n());
            sb2.append(" at path ");
            sb2.append(c());
            throw new onGetBranchEvent(sb2.toString());
        }
        this.n = 11;
        try {
            double parseDouble = Double.parseDouble(this.q);
            int i7 = (int) parseDouble;
            if (((double) i7) == parseDouble) {
                this.q = null;
                this.n = 0;
                int[] iArr3 = this.b;
                int i8 = this.g - 1;
                iArr3[i8] = iArr3[i8] + 1;
                return i7;
            }
            StringBuilder sb3 = new StringBuilder("Expected an int but was ");
            sb3.append(this.q);
            sb3.append(" at path ");
            sb3.append(c());
            throw new onGetBranchEvent(sb3.toString());
        } catch (NumberFormatException e2) {
            StringBuilder sb4 = new StringBuilder("Expected an int but was ");
            sb4.append(this.q);
            sb4.append(" at path ");
            sb4.append(c());
            throw new onGetBranchEvent(sb4.toString());
        }
    }

    @Override // o.onClickUbahCabang
    public final String k() throws IOException {
        String str;
        int i2 = this.n;
        int i3 = i2;
        if (i2 == 0) {
            i3 = o();
        }
        if (i3 == 10) {
            str = p();
        } else if (i3 == 9) {
            str = b(j);
        } else if (i3 == 8) {
            str = b(i);
        } else if (i3 == 11) {
            str = this.q;
            this.q = null;
        } else if (i3 == 16) {
            str = Long.toString(this.m);
        } else if (i3 == 17) {
            str = this.l.e((long) this.f176o, defaultDumperPluginsProvider.a);
        } else {
            StringBuilder sb = new StringBuilder("Expected a string but was ");
            sb.append(n());
            sb.append(" at path ");
            sb.append(c());
            throw new onGetBranchEvent(sb.toString());
        }
        this.n = 0;
        int[] iArr = this.b;
        int i4 = this.g - 1;
        iArr[i4] = iArr[i4] + 1;
        return str;
    }

    @Override // o.onClickUbahCabang
    public final void l() throws IOException {
        if (!this.c) {
            int i2 = this.n;
            int i3 = i2;
            if (i2 == 0) {
                i3 = o();
            }
            if (i3 == 14) {
                s();
            } else if (i3 == 13) {
                e(j);
            } else if (i3 == 12) {
                e(i);
            } else if (i3 != 15) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(n());
                sb.append(" at path ");
                sb.append(c());
                throw new onGetBranchEvent(sb.toString());
            }
            this.n = 0;
            this.e[this.g - 1] = "null";
            return;
        }
        StringBuilder sb2 = new StringBuilder("Cannot skip unexpected ");
        sb2.append(n());
        sb2.append(" at ");
        sb2.append(c());
        throw new onGetBranchEvent(sb2.toString());
    }

    @Override // o.onClickUbahCabang
    public final void m() throws IOException {
        int i2;
        if (!this.c) {
            int i3 = 0;
            do {
                int i4 = this.n;
                int i5 = i4;
                if (i4 == 0) {
                    i5 = o();
                }
                if (i5 == 3) {
                    e(1);
                } else if (i5 == 1) {
                    e(3);
                } else {
                    if (i5 == 4) {
                        i2 = i3 - 1;
                        if (i2 >= 0) {
                            this.g--;
                        } else {
                            StringBuilder sb = new StringBuilder("Expected a value but was ");
                            sb.append(n());
                            sb.append(" at path ");
                            sb.append(c());
                            throw new onGetBranchEvent(sb.toString());
                        }
                    } else if (i5 == 2) {
                        i2 = i3 - 1;
                        if (i2 >= 0) {
                            this.g--;
                        } else {
                            StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                            sb2.append(n());
                            sb2.append(" at path ");
                            sb2.append(c());
                            throw new onGetBranchEvent(sb2.toString());
                        }
                    } else if (i5 == 14 || i5 == 10) {
                        s();
                        i2 = i3;
                    } else if (i5 == 9 || i5 == 13) {
                        e(j);
                        i2 = i3;
                    } else if (i5 == 8 || i5 == 12) {
                        e(i);
                        i2 = i3;
                    } else if (i5 == 17) {
                        this.l.f((long) this.f176o);
                        i2 = i3;
                    } else if (i5 != 18) {
                        i2 = i3;
                    } else {
                        StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                        sb3.append(n());
                        sb3.append(" at path ");
                        sb3.append(c());
                        throw new onGetBranchEvent(sb3.toString());
                    }
                    this.n = 0;
                    i3 = i2;
                }
                i2 = i3 + 1;
                this.n = 0;
                i3 = i2;
            } while (i2 != 0);
            int[] iArr = this.b;
            int i6 = this.g - 1;
            iArr[i6] = iArr[i6] + 1;
            this.e[this.g - 1] = "null";
            return;
        }
        StringBuilder sb4 = new StringBuilder("Cannot skip unexpected ");
        sb4.append(n());
        sb4.append(" at ");
        sb4.append(c());
        throw new onGetBranchEvent(sb4.toString());
    }

    @Override // o.onClickUbahCabang
    public final onClickUbahCabang.RemoteActionCompatParcelizer n() throws IOException {
        int i2 = this.n;
        int i3 = i2;
        if (i2 == 0) {
            i3 = o();
        }
        switch (i3) {
            case 1:
                return onClickUbahCabang.RemoteActionCompatParcelizer.BEGIN_OBJECT;
            case 2:
                return onClickUbahCabang.RemoteActionCompatParcelizer.END_OBJECT;
            case 3:
                return onClickUbahCabang.RemoteActionCompatParcelizer.BEGIN_ARRAY;
            case 4:
                return onClickUbahCabang.RemoteActionCompatParcelizer.END_ARRAY;
            case 5:
            case 6:
                return onClickUbahCabang.RemoteActionCompatParcelizer.BOOLEAN;
            case 7:
                return onClickUbahCabang.RemoteActionCompatParcelizer.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return onClickUbahCabang.RemoteActionCompatParcelizer.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return onClickUbahCabang.RemoteActionCompatParcelizer.NAME;
            case 16:
            case 17:
                return onClickUbahCabang.RemoteActionCompatParcelizer.NUMBER;
            case 18:
                return onClickUbahCabang.RemoteActionCompatParcelizer.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(");
        sb.append(this.r);
        sb.append(")");
        return sb.toString();
    }
}
