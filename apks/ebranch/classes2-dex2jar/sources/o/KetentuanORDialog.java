package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* loaded from: classes2-dex2jar.jar:o/KetentuanORDialog.class */
public final class KetentuanORDialog {
    public static KetentuanORDialog e;
    public IconCompatParcelizer a;
    public IconCompatParcelizer c;
    public final Object b = new Object();
    public final Handler d = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: o.KetentuanORDialog.5
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            KetentuanORDialog ketentuanORDialog = KetentuanORDialog.this;
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) message.obj;
            synchronized (ketentuanORDialog.b) {
                if (ketentuanORDialog.a == iconCompatParcelizer || ketentuanORDialog.c == iconCompatParcelizer) {
                    ketentuanORDialog.c(iconCompatParcelizer, 2);
                }
            }
            return true;
        }
    });

    /* loaded from: classes2-dex2jar.jar:o/KetentuanORDialog$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        public int c;
        boolean d;
        public final WeakReference<write> e;

        public IconCompatParcelizer(int i, write write) {
            this.e = new WeakReference<>(write);
            this.c = i;
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/KetentuanORDialog$write.class */
    public interface write {
        void d();

        void e(int i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        if ((r4 != null && r0.e.get() == r4) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean b(o.KetentuanORDialog.write r4) {
        /*
            r3 = this;
            r0 = r3
            o.KetentuanORDialog$IconCompatParcelizer r0 = r0.a
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x002b
            r0 = r4
            if (r0 == 0) goto L_0x0020
            r0 = r5
            java.lang.ref.WeakReference<o.KetentuanORDialog$write> r0 = r0.e
            java.lang.Object r0 = r0.get()
            r1 = r4
            if (r0 != r1) goto L_0x0020
            r0 = 1
            r7 = r0
            goto L_0x0023
        L_0x0020:
            r0 = 0
            r7 = r0
        L_0x0023:
            r0 = r7
            if (r0 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r0 = 0
            r6 = r0
        L_0x002d:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KetentuanORDialog.b(o.KetentuanORDialog$write):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        if ((r4 != null && r0.e.get() == r4) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean d(o.KetentuanORDialog.write r4) {
        /*
            r3 = this;
            r0 = r3
            o.KetentuanORDialog$IconCompatParcelizer r0 = r0.c
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x002b
            r0 = r4
            if (r0 == 0) goto L_0x0020
            r0 = r5
            java.lang.ref.WeakReference<o.KetentuanORDialog$write> r0 = r0.e
            java.lang.Object r0 = r0.get()
            r1 = r4
            if (r0 != r1) goto L_0x0020
            r0 = 1
            r7 = r0
            goto L_0x0023
        L_0x0020:
            r0 = 0
            r7 = r0
        L_0x0023:
            r0 = r7
            if (r0 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r0 = 0
            r6 = r0
        L_0x002d:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KetentuanORDialog.d(o.KetentuanORDialog$write):boolean");
    }

    public final void a(write write2) {
        synchronized (this.b) {
            if (b(write2) && !this.a.d) {
                this.a.d = true;
                this.d.removeCallbacksAndMessages(this.a);
            }
        }
    }

    public void b() {
        IconCompatParcelizer iconCompatParcelizer = this.c;
        if (iconCompatParcelizer != null) {
            this.a = iconCompatParcelizer;
            this.c = null;
            write write2 = iconCompatParcelizer.e.get();
            if (write2 != null) {
                write2.d();
            } else {
                this.a = null;
            }
        }
    }

    public final void c(write write2) {
        synchronized (this.b) {
            if (b(write2) && this.a.d) {
                this.a.d = false;
                d(this.a);
            }
        }
    }

    public final void c(write write2, int i) {
        synchronized (this.b) {
            if (b(write2)) {
                c(this.a, i);
            } else if (d(write2)) {
                c(this.c, i);
            }
        }
    }

    public boolean c(IconCompatParcelizer iconCompatParcelizer, int i) {
        write write2 = iconCompatParcelizer.e.get();
        if (write2 == null) {
            return false;
        }
        this.d.removeCallbacksAndMessages(iconCompatParcelizer);
        write2.e(i);
        return true;
    }

    public void d(IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer.c != -2) {
            int i = iconCompatParcelizer.c > 0 ? iconCompatParcelizer.c : iconCompatParcelizer.c == -1 ? 1500 : 2750;
            this.d.removeCallbacksAndMessages(iconCompatParcelizer);
            Handler handler = this.d;
            handler.sendMessageDelayed(Message.obtain(handler, 0, iconCompatParcelizer), (long) i);
        }
    }

    public final boolean e(write write2) {
        boolean z;
        synchronized (this.b) {
            if (!b(write2)) {
                if (!d(write2)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }
}
