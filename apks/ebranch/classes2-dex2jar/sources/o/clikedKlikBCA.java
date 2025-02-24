package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import o.Page6DBCADollarSFragment;
/* loaded from: classes2-dex2jar.jar:o/clikedKlikBCA.class */
public final class clikedKlikBCA extends FrameLayout {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private Context g;
    private int h;
    private int i;
    private int j;
    private boolean l = false;
    private View m;
    private TextView n;

    /* renamed from: o  reason: collision with root package name */
    private int f64o;

    public clikedKlikBCA(Context context) {
        super(context);
        this.g = context;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.G);
        c(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public clikedKlikBCA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = context;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.G);
        c(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public clikedKlikBCA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = context;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.G);
        c(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    private void c(TypedArray typedArray) {
        float applyDimension = (float) ((int) TypedValue.applyDimension(1, 2.0f, this.g.getResources().getDisplayMetrics()));
        float applyDimension2 = (float) ((int) TypedValue.applyDimension(1, 24.0f, this.g.getResources().getDisplayMetrics()));
        int color = typedArray.getColor(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.I, inset.d(this.g.getResources(), Page6DBCADollarSFragment.RemoteActionCompatParcelizer.e, (Resources.Theme) null));
        float dimension = typedArray.getDimension(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.K, applyDimension);
        float dimension2 = typedArray.getDimension(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.N, (float) ((int) TypedValue.applyDimension(1, (float) 0, this.g.getResources().getDisplayMetrics())));
        float dimension3 = typedArray.getDimension(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.M, 2.0f);
        float dimension4 = typedArray.getDimension(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.P, 2.0f);
        float dimension5 = typedArray.getDimension(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.S, 2.0f);
        float f = typedArray.getDimension(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.Q, 2.0f);
        this.l = typedArray.getBoolean(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.ab, false);
        this.f64o = typedArray.getResourceId(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.Y, Page6DBCADollarSFragment.write.a);
        this.f = inset.d(this.g.getResources(), Page6DBCADollarSFragment.RemoteActionCompatParcelizer.d, (Resources.Theme) null);
        boolean z = typedArray.getBoolean(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.E, false);
        float dimension6 = typedArray.getDimension(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.af, applyDimension2);
        String string = typedArray.getString(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.aj);
        int resourceId = typedArray.getResourceId(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.aa, inset.d(this.g.getResources(), Page6DBCADollarSFragment.RemoteActionCompatParcelizer.d, (Resources.Theme) null));
        this.a = typedArray.getResourceId(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.ag, resourceId);
        this.h = typedArray.getResourceId(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.ad, resourceId);
        this.j = typedArray.getResourceId(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.ah, resourceId);
        this.i = typedArray.getResourceId(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.ae, resourceId);
        this.e = typedArray.getColor(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.H, inset.d(this.g.getResources(), Page6DBCADollarSFragment.RemoteActionCompatParcelizer.e, (Resources.Theme) null));
        this.c = typedArray.getColor(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.J, inset.d(this.g.getResources(), Page6DBCADollarSFragment.RemoteActionCompatParcelizer.a, (Resources.Theme) null));
        this.d = typedArray.getColor(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.L, inset.d(this.g.getResources(), Page6DBCADollarSFragment.RemoteActionCompatParcelizer.b, (Resources.Theme) null));
        this.b = typedArray.getColor(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.O, inset.d(this.g.getResources(), Page6DBCADollarSFragment.RemoteActionCompatParcelizer.e, (Resources.Theme) null));
        setBackgroundResource(resourceId);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        TextView textView = new TextView(this.g);
        this.n = textView;
        textView.setGravity(17);
        if (string != null) {
            try {
                this.n.setTypeface(Typeface.createFromAsset(this.g.getAssets(), string));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.n.setTextColor(color);
        this.n.setTextSize(0, dimension6);
        addView(this.n, layoutParams);
        if (z) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) dimension);
            layoutParams2.gravity = 80;
            if (dimension2 != 0.0f) {
                f = dimension2;
                dimension5 = dimension2;
                dimension3 = dimension2;
                dimension4 = dimension2;
            }
            layoutParams2.leftMargin = (int) dimension5;
            layoutParams2.rightMargin = (int) dimension4;
            layoutParams2.bottomMargin = (int) dimension3;
            layoutParams2.topMargin = (int) f;
            View view = new View(this.g);
            this.m = view;
            addView(view, layoutParams2);
        }
    }

    public final void setText(String str) {
        if (!this.l) {
            TextView textView = this.n;
            if (textView != null) {
                textView.setText(str);
                return;
            }
            return;
        }
        this.n.setText("");
        if (str.equals("")) {
            this.n.setBackgroundResource(this.f);
        } else {
            this.n.setBackgroundResource(this.f64o);
        }
    }

    public final void setViewState(int i) {
        if (i == -1) {
            View view = this.m;
            if (view != null) {
                view.setBackgroundColor(this.d);
            }
            setBackgroundResource(this.i);
        } else if (i == 0) {
            View view2 = this.m;
            if (view2 != null) {
                view2.setBackgroundColor(this.c);
            }
            setBackgroundResource(this.h);
        } else if (i == 1) {
            View view3 = this.m;
            if (view3 != null) {
                view3.setBackgroundColor(this.e);
            }
            setBackgroundResource(this.a);
        } else if (i == 2) {
            View view4 = this.m;
            if (view4 != null) {
                view4.setBackgroundColor(this.b);
            }
            setBackgroundResource(this.j);
        }
    }
}
