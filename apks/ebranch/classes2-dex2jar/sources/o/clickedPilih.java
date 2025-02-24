package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.Arrays;
import o.BaseDialogKotlin;
import o.PendidikanTerakhirDialog;
import o.getChildFragmentManager;
/* loaded from: classes2-dex2jar.jar:o/clickedPilih.class */
class clickedPilih extends MessageDialog_ViewBinding implements PendidikanTerakhirDialog.RemoteActionCompatParcelizer {
    final int j;
    private final int k;
    final SparseArray<TextView> l;
    private float m;
    final PendidikanTerakhirDialog n;

    /* renamed from: o  reason: collision with root package name */
    private final int[] f63o;
    private final ColorStateList p;
    private final float[] q;
    private final RectF r;
    private final int s;
    private final int t;
    private final Rect v;
    private String[] w;
    private final onDismiss x;

    public clickedPilih(Context context) {
        this(context, null);
    }

    public clickedPilih(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.D);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public clickedPilih(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.v = new Rect();
        this.r = new RectF();
        this.l = new SparseArray<>();
        this.q = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.bw, i, BaseDialogKotlin.MediaDescriptionCompat.z);
        Resources resources = getResources();
        ColorStateList c = HubunganKeuanganDialog_ViewBinding.c(context, obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.bz);
        this.p = c;
        LayoutInflater.from(context).inflate(BaseDialogKotlin$MediaBrowserCompat$MediaItem.f10o, (ViewGroup) this, true);
        PendidikanTerakhirDialog pendidikanTerakhirDialog = (PendidikanTerakhirDialog) findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.k);
        this.n = pendidikanTerakhirDialog;
        this.j = resources.getDimensionPixelSize(BaseDialogKotlin.read.l);
        int colorForState = c.getColorForState(new int[]{16842913}, c.getDefaultColor());
        this.f63o = new int[]{colorForState, colorForState, c.getDefaultColor()};
        pendidikanTerakhirDialog.c.add(this);
        int defaultColor = setPrimaryBackground.b(context, BaseDialogKotlin.RemoteActionCompatParcelizer.f).getDefaultColor();
        ColorStateList c2 = HubunganKeuanganDialog_ViewBinding.c(context, obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.bv);
        setBackgroundColor(c2 != null ? c2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: o.clickedPilih.1
            /* JADX WARN: Type inference failed for: r0v1, types: [o.clickedPilih, android.view.View] */
            /* JADX WARN: Type inference failed for: r0v4, types: [o.clickedPilih, android.view.View] */
            /* JADX WARN: Type inference failed for: r0v7, types: [o.clickedPilih, android.view.View] */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (!clickedPilih.this.isShown()) {
                    return true;
                }
                clickedPilih.this.getViewTreeObserver().removeOnPreDrawListener(this);
                int height = clickedPilih.this.getHeight() / 2;
                int i2 = clickedPilih.this.n.d;
                clickedPilih.this.setRadius((height - i2) - clickedPilih.this.j);
                return true;
            }
        });
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.x = new onDismiss() { // from class: o.clickedPilih.2
            public final void b(View view, getChildFragmentManager getchildfragmentmanager) {
                b(view, getchildfragmentmanager);
                int intValue = ((Integer) view.getTag(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.w)).intValue();
                if (intValue > 0) {
                    getchildfragmentmanager.c(clickedPilih.this.l.get(intValue - 1));
                }
                getchildfragmentmanager.b(getChildFragmentManager.IconCompatParcelizer.c(0, 1, intValue, 1, false, view.isSelected()));
            }
        };
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.t = resources.getDimensionPixelSize(BaseDialogKotlin.read.A);
        this.s = resources.getDimensionPixelSize(BaseDialogKotlin.read.B);
        this.k = resources.getDimensionPixelSize(BaseDialogKotlin.read.f15o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b() {
        RectF rectF = this.n.a;
        for (int i = 0; i < this.l.size(); i++) {
            TextView textView = this.l.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.v);
                this.v.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.v);
                this.r.set(this.v);
                textView.getPaint().setShader(!RectF.intersects(rectF, this.r) ? null : new RadialGradient(rectF.centerX() - this.r.left, rectF.centerY() - this.r.top, rectF.width() * 0.5f, this.f63o, this.q, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }

    @Override // o.PendidikanTerakhirDialog.RemoteActionCompatParcelizer
    public final void d(float f, boolean z) {
        if (Math.abs(this.m - f) > 0.001f) {
            this.m = f;
            b();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getChildFragmentManager.d(accessibilityNodeInfo).c(getChildFragmentManager.MediaBrowserCompat.CustomActionResultReceiver.b(1, this.w.length, false, 1));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        onLayout(z, i, i2, i3, i4);
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.k) / Math.max(Math.max(((float) this.t) / ((float) displayMetrics.heightPixels), ((float) this.s) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setHandRotation(float f) {
        this.n.setHandRotation(f);
        b();
    }

    @Override // o.MessageDialog_ViewBinding
    public void setRadius(int i) {
        if (i != a()) {
            setRadius(i);
            this.n.setCircleRadius(a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setValues(String[] strArr, int i) {
        this.w = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.l.size();
        for (int i2 = 0; i2 < Math.max(this.w.length, size); i2++) {
            TextView textView = this.l.get(i2);
            if (i2 >= this.w.length) {
                removeView(textView);
                this.l.remove(i2);
            } else {
                TextView textView2 = textView;
                if (textView == null) {
                    textView2 = (TextView) from.inflate(BaseDialogKotlin$MediaBrowserCompat$MediaItem.n, (ViewGroup) this, false);
                    this.l.put(i2, textView2);
                    addView(textView2);
                }
                textView2.setVisibility(0);
                textView2.setText(this.w[i2]);
                textView2.setTag(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.w, Integer.valueOf(i2));
                findFragmentByWho.d(textView2, this.x);
                textView2.setTextColor(this.p);
                if (i != 0) {
                    textView2.setContentDescription(getResources().getString(i, this.w[i2]));
                }
            }
        }
    }
}
