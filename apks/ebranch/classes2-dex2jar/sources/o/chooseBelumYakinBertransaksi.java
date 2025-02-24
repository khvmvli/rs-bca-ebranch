package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import o.BaseDialogKotlin;
import o.JenisPekerjaanDialog;
import o.getChildFragmentManager;
/* loaded from: classes2-dex2jar.jar:o/chooseBelumYakinBertransaksi.class */
public class chooseBelumYakinBertransaksi extends setAdapter implements clickClose$MediaBrowserCompat$CustomActionResultReceiver, KategoriTujuanTransaksiORDialog {
    CompoundButton.OnCheckedChangeListener a;
    boolean b;
    clickClose c;
    View.OnClickListener e;
    private boolean g;
    private boolean h;
    private boolean k;
    private int l;
    private InsetDrawable m;
    private boolean n;

    /* renamed from: o */
    private final InfoEchannelDialog f56o;
    private RippleDrawable p;
    private int q;
    private final RectF r;
    private final Rect s;
    private final read t;
    private static final int f = BaseDialogKotlin.MediaDescriptionCompat.q;
    static final Rect d = new Rect();
    private static final int[] j = {16842913};
    private static final int[] i = {16842911};

    /* loaded from: classes2-dex2jar.jar:o/chooseBelumYakinBertransaksi$read.class */
    public final class read extends getReenterTransition {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        read(chooseBelumYakinBertransaksi choosebelumyakinbertransaksi) {
            super(choosebelumyakinbertransaksi);
            chooseBelumYakinBertransaksi.this = r4;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
        public final void b(int i, boolean z) {
            if (i == 1) {
                chooseBelumYakinBertransaksi.this.b = z;
                chooseBelumYakinBertransaksi.this.refreshDrawableState();
            }
        }

        /* JADX WARN: Type inference failed for: r0v13, types: [android.widget.TextView, o.chooseBelumYakinBertransaksi] */
        /* JADX WARN: Type inference failed for: r0v31, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
        /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
        public final void c(getChildFragmentManager getchildfragmentmanager) {
            clickClose clickclose = chooseBelumYakinBertransaksi.this.c;
            boolean z = true;
            getchildfragmentmanager.c(clickclose != null && clickclose.b);
            getchildfragmentmanager.d(chooseBelumYakinBertransaksi.this.isClickable());
            clickClose clickclose2 = chooseBelumYakinBertransaksi.this.c;
            if ((clickclose2 != null && clickclose2.b) || chooseBelumYakinBertransaksi.this.isClickable()) {
                clickClose clickclose3 = chooseBelumYakinBertransaksi.this.c;
                if (clickclose3 == null || !clickclose3.b) {
                    z = false;
                }
                getchildfragmentmanager.b(z ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                getchildfragmentmanager.b("android.view.View");
            }
            CharSequence text = chooseBelumYakinBertransaksi.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                getchildfragmentmanager.i(text);
            } else {
                getchildfragmentmanager.c(text);
            }
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
        public final boolean c(int i, int i2) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return chooseBelumYakinBertransaksi.this.performClick();
            }
            if (i == 1) {
                return chooseBelumYakinBertransaksi.this.b();
            }
            return false;
        }

        public final int e(float f, float f2) {
            return (!chooseBelumYakinBertransaksi.e(chooseBelumYakinBertransaksi.this) || !chooseBelumYakinBertransaksi.this.a().contains(f, f2)) ? 0 : 1;
        }

        /* JADX WARN: Type inference failed for: r0v13, types: [android.widget.TextView, o.chooseBelumYakinBertransaksi] */
        /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
        /* JADX WARN: Type inference failed for: r1v8, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
        public final void e(int i, getChildFragmentManager getchildfragmentmanager) {
            CharSequence charSequence = "";
            if (i == 1) {
                clickClose clickclose = chooseBelumYakinBertransaksi.this.c;
                CharSequence charSequence2 = clickclose != null ? clickclose.g : null;
                if (charSequence2 != null) {
                    getchildfragmentmanager.c(charSequence2);
                } else {
                    CharSequence text = chooseBelumYakinBertransaksi.this.getText();
                    Context context = chooseBelumYakinBertransaksi.this.getContext();
                    int i2 = BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.s;
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    getchildfragmentmanager.c(context.getString(i2, charSequence).trim());
                }
                getchildfragmentmanager.d(chooseBelumYakinBertransaksi.this.c());
                getchildfragmentmanager.a(getChildFragmentManager.read.d);
                getchildfragmentmanager.h(chooseBelumYakinBertransaksi.this.isEnabled());
                return;
            }
            getchildfragmentmanager.c("");
            getchildfragmentmanager.d(chooseBelumYakinBertransaksi.d);
        }

        public final void e(List<Integer> list) {
            list.add(0);
            if (chooseBelumYakinBertransaksi.e(chooseBelumYakinBertransaksi.this)) {
                clickClose clickclose = chooseBelumYakinBertransaksi.this.c;
                boolean z = false;
                if (clickclose != null) {
                    z = false;
                    if (clickclose.l) {
                        z = true;
                    }
                }
                if (z && chooseBelumYakinBertransaksi.this.e != null) {
                    list.add(1);
                }
            }
        }
    }

    public chooseBelumYakinBertransaksi(Context context) {
        this(context, null);
    }

    public chooseBelumYakinBertransaksi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public chooseBelumYakinBertransaksi(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
        // Method dump skipped, instructions count: 1665
        */
        throw new UnsupportedOperationException("Method not decompiled: o.chooseBelumYakinBertransaksi.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private boolean a(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 10) {
            return false;
        }
        try {
            Field declaredField = getReenterTransition.class.getDeclaredField("e");
            declaredField.setAccessible(true);
            if (((Integer) declaredField.get(this.t)).intValue() == Integer.MIN_VALUE) {
                return false;
            }
            Method declaredMethod = getReenterTransition.class.getDeclaredMethod("updateHoveredVirtualView", Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.t, Integer.MIN_VALUE);
            return true;
        } catch (IllegalAccessException e) {
            Log.e("Chip", "Unable to send Accessibility Exit event", e);
            return false;
        } catch (NoSuchFieldException e2) {
            Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            return false;
        } catch (NoSuchMethodException e3) {
            Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            return false;
        } catch (InvocationTargetException e4) {
            Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean d(int i2) {
        this.q = i2;
        if (this.k) {
            int max = Math.max(0, i2 - this.c.getIntrinsicHeight());
            int max2 = Math.max(0, i2 - this.c.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                int i3 = max2 > 0 ? max2 / 2 : 0;
                int i4 = max > 0 ? max / 2 : 0;
                if (this.m != null) {
                    Rect rect = new Rect();
                    this.m.getPadding(rect);
                    if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                        f();
                        return true;
                    }
                }
                if (getMinHeight() != i2) {
                    setMinHeight(i2);
                }
                if (getMinWidth() != i2) {
                    setMinWidth(i2);
                }
                this.m = new InsetDrawable((Drawable) this.c, i3, i4, i3, i4);
                f();
                return true;
            } else if (this.m != null) {
                g();
                return false;
            } else {
                f();
                return false;
            }
        } else if (this.m != null) {
            g();
            return false;
        } else {
            f();
            return false;
        }
    }

    private void e() {
        Drawable.Callback callback = this.m;
        Drawable.Callback callback2 = callback;
        if (callback == null) {
            callback2 = this.c;
        }
        if (callback2 == this.m && this.c.getCallback() == null) {
            this.c.setCallback(this.m);
        }
    }

    static /* synthetic */ boolean e(chooseBelumYakinBertransaksi choosebelumyakinbertransaksi) {
        boolean z;
        clickClose clickclose = choosebelumyakinbertransaksi.c;
        if (clickclose != null) {
            Drawable drawable = clickclose.i;
            if ((drawable != null ? getInsetsForType.g(drawable) : null) != null) {
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void f() {
        if (InfoDialog_ViewBinding.c) {
            h();
            return;
        }
        clickClose clickclose = this.c;
        if (!clickclose.z) {
            clickclose.z = true;
            clickclose.k = clickclose.z ? InfoDialog_ViewBinding.d(clickclose.q) : null;
            clickclose.onStateChange(clickclose.getState());
        }
        InsetDrawable insetDrawable = this.m;
        Drawable drawable = insetDrawable;
        if (insetDrawable == null) {
            drawable = this.c;
        }
        findFragmentByWho.b(this, drawable);
        n();
        e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g() {
        if (this.m != null) {
            this.m = null;
            setMinWidth(0);
            clickClose clickclose = this.c;
            setMinHeight((int) (clickclose != null ? clickclose.c : 0.0f));
            f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void h() {
        ColorStateList d2 = InfoDialog_ViewBinding.d(this.c.q);
        InsetDrawable insetDrawable = this.m;
        Drawable drawable = insetDrawable;
        if (insetDrawable == null) {
            drawable = this.c;
        }
        ColorStateList colorStateList = null;
        this.p = new RippleDrawable(d2, drawable, null);
        clickClose clickclose = this.c;
        if (clickclose.z) {
            clickclose.z = false;
            if (clickclose.z) {
                colorStateList = InfoDialog_ViewBinding.d(clickclose.q);
            }
            clickclose.k = colorStateList;
            clickclose.onStateChange(clickclose.getState());
        }
        findFragmentByWho.b(this, this.p);
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i() {
        if (j()) {
            clickClose clickclose = this.c;
            if ((clickclose != null && clickclose.l) && this.e != null) {
                findFragmentByWho.d(this, this.t);
                return;
            }
        }
        findFragmentByWho.d(this, (onDismiss) null);
    }

    private boolean j() {
        boolean z;
        clickClose clickclose = this.c;
        if (clickclose != null) {
            Drawable drawable = clickclose.i;
            if ((drawable != null ? getInsetsForType.g(drawable) : null) != null) {
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void l() {
        TextPaint paint = getPaint();
        clickClose clickclose = this.c;
        if (clickclose != null) {
            paint.drawableState = clickclose.getState();
        }
        clickClose clickclose2 = this.c;
        InfoCaraPembayaranDialog infoCaraPembayaranDialog = clickclose2 != null ? clickclose2.x.d : null;
        if (infoCaraPembayaranDialog != null) {
            infoCaraPembayaranDialog.a(getContext(), paint, this.f56o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void n() {
        clickClose clickclose;
        if (!TextUtils.isEmpty(getText()) && (clickclose = this.c) != null) {
            float f2 = clickclose.d;
            float f3 = this.c.u;
            clickClose clickclose2 = this.c;
            int i2 = (int) (f2 + f3 + (clickclose2.l && clickclose2.i != null ? clickclose2.f62o + clickclose2.m + clickclose2.f : 0.0f));
            int c = (int) (this.c.h + this.c.D + this.c.c());
            int i3 = i2;
            int i4 = c;
            if (this.m != null) {
                Rect rect = new Rect();
                this.m.getPadding(rect);
                i4 = c + rect.left;
                i3 = i2 + rect.right;
            }
            findFragmentByWho.c(this, i4, getPaddingTop(), i3, getPaddingBottom());
        }
    }

    RectF a() {
        boolean z;
        this.r.setEmpty();
        clickClose clickclose = this.c;
        if (clickclose != null) {
            Drawable drawable = clickclose.i;
            if ((drawable != null ? getInsetsForType.g(drawable) : null) != null) {
                z = true;
                if (z && this.e != null) {
                    clickClose clickclose2 = this.c;
                    clickclose2.b(clickclose2.getBounds(), this.r);
                }
                return this.r;
            }
        }
        z = false;
        if (z) {
            clickClose clickclose22 = this.c;
            clickclose22.b(clickclose22.getBounds(), this.r);
        }
        return this.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.e;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.t.d(1, 1);
        return z;
    }

    Rect c() {
        RectF a = a();
        this.s.set((int) a.left, (int) a.top, (int) a.right, (int) a.bottom);
        return this.s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.clickClose$MediaBrowserCompat$CustomActionResultReceiver
    public final void d() {
        d(this.q);
        requestLayout();
        invalidateOutline();
    }

    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return a(motionEvent) || this.t.b(motionEvent) || dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.t.a(keyEvent) || ((getReenterTransition) this.t).d == Integer.MIN_VALUE) {
            return dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawableStateChanged() {
        drawableStateChanged();
        clickClose clickclose = this.c;
        int i2 = 0;
        boolean z = false;
        if (clickclose != null) {
            Drawable drawable = clickclose.i;
            z = false;
            if (drawable != null && drawable.isStateful()) {
                clickClose clickclose2 = this.c;
                boolean isEnabled = isEnabled();
                int i3 = isEnabled ? 1 : 0;
                if (this.b) {
                    i3 = (isEnabled ? 1 : 0) + 1;
                }
                int i4 = i3;
                if (this.h) {
                    i4 = i3 + 1;
                }
                int i5 = i4;
                if (this.g) {
                    i5 = i4 + 1;
                }
                int i6 = i5;
                if (isChecked()) {
                    i6 = i5 + 1;
                }
                int[] iArr = new int[i6];
                if (isEnabled()) {
                    iArr[0] = 16842910;
                    i2 = 1;
                }
                int i7 = i2;
                if (this.b) {
                    iArr[i2] = 16842908;
                    i7 = i2 + 1;
                }
                int i8 = i7;
                if (this.h) {
                    iArr[i7] = 16843623;
                    i8 = i7 + 1;
                }
                int i9 = i8;
                if (this.g) {
                    iArr[i8] = 16842919;
                    i9 = i8 + 1;
                }
                if (isChecked()) {
                    iArr[i9] = 16842913;
                }
                z = clickclose2.b(iArr);
            }
        }
        if (z) {
            invalidate();
        }
    }

    public TextUtils.TruncateAt getEllipsize() {
        clickClose clickclose = this.c;
        return clickclose != null ? clickclose.B : null;
    }

    public void getFocusedRect(Rect rect) {
        if (((getReenterTransition) this.t).d == 1 || ((getReenterTransition) this.t).c == 1) {
            rect.set(c());
        } else {
            getFocusedRect(rect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        onAttachedToWindow();
        clickClose clickclose = this.c;
        if (clickclose.l()) {
            clickclose.n(HaloBCADialog.c(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, j);
        }
        clickClose clickclose = this.c;
        if (clickclose != null && clickclose.b) {
            mergeDrawableStates(onCreateDrawableState, i);
        }
        return onCreateDrawableState;
    }

    protected void onFocusChanged(boolean z, int i2, Rect rect) {
        onFocusChanged(z, i2, rect);
        this.t.c(z, i2, rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            boolean contains = a().contains(motionEvent.getX(), motionEvent.getY());
            if (this.h != contains) {
                this.h = contains;
                refreshDrawableState();
            }
        } else if (actionMasked == 10 && this.h) {
            this.h = false;
            refreshDrawableState();
        }
        return onHoverEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        clickClose clickclose = this.c;
        boolean z = true;
        int i3 = 0;
        if ((clickclose != null && clickclose.b) || isClickable()) {
            clickClose clickclose2 = this.c;
            accessibilityNodeInfo.setClassName(clickclose2 != null && clickclose2.b ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        clickClose clickclose3 = this.c;
        if (clickclose3 == null || !clickclose3.b) {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof DaftarTransferBerhasilDihapusDialog) {
            DaftarTransferBerhasilDihapusDialog daftarTransferBerhasilDihapusDialog = (DaftarTransferBerhasilDihapusDialog) getParent();
            getChildFragmentManager d2 = getChildFragmentManager.d(accessibilityNodeInfo);
            if (daftarTransferBerhasilDihapusDialog.c()) {
                i2 = 0;
                while (true) {
                    if (i3 >= daftarTransferBerhasilDihapusDialog.getChildCount()) {
                        i2 = -1;
                        break;
                    }
                    i2 = i2;
                    if (daftarTransferBerhasilDihapusDialog.getChildAt(i3) instanceof chooseBelumYakinBertransaksi) {
                        if (((chooseBelumYakinBertransaksi) daftarTransferBerhasilDihapusDialog.getChildAt(i3)) == this) {
                            break;
                        }
                        i2++;
                    }
                    i3++;
                }
            } else {
                i2 = -1;
            }
            Object tag = getTag(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.P);
            d2.b(getChildFragmentManager.IconCompatParcelizer.c(!(tag instanceof Integer) ? -1 : ((Integer) tag).intValue(), 1, i2, 1, false, isChecked()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!a().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public void onRtlPropertiesChanged(int i2) {
        onRtlPropertiesChanged(i2);
        if (this.l != i2) {
            this.l = i2;
            n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r0 != 3) goto L_0x0096;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r0 = r5
            int r0 = r0.getActionMasked()
            r6 = r0
            r0 = r4
            android.graphics.RectF r0 = r0.a()
            r1 = r5
            float r1 = r1.getX()
            r2 = r5
            float r2 = r2.getY()
            boolean r0 = r0.contains(r1, r2)
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r6
            if (r0 == 0) goto L_0x007c
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L_0x004e
            r0 = r6
            r1 = 2
            if (r0 == r1) goto L_0x002e
            r0 = r6
            r1 = 3
            if (r0 == r1) goto L_0x0060
            goto L_0x0096
        L_0x002e:
            r0 = r4
            boolean r0 = r0.g
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L_0x0096
            r0 = r7
            if (r0 != 0) goto L_0x0091
            r0 = r9
            if (r0 == 0) goto L_0x0091
            r0 = r4
            r1 = 0
            r0.g = r1
            r0 = r4
            r0.refreshDrawableState()
            goto L_0x0091
        L_0x004e:
            r0 = r4
            boolean r0 = r0.g
            if (r0 == 0) goto L_0x0060
            r0 = r4
            boolean r0 = r0.b()
            r0 = 1
            r10 = r0
            goto L_0x0063
        L_0x0060:
            r0 = 0
            r10 = r0
        L_0x0063:
            r0 = r10
            r6 = r0
            r0 = r4
            boolean r0 = r0.g
            if (r0 == 0) goto L_0x0098
            r0 = r4
            r1 = 0
            r0.g = r1
            r0 = r4
            r0.refreshDrawableState()
            r0 = r10
            r6 = r0
            goto L_0x0098
        L_0x007c:
            r0 = r7
            if (r0 == 0) goto L_0x0096
            r0 = r4
            boolean r0 = r0.g
            r1 = 1
            if (r0 == r1) goto L_0x0091
            r0 = r4
            r1 = 1
            r0.g = r1
            r0 = r4
            r0.refreshDrawableState()
        L_0x0091:
            r0 = 1
            r6 = r0
            goto L_0x0098
        L_0x0096:
            r0 = 0
            r6 = r0
        L_0x0098:
            r0 = r6
            if (r0 != 0) goto L_0x00a4
            r0 = r4
            r1 = r5
            boolean r0 = r0.onTouchEvent(r1)
            if (r0 == 0) goto L_0x00a7
        L_0x00a4:
            r0 = 1
            r8 = r0
        L_0x00a7:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.chooseBelumYakinBertransaksi.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        InsetDrawable insetDrawable = this.m;
        Drawable drawable2 = insetDrawable;
        if (insetDrawable == null) {
            drawable2 = this.c;
        }
        if (drawable == drawable2 || drawable == this.p) {
            setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        InsetDrawable insetDrawable = this.m;
        Drawable drawable2 = insetDrawable;
        if (insetDrawable == null) {
            drawable2 = this.c;
        }
        if (drawable == drawable2 || drawable == this.p) {
            setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.e(z);
        }
    }

    public void setCheckableResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.e(clickclose.n.getResources().getBoolean(i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        clickClose clickclose = this.c;
        if (clickclose == null) {
            this.n = z;
        } else if (clickclose.b) {
            boolean isChecked = isChecked();
            setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.a) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.a(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.a(setPrimaryBackground.c(clickclose.n, i2));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.e(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.e(setPrimaryBackground.b(clickclose.n, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.a(clickclose.n.getResources().getBoolean(i2));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.a(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        clickClose clickclose = this.c;
        if (clickclose != null && clickclose.a != colorStateList) {
            clickclose.a = colorStateList;
            clickclose.onStateChange(clickclose.getState());
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        ColorStateList b;
        clickClose clickclose = this.c;
        if (clickclose != null && clickclose.a != (b = setPrimaryBackground.b(clickclose.n, i2))) {
            clickclose.a = b;
            clickclose.onStateChange(clickclose.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        clickClose clickclose = this.c;
        if (clickclose != null && clickclose.e != f2) {
            clickclose.e = f2;
            JenisPekerjaanDialog.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new JenisPekerjaanDialog.RemoteActionCompatParcelizer(clickclose.F.l);
            remoteActionCompatParcelizer.i = new InfoTarikanDialog_ViewBinding(f2);
            remoteActionCompatParcelizer.k = new InfoTarikanDialog_ViewBinding(f2);
            remoteActionCompatParcelizer.e = new InfoTarikanDialog_ViewBinding(f2);
            remoteActionCompatParcelizer.b = new InfoTarikanDialog_ViewBinding(f2);
            clickclose.setShapeAppearanceModel(new JenisPekerjaanDialog(remoteActionCompatParcelizer, (byte) 0));
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            float dimension = clickclose.n.getResources().getDimension(i2);
            if (clickclose.e != dimension) {
                clickclose.e = dimension;
                JenisPekerjaanDialog.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new JenisPekerjaanDialog.RemoteActionCompatParcelizer(clickclose.F.l);
                remoteActionCompatParcelizer.i = new InfoTarikanDialog_ViewBinding(dimension);
                remoteActionCompatParcelizer.k = new InfoTarikanDialog_ViewBinding(dimension);
                remoteActionCompatParcelizer.e = new InfoTarikanDialog_ViewBinding(dimension);
                remoteActionCompatParcelizer.b = new InfoTarikanDialog_ViewBinding(dimension);
                clickclose.setShapeAppearanceModel(new JenisPekerjaanDialog(remoteActionCompatParcelizer, (byte) 0));
            }
        }
    }

    public void setChipDrawable(clickClose clickclose) {
        clickClose clickclose2 = this.c;
        if (clickclose2 != clickclose) {
            if (clickclose2 != null) {
                clickclose2.p = new WeakReference<>(null);
            }
            this.c = clickclose;
            clickclose.v = false;
            this.c.p = new WeakReference<>(this);
            d(this.q);
        }
    }

    public void setChipEndPadding(float f2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.a(f2);
        }
    }

    public void setChipEndPaddingResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.a(clickclose.n.getResources().getDimension(i2));
        }
    }

    public void setChipIcon(Drawable drawable) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.d(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.d(setPrimaryBackground.c(clickclose.n, i2));
        }
    }

    public void setChipIconSize(float f2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.e(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.e(clickclose.n.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.d(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.d(setPrimaryBackground.b(clickclose.n, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.c(clickclose.n.getResources().getBoolean(i2));
        }
    }

    public void setChipIconVisible(boolean z) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.c(z);
        }
    }

    public void setChipMinHeight(float f2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.c(f2);
        }
    }

    public void setChipMinHeightResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.c(clickclose.n.getResources().getDimension(i2));
        }
    }

    public void setChipStartPadding(float f2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.d(f2);
        }
    }

    public void setChipStartPaddingResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.d(clickclose.n.getResources().getDimension(i2));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.b(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.b(setPrimaryBackground.b(clickclose.n, i2));
        }
    }

    public void setChipStrokeWidth(float f2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.b(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.b(clickclose.n.getResources().getDimension(i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.b(drawable);
        }
        i();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        clickClose clickclose = this.c;
        if (clickclose != null && clickclose.g != charSequence) {
            dismissAllowingStateLoss d2 = dismissAllowingStateLoss.d();
            clickclose.g = d2.e(charSequence, d2.a, true);
            clickclose.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.i(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.i(clickclose.n.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.b(setPrimaryBackground.c(clickclose.n, i2));
        }
        i();
    }

    public void setCloseIconSize(float f2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.g(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.g(clickclose.n.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.f(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.f(clickclose.n.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.a(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.a(setPrimaryBackground.b(clickclose.n, i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    public void setCloseIconVisible(boolean z) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.d(z);
        }
        i();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f2) {
        setElevation(f2);
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.l(f2);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.c != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                setEllipsize(truncateAt);
                clickClose clickclose = this.c;
                if (clickclose != null) {
                    clickclose.B = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.k = z;
        d(this.q);
    }

    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            setGravity(i2);
        }
    }

    public void setHideMotionSpec(BaseKonfirmasiDialog baseKonfirmasiDialog) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.t = baseKonfirmasiDialog;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.t = BaseKonfirmasiDialog.b(clickclose.n, i2);
        }
    }

    public void setIconEndPadding(float f2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.j(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.j(clickclose.n.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.h(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.h(clickclose.n.getResources().getDimension(i2));
        }
    }

    public void setLayoutDirection(int i2) {
        if (this.c != null) {
            setLayoutDirection(i2);
        }
    }

    public void setLines(int i2) {
        if (i2 <= 1) {
            setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i2) {
        setMaxWidth(i2);
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.s = i2;
        }
    }

    public void setMinLines(int i2) {
        if (i2 <= 1) {
            setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.e = onClickListener;
        i();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        clickClose clickclose = this.c;
        if (!(clickclose == null || clickclose.q == colorStateList)) {
            clickclose.q = colorStateList;
            clickclose.k = clickclose.z ? InfoDialog_ViewBinding.d(clickclose.q) : null;
            clickclose.onStateChange(clickclose.getState());
        }
        if (!this.c.z) {
            h();
        }
    }

    public void setRippleColorResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            ColorStateList b = setPrimaryBackground.b(clickclose.n, i2);
            if (clickclose.q != b) {
                clickclose.q = b;
                clickclose.k = clickclose.z ? InfoDialog_ViewBinding.d(clickclose.q) : null;
                clickclose.onStateChange(clickclose.getState());
            }
            if (!this.c.z) {
                h();
            }
        }
    }

    @Override // o.KategoriTujuanTransaksiORDialog
    public void setShapeAppearanceModel(JenisPekerjaanDialog jenisPekerjaanDialog) {
        this.c.setShapeAppearanceModel(jenisPekerjaanDialog);
    }

    public void setShowMotionSpec(BaseKonfirmasiDialog baseKonfirmasiDialog) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.w = baseKonfirmasiDialog;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.w = BaseKonfirmasiDialog.b(clickclose.n, i2);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            CharSequence charSequence2 = charSequence;
            if (charSequence == null) {
                charSequence2 = "";
            }
            setText(clickclose.v ? null : charSequence2, bufferType);
            clickClose clickclose2 = this.c;
            if (clickclose2 != null) {
                clickclose2.b(charSequence2);
            }
        }
    }

    public void setTextAppearance(int i2) {
        setTextAppearance(i2);
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.x.d(new InfoCaraPembayaranDialog(clickclose.n, i2), clickclose.n);
        }
        l();
    }

    public void setTextAppearance(Context context, int i2) {
        setTextAppearance(context, i2);
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.x.d(new InfoCaraPembayaranDialog(clickclose.n, i2), clickclose.n);
        }
        l();
    }

    public void setTextAppearance(InfoCaraPembayaranDialog infoCaraPembayaranDialog) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.x.d(infoCaraPembayaranDialog, clickclose.n);
        }
        l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.k(f2);
        }
    }

    public void setTextEndPaddingResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.k(clickclose.n.getResources().getDimension(i2));
        }
    }

    public void setTextStartPadding(float f2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.o(f2);
        }
    }

    public void setTextStartPaddingResource(int i2) {
        clickClose clickclose = this.c;
        if (clickclose != null) {
            clickclose.o(clickclose.n.getResources().getDimension(i2));
        }
    }
}
