package o;

import java.util.ArrayDeque;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/BahasaLayananDialog_ViewBinding.class */
public final class BahasaLayananDialog_ViewBinding {
    private final Object b = new Object();
    private Queue d;
    private boolean e;

    public final void d(AutoLogoutDialog_ViewBinding autoLogoutDialog_ViewBinding) {
        synchronized (this.b) {
            if (this.d == null) {
                this.d = new ArrayDeque();
            }
            this.d.add(autoLogoutDialog_ViewBinding);
        }
    }

    public final void e(setJatuhTempo setjatuhtempo) {
        AutoLogoutDialog_ViewBinding autoLogoutDialog_ViewBinding;
        synchronized (this.b) {
            if (this.d != null && !this.e) {
                this.e = true;
                while (true) {
                    synchronized (this.b) {
                        autoLogoutDialog_ViewBinding = (AutoLogoutDialog_ViewBinding) this.d.poll();
                        if (autoLogoutDialog_ViewBinding == null) {
                            this.e = false;
                            return;
                        }
                    }
                    autoLogoutDialog_ViewBinding.c(setjatuhtempo);
                }
            }
        }
    }
}
