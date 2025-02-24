package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setAnimations.class */
public final class setAnimations {
    public final setAnimations$MediaBrowserCompat$CustomActionResultReceiver b;
    final write d = new write();
    public final List<View> e = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setAnimations$write.class */
    public static final class write {
        long b = 0;
        write e;

        write() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(int i) {
            if (i >= 64) {
                if (this.e == null) {
                    this.e = new write();
                }
                this.e.a(i - 64);
                return;
            }
            this.b |= 1 << i;
        }

        final void a(int i, boolean z) {
            write write = this;
            while (i < 64) {
                long j = write.b;
                z = (Long.MIN_VALUE & j) != 0;
                long j2 = (1 << i) - 1;
                write.b = (j & j2) | (((j2 ^ -1) & j) << 1);
                if (z) {
                    write.a(i);
                } else {
                    write.d(i);
                }
                if (z || write.e != null) {
                    if (write.e == null) {
                        write.e = new write();
                    }
                    write = write.e;
                    i = 0;
                } else {
                    return;
                }
            }
            if (write.e == null) {
                write.e = new write();
            }
            write.e.a(i - 64, z);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean b(int i) {
            write write = this;
            while (i >= 64) {
                if (write.e == null) {
                    write.e = new write();
                }
                write = write.e;
                i -= 64;
            }
            return (write.b & (1 << i)) != 0;
        }

        final int c(int i) {
            write write = this.e;
            return write == null ? i >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.b & ((1 << i) - 1)) : write.c(i - 64) + Long.bitCount(this.b);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void d() {
            write write = this;
            do {
                write.b = 0;
                write = write.e;
            } while (write != null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void d(int i) {
            if (i >= 64) {
                write write = this.e;
                if (write != null) {
                    write.d(i - 64);
                    return;
                }
                return;
            }
            this.b &= (1 << i) ^ -1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean e(int i) {
            write write = this;
            while (i >= 64) {
                if (write.e == null) {
                    write.e = new write();
                }
                write = write.e;
                i -= 64;
            }
            long j = 1 << i;
            long j2 = write.b;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (j ^ -1);
            write.b = j3;
            long j4 = j - 1;
            write.b = Long.rotateRight((j4 ^ -1) & j3, 1) | (j4 & j3);
            write write2 = write.e;
            if (write2 != null) {
                if (write2.b(0)) {
                    write.a(63);
                }
                write.e.e(0);
            }
            return z;
        }

        public final String toString() {
            String str;
            if (this.e == null) {
                str = Long.toBinaryString(this.b);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.e.toString());
                sb.append("xx");
                sb.append(Long.toBinaryString(this.b));
                str = sb.toString();
            }
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setAnimations(setAnimations$MediaBrowserCompat$CustomActionResultReceiver setanimations_mediabrowsercompat_customactionresultreceiver) {
        this.b = setanimations_mediabrowsercompat_customactionresultreceiver;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        int e = e(i);
        this.d.e(e);
        this.b.e(e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(View view, int i, boolean z) {
        int c = i < 0 ? this.b.c() : e(i);
        this.d.a(c, z);
        if (z) {
            this.e.add(view);
            this.b.b(view);
        }
        this.b.e(view, c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i) {
        int e = e(i);
        View b = this.b.b(e);
        if (b != null) {
            if (this.d.e(e) && this.e.remove(b)) {
                this.b.a(b);
            }
            this.b.d(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(View view) {
        int d = this.b.d(view);
        if (d != -1 && !this.d.b(d)) {
            return d - this.d.c(d);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r5.d.b(r8) == false) goto L_0x003b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int e(int r6) {
        /*
            r5 = this;
            r0 = r6
            if (r0 >= 0) goto L_0x0006
            r0 = -1
            return r0
        L_0x0006:
            r0 = r5
            o.setAnimations$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.b
            int r0 = r0.c()
            r7 = r0
            r0 = r6
            r8 = r0
        L_0x0012:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L_0x0045
            r0 = r6
            r1 = r8
            r2 = r5
            o.setAnimations$write r2 = r2.d
            r3 = r8
            int r2 = r2.c(r3)
            int r1 = r1 - r2
            int r0 = r0 - r1
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L_0x003d
        L_0x002a:
            r0 = r5
            o.setAnimations$write r0 = r0.d
            r1 = r8
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L_0x003b
            int r8 = r8 + 1
            goto L_0x002a
        L_0x003b:
            r0 = r8
            return r0
        L_0x003d:
            r0 = r8
            r1 = r9
            int r0 = r0 + r1
            r8 = r0
            goto L_0x0012
        L_0x0045:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAnimations.e(int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(View view) {
        int d = this.b.d(view);
        if (d >= 0) {
            if (this.d.e(d) && this.e.remove(view)) {
                this.b.a(view);
            }
            this.b.d(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int c = i < 0 ? this.b.c() : e(i);
        this.d.a(c, z);
        if (z) {
            this.e.add(view);
            this.b.b(view);
        }
        this.b.e(view, c, layoutParams);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.toString());
        sb.append(", hidden list:");
        sb.append(this.e.size());
        return sb.toString();
    }
}
