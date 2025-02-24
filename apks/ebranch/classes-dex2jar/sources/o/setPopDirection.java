package o;

import android.view.View;
/* loaded from: classes-dex2jar.jar:o/setPopDirection.class */
public final class setPopDirection {
    final setPopDirection$MediaBrowserCompat$CustomActionResultReceiver a;
    read c = new read();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setPopDirection$read.class */
    public static final class read {
        int a;
        int b;
        int c;
        int d = 0;
        int e;

        read() {
        }

        final boolean d() {
            int i = this.d;
            int i2 = 2;
            if ((i & 7) != 0) {
                int i3 = this.b;
                int i4 = this.c;
                if ((i & (i3 > i4 ? 1 : i3 == i4 ? 2 : 4)) == 0) {
                    return false;
                }
            }
            int i5 = this.d;
            if ((i5 & 112) != 0) {
                int i6 = this.b;
                int i7 = this.e;
                if ((i5 & ((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) << 4)) == 0) {
                    return false;
                }
            }
            int i8 = this.d;
            if ((i8 & 1792) != 0) {
                int i9 = this.a;
                int i10 = this.c;
                if ((i8 & ((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) << 8)) == 0) {
                    return false;
                }
            }
            int i11 = this.d;
            if ((i11 & 28672) == 0) {
                return true;
            }
            int i12 = this.a;
            int i13 = this.e;
            if (i12 > i13) {
                i2 = 1;
            } else if (i12 != i13) {
                i2 = 4;
            }
            return (i11 & (i2 << 12)) != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setPopDirection(setPopDirection$MediaBrowserCompat$CustomActionResultReceiver setpopdirection_mediabrowsercompat_customactionresultreceiver) {
        this.a = setpopdirection_mediabrowsercompat_customactionresultreceiver;
    }

    public final boolean a(View view, int i) {
        read read2 = this.c;
        int b = this.a.b();
        int d = this.a.d();
        int a = this.a.a(view);
        int e = this.a.e(view);
        read2.c = b;
        read2.e = d;
        read2.b = a;
        read2.a = e;
        this.c.d = 0;
        this.c.d |= 24579;
        return this.c.d();
    }

    public final View e(int i, int i2, int i3, int i4) {
        int b = this.a.b();
        int d = this.a.d();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a = this.a.a(i);
            int a2 = this.a.a(a);
            int e = this.a.e(a);
            read read2 = this.c;
            read2.c = b;
            read2.e = d;
            read2.b = a2;
            read2.a = e;
            if (i3 != 0) {
                this.c.d = 0;
                this.c.d |= i3;
                if (this.c.d()) {
                    return a;
                }
            }
            view = view;
            if (i4 != 0) {
                this.c.d = 0;
                this.c.d |= i4;
                view = view;
                if (this.c.d()) {
                    view = a;
                }
            }
            i += i5;
        }
        return view;
    }
}
