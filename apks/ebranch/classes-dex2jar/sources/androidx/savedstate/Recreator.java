package androidx.savedstate;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o.onPrimaryNavigationFragmentChanged;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.performContextItemSelected;
import o.setLayoutFrozen;
import o.setOnFlingListener;
import o.setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver;
/* loaded from: classes-dex2jar.jar:androidx/savedstate/Recreator.class */
public final class Recreator implements onPrimaryNavigationFragmentChanged {
    private final setLayoutFrozen e;

    /* loaded from: classes-dex2jar.jar:androidx/savedstate/Recreator$read.class */
    public static final class read implements setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver {
        public final Set<String> c = new HashSet();

        public read(setOnFlingListener setonflinglistener) {
            if (setonflinglistener.d.e("androidx.savedstate.Restarter", this) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }

        @Override // o.setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver
        public final Bundle c() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.c));
            return bundle;
        }
    }

    public Recreator(setLayoutFrozen setlayoutfrozen) {
        this.e = setlayoutfrozen;
    }

    @Override // o.onResume
    public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
        if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_CREATE) {
            performcontextitemselected.getLifecycle().e(this);
            Bundle d = this.e.getSavedStateRegistry().d("androidx.savedstate.Restarter");
            if (d != null) {
                ArrayList<String> stringArrayList = d.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(setOnFlingListener.RemoteActionCompatParcelizer.class);
                            try {
                                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((setOnFlingListener.RemoteActionCompatParcelizer) declaredConstructor.newInstance(new Object[0])).a(this.e);
                                } catch (Exception e) {
                                    StringBuilder sb = new StringBuilder("Failed to instantiate ");
                                    sb.append(next);
                                    throw new RuntimeException(sb.toString(), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                StringBuilder sb2 = new StringBuilder("Class");
                                sb2.append(asSubclass.getSimpleName());
                                sb2.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(sb2.toString(), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            StringBuilder sb3 = new StringBuilder("Class ");
                            sb3.append(next);
                            sb3.append(" wasn't found");
                            throw new RuntimeException(sb3.toString(), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
