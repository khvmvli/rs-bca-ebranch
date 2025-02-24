package o;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:o/isDraft.class */
public final class isDraft implements setNoReffAnak {
    static final String a;
    static final String b;
    public static final isDraft d;
    public static final isDraft e;
    private static final String i;
    private static final Set<getFlagRating> j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new getFlagRating("proto"), new getFlagRating("json"))));
    final String c;
    final String g;

    static {
        String d2 = getTxbDateFormatted.d("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        a = d2;
        String d3 = getTxbDateFormatted.d("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        b = d3;
        String d4 = getTxbDateFormatted.d("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        i = d4;
        d = new isDraft(d2, null);
        e = new isDraft(d3, d4);
    }

    public isDraft(String str, String str2) {
        this.g = str;
        this.c = str2;
    }

    @Override // o.setFlagReservasi
    public final String b() {
        return "cct";
    }

    @Override // o.setNoReffAnak
    public final Set<getFlagRating> c() {
        return j;
    }

    @Override // o.setFlagReservasi
    public final byte[] e() {
        String str = this.c;
        if (str == null && this.g == null) {
            return null;
        }
        String str2 = this.g;
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str3).getBytes(Charset.forName(Utf8Charset.NAME));
    }
}
