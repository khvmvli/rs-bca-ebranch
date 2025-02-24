package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import o.getSharedElementSourceNames;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/isHidden.class */
public final class isHidden implements LayoutInflater.Factory2 {
    final isDetached d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public isHidden(isDetached isdetached) {
        this.d = isdetached;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment;
        final isRemoving isremoving;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.d);
        }
        boolean equals = "fragment".equals(str);
        Fragment fragment2 = null;
        if (!equals) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getSharedElementSourceNames.RemoteActionCompatParcelizer.e);
        String str2 = attributeValue;
        if (attributeValue == null) {
            str2 = obtainStyledAttributes.getString(getSharedElementSourceNames.RemoteActionCompatParcelizer.f);
        }
        int resourceId = obtainStyledAttributes.getResourceId(getSharedElementSourceNames.RemoteActionCompatParcelizer.i, -1);
        String string = obtainStyledAttributes.getString(getSharedElementSourceNames.RemoteActionCompatParcelizer.h);
        obtainStyledAttributes.recycle();
        if (str2 == null || !hasOptionsMenu.e(context.getClassLoader(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (resourceId != -1) {
            fragment2 = this.d.findFragmentById(resourceId);
        }
        Fragment fragment3 = fragment2;
        if (fragment2 == null) {
            fragment3 = fragment2;
            if (string != null) {
                fragment3 = this.d.findFragmentByTag(string);
            }
        }
        Fragment fragment4 = fragment3;
        if (fragment3 == null) {
            fragment4 = fragment3;
            if (id != -1) {
                fragment4 = this.d.findFragmentById(id);
            }
        }
        if (fragment4 == null) {
            Fragment d = this.d.o().d(context.getClassLoader(), str2);
            d.mFromLayout = true;
            d.mFragmentId = resourceId != 0 ? resourceId : id;
            d.mContainerId = id;
            d.mTag = string;
            d.mInLayout = true;
            d.mFragmentManager = this.d;
            d.mHost = this.d.f;
            d.onInflate(this.d.f.c, attributeSet, d.mSavedFragmentState);
            isRemoving b = this.d.b(d);
            fragment = d;
            isremoving = b;
            if (isDetached.a(2)) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(d);
                sb2.append(" has been inflated via the <fragment> tag: id=0x");
                sb2.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb2.toString());
                fragment = d;
                isremoving = b;
            }
        } else if (!fragment4.mInLayout) {
            fragment4.mInLayout = true;
            fragment4.mFragmentManager = this.d;
            fragment4.mHost = this.d.f;
            fragment4.onInflate(this.d.f.c, attributeSet, fragment4.mSavedFragmentState);
            isRemoving j = this.d.j(fragment4);
            fragment = fragment4;
            isremoving = j;
            if (isDetached.a(2)) {
                StringBuilder sb3 = new StringBuilder("Retained Fragment ");
                sb3.append(fragment4);
                sb3.append(" has been re-attached via the <fragment> tag: id=0x");
                sb3.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb3.toString());
                isremoving = j;
                fragment = fragment4;
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(attributeSet.getPositionDescription());
            sb4.append(": Duplicate id 0x");
            sb4.append(Integer.toHexString(resourceId));
            sb4.append(", tag ");
            sb4.append(string);
            sb4.append(", or parent id 0x");
            sb4.append(Integer.toHexString(id));
            sb4.append(" with another fragment for ");
            sb4.append(str2);
            throw new IllegalArgumentException(sb4.toString());
        }
        fragment.mContainer = (ViewGroup) view;
        isremoving.m();
        isremoving.n();
        if (fragment.mView != null) {
            if (resourceId != 0) {
                fragment.mView.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            fragment.mView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: o.isHidden.2
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    Fragment fragment5 = isremoving.e;
                    isremoving.m();
                    onContextItemSelected.b((ViewGroup) fragment5.mView.getParent(), isHidden.this.d.s()).b();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                }
            });
            return fragment.mView;
        }
        StringBuilder sb5 = new StringBuilder("Fragment ");
        sb5.append(str2);
        sb5.append(" did not create a view.");
        throw new IllegalStateException(sb5.toString());
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
