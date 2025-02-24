package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import io.realm.internal.Property;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o.ComponentActivity$4;
import o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import o.PlaybackStateCompat;
import o.getViewLifecycleOwnerLiveData;
import o.isResumed;
import o.noteStateNotSaved;
import o.onRequestPermissionsResult;
import o.setCheckable;
/* loaded from: classes-dex2jar.jar:o/isDetached.class */
public abstract class isDetached {
    public static boolean d;
    private static boolean y;
    private boolean A;
    private boolean D;
    private ActivityResultRegistry$1<String[]> E;
    private boolean H;
    private ArrayList<MediaDescriptionCompat> I;
    private ArrayList<Fragment> J;
    private ActivityResultRegistry$1<OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> K;
    private ActivityResultRegistry$1<Intent> N;
    private ArrayList<Boolean> O;
    private ArrayList<getUserVisibleHint> R;
    getViewModelStore a;
    ArrayList<getUserVisibleHint> b;
    initState<?> f;
    public boolean i;
    isInLayout n;

    /* renamed from: o */
    OnBackPressedDispatcher f161o;
    public boolean p;
    public boolean q;
    Fragment r;
    Fragment s;
    private ArrayList<Object> v;
    private ArrayList<Fragment> w;
    private final ArrayList<IconCompatParcelizer> G = new ArrayList<>();
    final onActivityCreated h = new onActivityCreated();
    final isHidden m = new isHidden(this);
    final RatingCompat k = new RatingCompat(false) { // from class: o.isDetached.3
        @Override // o.RatingCompat
        public final void a() {
            isDetached isdetached = isDetached.this;
            isdetached.a(true);
            if (isdetached.k.c()) {
                isdetached.b(null, -1, 0);
            } else {
                isdetached.f161o.a();
            }
        }
    };
    final AtomicInteger e = new AtomicInteger();
    public final Map<String, Bundle> t = Collections.synchronizedMap(new HashMap());
    private final Map<String, Object> L = Collections.synchronizedMap(new HashMap());
    Map<Fragment, HashSet<setNestedScrollingEnabled>> j = Collections.synchronizedMap(new HashMap());
    private final noteStateNotSaved.write B = new noteStateNotSaved.write() { // from class: o.isDetached.5
        @Override // o.noteStateNotSaved.write
        public final void a(Fragment fragment, setNestedScrollingEnabled setnestedscrollingenabled) {
            isDetached isdetached = isDetached.this;
            if (isdetached.j.get(fragment) == null) {
                isdetached.j.put(fragment, new HashSet<>());
            }
            isdetached.j.get(fragment).add(setnestedscrollingenabled);
        }

        @Override // o.noteStateNotSaved.write
        public final void e(Fragment fragment, setNestedScrollingEnabled setnestedscrollingenabled) {
            if (!setnestedscrollingenabled.b()) {
                isDetached isdetached = isDetached.this;
                HashSet<setNestedScrollingEnabled> hashSet = isdetached.j.get(fragment);
                if (hashSet != null && hashSet.remove(setnestedscrollingenabled) && hashSet.isEmpty()) {
                    isdetached.j.remove(fragment);
                    if (fragment.mState < 5) {
                        isdetached.e(fragment);
                        isdetached.c(fragment, isdetached.c);
                    }
                }
            }
        }
    };
    public final isAdded l = new isAdded(this);
    private final CopyOnWriteArrayList<isMenuVisible> F = new CopyOnWriteArrayList<>();
    int c = -1;
    private hasOptionsMenu z = null;
    private hasOptionsMenu C = new hasOptionsMenu() { // from class: o.isDetached.1
        @Override // o.hasOptionsMenu
        public final Fragment d(ClassLoader classLoader, String str) {
            initState<?> initstate = isDetached.this.f;
            return initState.c(isDetached.this.f.c, str, null);
        }
    };
    private onDestroyOptionsMenu M = null;
    private onDestroyOptionsMenu u = new onDestroyOptionsMenu() { // from class: o.isDetached.9
        @Override // o.onDestroyOptionsMenu
        public final onContextItemSelected c(ViewGroup viewGroup) {
            return new getTargetRequestCode(viewGroup);
        }
    };
    ArrayDeque<RemoteActionCompatParcelizer> g = new ArrayDeque<>();
    private Runnable x = new Runnable() { // from class: o.isDetached.8
        @Override // java.lang.Runnable
        public final void run() {
            isDetached.this.a(true);
        }
    };

    /* loaded from: classes-dex2jar.jar:o/isDetached$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        boolean d(ArrayList<getUserVisibleHint> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes-dex2jar.jar:o/isDetached$MediaDescriptionCompat.class */
    public static final class MediaDescriptionCompat implements Fragment.IconCompatParcelizer {
        final boolean a;
        final getUserVisibleHint c;
        int e;

        MediaDescriptionCompat(getUserVisibleHint getuservisiblehint, boolean z) {
            this.a = z;
            this.c = getuservisiblehint;
        }

        @Override // androidx.fragment.app.Fragment.IconCompatParcelizer
        public final void a() {
            this.e++;
        }

        final void c() {
            boolean z = this.e > 0;
            for (Fragment fragment : this.c.d.h.d()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            this.c.d.c(this.c, this.a, !z, true);
        }

        @Override // androidx.fragment.app.Fragment.IconCompatParcelizer
        public final void e() {
            int i = this.e - 1;
            this.e = i;
            if (i == 0) {
                this.c.d.u();
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/isDetached$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements Parcelable {
        public static final Parcelable.Creator<RemoteActionCompatParcelizer> CREATOR = new Parcelable.Creator<RemoteActionCompatParcelizer>() { // from class: o.isDetached.RemoteActionCompatParcelizer.4
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ RemoteActionCompatParcelizer createFromParcel(Parcel parcel) {
                return new RemoteActionCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ RemoteActionCompatParcelizer[] newArray(int i) {
                return new RemoteActionCompatParcelizer[i];
            }
        };
        int a;
        String b;

        RemoteActionCompatParcelizer(Parcel parcel) {
            this.b = parcel.readString();
            this.a = parcel.readInt();
        }

        RemoteActionCompatParcelizer(String str, int i) {
            this.b = str;
            this.a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeInt(this.a);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/isDetached$read.class */
    public static final class read extends ComponentActivity$4<OnBackPressedDispatcher$LifecycleOnBackPressedCancellable, ComponentActivity$3> {
        read() {
        }

        @Override // o.ComponentActivity$4
        public final /* synthetic */ Intent d(Context context, OnBackPressedDispatcher$LifecycleOnBackPressedCancellable onBackPressedDispatcher$LifecycleOnBackPressedCancellable) {
            OnBackPressedDispatcher$LifecycleOnBackPressedCancellable onBackPressedDispatcher$LifecycleOnBackPressedCancellable2 = onBackPressedDispatcher$LifecycleOnBackPressedCancellable;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = onBackPressedDispatcher$LifecycleOnBackPressedCancellable2.c;
            OnBackPressedDispatcher$LifecycleOnBackPressedCancellable onBackPressedDispatcher$LifecycleOnBackPressedCancellable3 = onBackPressedDispatcher$LifecycleOnBackPressedCancellable2;
            if (intent2 != null) {
                Bundle bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                onBackPressedDispatcher$LifecycleOnBackPressedCancellable3 = onBackPressedDispatcher$LifecycleOnBackPressedCancellable2;
                if (bundleExtra != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    onBackPressedDispatcher$LifecycleOnBackPressedCancellable3 = onBackPressedDispatcher$LifecycleOnBackPressedCancellable2;
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        OnBackPressedDispatcher$LifecycleOnBackPressedCancellable.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable.RemoteActionCompatParcelizer(onBackPressedDispatcher$LifecycleOnBackPressedCancellable2.e);
                        remoteActionCompatParcelizer.d = null;
                        int i = onBackPressedDispatcher$LifecycleOnBackPressedCancellable2.a;
                        int i2 = onBackPressedDispatcher$LifecycleOnBackPressedCancellable2.b;
                        remoteActionCompatParcelizer.b = i;
                        remoteActionCompatParcelizer.a = i2;
                        onBackPressedDispatcher$LifecycleOnBackPressedCancellable3 = new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(remoteActionCompatParcelizer.c, remoteActionCompatParcelizer.d, remoteActionCompatParcelizer.a, remoteActionCompatParcelizer.b);
                    }
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", onBackPressedDispatcher$LifecycleOnBackPressedCancellable3);
            if (isDetached.a(2)) {
                StringBuilder sb = new StringBuilder("CreateIntent created the following intent: ");
                sb.append(intent);
                Log.v("FragmentManager", sb.toString());
            }
            return intent;
        }

        @Override // o.ComponentActivity$4
        public final /* synthetic */ ComponentActivity$3 e(int i, Intent intent) {
            return new ComponentActivity$3(i, intent);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/isDetached$write.class */
    public static abstract class write {
        public void c(isDetached isdetached, Fragment fragment, View view) {
        }
    }

    private void A() {
        if (d) {
            for (onContextItemSelected oncontextitemselected : x()) {
                oncontextitemselected.b();
            }
        } else if (!this.j.isEmpty()) {
            for (Fragment fragment : this.j.keySet()) {
                t(fragment);
                c(fragment, this.c);
            }
        }
    }

    private void B() {
        if (this.v != null) {
            for (int i = 0; i < this.v.size(); i++) {
                this.v.get(i);
            }
        }
    }

    private void C() {
        synchronized (this.G) {
            boolean z = true;
            if (!this.G.isEmpty()) {
                this.k.b = true;
                return;
            }
            RatingCompat ratingCompat = this.k;
            ArrayList<getUserVisibleHint> arrayList = this.b;
            if ((arrayList != null ? arrayList.size() : 0) <= 0 || !m(this.r)) {
                z = false;
            }
            ratingCompat.b = z;
        }
    }

    private int a(ArrayList<getUserVisibleHint> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, setThumbTintMode<Fragment> setthumbtintmode) {
        boolean z;
        boolean z2;
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            getUserVisibleHint getuservisiblehint = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            int i5 = 0;
            while (true) {
                z = true;
                if (i5 >= getuservisiblehint.k.size()) {
                    z2 = false;
                    break;
                } else if (getUserVisibleHint.d((isResumed.read) getuservisiblehint.k.get(i5))) {
                    z2 = true;
                    break;
                } else {
                    i5++;
                }
            }
            if (!z2 || getuservisiblehint.e(arrayList, i4 + 1, i2)) {
                z = false;
            }
            i3 = i3;
            if (z) {
                if (this.I == null) {
                    this.I = new ArrayList<>();
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(getuservisiblehint, booleanValue);
                this.I.add(mediaDescriptionCompat);
                getuservisiblehint.b(mediaDescriptionCompat);
                if (booleanValue) {
                    getuservisiblehint.d();
                } else {
                    getuservisiblehint.e(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, getuservisiblehint);
                }
                e(setthumbtintmode);
            }
        }
        return i3;
    }

    private static void a(ArrayList<getUserVisibleHint> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            getUserVisibleHint getuservisiblehint = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                getuservisiblehint.d(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                getuservisiblehint.e(z);
            } else {
                getuservisiblehint.d(1);
                getuservisiblehint.d();
            }
            i++;
        }
    }

    public static boolean a(int i) {
        return y || Log.isLoggable("FragmentManager", i);
    }

    private boolean a(ArrayList<getUserVisibleHint> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.G) {
            if (this.G.isEmpty()) {
                return false;
            }
            int size = this.G.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.G.get(i).d(arrayList, arrayList2);
            }
            this.G.clear();
            this.f.d.removeCallbacks(this.x);
            return z;
        }
    }

    private void b(ArrayList<getUserVisibleHint> arrayList, ArrayList<Boolean> arrayList2) {
        int i;
        int indexOf;
        int indexOf2;
        ArrayList<MediaDescriptionCompat> arrayList3 = this.I;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            MediaDescriptionCompat mediaDescriptionCompat = this.I.get(i2);
            if (arrayList == null || mediaDescriptionCompat.a || (indexOf2 = arrayList.indexOf(mediaDescriptionCompat.c)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (!(mediaDescriptionCompat.e == 0)) {
                    size = size;
                    i = i2;
                    if (arrayList != null) {
                        size = size;
                        i = i2;
                        if (!mediaDescriptionCompat.c.e(arrayList, 0, arrayList.size())) {
                        }
                    }
                }
                this.I.remove(i2);
                i = i2 - 1;
                size--;
                if (arrayList == null || mediaDescriptionCompat.a || (indexOf = arrayList.indexOf(mediaDescriptionCompat.c)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                    mediaDescriptionCompat.c();
                } else {
                    mediaDescriptionCompat.c.d.c(mediaDescriptionCompat.c, mediaDescriptionCompat.a, false, false);
                }
            } else {
                this.I.remove(i2);
                i = i2 - 1;
                size--;
                mediaDescriptionCompat.c.d.c(mediaDescriptionCompat.c, mediaDescriptionCompat.a, false, false);
            }
            i2 = i + 1;
        }
    }

    public static int c(int i) {
        int i2 = 4099;
        if (i == 4097) {
            i2 = 8194;
        } else if (i != 4099) {
            i2 = i != 8194 ? 0 : 4097;
        }
        return i2;
    }

    private Set<onContextItemSelected> c(ArrayList<getUserVisibleHint> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = arrayList.get(i).k.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((isResumed.read) it.next()).d;
                if (!(fragment == null || (viewGroup = fragment.mContainer) == null)) {
                    hashSet.add(onContextItemSelected.b(viewGroup, s()));
                }
            }
            i++;
        }
        return hashSet;
    }

    public static Fragment d(View view) {
        Object tag = view.getTag(getSharedElementSourceNames$MediaBrowserCompat$CustomActionResultReceiver.d);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void d(ArrayList<getUserVisibleHint> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                b(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    int i3 = i;
                    i2 = i2;
                    if (!arrayList.get(i).q) {
                        if (i2 != i) {
                            d(arrayList, arrayList2, i2, i);
                        }
                        int i4 = i + 1;
                        i2 = i4;
                        if (arrayList2.get(i).booleanValue()) {
                            while (true) {
                                i2 = i4;
                                if (i4 >= size) {
                                    break;
                                }
                                i2 = i4;
                                if (!arrayList2.get(i4).booleanValue()) {
                                    break;
                                }
                                i2 = i4;
                                if (arrayList.get(i4).q) {
                                    break;
                                }
                                i4++;
                            }
                        }
                        d(arrayList, arrayList2, i, i2);
                        i3 = i2 - 1;
                    }
                    i = i3 + 1;
                }
                if (i2 != size) {
                    d(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private void d(ArrayList<getUserVisibleHint> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        boolean z = arrayList.get(i).q;
        ArrayList<Fragment> arrayList3 = this.J;
        if (arrayList3 == null) {
            this.J = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.J.addAll(this.h.d());
        Fragment fragment = this.s;
        boolean z2 = false;
        for (int i4 = i; i4 < i2; i4++) {
            getUserVisibleHint getuservisiblehint = arrayList.get(i4);
            fragment = !arrayList2.get(i4).booleanValue() ? getuservisiblehint.d(this.J, fragment) : getuservisiblehint.b(this.J, fragment);
            z2 = z2 || getuservisiblehint.c;
        }
        this.J.clear();
        if (!z && this.c > 0) {
            if (d) {
                for (int i5 = i; i5 < i2; i5++) {
                    Iterator it = arrayList.get(i5).k.iterator();
                    while (it.hasNext()) {
                        Fragment fragment2 = ((isResumed.read) it.next()).d;
                        if (!(fragment2 == null || fragment2.mFragmentManager == null)) {
                            this.h.a(j(fragment2));
                        }
                    }
                }
            } else {
                noteStateNotSaved.c(this.f.c, this.a, arrayList, arrayList2, i, i2, false, this.B);
            }
        }
        a(arrayList, arrayList2, i, i2);
        if (d) {
            boolean booleanValue = arrayList2.get(i2 - 1).booleanValue();
            for (int i6 = i; i6 < i2; i6++) {
                getUserVisibleHint getuservisiblehint2 = arrayList.get(i6);
                if (booleanValue) {
                    for (int size = getuservisiblehint2.k.size() - 1; size >= 0; size--) {
                        Fragment fragment3 = ((isResumed.read) getuservisiblehint2.k.get(size)).d;
                        if (fragment3 != null) {
                            j(fragment3).m();
                        }
                    }
                } else {
                    Iterator it2 = getuservisiblehint2.k.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment4 = ((isResumed.read) it2.next()).d;
                        if (fragment4 != null) {
                            j(fragment4).m();
                        }
                    }
                }
            }
            a(this.c, true);
            for (onContextItemSelected oncontextitemselected : c(arrayList, i, i2)) {
                oncontextitemselected.c = booleanValue;
                oncontextitemselected.d();
                oncontextitemselected.a();
            }
        } else {
            if (z) {
                setThumbTintMode<Fragment> setthumbtintmode = new setThumbTintMode<>();
                e(setthumbtintmode);
                i3 = a(arrayList, arrayList2, i, i2, setthumbtintmode);
                d(setthumbtintmode);
            } else {
                i3 = i2;
            }
            if (i3 == i || !z) {
                arrayList2 = arrayList2;
            } else {
                if (this.c > 0) {
                    noteStateNotSaved.c(this.f.c, this.a, arrayList, arrayList2, i, i3, true, this.B);
                }
                arrayList2 = arrayList2;
                a(this.c, true);
            }
        }
        while (i < i2) {
            getUserVisibleHint getuservisiblehint3 = arrayList.get(i);
            if (arrayList2.get(i).booleanValue() && getuservisiblehint3.b >= 0) {
                getuservisiblehint3.b = -1;
            }
            getuservisiblehint3.f();
            i++;
        }
        if (z2) {
            B();
        }
    }

    private static void d(setThumbTintMode<Fragment> setthumbtintmode) {
        int size = setthumbtintmode.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) setthumbtintmode.d[i];
            if (!fragment.mAdded) {
                View requireView = fragment.requireView();
                fragment.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    private void d(boolean z) {
        if (this.A) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f == null) {
            if (this.i) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f.d.getLooper()) {
            if (!z) {
                v();
            }
            if (this.R == null) {
                this.R = new ArrayList<>();
                this.O = new ArrayList<>();
            }
            this.A = true;
            try {
                b((ArrayList<getUserVisibleHint>) null, (ArrayList<Boolean>) null);
            } finally {
                this.A = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private void e(setThumbTintMode<Fragment> setthumbtintmode) {
        int i = this.c;
        if (i > 0) {
            int min = Math.min(i, 5);
            for (Fragment fragment : this.h.d()) {
                if (fragment.mState < min) {
                    c(fragment, min);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        setthumbtintmode.add(fragment);
                    }
                }
            }
        }
    }

    public static void q(Fragment fragment) {
        if (y || Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("show: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    private void t(Fragment fragment) {
        HashSet<setNestedScrollingEnabled> hashSet = this.j.get(fragment);
        if (hashSet != null) {
            Iterator<setNestedScrollingEnabled> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            hashSet.clear();
            e(fragment);
            this.j.remove(fragment);
        }
    }

    private void u(Fragment fragment) {
        if (fragment != null) {
            isRemoving isremoving = this.h.c.get(fragment.mWho);
            if (fragment.equals(isremoving != null ? isremoving.e : null)) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    private void v() {
        if (this.q || this.p) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void v(Fragment fragment) {
        ViewGroup c = c(fragment);
        if (c != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            if (c.getTag(getSharedElementSourceNames$MediaBrowserCompat$CustomActionResultReceiver.b) == null) {
                c.setTag(getSharedElementSourceNames$MediaBrowserCompat$CustomActionResultReceiver.b, fragment);
            }
            ((Fragment) c.getTag(getSharedElementSourceNames$MediaBrowserCompat$CustomActionResultReceiver.b)).setPopDirection(fragment.getPopDirection());
        }
    }

    private isInLayout w(Fragment fragment) {
        isInLayout isinlayout = this.n;
        isInLayout isinlayout2 = isinlayout.e.get(fragment.mWho);
        isInLayout isinlayout3 = isinlayout2;
        if (isinlayout2 == null) {
            isinlayout3 = new isInLayout(isinlayout.d);
            isinlayout.e.put(fragment.mWho, isinlayout3);
        }
        return isinlayout3;
    }

    private Set<onContextItemSelected> x() {
        HashSet hashSet = new HashSet();
        for (isRemoving isremoving : this.h.b()) {
            ViewGroup viewGroup = isremoving.e.mContainer;
            if (viewGroup != null) {
                hashSet.add(onContextItemSelected.b(viewGroup, s()));
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r2.mMenuVisible == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static boolean x(androidx.fragment.app.Fragment r2) {
        /*
            r0 = r2
            boolean r0 = r0.mHasMenu
            r3 = r0
            r0 = 1
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0014
            r0 = r4
            r3 = r0
            r0 = r2
            boolean r0 = r0.mMenuVisible
            if (r0 != 0) goto L_0x0062
        L_0x0014:
            r0 = r2
            o.isDetached r0 = r0.mChildFragmentManager
            o.onActivityCreated r0 = r0.h
            java.util.List r0 = r0.a()
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
            r0 = 0
            r6 = r0
        L_0x0027:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0053
            r0 = r5
            java.lang.Object r0 = r0.next()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r2 = r0
            r0 = r6
            r3 = r0
            r0 = r2
            if (r0 == 0) goto L_0x0046
            r0 = r2
            boolean r0 = x(r0)
            r3 = r0
        L_0x0046:
            r0 = r3
            r6 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0027
            r0 = 1
            r7 = r0
            goto L_0x0056
        L_0x0053:
            r0 = 0
            r7 = r0
        L_0x0056:
            r0 = r7
            if (r0 == 0) goto L_0x0060
            r0 = r4
            r3 = r0
            goto L_0x0062
        L_0x0060:
            r0 = 0
            r3 = r0
        L_0x0062:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isDetached.x(androidx.fragment.app.Fragment):boolean");
    }

    private void y(final Fragment fragment) {
        if (fragment.mView != null) {
            getViewLifecycleOwnerLiveData.write b = getViewLifecycleOwnerLiveData.b(this.f.c, fragment, !fragment.mHidden, fragment.getPopDirection());
            if (b == null || b.a == null) {
                if (b != null) {
                    fragment.mView.startAnimation(b.c);
                    b.c.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                b.a.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    final ViewGroup viewGroup = fragment.mContainer;
                    final View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    b.a.addListener(new AnimatorListenerAdapter() { // from class: o.isDetached.10
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (fragment.mView != null && fragment.mHidden) {
                                fragment.mView.setVisibility(8);
                            }
                        }
                    });
                }
                b.a.start();
            }
        }
        if (fragment.mAdded && x(fragment)) {
            this.H = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    private void z() {
        for (isRemoving isremoving : this.h.b()) {
            e(isremoving);
        }
    }

    public final Fragment a(String str) {
        isRemoving isremoving = this.h.c.get(str);
        if (isremoving != null) {
            return isremoving.e;
        }
        return null;
    }

    public final isResumed a() {
        return new getUserVisibleHint(this);
    }

    public final void a(int i, boolean z) {
        initState<?> initstate;
        if (this.f == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.c) {
            this.c = i;
            if (d) {
                this.h.e();
            } else {
                for (Fragment fragment : this.h.d()) {
                    l(fragment);
                }
                for (isRemoving isremoving : this.h.b()) {
                    Fragment fragment2 = isremoving.e;
                    if (!fragment2.mIsNewlyAdded) {
                        l(fragment2);
                    }
                    if (fragment2.mRemoving && !fragment2.isInBackStack()) {
                        this.h.e(isremoving);
                    }
                }
            }
            z();
            if (this.H && (initstate = this.f) != null && this.c == 7) {
                initstate.f();
                this.H = false;
            }
        }
    }

    public final void a(Fragment fragment) {
        this.n.c(fragment);
    }

    public final void a(Fragment fragment, onRequestPermissionsResult.read read2) {
        if (!fragment.equals(a(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        fragment.mMaxState = read2;
    }

    public final void a(IconCompatParcelizer iconCompatParcelizer, boolean z) {
        if (!z || (this.f != null && !this.i)) {
            d(z);
            if (iconCompatParcelizer.d(this.R, this.O)) {
                this.A = true;
                try {
                    d(this.R, this.O);
                } finally {
                    this.A = false;
                    this.O.clear();
                    this.R.clear();
                }
            }
            C();
            if (this.D) {
                this.D = false;
                z();
            }
            this.h.c.values().removeAll(Collections.singleton(null));
        }
    }

    public final boolean a(ArrayList<getUserVisibleHint> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<getUserVisibleHint> arrayList3 = this.b;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.b.remove(size));
            arrayList2.add(Boolean.TRUE);
            return true;
        }
        if (str != null || i >= 0) {
            int size2 = arrayList3.size() - 1;
            while (size2 >= 0) {
                getUserVisibleHint getuservisiblehint = this.b.get(size2);
                if ((str != null && str.equals(getuservisiblehint.n)) || (i >= 0 && i == getuservisiblehint.b)) {
                    break;
                }
                size2--;
            }
            if (size2 < 0) {
                return false;
            }
            i3 = size2;
            if ((i2 & 1) != 0) {
                while (true) {
                    int i4 = size2 - 1;
                    i3 = i4;
                    if (i4 < 0) {
                        break;
                    }
                    getUserVisibleHint getuservisiblehint2 = this.b.get(i4);
                    if (str != null) {
                        size2 = i4;
                        if (str.equals(getuservisiblehint2.n)) {
                            continue;
                        }
                    }
                    i3 = i4;
                    if (i < 0) {
                        break;
                    }
                    i3 = i4;
                    if (i != getuservisiblehint2.b) {
                        break;
                    }
                    size2 = i4;
                }
            }
        } else {
            i3 = -1;
        }
        if (i3 == this.b.size() - 1) {
            return false;
        }
        for (int size3 = this.b.size() - 1; size3 > i3; size3--) {
            arrayList.add(this.b.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX WARN: Finally extract failed */
    public final boolean a(boolean z) {
        d(z);
        boolean z2 = false;
        while (a(this.R, this.O)) {
            this.A = true;
            try {
                d(this.R, this.O);
                this.A = false;
                this.O.clear();
                this.R.clear();
                z2 = true;
            } catch (Throwable th) {
                this.A = false;
                this.O.clear();
                this.R.clear();
                throw th;
            }
        }
        C();
        if (this.D) {
            this.D = false;
            z();
        }
        this.h.c.values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final Fragment b(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment a = a(string);
        if (a == null) {
            StringBuilder sb = new StringBuilder("Fragment no longer exists for key ");
            sb.append(str);
            sb.append(": unique id ");
            sb.append(string);
            b(new IllegalStateException(sb.toString()));
        }
        return a;
    }

    public final isRemoving b(Fragment fragment) {
        if (y || Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("add: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        isRemoving j = j(fragment);
        fragment.mFragmentManager = this;
        this.h.a(j);
        if (!fragment.mDetached) {
            this.h.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (x(fragment)) {
                this.H = true;
            }
        }
        return j;
    }

    public final void b() {
        this.q = false;
        this.p = false;
        this.n.a = false;
        d(0);
    }

    public final void b(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (this.N != null) {
            this.g.addLast(new RemoteActionCompatParcelizer(fragment.mWho, i));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.N.e(intent, null);
            return;
        }
        initState<?> initstate = this.f;
        if (i == -1) {
            copyWindowDataInto.d(initstate.c, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void b(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new onConfigurationChanged("FragmentManager"));
        initState<?> initstate = this.f;
        if (initstate != null) {
            try {
                initstate.d("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                b("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String obj = sb.toString();
        this.h.b(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.w;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.w.get(i).toString());
            }
        }
        ArrayList<getUserVisibleHint> arrayList2 = this.b;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                getUserVisibleHint getuservisiblehint = this.b.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(getuservisiblehint.toString());
                getuservisiblehint.c(obj, printWriter);
            }
        }
        printWriter.print(str);
        StringBuilder sb2 = new StringBuilder("Back Stack Index: ");
        sb2.append(this.e.get());
        printWriter.println(sb2.toString());
        synchronized (this.G) {
            int size3 = this.G.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.G.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.a);
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.c);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.q);
        printWriter.print(" mStopped=");
        printWriter.print(this.p);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.i);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public final void b(boolean z) {
        for (Fragment fragment : this.h.d()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    public final boolean b(int i) {
        return this.c > 0;
    }

    public final boolean b(Menu menu) {
        boolean z = false;
        if (this.c <= 0) {
            return false;
        }
        Iterator<Fragment> it = this.h.d().iterator();
        while (it.hasNext()) {
            Fragment next = it.next();
            if (next != null) {
                if ((next == null ? true : next.isMenuVisible()) && next.performPrepareOptionsMenu(menu)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final boolean b(Menu menu, MenuInflater menuInflater) {
        if (this.c <= 0) {
            return false;
        }
        Iterator<Fragment> it = this.h.d().iterator();
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        while (it.hasNext()) {
            Fragment next = it.next();
            if (next != null) {
                if ((next == null ? true : next.isMenuVisible()) && next.performCreateOptionsMenu(menu, menuInflater)) {
                    ArrayList<Fragment> arrayList2 = arrayList;
                    if (arrayList == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    arrayList2.add(next);
                    z = true;
                    arrayList = arrayList2;
                }
            }
        }
        if (this.w != null) {
            for (int i = 0; i < this.w.size(); i++) {
                Fragment fragment = this.w.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.onDestroyOptionsMenu();
                }
            }
        }
        this.w = arrayList;
        return z;
    }

    public final boolean b(MenuItem menuItem) {
        if (this.c <= 0) {
            return false;
        }
        for (Fragment fragment : this.h.d()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean b(String str, int i, int i2) {
        a(false);
        d(true);
        Fragment fragment = this.s;
        if (fragment != null && str == null && fragment.getChildFragmentManager().b(null, -1, 0)) {
            return true;
        }
        boolean a = a(this.R, this.O, str, -1, 0);
        if (a) {
            this.A = true;
            try {
                d(this.R, this.O);
            } finally {
                this.A = false;
                this.O.clear();
                this.R.clear();
            }
        }
        C();
        if (this.D) {
            this.D = false;
            z();
        }
        this.h.c.values().removeAll(Collections.singleton(null));
        return a;
    }

    public ViewGroup c(Fragment fragment) {
        if (fragment.mContainer != null) {
            return fragment.mContainer;
        }
        if (fragment.mContainerId <= 0 || !this.a.d()) {
            return null;
        }
        View e = this.a.e(fragment.mContainerId);
        if (e instanceof ViewGroup) {
            return (ViewGroup) e;
        }
        return null;
    }

    public final void c() {
        this.q = false;
        this.p = false;
        this.n.a = false;
        d(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void c(androidx.fragment.app.Fragment r7, int r8) {
        /*
        // Method dump skipped, instructions count: 847
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isDetached.c(androidx.fragment.app.Fragment, int):void");
    }

    public final void c(FragmentContainerView fragmentContainerView) {
        for (isRemoving isremoving : this.h.b()) {
            Fragment fragment = isremoving.e;
            if (fragment.mContainerId == fragmentContainerView.getId() && fragment.mView != null && fragment.mView.getParent() == null) {
                fragment.mContainer = fragmentContainerView;
                isremoving.e.mContainer.addView(isremoving.e.mView, isremoving.a.d(isremoving.e));
            }
        }
    }

    final void c(getUserVisibleHint getuservisiblehint, boolean z, boolean z2, boolean z3) {
        if (z) {
            getuservisiblehint.e(z3);
        } else {
            getuservisiblehint.d();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(getuservisiblehint);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.c > 0) {
            noteStateNotSaved.c(this.f.c, this.a, arrayList, arrayList2, 0, 1, true, this.B);
        }
        if (z3) {
            a(this.c, true);
        }
        for (Fragment fragment : this.h.a()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && getuservisiblehint.c(fragment.mContainerId)) {
                if (fragment.mPostponedAlpha > 0.0f) {
                    fragment.mView.setAlpha(fragment.mPostponedAlpha);
                }
                if (z3) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    public final void c(initState<?> initstate, getViewModelStore getviewmodelstore, final Fragment fragment) {
        String str;
        if (this.f == null) {
            this.f = initstate;
            this.a = getviewmodelstore;
            this.r = fragment;
            if (fragment != null) {
                this.F.add(new isMenuVisible() { // from class: o.isDetached.6
                    @Override // o.isMenuVisible
                    public final void a(Fragment fragment2) {
                        fragment.onAttachFragment(fragment2);
                    }
                });
            } else if (initstate instanceof isMenuVisible) {
                this.F.add((isMenuVisible) initstate);
            }
            if (this.r != null) {
                C();
            }
            if (initstate instanceof setContentView) {
                setContentView setcontentview = (setContentView) initstate;
                OnBackPressedDispatcher a_ = setcontentview.a_();
                this.f161o = a_;
                performContextItemSelected performcontextitemselected = setcontentview;
                if (fragment != null) {
                    performcontextitemselected = fragment;
                }
                a_.e(performcontextitemselected, this.k);
            }
            boolean z = false;
            if (fragment != null) {
                this.n = fragment.mFragmentManager.w(fragment);
            } else if (initstate instanceof performStart) {
                this.n = isInLayout.b(((performStart) initstate).getViewModelStore());
            } else {
                this.n = new isInLayout(false);
            }
            isInLayout isinlayout = this.n;
            if (this.q || this.p) {
                z = true;
            }
            isinlayout.a = z;
            this.h.a = this.n;
            initState<?> initstate2 = this.f;
            if (initstate2 instanceof ImmLeaksCleaner) {
                ComponentActivity$5 e = ((ImmLeaksCleaner) initstate2).e();
                if (fragment != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(fragment.mWho);
                    sb.append(":");
                    str = sb.toString();
                } else {
                    str = "";
                }
                StringBuilder sb2 = new StringBuilder("FragmentManager:");
                sb2.append(str);
                String obj = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(obj);
                sb3.append("StartActivityForResult");
                this.N = e.b(sb3.toString(), new setCheckable.write(), new PlaybackStateCompat.CustomAction<ComponentActivity$3>() { // from class: o.isDetached.7
                    @Override // o.PlaybackStateCompat.CustomAction
                    public final /* synthetic */ void a(ComponentActivity$3 componentActivity$3) {
                        ComponentActivity$3 componentActivity$32 = componentActivity$3;
                        RemoteActionCompatParcelizer pollFirst = isDetached.this.g.pollFirst();
                        if (pollFirst == null) {
                            StringBuilder sb4 = new StringBuilder("No Activities were started for result for ");
                            sb4.append(this);
                            Log.w("FragmentManager", sb4.toString());
                            return;
                        }
                        String str2 = pollFirst.b;
                        int i = pollFirst.a;
                        Fragment d2 = isDetached.this.h.d(str2);
                        if (d2 == null) {
                            StringBuilder sb5 = new StringBuilder("Activity result delivered for unknown Fragment ");
                            sb5.append(str2);
                            Log.w("FragmentManager", sb5.toString());
                            return;
                        }
                        d2.onActivityResult(i, componentActivity$32.b, componentActivity$32.c);
                    }
                });
                StringBuilder sb4 = new StringBuilder();
                sb4.append(obj);
                sb4.append("StartIntentSenderForResult");
                this.K = e.b(sb4.toString(), new read(), new PlaybackStateCompat.CustomAction<ComponentActivity$3>() { // from class: o.isDetached.4
                    @Override // o.PlaybackStateCompat.CustomAction
                    public final /* synthetic */ void a(ComponentActivity$3 componentActivity$3) {
                        ComponentActivity$3 componentActivity$32 = componentActivity$3;
                        RemoteActionCompatParcelizer pollFirst = isDetached.this.g.pollFirst();
                        if (pollFirst == null) {
                            StringBuilder sb5 = new StringBuilder("No IntentSenders were started for ");
                            sb5.append(this);
                            Log.w("FragmentManager", sb5.toString());
                            return;
                        }
                        String str2 = pollFirst.b;
                        int i = pollFirst.a;
                        Fragment d2 = isDetached.this.h.d(str2);
                        if (d2 == null) {
                            StringBuilder sb6 = new StringBuilder("Intent Sender result delivered for unknown Fragment ");
                            sb6.append(str2);
                            Log.w("FragmentManager", sb6.toString());
                            return;
                        }
                        d2.onActivityResult(i, componentActivity$32.b, componentActivity$32.c);
                    }
                });
                StringBuilder sb5 = new StringBuilder();
                sb5.append(obj);
                sb5.append("RequestPermissions");
                this.E = e.b(sb5.toString(), new ComponentActivity$4<String[], Map<String, Boolean>>() { // from class: o.setCheckable$MediaBrowserCompat$CustomActionResultReceiver
                    @Override // o.ComponentActivity$4
                    public final /* synthetic */ ComponentActivity$4.read<Map<String, Boolean>> c(Context context, String[] strArr) {
                        String[] strArr2 = strArr;
                        if (strArr2 == null || strArr2.length == 0) {
                            return new ComponentActivity$4.read<>(Collections.emptyMap());
                        }
                        setThumbTextPadding setthumbtextpadding = new setThumbTextPadding();
                        boolean z2 = true;
                        for (String str2 : strArr2) {
                            boolean z3 = copyWindowDataInto.b(context, str2) == 0;
                            setthumbtextpadding.put(str2, Boolean.valueOf(z3));
                            if (!z3) {
                                z2 = false;
                            }
                        }
                        if (z2) {
                            return new ComponentActivity$4.read<>(setthumbtextpadding);
                        }
                        return null;
                    }

                    @Override // o.ComponentActivity$4
                    public final /* synthetic */ Intent d(Context context, String[] strArr) {
                        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                    }

                    @Override // o.ComponentActivity$4
                    public final /* synthetic */ Map<String, Boolean> e(int i, Intent intent) {
                        if (i == -1 && intent != null) {
                            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                            if (!(intArrayExtra == null || stringArrayExtra == null)) {
                                HashMap hashMap = new HashMap();
                                int length = stringArrayExtra.length;
                                for (int i2 = 0; i2 < length; i2++) {
                                    hashMap.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
                                }
                                return hashMap;
                            }
                        }
                        return Collections.emptyMap();
                    }
                }, new PlaybackStateCompat.CustomAction<Map<String, Boolean>>() { // from class: o.isDetached.2
                    @Override // o.PlaybackStateCompat.CustomAction
                    public final /* synthetic */ void a(Map<String, Boolean> map) {
                        Map<String, Boolean> map2 = map;
                        String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
                        ArrayList arrayList = new ArrayList(map2.values());
                        int[] iArr = new int[arrayList.size()];
                        for (int i = 0; i < arrayList.size(); i++) {
                            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                        }
                        RemoteActionCompatParcelizer pollFirst = isDetached.this.g.pollFirst();
                        if (pollFirst == null) {
                            StringBuilder sb6 = new StringBuilder("No permissions were requested for ");
                            sb6.append(this);
                            Log.w("FragmentManager", sb6.toString());
                            return;
                        }
                        String str2 = pollFirst.b;
                        int i2 = pollFirst.a;
                        Fragment d2 = isDetached.this.h.d(str2);
                        if (d2 == null) {
                            StringBuilder sb7 = new StringBuilder("Permission request result delivered for unknown Fragment ");
                            sb7.append(str2);
                            Log.w("FragmentManager", sb7.toString());
                            return;
                        }
                        d2.onRequestPermissionsResult(i2, strArr, iArr);
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void c(boolean z) {
        for (Fragment fragment : this.h.d()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    public final void d() {
        this.q = false;
        this.p = false;
        this.n.a = false;
        d(1);
    }

    /* JADX WARN: Finally extract failed */
    public void d(int i) {
        try {
            this.A = true;
            for (isRemoving isremoving : this.h.c.values()) {
                if (isremoving != null) {
                    isremoving.d = i;
                }
            }
            a(i, false);
            if (d) {
                for (onContextItemSelected oncontextitemselected : x()) {
                    oncontextitemselected.b();
                }
            }
            this.A = false;
            a(true);
        } catch (Throwable th) {
            this.A = false;
            throw th;
        }
    }

    public final void d(Parcelable parcelable) {
        int i;
        isRemoving isremoving;
        if (parcelable != null) {
            isInBackStack isinbackstack = (isInBackStack) parcelable;
            if (isinbackstack.d != null) {
                this.h.c.clear();
                Iterator<isRemovingParent> it = isinbackstack.d.iterator();
                while (true) {
                    boolean z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    isRemovingParent next = it.next();
                    if (next != null) {
                        Fragment fragment = this.n.c.get(next.m);
                        if (fragment != null) {
                            if (y || Log.isLoggable("FragmentManager", 2)) {
                                StringBuilder sb = new StringBuilder("restoreSaveState: re-attaching retained ");
                                sb.append(fragment);
                                Log.v("FragmentManager", sb.toString());
                            }
                            isremoving = new isRemoving(this.l, this.h, fragment, next);
                        } else {
                            isremoving = new isRemoving(this.l, this.h, this.f.c.getClassLoader(), o(), next);
                        }
                        Fragment fragment2 = isremoving.e;
                        fragment2.mFragmentManager = this;
                        if (y || Log.isLoggable("FragmentManager", 2)) {
                            z = true;
                        }
                        if (z) {
                            StringBuilder sb2 = new StringBuilder("restoreSaveState: active (");
                            sb2.append(fragment2.mWho);
                            sb2.append("): ");
                            sb2.append(fragment2);
                            Log.v("FragmentManager", sb2.toString());
                        }
                        isremoving.a(this.f.c.getClassLoader());
                        this.h.a(isremoving);
                        isremoving.d = this.c;
                    }
                }
                for (Fragment fragment3 : new ArrayList(this.n.c.values())) {
                    if (!(this.h.c.get(fragment3.mWho) != null)) {
                        if (y || Log.isLoggable("FragmentManager", 2)) {
                            StringBuilder sb3 = new StringBuilder("Discarding retained Fragment ");
                            sb3.append(fragment3);
                            sb3.append(" that was not found in the set of active Fragments ");
                            sb3.append(isinbackstack.d);
                            Log.v("FragmentManager", sb3.toString());
                        }
                        this.n.b(fragment3);
                        fragment3.mFragmentManager = this;
                        isRemoving isremoving2 = new isRemoving(this.l, this.h, fragment3);
                        isremoving2.d = 1;
                        isremoving2.m();
                        fragment3.mRemoving = true;
                        isremoving2.m();
                    }
                }
                this.h.c(isinbackstack.b);
                if (isinbackstack.c != null) {
                    this.b = new ArrayList<>(isinbackstack.c.length);
                    for (int i2 = 0; i2 < isinbackstack.c.length; i2++) {
                        getUserVisibleHint e = isinbackstack.c[i2].e(this);
                        if (y || Log.isLoggable("FragmentManager", 2)) {
                            StringBuilder sb4 = new StringBuilder("restoreAllState: back stack #");
                            sb4.append(i2);
                            sb4.append(" (index ");
                            sb4.append(e.b);
                            sb4.append("): ");
                            sb4.append(e);
                            Log.v("FragmentManager", sb4.toString());
                            PrintWriter printWriter = new PrintWriter(new onConfigurationChanged("FragmentManager"));
                            e.b("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.b.add(e);
                    }
                } else {
                    this.b = null;
                }
                this.e.set(isinbackstack.e);
                if (isinbackstack.f != null) {
                    Fragment a = a(isinbackstack.f);
                    this.s = a;
                    u(a);
                }
                ArrayList<String> arrayList = isinbackstack.h;
                if (arrayList != null) {
                    for (i = 0; i < arrayList.size(); i++) {
                        Bundle bundle = isinbackstack.j.get(i);
                        bundle.setClassLoader(this.f.c.getClassLoader());
                        this.t.put(arrayList.get(i), bundle);
                    }
                }
                this.g = new ArrayDeque<>(isinbackstack.a);
            }
        }
    }

    public final void d(Fragment fragment) {
        boolean z = false;
        if (y || Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("attach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.h.a(fragment);
                if (y || Log.isLoggable("FragmentManager", 2)) {
                    z = true;
                }
                if (z) {
                    StringBuilder sb2 = new StringBuilder("add from attach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                if (x(fragment)) {
                    this.H = true;
                }
            }
        }
    }

    public final boolean d(MenuItem menuItem) {
        if (this.c <= 0) {
            return false;
        }
        for (Fragment fragment : this.h.d()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final Fragment e(String str) {
        return this.h.d(str);
    }

    public void e() {
        if (d) {
            for (onContextItemSelected oncontextitemselected : x()) {
                if (oncontextitemselected.d) {
                    oncontextitemselected.d = false;
                    oncontextitemselected.a();
                }
            }
        } else if (this.I != null) {
            while (!this.I.isEmpty()) {
                this.I.remove(0).c();
            }
        }
    }

    public final void e(Configuration configuration) {
        for (Fragment fragment : this.h.d()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public final void e(Menu menu) {
        if (this.c > 0) {
            for (Fragment fragment : this.h.d()) {
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    void e(Fragment fragment) {
        fragment.performDestroyView();
        this.l.j(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.a(null);
        fragment.mInLayout = false;
    }

    public final void e(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.K != null) {
            boolean z = false;
            if (bundle != null) {
                if (intent == null) {
                    intent = new Intent();
                    intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                }
                if (y || Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sb = new StringBuilder("ActivityOptions ");
                    sb.append(bundle);
                    sb.append(" were added to fillInIntent ");
                    sb.append(intent);
                    sb.append(" for fragment ");
                    sb.append(fragment);
                    Log.v("FragmentManager", sb.toString());
                }
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            OnBackPressedDispatcher$LifecycleOnBackPressedCancellable.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable.RemoteActionCompatParcelizer(intentSender);
            remoteActionCompatParcelizer.d = intent;
            remoteActionCompatParcelizer.b = i3;
            remoteActionCompatParcelizer.a = i2;
            OnBackPressedDispatcher$LifecycleOnBackPressedCancellable onBackPressedDispatcher$LifecycleOnBackPressedCancellable = new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(remoteActionCompatParcelizer.c, remoteActionCompatParcelizer.d, remoteActionCompatParcelizer.a, remoteActionCompatParcelizer.b);
            this.g.addLast(new RemoteActionCompatParcelizer(fragment.mWho, i));
            if (y || Log.isLoggable("FragmentManager", 2)) {
                z = true;
            }
            if (z) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append("is launching an IntentSender for result ");
                Log.v("FragmentManager", sb2.toString());
            }
            this.K.e(onBackPressedDispatcher$LifecycleOnBackPressedCancellable, null);
            return;
        }
        initState<?> initstate = this.f;
        if (i == -1) {
            setOnHierarchyChangeListener.d(initstate.a, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public final void e(Fragment fragment, String[] strArr, int i) {
        if (this.E != null) {
            this.g.addLast(new RemoteActionCompatParcelizer(fragment.mWho, i));
            this.E.e(strArr, null);
        }
    }

    public final void e(IconCompatParcelizer iconCompatParcelizer, boolean z) {
        if (!z) {
            if (this.f != null) {
                v();
            } else if (this.i) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.G) {
            if (this.f != null) {
                this.G.add(iconCompatParcelizer);
                u();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void e(isRemoving isremoving) {
        Fragment fragment = isremoving.e;
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.A) {
            this.D = true;
            return;
        }
        fragment.mDeferStart = false;
        if (d) {
            isremoving.m();
        } else {
            c(fragment, this.c);
        }
    }

    public final void f() {
        d(5);
    }

    public final void f(Fragment fragment) {
        Iterator<isMenuVisible> it = this.F.iterator();
        while (it.hasNext()) {
            it.next().a(fragment);
        }
    }

    public Fragment findFragmentById(int i) {
        onActivityCreated onactivitycreated = this.h;
        for (int size = onactivitycreated.b.size() - 1; size >= 0; size--) {
            Fragment fragment = onactivitycreated.b.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (isRemoving isremoving : onactivitycreated.c.values()) {
            if (isremoving != null) {
                Fragment fragment2 = isremoving.e;
                if (fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public Fragment findFragmentByTag(String str) {
        onActivityCreated onactivitycreated = this.h;
        if (str != null) {
            for (int size = onactivitycreated.b.size() - 1; size >= 0; size--) {
                Fragment fragment = onactivitycreated.b.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (isRemoving isremoving : onactivitycreated.c.values()) {
            if (isremoving != null) {
                Fragment fragment2 = isremoving.e;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void g() {
        for (Fragment fragment : this.h.d()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public final void g(Fragment fragment) {
        if (y || Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("detach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (y || Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sb2 = new StringBuilder("remove from detach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                onActivityCreated onactivitycreated = this.h;
                synchronized (onactivitycreated.b) {
                    onactivitycreated.b.remove(fragment);
                }
                fragment.mAdded = false;
                if (x(fragment)) {
                    this.H = true;
                }
                v(fragment);
            }
        }
    }

    public final void h() {
        C();
        u(this.s);
    }

    public final void h(Fragment fragment) {
        if (y || Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("hide: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
            v(fragment);
        }
    }

    public final performPrimaryNavigationFragmentChanged i(Fragment fragment) {
        isInLayout isinlayout = this.n;
        performPrimaryNavigationFragmentChanged performprimarynavigationfragmentchanged = isinlayout.i.get(fragment.mWho);
        performPrimaryNavigationFragmentChanged performprimarynavigationfragmentchanged2 = performprimarynavigationfragmentchanged;
        if (performprimarynavigationfragmentchanged == null) {
            performprimarynavigationfragmentchanged2 = new performPrimaryNavigationFragmentChanged();
            isinlayout.i.put(fragment.mWho, performprimarynavigationfragmentchanged2);
        }
        return performprimarynavigationfragmentchanged2;
    }

    public final void i() {
        d(1);
    }

    public final isRemoving j(Fragment fragment) {
        onActivityCreated onactivitycreated = this.h;
        isRemoving isremoving = onactivitycreated.c.get(fragment.mWho);
        if (isremoving != null) {
            return isremoving;
        }
        isRemoving isremoving2 = new isRemoving(this.l, this.h, fragment);
        isremoving2.a(this.f.c.getClassLoader());
        isremoving2.d = this.c;
        return isremoving2;
    }

    public final void j() {
        this.i = true;
        a(true);
        A();
        d(-1);
        this.f = null;
        this.a = null;
        this.r = null;
        if (this.f161o != null) {
            this.k.e();
            this.f161o = null;
        }
        ActivityResultRegistry$1<Intent> activityResultRegistry$1 = this.N;
        if (activityResultRegistry$1 != null) {
            activityResultRegistry$1.d();
            this.K.d();
            this.E.d();
        }
    }

    public final void k() {
        this.q = false;
        this.p = false;
        this.n.a = false;
        d(5);
    }

    public final boolean k(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public final void l() {
        this.p = true;
        this.n.a = true;
        d(4);
    }

    public final void l(Fragment fragment) {
        if (!(this.h.c.get(fragment.mWho) != null)) {
            boolean z = true;
            if (!y) {
                z = true;
                if (!Log.isLoggable("FragmentManager", 3)) {
                    z = false;
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder("Ignoring moving ");
                sb.append(fragment);
                sb.append(" to state ");
                sb.append(this.c);
                sb.append("since it is not added to ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
                return;
            }
            return;
        }
        c(fragment, this.c);
        if (!(fragment.mView == null || !fragment.mIsNewlyAdded || fragment.mContainer == null)) {
            if (fragment.mPostponedAlpha > 0.0f) {
                fragment.mView.setAlpha(fragment.mPostponedAlpha);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            getViewLifecycleOwnerLiveData.write b = getViewLifecycleOwnerLiveData.b(this.f.c, fragment, true, fragment.getPopDirection());
            if (b != null) {
                if (b.c != null) {
                    fragment.mView.startAnimation(b.c);
                } else {
                    b.a.setTarget(fragment.mView);
                    b.a.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            y(fragment);
        }
    }

    public final void m() {
        this.q = false;
        this.p = false;
        this.n.a = false;
        d(7);
    }

    public final boolean m(Fragment fragment) {
        boolean z = true;
        if (fragment == null) {
            return true;
        }
        isDetached isdetached = fragment.mFragmentManager;
        if (!fragment.equals(isdetached.s) || !m(isdetached.r)) {
            z = false;
        }
        return z;
    }

    public final void n() {
        d(2);
    }

    public final void n(Fragment fragment) {
        if (y || Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.mBackStackNesting);
            Log.v("FragmentManager", sb.toString());
        }
        boolean isInBackStack = fragment.isInBackStack();
        if (!fragment.mDetached || (!isInBackStack)) {
            onActivityCreated onactivitycreated = this.h;
            synchronized (onactivitycreated.b) {
                onactivitycreated.b.remove(fragment);
            }
            fragment.mAdded = false;
            if (x(fragment)) {
                this.H = true;
            }
            fragment.mRemoving = true;
            v(fragment);
        }
    }

    public final hasOptionsMenu o() {
        isDetached isdetached = this;
        while (true) {
            hasOptionsMenu hasoptionsmenu = isdetached.z;
            if (hasoptionsmenu != null) {
                return hasoptionsmenu;
            }
            Fragment fragment = isdetached.r;
            if (fragment == null) {
                return isdetached.C;
            }
            isdetached = fragment.mFragmentManager;
        }
    }

    public final void o(Fragment fragment) {
        if (fragment.mAdded && x(fragment)) {
            this.H = true;
        }
    }

    public final void p(Fragment fragment) {
        if (fragment == null || (fragment.equals(a(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.s;
            this.s = fragment;
            u(fragment2);
            u(this.s);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean p() {
        return this.q || this.p;
    }

    public final initState<?> q() {
        return this.f;
    }

    public final LayoutInflater.Factory2 r() {
        return this.m;
    }

    public final Fragment.read r(Fragment fragment) {
        isRemoving isremoving = this.h.c.get(fragment.mWho);
        if (isremoving == null || !isremoving.e.equals(fragment)) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            b(new IllegalStateException(sb.toString()));
        }
        Fragment.read read2 = null;
        if (isremoving.e.mState >= 0) {
            Bundle e = isremoving.e();
            read2 = null;
            if (e != null) {
                read2 = new Fragment.read(e);
            }
        }
        return read2;
    }

    public final onDestroyOptionsMenu s() {
        isDetached isdetached = this;
        while (true) {
            onDestroyOptionsMenu ondestroyoptionsmenu = isdetached.M;
            if (ondestroyoptionsmenu != null) {
                return ondestroyoptionsmenu;
            }
            Fragment fragment = isdetached.r;
            if (fragment == null) {
                return isdetached.u;
            }
            isdetached = fragment.mFragmentManager;
        }
    }

    public final void s(Fragment fragment) {
        this.n.b(fragment);
    }

    public final boolean t() {
        return this.i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) Property.TYPE_ARRAY);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.r;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.r)));
            sb.append("}");
        } else {
            initState<?> initstate = this.f;
            if (initstate != null) {
                sb.append(initstate.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    final void u() {
        synchronized (this.G) {
            ArrayList<MediaDescriptionCompat> arrayList = this.I;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            if (this.G.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f.d.removeCallbacks(this.x);
                this.f.d.post(this.x);
                C();
            }
        }
    }

    public final Parcelable w() {
        e();
        A();
        a(true);
        this.q = true;
        this.n.a = true;
        ArrayList<isRemovingParent> c = this.h.c();
        if (c.isEmpty()) {
            boolean z = true;
            if (!y) {
                z = true;
                if (!Log.isLoggable("FragmentManager", 2)) {
                    z = false;
                }
            }
            if (!z) {
                return null;
            }
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
        ArrayList<String> i = this.h.i();
        ArrayList<getUserVisibleHint> arrayList = this.b;
        getTargetFragment[] gettargetfragmentArr = null;
        if (arrayList != null) {
            int size = arrayList.size();
            gettargetfragmentArr = null;
            if (size > 0) {
                getTargetFragment[] gettargetfragmentArr2 = new getTargetFragment[size];
                int i2 = 0;
                while (true) {
                    gettargetfragmentArr = gettargetfragmentArr2;
                    if (i2 >= size) {
                        break;
                    }
                    gettargetfragmentArr2[i2] = new getTargetFragment(this.b.get(i2));
                    if (y || Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder("saveAllState: adding back stack #");
                        sb.append(i2);
                        sb.append(": ");
                        sb.append(this.b.get(i2));
                        Log.v("FragmentManager", sb.toString());
                    }
                    i2++;
                }
            }
        }
        isInBackStack isinbackstack = new isInBackStack();
        isinbackstack.d = c;
        isinbackstack.b = i;
        isinbackstack.c = gettargetfragmentArr;
        isinbackstack.e = this.e.get();
        Fragment fragment = this.s;
        if (fragment != null) {
            isinbackstack.f = fragment.mWho;
        }
        isinbackstack.h.addAll(this.t.keySet());
        isinbackstack.j.addAll(this.t.values());
        isinbackstack.a = new ArrayList<>(this.g);
        return isinbackstack;
    }

    public final void y() {
        if (this.f != null) {
            this.q = false;
            this.p = false;
            this.n.a = false;
            for (Fragment fragment : this.h.d()) {
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }
}
