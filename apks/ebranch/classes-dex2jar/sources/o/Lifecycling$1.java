package o;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
/* loaded from: classes-dex2jar.jar:o/Lifecycling$1.class */
public class Lifecycling$1 extends Service {
    int a = 0;
    final HashMap<Integer, String> d = new HashMap<>();
    final RemoteCallbackList<findFragmentById> e = new RemoteCallbackList<findFragmentById>() { // from class: o.Lifecycling$1.2
        @Override // android.os.RemoteCallbackList
        public final /* synthetic */ void onCallbackDied(findFragmentById findfragmentbyid, Object obj) {
            Lifecycling$1.this.d.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    };
    private final setOnApplyWindowInsetsListener$MediaBrowserCompat$CustomActionResultReceiver b = new setOnApplyWindowInsetsListener$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.Lifecycling$1.4
        @Override // o.setOnApplyWindowInsetsListener
        public final int c(findFragmentById findfragmentbyid, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (Lifecycling$1.this.e) {
                Lifecycling$1 lifecycling$1 = Lifecycling$1.this;
                int i = lifecycling$1.a + 1;
                lifecycling$1.a = i;
                if (Lifecycling$1.this.e.register(findfragmentbyid, Integer.valueOf(i))) {
                    Lifecycling$1.this.d.put(Integer.valueOf(i), str);
                    return i;
                }
                Lifecycling$1.this.a--;
                return 0;
            }
        }

        @Override // o.setOnApplyWindowInsetsListener
        public final void c(int i, String[] strArr) {
            synchronized (Lifecycling$1.this.e) {
                String str = Lifecycling$1.this.d.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = Lifecycling$1.this.e.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    int intValue = ((Integer) Lifecycling$1.this.e.getBroadcastCookie(i2)).intValue();
                    String str2 = Lifecycling$1.this.d.get(Integer.valueOf(intValue));
                    if (i != intValue && str.equals(str2)) {
                        try {
                            Lifecycling$1.this.e.getBroadcastItem(i2).d(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                }
                Lifecycling$1.this.e.finishBroadcast();
            }
        }

        @Override // o.setOnApplyWindowInsetsListener
        public final void e(findFragmentById findfragmentbyid, int i) {
            synchronized (Lifecycling$1.this.e) {
                Lifecycling$1.this.e.unregister(findfragmentbyid);
                Lifecycling$1.this.d.remove(Integer.valueOf(i));
            }
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.b;
    }
}
