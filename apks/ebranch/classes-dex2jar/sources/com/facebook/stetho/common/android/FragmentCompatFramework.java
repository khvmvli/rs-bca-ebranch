package com.facebook.stetho.common.android;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Resources;
import android.view.View;
import com.facebook.stetho.common.android.FragmentCompat;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/common/android/FragmentCompatFramework.class */
public final class FragmentCompatFramework extends FragmentCompat<Fragment, DialogFragment, FragmentManager, Activity> {
    private static final DialogFragmentAccessorFramework sDialogFragmentAccessor;
    private static final FragmentAccessorFrameworkHoneycomb sFragmentAccessor;
    private static final FragmentCompat.FragmentManagerAccessorViaReflection<FragmentManager, Fragment> sFragmentManagerAccessor = new FragmentCompat.FragmentManagerAccessorViaReflection<>();
    private static final FragmentActivityAccessorFramework sFragmentActivityAccessor = new FragmentActivityAccessorFramework();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/common/android/FragmentCompatFramework$DialogFragmentAccessorFramework.class */
    public static class DialogFragmentAccessorFramework implements DialogFragmentAccessor<DialogFragment, Fragment, FragmentManager> {
        private final FragmentAccessor<Fragment, FragmentManager> mFragmentAccessor;

        public DialogFragmentAccessorFramework(FragmentAccessor<Fragment, FragmentManager> fragmentAccessor) {
            this.mFragmentAccessor = fragmentAccessor;
        }

        @Nullable
        public FragmentManager getChildFragmentManager(Fragment fragment) {
            return this.mFragmentAccessor.getChildFragmentManager(fragment);
        }

        public Dialog getDialog(DialogFragment dialogFragment) {
            return dialogFragment.getDialog();
        }

        @Nullable
        public FragmentManager getFragmentManager(Fragment fragment) {
            return this.mFragmentAccessor.getFragmentManager(fragment);
        }

        public int getId(Fragment fragment) {
            return this.mFragmentAccessor.getId(fragment);
        }

        public Resources getResources(Fragment fragment) {
            return this.mFragmentAccessor.getResources(fragment);
        }

        @Nullable
        public String getTag(Fragment fragment) {
            return this.mFragmentAccessor.getTag(fragment);
        }

        @Nullable
        public View getView(Fragment fragment) {
            return this.mFragmentAccessor.getView(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/common/android/FragmentCompatFramework$FragmentAccessorFrameworkHoneycomb.class */
    public static class FragmentAccessorFrameworkHoneycomb implements FragmentAccessor<Fragment, FragmentManager> {
        private FragmentAccessorFrameworkHoneycomb() {
        }

        @Nullable
        public FragmentManager getChildFragmentManager(Fragment fragment) {
            return null;
        }

        @Nullable
        public FragmentManager getFragmentManager(Fragment fragment) {
            return fragment.getFragmentManager();
        }

        public int getId(Fragment fragment) {
            return fragment.getId();
        }

        public Resources getResources(Fragment fragment) {
            return fragment.getResources();
        }

        @Nullable
        public String getTag(Fragment fragment) {
            return fragment.getTag();
        }

        @Nullable
        public View getView(Fragment fragment) {
            return fragment.getView();
        }
    }

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/common/android/FragmentCompatFramework$FragmentAccessorFrameworkJellyBean.class */
    static class FragmentAccessorFrameworkJellyBean extends FragmentAccessorFrameworkHoneycomb {
        private FragmentAccessorFrameworkJellyBean() {
            super();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.stetho.common.android.FragmentCompatFramework.FragmentAccessorFrameworkHoneycomb
        @Nullable
        public FragmentManager getChildFragmentManager(Fragment fragment) {
            return fragment.getChildFragmentManager();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/common/android/FragmentCompatFramework$FragmentActivityAccessorFramework.class */
    public static class FragmentActivityAccessorFramework implements FragmentActivityAccessor<Activity, FragmentManager> {
        private FragmentActivityAccessorFramework() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.stetho.common.android.FragmentActivityAccessor
        @Nullable
        public FragmentManager getFragmentManager(Activity activity) {
            return activity.getFragmentManager();
        }
    }

    static {
        FragmentAccessorFrameworkJellyBean fragmentAccessorFrameworkJellyBean = new FragmentAccessorFrameworkJellyBean();
        sFragmentAccessor = fragmentAccessorFrameworkJellyBean;
        sDialogFragmentAccessor = new DialogFragmentAccessorFramework(fragmentAccessorFrameworkJellyBean);
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public final DialogFragmentAccessor<DialogFragment, Fragment, FragmentManager> forDialogFragment() {
        return sDialogFragmentAccessor;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public final FragmentAccessor<Fragment, FragmentManager> forFragment() {
        return sFragmentAccessor;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public final FragmentActivityAccessor<Activity, FragmentManager> forFragmentActivity() {
        return sFragmentActivityAccessor;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    /* renamed from: forFragmentManager */
    public final FragmentManagerAccessor<FragmentManager, Fragment> forFragmentManager2() {
        return sFragmentManagerAccessor;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public final Class<DialogFragment> getDialogFragmentClass() {
        return DialogFragment.class;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public final Class<Activity> getFragmentActivityClass() {
        return Activity.class;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public final Class<Fragment> getFragmentClass() {
        return Fragment.class;
    }
}
