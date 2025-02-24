package o;

import android.content.Context;
import android.content.res.Resources;
import o.realmGet$kitasKitapExpDate;
/* loaded from: classes-dex2jar.jar:o/setFotoNpwp.class */
public final class setFotoNpwp {
    private final Resources a;
    private final String d;

    public setFotoNpwp(Context context) {
        if (context != null) {
            Resources resources = context.getResources();
            this.a = resources;
            this.d = resources.getResourcePackageName(realmGet$kitasKitapExpDate.RemoteActionCompatParcelizer.d);
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final String a(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.d);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
