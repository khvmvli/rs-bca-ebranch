package o;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import o.onContextItemSelected;
import o.onRequestPermissionsResult;
/* loaded from: classes-dex2jar.jar:o/isRemoving.class */
public final class isRemoving {
    final onActivityCreated a;
    private final isAdded b;
    private boolean c = false;
    int d = -1;
    final Fragment e;

    /* renamed from: o.isRemoving$1 */
    /* loaded from: classes-dex2jar.jar:o/isRemoving$1.class */
    public static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[onRequestPermissionsResult.read.values().length];
            d = iArr;
            try {
                iArr[onRequestPermissionsResult.read.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                d[onRequestPermissionsResult.read.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                d[onRequestPermissionsResult.read.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                d[onRequestPermissionsResult.read.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    public isRemoving(isAdded isadded, onActivityCreated onactivitycreated, Fragment fragment) {
        this.b = isadded;
        this.a = onactivitycreated;
        this.e = fragment;
    }

    public isRemoving(isAdded isadded, onActivityCreated onactivitycreated, Fragment fragment, isRemovingParent isremovingparent) {
        this.b = isadded;
        this.a = onactivitycreated;
        this.e = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        fragment.mTargetWho = fragment.mTarget != null ? fragment.mTarget.mWho : null;
        fragment.mTarget = null;
        if (isremovingparent.f162o != null) {
            fragment.mSavedFragmentState = isremovingparent.f162o;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }

    public isRemoving(isAdded isadded, onActivityCreated onactivitycreated, ClassLoader classLoader, hasOptionsMenu hasoptionsmenu, isRemovingParent isremovingparent) {
        this.b = isadded;
        this.a = onactivitycreated;
        Fragment d = hasoptionsmenu.d(classLoader, isremovingparent.a);
        this.e = d;
        if (isremovingparent.b != null) {
            isremovingparent.b.setClassLoader(classLoader);
        }
        d.setArguments(isremovingparent.b);
        d.mWho = isremovingparent.m;
        d.mFromLayout = isremovingparent.f;
        d.mRestored = true;
        d.mFragmentId = isremovingparent.c;
        d.mContainerId = isremovingparent.d;
        d.mTag = isremovingparent.k;
        d.mRetainInstance = isremovingparent.i;
        d.mRemoving = isremovingparent.g;
        d.mDetached = isremovingparent.e;
        d.mHidden = isremovingparent.h;
        d.mMaxState = onRequestPermissionsResult.read.values()[isremovingparent.j];
        if (isremovingparent.f162o != null) {
            d.mSavedFragmentState = isremovingparent.f162o;
        } else {
            d.mSavedFragmentState = new Bundle();
        }
        if (isDetached.a(2)) {
            StringBuilder sb = new StringBuilder("Instantiated fragment ");
            sb.append(d);
            Log.v("FragmentManager", sb.toString());
        }
    }

    private boolean d(View view) {
        if (view == this.e.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.e.mView) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        this.e.mContainer.addView(this.e.mView, this.a.d(this.e));
    }

    public final void a(ClassLoader classLoader) {
        if (this.e.mSavedFragmentState != null) {
            this.e.mSavedFragmentState.setClassLoader(classLoader);
            Fragment fragment = this.e;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.e;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
            Fragment fragment3 = this.e;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
            if (this.e.mTargetWho != null) {
                Fragment fragment4 = this.e;
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            if (this.e.mSavedUserVisibleHint != null) {
                Fragment fragment5 = this.e;
                fragment5.mUserVisibleHint = fragment5.mSavedUserVisibleHint.booleanValue();
                this.e.mSavedUserVisibleHint = null;
            } else {
                Fragment fragment6 = this.e;
                fragment6.mUserVisibleHint = fragment6.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            if (!this.e.mUserVisibleHint) {
                this.e.mDeferStart = true;
            }
        }
    }

    public final void b() {
        if (isDetached.a(3)) {
            StringBuilder sb = new StringBuilder("moveto ATTACHED: ");
            sb.append(this.e);
            Log.d("FragmentManager", sb.toString());
        }
        isRemoving isremoving = null;
        if (this.e.mTarget != null) {
            onActivityCreated onactivitycreated = this.a;
            isremoving = onactivitycreated.c.get(this.e.mTarget.mWho);
            if (isremoving != null) {
                Fragment fragment = this.e;
                fragment.mTargetWho = fragment.mTarget.mWho;
                this.e.mTarget = null;
            } else {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(this.e);
                sb2.append(" declared target fragment ");
                sb2.append(this.e.mTarget);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
        } else if (this.e.mTargetWho != null) {
            onActivityCreated onactivitycreated2 = this.a;
            isremoving = onactivitycreated2.c.get(this.e.mTargetWho);
            if (isremoving == null) {
                StringBuilder sb3 = new StringBuilder("Fragment ");
                sb3.append(this.e);
                sb3.append(" declared target fragment ");
                sb3.append(this.e.mTargetWho);
                sb3.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb3.toString());
            }
        }
        if (isremoving != null && (isDetached.d || isremoving.e.mState <= 0)) {
            isremoving.m();
        }
        Fragment fragment2 = this.e;
        fragment2.mHost = fragment2.mFragmentManager.f;
        Fragment fragment3 = this.e;
        fragment3.mParentFragment = fragment3.mFragmentManager.r;
        this.b.a(this.e, false);
        this.e.performAttach();
        this.b.e(this.e, false);
    }

    public final int c() {
        int i;
        if (this.e.mFragmentManager == null) {
            return this.e.mState;
        }
        int i2 = this.d;
        int i3 = AnonymousClass1.d[this.e.mMaxState.ordinal()];
        int i4 = i2;
        if (i3 != 1) {
            i4 = i3 != 2 ? i3 != 3 ? i3 != 4 ? Math.min(i2, -1) : Math.min(i2, 0) : Math.min(i2, 1) : Math.min(i2, 5);
        }
        int i5 = i4;
        if (this.e.mFromLayout) {
            if (this.e.mInLayout) {
                int max = Math.max(this.d, 2);
                i5 = max;
                if (this.e.mView != null) {
                    i5 = max;
                    if (this.e.mView.getParent() == null) {
                        i5 = Math.min(max, 2);
                    }
                }
            } else {
                i5 = this.d < 4 ? Math.min(i4, this.e.mState) : Math.min(i4, 1);
            }
        }
        int i6 = i5;
        if (!this.e.mAdded) {
            i6 = Math.min(i5, 1);
        }
        onContextItemSelected.RemoteActionCompatParcelizer.read b = (!isDetached.d || this.e.mContainer == null) ? null : onContextItemSelected.b(this.e.mContainer, this.e.getParentFragmentManager().s()).b(this);
        if (b == onContextItemSelected.RemoteActionCompatParcelizer.read.ADDING) {
            i = Math.min(i6, 6);
        } else if (b == onContextItemSelected.RemoteActionCompatParcelizer.read.REMOVING) {
            i = Math.max(i6, 3);
        } else {
            i = i6;
            if (this.e.mRemoving) {
                i = this.e.isInBackStack() ? Math.min(i6, 1) : Math.min(i6, -1);
            }
        }
        int i7 = i;
        if (this.e.mDeferStart) {
            i7 = i;
            if (this.e.mState < 5) {
                i7 = Math.min(i, 4);
            }
        }
        if (isDetached.a(2)) {
            StringBuilder sb = new StringBuilder("computeExpectedState() of ");
            sb.append(i7);
            sb.append(" for ");
            sb.append(this.e);
            Log.v("FragmentManager", sb.toString());
        }
        return i7;
    }

    public final void d() {
        if (isDetached.a(3)) {
            StringBuilder sb = new StringBuilder("moveto ACTIVITY_CREATED: ");
            sb.append(this.e);
            Log.d("FragmentManager", sb.toString());
        }
        Fragment fragment = this.e;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        isAdded isadded = this.b;
        Fragment fragment2 = this.e;
        isadded.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        this.e.performSaveInstanceState(bundle);
        this.b.c(this.e, bundle, false);
        Bundle bundle2 = bundle;
        if (bundle.isEmpty()) {
            bundle2 = null;
        }
        if (this.e.mView != null) {
            p();
        }
        Bundle bundle3 = bundle2;
        if (this.e.mSavedViewState != null) {
            bundle3 = bundle2;
            if (bundle2 == null) {
                bundle3 = new Bundle();
            }
            bundle3.putSparseParcelableArray("android:view_state", this.e.mSavedViewState);
        }
        Bundle bundle4 = bundle3;
        if (this.e.mSavedViewRegistryState != null) {
            bundle4 = bundle3;
            if (bundle3 == null) {
                bundle4 = new Bundle();
            }
            bundle4.putBundle("android:view_registry_state", this.e.mSavedViewRegistryState);
        }
        Bundle bundle5 = bundle4;
        if (!this.e.mUserVisibleHint) {
            bundle5 = bundle4;
            if (bundle4 == null) {
                bundle5 = new Bundle();
            }
            bundle5.putBoolean("android:user_visible_hint", this.e.mUserVisibleHint);
        }
        return bundle5;
    }

    public final void f() {
        if (isDetached.a(3)) {
            StringBuilder sb = new StringBuilder("moveto CREATED: ");
            sb.append(this.e);
            Log.d("FragmentManager", sb.toString());
        }
        if (!this.e.mIsCreated) {
            isAdded isadded = this.b;
            Fragment fragment = this.e;
            isadded.e(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.e;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            isAdded isadded2 = this.b;
            Fragment fragment3 = this.e;
            isadded2.b(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        Fragment fragment4 = this.e;
        fragment4.restoreChildFragmentState(fragment4.mSavedFragmentState);
        this.e.mState = 1;
    }

    public final void g() {
        ViewGroup viewGroup;
        String str;
        if (!this.e.mFromLayout) {
            if (isDetached.a(3)) {
                StringBuilder sb = new StringBuilder("moveto CREATE_VIEW: ");
                sb.append(this.e);
                Log.d("FragmentManager", sb.toString());
            }
            Fragment fragment = this.e;
            LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
            if (this.e.mContainer != null) {
                viewGroup = this.e.mContainer;
            } else if (this.e.mContainerId == 0) {
                viewGroup = null;
            } else if (this.e.mContainerId != -1) {
                ViewGroup viewGroup2 = (ViewGroup) this.e.mFragmentManager.a.e(this.e.mContainerId);
                viewGroup = viewGroup2;
                if (viewGroup2 == null) {
                    if (this.e.mRestored) {
                        viewGroup = viewGroup2;
                    } else {
                        try {
                            str = this.e.getResources().getResourceName(this.e.mContainerId);
                        } catch (Resources.NotFoundException e) {
                            str = "unknown";
                        }
                        StringBuilder sb2 = new StringBuilder("No view found for id 0x");
                        sb2.append(Integer.toHexString(this.e.mContainerId));
                        sb2.append(" (");
                        sb2.append(str);
                        sb2.append(") for fragment ");
                        sb2.append(this.e);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            } else {
                StringBuilder sb3 = new StringBuilder("Cannot create fragment ");
                sb3.append(this.e);
                sb3.append(" for a container view with no id");
                throw new IllegalArgumentException(sb3.toString());
            }
            this.e.mContainer = viewGroup;
            Fragment fragment2 = this.e;
            fragment2.performCreateView(performGetLayoutInflater, viewGroup, fragment2.mSavedFragmentState);
            if (this.e.mView != null) {
                this.e.mView.setSaveFromParentEnabled(false);
                this.e.mView.setTag(getSharedElementSourceNames$MediaBrowserCompat$CustomActionResultReceiver.d, this.e);
                if (viewGroup != null) {
                    a();
                }
                if (this.e.mHidden) {
                    this.e.mView.setVisibility(8);
                }
                if (findFragmentByWho.F(this.e.mView)) {
                    findFragmentByWho.J(this.e.mView);
                } else {
                    final View view = this.e.mView;
                    view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: o.isRemoving.2
                        @Override // android.view.View.OnAttachStateChangeListener
                        public final void onViewAttachedToWindow(View view2) {
                            view.removeOnAttachStateChangeListener(this);
                            findFragmentByWho.J(view);
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public final void onViewDetachedFromWindow(View view2) {
                        }
                    });
                }
                this.e.performViewCreated();
                isAdded isadded = this.b;
                Fragment fragment3 = this.e;
                isadded.c(fragment3, fragment3.mView, this.e.mSavedFragmentState, false);
                int visibility = this.e.mView.getVisibility();
                float alpha = this.e.mView.getAlpha();
                if (isDetached.d) {
                    this.e.setPostOnViewCreatedAlpha(alpha);
                    if (this.e.mContainer != null && visibility == 0) {
                        View findFocus = this.e.mView.findFocus();
                        if (findFocus != null) {
                            this.e.setFocusedView(findFocus);
                            if (isDetached.a(2)) {
                                StringBuilder sb4 = new StringBuilder("requestFocus: Saved focused view ");
                                sb4.append(findFocus);
                                sb4.append(" for Fragment ");
                                sb4.append(this.e);
                                Log.v("FragmentManager", sb4.toString());
                            }
                        }
                        this.e.mView.setAlpha(0.0f);
                    }
                } else {
                    Fragment fragment4 = this.e;
                    boolean z = false;
                    if (visibility == 0) {
                        z = false;
                        if (fragment4.mContainer != null) {
                            z = true;
                        }
                    }
                    fragment4.mIsNewlyAdded = z;
                }
            }
            this.e.mState = 2;
        }
    }

    public final void h() {
        if (isDetached.a(3)) {
            StringBuilder sb = new StringBuilder("movefrom ATTACHED: ");
            sb.append(this.e);
            Log.d("FragmentManager", sb.toString());
        }
        this.e.performDetach();
        this.b.d(this.e, false);
        this.e.mState = -1;
        this.e.mHost = null;
        this.e.mParentFragment = null;
        this.e.mFragmentManager = null;
        boolean z = false;
        if (this.e.mRemoving) {
            z = false;
            if (!this.e.isInBackStack()) {
                z = true;
            }
        }
        if (z || this.a.a.d(this.e)) {
            if (isDetached.a(3)) {
                StringBuilder sb2 = new StringBuilder("initState called for fragment: ");
                sb2.append(this.e);
                Log.d("FragmentManager", sb2.toString());
            }
            this.e.initState();
        }
    }

    public final void i() {
        if (isDetached.a(3)) {
            StringBuilder sb = new StringBuilder("movefrom CREATED: ");
            sb.append(this.e);
            Log.d("FragmentManager", sb.toString());
        }
        boolean z = true;
        boolean z2 = this.e.mRemoving && !this.e.isInBackStack();
        Fragment fragment = null;
        Fragment fragment2 = null;
        if (z2 || this.a.a.d(this.e)) {
            initState<?> initstate = this.e.mHost;
            if (initstate instanceof performStart) {
                z = this.a.a.b;
            } else if (initstate.c instanceof Activity) {
                z = true ^ ((Activity) initstate.c).isChangingConfigurations();
            }
            if (z2 || z) {
                this.a.a.a(this.e);
            }
            this.e.performDestroy();
            this.b.c(this.e, false);
            for (isRemoving isremoving : this.a.b()) {
                if (isremoving != null) {
                    Fragment fragment3 = isremoving.e;
                    if (this.e.mWho.equals(fragment3.mTargetWho)) {
                        fragment3.mTarget = this.e;
                        fragment3.mTargetWho = null;
                    }
                }
            }
            if (this.e.mTargetWho != null) {
                Fragment fragment4 = this.e;
                isRemoving isremoving2 = this.a.c.get(fragment4.mTargetWho);
                if (isremoving2 != null) {
                    fragment2 = isremoving2.e;
                }
                fragment4.mTarget = fragment2;
            }
            this.a.e(this);
            return;
        }
        if (this.e.mTargetWho != null) {
            isRemoving isremoving3 = this.a.c.get(this.e.mTargetWho);
            if (isremoving3 != null) {
                fragment = isremoving3.e;
            }
            if (fragment != null && fragment.mRetainInstance) {
                this.e.mTarget = fragment;
            }
        }
        this.e.mState = 0;
    }

    public final void j() {
        if (isDetached.a(3)) {
            StringBuilder sb = new StringBuilder("movefrom CREATE_VIEW: ");
            sb.append(this.e);
            Log.d("FragmentManager", sb.toString());
        }
        if (!(this.e.mContainer == null || this.e.mView == null)) {
            this.e.mContainer.removeView(this.e.mView);
        }
        this.e.performDestroyView();
        this.b.j(this.e, false);
        this.e.mContainer = null;
        this.e.mView = null;
        this.e.mViewLifecycleOwner = null;
        this.e.mViewLifecycleOwnerLiveData.a(null);
        this.e.mInLayout = false;
    }

    public final void k() {
        if (isDetached.a(3)) {
            StringBuilder sb = new StringBuilder("movefrom RESUMED: ");
            sb.append(this.e);
            Log.d("FragmentManager", sb.toString());
        }
        this.e.performPause();
        this.b.b(this.e, false);
    }

    public final isRemovingParent l() {
        isRemovingParent isremovingparent = new isRemovingParent(this.e);
        if (this.e.mState < 0 || isremovingparent.f162o != null) {
            isremovingparent.f162o = this.e.mSavedFragmentState;
        } else {
            isremovingparent.f162o = e();
            if (this.e.mTargetWho != null) {
                if (isremovingparent.f162o == null) {
                    isremovingparent.f162o = new Bundle();
                }
                isremovingparent.f162o.putString("android:target_state", this.e.mTargetWho);
                if (this.e.mTargetRequestCode != 0) {
                    isremovingparent.f162o.putInt("android:target_req_state", this.e.mTargetRequestCode);
                }
            }
        }
        return isremovingparent;
    }

    public final void m() {
        if (!this.c) {
            try {
                this.c = true;
                while (true) {
                    int c = c();
                    if (c == this.e.mState) {
                        if (isDetached.d && this.e.mHiddenChanged) {
                            if (!(this.e.mView == null || this.e.mContainer == null)) {
                                onContextItemSelected b = onContextItemSelected.b(this.e.mContainer, this.e.getParentFragmentManager().s());
                                if (this.e.mHidden) {
                                    b.a(this);
                                } else {
                                    b.c(this);
                                }
                            }
                            if (this.e.mFragmentManager != null) {
                                this.e.mFragmentManager.o(this.e);
                            }
                            this.e.mHiddenChanged = false;
                            Fragment fragment = this.e;
                            fragment.onHiddenChanged(fragment.mHidden);
                        }
                        return;
                    } else if (c > this.e.mState) {
                        switch (this.e.mState + 1) {
                            case 0:
                                b();
                                continue;
                            case 1:
                                f();
                                continue;
                            case 2:
                                n();
                                g();
                                continue;
                            case 3:
                                d();
                                continue;
                            case 4:
                                if (!(this.e.mView == null || this.e.mContainer == null)) {
                                    onContextItemSelected.b(this.e.mContainer, this.e.getParentFragmentManager().s()).b(onContextItemSelected.RemoteActionCompatParcelizer.write.b(this.e.mView.getVisibility()), this);
                                }
                                this.e.mState = 4;
                                continue;
                            case 5:
                                r();
                                continue;
                            case 6:
                                this.e.mState = 6;
                                continue;
                            case 7:
                                o();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (this.e.mState - 1) {
                            case -1:
                                h();
                                continue;
                            case 0:
                                i();
                                continue;
                            case 1:
                                j();
                                this.e.mState = 1;
                                continue;
                            case 2:
                                this.e.mInLayout = false;
                                this.e.mState = 2;
                                continue;
                            case 3:
                                if (isDetached.a(3)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("movefrom ACTIVITY_CREATED: ");
                                    sb.append(this.e);
                                    Log.d("FragmentManager", sb.toString());
                                }
                                if (this.e.mView != null && this.e.mSavedViewState == null) {
                                    p();
                                }
                                if (!(this.e.mView == null || this.e.mContainer == null)) {
                                    onContextItemSelected.b(this.e.mContainer, this.e.getParentFragmentManager().s()).e(this);
                                }
                                this.e.mState = 3;
                                continue;
                            case 4:
                                t();
                                continue;
                            case 5:
                                this.e.mState = 5;
                                continue;
                            case 6:
                                k();
                                continue;
                            default:
                                continue;
                        }
                    }
                }
            } finally {
                this.c = false;
            }
        } else if (isDetached.a(2)) {
            StringBuilder sb2 = new StringBuilder("Ignoring re-entrant call to moveToExpectedState() for ");
            sb2.append(this.e);
            Log.v("FragmentManager", sb2.toString());
        }
    }

    public final void n() {
        if (this.e.mFromLayout && this.e.mInLayout && !this.e.mPerformedCreateView) {
            if (isDetached.a(3)) {
                StringBuilder sb = new StringBuilder("moveto CREATE_VIEW: ");
                sb.append(this.e);
                Log.d("FragmentManager", sb.toString());
            }
            Fragment fragment = this.e;
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, this.e.mSavedFragmentState);
            if (this.e.mView != null) {
                this.e.mView.setSaveFromParentEnabled(false);
                this.e.mView.setTag(getSharedElementSourceNames$MediaBrowserCompat$CustomActionResultReceiver.d, this.e);
                if (this.e.mHidden) {
                    this.e.mView.setVisibility(8);
                }
                this.e.performViewCreated();
                isAdded isadded = this.b;
                Fragment fragment2 = this.e;
                isadded.c(fragment2, fragment2.mView, this.e.mSavedFragmentState, false);
                this.e.mState = 2;
            }
        }
    }

    public final void o() {
        if (isDetached.a(3)) {
            StringBuilder sb = new StringBuilder("moveto RESUMED: ");
            sb.append(this.e);
            Log.d("FragmentManager", sb.toString());
        }
        View focusedView = this.e.getFocusedView();
        if (focusedView != null && d(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (isDetached.a(2)) {
                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.e);
                sb2.append(" resulting in focused view ");
                sb2.append(this.e.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.e.setFocusedView(null);
        this.e.performResume();
        this.b.h(this.e, false);
        this.e.mSavedFragmentState = null;
        this.e.mSavedViewState = null;
        this.e.mSavedViewRegistryState = null;
    }

    public final void p() {
        if (this.e.mView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.e.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.e.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.e.mViewLifecycleOwner.b.d(bundle);
            if (!bundle.isEmpty()) {
                this.e.mSavedViewRegistryState = bundle;
            }
        }
    }

    public final void r() {
        if (isDetached.a(3)) {
            StringBuilder sb = new StringBuilder("moveto STARTED: ");
            sb.append(this.e);
            Log.d("FragmentManager", sb.toString());
        }
        this.e.performStart();
        this.b.g(this.e, false);
    }

    public final void t() {
        if (isDetached.a(3)) {
            StringBuilder sb = new StringBuilder("movefrom STARTED: ");
            sb.append(this.e);
            Log.d("FragmentManager", sb.toString());
        }
        this.e.performStop();
        this.b.i(this.e, false);
    }
}
