package o;

import java.util.Arrays;
import o.realmGet$name;
import o.realmGet$name.RemoteActionCompatParcelizer;
/* loaded from: classes-dex2jar.jar:o/realmGet$religion.class */
public final class realmGet$religion<O extends realmGet$name.RemoteActionCompatParcelizer> {
    private final realmGet$name.RemoteActionCompatParcelizer a;
    private final String c;
    private final int d;
    public final realmGet$name e;

    private realmGet$religion(realmGet$name realmget_name, realmGet$name.RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str) {
        this.e = realmget_name;
        this.a = remoteActionCompatParcelizer;
        this.c = str;
        this.d = Arrays.hashCode(new Object[]{realmget_name, remoteActionCompatParcelizer, str});
    }

    public static <O extends realmGet$name.RemoteActionCompatParcelizer> realmGet$religion<O> e(realmGet$name<O> realmget_name, O o2, String str) {
        return new realmGet$religion<>(realmget_name, o2, str);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof realmGet$religion)) {
            return false;
        }
        realmGet$religion realmget_religion = (realmGet$religion) obj;
        realmGet$name realmget_name = this.e;
        realmGet$name realmget_name2 = realmget_religion.e;
        if (!(realmget_name == realmget_name2 || (realmget_name != null && realmget_name.equals(realmget_name2)))) {
            return false;
        }
        realmGet$name.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.a;
        realmGet$name.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = realmget_religion.a;
        if (!(remoteActionCompatParcelizer == remoteActionCompatParcelizer2 || (remoteActionCompatParcelizer != null && remoteActionCompatParcelizer.equals(remoteActionCompatParcelizer2)))) {
            return false;
        }
        String str = this.c;
        String str2 = realmget_religion.c;
        return str == str2 || (str != null && str.equals(str2));
    }

    public final int hashCode() {
        return this.d;
    }
}
