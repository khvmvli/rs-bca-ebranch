package com.facebook.stetho.common.android;

import android.app.Dialog;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.stetho.common.android.FragmentCompat;
import javax.annotation.Nullable;
import o.getText;
import o.getView;
import o.isDetached;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/common/android/FragmentCompatSupportLib.class */
public final class FragmentCompatSupportLib extends FragmentCompat<Fragment, getText, isDetached, getView> {
    private static final FragmentAccessorSupportLib sFragmentAccessor = new FragmentAccessorSupportLib();
    private static final DialogFragmentAccessorSupportLib sDialogFragmentAccessor = new DialogFragmentAccessorSupportLib();
    private static final FragmentCompat.FragmentManagerAccessorViaReflection<isDetached, Fragment> sFragmentManagerAccessor = new FragmentCompat.FragmentManagerAccessorViaReflection<>();
    private static final FragmentActivityAccessorSupportLib sFragmentActivityAccessor = new FragmentActivityAccessorSupportLib();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/common/android/FragmentCompatSupportLib$DialogFragmentAccessorSupportLib.class */
    public static class DialogFragmentAccessorSupportLib extends FragmentAccessorSupportLib implements DialogFragmentAccessor<getText, Fragment, isDetached> {
        private DialogFragmentAccessorSupportLib() {
            super();
        }

        public Dialog getDialog(getText gettext) {
            return gettext.getDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/common/android/FragmentCompatSupportLib$FragmentAccessorSupportLib.class */
    public static class FragmentAccessorSupportLib implements FragmentAccessor<Fragment, isDetached> {
        private FragmentAccessorSupportLib() {
        }

        @Nullable
        public isDetached getChildFragmentManager(Fragment fragment) {
            return fragment.getChildFragmentManager();
        }

        @Nullable
        public isDetached getFragmentManager(Fragment fragment) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/common/android/FragmentCompatSupportLib$FragmentActivityAccessorSupportLib.class */
    public static class FragmentActivityAccessorSupportLib implements FragmentActivityAccessor<getView, isDetached> {
        private FragmentActivityAccessorSupportLib() {
        }

        @Nullable
        public isDetached getFragmentManager(getView getview) {
            return getview.l();
        }
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public final DialogFragmentAccessor<getText, Fragment, isDetached> forDialogFragment() {
        return sDialogFragmentAccessor;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public final FragmentAccessor<Fragment, isDetached> forFragment() {
        return sFragmentAccessor;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public final FragmentActivityAccessor<getView, isDetached> forFragmentActivity() {
        return sFragmentActivityAccessor;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public final FragmentManagerAccessor<isDetached, Fragment> forFragmentManager() {
        return sFragmentManagerAccessor;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public final Class<getText> getDialogFragmentClass() {
        return getText.class;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public final Class<getView> getFragmentActivityClass() {
        return getView.class;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public final Class<Fragment> getFragmentClass() {
        return Fragment.class;
    }
}
