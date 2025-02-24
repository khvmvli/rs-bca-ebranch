package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.onResume;
import o.performContextItemSelected;
/* loaded from: classes-dex2jar.jar:androidx/activity/ImmLeaksCleaner.class */
public final class ImmLeaksCleaner implements onResume {
    private static Field a;
    private static int b;
    private static Field c;
    private static Field e;
    private Activity d;

    public ImmLeaksCleaner(Activity activity) {
        this.d = activity;
    }

    @Override // o.onResume
    public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
        if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_DESTROY) {
            if (b == 0) {
                try {
                    b = 2;
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    c = declaredField;
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    a = declaredField2;
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    e = declaredField3;
                    declaredField3.setAccessible(true);
                    b = 1;
                } catch (NoSuchFieldException e2) {
                }
            }
            if (b == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.d.getSystemService("input_method");
                try {
                    Object obj = e.get(inputMethodManager);
                    if (obj != null) {
                        synchronized (obj) {
                            try {
                                View view = (View) c.get(inputMethodManager);
                                if (view != null) {
                                    if (!view.isAttachedToWindow()) {
                                        try {
                                            a.set(inputMethodManager, null);
                                            inputMethodManager.isActive();
                                        } catch (IllegalAccessException e3) {
                                        }
                                    }
                                }
                            } catch (ClassCastException e4) {
                            } catch (IllegalAccessException e5) {
                            }
                        }
                    }
                } catch (IllegalAccessException e6) {
                }
            }
        }
    }
}
