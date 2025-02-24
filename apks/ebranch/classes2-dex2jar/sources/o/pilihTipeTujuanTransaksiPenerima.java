package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.OR5DataPenerimaFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/pilihTipeTujuanTransaksiPenerima.class */
public class pilihTipeTujuanTransaksiPenerima extends LinearLayout {
    public float a;
    protected List<onDismissWarningDialog> b;
    private boolean c;
    private Drawable d;
    private Drawable e;
    private float f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private IconCompatParcelizer l;
    private int m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private float f85o;
    private float p;
    private float q;
    private float t;

    /* loaded from: classes2-dex2jar.jar:o/pilihTipeTujuanTransaksiPenerima$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
    }

    public pilihTipeTujuanTransaksiPenerima(Context context) {
        this(context, null);
    }

    public pilihTipeTujuanTransaksiPenerima(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public pilihTipeTujuanTransaksiPenerima(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = 20;
        this.f = 0.0f;
        this.a = -1.0f;
        this.p = 1.0f;
        this.f85o = 0.0f;
        this.i = false;
        this.g = true;
        this.h = true;
        this.c = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OR5DataPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.s);
        float f = obtainStyledAttributes.getFloat(OR5DataPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.v, 0.0f);
        this.j = obtainStyledAttributes.getInt(OR5DataPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.x, this.j);
        this.p = obtainStyledAttributes.getFloat(OR5DataPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.D, this.p);
        this.f = obtainStyledAttributes.getFloat(OR5DataPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.w, this.f);
        this.k = obtainStyledAttributes.getDimensionPixelSize(OR5DataPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.z, this.k);
        this.m = obtainStyledAttributes.getDimensionPixelSize(OR5DataPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.C, 0);
        this.n = obtainStyledAttributes.getDimensionPixelSize(OR5DataPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.B, 0);
        Drawable drawable = null;
        this.d = obtainStyledAttributes.hasValue(OR5DataPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.t) ? copyWindowDataInto.b(context, obtainStyledAttributes.getResourceId(OR5DataPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.t, -1)) : null;
        this.e = obtainStyledAttributes.hasValue(OR5DataPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.p) ? copyWindowDataInto.b(context, obtainStyledAttributes.getResourceId(OR5DataPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.p, -1)) : drawable;
        this.i = obtainStyledAttributes.getBoolean(OR5DataPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.u, this.i);
        this.g = obtainStyledAttributes.getBoolean(OR5DataPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.y, this.g);
        this.h = obtainStyledAttributes.getBoolean(OR5DataPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.r, this.h);
        this.c = obtainStyledAttributes.getBoolean(OR5DataPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.q, this.c);
        obtainStyledAttributes.recycle();
        if (this.j <= 0) {
            this.j = 5;
        }
        if (this.k < 0) {
            this.k = 0;
        }
        if (this.d == null) {
            this.d = copyWindowDataInto.b(getContext(), OR5DataPenerimaFragment_ViewBinding.IconCompatParcelizer.e);
        }
        if (this.e == null) {
            this.e = copyWindowDataInto.b(getContext(), OR5DataPenerimaFragment_ViewBinding.IconCompatParcelizer.c);
        }
        float f2 = this.p;
        if (f2 > 1.0f) {
            this.p = 1.0f;
        } else if (f2 < 0.1f) {
            this.p = 0.1f;
        }
        this.f = onClickInfoPromo.a(this.f, this.j, this.p);
        a();
        setRating(f);
    }

    private void a() {
        this.b = new ArrayList();
        for (int i = 1; i <= this.j; i++) {
            int i2 = this.m;
            int i3 = this.n;
            int i4 = this.k;
            Drawable drawable = this.e;
            Drawable drawable2 = this.d;
            onDismissWarningDialog ondismisswarningdialog = new onDismissWarningDialog(getContext(), i, i2, i3, i4);
            ondismisswarningdialog.setFilledDrawable(drawable);
            ondismisswarningdialog.setEmptyDrawable(drawable2);
            addView(ondismisswarningdialog);
            this.b.add(ondismisswarningdialog);
        }
    }

    private void c(float f, boolean z) {
        float f2 = (float) this.j;
        float f3 = f;
        if (f > f2) {
            f3 = f2;
        }
        float f4 = this.f;
        float f5 = f3;
        if (f3 < f4) {
            f5 = f4;
        }
        if (this.a != f5) {
            float floatValue = Double.valueOf(Math.floor((double) (f5 / this.p))).floatValue() * this.p;
            this.a = floatValue;
            b(floatValue);
        }
    }

    protected void b(float f) {
        for (onDismissWarningDialog ondismisswarningdialog : this.b) {
            int intValue = ((Integer) ondismisswarningdialog.getTag()).intValue();
            int i = (((double) intValue) > Math.ceil((double) f) ? 1 : (((double) intValue) == Math.ceil((double) f) ? 0 : -1));
            if (i > 0) {
                ondismisswarningdialog.setEmpty();
            } else if (i == 0) {
                ondismisswarningdialog.setPartialFilled(f);
            } else {
                ondismisswarningdialog.setFilled();
            }
        }
    }

    @Override // android.view.View
    public boolean isClickable() {
        return this.h;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        OR6DataLainnyaFragment oR6DataLainnyaFragment = (OR6DataLainnyaFragment) parcelable;
        onRestoreInstanceState(oR6DataLainnyaFragment.getSuperState());
        setRating(oR6DataLainnyaFragment.b);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        OR6DataLainnyaFragment oR6DataLainnyaFragment = new OR6DataLainnyaFragment(onSaveInstanceState());
        oR6DataLainnyaFragment.b = this.a;
        return oR6DataLainnyaFragment;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.i) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.q = x;
            this.t = y;
            this.f85o = this.a;
        } else if (action == 1) {
            float f = this.q;
            float f2 = this.t;
            if (((float) (motionEvent.getEventTime() - motionEvent.getDownTime())) <= 200.0f) {
                float abs = Math.abs(f - motionEvent.getX());
                float abs2 = Math.abs(f2 - motionEvent.getY());
                if (abs <= 5.0f && abs2 <= 5.0f) {
                    z = true;
                    if (!z && isClickable()) {
                        Iterator<onDismissWarningDialog> it = this.b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            onDismissWarningDialog next = it.next();
                            if (x > ((float) next.getLeft()) && x < ((float) next.getRight())) {
                                float f3 = this.p;
                                float intValue = f3 == 1.0f ? (float) ((Integer) next.getTag()).intValue() : onClickInfoPromo.d(next, f3, x);
                                if (this.f85o != intValue || !this.c) {
                                    c(intValue, true);
                                } else {
                                    c(this.f, true);
                                }
                            }
                        }
                    }
                }
            }
            z = false;
            return !z ? false : false;
        } else if (action == 2) {
            if (this.g) {
                Iterator<onDismissWarningDialog> it2 = this.b.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    onDismissWarningDialog next2 = it2.next();
                    if (x < (((float) next2.getWidth()) / 10.0f) + (this.f * ((float) next2.getWidth()))) {
                        c(this.f, true);
                        break;
                    }
                    if (x > ((float) next2.getLeft()) && x < ((float) next2.getRight())) {
                        float d = onClickInfoPromo.d(next2, this.p, x);
                        if (this.a != d) {
                            c(d, true);
                        }
                    }
                }
            } else {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public void setClearRatingEnabled(boolean z) {
        this.c = z;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        this.h = z;
    }

    public void setEmptyDrawable(Drawable drawable) {
        this.d = drawable;
        for (onDismissWarningDialog ondismisswarningdialog : this.b) {
            ondismisswarningdialog.setEmptyDrawable(drawable);
        }
    }

    public void setEmptyDrawableRes(int i) {
        Drawable b = copyWindowDataInto.b(getContext(), i);
        if (b != null) {
            setEmptyDrawable(b);
        }
    }

    public void setFilledDrawable(Drawable drawable) {
        this.e = drawable;
        for (onDismissWarningDialog ondismisswarningdialog : this.b) {
            ondismisswarningdialog.setFilledDrawable(drawable);
        }
    }

    public void setFilledDrawableRes(int i) {
        Drawable b = copyWindowDataInto.b(getContext(), i);
        if (b != null) {
            setFilledDrawable(b);
        }
    }

    public void setIsIndicator(boolean z) {
        this.i = z;
    }

    public void setMinimumStars(float f) {
        this.f = onClickInfoPromo.a(f, this.j, this.p);
    }

    public void setNumStars(int i) {
        if (i > 0) {
            this.b.clear();
            removeAllViews();
            this.j = i;
            a();
        }
    }

    public void setOnRatingChangeListener(IconCompatParcelizer iconCompatParcelizer) {
        this.l = iconCompatParcelizer;
    }

    public void setRating(float f) {
        c(f, false);
    }

    public void setScrollable(boolean z) {
        this.g = z;
    }

    public void setStarHeight(int i) {
        this.n = i;
        for (onDismissWarningDialog ondismisswarningdialog : this.b) {
            ondismisswarningdialog.setStarHeight(i);
        }
    }

    public void setStarPadding(int i) {
        if (i >= 0) {
            this.k = i;
            for (onDismissWarningDialog ondismisswarningdialog : this.b) {
                int i2 = this.k;
                ondismisswarningdialog.setPadding(i2, i2, i2, i2);
            }
        }
    }

    public void setStarWidth(int i) {
        this.m = i;
        for (onDismissWarningDialog ondismisswarningdialog : this.b) {
            ondismisswarningdialog.setStarWidth(i);
        }
    }

    public void setStepSize(float f) {
        this.p = f;
    }
}
