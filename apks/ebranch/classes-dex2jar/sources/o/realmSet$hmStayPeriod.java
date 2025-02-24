package o;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmSet$hmStayPeriod.class */
public final class realmSet$hmStayPeriod extends realmSet$nationality<Long> {
    public realmSet$hmStayPeriod(realmSet$monthlyIncome realmset_monthlyincome, String str, Long l, boolean z) {
        super(realmset_monthlyincome, str, l, true, null);
    }

    @Override // o.realmSet$nationality
    final /* synthetic */ Long c(Object obj) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException e) {
            String b = b();
            int length = String.valueOf(b).length();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(length + 25 + str.length());
            sb.append("Invalid long value for ");
            sb.append(b);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            l = null;
        }
        return l;
    }
}
