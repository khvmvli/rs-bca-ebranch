package o;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/realmSet$monthlyIncome.class */
public final class realmSet$monthlyIncome {
    final Uri c;
    final String a = null;
    final String e = "";
    final String d = "";
    final boolean b = false;
    final boolean f = false;
    final boolean h = false;
    final boolean i = false;
    @Nullable
    final realmSet$prevCompanyName<Context, Boolean> j = null;

    public realmSet$monthlyIncome(Uri uri) {
        this.c = uri;
    }

    public final realmSet$nationality<Long> a(String str, long j) {
        return new realmSet$hmStayPeriod(this, str, Long.valueOf(j), true);
    }

    public final realmSet$nationality<Double> b(String str, double d) {
        return new realmSet$nationality<Double>(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true) { // from class: o.realmSet$monthlyOtherIncome
            @Override // o.realmSet$nationality
            final /* synthetic */ Double c(Object obj) {
                Double d2;
                try {
                    d2 = Double.valueOf(Double.parseDouble((String) obj));
                } catch (NumberFormatException e) {
                    String b = b();
                    int length = String.valueOf(b).length();
                    String str2 = (String) obj;
                    StringBuilder sb = new StringBuilder(length + 27 + str2.length());
                    sb.append("Invalid double value for ");
                    sb.append(b);
                    sb.append(": ");
                    sb.append(str2);
                    Log.e("PhenotypeFlag", sb.toString());
                    d2 = null;
                }
                return d2;
            }
        };
    }

    public final realmSet$nationality<Boolean> b(String str, boolean z) {
        return new realmSet$nationality<Boolean>(this, str, Boolean.valueOf(z), true) { // from class: o.realmSet$isDraft
            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.realmSet$nationality
            final /* synthetic */ Boolean c(Object obj) {
                boolean z2;
                if (realmSet$flagAgreeAutodebet.a.matcher(obj).matches()) {
                    z2 = true;
                } else if (realmSet$flagAgreeAutodebet.e.matcher(obj).matches()) {
                    z2 = false;
                } else {
                    String b = b();
                    int length = String.valueOf(b).length();
                    String str2 = (String) obj;
                    StringBuilder sb = new StringBuilder(length + 28 + str2.length());
                    sb.append("Invalid boolean value for ");
                    sb.append(b);
                    sb.append(": ");
                    sb.append(str2);
                    Log.e("PhenotypeFlag", sb.toString());
                    z2 = null;
                }
                return z2;
            }
        };
    }

    public final realmSet$nationality<String> e(String str, String str2) {
        return new realmSet$nationality<String>(this, str, str2, true) { // from class: o.realmSet$mobileNumber
            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.realmSet$nationality
            final /* bridge */ /* synthetic */ String c(Object obj) {
                return obj;
            }
        };
    }
}
