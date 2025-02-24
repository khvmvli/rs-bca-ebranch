package o;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzp;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmGet$hmCountry.class */
public abstract class realmGet$hmCountry<T> {
    final Bundle a;
    final int b;
    final int c;
    final setJenisWarkat<T> e = new setJenisWarkat<>();

    public realmGet$hmCountry(int i, int i2, Bundle bundle) {
        this.b = i;
        this.c = i2;
        this.a = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean a();

    public final void b(zzp zzp) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzp);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.e.e(zzp);
    }

    public final void b(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.e.e((setJenisWarkat<T>) t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(Bundle bundle);

    public String toString() {
        int i = this.c;
        int i2 = this.b;
        boolean a = a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
