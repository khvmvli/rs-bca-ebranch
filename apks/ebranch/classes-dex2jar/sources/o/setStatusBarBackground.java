package o;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setStatusBarBackground.class */
final class setStatusBarBackground {
    protected static final Method a;
    protected static final Method b;
    protected static final Method c;
    protected static final Class<?> e;
    private static final Handler f = new Handler(Looper.getMainLooper());
    protected static final Field d = a();
    protected static final Field g = c();

    /* loaded from: classes-dex2jar.jar:o/setStatusBarBackground$read.class */
    static final class read implements Application.ActivityLifecycleCallbacks {
        private Activity a;
        Object c;
        private final int d;
        private boolean b = false;
        private boolean e = false;
        private boolean i = false;

        read(Activity activity) {
            this.a = activity;
            this.d = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.a == activity) {
                this.a = null;
                this.e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (this.e && !this.i && !this.b && setStatusBarBackground.e(this.c, this.d, activity)) {
                this.i = true;
                this.c = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.a == activity) {
                this.b = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> b2 = b();
        e = b2;
        b = a(b2);
        c = c(b2);
        a = d(b2);
    }

    private static Field a() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return null;
        }
    }

    private static Method a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable th) {
            return null;
        }
    }

    private static Class<?> b() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable th) {
            return null;
        }
    }

    private static Field c() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if ((Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27) && a == null) {
            return false;
        }
        if (c == null && b == null) {
            return false;
        }
        try {
            final Object obj2 = g.get(activity);
            if (obj2 == null || (obj = d.get(activity)) == null) {
                return false;
            }
            final Application application = activity.getApplication();
            final read read2 = new read(activity);
            application.registerActivityLifecycleCallbacks(read2);
            Handler handler = f;
            handler.post(new Runnable() { // from class: o.setStatusBarBackground.1
                @Override // java.lang.Runnable
                public final void run() {
                    read.this.c = obj2;
                }
            });
            if (Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27) {
                a.invoke(obj, obj2, null, null, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE);
            } else {
                activity.recreate();
            }
            handler.post(new Runnable() { // from class: o.setStatusBarBackground.4
                @Override // java.lang.Runnable
                public final void run() {
                    application.unregisterActivityLifecycleCallbacks(read2);
                }
            });
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    private static Method d(Class<?> cls) {
        if (!(Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27) || cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable th) {
            return null;
        }
    }

    protected static boolean e(Object obj, int i, Activity activity) {
        try {
            final Object obj2 = g.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                final Object obj3 = d.get(activity);
                f.postAtFrontOfQueue(new Runnable() { // from class: o.setStatusBarBackground.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (setStatusBarBackground.b != null) {
                                setStatusBarBackground.b.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                            } else {
                                setStatusBarBackground.c.invoke(obj3, obj2, Boolean.FALSE);
                            }
                        } catch (RuntimeException e2) {
                            if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                                throw e2;
                            }
                        } catch (Throwable th) {
                            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                        }
                    }
                });
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }
}
