package o;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import o.performStop;
/* loaded from: classes-dex2jar.jar:o/performOptionsItemSelected.class */
public final class performOptionsItemSelected extends performStop.IconCompatParcelizer {
    private static final Class<?>[] a = {Application.class, performOptionsMenuClosed.class};
    private static final Class<?>[] e = {performOptionsMenuClosed.class};
    private final Bundle b;
    private final Application c;
    private final performStop.read d;
    private final onRequestPermissionsResult h;
    private final setOnFlingListener j;

    public performOptionsItemSelected(Application application, setLayoutFrozen setlayoutfrozen, Bundle bundle) {
        performStop.read read;
        this.j = setlayoutfrozen.getSavedStateRegistry();
        this.h = setlayoutfrozen.getLifecycle();
        this.b = bundle;
        this.c = application;
        if (application != null) {
            if (performStop.write.a == null) {
                performStop.write.a = new performStop.write(application);
            }
            read = performStop.write.a;
        } else {
            if (performStop.RemoteActionCompatParcelizer.c == null) {
                performStop.RemoteActionCompatParcelizer.c = new performStop.RemoteActionCompatParcelizer();
            }
            read = performStop.RemoteActionCompatParcelizer.c;
        }
        this.d = read;
    }

    private static <T> Constructor<T> d(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            if (Arrays.equals(clsArr, constructor2.getParameterTypes())) {
                return constructor2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.performStop$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(performPictureInPictureModeChanged performpictureinpicturemodechanged) {
        SavedStateHandleController.b(performpictureinpicturemodechanged, this.j, this.h);
    }

    @Override // o.performStop.IconCompatParcelizer, o.performStop.read
    public final <T extends performPictureInPictureModeChanged> T e(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) e(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // o.performStop.IconCompatParcelizer
    public final <T extends performPictureInPictureModeChanged> T e(String str, Class<T> cls) {
        T t;
        boolean isAssignableFrom = onInflate.class.isAssignableFrom(cls);
        Constructor d = (!isAssignableFrom || this.c == null) ? d(cls, e) : d(cls, a);
        if (d == null) {
            return (T) this.d.e(cls);
        }
        SavedStateHandleController e2 = SavedStateHandleController.e(this.j, this.h, str, this.b);
        if (isAssignableFrom) {
            try {
                Application application = this.c;
                if (application != null) {
                    t = (T) ((performPictureInPictureModeChanged) d.newInstance(application, e2.e));
                    t.c("androidx.lifecycle.savedstate.vm.tag", e2);
                    return t;
                }
            } catch (IllegalAccessException e3) {
                StringBuilder sb = new StringBuilder("Failed to access ");
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e3);
            } catch (InstantiationException e4) {
                StringBuilder sb2 = new StringBuilder("A ");
                sb2.append(cls);
                sb2.append(" cannot be instantiated.");
                throw new RuntimeException(sb2.toString(), e4);
            } catch (InvocationTargetException e5) {
                StringBuilder sb3 = new StringBuilder("An exception happened in constructor of ");
                sb3.append(cls);
                throw new RuntimeException(sb3.toString(), e5.getCause());
            }
        }
        t = (T) ((performPictureInPictureModeChanged) d.newInstance(e2.e));
        t.c("androidx.lifecycle.savedstate.vm.tag", e2);
        return t;
    }
}
