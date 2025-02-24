package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.Fragment;
import o.getSharedElementSourceNames;
import o.noteStateNotSaved;
import o.setNestedScrollingEnabled;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/getViewLifecycleOwnerLiveData.class */
public final class getViewLifecycleOwnerLiveData {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getViewLifecycleOwnerLiveData$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends AnimationSet implements Runnable {
        private boolean a;
        private final View b;
        private final ViewGroup c;
        private boolean d = true;
        private boolean e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public IconCompatParcelizer(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.c = viewGroup;
            this.b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation) {
            this.d = true;
            if (this.e) {
                return !this.a;
            }
            if (getTransformation(j, transformation)) {
                return true;
            }
            this.e = true;
            registerOnPreAttachListener.e(this.c, this);
            return true;
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.d = true;
            if (this.e) {
                return !this.a;
            }
            if (getTransformation(j, transformation, f)) {
                return true;
            }
            this.e = true;
            registerOnPreAttachListener.e(this.c, this);
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.e || !this.d) {
                this.c.endViewTransition(this.b);
                this.a = true;
                return;
            }
            this.d = false;
            this.c.post(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getViewLifecycleOwnerLiveData$write.class */
    public static final class write {
        public final Animator a;
        public final Animation c;

        write(Animator animator) {
            this.c = null;
            this.a = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        write(Animation animation) {
            this.c = animation;
            this.a = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(final Fragment fragment, write write2, final noteStateNotSaved.write write3) {
        final View view = fragment.mView;
        final ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        final setNestedScrollingEnabled setnestedscrollingenabled = new setNestedScrollingEnabled();
        setnestedscrollingenabled.d(new setNestedScrollingEnabled.write() { // from class: o.getViewLifecycleOwnerLiveData.5
            @Override // o.setNestedScrollingEnabled.write
            public final void c() {
                if (Fragment.this.getAnimatingAway() != null) {
                    View animatingAway = Fragment.this.getAnimatingAway();
                    Fragment.this.setAnimatingAway(null);
                    animatingAway.clearAnimation();
                }
                Fragment.this.setAnimator(null);
            }
        });
        write3.a(fragment, setnestedscrollingenabled);
        if (write2.c != null) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(write2.c, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            iconCompatParcelizer.setAnimationListener(new Animation.AnimationListener() { // from class: o.getViewLifecycleOwnerLiveData.4
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    viewGroup.post(new Runnable() { // from class: o.getViewLifecycleOwnerLiveData.4.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (fragment.getAnimatingAway() != null) {
                                fragment.setAnimatingAway(null);
                                write3.e(fragment, setnestedscrollingenabled);
                            }
                        }
                    });
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }
            });
            fragment.mView.startAnimation(iconCompatParcelizer);
            return;
        }
        Animator animator = write2.a;
        fragment.setAnimator(write2.a);
        animator.addListener(new AnimatorListenerAdapter() { // from class: o.getViewLifecycleOwnerLiveData.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                viewGroup.endViewTransition(view);
                Animator animator3 = fragment.getAnimator();
                fragment.setAnimator(null);
                if (animator3 != null && viewGroup.indexOfChild(view) < 0) {
                    write3.e(fragment, setnestedscrollingenabled);
                }
            }
        });
        animator.setTarget(fragment.mView);
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static write b(Context context, Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int popEnterAnim = z2 ? z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z ? fragment.getEnterAnim() : fragment.getExitAnim();
        fragment.setAnimations(0, 0, 0, 0);
        if (!(fragment.mContainer == null || fragment.mContainer.getTag(getSharedElementSourceNames$MediaBrowserCompat$CustomActionResultReceiver.b) == null)) {
            fragment.mContainer.setTag(getSharedElementSourceNames$MediaBrowserCompat$CustomActionResultReceiver.b, null);
        }
        if (fragment.mContainer != null && fragment.mContainer.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, popEnterAnim);
        if (onCreateAnimation != null) {
            return new write(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, popEnterAnim);
        if (onCreateAnimator != null) {
            return new write(onCreateAnimator);
        }
        int i = popEnterAnim;
        if (popEnterAnim == 0) {
            i = popEnterAnim;
            if (nextTransition != 0) {
                if (nextTransition == 4097) {
                    i = z ? getSharedElementSourceNames.write.b : getSharedElementSourceNames.write.f;
                } else if (nextTransition == 4099) {
                    i = z ? getSharedElementSourceNames.write.c : getSharedElementSourceNames.write.a;
                } else if (nextTransition != 8194) {
                    i = -1;
                } else {
                    i = z ? getSharedElementSourceNames.write.d : getSharedElementSourceNames.write.e;
                }
            }
        }
        if (i == 0) {
            return null;
        }
        boolean equals = "anim".equals(context.getResources().getResourceTypeName(i));
        boolean z3 = false;
        if (equals) {
            try {
                Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
                if (loadAnimation != null) {
                    return new write(loadAnimation);
                }
                z3 = true;
            } catch (Resources.NotFoundException e) {
                throw e;
            } catch (RuntimeException e2) {
                z3 = false;
            }
        }
        if (z3) {
            return null;
        }
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator != null) {
                return new write(loadAnimator);
            }
            return null;
        } catch (RuntimeException e3) {
            if (!equals) {
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                if (loadAnimation2 != null) {
                    return new write(loadAnimation2);
                }
                return null;
            }
            throw e3;
        }
    }
}
