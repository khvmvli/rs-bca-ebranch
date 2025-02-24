package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.onRequestPermissionsResult;
import o.setOnHierarchyChangeListener;
/* loaded from: classes-dex2jar.jar:o/getView.class */
public class getView extends MediaSessionCompat$QueueItem implements setOnHierarchyChangeListener.RemoteActionCompatParcelizer, setOnHierarchyChangeListener.write {
    boolean d;
    boolean g;
    final getViewLifecycleOwner b = new getViewLifecycleOwner(new read());
    final performCreate a = new performCreate(this);
    boolean i = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getView$read.class */
    public final class read extends initState<getView> implements performStart, setContentView, ImmLeaksCleaner, isMenuVisible {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read() {
            super(r4);
            getView.this = r4;
        }

        @Override // o.isMenuVisible
        public final void a(Fragment fragment) {
            getView.this.c(fragment);
        }

        @Override // o.initState
        public final boolean a(String str) {
            return setOnHierarchyChangeListener.d(getView.this, str);
        }

        @Override // o.setContentView
        public final OnBackPressedDispatcher a_() {
            return getView.this.a_();
        }

        @Override // o.initState
        public final LayoutInflater b() {
            return getView.this.getLayoutInflater().cloneInContext(getView.this);
        }

        @Override // o.initState
        public final /* bridge */ /* synthetic */ getView c() {
            return getView.this;
        }

        @Override // o.initState
        public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            getView.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // o.initState, o.getViewModelStore
        public final boolean d() {
            Window window = getView.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // o.initState, o.getViewModelStore
        public final View e(int i) {
            return getView.this.findViewById(i);
        }

        @Override // o.ImmLeaksCleaner
        public final ComponentActivity$5 e() {
            return getView.this.e();
        }

        @Override // o.initState
        public final void f() {
            getView.this.n();
        }

        @Override // o.performContextItemSelected
        public final onRequestPermissionsResult getLifecycle() {
            return getView.this.a;
        }

        @Override // o.performStart
        public final performPrimaryNavigationFragmentChanged getViewModelStore() {
            return getView.this.getViewModelStore();
        }

        @Override // o.initState
        public final boolean h() {
            return !getView.this.isFinishing();
        }
    }

    public getView() {
        f();
    }

    private static boolean b(isDetached isdetached, onRequestPermissionsResult.read read2) {
        boolean z = false;
        for (Fragment fragment : isdetached.h.d()) {
            if (fragment != null) {
                boolean z2 = z;
                if (fragment.getHost() != null) {
                    z2 = z | b(fragment.getChildFragmentManager(), read2);
                }
                z = z2;
                if (fragment.mViewLifecycleOwner != null) {
                    z = z2;
                    if (fragment.mViewLifecycleOwner.getLifecycle().a().compareTo(onRequestPermissionsResult.read.STARTED) >= 0) {
                        performCreate performcreate = fragment.mViewLifecycleOwner.c;
                        performcreate.b("setCurrentState");
                        performcreate.b(read2);
                        z = true;
                    }
                }
                if (fragment.mLifecycleRegistry.d.compareTo(onRequestPermissionsResult.read.STARTED) >= 0) {
                    performCreate performcreate2 = fragment.mLifecycleRegistry;
                    performcreate2.b("setCurrentState");
                    performcreate2.b(read2);
                    z = true;
                }
            }
        }
        return z;
    }

    private void f() {
        setOnFlingListener savedStateRegistry = getSavedStateRegistry();
        if (savedStateRegistry.d.e("android:support:fragments", new setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.getView.5
            @Override // o.setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver
            public final Bundle c() {
                Bundle bundle = new Bundle();
                getView.this.o();
                getView.this.a.b(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_STOP);
                Parcelable w = getView.this.b.e.e.w();
                if (w != null) {
                    bundle.putParcelable("android:support:fragments", w);
                }
                return bundle;
            }
        }) == null) {
            b(new ParcelableVolumeInfo() { // from class: o.getView.2
                @Override // o.ParcelableVolumeInfo
                public final void b(Context context) {
                    getViewLifecycleOwner getviewlifecycleowner = getView.this.b;
                    isDetached isdetached = getviewlifecycleowner.e.e;
                    initState<?> initstate = getviewlifecycleowner.e;
                    isdetached.c(initstate, initstate, (Fragment) null);
                    Bundle d = getView.this.getSavedStateRegistry().d("android:support:fragments");
                    if (d != null) {
                        Parcelable parcelable = d.getParcelable("android:support:fragments");
                        initState<?> initstate2 = getView.this.b.e;
                        if (initstate2 instanceof performStart) {
                            initstate2.e.d(parcelable);
                            return;
                        }
                        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    @Override // o.setOnHierarchyChangeListener.write
    @Deprecated
    public final void a_(int i) {
    }

    @Deprecated
    protected boolean b(View view, Menu menu) {
        return onPreparePanel(0, view, menu);
    }

    @Deprecated
    public void c(Fragment fragment) {
    }

    final View d(View view, String str, Context context, AttributeSet attributeSet) {
        return this.b.e.e.m.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String obj = sb.toString();
        printWriter.print(obj);
        printWriter.print("mCreated=");
        printWriter.print(this.d);
        printWriter.print(" mResumed=");
        printWriter.print(this.g);
        printWriter.print(" mStopped=");
        printWriter.print(this.i);
        if (getApplication() != null) {
            requireArguments.d(this).b(obj, fileDescriptor, printWriter, strArr);
        }
        this.b.e.e.b(str, fileDescriptor, printWriter, strArr);
    }

    public void k() {
        setOnHierarchyChangeListener.a((Activity) this);
    }

    public isDetached l() {
        return this.b.e.e;
    }

    protected void m() {
        performCreate performcreate = this.a;
        onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver = onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_RESUME;
        performcreate.b("handleLifecycleEvent");
        performcreate.b(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver.e());
        isDetached isdetached = this.b.e.e;
        isdetached.q = false;
        isdetached.p = false;
        isdetached.n.a = false;
        isdetached.d(7);
    }

    @Deprecated
    public void n() {
        invalidateOptionsMenu();
    }

    void o() {
        do {
        } while (b(l(), onRequestPermissionsResult.read.CREATED));
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.b.e.e.y();
        onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.b.e.e.y();
        onConfigurationChanged(configuration);
        this.b.e.e.e(configuration);
    }

    @Override // o.MediaSessionCompat$QueueItem, o.IconCompat, android.app.Activity
    public void onCreate(Bundle bundle) {
        onCreate(bundle);
        performCreate performcreate = this.a;
        onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver = onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_CREATE;
        performcreate.b("handleLifecycleEvent");
        performcreate.b(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver.e());
        isDetached isdetached = this.b.e.e;
        isdetached.q = false;
        isdetached.p = false;
        isdetached.n.a = false;
        isdetached.d(1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = onCreatePanelMenu(i, menu);
        getViewLifecycleOwner getviewlifecycleowner = this.b;
        return onCreatePanelMenu | getviewlifecycleowner.e.e.b(menu, getMenuInflater());
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View d = d(view, str, context, attributeSet);
        return d == null ? onCreateView(view, str, context, attributeSet) : d;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View d = d(null, str, context, attributeSet);
        return d == null ? onCreateView(str, context, attributeSet) : d;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        onDestroy();
        this.b.e.e.j();
        performCreate performcreate = this.a;
        onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver = onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_DESTROY;
        performcreate.b("handleLifecycleEvent");
        performcreate.b(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver.e());
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        onLowMemory();
        this.b.e.e.g();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.b.e.e.d(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.b.e.e.b(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.b.e.e.c(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        this.b.e.e.y();
        onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.b.e.e.e(menu);
        }
        onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        onPause();
        this.g = false;
        this.b.e.e.d(5);
        performCreate performcreate = this.a;
        onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver = onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_PAUSE;
        performcreate.b("handleLifecycleEvent");
        performcreate.b(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver.e());
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.b.e.e.b(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        onPostResume();
        m();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? b(view, menu) | this.b.e.e.b(menu) : onPreparePanel(i, view, menu);
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.b.e.e.y();
        onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.b.e.e.y();
        onResume();
        this.g = true;
        this.b.e.e.a(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.b.e.e.y();
        onStart();
        this.i = false;
        if (!this.d) {
            this.d = true;
            isDetached isdetached = this.b.e.e;
            isdetached.q = false;
            isdetached.p = false;
            isdetached.n.a = false;
            isdetached.d(4);
        }
        this.b.e.e.a(true);
        performCreate performcreate = this.a;
        onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver = onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_START;
        performcreate.b("handleLifecycleEvent");
        performcreate.b(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver.e());
        isDetached isdetached2 = this.b.e.e;
        isdetached2.q = false;
        isdetached2.p = false;
        isdetached2.n.a = false;
        isdetached2.d(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.b.e.e.y();
    }

    @Override // android.app.Activity
    public void onStop() {
        onStop();
        this.i = true;
        o();
        isDetached isdetached = this.b.e.e;
        isdetached.p = true;
        isdetached.n.a = true;
        isdetached.d(4);
        performCreate performcreate = this.a;
        onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver = onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_STOP;
        performcreate.b("handleLifecycleEvent");
        performcreate.b(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver.e());
    }
}
