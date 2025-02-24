package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/getResponseTlsVersion.class */
public final /* synthetic */ class getResponseTlsVersion {
    public static final long c(String str, long j, long j2, long j3) {
        String e = getStatus$com_github_ChuckerTeam_Chucker_library.e(str);
        if (e == null) {
            return j;
        }
        Long d = CheckOTPSessionPresenter.d(e);
        if (d != null) {
            long longValue = d.longValue();
            boolean z = false;
            if (j2 <= longValue) {
                z = false;
                if (longValue <= j3) {
                    z = true;
                }
            }
            if (z) {
                return longValue;
            }
            StringBuilder sb = new StringBuilder("System property '");
            sb.append(str);
            sb.append("' should be in range ");
            sb.append(j2);
            sb.append("..");
            sb.append(j3);
            sb.append(", but is '");
            sb.append(longValue);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        StringBuilder sb2 = new StringBuilder("System property '");
        sb2.append(str);
        sb2.append("' has unrecognized value '");
        sb2.append(e);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }
}
