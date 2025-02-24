package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import o.onCreateDialog;
import o.setCustomSelectionActionModeCallback;
import o.setDropDownBackgroundResource;
import o.setHasDecor;
import o.setOnDismissListener;
import o.setOnMenuItemClickListener;
import o.setSupportCompoundDrawablesTintMode;
/* loaded from: classes-dex2jar.jar:o/setButtonDrawable.class */
public class setButtonDrawable extends setExpandedActionViewsExclusive implements onCreateDialog.IconCompatParcelizer {
    private int A;
    private boolean C;
    private boolean D;
    read g;
    boolean i;
    write k;
    Drawable l;
    int m;
    boolean n;

    /* renamed from: o */
    setButtonDrawable$MediaBrowserCompat$CustomActionResultReceiver f202o;
    boolean q;
    IconCompatParcelizer r;
    boolean t;
    private int u;
    private int v;
    private int w;
    private RemoteActionCompatParcelizer x;
    private boolean y;
    private final SparseBooleanArray s = new SparseBooleanArray();
    final MediaMetadataCompat p = new MediaMetadataCompat();

    /* loaded from: classes-dex2jar.jar:o/setButtonDrawable$IconCompatParcelizer.class */
    public final class IconCompatParcelizer implements Runnable {
        private setButtonDrawable$MediaBrowserCompat$CustomActionResultReceiver a;

        public IconCompatParcelizer(setButtonDrawable$MediaBrowserCompat$CustomActionResultReceiver setbuttondrawable_mediabrowsercompat_customactionresultreceiver) {
            setButtonDrawable.this = r4;
            this.a = setbuttondrawable_mediabrowsercompat_customactionresultreceiver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            setOnDismissListener setondismisslistener;
            setOnDismissListener.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
            if (!(setButtonDrawable.this.c == null || (remoteActionCompatParcelizer = (setondismisslistener = setButtonDrawable.this.c).b) == null)) {
                remoteActionCompatParcelizer.e(setondismisslistener);
            }
            View view = (View) setButtonDrawable.this.h;
            if (!(view == null || view.getWindowToken() == null || !this.a.d())) {
                setButtonDrawable.this.f202o = this.a;
            }
            setButtonDrawable.this.r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setButtonDrawable$MediaMetadataCompat.class */
    public final class MediaMetadataCompat implements setDropDownBackgroundResource.IconCompatParcelizer {
        MediaMetadataCompat() {
            setButtonDrawable.this = r4;
        }

        @Override // o.setDropDownBackgroundResource.IconCompatParcelizer
        public final void a(setOnDismissListener setondismisslistener, boolean z) {
            if (setondismisslistener instanceof setTextAppearance) {
                setondismisslistener.d().d(false);
            }
            setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer = setButtonDrawable.this.b;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.a(setondismisslistener, z);
            }
        }

        @Override // o.setDropDownBackgroundResource.IconCompatParcelizer
        public final boolean a(setOnDismissListener setondismisslistener) {
            boolean z = false;
            if (setondismisslistener == setButtonDrawable.this.c) {
                return false;
            }
            setButtonDrawable.this.m = ((setTextAppearance) setondismisslistener).getItem().getItemId();
            setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer = setButtonDrawable.this.b;
            if (iconCompatParcelizer != null) {
                z = iconCompatParcelizer.a(setondismisslistener);
            }
            return z;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setButtonDrawable$RemoteActionCompatParcelizer.class */
    final class RemoteActionCompatParcelizer extends setOnMenuItemClickListener.RemoteActionCompatParcelizer {
        RemoteActionCompatParcelizer() {
            setButtonDrawable.this = r4;
        }

        @Override // o.setOnMenuItemClickListener.RemoteActionCompatParcelizer
        public final setSupportBackgroundTintMode c() {
            setInitialActivityCount setinitialactivitycount;
            if (setButtonDrawable.this.g != null) {
                read read = setButtonDrawable.this.g;
                if (read.c == null) {
                    read.c = read.e();
                }
                setinitialactivitycount = read.c;
            } else {
                setinitialactivitycount = null;
            }
            return setinitialactivitycount;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setButtonDrawable$read.class */
    public final class read extends setBackgroundDrawable {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(Context context, setTextAppearance settextappearance, View view) {
            super(context, settextappearance, view, false, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.k);
            setButtonDrawable.this = r8;
            if (!((((setExpandActivityOverflowButtonDrawable) settextappearance.getItem()).b & 32) == 32)) {
                d(r8.k == null ? (View) r8.h : r8.k);
            }
            c(r8.p);
        }

        @Override // o.setBackgroundDrawable
        public final void a() {
            setButtonDrawable.this.g = null;
            setButtonDrawable.this.m = 0;
            a();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setButtonDrawable$write.class */
    public final class write extends setDropDownHorizontalOffset implements setSupportCompoundDrawablesTintMode.IconCompatParcelizer {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(Context context) {
            super(context, null, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.l);
            setButtonDrawable.this = r8;
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setOnSearchClickListener.b(this, getContentDescription());
            setOnTouchListener(new setOrientation(this) { // from class: o.setButtonDrawable.write.4
                @Override // o.setOrientation
                public final boolean c() {
                    setButtonDrawable.this.f();
                    return true;
                }

                @Override // o.setOrientation
                public final setSupportBackgroundTintMode d() {
                    if (setButtonDrawable.this.f202o == null) {
                        return null;
                    }
                    setButtonDrawable$MediaBrowserCompat$CustomActionResultReceiver setbuttondrawable_mediabrowsercompat_customactionresultreceiver = setButtonDrawable.this.f202o;
                    if (setbuttondrawable_mediabrowsercompat_customactionresultreceiver.c == null) {
                        setbuttondrawable_mediabrowsercompat_customactionresultreceiver.c = setbuttondrawable_mediabrowsercompat_customactionresultreceiver.e();
                    }
                    return setbuttondrawable_mediabrowsercompat_customactionresultreceiver.c;
                }

                @Override // o.setOrientation
                public final boolean e() {
                    if (setButtonDrawable.this.r != null) {
                        return false;
                    }
                    setButtonDrawable.this.d();
                    return true;
                }
            });
        }

        @Override // o.setSupportCompoundDrawablesTintMode.IconCompatParcelizer
        public final boolean c() {
            return false;
        }

        @Override // o.setSupportCompoundDrawablesTintMode.IconCompatParcelizer
        public final boolean d() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (performClick()) {
                return true;
            }
            playSoundEffect(0);
            setButtonDrawable.this.f();
            return true;
        }

        @Override // android.widget.ImageView
        protected final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                getInsetsForType.c(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public setButtonDrawable(Context context) {
        super(context, setHasDecor.MediaMetadataCompat.b, setHasDecor.MediaMetadataCompat.d);
    }

    @Override // o.setExpandedActionViewsExclusive
    public final setCustomSelectionActionModeCallback a(ViewGroup viewGroup) {
        setCustomSelectionActionModeCallback setcustomselectionactionmodecallback = this.h;
        setCustomSelectionActionModeCallback a = a(viewGroup);
        if (setcustomselectionactionmodecallback != a) {
            ((setSupportCompoundDrawablesTintMode) a).setPresenter(this);
        }
        return a;
    }

    @Override // o.setExpandedActionViewsExclusive, o.setDropDownBackgroundResource
    public final boolean a(setTextAppearance settextappearance) {
        View view;
        boolean z = false;
        if (!settextappearance.hasVisibleItems()) {
            return false;
        }
        setTextAppearance settextappearance2 = settextappearance;
        while (settextappearance2.q != this.c) {
            settextappearance2 = (setTextAppearance) settextappearance2.q;
        }
        MenuItem item = settextappearance2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.h;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                view = viewGroup.getChildAt(i);
                if ((view instanceof setCustomSelectionActionModeCallback.read) && ((setCustomSelectionActionModeCallback.read) view).a() == item) {
                    break;
                }
            }
        }
        view = null;
        if (view == null) {
            return false;
        }
        this.m = settextappearance.getItem().getItemId();
        int size = settextappearance.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item2 = settextappearance.getItem(i2);
            if (item2.isVisible() && item2.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        read read2 = new read(this.d, settextappearance, view);
        this.g = read2;
        read2.e = z;
        setInitialActivityCount setinitialactivitycount = read2.c;
        if (setinitialactivitycount != null) {
            setinitialactivitycount.d(z);
        }
        this.g.c();
        a(settextappearance);
        return true;
    }

    @Override // o.setDropDownBackgroundResource
    public final void b(Parcelable parcelable) {
        MenuItem findItem;
        if (parcelable instanceof setButtonDrawable$MediaBrowserCompat$SearchResultReceiver) {
            setButtonDrawable$MediaBrowserCompat$SearchResultReceiver setbuttondrawable_mediabrowsercompat_searchresultreceiver = (setButtonDrawable$MediaBrowserCompat$SearchResultReceiver) parcelable;
            if (setbuttondrawable_mediabrowsercompat_searchresultreceiver.c > 0 && (findItem = this.c.findItem(setbuttondrawable_mediabrowsercompat_searchresultreceiver.c)) != null) {
                a((setTextAppearance) findItem.getSubMenu());
            }
        }
    }

    @Override // o.setExpandedActionViewsExclusive
    public final void b(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable, setCustomSelectionActionModeCallback.read read2) {
        read2.e(setexpandactivityoverflowbuttondrawable);
        setOnMenuItemClickListener setonmenuitemclicklistener = (setOnMenuItemClickListener) read2;
        setonmenuitemclicklistener.setItemInvoker((setSupportCompoundDrawablesTintMode) this.h);
        if (this.x == null) {
            this.x = new RemoteActionCompatParcelizer();
        }
        setonmenuitemclicklistener.setPopupCallback(this.x);
    }

    public final boolean b() {
        boolean z;
        boolean d = d();
        read read2 = this.g;
        if (read2 != null) {
            read2.b();
            z = true;
        } else {
            z = false;
        }
        return d | z;
    }

    @Override // o.setExpandedActionViewsExclusive, o.setDropDownBackgroundResource
    public final void c(boolean z) {
        ArrayList<setExpandActivityOverflowButtonDrawable> arrayList;
        c(z);
        ((View) this.h).requestLayout();
        if (this.c != null) {
            setOnDismissListener setondismisslistener = this.c;
            setondismisslistener.a();
            ArrayList<setExpandActivityOverflowButtonDrawable> arrayList2 = setondismisslistener.d;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                onCreateDialog oncreatedialog = arrayList2.get(i).c;
                if (oncreatedialog != null) {
                    oncreatedialog.c(this);
                }
            }
        }
        if (this.c != null) {
            setOnDismissListener setondismisslistener2 = this.c;
            setondismisslistener2.a();
            arrayList = setondismisslistener2.l;
        } else {
            arrayList = null;
        }
        boolean z2 = false;
        if (this.t) {
            z2 = false;
            if (arrayList != null) {
                int size2 = arrayList.size();
                if (size2 == 1) {
                    z2 = !arrayList.get(0).isActionViewExpanded();
                } else {
                    z2 = false;
                    if (size2 > 0) {
                        z2 = true;
                    }
                }
            }
        }
        if (z2) {
            if (this.k == null) {
                this.k = new write(this.j);
            }
            ViewGroup viewGroup = (ViewGroup) this.k.getParent();
            if (viewGroup != this.h) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.k);
                }
                setSupportCompoundDrawablesTintMode setsupportcompounddrawablestintmode = (setSupportCompoundDrawablesTintMode) this.h;
                setsupportcompounddrawablestintmode.addView(this.k, setsupportcompounddrawablestintmode.d());
            }
        } else {
            write write2 = this.k;
            if (write2 != null && write2.getParent() == this.h) {
                ((ViewGroup) this.h).removeView(this.k);
            }
        }
        ((setSupportCompoundDrawablesTintMode) this.h).setOverflowReserved(this.t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        if ((r0 != null && r0.f()) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean c() {
        /*
            r2 = this;
            r0 = r2
            o.setButtonDrawable$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.f202o
            r3 = r0
            r0 = 1
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0029
            r0 = r3
            o.setInitialActivityCount r0 = r0.c
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0020
            r0 = r3
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0020
            r0 = 1
            r5 = r0
            goto L_0x0022
        L_0x0020:
            r0 = 0
            r5 = r0
        L_0x0022:
            r0 = r5
            if (r0 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r0 = 0
            r4 = r0
        L_0x002b:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setButtonDrawable.c():boolean");
    }

    @Override // o.setExpandedActionViewsExclusive
    public final boolean c(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.k) {
            return false;
        }
        return c(viewGroup, i);
    }

    @Override // o.setExpandedActionViewsExclusive
    public final View d(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable, View view, ViewGroup viewGroup) {
        View actionView = setexpandactivityoverflowbuttondrawable.getActionView();
        if (actionView == null || setexpandactivityoverflowbuttondrawable.a()) {
            actionView = d(setexpandactivityoverflowbuttondrawable, view, viewGroup);
        }
        actionView.setVisibility(setexpandactivityoverflowbuttondrawable.isActionViewExpanded() ? 8 : 0);
        setSupportCompoundDrawablesTintMode setsupportcompounddrawablestintmode = (setSupportCompoundDrawablesTintMode) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!setsupportcompounddrawablestintmode.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(setsupportcompounddrawablestintmode.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public final void d(setSupportCompoundDrawablesTintMode setsupportcompounddrawablestintmode) {
        this.h = setsupportcompounddrawablestintmode;
        setsupportcompounddrawablestintmode.e = this.c;
    }

    public final boolean d() {
        if (this.r == null || this.h == null) {
            setButtonDrawable$MediaBrowserCompat$CustomActionResultReceiver setbuttondrawable_mediabrowsercompat_customactionresultreceiver = this.f202o;
            if (setbuttondrawable_mediabrowsercompat_customactionresultreceiver == null) {
                return false;
            }
            setbuttondrawable_mediabrowsercompat_customactionresultreceiver.b();
            return true;
        }
        ((View) this.h).removeCallbacks(this.r);
        this.r = null;
        return true;
    }

    @Override // o.setExpandedActionViewsExclusive, o.setDropDownBackgroundResource
    public final void e(Context context, setOnDismissListener setondismisslistener) {
        e(context, setondismisslistener);
        Resources resources = context.getResources();
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = new setHideOnContentScrollEnabled(context);
        if (!this.q) {
            this.t = true;
        }
        if (!this.D) {
            this.A = sethideoncontentscrollenabled.e.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.y) {
            this.w = sethideoncontentscrollenabled.c();
        }
        int i = this.A;
        if (this.t) {
            if (this.k == null) {
                write write2 = new write(this.j);
                this.k = write2;
                if (this.n) {
                    write2.setImageDrawable(this.l);
                    this.l = null;
                    this.n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.v = i;
        this.u = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // o.setExpandedActionViewsExclusive, o.setDropDownBackgroundResource
    public final void e(setOnDismissListener setondismisslistener, boolean z) {
        d();
        read read2 = this.g;
        if (read2 != null) {
            read2.b();
        }
        e(setondismisslistener, z);
    }

    @Override // o.onCreateDialog.IconCompatParcelizer
    public final void e(boolean z) {
        if (z) {
            a((setTextAppearance) null);
        } else if (this.c != null) {
            this.c.d(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
        if ((r17 + r18) > r11) goto L_0x00d9;
     */
    @Override // o.setExpandedActionViewsExclusive, o.setDropDownBackgroundResource
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean e() {
        /*
        // Method dump skipped, instructions count: 926
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setButtonDrawable.e():boolean");
    }

    @Override // o.setExpandedActionViewsExclusive
    public final boolean e(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return (setexpandactivityoverflowbuttondrawable.b & 32) == 32;
    }

    public final boolean f() {
        if (!this.t || c() || this.c == null || this.h == null || this.r != null) {
            return false;
        }
        setOnDismissListener setondismisslistener = this.c;
        setondismisslistener.a();
        if (setondismisslistener.l.isEmpty()) {
            return false;
        }
        this.r = new IconCompatParcelizer(new setButtonDrawable$MediaBrowserCompat$CustomActionResultReceiver(this, this.d, this.c, this.k, true));
        ((View) this.h).post(this.r);
        return true;
    }

    public final void g() {
        if (!this.y) {
            this.w = new setHideOnContentScrollEnabled(this.d).c();
        }
        if (this.c != null) {
            this.c.e(true);
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final Parcelable i() {
        setButtonDrawable$MediaBrowserCompat$SearchResultReceiver setbuttondrawable_mediabrowsercompat_searchresultreceiver = new setButtonDrawable$MediaBrowserCompat$SearchResultReceiver();
        setbuttondrawable_mediabrowsercompat_searchresultreceiver.c = this.m;
        return setbuttondrawable_mediabrowsercompat_searchresultreceiver;
    }
}
