package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o.setBackgroundResource;
import o.setDropDownBackgroundResource;
import o.setOnDismissListener;
/* loaded from: classes-dex2jar.jar:o/setInputType.class */
public class setInputType extends ViewGroup {
    private int A;
    private Context B;
    private int C;
    private setButtonDrawable D;
    private final int[] E;
    private int F;
    private TextView G;
    private ColorStateList H;
    private final ArrayList<View> I;
    private int J;
    private int K;
    private ColorStateList L;
    private int M;
    private int N;
    private TextView R;
    View a;
    final ArrayList<View> b;
    RemoteActionCompatParcelizer c;
    int d;
    ImageButton e;
    public CharSequence f;
    public ImageButton g;
    public CharSequence h;
    IconCompatParcelizer i;
    setSupportCompoundDrawablesTintMode j;
    private setDropDownBackgroundResource.IconCompatParcelizer k;
    private boolean l;
    private CharSequence m;
    public setQuery n;

    /* renamed from: o */
    private Drawable f238o;
    private boolean p;
    private setIconified q;
    private int r;
    private boolean s;
    private int t;
    private int u;
    private final setSupportCompoundDrawablesTintMode$MediaBrowserCompat$CustomActionResultReceiver v;
    private int w;
    private ImageView x;
    private setOnDismissListener.RemoteActionCompatParcelizer y;
    private final Runnable z;

    /* loaded from: classes-dex2jar.jar:o/setInputType$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        boolean b(MenuItem menuItem);
    }

    /* loaded from: classes-dex2jar.jar:o/setInputType$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer implements setDropDownBackgroundResource {
        setExpandActivityOverflowButtonDrawable d;
        setOnDismissListener e;

        RemoteActionCompatParcelizer() {
            setInputType.this = r4;
        }

        @Override // o.setDropDownBackgroundResource
        public final int a() {
            return 0;
        }

        @Override // o.setDropDownBackgroundResource
        public final boolean a(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
            setInputType.this.a();
            ViewParent parent = setInputType.this.e.getParent();
            setInputType setinputtype = setInputType.this;
            if (parent != setinputtype) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(setinputtype.e);
                }
                setInputType setinputtype2 = setInputType.this;
                setinputtype2.addView(setinputtype2.e);
            }
            setInputType.this.a = setexpandactivityoverflowbuttondrawable.getActionView();
            this.d = setexpandactivityoverflowbuttondrawable;
            ViewParent parent2 = setInputType.this.a.getParent();
            setInputType setinputtype3 = setInputType.this;
            if (parent2 != setinputtype3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(setinputtype3.a);
                }
                setInputType$MediaBrowserCompat$CustomActionResultReceiver v_ = setInputType.v_();
                v_.a = (setInputType.this.d & 112) | 8388611;
                v_.e = 2;
                setInputType.this.a.setLayoutParams(v_);
                setInputType setinputtype4 = setInputType.this;
                setinputtype4.addView(setinputtype4.a);
            }
            setInputType setinputtype5 = setInputType.this;
            for (int childCount = setinputtype5.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = setinputtype5.getChildAt(childCount);
                if (!(((setInputType$MediaBrowserCompat$CustomActionResultReceiver) childAt.getLayoutParams()).e == 2 || childAt == setinputtype5.j)) {
                    setinputtype5.removeViewAt(childCount);
                    setinputtype5.b.add(childAt);
                }
            }
            setInputType.this.requestLayout();
            setexpandactivityoverflowbuttondrawable.d = true;
            setexpandactivityoverflowbuttondrawable.a.e(false);
            if (!(setInputType.this.a instanceof setMenu)) {
                return true;
            }
            ((setMenu) setInputType.this.a).e();
            return true;
        }

        @Override // o.setDropDownBackgroundResource
        public final boolean a(setTextAppearance settextappearance) {
            return false;
        }

        @Override // o.setDropDownBackgroundResource
        public final void b(Parcelable parcelable) {
        }

        @Override // o.setDropDownBackgroundResource
        public final void c(setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer) {
        }

        @Override // o.setDropDownBackgroundResource
        public final void c(boolean z) {
            if (this.d != null) {
                setOnDismissListener setondismisslistener = this.e;
                boolean z2 = false;
                if (setondismisslistener != null) {
                    int size = setondismisslistener.size();
                    int i = 0;
                    while (true) {
                        z2 = false;
                        if (i >= size) {
                            break;
                        } else if (this.e.getItem(i) == this.d) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    c(this.d);
                }
            }
        }

        @Override // o.setDropDownBackgroundResource
        public final boolean c(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
            if (setInputType.this.a instanceof setMenu) {
                ((setMenu) setInputType.this.a).c();
            }
            setInputType setinputtype = setInputType.this;
            setinputtype.removeView(setinputtype.a);
            setInputType setinputtype2 = setInputType.this;
            setinputtype2.removeView(setinputtype2.e);
            setInputType.this.a = null;
            setInputType setinputtype3 = setInputType.this;
            for (int size = setinputtype3.b.size() - 1; size >= 0; size--) {
                setinputtype3.addView(setinputtype3.b.get(size));
            }
            setinputtype3.b.clear();
            this.d = null;
            setInputType.this.requestLayout();
            setexpandactivityoverflowbuttondrawable.d = false;
            setexpandactivityoverflowbuttondrawable.a.e(false);
            return true;
        }

        @Override // o.setDropDownBackgroundResource
        public final void e(Context context, setOnDismissListener setondismisslistener) {
            setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable;
            setOnDismissListener setondismisslistener2 = this.e;
            if (!(setondismisslistener2 == null || (setexpandactivityoverflowbuttondrawable = this.d) == null)) {
                setondismisslistener2.d(setexpandactivityoverflowbuttondrawable);
            }
            this.e = setondismisslistener;
        }

        @Override // o.setDropDownBackgroundResource
        public final void e(setOnDismissListener setondismisslistener, boolean z) {
        }

        @Override // o.setDropDownBackgroundResource
        public final boolean e() {
            return false;
        }

        @Override // o.setDropDownBackgroundResource
        public final Parcelable i() {
            return null;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setInputType$write.class */
    public static final class write extends getPopEnterAnim {
        public static final Parcelable.Creator<write> CREATOR = new Parcelable.ClassLoaderCreator<write>() { // from class: o.setInputType.write.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new write(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ write createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new write(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new write[i];
            }
        };
        boolean c;
        int e;

        public write(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.e = parcel.readInt();
            this.c = parcel.readInt() != 0;
        }

        public write(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // o.getPopEnterAnim, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
            parcel.writeInt(this.e);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public setInputType(Context context) {
        this(context, null);
    }

    public setInputType(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.S);
    }

    public setInputType(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = 8388627;
        this.I = new ArrayList<>();
        this.b = new ArrayList<>();
        this.E = new int[2];
        this.v = new setSupportCompoundDrawablesTintMode$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setInputType.1
            @Override // o.setSupportCompoundDrawablesTintMode$MediaBrowserCompat$CustomActionResultReceiver
            public final boolean c(MenuItem menuItem) {
                if (setInputType.this.i != null) {
                    return setInputType.this.i.b(menuItem);
                }
                return false;
            }
        };
        this.z = new Runnable() { // from class: o.setInputType.5
            @Override // java.lang.Runnable
            public final void run() {
                setInputType.this.i();
            }
        };
        Context context2 = getContext();
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context2, context2.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.ds, i, 0));
        findFragmentByWho.e(this, context, setHasDecor$MediaBrowserCompat$MediaItem.ds, attributeSet, seticonifiedbydefault.d, i, 0);
        this.J = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.dZ, 0);
        this.C = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.dL, 0);
        this.w = seticonifiedbydefault.d.getInteger(setHasDecor$MediaBrowserCompat$MediaItem.dr, this.w);
        this.d = seticonifiedbydefault.d.getInteger(setHasDecor$MediaBrowserCompat$MediaItem.dx, 48);
        int dimensionPixelOffset = seticonifiedbydefault.d.getDimensionPixelOffset(setHasDecor$MediaBrowserCompat$MediaItem.dQ, 0);
        int i2 = dimensionPixelOffset;
        if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.dX)) {
            i2 = seticonifiedbydefault.d.getDimensionPixelOffset(setHasDecor$MediaBrowserCompat$MediaItem.dX, dimensionPixelOffset);
        }
        this.F = i2;
        this.M = i2;
        this.K = i2;
        this.N = i2;
        int dimensionPixelOffset2 = seticonifiedbydefault.d.getDimensionPixelOffset(setHasDecor$MediaBrowserCompat$MediaItem.dU, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.N = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = seticonifiedbydefault.d.getDimensionPixelOffset(setHasDecor$MediaBrowserCompat$MediaItem.dS, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.K = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = seticonifiedbydefault.d.getDimensionPixelOffset(setHasDecor$MediaBrowserCompat$MediaItem.dR, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.M = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = seticonifiedbydefault.d.getDimensionPixelOffset(setHasDecor$MediaBrowserCompat$MediaItem.dT, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.F = dimensionPixelOffset5;
        }
        this.u = seticonifiedbydefault.d.getDimensionPixelSize(setHasDecor$MediaBrowserCompat$MediaItem.dI, -1);
        int dimensionPixelOffset6 = seticonifiedbydefault.d.getDimensionPixelOffset(setHasDecor$MediaBrowserCompat$MediaItem.dF, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = seticonifiedbydefault.d.getDimensionPixelOffset(setHasDecor$MediaBrowserCompat$MediaItem.dw, Integer.MIN_VALUE);
        int dimensionPixelSize = seticonifiedbydefault.d.getDimensionPixelSize(setHasDecor$MediaBrowserCompat$MediaItem.dC, 0);
        int dimensionPixelSize2 = seticonifiedbydefault.d.getDimensionPixelSize(setHasDecor$MediaBrowserCompat$MediaItem.dE, 0);
        if (this.q == null) {
            this.q = new setIconified();
        }
        this.q.b(dimensionPixelSize, dimensionPixelSize2);
        if (!(dimensionPixelOffset6 == Integer.MIN_VALUE && dimensionPixelOffset7 == Integer.MIN_VALUE)) {
            this.q.d(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.r = seticonifiedbydefault.d.getDimensionPixelOffset(setHasDecor$MediaBrowserCompat$MediaItem.dB, Integer.MIN_VALUE);
        this.t = seticonifiedbydefault.d.getDimensionPixelOffset(setHasDecor$MediaBrowserCompat$MediaItem.dA, Integer.MIN_VALUE);
        this.f238o = seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.dz);
        this.m = seticonifiedbydefault.d.getText(setHasDecor$MediaBrowserCompat$MediaItem.dy);
        CharSequence text = seticonifiedbydefault.d.getText(setHasDecor$MediaBrowserCompat$MediaItem.dM);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = seticonifiedbydefault.d.getText(setHasDecor$MediaBrowserCompat$MediaItem.dP);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.B = getContext();
        setPopupTheme(seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.dO, 0));
        Drawable d = seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.dH);
        if (d != null) {
            setNavigationIcon(d);
        }
        CharSequence text3 = seticonifiedbydefault.d.getText(setHasDecor$MediaBrowserCompat$MediaItem.dJ);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable d2 = seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.dD);
        if (d2 != null) {
            setLogo(d2);
        }
        CharSequence text4 = seticonifiedbydefault.d.getText(setHasDecor$MediaBrowserCompat$MediaItem.dK);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.dY)) {
            setTitleTextColor(seticonifiedbydefault.e(setHasDecor$MediaBrowserCompat$MediaItem.dY));
        }
        if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.dN)) {
            setSubtitleTextColor(seticonifiedbydefault.e(setHasDecor$MediaBrowserCompat$MediaItem.dN));
        }
        if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.dG)) {
            int resourceId = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.dG, 0);
            setUiOptions setuioptions = new setUiOptions(getContext());
            h();
            setuioptions.inflate(resourceId, this.j.b());
        }
        seticonifiedbydefault.d.recycle();
    }

    private void a(List<View> list, int i) {
        boolean z = findFragmentByWho.k(this) == 1;
        int childCount = getChildCount();
        int c = onGetLayoutInflater.c(i, findFragmentByWho.k(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                setInputType$MediaBrowserCompat$CustomActionResultReceiver setinputtype_mediabrowsercompat_customactionresultreceiver = (setInputType$MediaBrowserCompat$CustomActionResultReceiver) childAt.getLayoutParams();
                if (setinputtype_mediabrowsercompat_customactionresultreceiver.e == 0) {
                    if (((childAt == null || childAt.getParent() != this || childAt.getVisibility() == 8) ? false : true) && d(setinputtype_mediabrowsercompat_customactionresultreceiver.a) == c) {
                        list.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            setInputType$MediaBrowserCompat$CustomActionResultReceiver setinputtype_mediabrowsercompat_customactionresultreceiver2 = (setInputType$MediaBrowserCompat$CustomActionResultReceiver) childAt2.getLayoutParams();
            if (setinputtype_mediabrowsercompat_customactionresultreceiver2.e == 0) {
                if (((childAt2 == null || childAt2.getParent() != this || childAt2.getVisibility() == 8) ? false : true) && d(setinputtype_mediabrowsercompat_customactionresultreceiver2.a) == c) {
                    list.add(childAt2);
                }
            }
        }
    }

    private int b(View view, int i) {
        int i2;
        setInputType$MediaBrowserCompat$CustomActionResultReceiver setinputtype_mediabrowsercompat_customactionresultreceiver = (setInputType$MediaBrowserCompat$CustomActionResultReceiver) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i4 = setinputtype_mediabrowsercompat_customactionresultreceiver.a & 112;
        int i5 = i4;
        if (i4 != 16) {
            i5 = i4;
            if (i4 != 48) {
                i5 = i4;
                if (i4 != 80) {
                    i5 = this.w & 112;
                }
            }
        }
        if (i5 == 48) {
            return getPaddingTop() - i3;
        }
        if (i5 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - setinputtype_mediabrowsercompat_customactionresultreceiver.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i6 < setinputtype_mediabrowsercompat_customactionresultreceiver.topMargin) {
            i2 = setinputtype_mediabrowsercompat_customactionresultreceiver.topMargin;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
            i2 = i6;
            if (i7 < setinputtype_mediabrowsercompat_customactionresultreceiver.bottomMargin) {
                i2 = Math.max(0, i6 - (setinputtype_mediabrowsercompat_customactionresultreceiver.bottomMargin - i7));
            }
        }
        return paddingTop + i2;
    }

    private int b(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private int b(View view, int i, int[] iArr, int i2) {
        setInputType$MediaBrowserCompat$CustomActionResultReceiver setinputtype_mediabrowsercompat_customactionresultreceiver = (setInputType$MediaBrowserCompat$CustomActionResultReceiver) view.getLayoutParams();
        int i3 = setinputtype_mediabrowsercompat_customactionresultreceiver.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int b = b(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, b, max + measuredWidth, view.getMeasuredHeight() + b);
        return max + measuredWidth + setinputtype_mediabrowsercompat_customactionresultreceiver.rightMargin;
    }

    private void b(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        int i6 = childMeasureSpec2;
        if (mode != 1073741824) {
            i6 = childMeasureSpec2;
            if (i5 >= 0) {
                int i7 = i5;
                if (mode != 0) {
                    i7 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
                }
                i6 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
            }
        }
        view.measure(childMeasureSpec, i6);
    }

    private int c(View view, int i, int[] iArr, int i2) {
        setInputType$MediaBrowserCompat$CustomActionResultReceiver setinputtype_mediabrowsercompat_customactionresultreceiver = (setInputType$MediaBrowserCompat$CustomActionResultReceiver) view.getLayoutParams();
        int i3 = setinputtype_mediabrowsercompat_customactionresultreceiver.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int b = b(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, b, max, view.getMeasuredHeight() + b);
        return max - (measuredWidth + setinputtype_mediabrowsercompat_customactionresultreceiver.leftMargin);
    }

    private int d(int i) {
        int k = findFragmentByWho.k(this);
        int c = onGetLayoutInflater.c(i, k) & 7;
        if (c != 1) {
            int i2 = 3;
            if (!(c == 3 || c == 5)) {
                if (k == 1) {
                    i2 = 5;
                }
                return i2;
            }
        }
        return c;
    }

    private void d(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        setInputType$MediaBrowserCompat$CustomActionResultReceiver setinputtype_mediabrowsercompat_customactionresultreceiver = layoutParams == null ? new setInputType$MediaBrowserCompat$CustomActionResultReceiver(-2, -2) : !checkLayoutParams(layoutParams) ? e(layoutParams) : (setInputType$MediaBrowserCompat$CustomActionResultReceiver) layoutParams;
        setinputtype_mediabrowsercompat_customactionresultreceiver.e = 1;
        if (!z || this.a == null) {
            addView(view, setinputtype_mediabrowsercompat_customactionresultreceiver);
            return;
        }
        view.setLayoutParams(setinputtype_mediabrowsercompat_customactionresultreceiver);
        this.b.add(view);
    }

    private static setInputType$MediaBrowserCompat$CustomActionResultReceiver e(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof setInputType$MediaBrowserCompat$CustomActionResultReceiver ? new setInputType$MediaBrowserCompat$CustomActionResultReceiver((setInputType$MediaBrowserCompat$CustomActionResultReceiver) layoutParams) : layoutParams instanceof setBackgroundResource.IconCompatParcelizer ? new setInputType$MediaBrowserCompat$CustomActionResultReceiver((setBackgroundResource.IconCompatParcelizer) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new setInputType$MediaBrowserCompat$CustomActionResultReceiver((ViewGroup.MarginLayoutParams) layoutParams) : new setInputType$MediaBrowserCompat$CustomActionResultReceiver(layoutParams);
    }

    private void f() {
        if (this.j == null) {
            setSupportCompoundDrawablesTintMode setsupportcompounddrawablestintmode = new setSupportCompoundDrawablesTintMode(getContext());
            this.j = setsupportcompounddrawablestintmode;
            setsupportcompounddrawablestintmode.setPopupTheme(this.A);
            this.j.setOnMenuItemClickListener(this.v);
            this.j.setMenuCallbacks(this.k, this.y);
            setInputType$MediaBrowserCompat$CustomActionResultReceiver setinputtype_mediabrowsercompat_customactionresultreceiver = new setInputType$MediaBrowserCompat$CustomActionResultReceiver(-2, -2);
            setinputtype_mediabrowsercompat_customactionresultreceiver.a = (this.d & 112) | 8388613;
            this.j.setLayoutParams(setinputtype_mediabrowsercompat_customactionresultreceiver);
            d(this.j, false);
        }
    }

    private void h() {
        f();
        if (this.j.e == null) {
            setOnDismissListener setondismisslistener = (setOnDismissListener) this.j.b();
            if (this.c == null) {
                this.c = new RemoteActionCompatParcelizer();
            }
            this.j.setExpandedActionViewsExclusive(true);
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.c;
            Context context = this.B;
            setondismisslistener.s.add(new WeakReference<>(remoteActionCompatParcelizer));
            remoteActionCompatParcelizer.e(context, setondismisslistener);
            setondismisslistener.i = true;
        }
    }

    private int k() {
        setOnDismissListener setondismisslistener;
        setSupportCompoundDrawablesTintMode setsupportcompounddrawablestintmode = this.j;
        return setsupportcompounddrawablestintmode != null && (setondismisslistener = setsupportcompounddrawablestintmode.e) != null && setondismisslistener.hasVisibleItems() ? Math.max(l(), Math.max(this.t, 0)) : l();
    }

    private int l() {
        setIconified seticonified = this.q;
        return seticonified != null ? seticonified.a ? seticonified.i : seticonified.f : 0;
    }

    private void m() {
        if (this.g == null) {
            this.g = new setPopupBackgroundResource(getContext(), null, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.Q);
            setInputType$MediaBrowserCompat$CustomActionResultReceiver setinputtype_mediabrowsercompat_customactionresultreceiver = new setInputType$MediaBrowserCompat$CustomActionResultReceiver(-2, -2);
            setinputtype_mediabrowsercompat_customactionresultreceiver.a = (this.d & 112) | 8388611;
            this.g.setLayoutParams(setinputtype_mediabrowsercompat_customactionresultreceiver);
        }
    }

    private int n() {
        setIconified seticonified = this.q;
        return seticonified != null ? seticonified.a ? seticonified.f : seticonified.i : 0;
    }

    private int o() {
        ImageButton imageButton = this.g;
        return (imageButton != null ? imageButton.getDrawable() : null) != null ? Math.max(n(), Math.max(this.r, 0)) : n();
    }

    protected static setInputType$MediaBrowserCompat$CustomActionResultReceiver v_() {
        return new setInputType$MediaBrowserCompat$CustomActionResultReceiver(-2, -2);
    }

    final void a() {
        if (this.e == null) {
            setPopupBackgroundResource setpopupbackgroundresource = new setPopupBackgroundResource(getContext(), null, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.Q);
            this.e = setpopupbackgroundresource;
            setpopupbackgroundresource.setImageDrawable(this.f238o);
            this.e.setContentDescription(this.m);
            setInputType$MediaBrowserCompat$CustomActionResultReceiver setinputtype_mediabrowsercompat_customactionresultreceiver = new setInputType$MediaBrowserCompat$CustomActionResultReceiver(-2, -2);
            setinputtype_mediabrowsercompat_customactionresultreceiver.a = (this.d & 112) | 8388611;
            setinputtype_mediabrowsercompat_customactionresultreceiver.e = 2;
            this.e.setLayoutParams(setinputtype_mediabrowsercompat_customactionresultreceiver);
            this.e.setOnClickListener(new View.OnClickListener() { // from class: o.setInputType.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = setInputType.this.c;
                    setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = remoteActionCompatParcelizer == null ? null : remoteActionCompatParcelizer.d;
                    if (setexpandactivityoverflowbuttondrawable != null) {
                        setexpandactivityoverflowbuttondrawable.collapseActionView();
                    }
                }
            });
        }
    }

    public final CharSequence b() {
        return this.h;
    }

    public final void b(int i) {
        setUiOptions setuioptions = new setUiOptions(getContext());
        h();
        setuioptions.inflate(i, this.j.b());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return checkLayoutParams(layoutParams) && (layoutParams instanceof setInputType$MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final Drawable d() {
        ImageButton imageButton = this.g;
        return imageButton != null ? imageButton.getDrawable() : null;
    }

    public final Menu e() {
        h();
        return this.j.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        if ((r0 != null && r0.c()) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean g() {
        /*
            r2 = this;
            r0 = r2
            o.setSupportCompoundDrawablesTintMode r0 = r0.j
            r3 = r0
            r0 = 1
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0029
            r0 = r3
            o.setButtonDrawable r0 = r0.b
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0020
            r0 = r3
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0020
            r0 = 1
            r5 = r0
            goto L_0x0022
        L_0x0020:
            r0 = 0
            r5 = r0
        L_0x0022:
            r0 = r5
            if (r0 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r0 = 0
            r4 = r0
        L_0x002b:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setInputType.g():boolean");
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new setInputType$MediaBrowserCompat$CustomActionResultReceiver(-2, -2);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new setInputType$MediaBrowserCompat$CustomActionResultReceiver(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return e(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        if ((r0 != null && r0.f()) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean i() {
        /*
            r2 = this;
            r0 = r2
            o.setSupportCompoundDrawablesTintMode r0 = r0.j
            r3 = r0
            r0 = 1
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0029
            r0 = r3
            o.setButtonDrawable r0 = r0.b
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0020
            r0 = r3
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0020
            r0 = 1
            r5 = r0
            goto L_0x0022
        L_0x0020:
            r0 = 0
            r5 = r0
        L_0x0022:
            r0 = r5
            if (r0 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r0 = 0
            r4 = r0
        L_0x002b:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setInputType.i():boolean");
    }

    public final CharSequence j() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        onDetachedFromWindow();
        removeCallbacks(this.z);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.p = false;
        }
        if (!this.p) {
            boolean onHoverEvent = onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.p = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.p = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0660 A[LOOP:0: B:183:0x065a->B:185:0x0660, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0695 A[LOOP:1: B:187:0x068f->B:189:0x0695, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x06e2 A[LOOP:2: B:191:0x06db->B:193:0x06e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0792 A[LOOP:3: B:201:0x078c->B:203:0x0792, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0269  */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 1973
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setInputType.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05ea  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected void onMeasure(int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 1525
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setInputType.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof write)) {
            onRestoreInstanceState(parcelable);
            return;
        }
        write write2 = (write) parcelable;
        onRestoreInstanceState(write2.d);
        setSupportCompoundDrawablesTintMode setsupportcompounddrawablestintmode = this.j;
        setOnDismissListener setondismisslistener = setsupportcompounddrawablestintmode != null ? setsupportcompounddrawablestintmode.e : null;
        if (!(write2.e == 0 || this.c == null || setondismisslistener == null || (findItem = setondismisslistener.findItem(write2.e)) == null)) {
            findItem.expandActionView();
        }
        if (write2.c) {
            removeCallbacks(this.z);
            post(this.z);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        onRtlPropertiesChanged(i);
        if (this.q == null) {
            this.q = new setIconified();
        }
        setIconified seticonified = this.q;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != seticonified.a) {
            seticonified.a = z;
            if (!seticonified.b) {
                seticonified.i = seticonified.e;
                seticonified.f = seticonified.d;
            } else if (z) {
                int i2 = seticonified.c;
                int i3 = i2;
                if (i2 == Integer.MIN_VALUE) {
                    i3 = seticonified.e;
                }
                seticonified.i = i3;
                int i4 = seticonified.h;
                int i5 = i4;
                if (i4 == Integer.MIN_VALUE) {
                    i5 = seticonified.d;
                }
                seticonified.f = i5;
            } else {
                int i6 = seticonified.h;
                int i7 = i6;
                if (i6 == Integer.MIN_VALUE) {
                    i7 = seticonified.e;
                }
                seticonified.i = i7;
                int i8 = seticonified.c;
                int i9 = i8;
                if (i8 == Integer.MIN_VALUE) {
                    i9 = seticonified.d;
                }
                seticonified.f = i9;
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        write write2 = new write(onSaveInstanceState());
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.c;
        if (!(remoteActionCompatParcelizer == null || remoteActionCompatParcelizer.d == null)) {
            write2.e = this.c.d.getItemId();
        }
        write2.c = g();
        return write2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.s = false;
        }
        if (!this.s) {
            boolean onTouchEvent = onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.s = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.s = false;
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            a();
        }
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(setPrimaryBackground.c(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            a();
            this.e.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f238o);
        }
    }

    public void setCollapsible(boolean z) {
        this.l = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        int i2 = i;
        if (i < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.t) {
            this.t = i2;
            ImageButton imageButton = this.g;
            if ((imageButton != null ? imageButton.getDrawable() : null) != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        int i2 = i;
        if (i < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.r) {
            this.r = i2;
            ImageButton imageButton = this.g;
            if ((imageButton != null ? imageButton.getDrawable() : null) != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        if (this.q == null) {
            this.q = new setIconified();
        }
        this.q.b(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        if (this.q == null) {
            this.q = new setIconified();
        }
        this.q.d(i, i2);
    }

    public void setLogo(int i) {
        setLogo(setPrimaryBackground.c(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        boolean z = false;
        boolean z2 = false;
        if (drawable != null) {
            if (this.x == null) {
                this.x = new setDropDownHorizontalOffset(getContext());
            }
            ImageView imageView = this.x;
            if (imageView.getParent() == this || this.b.contains(imageView)) {
                z2 = true;
            }
            if (!z2) {
                d(this.x, true);
            }
        } else {
            ImageView imageView2 = this.x;
            if (imageView2 != null) {
                if (imageView2.getParent() == this || this.b.contains(imageView2)) {
                    z = true;
                }
                if (z) {
                    removeView(this.x);
                    this.b.remove(this.x);
                }
            }
        }
        ImageView imageView3 = this.x;
        if (imageView3 != null) {
            imageView3.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.x == null) {
            this.x = new setDropDownHorizontalOffset(getContext());
        }
        ImageView imageView = this.x;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setMenu(setOnDismissListener setondismisslistener, setButtonDrawable setbuttondrawable) {
        if (setondismisslistener != null || this.j != null) {
            f();
            setOnDismissListener setondismisslistener2 = this.j.e;
            if (setondismisslistener2 != setondismisslistener) {
                if (setondismisslistener2 != null) {
                    setondismisslistener2.a(this.D);
                    setondismisslistener2.a(this.c);
                }
                if (this.c == null) {
                    this.c = new RemoteActionCompatParcelizer();
                }
                setbuttondrawable.i = true;
                if (setondismisslistener != null) {
                    Context context = this.B;
                    setondismisslistener.s.add(new WeakReference<>(setbuttondrawable));
                    setbuttondrawable.e(context, setondismisslistener);
                    setondismisslistener.i = true;
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.c;
                    Context context2 = this.B;
                    setondismisslistener.s.add(new WeakReference<>(remoteActionCompatParcelizer));
                    remoteActionCompatParcelizer.e(context2, setondismisslistener);
                    setondismisslistener.i = true;
                } else {
                    setbuttondrawable.e(this.B, (setOnDismissListener) null);
                    this.c.e(this.B, (setOnDismissListener) null);
                    setbuttondrawable.c(true);
                    this.c.c(true);
                }
                this.j.setPopupTheme(this.A);
                this.j.setPresenter(setbuttondrawable);
                this.D = setbuttondrawable;
            }
        }
    }

    public void setMenuCallbacks(setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer, setOnDismissListener.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.k = iconCompatParcelizer;
        this.y = remoteActionCompatParcelizer;
        setSupportCompoundDrawablesTintMode setsupportcompounddrawablestintmode = this.j;
        if (setsupportcompounddrawablestintmode != null) {
            setsupportcompounddrawablestintmode.setMenuCallbacks(iconCompatParcelizer, remoteActionCompatParcelizer);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        ImageButton imageButton = this.g;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(setPrimaryBackground.c(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        boolean z = false;
        boolean z2 = false;
        if (drawable != null) {
            m();
            ImageButton imageButton = this.g;
            if (imageButton.getParent() == this || this.b.contains(imageButton)) {
                z2 = true;
            }
            if (!z2) {
                d(this.g, true);
            }
        } else {
            ImageButton imageButton2 = this.g;
            if (imageButton2 != null) {
                if (imageButton2.getParent() == this || this.b.contains(imageButton2)) {
                    z = true;
                }
                if (z) {
                    removeView(this.g);
                    this.b.remove(this.g);
                }
            }
        }
        ImageButton imageButton3 = this.g;
        if (imageButton3 != null) {
            imageButton3.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m();
        this.g.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(IconCompatParcelizer iconCompatParcelizer) {
        this.i = iconCompatParcelizer;
    }

    public void setOverflowIcon(Drawable drawable) {
        h();
        this.j.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.A != i) {
            this.A = i;
            if (i == 0) {
                this.B = getContext();
            } else {
                this.B = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean z = false;
        boolean z2 = false;
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.G == null) {
                Context context = getContext();
                setTypeface settypeface = new setTypeface(context);
                this.G = settypeface;
                settypeface.setSingleLine();
                this.G.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.C;
                if (i != 0) {
                    this.G.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    this.G.setTextColor(colorStateList);
                }
            }
            TextView textView = this.G;
            if (textView.getParent() == this || this.b.contains(textView)) {
                z2 = true;
            }
            if (!z2) {
                d(this.G, true);
            }
        } else {
            TextView textView2 = this.G;
            if (textView2 != null) {
                if (textView2.getParent() == this || this.b.contains(textView2)) {
                    z = true;
                }
                if (z) {
                    removeView(this.G);
                    this.b.remove(this.G);
                }
            }
        }
        TextView textView3 = this.G;
        if (textView3 != null) {
            textView3.setText(charSequence);
        }
        this.h = charSequence;
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.C = i;
        TextView textView = this.G;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        TextView textView = this.G;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        boolean z = false;
        boolean z2 = false;
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.R == null) {
                Context context = getContext();
                setTypeface settypeface = new setTypeface(context);
                this.R = settypeface;
                settypeface.setSingleLine();
                this.R.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.J;
                if (i != 0) {
                    this.R.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.L;
                if (colorStateList != null) {
                    this.R.setTextColor(colorStateList);
                }
            }
            TextView textView = this.R;
            if (textView.getParent() == this || this.b.contains(textView)) {
                z2 = true;
            }
            if (!z2) {
                d(this.R, true);
            }
        } else {
            TextView textView2 = this.R;
            if (textView2 != null) {
                if (textView2.getParent() == this || this.b.contains(textView2)) {
                    z = true;
                }
                if (z) {
                    removeView(this.R);
                    this.b.remove(this.R);
                }
            }
        }
        TextView textView3 = this.R;
        if (textView3 != null) {
            textView3.setText(charSequence);
        }
        this.f = charSequence;
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.N = i;
        this.M = i2;
        this.K = i3;
        this.F = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.F = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.K = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.N = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.M = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.J = i;
        TextView textView = this.R;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        TextView textView = this.R;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
