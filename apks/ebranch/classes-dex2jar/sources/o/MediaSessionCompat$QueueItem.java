package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ImmLeaksCleaner;
import androidx.activity.OnBackPressedDispatcher;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import o.ComponentActivity$4;
import o.ComponentActivity$5;
import o.MediaSessionCompat$QueueItem;
import o.PlaybackStateCompat;
import o.onRequestPermissionsResult;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.performContextItemSelected;
import o.performStop;
import o.performViewCreated;
import o.registerForContextMenu;
import o.setEdgeEffectFactory;
/* loaded from: classes-dex2jar.jar:o/MediaSessionCompat$QueueItem.class */
public class MediaSessionCompat$QueueItem extends IconCompat implements performStart, setLayoutFrozen, setContentView, ImmLeaksCleaner {
    private performStop.read a;
    private int b;
    private performPrimaryNavigationFragmentChanged i;
    public final PlaybackStateCompat e = new PlaybackStateCompat();
    private final performCreate f = new performCreate(this);
    final setLayoutManager c = setLayoutManager.c(this);
    private final OnBackPressedDispatcher j = new OnBackPressedDispatcher(new Runnable() { // from class: o.MediaSessionCompat$QueueItem.4
        @Override // java.lang.Runnable
        public final void run() {
            try {
                MediaSessionCompat$QueueItem.this.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    });
    private final AtomicInteger h = new AtomicInteger();
    private final ComponentActivity$5 d = new ComponentActivity$5() { // from class: o.MediaSessionCompat$QueueItem.5
        @Override // o.ComponentActivity$5
        public final <I, O> void b(final int i, ComponentActivity$4<I, O> componentActivity$4, I i2, setFitsSystemWindows setfitssystemwindows) {
            Bundle bundle;
            MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem.this;
            final ComponentActivity$4.read<O> c = componentActivity$4.c(mediaSessionCompat$QueueItem, i2);
            if (c != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.MediaSessionCompat.QueueItem.5.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass5 r0 = AnonymousClass5.this;
                        int i3 = i;
                        Object obj = c.a;
                        String str = r0.h.get(Integer.valueOf(i3));
                        if (str != null) {
                            r0.a.remove(str);
                            ComponentActivity$5.read<?> read = r0.c.get(str);
                            if (read == null || read.c == null) {
                                r0.g.remove(str);
                                r0.d.put(str, obj);
                                return;
                            }
                            read.c.a(obj);
                        }
                    }
                });
                return;
            }
            Intent d = componentActivity$4.d(mediaSessionCompat$QueueItem, i2);
            if (d.getExtras() != null && d.getExtras().getClassLoader() == null) {
                d.setExtrasClassLoader(mediaSessionCompat$QueueItem.getClassLoader());
            }
            if (d.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = d.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                d.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundle = setfitssystemwindows != null ? setfitssystemwindows.a() : null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(d.getAction())) {
                String[] stringArrayExtra = d.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                String[] strArr = stringArrayExtra;
                if (stringArrayExtra == null) {
                    strArr = new String[0];
                }
                setOnHierarchyChangeListener.a(mediaSessionCompat$QueueItem, strArr, i);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(d.getAction())) {
                OnBackPressedDispatcher$LifecycleOnBackPressedCancellable onBackPressedDispatcher$LifecycleOnBackPressedCancellable = (OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) d.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    setOnHierarchyChangeListener.d(mediaSessionCompat$QueueItem, onBackPressedDispatcher$LifecycleOnBackPressedCancellable.e, i, onBackPressedDispatcher$LifecycleOnBackPressedCancellable.c, onBackPressedDispatcher$LifecycleOnBackPressedCancellable.b, onBackPressedDispatcher$LifecycleOnBackPressedCancellable.a, 0, bundle);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.MediaSessionCompat.QueueItem.5.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass5.this.c(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e));
                        }
                    });
                }
            } else {
                setOnHierarchyChangeListener.b(mediaSessionCompat$QueueItem, d, i, bundle);
            }
        }
    };

    /* loaded from: classes-dex2jar.jar:o/MediaSessionCompat$QueueItem$write.class */
    public static final class write {
        performPrimaryNavigationFragmentChanged b;
        Object e;

        write() {
        }
    }

    public MediaSessionCompat$QueueItem() {
        if (getLifecycle() != null) {
            getLifecycle().c(new onResume() { // from class: androidx.activity.ComponentActivity$3
                @Override // o.onResume
                public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
                    if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_STOP) {
                        Window window = MediaSessionCompat$QueueItem.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().c(new onResume() { // from class: androidx.activity.ComponentActivity$4
                @Override // o.onResume
                public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
                    if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_DESTROY) {
                        MediaSessionCompat$QueueItem.this.e.a = null;
                        if (!MediaSessionCompat$QueueItem.this.isChangingConfigurations()) {
                            MediaSessionCompat$QueueItem.this.getViewModelStore().e();
                        }
                    }
                }
            });
            getLifecycle().c(new onResume() { // from class: androidx.activity.ComponentActivity$5
                @Override // o.onResume
                public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
                    MediaSessionCompat$QueueItem.this.c();
                    MediaSessionCompat$QueueItem.this.getLifecycle().e(this);
                }
            });
            if (Build.VERSION.SDK_INT <= 23) {
                getLifecycle().c(new ImmLeaksCleaner(this));
            }
            setOnFlingListener savedStateRegistry = getSavedStateRegistry();
            if (savedStateRegistry.d.e("android:support:activity-result", new setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.MediaSessionCompat$QueueItem.3
                @Override // o.setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver
                public final Bundle c() {
                    Bundle bundle = new Bundle();
                    ComponentActivity$5 componentActivity$5 = MediaSessionCompat$QueueItem.this.d;
                    bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(componentActivity$5.e.values()));
                    bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(componentActivity$5.e.keySet()));
                    bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(componentActivity$5.a));
                    bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) componentActivity$5.g.clone());
                    bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", componentActivity$5.f);
                    return bundle;
                }
            }) == null) {
                b(new ParcelableVolumeInfo() { // from class: o.MediaSessionCompat$QueueItem.2
                    @Override // o.ParcelableVolumeInfo
                    public final void b(Context context) {
                        Bundle d = MediaSessionCompat$QueueItem.this.getSavedStateRegistry().d("android:support:activity-result");
                        if (d != null) {
                            ComponentActivity$5 componentActivity$5 = MediaSessionCompat$QueueItem.this.d;
                            if (d != null) {
                                ArrayList<Integer> integerArrayList = d.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                                ArrayList<String> stringArrayList = d.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                                if (!(stringArrayList == null || integerArrayList == null)) {
                                    componentActivity$5.a = d.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                                    componentActivity$5.f = (Random) d.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                                    componentActivity$5.g.putAll(d.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                                    for (int i = 0; i < stringArrayList.size(); i++) {
                                        String str = stringArrayList.get(i);
                                        if (componentActivity$5.e.containsKey(str)) {
                                            Integer remove = componentActivity$5.e.remove(str);
                                            if (!componentActivity$5.g.containsKey(str)) {
                                                componentActivity$5.h.remove(remove);
                                            }
                                        }
                                        int intValue = integerArrayList.get(i).intValue();
                                        String str2 = stringArrayList.get(i);
                                        componentActivity$5.h.put(Integer.valueOf(intValue), str2);
                                        componentActivity$5.e.put(str2, Integer.valueOf(intValue));
                                    }
                                }
                            }
                        }
                    }
                });
                return;
            }
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void h() {
        getWindow().getDecorView().setTag(registerForContextMenu.write.e, this);
        getWindow().getDecorView().setTag(performViewCreated.read.e, this);
        getWindow().getDecorView().setTag(setEdgeEffectFactory.RemoteActionCompatParcelizer.b, this);
    }

    @Override // o.setContentView
    public final OnBackPressedDispatcher a_() {
        return this.j;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        addContentView(view, layoutParams);
    }

    public final <I, O> ActivityResultRegistry$1<I> b(ComponentActivity$4<I, O> componentActivity$4, ComponentActivity$5 componentActivity$5, PlaybackStateCompat.CustomAction<O> customAction) {
        StringBuilder sb = new StringBuilder("activity_rq#");
        sb.append(this.h.getAndIncrement());
        return componentActivity$5.c(sb.toString(), this, componentActivity$4, customAction);
    }

    public performStop.read b() {
        if (getApplication() != null) {
            if (this.a == null) {
                this.a = new performOptionsItemSelected(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.a;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final void b(ParcelableVolumeInfo parcelableVolumeInfo) {
        PlaybackStateCompat playbackStateCompat = this.e;
        if (playbackStateCompat.a != null) {
            parcelableVolumeInfo.b(playbackStateCompat.a);
        }
        playbackStateCompat.b.add(parcelableVolumeInfo);
    }

    public final <I, O> ActivityResultRegistry$1<I> c(ComponentActivity$4<I, O> componentActivity$4, PlaybackStateCompat.CustomAction<O> customAction) {
        return b(componentActivity$4, this.d, customAction);
    }

    public void c() {
        if (this.i == null) {
            write write2 = (write) getLastNonConfigurationInstance();
            if (write2 != null) {
                this.i = write2.b;
            }
            if (this.i == null) {
                this.i = new performPrimaryNavigationFragmentChanged();
            }
        }
    }

    @Deprecated
    public Object d() {
        return null;
    }

    @Override // o.ImmLeaksCleaner
    public final ComponentActivity$5 e() {
        return this.d;
    }

    @Override // o.IconCompat, o.performContextItemSelected
    public onRequestPermissionsResult getLifecycle() {
        return this.f;
    }

    @Override // o.setLayoutFrozen
    public final setOnFlingListener getSavedStateRegistry() {
        return this.c.b;
    }

    @Override // o.performStart
    public performPrimaryNavigationFragmentChanged getViewModelStore() {
        if (getApplication() != null) {
            c();
            return this.i;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.d.c(i, i2, intent)) {
            onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.j.a();
    }

    @Override // o.IconCompat, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.c.e(bundle);
        PlaybackStateCompat playbackStateCompat = this.e;
        playbackStateCompat.a = this;
        for (ParcelableVolumeInfo parcelableVolumeInfo : playbackStateCompat.b) {
            parcelableVolumeInfo.b(this);
        }
        onCreate(bundle);
        performPause.a(this);
        int i = this.b;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.d.c(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        Object d = d();
        performPrimaryNavigationFragmentChanged performprimarynavigationfragmentchanged = this.i;
        performPrimaryNavigationFragmentChanged performprimarynavigationfragmentchanged2 = performprimarynavigationfragmentchanged;
        if (performprimarynavigationfragmentchanged == null) {
            write write2 = (write) getLastNonConfigurationInstance();
            performprimarynavigationfragmentchanged2 = performprimarynavigationfragmentchanged;
            if (write2 != null) {
                performprimarynavigationfragmentchanged2 = write2.b;
            }
        }
        if (performprimarynavigationfragmentchanged2 == null && d == null) {
            return null;
        }
        write write3 = new write();
        write3.e = d;
        write3.b = performprimarynavigationfragmentchanged2;
        return write3;
    }

    @Override // o.IconCompat, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        onRequestPermissionsResult lifecycle = getLifecycle();
        if (lifecycle instanceof performCreate) {
            performCreate performcreate = (performCreate) lifecycle;
            onRequestPermissionsResult.read read = onRequestPermissionsResult.read.CREATED;
            performcreate.b("setCurrentState");
            performcreate.b(read);
        }
        onSaveInstanceState(bundle);
        this.c.b.c(bundle);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (setBackgroundColor.a()) {
                StringBuilder sb = new StringBuilder("reportFullyDrawn() for ");
                sb.append(getComponentName());
                setOnRefreshListener.b(sb.toString());
            }
            reportFullyDrawn();
        } finally {
            setOnRefreshListener.b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        h();
        setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        h();
        setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
