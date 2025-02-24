package o;

import android.os.Bundle;
import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/setHmCity.class */
public final class setHmCity implements realmGet$npwp {
    public static final setHmCity c = new setHmCity(new RemoteActionCompatParcelizer((byte) 0).e);
    private final String b;

    /* loaded from: classes-dex2jar.jar:o/setHmCity$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        String e;

        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
        }
    }

    /* synthetic */ setHmCity(String str) {
        this.b = str;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        String str = this.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setHmCity)) {
            return false;
        }
        String str = this.b;
        String str2 = ((setHmCity) obj).b;
        boolean z = true;
        if (str != str2) {
            if (str == null) {
                z = false;
            } else if (!str.equals(str2)) {
                return false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }
}
