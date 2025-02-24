package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import o.findFragmentByWho;
import o.hashCode;
import o.onDetach;
import o.onStart;
/* loaded from: classes-dex2jar.jar:androidx/core/view/WindowInsetsCompat.class */
public class WindowInsetsCompat {
    public static final WindowInsetsCompat e;
    private final Impl c;

    /* loaded from: classes-dex2jar.jar:androidx/core/view/WindowInsetsCompat$IconCompatParcelizer.class */
    public static class IconCompatParcelizer {
        private static Field a;
        private static Field c;
        private static Field d;
        private static boolean e;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                c = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                d = declaredField3;
                declaredField3.setAccessible(true);
                e = true;
            } catch (ReflectiveOperationException e2) {
                StringBuilder sb = new StringBuilder("Failed to get visible insets from AttachInfo ");
                sb.append(e2.getMessage());
                Log.w("WindowInsetsCompat", sb.toString(), e2);
            }
        }

        public static WindowInsetsCompat b(View view) {
            if (!e || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) c.get(obj);
                Rect rect2 = (Rect) d.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                WindowInsetsCompat d2 = new RemoteActionCompatParcelizer().e(hashCode.d(rect)).a(hashCode.d(rect2)).d();
                d2.d(d2);
                d2.d(view.getRootView());
                return d2;
            } catch (IllegalAccessException e2) {
                StringBuilder sb = new StringBuilder("Failed to get insets from AttachInfo. ");
                sb.append(e2.getMessage());
                Log.w("WindowInsetsCompat", sb.toString(), e2);
                return null;
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/core/view/WindowInsetsCompat$Impl.class */
    public static class Impl {
        static final WindowInsetsCompat CONSUMED = new RemoteActionCompatParcelizer().d().a().b().d();
        final WindowInsetsCompat mHost;

        Impl(WindowInsetsCompat windowInsetsCompat) {
            this.mHost = windowInsetsCompat;
        }

        WindowInsetsCompat consumeDisplayCutout() {
            return this.mHost;
        }

        WindowInsetsCompat consumeStableInsets() {
            return this.mHost;
        }

        WindowInsetsCompat consumeSystemWindowInsets() {
            return this.mHost;
        }

        void copyRootViewBounds(View view) {
        }

        void copyWindowDataInto(WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl)) {
                return false;
            }
            Impl impl = (Impl) obj;
            if (isRound() != impl.isRound() || isConsumed() != impl.isConsumed() || !onDetach.a(getSystemWindowInsets(), impl.getSystemWindowInsets()) || !onDetach.a(getStableInsets(), impl.getStableInsets()) || !onDetach.a(getDisplayCutout(), impl.getDisplayCutout())) {
                z = false;
            }
            return z;
        }

        onStart getDisplayCutout() {
            return null;
        }

        hashCode getInsets(int i) {
            return hashCode.b;
        }

        hashCode getInsetsIgnoringVisibility(int i) {
            if ((i & 8) == 0) {
                return hashCode.b;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        hashCode getMandatorySystemGestureInsets() {
            return getSystemWindowInsets();
        }

        hashCode getStableInsets() {
            return hashCode.b;
        }

        hashCode getSystemGestureInsets() {
            return getSystemWindowInsets();
        }

        hashCode getSystemWindowInsets() {
            return hashCode.b;
        }

        hashCode getTappableElementInsets() {
            return getSystemWindowInsets();
        }

        public int hashCode() {
            return onDetach.c(Boolean.valueOf(isRound()), Boolean.valueOf(isConsumed()), getSystemWindowInsets(), getStableInsets(), getDisplayCutout());
        }

        WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            return CONSUMED;
        }

        boolean isConsumed() {
            return false;
        }

        boolean isRound() {
            return false;
        }

        boolean isVisible(int i) {
            return true;
        }

        public void setOverriddenInsets(hashCode[] hashcodeArr) {
        }

        void setRootViewData(hashCode hashcode) {
        }

        void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        }

        public void setStableInsets(hashCode hashcode) {
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/core/view/WindowInsetsCompat$Impl20.class */
    public static class Impl20 extends Impl {
        private static Class<?> sAttachInfoClass;
        private static Field sAttachInfoField;
        private static Method sGetViewRootImplMethod;
        private static Class<?> sViewRootImplClass;
        private static Field sVisibleInsetsField;
        private static boolean sVisibleRectReflectionFetched;
        private hashCode[] mOverriddenInsets;
        final WindowInsets mPlatformInsets;
        hashCode mRootViewVisibleInsets;
        private WindowInsetsCompat mRootWindowInsets;
        private hashCode mSystemWindowInsets;

        Impl20(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.mSystemWindowInsets = null;
            this.mPlatformInsets = windowInsets;
        }

        Impl20(WindowInsetsCompat windowInsetsCompat, Impl20 impl20) {
            this(windowInsetsCompat, new WindowInsets(impl20.mPlatformInsets));
        }

        private hashCode getInsets(int i, boolean z) {
            hashCode hashcode = hashCode.b;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    hashcode = hashCode.d(hashcode, getInsetsForType(i2, z));
                }
            }
            return hashcode;
        }

        private hashCode getRootStableInsets() {
            WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
            return windowInsetsCompat != null ? windowInsetsCompat.g() : hashCode.b;
        }

        private hashCode getVisibleInsets(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!sVisibleRectReflectionFetched) {
                    loadReflectionField();
                }
                Method method = sGetViewRootImplMethod;
                hashCode hashcode = null;
                if (method == null || sAttachInfoClass == null || sVisibleInsetsField == null) {
                    return null;
                }
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) sVisibleInsetsField.get(sAttachInfoField.get(invoke));
                    if (rect != null) {
                        hashcode = hashCode.d(rect);
                    }
                    return hashcode;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    return null;
                }
            } else {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
        }

        private static void loadReflectionField() {
            try {
                sGetViewRootImplMethod = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                sViewRootImplClass = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                sAttachInfoClass = cls;
                sVisibleInsetsField = cls.getDeclaredField("mVisibleInsets");
                sAttachInfoField = sViewRootImplClass.getDeclaredField("mAttachInfo");
                sVisibleInsetsField.setAccessible(true);
                sAttachInfoField.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            sVisibleRectReflectionFetched = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyRootViewBounds(View view) {
            hashCode visibleInsets = getVisibleInsets(view);
            hashCode hashcode = visibleInsets;
            if (visibleInsets == null) {
                hashcode = hashCode.b;
            }
            setRootViewData(hashcode);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyWindowDataInto(WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.d(this.mRootWindowInsets);
            windowInsetsCompat.e(this.mRootViewVisibleInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (!equals(obj)) {
                return false;
            }
            return Objects.equals(this.mRootViewVisibleInsets, ((Impl20) obj).mRootViewVisibleInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public hashCode getInsets(int i) {
            return getInsets(i, false);
        }

        protected hashCode getInsetsForType(int i, boolean z) {
            if (i == 1) {
                return z ? hashCode.b(0, Math.max(getRootStableInsets().a, getSystemWindowInsets().a), 0, 0) : hashCode.b(0, getSystemWindowInsets().a, 0, 0);
            }
            hashCode hashcode = null;
            hashCode hashcode2 = null;
            if (i != 2) {
                if (i == 8) {
                    hashCode[] hashcodeArr = this.mOverriddenInsets;
                    if (hashcodeArr != null) {
                        hashcode2 = hashcodeArr[MediaDescriptionCompat.d(8)];
                    }
                    if (hashcode2 != null) {
                        return hashcode2;
                    }
                    hashCode systemWindowInsets = getSystemWindowInsets();
                    hashCode rootStableInsets = getRootStableInsets();
                    if (systemWindowInsets.d > rootStableInsets.d) {
                        return hashCode.b(0, 0, 0, systemWindowInsets.d);
                    }
                    hashCode hashcode3 = this.mRootViewVisibleInsets;
                    return (hashcode3 == null || hashcode3.equals(hashCode.b) || this.mRootViewVisibleInsets.d <= rootStableInsets.d) ? hashCode.b : hashCode.b(0, 0, 0, this.mRootViewVisibleInsets.d);
                } else if (i == 16) {
                    return getSystemGestureInsets();
                } else {
                    if (i == 32) {
                        return getMandatorySystemGestureInsets();
                    }
                    if (i == 64) {
                        return getTappableElementInsets();
                    }
                    if (i != 128) {
                        return hashCode.b;
                    }
                    WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
                    onStart c = windowInsetsCompat != null ? windowInsetsCompat.c() : getDisplayCutout();
                    return c != null ? hashCode.b(c.d(), c.b(), c.e(), c.c()) : hashCode.b;
                }
            } else if (z) {
                hashCode rootStableInsets2 = getRootStableInsets();
                hashCode stableInsets = getStableInsets();
                return hashCode.b(Math.max(rootStableInsets2.e, stableInsets.e), 0, Math.max(rootStableInsets2.c, stableInsets.c), Math.max(rootStableInsets2.d, stableInsets.d));
            } else {
                hashCode systemWindowInsets2 = getSystemWindowInsets();
                WindowInsetsCompat windowInsetsCompat2 = this.mRootWindowInsets;
                if (windowInsetsCompat2 != null) {
                    hashcode = windowInsetsCompat2.g();
                }
                int i2 = systemWindowInsets2.d;
                int i3 = i2;
                if (hashcode != null) {
                    i3 = Math.min(i2, hashcode.d);
                }
                return hashCode.b(systemWindowInsets2.e, 0, systemWindowInsets2.c, i3);
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public hashCode getInsetsIgnoringVisibility(int i) {
            return getInsets(i, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final hashCode getSystemWindowInsets() {
            if (this.mSystemWindowInsets == null) {
                this.mSystemWindowInsets = hashCode.b(this.mPlatformInsets.getSystemWindowInsetLeft(), this.mPlatformInsets.getSystemWindowInsetTop(), this.mPlatformInsets.getSystemWindowInsetRight(), this.mPlatformInsets.getSystemWindowInsetBottom());
            }
            return this.mSystemWindowInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(WindowInsetsCompat.c(this.mPlatformInsets));
            remoteActionCompatParcelizer.a(WindowInsetsCompat.a(getSystemWindowInsets(), i, i2, i3, i4));
            remoteActionCompatParcelizer.e(WindowInsetsCompat.a(getStableInsets(), i, i2, i3, i4));
            return remoteActionCompatParcelizer.d();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isRound() {
            return this.mPlatformInsets.isRound();
        }

        protected boolean isTypeVisible(int i) {
            if (!(i == 1 || i == 2)) {
                if (i == 4) {
                    return false;
                }
                if (!(i == 8 || i == 128)) {
                    return true;
                }
            }
            return !getInsetsForType(i, false).equals(hashCode.b);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isVisible(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !isTypeVisible(i2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setOverriddenInsets(hashCode[] hashcodeArr) {
            this.mOverriddenInsets = hashcodeArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootViewData(hashCode hashcode) {
            this.mRootViewVisibleInsets = hashcode;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
            this.mRootWindowInsets = windowInsetsCompat;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:androidx/core/view/WindowInsetsCompat$Impl21.class */
    public static class Impl21 extends Impl20 {
        private hashCode mStableInsets;

        Impl21(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mStableInsets = null;
        }

        Impl21(WindowInsetsCompat windowInsetsCompat, Impl21 impl21) {
            super(windowInsetsCompat, impl21);
            this.mStableInsets = null;
            this.mStableInsets = impl21.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat consumeStableInsets() {
            return WindowInsetsCompat.c(this.mPlatformInsets.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat consumeSystemWindowInsets() {
            return WindowInsetsCompat.c(this.mPlatformInsets.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final hashCode getStableInsets() {
            if (this.mStableInsets == null) {
                this.mStableInsets = hashCode.b(this.mPlatformInsets.getStableInsetLeft(), this.mPlatformInsets.getStableInsetTop(), this.mPlatformInsets.getStableInsetRight(), this.mPlatformInsets.getStableInsetBottom());
            }
            return this.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isConsumed() {
            return this.mPlatformInsets.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(hashCode hashcode) {
            this.mStableInsets = hashcode;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:androidx/core/view/WindowInsetsCompat$Impl28.class */
    public static class Impl28 extends Impl21 {
        Impl28(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        Impl28(WindowInsetsCompat windowInsetsCompat, Impl28 impl28) {
            super(windowInsetsCompat, impl28);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat consumeDisplayCutout() {
            return WindowInsetsCompat.c(this.mPlatformInsets.consumeDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl28)) {
                return false;
            }
            Impl28 impl28 = (Impl28) obj;
            if (!Objects.equals(this.mPlatformInsets, impl28.mPlatformInsets) || !Objects.equals(this.mRootViewVisibleInsets, impl28.mRootViewVisibleInsets)) {
                z = false;
            }
            return z;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        onStart getDisplayCutout() {
            return onStart.b(this.mPlatformInsets.getDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
            return this.mPlatformInsets.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:androidx/core/view/WindowInsetsCompat$Impl29.class */
    public static class Impl29 extends Impl28 {
        private hashCode mSystemGestureInsets = null;
        private hashCode mMandatorySystemGestureInsets = null;
        private hashCode mTappableElementInsets = null;

        Impl29(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        Impl29(WindowInsetsCompat windowInsetsCompat, Impl29 impl29) {
            super(windowInsetsCompat, impl29);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        hashCode getMandatorySystemGestureInsets() {
            if (this.mMandatorySystemGestureInsets == null) {
                this.mMandatorySystemGestureInsets = hashCode.e(this.mPlatformInsets.getMandatorySystemGestureInsets());
            }
            return this.mMandatorySystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        hashCode getSystemGestureInsets() {
            if (this.mSystemGestureInsets == null) {
                this.mSystemGestureInsets = hashCode.e(this.mPlatformInsets.getSystemGestureInsets());
            }
            return this.mSystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        hashCode getTappableElementInsets() {
            if (this.mTappableElementInsets == null) {
                this.mTappableElementInsets = hashCode.e(this.mPlatformInsets.getTappableElementInsets());
            }
            return this.mTappableElementInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            return WindowInsetsCompat.c(this.mPlatformInsets.inset(i, i2, i3, i4));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(hashCode hashcode) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:androidx/core/view/WindowInsetsCompat$Impl30.class */
    public static class Impl30 extends Impl29 {
        static final WindowInsetsCompat CONSUMED = WindowInsetsCompat.c(WindowInsets.CONSUMED);

        Impl30(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        Impl30(WindowInsetsCompat windowInsetsCompat, Impl30 impl30) {
            super(windowInsetsCompat, impl30);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        final void copyRootViewBounds(View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public hashCode getInsets(int i) {
            return hashCode.e(this.mPlatformInsets.getInsets(MediaMetadataCompat.a(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public hashCode getInsetsIgnoringVisibility(int i) {
            return hashCode.e(this.mPlatformInsets.getInsetsIgnoringVisibility(MediaMetadataCompat.a(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int i) {
            return this.mPlatformInsets.isVisible(MediaMetadataCompat.a(i));
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/core/view/WindowInsetsCompat$MediaDescriptionCompat.class */
    public static final class MediaDescriptionCompat {
        static int d(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            StringBuilder sb = new StringBuilder("type needs to be >= FIRST and <= LAST, type=");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/core/view/WindowInsetsCompat$MediaMetadataCompat.class */
    static final class MediaMetadataCompat {
        static int a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                i3 = i3;
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets.Type.tappableElement();
                    } else if (i4 != 128) {
                        i3 = i3;
                    } else {
                        i2 = WindowInsets.Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        private final read e;

        public RemoteActionCompatParcelizer() {
            if (Build.VERSION.SDK_INT >= 30) {
                this.e = new WindowInsetsCompat$MediaBrowserCompat$SearchResultReceiver();
            } else if (Build.VERSION.SDK_INT >= 29) {
                this.e = new WindowInsetsCompat$MediaBrowserCompat$CustomActionResultReceiver();
            } else {
                this.e = new write();
            }
        }

        public RemoteActionCompatParcelizer(WindowInsetsCompat windowInsetsCompat) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.e = new WindowInsetsCompat$MediaBrowserCompat$SearchResultReceiver(windowInsetsCompat);
            } else if (Build.VERSION.SDK_INT >= 29) {
                this.e = new WindowInsetsCompat$MediaBrowserCompat$CustomActionResultReceiver(windowInsetsCompat);
            } else {
                this.e = new write(windowInsetsCompat);
            }
        }

        @Deprecated
        public final RemoteActionCompatParcelizer a(hashCode hashcode) {
            this.e.a(hashcode);
            return this;
        }

        public final WindowInsetsCompat d() {
            return this.e.e();
        }

        @Deprecated
        public final RemoteActionCompatParcelizer e(hashCode hashcode) {
            this.e.c(hashcode);
            return this;
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/core/view/WindowInsetsCompat$read.class */
    public static class read {
        private final WindowInsetsCompat b;
        hashCode[] d;

        public read() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        read(WindowInsetsCompat windowInsetsCompat) {
            this.b = windowInsetsCompat;
        }

        protected final void a() {
            hashCode[] hashcodeArr = this.d;
            if (hashcodeArr != null) {
                hashCode hashcode = hashcodeArr[MediaDescriptionCompat.d(1)];
                hashCode hashcode2 = this.d[MediaDescriptionCompat.d(2)];
                if (hashcode != null && hashcode2 != null) {
                    a(hashCode.d(hashcode, hashcode2));
                } else if (hashcode != null) {
                    a(hashcode);
                } else if (hashcode2 != null) {
                    a(hashcode2);
                }
                hashCode hashcode3 = this.d[MediaDescriptionCompat.d(16)];
                if (hashcode3 != null) {
                    d(hashcode3);
                }
                hashCode hashcode4 = this.d[MediaDescriptionCompat.d(32)];
                if (hashcode4 != null) {
                    b(hashcode4);
                }
                hashCode hashcode5 = this.d[MediaDescriptionCompat.d(64)];
                if (hashcode5 != null) {
                    e(hashcode5);
                }
            }
        }

        void a(hashCode hashcode) {
        }

        void b(hashCode hashcode) {
        }

        void c(hashCode hashcode) {
        }

        void d(hashCode hashcode) {
        }

        WindowInsetsCompat e() {
            a();
            return this.b;
        }

        void e(hashCode hashcode) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:androidx/core/view/WindowInsetsCompat$write.class */
    public static class write extends read {
        private static Field a;
        private static Constructor<WindowInsets> b;
        private static boolean c;
        private static boolean e;
        private WindowInsets f;
        private hashCode i;

        write() {
            this.f = b();
        }

        write(WindowInsetsCompat windowInsetsCompat) {
            this.f = windowInsetsCompat.n();
        }

        private static WindowInsets b() {
            if (!e) {
                try {
                    a = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                e = true;
            }
            Field field = a;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!c) {
                try {
                    b = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                c = true;
            }
            Constructor<WindowInsets> constructor = b;
            if (constructor == null) {
                return null;
            }
            try {
                return constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                return null;
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.read
        void a(hashCode hashcode) {
            WindowInsets windowInsets = this.f;
            if (windowInsets != null) {
                this.f = windowInsets.replaceSystemWindowInsets(hashcode.e, hashcode.a, hashcode.c, hashcode.d);
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.read
        void c(hashCode hashcode) {
            this.i = hashcode;
        }

        @Override // androidx.core.view.WindowInsetsCompat.read
        WindowInsetsCompat e() {
            a();
            WindowInsetsCompat c2 = WindowInsetsCompat.c(this.f);
            c2.a(this.d);
            c2.b(this.i);
            return c2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            e = Impl30.CONSUMED;
        } else {
            e = Impl.CONSUMED;
        }
    }

    private WindowInsetsCompat(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.c = new Impl30(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.c = new Impl29(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.c = new Impl28(this, windowInsets);
        } else {
            this.c = new Impl21(this, windowInsets);
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            Impl impl = windowInsetsCompat.c;
            if (Build.VERSION.SDK_INT >= 30 && (impl instanceof Impl30)) {
                this.c = new Impl30(this, (Impl30) impl);
            } else if (Build.VERSION.SDK_INT >= 29 && (impl instanceof Impl29)) {
                this.c = new Impl29(this, (Impl29) impl);
            } else if (Build.VERSION.SDK_INT >= 28 && (impl instanceof Impl28)) {
                this.c = new Impl28(this, (Impl28) impl);
            } else if (impl instanceof Impl21) {
                this.c = new Impl21(this, (Impl21) impl);
            } else if (impl instanceof Impl20) {
                this.c = new Impl20(this, (Impl20) impl);
            } else {
                this.c = new Impl(this);
            }
            impl.copyWindowDataInto(this);
            return;
        }
        this.c = new Impl(this);
    }

    public static WindowInsetsCompat a(WindowInsets windowInsets, View view) {
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            windowInsetsCompat.d(findFragmentByWho.v(view));
            windowInsetsCompat.d(view.getRootView());
        }
        return windowInsetsCompat;
    }

    static hashCode a(hashCode hashcode, int i, int i2, int i3, int i4) {
        int max = Math.max(0, hashcode.e - i);
        int max2 = Math.max(0, hashcode.a - i2);
        int max3 = Math.max(0, hashcode.c - i3);
        int max4 = Math.max(0, hashcode.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? hashcode : hashCode.b(max, max2, max3, max4);
    }

    public static WindowInsetsCompat c(WindowInsets windowInsets) {
        return a(windowInsets, null);
    }

    @Deprecated
    public WindowInsetsCompat a() {
        return this.c.consumeDisplayCutout();
    }

    public WindowInsetsCompat a(int i, int i2, int i3, int i4) {
        return this.c.inset(i, i2, i3, i4);
    }

    public void a(hashCode[] hashcodeArr) {
        this.c.setOverriddenInsets(hashcodeArr);
    }

    @Deprecated
    public WindowInsetsCompat b() {
        return this.c.consumeStableInsets();
    }

    void b(hashCode hashcode) {
        this.c.setStableInsets(hashcode);
    }

    @Deprecated
    public WindowInsetsCompat c(int i, int i2, int i3, int i4) {
        return new RemoteActionCompatParcelizer(this).a(hashCode.b(i, i2, i3, i4)).d();
    }

    public onStart c() {
        return this.c.getDisplayCutout();
    }

    @Deprecated
    public WindowInsetsCompat d() {
        return this.c.consumeSystemWindowInsets();
    }

    public void d(View view) {
        this.c.copyRootViewBounds(view);
    }

    public void d(WindowInsetsCompat windowInsetsCompat) {
        this.c.setRootWindowInsets(windowInsetsCompat);
    }

    @Deprecated
    public hashCode e() {
        return this.c.getMandatorySystemGestureInsets();
    }

    void e(hashCode hashcode) {
        this.c.setRootViewData(hashcode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat)) {
            return false;
        }
        return onDetach.a(this.c, ((WindowInsetsCompat) obj).c);
    }

    @Deprecated
    public int f() {
        return this.c.getSystemWindowInsets().c;
    }

    @Deprecated
    public hashCode g() {
        return this.c.getStableInsets();
    }

    @Deprecated
    public int h() {
        return this.c.getSystemWindowInsets().a;
    }

    public int hashCode() {
        Impl impl = this.c;
        return impl == null ? 0 : impl.hashCode();
    }

    @Deprecated
    public int i() {
        return this.c.getSystemWindowInsets().e;
    }

    @Deprecated
    public int j() {
        return this.c.getSystemWindowInsets().d;
    }

    public boolean k() {
        return this.c.isConsumed();
    }

    @Deprecated
    public boolean m() {
        return !this.c.getSystemWindowInsets().equals(hashCode.b);
    }

    public WindowInsets n() {
        Impl impl = this.c;
        return impl instanceof Impl20 ? ((Impl20) impl).mPlatformInsets : null;
    }
}
