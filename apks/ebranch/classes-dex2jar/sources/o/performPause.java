package o;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
/* loaded from: classes-dex2jar.jar:o/performPause.class */
public final class performPause extends Fragment {
    private performPause$MediaBrowserCompat$CustomActionResultReceiver d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/performPause$read.class */
    public static final class read implements Application.ActivityLifecycleCallbacks {
        read() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new read());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPostCreated(Activity activity, Bundle bundle) {
            performPause.b(activity, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPostResumed(Activity activity) {
            performPause.b(activity, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPostStarted(Activity activity) {
            performPause.b(activity, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPreDestroyed(Activity activity) {
            performPause.b(activity, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPrePaused(Activity activity) {
            performPause.b(activity, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPreStopped(Activity activity) {
            performPause.b(activity, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            read.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new performPause(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    static void b(Activity activity, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
        if (activity instanceof performCreateOptionsMenu) {
            performCreate c = ((performCreateOptionsMenu) activity).c();
            c.b("handleLifecycleEvent");
            c.b(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver.e());
        } else if (activity instanceof performContextItemSelected) {
            onRequestPermissionsResult lifecycle = ((performContextItemSelected) activity).getLifecycle();
            if (lifecycle instanceof performCreate) {
                performCreate performcreate = (performCreate) lifecycle;
                performcreate.b("handleLifecycleEvent");
                performcreate.b(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver.e());
            }
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        onActivityCreated(bundle);
        onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver = onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_CREATE;
        if (Build.VERSION.SDK_INT < 29) {
            b(getActivity(), onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        onDestroy();
        onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver = onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_DESTROY;
        if (Build.VERSION.SDK_INT < 29) {
            b(getActivity(), onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver);
        }
        this.d = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        onPause();
        onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver = onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_PAUSE;
        if (Build.VERSION.SDK_INT < 29) {
            b(getActivity(), onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver);
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        onResume();
        onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver = onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_RESUME;
        if (Build.VERSION.SDK_INT < 29) {
            b(getActivity(), onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        onStart();
        onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver = onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_START;
        if (Build.VERSION.SDK_INT < 29) {
            b(getActivity(), onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver);
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        onStop();
        onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver = onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_STOP;
        if (Build.VERSION.SDK_INT < 29) {
            b(getActivity(), onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver);
        }
    }
}
