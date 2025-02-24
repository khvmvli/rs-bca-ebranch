package o;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes-dex2jar.jar:o/onRequestPermissionsResult.class */
public abstract class onRequestPermissionsResult {
    AtomicReference<Object> c = new AtomicReference<>();

    /* renamed from: o.onRequestPermissionsResult$4 */
    /* loaded from: classes-dex2jar.jar:o/onRequestPermissionsResult$4.class */
    public static final /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.values().length];
            b = iArr;
            try {
                iArr[onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                b[onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                b[onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                b[onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                b[onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                b[onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                b[onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            int[] iArr2 = new int[read.values().length];
            a = iArr2;
            try {
                iArr2[read.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
            }
            try {
                a[read.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError e9) {
            }
            try {
                a[read.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError e10) {
            }
            try {
                a[read.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError e11) {
            }
            try {
                a[read.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError e12) {
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/onRequestPermissionsResult$read.class */
    public enum read {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean a(read read) {
            return compareTo(read) >= 0;
        }
    }

    public abstract read a();

    public abstract void c(performActivityCreated performactivitycreated);

    public abstract void e(performActivityCreated performactivitycreated);
}
