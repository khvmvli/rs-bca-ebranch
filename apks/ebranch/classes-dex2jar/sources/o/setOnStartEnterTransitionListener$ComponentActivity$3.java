package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import io.realm.internal.Property;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.setHasOptionsMenu;
import o.setHideReplaced;
import o.setOnStartEnterTransitionListener;
import o.setOnStartEnterTransitionListener$MediaSessionCompat$QueueItem;
/* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$ComponentActivity$3.class */
public final class setOnStartEnterTransitionListener$ComponentActivity$3 {
    public final ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> a;
    setOnStartEnterTransitionListener$MediaSessionCompat$QueueItem b;
    public final List<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> f;
    setOnStartEnterTransitionListener$ComponentActivity$5 g;
    final /* synthetic */ setOnStartEnterTransitionListener i;
    ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> e = null;
    final ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> c = new ArrayList<>();
    int d = 2;
    int h = 2;

    public setOnStartEnterTransitionListener$ComponentActivity$3(setOnStartEnterTransitionListener setonstartentertransitionlistener) {
        this.i = setonstartentertransitionlistener;
        ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> arrayList = new ArrayList<>();
        this.a = arrayList;
        this.f = Collections.unmodifiableList(arrayList);
    }

    private void a(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        int size = this.i.J.size();
        for (int i = 0; i < size; i++) {
            this.i.J.get(i);
        }
        if (this.i.g != null) {
            this.i.g.c((setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        }
        if (this.i.R != null) {
            this.i.ab.c(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        }
    }

    private setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable b(int i) {
        int size;
        int c;
        ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> arrayList = this.e;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return null;
        }
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < size) {
                setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = this.e.get(i2);
                if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & 32) == 0) {
                    z = false;
                }
                if (!z) {
                    int i3 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
                    int i4 = i3;
                    if (i3 == -1) {
                        i4 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
                    }
                    if (i4 == i) {
                        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c |= 32;
                        return setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
                    }
                }
                i2++;
            } else if (!this.i.g.d || (c = this.i.i.c(i, 0)) <= 0 || c >= this.i.g.c()) {
                return null;
            } else {
                long c2 = this.i.g.c(c);
                for (int i5 = 0; i5 < size; i5++) {
                    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = this.e.get(i5);
                    if (!((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.c & 32) != 0) && setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.e == c2) {
                        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.c |= 32;
                        return setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2;
                    }
                }
                return null;
            }
        }
    }

    private setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable b(long j, int i, boolean z) {
        int size = this.a.size();
        boolean z2 = true;
        while (true) {
            size--;
            if (size >= 0) {
                setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = this.a.get(size);
                if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.e == j) {
                    if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & 32) != 0) {
                        continue;
                    } else if (i == setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.g) {
                        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c |= 32;
                        if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & 8) == 0) {
                            z2 = false;
                        }
                        if (z2 && !this.i.R.b) {
                            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c = 2 | (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & -15);
                        }
                        return setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
                    } else if (!z) {
                        this.a.remove(size);
                        this.i.removeDetachedView(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b, false);
                        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c = setOnStartEnterTransitionListener.c(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b);
                        c.n = null;
                        c.a = false;
                        c.c &= -33;
                        c(c);
                    }
                }
            } else {
                for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
                    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = this.c.get(size2);
                    if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.e == j && !setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.a()) {
                        if (i == setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.g) {
                            if (!z) {
                                this.c.remove(size2);
                            }
                            return setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2;
                        } else if (!z) {
                            b(this.c.get(size2), true);
                            this.c.remove(size2);
                            return null;
                        }
                    }
                }
                return null;
            }
        }
    }

    private void b(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b instanceof ViewGroup) {
            c((ViewGroup) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b, false);
        }
    }

    private boolean b(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, int i, int i2, long j) {
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.d = null;
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.h = this.i;
        int i3 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.g;
        long a = setOnStartEnterTransitionListener.a();
        if (j != Long.MAX_VALUE) {
            long j2 = this.b.e(i3).a;
            if (!(j2 == 0 || j2 + a < j)) {
                return false;
            }
        }
        setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<? extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver = this.i.g;
        boolean z = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.d == null;
        if (z) {
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k = i;
            if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.d) {
                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.e = setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.c(i);
            }
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c = (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & -520) | 1;
            setDrawerShadow.b("RV OnBindView");
        }
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.d = setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver;
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b();
        setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, i);
        if (z) {
            List<Object> list = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.j;
            if (list != null) {
                list.clear();
            }
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c &= -1025;
            ViewGroup.LayoutParams layoutParams = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b.getLayoutParams();
            if (layoutParams instanceof setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) {
                ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) layoutParams).d = true;
            }
            setDrawerShadow.e();
        }
        long a2 = setOnStartEnterTransitionListener.a();
        setOnStartEnterTransitionListener$MediaSessionCompat$QueueItem.RemoteActionCompatParcelizer e = this.b.e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.g);
        e.a = setOnStartEnterTransitionListener$MediaSessionCompat$QueueItem.d(e.a, a2 - a);
        AccessibilityManager accessibilityManager = this.i.j;
        boolean z2 = false;
        if (accessibilityManager != null) {
            z2 = false;
            if (accessibilityManager.isEnabled()) {
                z2 = true;
            }
        }
        if (z2) {
            View view = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b;
            if (findFragmentByWho.l(view) == 0) {
                findFragmentByWho.j(view, 1);
            }
            if (this.i.f != null) {
                setHideReplaced.IconCompatParcelizer iconCompatParcelizer = this.i.f.e;
                if (iconCompatParcelizer instanceof setHideReplaced.IconCompatParcelizer) {
                    setHideReplaced.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
                    onDismiss e2 = findFragmentByWho.e(view);
                    if (!(e2 == null || e2 == iconCompatParcelizer2)) {
                        iconCompatParcelizer2.d.put(view, e2);
                    }
                }
                findFragmentByWho.d(view, iconCompatParcelizer);
            }
        }
        if (!this.i.R.b) {
            return true;
        }
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m = i2;
        return true;
    }

    private setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c(int i, boolean z) {
        View view;
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
        int size = this.a.size();
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 < size) {
                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = this.a.get(i2);
                if (!((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & 32) != 0)) {
                    int i3 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
                    int i4 = i3;
                    if (i3 == -1) {
                        i4 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
                    }
                    if (i4 == i) {
                        if (!((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & 4) != 0)) {
                            if (!this.i.R.b) {
                                if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & 8) == 0) {
                                    z2 = false;
                                }
                                if (!z2) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                i2++;
            } else {
                if (!z) {
                    setAnimations setanimations = this.i.f254o;
                    int size2 = setanimations.e.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size2) {
                            view = null;
                            break;
                        }
                        view = setanimations.e.get(i5);
                        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c = setanimations.b.c(view);
                        int i6 = c.m;
                        int i7 = i6;
                        if (i6 == -1) {
                            i7 = c.k;
                        }
                        if (i7 == i) {
                            if (!((c.c & 4) != 0)) {
                                if (!((c.c & 8) != 0)) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i5++;
                    }
                    if (view != null) {
                        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c2 = setOnStartEnterTransitionListener.c(view);
                        setAnimations setanimations2 = this.i.f254o;
                        int d = setanimations2.b.d(view);
                        if (d < 0) {
                            StringBuilder sb = new StringBuilder("view is not a child, cannot hide ");
                            sb.append(view);
                            throw new IllegalArgumentException(sb.toString());
                        } else if (setanimations2.d.b(d)) {
                            setanimations2.d.d(d);
                            if (setanimations2.e.remove(view)) {
                                setanimations2.b.a(view);
                            }
                            int d2 = this.i.f254o.d(view);
                            if (d2 != -1) {
                                this.i.f254o.b(d2);
                                e(view);
                                c2.c |= 8224;
                                return c2;
                            }
                            StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb2.append(c2);
                            sb2.append(this.i.e());
                            throw new IllegalStateException(sb2.toString());
                        } else {
                            StringBuilder sb3 = new StringBuilder("trying to unhide a view that was not hidden");
                            sb3.append(view);
                            throw new RuntimeException(sb3.toString());
                        }
                    }
                }
                int size3 = this.c.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = this.c.get(i8);
                    if (!((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.c & 4) != 0)) {
                        int i9 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.m;
                        int i10 = i9;
                        if (i9 == -1) {
                            i10 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.k;
                        }
                        if (i10 == i && !setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.a()) {
                            if (!z) {
                                this.c.remove(i8);
                            }
                            return setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2;
                        }
                    }
                }
                return null;
            }
        }
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c |= 32;
        return setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
    }

    private void c(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                c((ViewGroup) childAt, true);
            }
        }
        if (z) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    private boolean d(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & 8) != 0) {
            return this.i.R.b;
        }
        if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k < 0 || setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k >= this.i.g.c()) {
            StringBuilder sb = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
            sb.append(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
            sb.append(this.i.e());
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (!this.i.R.b && this.i.g.d(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k) != setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.g) {
            return false;
        } else {
            boolean z = true;
            if (this.i.g.d) {
                z = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.e == this.i.g.c(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k);
            }
            return z;
        }
    }

    public final int a(int i) {
        if (i >= 0) {
            setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner = this.i.R;
            if (i < (immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f)) {
                return !this.i.R.b ? i : this.i.i.c(i, 0);
            }
        }
        StringBuilder sb = new StringBuilder("invalid position ");
        sb.append(i);
        sb.append(". State item count is ");
        setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner2 = this.i.R;
        sb.append(immLeaksCleaner2.b ? immLeaksCleaner2.h - immLeaksCleaner2.a : immLeaksCleaner2.f);
        sb.append(this.i.e());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void a() {
        this.h = this.d + (this.i.z != null ? this.i.z.w : 0);
        for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.h; size--) {
            b(this.c.get(size), true);
            this.c.remove(size);
        }
    }

    public final void b() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) this.c.get(i).b.getLayoutParams();
            if (setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver != null) {
                setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.d = true;
            }
        }
    }

    public final void b(View view) {
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c = setOnStartEnterTransitionListener.c(view);
        boolean z = true;
        if ((c.c & Property.TYPE_SET) != 0) {
            this.i.removeDetachedView(view, false);
        }
        if (c.n != null) {
            c.n.e(c);
        } else {
            if ((c.c & 32) != 0) {
                c.c &= -33;
            }
        }
        c(c);
        if (this.i.x != null) {
            if ((c.c & 16) != 0 || findFragmentByWho.z(c.b)) {
                z = false;
            }
            if (!z) {
                this.i.x.d(c);
            }
        }
    }

    public final void b(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, boolean z) {
        setOnStartEnterTransitionListener.b(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        View view = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b;
        if (this.i.f != null) {
            setHideReplaced.IconCompatParcelizer iconCompatParcelizer = this.i.f.e;
            findFragmentByWho.d(view, iconCompatParcelizer instanceof setHideReplaced.IconCompatParcelizer ? iconCompatParcelizer.d.remove(view) : null);
        }
        if (z) {
            a(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        }
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.d = null;
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.h = null;
        if (this.b == null) {
            this.b = new setOnStartEnterTransitionListener$MediaSessionCompat$QueueItem();
        }
        this.b.e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
    }

    public final View c(int i) {
        return d(i, false, Long.MAX_VALUE).b;
    }

    public final void c() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            b(this.c.get(size), true);
            this.c.remove(size);
        }
        this.c.clear();
        if (setOnStartEnterTransitionListener.e) {
            setHasOptionsMenu.read read = this.i.M;
            int[] iArr = read.d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            read.a = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0170  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void c(o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r5) {
        /*
        // Method dump skipped, instructions count: 583
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnStartEnterTransitionListener$ComponentActivity$3.c(o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0449, code lost:
        if (((r16.c & 4) != 0) == false) goto L_0x044c;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable d(int r8, boolean r9, long r10) {
        /*
        // Method dump skipped, instructions count: 1359
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnStartEnterTransitionListener$ComponentActivity$3.d(int, boolean, long):o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable");
    }

    public final void d() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = this.c.get(i);
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.i = -1;
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m = -1;
        }
        int size2 = this.a.size();
        for (int i2 = 0; i2 < size2; i2++) {
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = this.a.get(i2);
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.i = -1;
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.m = -1;
        }
        ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> arrayList = this.e;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable3 = this.e.get(i3);
                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable3.i = -1;
                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable3.m = -1;
            }
        }
    }

    public final View e(int i, boolean z) {
        return d(i, false, Long.MAX_VALUE).b;
    }

    public final void e(View view) {
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c = setOnStartEnterTransitionListener.c(view);
        boolean z = true;
        if (!((c.c & 12) != 0)) {
            if (((c.c & 2) != 0) && !this.i.a(c)) {
                if (this.e == null) {
                    this.e = new ArrayList<>();
                }
                c.n = this;
                c.a = true;
                this.e.add(c);
                return;
            }
        }
        if ((c.c & 4) != 0) {
            if ((c.c & 8) == 0) {
                z = false;
            }
            if (!z && !this.i.g.d) {
                StringBuilder sb = new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                sb.append(this.i.e());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        c.n = this;
        c.a = false;
        this.a.add(c);
    }

    public final void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.a) {
            this.e.remove(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        } else {
            this.a.remove(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        }
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.n = null;
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.a = false;
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c &= -33;
    }
}
