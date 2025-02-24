package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.LiveData;
import io.realm.internal.Property;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.ActivityResultRegistry$1;
import o.ComponentActivity$4;
import o.ComponentActivity$5;
import o.ImmLeaksCleaner;
import o.PlaybackStateCompat;
import o.getInsets;
import o.getView;
import o.getViewModelStore;
import o.hasOptionsMenu;
import o.initState;
import o.isDetached;
import o.isHideReplaced;
import o.onContextItemSelected;
import o.onCreateAnimator;
import o.onCreateView;
import o.onRequestPermissionsResult;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.onResume;
import o.onStop;
import o.performContextItemSelected;
import o.performCreate;
import o.performDestroyView;
import o.performOptionsItemSelected;
import o.performPrimaryNavigationFragmentChanged;
import o.performStart;
import o.performStop;
import o.postponeEnterTransition;
import o.registerForActivityResult;
import o.requireArguments;
import o.setFitsSystemWindows;
import o.setItemAnimator;
import o.setLayoutFrozen;
import o.setLayoutManager;
import o.setOnFlingListener;
import o.setSwitchMinWidth;
/* loaded from: classes-dex2jar.jar:androidx/fragment/app/Fragment.class */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, performStart, setLayoutFrozen {
    static final int ACTIVITY_CREATED;
    static final int ATTACHED;
    static final int AWAITING_ENTER_EFFECTS;
    static final int AWAITING_EXIT_EFFECTS;
    static final int CREATED;
    static final int INITIALIZING;
    static final int RESUMED;
    static final int STARTED;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED;
    public boolean mAdded;
    Fragment$MediaBrowserCompat$CustomActionResultReceiver mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    private boolean mCalled;
    public isDetached mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    performStop.read mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public isDetached mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public initState<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    public performCreate mLifecycleRegistry;
    public onRequestPermissionsResult.read mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<RemoteActionCompatParcelizer> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    Runnable mPostponedDurationRunnable;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    setLayoutManager mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public onCreateAnimator mViewLifecycleOwner;
    public performDestroyView<performContextItemSelected> mViewLifecycleOwnerLiveData;
    public String mWho;

    /* loaded from: classes-dex2jar.jar:androidx/fragment/app/Fragment$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void a();

        void e();
    }

    /* loaded from: classes-dex2jar.jar:androidx/fragment/app/Fragment$InstantiationException.class */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/fragment/app/Fragment$RemoteActionCompatParcelizer.class */
    public static abstract class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        abstract void e();
    }

    /* loaded from: classes-dex2jar.jar:androidx/fragment/app/Fragment$read.class */
    public static class read implements Parcelable {
        public static final Parcelable.Creator<read> CREATOR = new Parcelable.ClassLoaderCreator<read>() { // from class: androidx.fragment.app.Fragment.read.5
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new read(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ read createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new read(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new read[i];
            }
        };
        final Bundle a;

        public read(Bundle bundle) {
            this.a = bundle;
        }

        read(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.a);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new isHideReplaced();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new Runnable() { // from class: androidx.fragment.app.Fragment.4
            @Override // java.lang.Runnable
            public final void run() {
                Fragment.this.startPostponedEnterTransition();
            }
        };
        this.mMaxState = onRequestPermissionsResult.read.RESUMED;
        this.mViewLifecycleOwnerLiveData = new performDestroyView<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    private Fragment$MediaBrowserCompat$CustomActionResultReceiver ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new Fragment$MediaBrowserCompat$CustomActionResultReceiver();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        return (this.mMaxState == onRequestPermissionsResult.read.INITIALIZED || this.mParentFragment == null) ? this.mMaxState.ordinal() : Math.min(this.mMaxState.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new performCreate(this);
        this.mSavedStateRegistryController = setLayoutManager.c(this);
        this.mDefaultFactory = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) hasOptionsMenu.b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    private <I, O> ActivityResultRegistry$1<I> prepareCallInternal(final ComponentActivity$4<I, O> componentActivity$4, final setSwitchMinWidth<Void, ComponentActivity$5> setswitchminwidth, final PlaybackStateCompat.CustomAction<O> customAction) {
        if (this.mState <= 1) {
            final AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new RemoteActionCompatParcelizer() { // from class: androidx.fragment.app.Fragment.8
                @Override // androidx.fragment.app.Fragment.RemoteActionCompatParcelizer
                final void e() {
                    String generateActivityResultKey = Fragment.this.generateActivityResultKey();
                    atomicReference.set(((ComponentActivity$5) setswitchminwidth.c(null)).c(generateActivityResultKey, Fragment.this, componentActivity$4, customAction));
                }
            });
            return new ActivityResultRegistry$1<I>() { // from class: androidx.fragment.app.Fragment.6
                @Override // o.ActivityResultRegistry$1
                public final void d() {
                    ActivityResultRegistry$1 activityResultRegistry$1 = (ActivityResultRegistry$1) atomicReference.getAndSet(null);
                    if (activityResultRegistry$1 != null) {
                        activityResultRegistry$1.d();
                    }
                }

                @Override // o.ActivityResultRegistry$1
                public final void e(I i, setFitsSystemWindows setfitssystemwindows) {
                    ActivityResultRegistry$1 activityResultRegistry$1 = (ActivityResultRegistry$1) atomicReference.get();
                    if (activityResultRegistry$1 != null) {
                        activityResultRegistry$1.e(i, setfitssystemwindows);
                        return;
                    }
                    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
                }
            };
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (this.mState >= 0) {
            remoteActionCompatParcelizer.e();
        } else {
            this.mOnPreAttachedListeners.add(remoteActionCompatParcelizer);
        }
    }

    private void restoreViewState() {
        if (isDetached.a(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        isDetached isdetached;
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        IconCompatParcelizer iconCompatParcelizer = null;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver != null) {
            fragment$MediaBrowserCompat$CustomActionResultReceiver.f = false;
            iconCompatParcelizer = this.mAnimationInfo.y;
            this.mAnimationInfo.y = null;
        }
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.e();
        } else if (isDetached.d && this.mView != null && (viewGroup = this.mContainer) != null && (isdetached = this.mFragmentManager) != null) {
            final onContextItemSelected a = onContextItemSelected.a(viewGroup, isdetached);
            a.d();
            if (z) {
                this.mHost.i().post(new Runnable() { // from class: androidx.fragment.app.Fragment.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.a();
                    }
                });
            } else {
                a.a();
            }
        }
    }

    public getViewModelStore createFragmentContainer() {
        return new getViewModelStore() { // from class: androidx.fragment.app.Fragment.3
            @Override // o.getViewModelStore
            public final boolean d() {
                return Fragment.this.mView != null;
            }

            @Override // o.getViewModelStore
            public final View e(int i) {
                if (Fragment.this.mView != null) {
                    return Fragment.this.mView.findViewById(i);
                }
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(Fragment.this);
                sb.append(" does not have a view");
                throw new IllegalStateException(sb.toString());
            }
        };
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            requireArguments.d(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        isDetached isdetached = this.mChildFragmentManager;
        isdetached.b(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.e(str);
    }

    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final getView getActivity() {
        initState<?> initstate = this.mHost;
        return initstate == null ? null : (getView) initstate.j();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        return (fragment$MediaBrowserCompat$CustomActionResultReceiver == null || fragment$MediaBrowserCompat$CustomActionResultReceiver.d == null) ? true : this.mAnimationInfo.d.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        return (fragment$MediaBrowserCompat$CustomActionResultReceiver == null || fragment$MediaBrowserCompat$CustomActionResultReceiver.c == null) ? true : this.mAnimationInfo.c.booleanValue();
    }

    public View getAnimatingAway() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.e;
    }

    public Animator getAnimator() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final isDetached getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        initState<?> initstate = this.mHost;
        return initstate == null ? null : initstate.g();
    }

    public performStop.read getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && isDetached.a(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new performOptionsItemSelected(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return 0;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.b;
    }

    public Object getEnterTransition() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.g;
    }

    public getInsets getEnterTransitionCallback() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.j;
    }

    public int getExitAnim() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return 0;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.h;
    }

    public Object getExitTransition() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.i;
    }

    public getInsets getExitTransitionCallback() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.k;
    }

    public View getFocusedView() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.n;
    }

    @Deprecated
    public final isDetached getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        initState<?> initstate = this.mHost;
        return initstate == null ? null : initstate.c();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        LayoutInflater layoutInflater2 = layoutInflater;
        if (layoutInflater == null) {
            layoutInflater2 = performGetLayoutInflater(null);
        }
        return layoutInflater2;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        initState<?> initstate = this.mHost;
        if (initstate != null) {
            LayoutInflater b = initstate.b();
            onStop.d(b, this.mChildFragmentManager.r());
            return b;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Override // o.performContextItemSelected
    public onRequestPermissionsResult getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public requireArguments getLoaderManager() {
        return requireArguments.d(this);
    }

    public int getNextTransition() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return 0;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.f6o;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final isDetached getParentFragmentManager() {
        isDetached isdetached = this.mFragmentManager;
        if (isdetached != null) {
            return isdetached;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return false;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.l;
    }

    public int getPopEnterAnim() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return 0;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.t;
    }

    public int getPopExitAnim() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return 0;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.p;
    }

    public float getPostOnViewCreatedAlpha() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return 1.0f;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.s;
    }

    public Object getReenterTransition() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.q == USE_DEFAULT_TRANSITION ? getExitTransition() : this.mAnimationInfo.q;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.r == USE_DEFAULT_TRANSITION ? getEnterTransition() : this.mAnimationInfo.r;
    }

    @Override // o.setLayoutFrozen
    public final setOnFlingListener getSavedStateRegistry() {
        return this.mSavedStateRegistryController.d();
    }

    public Object getSharedElementEnterTransition() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.x;
    }

    public Object getSharedElementReturnTransition() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.v == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : this.mAnimationInfo.v;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        return (fragment$MediaBrowserCompat$CustomActionResultReceiver == null || fragment$MediaBrowserCompat$CustomActionResultReceiver.w == null) ? new ArrayList<>() : this.mAnimationInfo.w;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        return (fragment$MediaBrowserCompat$CustomActionResultReceiver == null || fragment$MediaBrowserCompat$CustomActionResultReceiver.u == null) ? new ArrayList<>() : this.mAnimationInfo.u;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        isDetached isdetached = this.mFragmentManager;
        if (isdetached == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return isdetached.a(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public performContextItemSelected getViewLifecycleOwner() {
        onCreateAnimator oncreateanimator = this.mViewLifecycleOwner;
        if (oncreateanimator != null) {
            return oncreateanimator;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<performContextItemSelected> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // o.performStart
    public performPrimaryNavigationFragmentChanged getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (getMinimumMaxLifecycleState() != onRequestPermissionsResult.read.INITIALIZED.ordinal()) {
            return this.mFragmentManager.i(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new isHideReplaced();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public boolean isHideReplaced() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return false;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.m;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        isDetached isdetached;
        return this.mMenuVisible && ((isdetached = this.mFragmentManager) == null || isdetached.k(this.mParentFragment));
    }

    public boolean isPostponed() {
        Fragment$MediaBrowserCompat$CustomActionResultReceiver fragment$MediaBrowserCompat$CustomActionResultReceiver = this.mAnimationInfo;
        if (fragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return false;
        }
        return fragment$MediaBrowserCompat$CustomActionResultReceiver.f;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        isDetached isdetached = this.mFragmentManager;
        if (isdetached == null) {
            return false;
        }
        return isdetached.p();
    }

    public final boolean isVisible() {
        View view;
        return isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.y();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (isDetached.a(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        initState<?> initstate = this.mHost;
        Activity j = initstate == null ? null : initstate.j();
        if (j != null) {
            this.mCalled = false;
            onAttach(j);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.b(1)) {
            this.mChildFragmentManager.d();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        initState<?> initstate = this.mHost;
        Activity j = initstate == null ? null : initstate.j();
        if (j != null) {
            this.mCalled = false;
            onInflate(j, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.y();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.c();
            return;
        }
        throw new onCreateView("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void performAttach() {
        Iterator<RemoteActionCompatParcelizer> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.c(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.g());
        if (this.mCalled) {
            this.mFragmentManager.f(this);
            this.mChildFragmentManager.b();
            return;
        }
        throw new onCreateView("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.e(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.b(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.y();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.c(new onResume() { // from class: androidx.fragment.app.Fragment.5
            @Override // o.onResume
            public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
                if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_STOP && Fragment.this.mView != null) {
                    Fragment.this.mView.cancelPendingInputEvents();
                }
            }
        });
        this.mSavedStateRegistryController.e(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.b(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_CREATE);
            return;
        }
        throw new onCreateView("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (!this.mHidden) {
            boolean z2 = false;
            if (this.mHasMenu) {
                z2 = false;
                if (this.mMenuVisible) {
                    onCreateOptionsMenu(menu, menuInflater);
                    z2 = true;
                }
            }
            z = z2 | this.mChildFragmentManager.b(menu, menuInflater);
        }
        return z;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.y();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new onCreateAnimator(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.c();
            registerForActivityResult.e(this.mView, this.mViewLifecycleOwner);
            postponeEnterTransition.a(this.mView, this.mViewLifecycleOwner);
            setItemAnimator.e(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.a(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.e()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.j();
        this.mLifecycleRegistry.b(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new onCreateView("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.i();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().a().a(onRequestPermissionsResult.read.CREATED)) {
            this.mViewLifecycleOwner.c(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            requireArguments.d(this).a();
            this.mPerformedCreateView = false;
            return;
        }
        throw new onCreateView("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new onCreateView("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.mChildFragmentManager.t()) {
            this.mChildFragmentManager.j();
            this.mChildFragmentManager = new isHideReplaced();
        }
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.g();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.c(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) {
            return this.mChildFragmentManager.d(menuItem);
        }
        return true;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.e(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.f();
        if (this.mView != null) {
            this.mViewLifecycleOwner.c(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_PAUSE);
        }
        this.mLifecycleRegistry.b(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new onCreateView("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.b(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (!this.mHidden) {
            boolean z2 = false;
            if (this.mHasMenu) {
                z2 = false;
                if (this.mMenuVisible) {
                    onPrepareOptionsMenu(menu);
                    z2 = true;
                }
            }
            z = z2 | this.mChildFragmentManager.b(menu);
        }
        return z;
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean m = this.mFragmentManager.m(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != m) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(m);
            onPrimaryNavigationFragmentChanged(m);
            this.mChildFragmentManager.h();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.y();
        this.mChildFragmentManager.a(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            this.mLifecycleRegistry.b(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleOwner.c(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_RESUME);
            }
            this.mChildFragmentManager.m();
            return;
        }
        throw new onCreateView("Fragment " + this + " did not call through to super.onResume()");
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.d(bundle);
        Parcelable w = this.mChildFragmentManager.w();
        if (w != null) {
            bundle.putParcelable("android:support:fragments", w);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.y();
        this.mChildFragmentManager.a(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            this.mLifecycleRegistry.b(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleOwner.c(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_START);
            }
            this.mChildFragmentManager.k();
            return;
        }
        throw new onCreateView("Fragment " + this + " did not call through to super.onStart()");
    }

    public void performStop() {
        this.mChildFragmentManager.l();
        if (this.mView != null) {
            this.mViewLifecycleOwner.c(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_STOP);
        }
        this.mLifecycleRegistry.b(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new onCreateView("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.n();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f = true;
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        ensureAnimationInfo().f = true;
        isDetached isdetached = this.mFragmentManager;
        Handler i = isdetached != null ? isdetached.q().i() : new Handler(Looper.getMainLooper());
        i.removeCallbacks(this.mPostponedDurationRunnable);
        i.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> ActivityResultRegistry$1<I> registerForActivityResult(ComponentActivity$4<I, O> componentActivity$4, final ComponentActivity$5 componentActivity$5, PlaybackStateCompat.CustomAction<O> customAction) {
        return prepareCallInternal(componentActivity$4, new setSwitchMinWidth<Void, ComponentActivity$5>() { // from class: androidx.fragment.app.Fragment.10
            @Override // o.setSwitchMinWidth
            public final /* bridge */ /* synthetic */ ComponentActivity$5 c(Void r3) {
                return componentActivity$5;
            }
        }, customAction);
    }

    public final <I, O> ActivityResultRegistry$1<I> registerForActivityResult(ComponentActivity$4<I, O> componentActivity$4, PlaybackStateCompat.CustomAction<O> customAction) {
        return prepareCallInternal(componentActivity$4, new setSwitchMinWidth<Void, ComponentActivity$5>() { // from class: androidx.fragment.app.Fragment.7
            @Override // o.setSwitchMinWidth
            public final /* synthetic */ ComponentActivity$5 c(Void r3) {
                return Fragment.this.mHost instanceof ImmLeaksCleaner ? ((ImmLeaksCleaner) Fragment.this.mHost).e() : Fragment.this.requireActivity().e();
            }
        }, customAction);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            getParentFragmentManager().e(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final getView requireActivity() {
        getView activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final isDetached requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.d(parcelable);
            this.mChildFragmentManager.d();
        }
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new onCreateView("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.c(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().d = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().c = Boolean.valueOf(z);
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().e = view;
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            ensureAnimationInfo().b = i;
            ensureAnimationInfo().h = i2;
            ensureAnimationInfo().t = i3;
            ensureAnimationInfo().p = i4;
        }
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().a = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(getInsets getinsets) {
        ensureAnimationInfo().j = getinsets;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().g = obj;
    }

    public void setExitSharedElementCallback(getInsets getinsets) {
        ensureAnimationInfo().k = getinsets;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().i = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().n = view;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.f();
            }
        }
    }

    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().m = z;
    }

    public void setInitialSavedState(read read2) {
        if (this.mFragmentManager == null) {
            this.mSavedFragmentState = (read2 == null || read2.a == null) ? null : read2.a;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.f();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f6o = i;
        }
    }

    public void setOnStartEnterTransitionListener(IconCompatParcelizer iconCompatParcelizer) {
        ensureAnimationInfo();
        if (iconCompatParcelizer != this.mAnimationInfo.y) {
            if (iconCompatParcelizer == null || this.mAnimationInfo.y == null) {
                if (this.mAnimationInfo.f) {
                    this.mAnimationInfo.y = iconCompatParcelizer;
                }
                if (iconCompatParcelizer != null) {
                    iconCompatParcelizer.a();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo != null) {
            ensureAnimationInfo().l = z;
        }
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().s = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().q = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        isDetached isdetached = this.mFragmentManager;
        if (isdetached == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            isdetached.a(this);
        } else {
            isdetached.s(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().r = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().x = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        this.mAnimationInfo.w = arrayList;
        this.mAnimationInfo.u = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().v = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        isDetached isdetached = this.mFragmentManager;
        isDetached isdetached2 = fragment != null ? fragment.mFragmentManager : null;
        if (isdetached == null || isdetached2 == null || isdetached == isdetached2) {
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment()) {
                if (fragment2.equals(this)) {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            isDetached isdetached = this.mFragmentManager;
            isdetached.e(isdetached.j(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        initState<?> initstate = this.mHost;
        if (initstate != null) {
            return initstate.a(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        initState<?> initstate = this.mHost;
        if (initstate != null) {
            initstate.d(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().b(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost != null) {
            if (isDetached.a(2)) {
                Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
            }
            getParentFragmentManager().e(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().f) {
            if (this.mHost == null) {
                ensureAnimationInfo().f = false;
            } else if (Looper.myLooper() != this.mHost.i().getLooper()) {
                this.mHost.i().postAtFrontOfQueue(new Runnable() { // from class: androidx.fragment.app.Fragment.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Fragment.this.callStartTransitionListener(false);
                    }
                });
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder((int) Property.TYPE_ARRAY);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }
}
