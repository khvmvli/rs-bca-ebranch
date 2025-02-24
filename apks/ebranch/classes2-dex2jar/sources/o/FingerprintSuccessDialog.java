package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import o.BaseDialogKotlin;
import o.setCustomSelectionActionModeCallback;
import o.setHasDecor;
import o.setWeightSum;
/* loaded from: classes2-dex2jar.jar:o/FingerprintSuccessDialog.class */
public class FingerprintSuccessDialog extends FingerprintSuccessDialog_ViewBinding implements setCustomSelectionActionModeCallback.read {
    private static final int[] h = {16842912};
    boolean c;
    boolean d;
    FrameLayout e;
    final CheckedTextView f;
    ColorStateList g;
    private final onDismiss i;
    setExpandActivityOverflowButtonDrawable j;
    private boolean l;
    private int m;
    private Drawable n;

    public FingerprintSuccessDialog(Context context) {
        this(context, null);
    }

    public FingerprintSuccessDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FingerprintSuccessDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass3 r0 = new onDismiss() { // from class: o.FingerprintSuccessDialog.3
            public final void b(View view, getChildFragmentManager getchildfragmentmanager) {
                b(view, getchildfragmentmanager);
                getchildfragmentmanager.c(FingerprintSuccessDialog.this.d);
            }
        };
        this.i = r0;
        setOrientation(0);
        LayoutInflater.from(context).inflate(BaseDialogKotlin$MediaBrowserCompat$MediaItem.k, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(BaseDialogKotlin.read.c));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.j);
        this.f = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        findFragmentByWho.d(checkedTextView, r0);
    }

    public final setExpandActivityOverflowButtonDrawable a() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        StateListDrawable stateListDrawable;
        this.j = setexpandactivityoverflowbuttondrawable;
        if (setexpandactivityoverflowbuttondrawable.getItemId() > 0) {
            setId(setexpandactivityoverflowbuttondrawable.getItemId());
        }
        setVisibility(setexpandactivityoverflowbuttondrawable.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(setHasDecor.MediaBrowserCompat.CustomActionResultReceiver.v, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(h, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            findFragmentByWho.b(this, stateListDrawable);
        }
        setCheckable(setexpandactivityoverflowbuttondrawable.isCheckable());
        setChecked(setexpandactivityoverflowbuttondrawable.isChecked());
        setEnabled(setexpandactivityoverflowbuttondrawable.isEnabled());
        setTitle(setexpandactivityoverflowbuttondrawable.getTitle());
        setIcon(setexpandactivityoverflowbuttondrawable.getIcon());
        View actionView = setexpandactivityoverflowbuttondrawable.getActionView();
        if (actionView != null) {
            if (this.e == null) {
                this.e = (FrameLayout) ((ViewStub) findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.f)).inflate();
            }
            this.e.removeAllViews();
            this.e.addView(actionView);
        }
        setContentDescription(setexpandactivityoverflowbuttondrawable.getContentDescription());
        setOnSearchClickListener.b(this, setexpandactivityoverflowbuttondrawable.getTooltipText());
        if (!(this.j.getTitle() == null && this.j.getIcon() == null && this.j.getActionView() != null)) {
            z = false;
        }
        if (z) {
            this.f.setVisibility(8);
            FrameLayout frameLayout = this.e;
            if (frameLayout != null) {
                ViewGroup.LayoutParams layoutParams = (setWeightSum.IconCompatParcelizer) frameLayout.getLayoutParams();
                ((setWeightSum.IconCompatParcelizer) layoutParams).width = -1;
                this.e.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f.setVisibility(0);
        FrameLayout frameLayout2 = this.e;
        if (frameLayout2 != null) {
            ViewGroup.LayoutParams layoutParams2 = (setWeightSum.IconCompatParcelizer) frameLayout2.getLayoutParams();
            ((setWeightSum.IconCompatParcelizer) layoutParams2).width = -2;
            this.e.setLayoutParams(layoutParams2);
        }
    }

    public final boolean e() {
        return false;
    }

    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = onCreateDrawableState(i + 1);
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = this.j;
        if (setexpandactivityoverflowbuttondrawable != null && setexpandactivityoverflowbuttondrawable.isCheckable() && this.j.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, h);
        }
        return onCreateDrawableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.d != z) {
            this.d = z;
            this.i.b(this.f, 2048);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f.setChecked(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            Drawable drawable2 = drawable;
            if (this.c) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable2 = getInsetsForType.h(drawable).mutate();
                getInsetsForType.e(drawable2, this.g);
            }
            int i = this.m;
            drawable2.setBounds(0, 0, i, i);
            drawable = drawable2;
        } else if (this.l) {
            if (this.n == null) {
                Drawable a = inset.a(getResources(), BaseDialogKotlin.IconCompatParcelizer.h, getContext().getTheme());
                this.n = a;
                if (a != null) {
                    int i2 = this.m;
                    a.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.n;
        }
        getParentFragment.c(this.f, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.m = i;
    }

    public void setMaxLines(int i) {
        this.f.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.l = z;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        getParentFragment.e(this.f, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f.setText(charSequence);
    }
}
