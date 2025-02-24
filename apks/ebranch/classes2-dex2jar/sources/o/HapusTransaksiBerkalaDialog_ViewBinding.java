package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import o.BaseDialogKotlin;
import o.setHasDecor;
/* loaded from: classes2-dex2jar.jar:o/HapusTransaksiBerkalaDialog_ViewBinding.class */
public class HapusTransaksiBerkalaDialog_ViewBinding extends FullAmountDialog_ViewBinding {
    RemoteActionCompatParcelizer b;
    final int[] c;
    final FiturReservasiGuestDialog_ViewBinding e;
    private final int g;
    private final FiturReservasiGuestDialog j;
    private MenuInflater m;
    private ViewTreeObserver.OnGlobalLayoutListener n;
    private static final int[] h = {16842912};
    private static final int[] i = {-16842910};
    private static final int f = BaseDialogKotlin.MediaDescriptionCompat.g;

    /* loaded from: classes2-dex2jar.jar:o/HapusTransaksiBerkalaDialog_ViewBinding$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        boolean a();
    }

    /* loaded from: classes2-dex2jar.jar:o/HapusTransaksiBerkalaDialog_ViewBinding$read.class */
    public static final class read extends getPopEnterAnim {
        public static final Parcelable.Creator<read> CREATOR = new Parcelable.ClassLoaderCreator<read>() { // from class: o.HapusTransaksiBerkalaDialog_ViewBinding.read.5
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new read(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ read createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new read(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new read[i];
            }
        };
        public Bundle a;

        public read(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readBundle(classLoader);
        }

        public read(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
            parcel.writeBundle(this.a);
        }
    }

    public HapusTransaksiBerkalaDialog_ViewBinding(Context context) {
        this(context, null);
    }

    public HapusTransaksiBerkalaDialog_ViewBinding(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.E);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0200  */
    /* JADX WARN: Type inference failed for: r0v100, types: [o.FiturSignUpDialog, android.view.View] */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.view.Menu, o.FiturReservasiGuestDialog] */
    /* JADX WARN: Type inference failed for: r3v15, types: [o.FiturSignUpDialog, android.view.ViewGroup] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public HapusTransaksiBerkalaDialog_ViewBinding(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
        // Method dump skipped, instructions count: 1216
        */
        throw new UnsupportedOperationException("Method not decompiled: o.HapusTransaksiBerkalaDialog_ViewBinding.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList e(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList b = setPrimaryBackground.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(setHasDecor.MediaBrowserCompat.CustomActionResultReceiver.x, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = b.getDefaultColor();
        int[] iArr = i;
        return new ColorStateList(new int[][]{iArr, h, EMPTY_STATE_SET}, new int[]{b.getColorForState(iArr, defaultColor), i3, defaultColor});
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [o.FiturSignUpDialog, android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // o.FullAmountDialog_ViewBinding
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void c(androidx.core.view.WindowInsetsCompat r7) {
        /*
            r6 = this;
            r0 = r6
            o.FiturReservasiGuestDialog_ViewBinding r0 = r0.e
            r8 = r0
            r0 = r7
            int r0 = r0.h()
            r9 = r0
            r0 = r8
            int r0 = r0.t
            r1 = r9
            if (r0 == r1) goto L_0x001b
            r0 = r8
            r1 = r9
            r0.t = r1
            r0 = r8
            r0.c()
        L_0x001b:
            r0 = r8
            o.FiturSignUpDialog r0 = r0.k
            r10 = r0
            r0 = r10
            r1 = 0
            r2 = r10
            int r2 = r2.getPaddingTop()
            r3 = 0
            r4 = r7
            int r4 = r4.j()
            r0.setPadding(r1, r2, r3, r4)
            r0 = r8
            android.widget.LinearLayout r0 = r0.d
            r1 = r7
            androidx.core.view.WindowInsetsCompat r0 = o.findFragmentByWho.c(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.HapusTransaksiBerkalaDialog_ViewBinding.c(androidx.core.view.WindowInsetsCompat):void");
    }

    @Override // o.FullAmountDialog_ViewBinding, android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof JenisKodeBankDialog) {
            JenisKodeBankDialog jenisKodeBankDialog = (JenisKodeBankDialog) background;
            if (jenisKodeBankDialog.l()) {
                jenisKodeBankDialog.n(HaloBCADialog.c(this));
            }
        }
    }

    @Override // o.FullAmountDialog_ViewBinding, android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.n);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.g), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.g, 1073741824);
        }
        onMeasure(i2, i3);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof read)) {
            onRestoreInstanceState(parcelable);
            return;
        }
        read read2 = (read) parcelable;
        onRestoreInstanceState(((getPopEnterAnim) read2).d);
        FiturReservasiGuestDialog fiturReservasiGuestDialog = this.j;
        SparseArray sparseParcelableArray = read2.a.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !((setOnDismissListener) fiturReservasiGuestDialog).s.isEmpty()) {
            Iterator it = ((setOnDismissListener) fiturReservasiGuestDialog).s.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                setDropDownBackgroundResource setdropdownbackgroundresource = (setDropDownBackgroundResource) weakReference.get();
                if (setdropdownbackgroundresource == null) {
                    ((setOnDismissListener) fiturReservasiGuestDialog).s.remove(weakReference);
                } else {
                    int a = setdropdownbackgroundresource.a();
                    if (a > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(a)) != null) {
                        setdropdownbackgroundresource.b(parcelable2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, o.HapusTransaksiBerkalaDialog_ViewBinding$read] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected android.os.Parcelable onSaveInstanceState() {
        /*
            r4 = this;
            o.HapusTransaksiBerkalaDialog_ViewBinding$read r0 = new o.HapusTransaksiBerkalaDialog_ViewBinding$read
            r1 = r0
            r2 = r4
            android.os.Parcelable r2 = r2.onSaveInstanceState()
            r1.<init>(r2)
            r5 = r0
            r0 = r5
            android.os.Bundle r1 = new android.os.Bundle
            r2 = r1
            r2.<init>()
            r0.a = r1
            r0 = r4
            o.FiturReservasiGuestDialog r0 = r0.j
            r1 = r5
            android.os.Bundle r1 = r1.a
            r0.a(r1)
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.HapusTransaksiBerkalaDialog_ViewBinding.onSaveInstanceState():android.os.Parcelable");
    }

    public void setCheckedItem(int i2) {
        setExpandActivityOverflowButtonDrawable findItem = this.j.findItem(i2);
        if (findItem != null) {
            this.e.a.c(findItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        setExpandActivityOverflowButtonDrawable findItem = this.j.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.e.a.c(findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof JenisKodeBankDialog) {
            ((JenisKodeBankDialog) background).l(f2);
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.e.e(drawable);
    }

    public void setItemBackgroundResource(int i2) {
        setItemBackground(copyWindowDataInto.b(getContext(), i2));
    }

    public void setItemHorizontalPadding(int i2) {
        this.e.a(i2);
    }

    public void setItemHorizontalPaddingResource(int i2) {
        this.e.a(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconPadding(int i2) {
        this.e.c(i2);
    }

    public void setItemIconPaddingResource(int i2) {
        this.e.c(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconSize(int i2) {
        this.e.e(i2);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.e.b(colorStateList);
    }

    public void setItemMaxLines(int i2) {
        this.e.d(i2);
    }

    public void setItemTextAppearance(int i2) {
        this.e.b(i2);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.e.e(colorStateList);
    }

    public void setNavigationItemSelectedListener(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.b = remoteActionCompatParcelizer;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i2) {
        setOverScrollMode(i2);
        FiturReservasiGuestDialog_ViewBinding fiturReservasiGuestDialog_ViewBinding = this.e;
        if (fiturReservasiGuestDialog_ViewBinding != null) {
            fiturReservasiGuestDialog_ViewBinding.p = i2;
            FiturSignUpDialog fiturSignUpDialog = fiturReservasiGuestDialog_ViewBinding.k;
            if (fiturSignUpDialog != null) {
                fiturSignUpDialog.setOverScrollMode(i2);
            }
        }
    }
}
