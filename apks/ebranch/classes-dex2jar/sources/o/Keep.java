package o;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
/* loaded from: classes-dex2jar.jar:o/Keep.class */
public final class Keep implements getResources$MediaBrowserCompat$CustomActionResultReceiver {
    private final RemoteActionCompatParcelizer a;
    public View.OnClickListener b;
    public Drawable c;
    public boolean d;
    public final getResources e;
    private final int f;
    private final int g;
    private setCustomView h;
    private boolean i;
    private boolean j;

    /* renamed from: o */
    private boolean f97o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/Keep$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements RemoteActionCompatParcelizer {
        private final Activity a;

        IconCompatParcelizer(Activity activity) {
            this.a = activity;
        }

        @Override // o.Keep.RemoteActionCompatParcelizer
        public final void a(int i) {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i);
            }
        }

        @Override // o.Keep.RemoteActionCompatParcelizer
        public final Context c() {
            ActionBar actionBar = this.a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.a;
        }

        @Override // o.Keep.RemoteActionCompatParcelizer
        public final void c(Drawable drawable, int i) {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
            }
        }

        @Override // o.Keep.RemoteActionCompatParcelizer
        public final boolean d() {
            ActionBar actionBar = this.a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // o.Keep.RemoteActionCompatParcelizer
        public final Drawable e() {
            TypedArray obtainStyledAttributes = c().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/Keep$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void a(int i);

        Context c();

        void c(Drawable drawable, int i);

        boolean d();

        Drawable e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/Keep$write.class */
    public static class write implements RemoteActionCompatParcelizer {
        final CharSequence a;
        final setInputType b;
        final Drawable e;

        write(setInputType setinputtype) {
            this.b = setinputtype;
            ImageButton imageButton = setinputtype.g;
            CharSequence charSequence = null;
            this.e = imageButton != null ? imageButton.getDrawable() : null;
            ImageButton imageButton2 = setinputtype.g;
            this.a = imageButton2 != null ? imageButton2.getContentDescription() : charSequence;
        }

        @Override // o.Keep.RemoteActionCompatParcelizer
        public void a(int i) {
            if (i == 0) {
                this.b.setNavigationContentDescription(this.a);
            } else {
                this.b.setNavigationContentDescription(i);
            }
        }

        @Override // o.Keep.RemoteActionCompatParcelizer
        public Context c() {
            return this.b.getContext();
        }

        @Override // o.Keep.RemoteActionCompatParcelizer
        public void c(Drawable drawable, int i) {
            this.b.setNavigationIcon(drawable);
            a(i);
        }

        @Override // o.Keep.RemoteActionCompatParcelizer
        public boolean d() {
            return true;
        }

        @Override // o.Keep.RemoteActionCompatParcelizer
        public Drawable e() {
            return this.e;
        }
    }

    public Keep(Activity activity, getResources getresources, setInputType setinputtype, int i, int i2) {
        this(activity, setinputtype, getresources, null, 2131820716, 2131820715);
    }

    private Keep(Activity activity, setInputType setinputtype, getResources getresources, setCustomView setcustomview, int i, int i2) {
        this.j = true;
        this.d = true;
        this.f97o = false;
        if (setinputtype != null) {
            this.a = new write(setinputtype);
            setinputtype.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.Keep.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (Keep.this.d) {
                        Keep keep = Keep.this;
                        int c = keep.e.c(8388611);
                        getResources getresources2 = keep.e;
                        View d = getresources2.d(8388611);
                        if ((d != null ? getresources2.g(d) : false) && c != 2) {
                            keep.e.b(8388611, true);
                        } else if (c != 1) {
                            keep.e.a(8388611, true);
                        }
                    } else if (Keep.this.b != null) {
                        Keep.this.b.onClick(view);
                    }
                }
            });
        } else if (activity instanceof Keep$MediaBrowserCompat$CustomActionResultReceiver) {
            this.a = ((Keep$MediaBrowserCompat$CustomActionResultReceiver) activity).a();
        } else {
            this.a = new IconCompatParcelizer(activity);
        }
        this.e = getresources;
        this.g = i;
        this.f = i2;
        if (setcustomview == null) {
            this.h = new setCustomView(this.a.c());
        } else {
            this.h = setcustomview;
        }
        this.c = this.a.e();
    }

    private void b(float f) {
        if (f == 1.0f) {
            setCustomView setcustomview = this.h;
            if (!setcustomview.e) {
                setcustomview.e = true;
                setcustomview.invalidateSelf();
            }
        } else if (f == 0.0f) {
            setCustomView setcustomview2 = this.h;
            if (setcustomview2.e) {
                setcustomview2.e = false;
                setcustomview2.invalidateSelf();
            }
        }
        setCustomView setcustomview3 = this.h;
        if (setcustomview3.a != f) {
            setcustomview3.a = f;
            setcustomview3.invalidateSelf();
        }
    }

    public final void a() {
        getResources getresources = this.e;
        View d = getresources.d(8388611);
        boolean z = false;
        if (d != null ? getresources.c(d) : false) {
            b(1.0f);
        } else {
            b(0.0f);
        }
        if (this.d) {
            setCustomView setcustomview = this.h;
            getResources getresources2 = this.e;
            View d2 = getresources2.d(8388611);
            if (d2 != null) {
                z = getresources2.c(d2);
            }
            a(setcustomview, z ? this.f : this.g);
        }
    }

    public final void a(Drawable drawable, int i) {
        if (!this.f97o && !this.a.d()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f97o = true;
        }
        this.a.c(drawable, i);
    }

    @Override // o.getResources$MediaBrowserCompat$CustomActionResultReceiver
    public final void b() {
        b(0.0f);
        if (this.d) {
            this.a.a(this.g);
        }
    }

    @Override // o.getResources$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(float f) {
        if (this.j) {
            b(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            b(0.0f);
        }
    }

    @Override // o.getResources$MediaBrowserCompat$CustomActionResultReceiver
    public final void e() {
        b(1.0f);
        if (this.d) {
            this.a.a(this.f);
        }
    }

    public final void e(Drawable drawable) {
        if (drawable == null) {
            this.c = this.a.e();
            this.i = false;
        } else {
            this.c = drawable;
            this.i = true;
        }
        if (!this.d) {
            a(this.c, 0);
        }
    }
}
