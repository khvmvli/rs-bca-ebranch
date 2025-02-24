package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import o.createFragmentContainer;
import o.getSystemGestureInsets;
import o.inset;
/* loaded from: classes-dex2jar.jar:o/setRootWindowInsets.class */
public class setRootWindowInsets {
    private static final isTypeVisible a;
    private static final setThumbResource<String, Typeface> c;

    /* loaded from: classes-dex2jar.jar:o/setRootWindowInsets$read.class */
    public static class read extends createFragmentContainer.read {
        private inset.RemoteActionCompatParcelizer e;

        public read(inset.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.e = remoteActionCompatParcelizer;
        }

        @Override // o.createFragmentContainer.read
        public void c(int i) {
            inset.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.e;
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.e(i);
            }
        }

        @Override // o.createFragmentContainer.read
        public void c(Typeface typeface) {
            inset.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.e;
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.e(typeface);
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new getRootStableInsets();
        } else if (Build.VERSION.SDK_INT >= 28) {
            a = new setRootViewData();
        } else if (Build.VERSION.SDK_INT >= 26) {
            a = new setOverriddenInsets();
        } else if (Build.VERSION.SDK_INT < 24 || !setStableInsets.c()) {
            a = new WindowInsetsCompat$Impl20();
        } else {
            a = new setStableInsets();
        }
        c = new setThumbResource<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, createFragmentContainer.IconCompatParcelizer[] iconCompatParcelizerArr, int i) {
        return a.c(context, cancellationSignal, iconCompatParcelizerArr, i);
    }

    public static Typeface a(Context context, getSystemGestureInsets.write write, Resources resources, int i, int i2, inset.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Handler handler, boolean z) {
        Typeface typeface;
        if (write instanceof getSystemGestureInsets$MediaBrowserCompat$CustomActionResultReceiver) {
            getSystemGestureInsets$MediaBrowserCompat$CustomActionResultReceiver getsystemgestureinsets_mediabrowsercompat_customactionresultreceiver = (getSystemGestureInsets$MediaBrowserCompat$CustomActionResultReceiver) write;
            Typeface c2 = c(getsystemgestureinsets_mediabrowsercompat_customactionresultreceiver.e());
            if (c2 != null) {
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.a(c2, handler);
                }
                return c2;
            }
            typeface = createFragmentContainer.e(context, getsystemgestureinsets_mediabrowsercompat_customactionresultreceiver.d(), i2, !z ? remoteActionCompatParcelizer == null : getsystemgestureinsets_mediabrowsercompat_customactionresultreceiver.a() == 0, z ? getsystemgestureinsets_mediabrowsercompat_customactionresultreceiver.c() : -1, inset.RemoteActionCompatParcelizer.b(handler), new read(remoteActionCompatParcelizer));
        } else {
            Typeface c3 = a.c(context, (getSystemGestureInsets.read) write, resources, i2);
            typeface = c3;
            if (remoteActionCompatParcelizer != null) {
                if (c3 != null) {
                    remoteActionCompatParcelizer.a(c3, handler);
                    typeface = c3;
                } else {
                    remoteActionCompatParcelizer.d(-3, handler);
                    typeface = c3;
                }
            }
        }
        if (typeface != null) {
            c.c(b(resources, i, i2), typeface);
        }
        return typeface;
    }

    private static String b(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        sb.append("-");
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r3.equals(r0) == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static android.graphics.Typeface c(java.lang.String r3) {
        /*
            r0 = r3
            if (r0 == 0) goto L_0x002b
            r0 = r3
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000e
            goto L_0x002b
        L_0x000e:
            r0 = r3
            r1 = 0
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            r3 = r0
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r1 = 0
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L_0x002b
            r0 = r3
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r0 = 0
            r3 = r0
        L_0x002d:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setRootWindowInsets.c(java.lang.String):android.graphics.Typeface");
    }

    public static Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Typeface c2 = a.c(context, resources, i, str, i2);
        if (c2 != null) {
            c.c(b(resources, i, i2), c2);
        }
        return c2;
    }

    public static Typeface d(Resources resources, int i, int i2) {
        return c.e(b(resources, i, i2));
    }
}
