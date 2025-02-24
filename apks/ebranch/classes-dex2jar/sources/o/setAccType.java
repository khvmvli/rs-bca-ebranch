package o;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* loaded from: classes-dex2jar.jar:o/setAccType.class */
public final class setAccType implements DynamiteModule.RemoteActionCompatParcelizer {
    @Override // com.google.android.gms.dynamite.DynamiteModule.RemoteActionCompatParcelizer
    public final DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer e(Context context, String str, DynamiteModule.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer) throws DynamiteModule.LoadingException {
        int i;
        DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer remoteActionCompatParcelizer = new DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer();
        int d = iconCompatParcelizer.d(context, str);
        remoteActionCompatParcelizer.a = d;
        int i2 = 1;
        int i3 = 0;
        if (d != 0) {
            i = iconCompatParcelizer.d(context, str, false);
            remoteActionCompatParcelizer.d = i;
        } else {
            i = iconCompatParcelizer.d(context, str, true);
            remoteActionCompatParcelizer.d = i;
        }
        int i4 = remoteActionCompatParcelizer.a;
        if (i4 != 0) {
            i3 = i4;
        } else if (i == 0) {
            i2 = 0;
            remoteActionCompatParcelizer.e = i2;
            return remoteActionCompatParcelizer;
        }
        if (i < i3) {
            i2 = -1;
        }
        remoteActionCompatParcelizer.e = i2;
        return remoteActionCompatParcelizer;
    }
}
