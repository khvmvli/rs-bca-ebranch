package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import o.BindDimen;
import o.R;
/* loaded from: classes-dex2jar.jar:o/setOnFocusChangeListener.class */
public class setOnFocusChangeListener extends setDropDownHorizontalOffset {
    private static final BindBool<Throwable> d = new BindBool<Throwable>() { // from class: o.setOnFocusChangeListener.5
        @Override // o.BindBool
        public final /* synthetic */ void d(Throwable th) {
            Throwable th2 = th;
            if (copyNoRef.a(th2)) {
                AvailableBookingTimeActivity_ViewBinding.a("Unable to load composition.", th2);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th2);
        }
    };
    private static final String e;
    private String c;
    private int i;
    private BindAnim j;
    private boolean k;
    private BindBool<Throwable> m;
    private BindFont<BindAnim> n;
    private final BindBool<BindAnim> s = new BindBool<BindAnim>() { // from class: o.setOnFocusChangeListener.4
        @Override // o.BindBool
        public final /* synthetic */ void d(BindAnim bindAnim) {
            setOnFocusChangeListener.this.setComposition(bindAnim);
        }
    };
    private final BindBool<Throwable> w = new BindBool<Throwable>() { // from class: o.setOnFocusChangeListener.2
        @Override // o.BindBool
        public final /* synthetic */ void d(Throwable th) {
            Throwable th2 = th;
            if (setOnFocusChangeListener.this.f251o != 0) {
                setOnFocusChangeListener setonfocuschangelistener = setOnFocusChangeListener.this;
                setonfocuschangelistener.setImageResource(setonfocuschangelistener.f251o);
            }
            (setOnFocusChangeListener.this.m == null ? setOnFocusChangeListener.d : setOnFocusChangeListener.this.m).d(th2);
        }
    };

    /* renamed from: o */
    private int f251o = 0;
    public final setText a = new setText();
    public boolean b = false;
    private boolean p = false;
    private boolean r = false;
    private boolean l = false;
    private boolean h = false;
    private boolean g = true;
    private BindDrawable q = BindDrawable.AUTOMATIC;
    private final Set<Object> t = new HashSet();
    private int f = 0;

    /* renamed from: o.setOnFocusChangeListener$6 */
    /* loaded from: classes-dex2jar.jar:o/setOnFocusChangeListener$6.class */
    public static final /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[BindDrawable.values().length];
            e = iArr;
            try {
                iArr[BindDrawable.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                e[BindDrawable.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                e[BindDrawable.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    public setOnFocusChangeListener(Context context) {
        super(context);
        d(null, BindDimen.RemoteActionCompatParcelizer.d);
    }

    public setOnFocusChangeListener(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(attributeSet, BindDimen.RemoteActionCompatParcelizer.d);
    }

    public setOnFocusChangeListener(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(attributeSet, i);
    }

    private <T> void a(unbind unbind, T t, onClickBcaMobile<T> onclickbcamobile) {
        this.a.b(unbind, (unbind) t, (onClickBcaMobile<unbind>) onclickbcamobile);
    }

    private void b() {
        AvailableBookingTimeV2Activity availableBookingTimeV2Activity = this.a.c;
        boolean isRunning = availableBookingTimeV2Activity == null ? false : availableBookingTimeV2Activity.isRunning();
        setImageDrawable(null);
        setImageDrawable(this.a);
        if (isRunning) {
            this.a.b();
        }
    }

    private void c() {
        this.h = false;
        this.r = false;
        this.p = false;
        this.b = false;
        setText settext = this.a;
        settext.n.clear();
        settext.c.f();
        e();
    }

    private void d(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, BindDimen.IconCompatParcelizer.D, i, 0);
        this.g = obtainStyledAttributes.getBoolean(BindDimen.IconCompatParcelizer.E, true);
        boolean hasValue = obtainStyledAttributes.hasValue(BindDimen.IconCompatParcelizer.L);
        boolean hasValue2 = obtainStyledAttributes.hasValue(BindDimen.IconCompatParcelizer.G);
        boolean hasValue3 = obtainStyledAttributes.hasValue(BindDimen.IconCompatParcelizer.T);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(BindDimen.IconCompatParcelizer.L, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(BindDimen.IconCompatParcelizer.G);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(BindDimen.IconCompatParcelizer.T)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(BindDimen.IconCompatParcelizer.I, 0));
            if (obtainStyledAttributes.getBoolean(BindDimen.IconCompatParcelizer.C, false)) {
                this.r = true;
                this.h = true;
            }
            if (obtainStyledAttributes.getBoolean(BindDimen.IconCompatParcelizer.J, false)) {
                this.a.c.setRepeatCount(-1);
            }
            if (obtainStyledAttributes.hasValue(BindDimen.IconCompatParcelizer.P)) {
                setRepeatMode(obtainStyledAttributes.getInt(BindDimen.IconCompatParcelizer.P, 1));
            }
            if (obtainStyledAttributes.hasValue(BindDimen.IconCompatParcelizer.Q)) {
                setRepeatCount(obtainStyledAttributes.getInt(BindDimen.IconCompatParcelizer.Q, -1));
            }
            if (obtainStyledAttributes.hasValue(BindDimen.IconCompatParcelizer.S)) {
                setSpeed(obtainStyledAttributes.getFloat(BindDimen.IconCompatParcelizer.S, 1.0f));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(BindDimen.IconCompatParcelizer.N));
            setProgress(obtainStyledAttributes.getFloat(BindDimen.IconCompatParcelizer.K, 0.0f));
            boolean z2 = obtainStyledAttributes.getBoolean(BindDimen.IconCompatParcelizer.F, false);
            setText settext = this.a;
            if (settext.e != z2) {
                settext.e = z2;
                if (settext.d != null) {
                    settext.a();
                }
            }
            if (obtainStyledAttributes.hasValue(BindDimen.IconCompatParcelizer.H)) {
                a(new unbind("**"), value.b, new onClickBcaMobile(new tint(setPrimaryBackground.b(getContext(), obtainStyledAttributes.getResourceId(BindDimen.IconCompatParcelizer.H, -1)).getDefaultColor())));
            }
            if (obtainStyledAttributes.hasValue(BindDimen.IconCompatParcelizer.R)) {
                this.a.t = obtainStyledAttributes.getFloat(BindDimen.IconCompatParcelizer.R, 1.0f);
            }
            if (obtainStyledAttributes.hasValue(BindDimen.IconCompatParcelizer.O)) {
                int i2 = obtainStyledAttributes.getInt(BindDimen.IconCompatParcelizer.O, BindDrawable.AUTOMATIC.ordinal());
                int i3 = i2;
                if (i2 >= BindDrawable.values().length) {
                    i3 = BindDrawable.AUTOMATIC.ordinal();
                }
                setRenderMode(BindDrawable.values()[i3]);
            }
            setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(BindDimen.IconCompatParcelizer.M, false));
            obtainStyledAttributes.recycle();
            setText settext2 = this.a;
            if (copyNoRef.e(getContext()) != 0.0f) {
                z = true;
            }
            settext2.q = Boolean.valueOf(z).booleanValue();
            e();
            this.k = true;
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    private void d(BindFont<BindAnim> bindFont) {
        this.j = null;
        this.a.e();
        BindFont<BindAnim> bindFont2 = this.n;
        if (bindFont2 != null) {
            bindFont2.a(this.s);
            this.n.d(this.w);
        }
        this.n = bindFont.c(this.s).e(this.w);
    }

    public final void a() {
        if (isShown()) {
            this.a.d();
            e();
            return;
        }
        this.b = true;
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        apply.c("buildDrawingCache");
        this.f++;
        buildDrawingCache(z);
        if (this.f == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(BindDrawable.HARDWARE);
        }
        this.f--;
        apply.d("buildDrawingCache");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r5 != false) goto L_0x007e;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void e() {
        /*
            r4 = this;
            int[] r0 = o.setOnFocusChangeListener.AnonymousClass6.e
            r1 = r4
            o.BindDrawable r1 = r1.q
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L_0x007e
            r0 = r6
            r7 = r0
            r0 = r5
            r1 = 2
            if (r0 == r1) goto L_0x0080
            r0 = r5
            r1 = 3
            if (r0 == r1) goto L_0x0024
            r0 = r6
            r7 = r0
            goto L_0x0080
        L_0x0024:
            r0 = r4
            o.BindAnim r0 = r0.j
            r8 = r0
            r0 = 0
            r7 = r0
            r0 = r8
            if (r0 == 0) goto L_0x0046
            r0 = r8
            boolean r0 = r0.f
            if (r0 == 0) goto L_0x0046
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0046
            r0 = r7
            r5 = r0
            goto L_0x0078
        L_0x0046:
            r0 = r4
            o.BindAnim r0 = r0.j
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L_0x005f
            r0 = r8
            int r0 = r0.n
            r1 = 4
            if (r0 <= r1) goto L_0x005f
            r0 = r7
            r5 = r0
            goto L_0x0078
        L_0x005f:
            r0 = r7
            r5 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 == r1) goto L_0x0078
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 != r1) goto L_0x0076
            r0 = r7
            r5 = r0
            goto L_0x0078
        L_0x0076:
            r0 = 1
            r5 = r0
        L_0x0078:
            r0 = r6
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0080
        L_0x007e:
            r0 = 2
            r7 = r0
        L_0x0080:
            r0 = r7
            r1 = r4
            int r1 = r1.getLayerType()
            if (r0 == r1) goto L_0x008e
            r0 = r4
            r1 = r7
            r2 = 0
            r0.setLayerType(r1, r2)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnFocusChangeListener.e():void");
    }

    @Override // android.widget.ImageView, android.graphics.drawable.Drawable.Callback, android.view.View
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        setText settext = this.a;
        if (drawable2 == settext) {
            invalidateDrawable(settext);
        } else {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        onAttachedToWindow();
        if (!isInEditMode() && (this.h || this.r)) {
            if (isShown()) {
                this.a.d();
                e();
            } else {
                this.b = true;
            }
            this.h = false;
            this.r = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        AvailableBookingTimeV2Activity availableBookingTimeV2Activity = this.a.c;
        if (availableBookingTimeV2Activity == null ? false : availableBookingTimeV2Activity.isRunning()) {
            this.r = false;
            this.p = false;
            this.b = false;
            setText settext = this.a;
            settext.n.clear();
            settext.c.cancel();
            e();
            this.r = true;
        }
        onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver)) {
            onRestoreInstanceState(parcelable);
            return;
        }
        setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver = (setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver) parcelable;
        onRestoreInstanceState(setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.getSuperState());
        String str = setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.d;
        this.c = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.c);
        }
        int i = setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.b;
        this.i = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.e);
        if (setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.a) {
            if (isShown()) {
                this.a.d();
                e();
            } else {
                this.b = true;
            }
        }
        this.a.i = setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.c;
        setRepeatMode(setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.j);
        setRepeatCount(setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.i);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        boolean z;
        setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver = new setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver(onSaveInstanceState());
        setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.d = this.c;
        setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.b = this.i;
        setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.e = this.a.c.c();
        AvailableBookingTimeV2Activity availableBookingTimeV2Activity = this.a.c;
        if (!(availableBookingTimeV2Activity == null ? false : availableBookingTimeV2Activity.isRunning())) {
            z = false;
            if (!findFragmentByWho.F(this)) {
                if (!this.r) {
                    z = false;
                }
            }
            setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.a = z;
            setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.c = this.a.i;
            setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.j = this.a.c.getRepeatMode();
            setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.i = this.a.c.getRepeatCount();
            return setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver;
        }
        z = true;
        setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.a = z;
        setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.c = this.a.i;
        setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.j = this.a.c.getRepeatMode();
        setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver.i = this.a.c.getRepeatCount();
        return setonfocuschangelistener_mediabrowsercompat_customactionresultreceiver;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        if (this.k) {
            if (isShown()) {
                if (this.p) {
                    if (isShown()) {
                        this.a.b();
                        e();
                    } else {
                        this.b = false;
                        this.p = true;
                    }
                } else if (this.b) {
                    if (isShown()) {
                        this.a.d();
                        e();
                    } else {
                        this.b = true;
                    }
                }
                this.p = false;
                this.b = false;
                return;
            }
            AvailableBookingTimeV2Activity availableBookingTimeV2Activity = this.a.c;
            if (availableBookingTimeV2Activity == null ? false : availableBookingTimeV2Activity.isRunning()) {
                this.h = false;
                this.r = false;
                this.p = false;
                this.b = false;
                setText settext = this.a;
                settext.n.clear();
                settext.c.f();
                e();
                this.p = true;
            }
        }
    }

    public void setAnimation(final int i) {
        this.i = i;
        this.c = null;
        d(isInEditMode() ? new BindFont<>(new Callable<BindBitmap<BindAnim>>() { // from class: o.setOnFocusChangeListener.1
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ BindBitmap<BindAnim> call() throws Exception {
                return setOnFocusChangeListener.this.g ? Action.e(setOnFocusChangeListener.this.getContext(), i) : Action.a(setOnFocusChangeListener.this.getContext(), i, (String) null);
            }
        }, true) : this.g ? Action.d(getContext(), i) : Action.e(getContext(), i, null));
    }

    public void setAnimation(InputStream inputStream, String str) {
        d(Action.d(inputStream, str));
    }

    public void setAnimation(final String str) {
        this.c = str;
        this.i = 0;
        d(isInEditMode() ? new BindFont<>(new Callable<BindBitmap<BindAnim>>() { // from class: o.setOnFocusChangeListener.3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ BindBitmap<BindAnim> call() throws Exception {
                return setOnFocusChangeListener.this.g ? Action.b(setOnFocusChangeListener.this.getContext(), str) : Action.b(setOnFocusChangeListener.this.getContext(), str, null);
            }
        }, true) : this.g ? Action.c(getContext(), str) : Action.a(getContext(), str, (String) null));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str) {
        d(this.g ? Action.a(getContext(), str) : Action.d(getContext(), str, null));
    }

    public void setAnimationFromUrl(String str, String str2) {
        d(Action.d(getContext(), str, str2));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.a.l = z;
    }

    public void setCacheComposition(boolean z) {
        this.g = z;
    }

    public void setComposition(BindAnim bindAnim) {
        if (apply.c) {
            String str = e;
            StringBuilder sb = new StringBuilder("Set Composition \n");
            sb.append(bindAnim);
            Log.v(str, sb.toString());
        }
        this.a.setCallback(this);
        this.j = bindAnim;
        this.l = true;
        boolean c = this.a.c(bindAnim);
        this.l = false;
        e();
        if (getDrawable() != this.a || c) {
            if (!c) {
                b();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.t.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setFailureListener(BindBool<Throwable> bindBool) {
        this.m = bindBool;
    }

    public void setFallbackResource(int i) {
        this.f251o = i;
    }

    public void setFontAssetDelegate(setUserInputEnabled setuserinputenabled) {
        setText settext = this.a;
        settext.a = setuserinputenabled;
        R.styleable styleable = settext.g;
        if (styleable != null) {
            styleable.d = setuserinputenabled;
        }
    }

    public void setFrame(int i) {
        this.a.c(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.a.h = z;
    }

    public void setImageAssetDelegate(setLayoutDirection setlayoutdirection) {
        setText settext = this.a;
        settext.j = setlayoutdirection;
        Setter setter = settext.f;
        if (setter != null) {
            setter.b = setlayoutdirection;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.a.i = str;
    }

    @Override // o.setDropDownHorizontalOffset, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        BindFont<BindAnim> bindFont = this.n;
        if (bindFont != null) {
            bindFont.a(this.s);
            this.n.d(this.w);
        }
        setImageBitmap(bitmap);
    }

    @Override // o.setDropDownHorizontalOffset, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        BindFont<BindAnim> bindFont = this.n;
        if (bindFont != null) {
            bindFont.a(this.s);
            this.n.d(this.w);
        }
        setImageDrawable(drawable);
    }

    @Override // o.setDropDownHorizontalOffset, android.widget.ImageView
    public void setImageResource(int i) {
        BindFont<BindAnim> bindFont = this.n;
        if (bindFont != null) {
            bindFont.a(this.s);
            this.n.d(this.w);
        }
        setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.a.a(i);
    }

    public void setMaxFrame(String str) {
        this.a.e(str);
    }

    public void setMaxProgress(float f) {
        this.a.b(f);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.a.a(i, i2);
    }

    public void setMinAndMaxFrame(String str) {
        this.a.c(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.a.b(str, str2, z);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.a.c(f, f2);
    }

    public void setMinFrame(int i) {
        this.a.b(i);
    }

    public void setMinFrame(String str) {
        this.a.a(str);
    }

    public void setMinProgress(float f) {
        this.a.e(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        setText settext = this.a;
        if (settext.f277o != z) {
            settext.f277o = z;
            setAnimation setanimation = settext.b;
            if (setanimation != null) {
                setanimation.b(z);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        setText settext = this.a;
        settext.m = z;
        BindAnim bindAnim = settext.d;
        if (bindAnim != null) {
            bindAnim.f77o.c = z;
        }
    }

    public void setProgress(float f) {
        this.a.a(f);
    }

    public void setRenderMode(BindDrawable bindDrawable) {
        this.q = bindDrawable;
        e();
    }

    public void setRepeatCount(int i) {
        this.a.c.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.a.c.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.a.k = z;
    }

    public void setScale(float f) {
        this.a.t = f;
        if (getDrawable() == this.a) {
            b();
        }
    }

    public void setSpeed(float f) {
        this.a.c.h = f;
    }

    public void setTextDelegate(BindView bindView) {
        this.a.r = bindView;
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        setText settext;
        boolean z = false;
        if (!this.l && drawable == (settext = this.a)) {
            AvailableBookingTimeV2Activity availableBookingTimeV2Activity = settext.c;
            if (availableBookingTimeV2Activity == null ? false : availableBookingTimeV2Activity.isRunning()) {
                c();
                unscheduleDrawable(drawable);
            }
        }
        if (!this.l && (drawable instanceof setText)) {
            setText settext2 = (setText) drawable;
            AvailableBookingTimeV2Activity availableBookingTimeV2Activity2 = settext2.c;
            if (availableBookingTimeV2Activity2 != null) {
                z = availableBookingTimeV2Activity2.isRunning();
            }
            if (z) {
                settext2.n.clear();
                settext2.c.f();
            }
        }
        unscheduleDrawable(drawable);
    }
}
