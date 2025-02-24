package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver;
/* loaded from: classes-dex2jar.jar:o/setHasOptionsMenu.class */
public final class setHasOptionsMenu implements Runnable {
    long c;
    long d;
    static final ThreadLocal<setHasOptionsMenu> e = new ThreadLocal<>();
    static Comparator<RemoteActionCompatParcelizer> a = new Comparator<RemoteActionCompatParcelizer>() { // from class: o.setHasOptionsMenu.4
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(RemoteActionCompatParcelizer remoteActionCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = remoteActionCompatParcelizer;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = remoteActionCompatParcelizer2;
            int i = 1;
            int i2 = 1;
            if ((remoteActionCompatParcelizer3.c == null) != (remoteActionCompatParcelizer4.c == null)) {
                if (remoteActionCompatParcelizer3.c != null) {
                    i2 = -1;
                }
                return i2;
            } else if (remoteActionCompatParcelizer3.a != remoteActionCompatParcelizer4.a) {
                if (remoteActionCompatParcelizer3.a) {
                    i = -1;
                }
                return i;
            } else {
                int i3 = remoteActionCompatParcelizer4.e - remoteActionCompatParcelizer3.e;
                if (i3 != 0) {
                    return i3;
                }
                int i4 = remoteActionCompatParcelizer3.d - remoteActionCompatParcelizer4.d;
                if (i4 != 0) {
                    return i4;
                }
                return 0;
            }
        }
    };
    ArrayList<setOnStartEnterTransitionListener> b = new ArrayList<>();
    private ArrayList<RemoteActionCompatParcelizer> g = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setHasOptionsMenu$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        public boolean a;
        public int b;
        public setOnStartEnterTransitionListener c;
        public int d;
        public int e;

        RemoteActionCompatParcelizer() {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setHasOptionsMenu$read.class */
    public static final class read implements setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.read {
        int a;
        int b;
        int[] d;
        int e;

        public final boolean a(int i) {
            if (this.d == null) {
                return false;
            }
            int i2 = this.a;
            for (int i3 = 0; i3 < (i2 << 1); i3 += 2) {
                if (this.d[i3] == i) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.read
        public final void c(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.a << 1;
                int[] iArr = this.d;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.d = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[i3 << 1];
                    this.d = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.d;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.a++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        final void c(setOnStartEnterTransitionListener setonstartentertransitionlistener, boolean z) {
            boolean z2 = false;
            this.a = 0;
            int[] iArr = this.d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = setonstartentertransitionlistener.z;
            if (setonstartentertransitionlistener.g != null && setonstartentertransitionlistener_mediabrowsercompat_itemreceiver != null && setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.u) {
                if (z) {
                    if (setonstartentertransitionlistener.i.g.size() > 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.d(setonstartentertransitionlistener.g.c(), this);
                    }
                } else if (!setonstartentertransitionlistener.c()) {
                    setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.d(this.e, this.b, setonstartentertransitionlistener.R, this);
                }
                if (this.a > setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.w) {
                    setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.w = this.a;
                    setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.v = z;
                    setonstartentertransitionlistener.L.a();
                }
            }
        }
    }

    private static setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable b(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i, long j) {
        boolean z;
        boolean z2;
        int c = setonstartentertransitionlistener.f254o.b.c();
        int i2 = 0;
        while (true) {
            z2 = true;
            if (i2 >= c) {
                z = false;
                break;
            }
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c2 = setOnStartEnterTransitionListener.c(setonstartentertransitionlistener.f254o.b.b(i2));
            if (c2.k == i) {
                if (!((c2.c & 4) != 0)) {
                    z = true;
                    break;
                }
            }
            i2++;
        }
        if (z) {
            return null;
        }
        setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3 = setonstartentertransitionlistener.L;
        try {
            setonstartentertransitionlistener.B++;
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable d = setonstartentertransitionlistener_componentactivity_3.d(i, false, j);
            if (d != null) {
                if ((d.c & 1) != 0) {
                    if ((d.c & 4) == 0) {
                        z2 = false;
                    }
                    if (!z2) {
                        setonstartentertransitionlistener_componentactivity_3.b(d.b);
                    }
                }
                setonstartentertransitionlistener_componentactivity_3.b(d, false);
            }
            return d;
        } finally {
            setonstartentertransitionlistener.d(false);
        }
    }

    public final void b(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i, int i2) {
        if (setonstartentertransitionlistener.isAttachedToWindow() && this.d == 0) {
            this.d = setOnStartEnterTransitionListener.a();
            setonstartentertransitionlistener.post(this);
        }
        read read2 = setonstartentertransitionlistener.M;
        read2.e = i;
        read2.b = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [long] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // java.lang.Runnable
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 783
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHasOptionsMenu.run():void");
    }
}
