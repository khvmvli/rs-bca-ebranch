package o;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import java.util.Map;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.performContextItemSelected;
import o.setOnFlingListener;
import o.setSwitchPadding;
/* loaded from: classes-dex2jar.jar:o/setOnFlingListener.class */
public final class setOnFlingListener {
    private Recreator.read a;
    private Bundle b;
    private boolean c;
    public setSwitchPadding<String, setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver> d = new setSwitchPadding<>();
    public boolean e = true;

    /* loaded from: classes-dex2jar.jar:o/setOnFlingListener$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void a(setLayoutFrozen setlayoutfrozen);
    }

    public final void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        setSwitchPadding<String, setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver> setswitchpadding = this.d;
        setSwitchPadding.read read = new setSwitchPadding.read();
        setswitchpadding.a.put(read, Boolean.FALSE);
        while (read.hasNext()) {
            Map.Entry next = read.next();
            bundle2.putBundle((String) next.getKey(), ((setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver) next.getValue()).c());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void c(Class<? extends RemoteActionCompatParcelizer> cls) {
        if (this.e) {
            if (this.a == null) {
                this.a = new Recreator.read(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.read read = this.a;
                read.c.add(cls.getName());
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder("Class");
                sb.append(cls.getSimpleName());
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(sb.toString(), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final Bundle d(String str) {
        if (this.c) {
            Bundle bundle = this.b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.b.remove(str);
            if (this.b.isEmpty()) {
                this.b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final void d(onRequestPermissionsResult onrequestpermissionsresult, Bundle bundle) {
        if (!this.c) {
            if (bundle != null) {
                this.b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            onrequestpermissionsresult.c(new onPrimaryNavigationFragmentChanged() { // from class: androidx.savedstate.SavedStateRegistry$1
                @Override // o.onResume
                public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
                    if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_START) {
                        setOnFlingListener.this.e = true;
                    } else if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_STOP) {
                        setOnFlingListener.this.e = false;
                    }
                }
            });
            this.c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }
}
