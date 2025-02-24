package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Arrays;
import java.util.HashMap;
import o.setMaxHeight;
import o.setMinWidth;
/* loaded from: classes-dex2jar.jar:o/setId.class */
public abstract class setId extends View {
    protected int a;
    private View[] b;
    protected setTitleMarginTop c;
    private HashMap<Integer, String> d;
    protected int[] e;
    protected boolean f;
    protected String g;
    protected Context h;
    protected String i;

    public setId(Context context) {
        super(context);
        this.e = new int[32];
        this.f = false;
        this.b = null;
        this.d = new HashMap<>();
        this.h = context;
        a((AttributeSet) null);
    }

    public setId(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new int[32];
        this.f = false;
        this.b = null;
        this.d = new HashMap<>();
        this.h = context;
        a(attributeSet);
    }

    public setId(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new int[32];
        this.f = false;
        this.b = null;
        this.d = new HashMap<>();
        this.h = context;
        a(attributeSet);
    }

    private int a(String str) {
        setMaxHeight setmaxheight = getParent() instanceof setMaxHeight ? (setMaxHeight) getParent() : null;
        int i = 0;
        if (isInEditMode()) {
            i = 0;
            if (setmaxheight != null) {
                Object c = setmaxheight.c(0, str);
                i = 0;
                if (c instanceof Integer) {
                    i = ((Integer) c).intValue();
                }
            }
        }
        int i2 = i;
        if (i == 0) {
            i2 = i;
            if (setmaxheight != null) {
                i2 = d(setmaxheight, str);
            }
        }
        int i3 = i2;
        if (i2 == 0) {
            try {
                i3 = setMinWidth.IconCompatParcelizer.class.getField(str).getInt(null);
            } catch (Exception e) {
                i3 = i2;
            }
        }
        int i4 = i3;
        if (i3 == 0) {
            i4 = this.h.getResources().getIdentifier(str, "id", this.h.getPackageName());
        }
        return i4;
    }

    private void b(int i) {
        if (i != getId()) {
            int i2 = this.a;
            int[] iArr = this.e;
            if (i2 + 1 > iArr.length) {
                this.e = Arrays.copyOf(iArr, iArr.length << 1);
            }
            int[] iArr2 = this.e;
            int i3 = this.a;
            iArr2[i3] = i;
            this.a = i3 + 1;
        }
    }

    private void b(String str) {
        this.i = str;
        if (str != null) {
            int i = 0;
            this.a = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    e(str.substring(i));
                    return;
                } else {
                    e(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    private void c(String str) {
        this.g = str;
        if (str != null) {
            int i = 0;
            this.a = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    d(str.substring(i));
                    return;
                } else {
                    d(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    private int d(setMaxHeight setmaxheight, String str) {
        Resources resources;
        String str2;
        if (str == null || setmaxheight == null || (resources = this.h.getResources()) == null) {
            return 0;
        }
        int childCount = setmaxheight.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = setmaxheight.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException e) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private void d(String str) {
        if (!(str == null || str.length() == 0 || this.h == null)) {
            String trim = str.trim();
            setMaxHeight setmaxheight = getParent() instanceof setMaxHeight ? (setMaxHeight) getParent() : null;
            if (setmaxheight == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = setmaxheight.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = setmaxheight.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof setMaxHeight.RemoteActionCompatParcelizer) && trim.equals(((setMaxHeight.RemoteActionCompatParcelizer) layoutParams).i)) {
                    if (childAt.getId() == -1) {
                        StringBuilder sb = new StringBuilder("to use ConstraintTag view ");
                        sb.append(childAt.getClass().getSimpleName());
                        sb.append(" must have an ID");
                        Log.w("ConstraintHelper", sb.toString());
                    } else {
                        b(childAt.getId());
                    }
                }
            }
        }
    }

    private void e(String str) {
        if (str != null && str.length() != 0 && this.h != null) {
            String trim = str.trim();
            if (getParent() instanceof setMaxHeight) {
                getParent();
            }
            int a = a(trim);
            if (a != 0) {
                this.d.put(Integer.valueOf(a), trim);
                b(a);
                return;
            }
            StringBuilder sb = new StringBuilder("Could not find id of \"");
            sb.append(trim);
            sb.append("\"");
            Log.w("ConstraintHelper", sb.toString());
        }
    }

    public final void a() {
        if (this.c != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof setMaxHeight.RemoteActionCompatParcelizer) {
                ((setMaxHeight.RemoteActionCompatParcelizer) layoutParams).ao = (setTitleMarginEnd) this.c;
            }
        }
    }

    public void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.r);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.C) {
                    String string = obtainStyledAttributes.getString(index);
                    this.i = string;
                    b(string);
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.D) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.g = string2;
                    c(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    protected final void b() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof setMaxHeight)) {
            setMaxHeight setmaxheight = (setMaxHeight) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.a; i++) {
                View view = setmaxheight.b.get(this.e[i]);
                if (view != null) {
                    view.setVisibility(visibility);
                    if (elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final void b(setMaxHeight setmaxheight) {
        if (isInEditMode()) {
            b(this.i);
        }
        setTitleMarginTop settitlemargintop = this.c;
        if (settitlemargintop != null) {
            settitlemargintop.g();
            for (int i = 0; i < this.a; i++) {
                int i2 = this.e[i];
                View view = setmaxheight.b.get(i2);
                View view2 = view;
                if (view == null) {
                    String str = this.d.get(Integer.valueOf(i2));
                    int d = d(setmaxheight, str);
                    view2 = view;
                    if (d != 0) {
                        this.e[i] = d;
                        this.d.put(Integer.valueOf(d), str);
                        view2 = setmaxheight.b.get(d);
                    }
                }
                if (view2 != null) {
                    this.c.d(setmaxheight.d(view2));
                }
            }
            this.c.h();
        }
    }

    public void b(setTitleMarginEnd settitlemarginend, boolean z) {
    }

    public final int[] c() {
        return Arrays.copyOf(this.e, this.a);
    }

    public void e() {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        onAttachedToWindow();
        String str = this.i;
        if (str != null) {
            b(str);
        }
        String str2 = this.g;
        if (str2 != null) {
            c(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f) {
            onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.i = null;
        this.a = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        setTag(i, obj);
        if (obj == null && this.i == null) {
            b(i);
        }
    }
}
