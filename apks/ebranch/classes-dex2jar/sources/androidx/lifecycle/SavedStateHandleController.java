package androidx.lifecycle;

import android.os.Bundle;
import java.util.HashSet;
import o.onRequestPermissionsResult;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.onResume;
import o.performContextItemSelected;
import o.performOptionsMenuClosed;
import o.performPictureInPictureModeChanged;
import o.performPrimaryNavigationFragmentChanged;
import o.performStart;
import o.setLayoutFrozen;
import o.setOnFlingListener;
/* loaded from: classes-dex2jar.jar:androidx/lifecycle/SavedStateHandleController.class */
public final class SavedStateHandleController implements onResume {
    private final String a;
    private boolean b = false;
    public final performOptionsMenuClosed e;

    /* loaded from: classes-dex2jar.jar:androidx/lifecycle/SavedStateHandleController$write.class */
    static final class write implements setOnFlingListener.RemoteActionCompatParcelizer {
        write() {
        }

        @Override // o.setOnFlingListener.RemoteActionCompatParcelizer
        public final void a(setLayoutFrozen setlayoutfrozen) {
            if (setlayoutfrozen instanceof performStart) {
                performPrimaryNavigationFragmentChanged viewModelStore = ((performStart) setlayoutfrozen).getViewModelStore();
                setOnFlingListener savedStateRegistry = setlayoutfrozen.getSavedStateRegistry();
                for (String str : new HashSet(viewModelStore.b.keySet())) {
                    SavedStateHandleController.b(viewModelStore.b.get(str), savedStateRegistry, setlayoutfrozen.getLifecycle());
                }
                if (!new HashSet(viewModelStore.b.keySet()).isEmpty()) {
                    savedStateRegistry.c(write.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    private SavedStateHandleController(String str, performOptionsMenuClosed performoptionsmenuclosed) {
        this.a = str;
        this.e = performoptionsmenuclosed;
    }

    public static void b(performPictureInPictureModeChanged performpictureinpicturemodechanged, setOnFlingListener setonflinglistener, onRequestPermissionsResult onrequestpermissionsresult) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) performpictureinpicturemodechanged.a("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.b) {
            savedStateHandleController.b(setonflinglistener, onrequestpermissionsresult);
            e(setonflinglistener, onrequestpermissionsresult);
        }
    }

    private void b(setOnFlingListener setonflinglistener, onRequestPermissionsResult onrequestpermissionsresult) {
        if (!this.b) {
            this.b = true;
            onrequestpermissionsresult.c(this);
            if (setonflinglistener.d.e(this.a, this.e.a) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public static SavedStateHandleController e(setOnFlingListener setonflinglistener, onRequestPermissionsResult onrequestpermissionsresult, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, performOptionsMenuClosed.b(setonflinglistener.d(str), bundle));
        savedStateHandleController.b(setonflinglistener, onrequestpermissionsresult);
        e(setonflinglistener, onrequestpermissionsresult);
        return savedStateHandleController;
    }

    private static void e(final setOnFlingListener setonflinglistener, final onRequestPermissionsResult onrequestpermissionsresult) {
        onRequestPermissionsResult.read a = onrequestpermissionsresult.a();
        if (a != onRequestPermissionsResult.read.INITIALIZED) {
            if (!(a.compareTo(onRequestPermissionsResult.read.STARTED) >= 0)) {
                onrequestpermissionsresult.c(new onResume() { // from class: androidx.lifecycle.SavedStateHandleController.1
                    @Override // o.onResume
                    public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
                        if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_START) {
                            onRequestPermissionsResult.this.e(this);
                            setonflinglistener.c(write.class);
                        }
                    }
                });
                return;
            }
        }
        setonflinglistener.c(write.class);
    }

    @Override // o.onResume
    public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
        if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_DESTROY) {
            this.b = false;
            performcontextitemselected.getLifecycle().e(this);
        }
    }
}
