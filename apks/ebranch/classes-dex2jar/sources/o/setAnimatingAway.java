package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem;
/* loaded from: classes-dex2jar.jar:o/setAnimatingAway.class */
public final class setAnimatingAway extends setPostOnViewCreatedAlpha {
    private static TimeInterpolator k;
    private ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> t = new ArrayList<>();
    private ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> m = new ArrayList<>();
    private ArrayList<setAnimatingAway$MediaBrowserCompat$CustomActionResultReceiver> p = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    private ArrayList<write> f194o = new ArrayList<>();
    ArrayList<ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable>> a = new ArrayList<>();
    ArrayList<ArrayList<setAnimatingAway$MediaBrowserCompat$CustomActionResultReceiver>> j = new ArrayList<>();
    ArrayList<ArrayList<write>> c = new ArrayList<>();
    ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> e = new ArrayList<>();
    ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> d = new ArrayList<>();
    ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> i = new ArrayList<>();
    ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> b = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setAnimatingAway$write.class */
    public static final class write {
        public int a;
        public int b;
        public int c;
        public setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable d;
        public setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable e;
        public int j;

        private write(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2) {
            this.d = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
            this.e = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2;
        }

        write(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2, int i, int i2, int i3, int i4) {
            this(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2);
            this.a = i;
            this.c = i2;
            this.b = i3;
            this.j = i4;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.d);
            sb.append(", newHolder=");
            sb.append(this.e);
            sb.append(", fromX=");
            sb.append(this.a);
            sb.append(", fromY=");
            sb.append(this.c);
            sb.append(", toX=");
            sb.append(this.b);
            sb.append(", toY=");
            sb.append(this.j);
            sb.append('}');
            return sb.toString();
        }
    }

    private static void a(List<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).b.animate().cancel();
        }
    }

    private void a(List<write> list, setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        for (int size = list.size() - 1; size >= 0; size--) {
            write write2 = list.get(size);
            if (c(write2, setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) && write2.d == null && write2.e == null) {
                list.remove(write2);
            }
        }
    }

    private boolean c(write write2, setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        if (write2.e == setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
            write2.e = null;
        } else if (write2.d != setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
            return false;
        } else {
            write2.d = null;
        }
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b.setAlpha(1.0f);
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b.setTranslationX(0.0f);
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b.setTranslationY(0.0f);
        i(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        return true;
    }

    private void d(write write2) {
        if (write2.d != null) {
            c(write2, write2.d);
        }
        if (write2.e != null) {
            c(write2, write2.e);
        }
    }

    private void f(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        if (k == null) {
            k = new ValueAnimator().getInterpolator();
        }
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b.animate().setInterpolator(k);
        d(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem
    public final boolean b() {
        return !this.m.isEmpty() || !this.f194o.isEmpty() || !this.p.isEmpty() || !this.t.isEmpty() || !this.d.isEmpty() || !this.i.isEmpty() || !this.e.isEmpty() || !this.b.isEmpty() || !this.j.isEmpty() || !this.a.isEmpty() || !this.c.isEmpty();
    }

    @Override // o.setPostOnViewCreatedAlpha
    public final boolean b(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        f(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b.setAlpha(0.0f);
        this.m.add(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        return true;
    }

    @Override // o.setPostOnViewCreatedAlpha
    public final boolean b(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, int i, int i2, int i3, int i4) {
        View view = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b;
        int translationX = i + ((int) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b.getTranslationX());
        int translationY = i2 + ((int) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b.getTranslationY());
        f(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            i(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.p.add(new setAnimatingAway$MediaBrowserCompat$CustomActionResultReceiver(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, translationX, translationY, i3, i4));
        return true;
    }

    @Override // o.setPostOnViewCreatedAlpha
    public final boolean b(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2, int i, int i2, int i3, int i4) {
        if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable == setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2) {
            return b(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, i, i2, i3, i4);
        }
        float translationX = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b.getTranslationX();
        float translationY = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b.getTranslationY();
        float alpha = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b.getAlpha();
        f(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b.setTranslationX(translationX);
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b.setTranslationY(translationY);
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b.setAlpha(alpha);
        if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 != null) {
            f(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2);
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.b.setTranslationX((float) (-i5));
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.b.setTranslationY((float) (-i6));
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.b.setAlpha(0.0f);
        }
        this.f194o.add(new write(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2, i, i2, i3, i4));
        return true;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem
    public final void c() {
        boolean z = !this.t.isEmpty();
        boolean z2 = !this.p.isEmpty();
        boolean z3 = !this.f194o.isEmpty();
        boolean z4 = !this.m.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> it = this.t.iterator();
            while (it.hasNext()) {
                final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable next = it.next();
                final View view = next.b;
                final ViewPropertyAnimator animate = view.animate();
                this.i.add(next);
                animate.setDuration(i()).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: o.setAnimatingAway.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        animate.setListener(null);
                        view.setAlpha(1.0f);
                        setAnimatingAway setanimatingaway = setAnimatingAway.this;
                        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = next;
                        setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.read read = setanimatingaway.g;
                        if (read != null) {
                            read.a(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
                        }
                        setAnimatingAway.this.i.remove(next);
                        setAnimatingAway setanimatingaway2 = setAnimatingAway.this;
                        if (!setanimatingaway2.b()) {
                            setanimatingaway2.a();
                        }
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                    }
                }).start();
            }
            this.t.clear();
            if (z2) {
                final ArrayList<setAnimatingAway$MediaBrowserCompat$CustomActionResultReceiver> arrayList = new ArrayList<>();
                arrayList.addAll(this.p);
                this.j.add(arrayList);
                this.p.clear();
                AnonymousClass3 r0 = new Runnable() { // from class: o.setAnimatingAway.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            setAnimatingAway$MediaBrowserCompat$CustomActionResultReceiver setanimatingaway_mediabrowsercompat_customactionresultreceiver = (setAnimatingAway$MediaBrowserCompat$CustomActionResultReceiver) it2.next();
                            setAnimatingAway setanimatingaway = setAnimatingAway.this;
                            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = setanimatingaway_mediabrowsercompat_customactionresultreceiver.e;
                            int i = setanimatingaway_mediabrowsercompat_customactionresultreceiver.a;
                            int i2 = setanimatingaway_mediabrowsercompat_customactionresultreceiver.b;
                            int i3 = setanimatingaway_mediabrowsercompat_customactionresultreceiver.d;
                            int i4 = setanimatingaway_mediabrowsercompat_customactionresultreceiver.c;
                            View view2 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b;
                            int i5 = i3 - i;
                            int i6 = i4 - i2;
                            if (i5 != 0) {
                                view2.animate().translationX(0.0f);
                            }
                            if (i6 != 0) {
                                view2.animate().translationY(0.0f);
                            }
                            ViewPropertyAnimator animate2 = view2.animate();
                            setanimatingaway.d.add(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
                            animate2.setDuration(setanimatingaway.l).setListener(new AnimatorListenerAdapter(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, i5, view2, i6, animate2) { // from class: o.setAnimatingAway.10
                                final /* synthetic */ setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable b;
                                final /* synthetic */ int c;
                                final /* synthetic */ ViewPropertyAnimator d;
                                final /* synthetic */ int e;
                                final /* synthetic */ View h;

                                {
                                    this.b = r5;
                                    this.c = r6;
                                    this.h = r7;
                                    this.e = r8;
                                    this.d = r9;
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animator) {
                                    if (this.c != 0) {
                                        this.h.setTranslationX(0.0f);
                                    }
                                    if (this.e != 0) {
                                        this.h.setTranslationY(0.0f);
                                    }
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    this.d.setListener(null);
                                    setAnimatingAway setanimatingaway2 = setAnimatingAway.this;
                                    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = this.b;
                                    setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.read read = setanimatingaway2.g;
                                    if (read != null) {
                                        read.a(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2);
                                    }
                                    setAnimatingAway.this.d.remove(this.b);
                                    setAnimatingAway setanimatingaway3 = setAnimatingAway.this;
                                    if (!setanimatingaway3.b()) {
                                        setanimatingaway3.a();
                                    }
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                }
                            }).start();
                        }
                        arrayList.clear();
                        setAnimatingAway.this.j.remove(arrayList);
                    }
                };
                if (z) {
                    findFragmentByWho.c(arrayList.get(0).e.b, r0, i());
                } else {
                    r0.run();
                }
            }
            if (z3) {
                final ArrayList<write> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f194o);
                this.c.add(arrayList2);
                this.f194o.clear();
                AnonymousClass5 r02 = new Runnable() { // from class: o.setAnimatingAway.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            write write2 = (write) it2.next();
                            setAnimatingAway setanimatingaway = setAnimatingAway.this;
                            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = write2.d;
                            View view2 = null;
                            View view3 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable == null ? null : setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b;
                            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = write2.e;
                            if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 != null) {
                                view2 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.b;
                            }
                            if (view3 != null) {
                                ViewPropertyAnimator duration = view3.animate().setDuration(setanimatingaway.f);
                                setanimatingaway.b.add(write2.d);
                                duration.translationX((float) (write2.b - write2.a));
                                duration.translationY((float) (write2.j - write2.c));
                                duration.alpha(0.0f).setListener(new AnimatorListenerAdapter(write2, duration, view3) { // from class: o.setAnimatingAway.8
                                    final /* synthetic */ View a;
                                    final /* synthetic */ ViewPropertyAnimator b;
                                    final /* synthetic */ write d;

                                    {
                                        this.d = r5;
                                        this.b = r6;
                                        this.a = r7;
                                    }

                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationEnd(Animator animator) {
                                        this.b.setListener(null);
                                        this.a.setAlpha(1.0f);
                                        this.a.setTranslationX(0.0f);
                                        this.a.setTranslationY(0.0f);
                                        setAnimatingAway setanimatingaway2 = setAnimatingAway.this;
                                        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable3 = this.d.d;
                                        setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.read read = setanimatingaway2.g;
                                        if (read != null) {
                                            read.a(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable3);
                                        }
                                        setAnimatingAway.this.b.remove(this.d.d);
                                        setAnimatingAway setanimatingaway3 = setAnimatingAway.this;
                                        if (!setanimatingaway3.b()) {
                                            setanimatingaway3.a();
                                        }
                                    }

                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationStart(Animator animator) {
                                    }
                                }).start();
                            }
                            if (view2 != null) {
                                ViewPropertyAnimator animate2 = view2.animate();
                                setanimatingaway.b.add(write2.e);
                                animate2.translationX(0.0f).translationY(0.0f).setDuration(setanimatingaway.f).alpha(1.0f).setListener(new AnimatorListenerAdapter(write2, animate2, view2) { // from class: o.setAnimatingAway.6
                                    final /* synthetic */ ViewPropertyAnimator a;
                                    final /* synthetic */ write d;
                                    final /* synthetic */ View e;

                                    {
                                        this.d = r5;
                                        this.a = r6;
                                        this.e = r7;
                                    }

                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationEnd(Animator animator) {
                                        this.a.setListener(null);
                                        this.e.setAlpha(1.0f);
                                        this.e.setTranslationX(0.0f);
                                        this.e.setTranslationY(0.0f);
                                        setAnimatingAway setanimatingaway2 = setAnimatingAway.this;
                                        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable3 = this.d.e;
                                        setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.read read = setanimatingaway2.g;
                                        if (read != null) {
                                            read.a(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable3);
                                        }
                                        setAnimatingAway.this.b.remove(this.d.e);
                                        setAnimatingAway setanimatingaway3 = setAnimatingAway.this;
                                        if (!setanimatingaway3.b()) {
                                            setanimatingaway3.a();
                                        }
                                    }

                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationStart(Animator animator) {
                                    }
                                }).start();
                            }
                        }
                        arrayList2.clear();
                        setAnimatingAway.this.c.remove(arrayList2);
                    }
                };
                if (z) {
                    findFragmentByWho.c(arrayList2.get(0).d.b, r02, i());
                } else {
                    r02.run();
                }
            }
            if (z4) {
                final ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.m);
                this.a.add(arrayList3);
                this.m.clear();
                AnonymousClass1 r03 = new Runnable() { // from class: o.setAnimatingAway.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = (setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) it2.next();
                            setAnimatingAway setanimatingaway = setAnimatingAway.this;
                            View view2 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b;
                            ViewPropertyAnimator animate2 = view2.animate();
                            setanimatingaway.e.add(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
                            animate2.alpha(1.0f).setDuration(setanimatingaway.h).setListener(new AnimatorListenerAdapter(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, view2, animate2) { // from class: o.setAnimatingAway.4
                                final /* synthetic */ ViewPropertyAnimator b;
                                final /* synthetic */ setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable d;
                                final /* synthetic */ View e;

                                {
                                    this.d = r5;
                                    this.e = r6;
                                    this.b = r7;
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animator) {
                                    this.e.setAlpha(1.0f);
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    this.b.setListener(null);
                                    setAnimatingAway setanimatingaway2 = setAnimatingAway.this;
                                    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = this.d;
                                    setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.read read = setanimatingaway2.g;
                                    if (read != null) {
                                        read.a(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2);
                                    }
                                    setAnimatingAway.this.e.remove(this.d);
                                    setAnimatingAway setanimatingaway3 = setAnimatingAway.this;
                                    if (!setanimatingaway3.b()) {
                                        setanimatingaway3.a();
                                    }
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                }
                            }).start();
                        }
                        arrayList3.clear();
                        setAnimatingAway.this.a.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j = 0;
                    long i = z ? i() : 0;
                    long j2 = z2 ? j() : 0;
                    if (z3) {
                        j = d();
                    }
                    findFragmentByWho.c(arrayList3.get(0).b, r03, i + Math.max(j2, j));
                    return;
                }
                r03.run();
            }
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem
    public final boolean c(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, List<Object> list) {
        return !list.isEmpty() || c(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, list);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem
    public final void d(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        View view = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b;
        view.animate().cancel();
        for (int size = this.p.size() - 1; size >= 0; size--) {
            if (this.p.get(size).e == setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                i(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
                this.p.remove(size);
            }
        }
        a(this.f194o, setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        if (this.t.remove(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable)) {
            view.setAlpha(1.0f);
            i(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        }
        if (this.m.remove(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable)) {
            view.setAlpha(1.0f);
            i(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            ArrayList<write> arrayList = this.c.get(size2);
            a(arrayList, setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
            if (arrayList.isEmpty()) {
                this.c.remove(size2);
            }
        }
        for (int size3 = this.j.size() - 1; size3 >= 0; size3--) {
            ArrayList<setAnimatingAway$MediaBrowserCompat$CustomActionResultReceiver> arrayList2 = this.j.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).e == setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    i(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.j.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.a.size() - 1; size5 >= 0; size5--) {
            ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> arrayList3 = this.a.get(size5);
            if (arrayList3.remove(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable)) {
                view.setAlpha(1.0f);
                i(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
                if (arrayList3.isEmpty()) {
                    this.a.remove(size5);
                }
            }
        }
        this.i.remove(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        this.e.remove(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        this.b.remove(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        this.d.remove(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        if (!b()) {
            a();
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem
    public final void e() {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            setAnimatingAway$MediaBrowserCompat$CustomActionResultReceiver setanimatingaway_mediabrowsercompat_customactionresultreceiver = this.p.get(size);
            View view = setanimatingaway_mediabrowsercompat_customactionresultreceiver.e.b;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            i(setanimatingaway_mediabrowsercompat_customactionresultreceiver.e);
            this.p.remove(size);
        }
        for (int size2 = this.t.size() - 1; size2 >= 0; size2--) {
            i(this.t.get(size2));
            this.t.remove(size2);
        }
        for (int size3 = this.m.size() - 1; size3 >= 0; size3--) {
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = this.m.get(size3);
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b.setAlpha(1.0f);
            i(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
            this.m.remove(size3);
        }
        for (int size4 = this.f194o.size() - 1; size4 >= 0; size4--) {
            d(this.f194o.get(size4));
        }
        this.f194o.clear();
        if (b()) {
            for (int size5 = this.j.size() - 1; size5 >= 0; size5--) {
                ArrayList<setAnimatingAway$MediaBrowserCompat$CustomActionResultReceiver> arrayList = this.j.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    setAnimatingAway$MediaBrowserCompat$CustomActionResultReceiver setanimatingaway_mediabrowsercompat_customactionresultreceiver2 = arrayList.get(size6);
                    View view2 = setanimatingaway_mediabrowsercompat_customactionresultreceiver2.e.b;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    i(setanimatingaway_mediabrowsercompat_customactionresultreceiver2.e);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.j.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.a.size() - 1; size7 >= 0; size7--) {
                ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> arrayList2 = this.a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = arrayList2.get(size8);
                    setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.b.setAlpha(1.0f);
                    i(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.c.size() - 1; size9 >= 0; size9--) {
                ArrayList<write> arrayList3 = this.c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    d(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.c.remove(arrayList3);
                    }
                }
            }
            a(this.i);
            a(this.d);
            a(this.e);
            a(this.b);
            a();
        }
    }

    @Override // o.setPostOnViewCreatedAlpha
    public final boolean e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        f(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        this.t.add(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        return true;
    }
}
