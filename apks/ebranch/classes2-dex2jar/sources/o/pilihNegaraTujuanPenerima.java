package o;

import java.io.Serializable;
import java.util.regex.Pattern;
/* loaded from: classes2-dex2jar.jar:o/pilihNegaraTujuanPenerima.class */
public final class pilihNegaraTujuanPenerima implements Serializable {
    private final boolean g;
    private static final Pattern b = Pattern.compile("^\\s*?(.+)@(.+?)\\s*$");
    private static final Pattern d = Pattern.compile("^\\[(.*)\\]$");
    private static final Pattern c = Pattern.compile("^\\s*(([^\\s\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]]|')+|(\"[^\"]*\"))(\\.(([^\\s\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]]|')+|(\"[^\"]*\")))*$");
    private static final pilihNegaraTujuanPenerima e = new pilihNegaraTujuanPenerima(false);
    private static final pilihNegaraTujuanPenerima a = new pilihNegaraTujuanPenerima(true);

    private pilihNegaraTujuanPenerima(boolean z) {
        this.g = z;
    }

    public static pilihNegaraTujuanPenerima b(boolean z) {
        return z ? a : e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r0.c(r0) == false) goto L_0x0066;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (r0.b(r0) == false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean b(java.lang.String r4) {
        /*
            r3 = this;
            r0 = r4
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            r0 = r4
            java.lang.String r1 = "."
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L_0x0011
            r0 = 0
            return r0
        L_0x0011:
            java.util.regex.Pattern r0 = o.pilihNegaraTujuanPenerima.b
            r1 = r4
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r4 = r0
            r0 = r4
            boolean r0 = r0.matches()
            if (r0 != 0) goto L_0x0022
            r0 = 0
            return r0
        L_0x0022:
            r0 = r4
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            r5 = r0
            java.util.regex.Pattern r0 = o.pilihNegaraTujuanPenerima.c
            r1 = r5
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L_0x0037
            r0 = 0
            return r0
        L_0x0037:
            r0 = r4
            r1 = 2
            java.lang.String r0 = r0.group(r1)
            r4 = r0
            java.util.regex.Pattern r0 = o.pilihNegaraTujuanPenerima.d
            r1 = r4
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r5 = r0
            r0 = r5
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x0070
            o.pilihHubunganKeuanganOR r0 = o.pilihHubunganKeuanganOR.b()
            r4 = r0
            r0 = r5
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            r5 = r0
            r0 = r4
            r1 = r5
            boolean r0 = r0.d(r1)
            if (r0 != 0) goto L_0x006b
            r0 = r4
            r1 = r5
            boolean r0 = r0.c(r1)
            if (r0 != 0) goto L_0x006b
        L_0x0066:
            r0 = 0
            r6 = r0
            goto L_0x008b
        L_0x006b:
            r0 = 1
            r6 = r0
            goto L_0x008b
        L_0x0070:
            r0 = r3
            boolean r0 = r0.g
            o.onChoosePilihNorekPengirim r0 = o.onChoosePilihNorekPengirim.d(r0)
            r5 = r0
            r0 = r5
            r1 = r4
            boolean r0 = r0.a(r1)
            if (r0 != 0) goto L_0x006b
            r0 = r5
            r1 = r4
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L_0x0066
            goto L_0x006b
        L_0x008b:
            r0 = r6
            if (r0 != 0) goto L_0x0091
            r0 = 0
            return r0
        L_0x0091:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.pilihNegaraTujuanPenerima.b(java.lang.String):boolean");
    }
}
