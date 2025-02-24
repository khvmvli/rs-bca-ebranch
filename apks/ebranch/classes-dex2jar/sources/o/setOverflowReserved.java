package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import o.setCustomSelectionActionModeCallback;
import o.setHasDecor;
/* loaded from: classes-dex2jar.jar:o/setOverflowReserved.class */
public class setOverflowReserved extends LinearLayout implements setCustomSelectionActionModeCallback.read, AbsListView.SelectionBoundsAdjuster {
    private LinearLayout a;
    private CheckBox b;
    private boolean c;
    public setExpandActivityOverflowButtonDrawable d;
    private Drawable e;
    private boolean f;
    private ImageView g;
    private ImageView h;
    private LayoutInflater i;
    private boolean j;
    private ImageView k;
    private RadioButton l;
    private Drawable m;
    private int n;

    /* renamed from: o */
    private TextView f258o;
    private Context r;
    private TextView t;

    public setOverflowReserved(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.H);
    }

    public setOverflowReserved(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Context context2 = getContext();
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context2, context2.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.cf, i, 0));
        this.e = seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.ci);
        this.n = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.ce, -1);
        this.j = seticonifiedbydefault.d.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.cl, false);
        this.r = context;
        this.m = seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.cn);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.D, 0);
        this.f = obtainStyledAttributes.hasValue(0);
        seticonifiedbydefault.d.recycle();
        obtainStyledAttributes.recycle();
    }

    private void c() {
        if (this.i == null) {
            this.i = LayoutInflater.from(getContext());
        }
        RadioButton radioButton = (RadioButton) this.i.inflate(setHasDecor.MediaMetadataCompat.l, (ViewGroup) this, false);
        this.l = radioButton;
        d(radioButton);
    }

    private void d() {
        if (this.i == null) {
            this.i = LayoutInflater.from(getContext());
        }
        CheckBox checkBox = (CheckBox) this.i.inflate(setHasDecor.MediaMetadataCompat.g, (ViewGroup) this, false);
        this.b = checkBox;
        d(checkBox);
    }

    private void d(View view) {
        LinearLayout linearLayout = this.a;
        if (linearLayout != null) {
            linearLayout.addView(view, -1);
        } else {
            addView(view, -1);
        }
    }

    @Override // o.setCustomSelectionActionModeCallback.read
    public final setExpandActivityOverflowButtonDrawable a() {
        return this.d;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.g;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.g.getLayoutParams();
            rect.top += this.g.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    @Override // o.setCustomSelectionActionModeCallback.read
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void e(o.setExpandActivityOverflowButtonDrawable r5) {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOverflowReserved.e(o.setExpandActivityOverflowButtonDrawable):void");
    }

    @Override // o.setCustomSelectionActionModeCallback.read
    public final boolean e() {
        return false;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        onFinishInflate();
        findFragmentByWho.b(this, this.e);
        TextView textView = (TextView) findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.P);
        this.t = textView;
        int i = this.n;
        if (i != -1) {
            textView.setTextAppearance(this.r, i);
        }
        this.f258o = (TextView) findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.N);
        ImageView imageView = (ImageView) findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.R);
        this.k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.m);
        }
        this.g = (ImageView) findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.w);
        this.a = (LinearLayout) findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.k);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.h != null && this.j) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.h.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        View view;
        CompoundButton compoundButton;
        if (z || this.l != null || this.b != null) {
            if ((this.d.b & 4) != 0) {
                if (this.l == null) {
                    c();
                }
                compoundButton = this.l;
                view = this.b;
            } else {
                if (this.b == null) {
                    d();
                }
                compoundButton = this.b;
                view = this.l;
            }
            if (z) {
                compoundButton.setChecked(this.d.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.b;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.l;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.d.b & 4) != 0) {
            if (this.l == null) {
                c();
            }
            compoundButton = this.l;
        } else {
            if (this.b == null) {
                d();
            }
            compoundButton = this.b;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.c = z;
        this.j = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility((this.f || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.d.a.k || this.c;
        if (z || this.j) {
            ImageView imageView = this.h;
            if (imageView != null || drawable != null || this.j) {
                if (imageView == null) {
                    if (this.i == null) {
                        this.i = LayoutInflater.from(getContext());
                    }
                    ImageView imageView2 = (ImageView) this.i.inflate(setHasDecor.MediaMetadataCompat.k, (ViewGroup) this, false);
                    this.h = imageView2;
                    LinearLayout linearLayout = this.a;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.j) {
                    ImageView imageView3 = this.h;
                    if (!z) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.h.getVisibility() != 0) {
                        this.h.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.h.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void setShortcut(boolean r5, char r6) {
        /*
        // Method dump skipped, instructions count: 486
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOverflowReserved.setShortcut(boolean, char):void");
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.t.setText(charSequence);
            if (this.t.getVisibility() != 0) {
                this.t.setVisibility(0);
            }
        } else if (this.t.getVisibility() != 8) {
            this.t.setVisibility(8);
        }
    }
}
