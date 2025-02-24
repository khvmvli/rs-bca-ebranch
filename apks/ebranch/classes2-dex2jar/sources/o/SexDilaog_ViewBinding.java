package o;

import android.content.Context;
/* loaded from: classes2-dex2jar.jar:o/SexDilaog_ViewBinding.class */
public class SexDilaog_ViewBinding {
    private String d;

    public final String e(Context context) {
        String str;
        synchronized (this) {
            if (this.d == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                String str2 = installerPackageName;
                if (installerPackageName == null) {
                    str2 = "";
                }
                this.d = str2;
            }
            str = "".equals(this.d) ? null : this.d;
        }
        return str;
    }
}
