package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import o.BaseDialogKotlin;
/* loaded from: classes2-dex2jar.jar:o/cancel.class */
public class cancel extends setInputType {

    /* renamed from: o  reason: collision with root package name */
    private static final int f55o = BaseDialogKotlin.MediaDescriptionCompat.B;
    private Integer k;
    private boolean l;
    private boolean m;

    public cancel(Context context) {
        this(context, null);
    }

    public cancel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.X);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public cancel(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r0 = o.cancel.f55o
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            android.content.Context r1 = o.MataUangDialog_ViewBinding.a(r1, r2, r3, r4)
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3)
            r0 = r7
            android.content.Context r0 = r0.getContext()
            r8 = r0
            int[] r0 = o.BaseDialogKotlin$MediaSessionCompat$Token.eu
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            o.GuestWarningWebViewDialog_ViewBinding.a(r0, r1, r2, r3)
            r0 = r8
            r1 = r9
            r2 = r12
            r3 = r10
            r4 = r11
            r5 = 0
            int[] r5 = new int[r5]
            o.GuestWarningWebViewDialog_ViewBinding.a(r0, r1, r2, r3, r4, r5)
            r0 = r8
            r1 = r9
            r2 = r12
            r3 = r10
            r4 = r11
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r9 = r0
            r0 = r9
            int r1 = o.BaseDialogKotlin$MediaSessionCompat$Token.ew
            boolean r0 = r0.hasValue(r1)
            if (r0 == 0) goto L_0x0056
            r0 = r7
            r1 = r9
            int r2 = o.BaseDialogKotlin$MediaSessionCompat$Token.ew
            r3 = -1
            int r1 = r1.getColor(r2, r3)
            r0.setNavigationIconTint(r1)
        L_0x0056:
            r0 = r7
            r1 = r9
            int r2 = o.BaseDialogKotlin$MediaSessionCompat$Token.ev
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            r0.l = r1
            r0 = r7
            r1 = r9
            int r2 = o.BaseDialogKotlin$MediaSessionCompat$Token.ey
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            r0.m = r1
            r0 = r9
            r0.recycle()
            r0 = r7
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L_0x0085
            r0 = r12
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x00b8
        L_0x0085:
            o.JenisKodeBankDialog r0 = new o.JenisKodeBankDialog
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r13
            r10 = r0
            r0 = r12
            if (r0 == 0) goto L_0x009e
            r0 = r12
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            int r0 = r0.getColor()
            r10 = r0
        L_0x009e:
            r0 = r9
            r1 = r10
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.c(r1)
            r0 = r9
            r1 = r8
            r0.b(r1)
            r0 = r9
            r1 = r7
            float r1 = o.findFragmentByWho.j(r1)
            r0.l(r1)
            r0 = r7
            r1 = r9
            o.findFragmentByWho.b(r0, r1)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cancel.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        int i3 = i;
        int i4 = i2;
        if (max > 0) {
            i3 = i + max;
            i4 = i2 - max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i4 - i3, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i3, view.getTop(), i4, view.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof JenisKodeBankDialog) {
            JenisKodeBankDialog jenisKodeBankDialog = (JenisKodeBankDialog) background;
            if (jenisKodeBankDialog.l()) {
                jenisKodeBankDialog.n(HaloBCADialog.c(this));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        onLayout(z, i, i2, i3, i4);
        if (this.l || this.m) {
            TextView c = aksesViaWeb.c(this, j());
            TextView c2 = aksesViaWeb.c(this, b());
            if (!(c == null && c2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    paddingRight = paddingRight;
                    paddingLeft = paddingLeft;
                    if (childAt.getVisibility() != 8) {
                        paddingRight = paddingRight;
                        paddingLeft = paddingLeft;
                        if (childAt != c) {
                            paddingRight = paddingRight;
                            paddingLeft = paddingLeft;
                            if (childAt != c2) {
                                int i7 = paddingLeft;
                                if (childAt.getRight() < i5) {
                                    i7 = paddingLeft;
                                    if (childAt.getRight() > paddingLeft) {
                                        i7 = childAt.getRight();
                                    }
                                }
                                paddingRight = paddingRight;
                                paddingLeft = i7;
                                if (childAt.getLeft() > i5) {
                                    paddingRight = paddingRight;
                                    paddingLeft = i7;
                                    if (childAt.getLeft() < paddingRight) {
                                        paddingRight = childAt.getLeft();
                                        paddingLeft = i7;
                                    }
                                }
                            }
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.l && c != null) {
                    d(c, pair);
                }
                if (this.m && c2 != null) {
                    d(c2, pair);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setElevation(float f) {
        setElevation(f);
        Drawable background = getBackground();
        if (background instanceof JenisKodeBankDialog) {
            ((JenisKodeBankDialog) background).l(f);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (drawable != null) {
            drawable2 = drawable;
            if (this.k != null) {
                drawable2 = getInsetsForType.h(drawable);
                getInsetsForType.b(drawable2, this.k.intValue());
            }
        }
        setNavigationIcon(drawable2);
    }

    public void setNavigationIconTint(int i) {
        this.k = Integer.valueOf(i);
        Drawable d = d();
        if (d != null) {
            setNavigationIcon(d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSubtitleCentered(boolean z) {
        if (this.m != z) {
            this.m = z;
            requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTitleCentered(boolean z) {
        if (this.l != z) {
            this.l = z;
            requestLayout();
        }
    }
}
