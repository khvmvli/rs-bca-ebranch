package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import o.setDropDownBackgroundResource;
import o.setInputType;
import o.setOnDismissListener;
/* loaded from: classes-dex2jar.jar:o/setQuery.class */
public final class setQuery implements setSelector {
    setInputType a;
    private setButtonDrawable b;
    boolean c;
    CharSequence d;
    Window.Callback e;
    private View f;
    private int g;
    private Drawable h;
    private CharSequence i;
    private int j;
    private int k;
    private Drawable l;
    private CharSequence m;
    private Drawable n;

    /* renamed from: o */
    private Drawable f266o;
    private View q;
    private boolean s;

    public setQuery(setInputType setinputtype, boolean z) {
        this(setinputtype, z, setHasDecor$MediaBrowserCompat$ItemReceiver.c);
    }

    private setQuery(setInputType setinputtype, boolean z, int i) {
        int i2;
        Drawable drawable;
        this.k = 0;
        this.j = 0;
        this.a = setinputtype;
        this.d = setinputtype.f;
        this.m = setinputtype.h;
        this.s = this.d != null;
        ImageButton imageButton = setinputtype.g;
        CharSequence charSequence = null;
        this.l = imageButton != null ? imageButton.getDrawable() : null;
        Context context = setinputtype.getContext();
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(null, setHasDecor$MediaBrowserCompat$MediaItem.e, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.d, 0));
        this.h = seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.n);
        if (z) {
            CharSequence text = seticonifiedbydefault.d.getText(setHasDecor$MediaBrowserCompat$MediaItem.p);
            if (!TextUtils.isEmpty(text)) {
                this.s = true;
                this.d = text;
                if ((this.g & 8) != 0) {
                    this.a.setTitle(text);
                }
            }
            CharSequence text2 = seticonifiedbydefault.d.getText(setHasDecor$MediaBrowserCompat$MediaItem.s);
            if (!TextUtils.isEmpty(text2)) {
                this.m = text2;
                if ((this.g & 8) != 0) {
                    this.a.setSubtitle(text2);
                }
            }
            Drawable d = seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.q);
            if (d != null) {
                this.n = d;
                t();
            }
            Drawable d2 = seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.k);
            if (d2 != null) {
                this.f266o = d2;
                t();
            }
            if (this.l == null && (drawable = this.h) != null) {
                this.l = drawable;
                s();
            }
            e(seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.i, 0));
            int resourceId = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.h, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(this.a.getContext()).inflate(resourceId, (ViewGroup) this.a, false);
                View view = this.f;
                if (!(view == null || (this.g & 16) == 0)) {
                    this.a.removeView(view);
                }
                this.f = inflate;
                if (!(inflate == null || (this.g & 16) == 0)) {
                    this.a.addView(inflate);
                }
                e(this.g | 16);
            }
            int layoutDimension = seticonifiedbydefault.d.getLayoutDimension(setHasDecor$MediaBrowserCompat$MediaItem.m, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.a.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = seticonifiedbydefault.d.getDimensionPixelOffset(setHasDecor$MediaBrowserCompat$MediaItem.j, -1);
            int dimensionPixelOffset2 = seticonifiedbydefault.d.getDimensionPixelOffset(setHasDecor$MediaBrowserCompat$MediaItem.f, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                this.a.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.x, 0);
            if (resourceId2 != 0) {
                setInputType setinputtype2 = this.a;
                setinputtype2.setTitleTextAppearance(setinputtype2.getContext(), resourceId2);
            }
            int resourceId3 = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.t, 0);
            if (resourceId3 != 0) {
                setInputType setinputtype3 = this.a;
                setinputtype3.setSubtitleTextAppearance(setinputtype3.getContext(), resourceId3);
            }
            int resourceId4 = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.r, 0);
            if (resourceId4 != 0) {
                this.a.setPopupTheme(resourceId4);
            }
        } else {
            ImageButton imageButton2 = this.a.g;
            if ((imageButton2 != null ? imageButton2.getDrawable() : null) != null) {
                ImageButton imageButton3 = this.a.g;
                this.h = imageButton3 != null ? imageButton3.getDrawable() : null;
                i2 = 15;
            } else {
                i2 = 11;
            }
            this.g = i2;
        }
        seticonifiedbydefault.d.recycle();
        if (i != this.j) {
            this.j = i;
            ImageButton imageButton4 = this.a.g;
            if (TextUtils.isEmpty(imageButton4 != null ? imageButton4.getContentDescription() : null)) {
                int i3 = this.j;
                this.i = i3 == 0 ? null : this.a.getContext().getString(i3);
                q();
            }
        }
        ImageButton imageButton5 = this.a.g;
        this.i = imageButton5 != null ? imageButton5.getContentDescription() : charSequence;
        this.a.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.setQuery.1
            final setMenuCallbacks a;

            {
                this.a = new setMenuCallbacks(r10.a.getContext(), 0, 16908332, 0, r10.d);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (setQuery.this.e != null && setQuery.this.c) {
                    setQuery.this.e.onMenuItemSelected(0, this.a);
                }
            }
        });
    }

    private void q() {
        if ((this.g & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.i)) {
            this.a.setNavigationContentDescription(this.j);
        } else {
            this.a.setNavigationContentDescription(this.i);
        }
    }

    private void s() {
        if ((this.g & 4) != 0) {
            setInputType setinputtype = this.a;
            Drawable drawable = this.l;
            Drawable drawable2 = drawable;
            if (drawable == null) {
                drawable2 = this.h;
            }
            setinputtype.setNavigationIcon(drawable2);
            return;
        }
        this.a.setNavigationIcon((Drawable) null);
    }

    private void t() {
        Drawable drawable;
        int i = this.g;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            Drawable drawable2 = this.n;
            drawable = drawable2;
            if (drawable2 == null) {
                drawable = this.f266o;
            }
        } else {
            drawable = this.f266o;
        }
        this.a.setLogo(drawable);
    }

    @Override // o.setSelector
    public final void a() {
        setInputType.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.a.c;
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = remoteActionCompatParcelizer == null ? null : remoteActionCompatParcelizer.d;
        if (setexpandactivityoverflowbuttondrawable != null) {
            setexpandactivityoverflowbuttondrawable.collapseActionView();
        }
    }

    @Override // o.setSelector
    public final void a(int i) {
        this.f266o = i != 0 ? setPrimaryBackground.c(this.a.getContext(), i) : null;
        t();
    }

    @Override // o.setSelector
    public final void a(Drawable drawable) {
        this.l = drawable;
        s();
    }

    @Override // o.setSelector
    public final void a(CharSequence charSequence) {
        this.s = true;
        this.d = charSequence;
        if ((this.g & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    @Override // o.setSelector
    public final int b() {
        return this.g;
    }

    @Override // o.setSelector
    public final void b(int i) {
        this.i = i == 0 ? null : this.a.getContext().getString(i);
        q();
    }

    @Override // o.setSelector
    public final void b(Window.Callback callback) {
        this.e = callback;
    }

    @Override // o.setSelector
    public final void b(setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer, setOnDismissListener.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.a.setMenuCallbacks(iconCompatParcelizer, remoteActionCompatParcelizer);
    }

    @Override // o.setSelector
    public final void b(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // o.setSelector
    public final Context c() {
        return this.a.getContext();
    }

    @Override // o.setSelector
    public final void c(int i) {
        this.n = i != 0 ? setPrimaryBackground.c(this.a.getContext(), i) : null;
        t();
    }

    @Override // o.setSelector
    public final void c(setTabSelected settabselected) {
        setInputType setinputtype;
        View view = this.q;
        if (view != null && view.getParent() == (setinputtype = this.a)) {
            setinputtype.removeView(this.q);
        }
        this.q = settabselected;
        if (settabselected != null && this.k == 2) {
            this.a.addView(settabselected, 0);
            setInputType$MediaBrowserCompat$CustomActionResultReceiver setinputtype_mediabrowsercompat_customactionresultreceiver = (setInputType$MediaBrowserCompat$CustomActionResultReceiver) this.q.getLayoutParams();
            setinputtype_mediabrowsercompat_customactionresultreceiver.width = -2;
            setinputtype_mediabrowsercompat_customactionresultreceiver.height = -2;
            setinputtype_mediabrowsercompat_customactionresultreceiver.a = 8388691;
            settabselected.setAllowCollapse(true);
        }
    }

    @Override // o.setSelector
    public final void d() {
        setButtonDrawable setbuttondrawable;
        setSupportCompoundDrawablesTintMode setsupportcompounddrawablestintmode = this.a.j;
        if (setsupportcompounddrawablestintmode != null && (setbuttondrawable = setsupportcompounddrawablestintmode.b) != null) {
            setbuttondrawable.b();
        }
    }

    @Override // o.setSelector
    public final void d(int i) {
        this.a.setVisibility(i);
    }

    @Override // o.setSelector
    public final void d(CharSequence charSequence) {
        if (!this.s) {
            this.d = charSequence;
            if ((this.g & 8) != 0) {
                this.a.setTitle(charSequence);
            }
        }
    }

    @Override // o.setSelector
    public final generateActivityResultKey e(final int i, long j) {
        return findFragmentByWho.a(this.a).e(i == 0 ? 1.0f : 0.0f).a(j).d(new getAnimatingAway() { // from class: o.setQuery.5
            private boolean b = false;

            @Override // o.getAnimatingAway, o.getAllowReturnTransitionOverlap
            public final void b(View view) {
                setQuery.this.a.setVisibility(0);
            }

            @Override // o.getAnimatingAway, o.getAllowReturnTransitionOverlap
            public final void c(View view) {
                if (!this.b) {
                    setQuery.this.a.setVisibility(i);
                }
            }

            @Override // o.getAnimatingAway, o.getAllowReturnTransitionOverlap
            public final void d(View view) {
                this.b = true;
            }
        });
    }

    @Override // o.setSelector
    public final void e(int i) {
        View view;
        int i2 = this.g ^ i;
        this.g = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    q();
                }
                s();
            }
            if ((i2 & 3) != 0) {
                t();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.d);
                    this.a.setSubtitle(this.m);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f) != null) {
                if ((i & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    @Override // o.setSelector
    public final void e(Drawable drawable) {
        this.f266o = drawable;
        t();
    }

    @Override // o.setSelector
    public final void e(Menu menu, setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer) {
        if (this.b == null) {
            setButtonDrawable setbuttondrawable = new setButtonDrawable(this.a.getContext());
            this.b = setbuttondrawable;
            setbuttondrawable.e = setHasDecor$MediaBrowserCompat$SearchResultReceiver.g;
        }
        this.b.b = iconCompatParcelizer;
        this.a.setMenu((setOnDismissListener) menu, this.b);
    }

    @Override // o.setSelector
    public final boolean e() {
        setSupportCompoundDrawablesTintMode setsupportcompounddrawablestintmode;
        setInputType setinputtype = this.a;
        return setinputtype.getVisibility() == 0 && (setsupportcompounddrawablestintmode = setinputtype.j) != null && setsupportcompounddrawablestintmode.d;
    }

    @Override // o.setSelector
    public final ViewGroup f() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if ((r0 != null && r0.d()) != false) goto L_0x002e;
     */
    @Override // o.setSelector
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean g() {
        /*
            r2 = this;
            r0 = r2
            o.setInputType r0 = r0.a
            o.setSupportCompoundDrawablesTintMode r0 = r0.j
            r3 = r0
            r0 = 1
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L_0x002c
            r0 = r3
            o.setButtonDrawable r0 = r0.b
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0023
            r0 = r3
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0023
            r0 = 1
            r5 = r0
            goto L_0x0025
        L_0x0023:
            r0 = 0
            r5 = r0
        L_0x0025:
            r0 = r5
            if (r0 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r0 = 0
            r4 = r0
        L_0x002e:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setQuery.g():boolean");
    }

    @Override // o.setSelector
    public final boolean h() {
        setInputType.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.a.c;
        return (remoteActionCompatParcelizer == null || remoteActionCompatParcelizer.d == null) ? false : true;
    }

    @Override // o.setSelector
    public final Menu i() {
        return this.a.e();
    }

    @Override // o.setSelector
    public final int j() {
        return this.k;
    }

    @Override // o.setSelector
    public final void k() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // o.setSelector
    public final boolean l() {
        return this.a.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r5 == false) goto L_0x003e;
     */
    @Override // o.setSelector
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean m() {
        /*
            r2 = this;
            r0 = r2
            o.setInputType r0 = r0.a
            o.setSupportCompoundDrawablesTintMode r0 = r0.j
            r3 = r0
            r0 = 1
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L_0x003e
            r0 = r3
            o.setButtonDrawable r0 = r0.b
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0035
            r0 = r3
            o.setButtonDrawable$IconCompatParcelizer r0 = r0.r
            if (r0 != 0) goto L_0x002a
            r0 = r3
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x002a
            r0 = 0
            r5 = r0
            goto L_0x002c
        L_0x002a:
            r0 = 1
            r5 = r0
        L_0x002c:
            r0 = r5
            if (r0 == 0) goto L_0x0035
            r0 = 1
            r5 = r0
            goto L_0x0037
        L_0x0035:
            r0 = 0
            r5 = r0
        L_0x0037:
            r0 = r5
            if (r0 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r0 = 0
            r4 = r0
        L_0x0040:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setQuery.m():boolean");
    }

    @Override // o.setSelector
    public final void n() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // o.setSelector
    public final void o() {
        this.c = true;
    }

    @Override // o.setSelector
    public final boolean r() {
        return this.a.i();
    }
}
