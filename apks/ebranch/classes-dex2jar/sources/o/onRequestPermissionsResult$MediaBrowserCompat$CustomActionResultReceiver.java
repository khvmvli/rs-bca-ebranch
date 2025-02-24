package o;

import o.onRequestPermissionsResult;
/* loaded from: classes-dex2jar.jar:o/onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.class */
public enum onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver c(onRequestPermissionsResult.read read) {
        int i = onRequestPermissionsResult.AnonymousClass4.a[read.ordinal()];
        if (i == 1) {
            return ON_START;
        }
        if (i == 2) {
            return ON_RESUME;
        }
        if (i != 5) {
            return null;
        }
        return ON_CREATE;
    }

    public static onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver d(onRequestPermissionsResult.read read) {
        int i = onRequestPermissionsResult.AnonymousClass4.a[read.ordinal()];
        if (i == 1) {
            return ON_DESTROY;
        }
        if (i == 2) {
            return ON_STOP;
        }
        if (i != 3) {
            return null;
        }
        return ON_PAUSE;
    }

    public static onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver e(onRequestPermissionsResult.read read) {
        int i = onRequestPermissionsResult.AnonymousClass4.a[read.ordinal()];
        if (i == 1) {
            return ON_CREATE;
        }
        if (i == 2) {
            return ON_START;
        }
        if (i != 3) {
            return null;
        }
        return ON_RESUME;
    }

    public final onRequestPermissionsResult.read e() {
        switch (onRequestPermissionsResult.AnonymousClass4.b[ordinal()]) {
            case 1:
            case 2:
                return onRequestPermissionsResult.read.CREATED;
            case 3:
            case 4:
                return onRequestPermissionsResult.read.STARTED;
            case 5:
                return onRequestPermissionsResult.read.RESUMED;
            case 6:
                return onRequestPermissionsResult.read.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(" has no target state");
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
