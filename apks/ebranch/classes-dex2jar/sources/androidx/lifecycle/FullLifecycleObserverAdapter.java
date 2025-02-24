package androidx.lifecycle;

import o.onPictureInPictureModeChanged;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.onResume;
import o.performContextItemSelected;
/* loaded from: classes-dex2jar.jar:androidx/lifecycle/FullLifecycleObserverAdapter.class */
public class FullLifecycleObserverAdapter implements onResume {
    private final onPictureInPictureModeChanged c;
    private final onResume d;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$2  reason: invalid class name */
    /* loaded from: classes-dex2jar.jar:androidx/lifecycle/FullLifecycleObserverAdapter$2.class */
    static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.values().length];
            b = iArr;
            try {
                iArr[onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                b[onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                b[onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                b[onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                b[onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_STOP.ordinal()] = 5;
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
        }
    }

    public FullLifecycleObserverAdapter(onPictureInPictureModeChanged onpictureinpicturemodechanged, onResume onresume) {
        this.c = onpictureinpicturemodechanged;
        this.d = onresume;
    }

    @Override // o.onResume
    public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
        if (AnonymousClass2.b[onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver.ordinal()] != 7) {
            onResume onresume = this.d;
            if (onresume != null) {
                onresume.b(performcontextitemselected, onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
    }
}
