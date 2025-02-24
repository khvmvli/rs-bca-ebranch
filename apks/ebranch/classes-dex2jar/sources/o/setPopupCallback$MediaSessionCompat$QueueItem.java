package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import java.lang.ref.WeakReference;
import o.setDropDownBackgroundResource;
import o.setHasDecor;
import o.setPopupTheme;
/* loaded from: classes-dex2jar.jar:o/setPopupCallback$MediaSessionCompat$QueueItem.class */
protected final class setPopupCallback$MediaSessionCompat$QueueItem {
    int a;
    Bundle b;
    int c;
    ViewGroup d;
    View e;
    boolean f;
    int g;
    setPopupTheme h;
    boolean i;
    boolean j;
    public boolean k;
    boolean l = false;
    setOnDismissListener m;
    boolean n;

    /* renamed from: o  reason: collision with root package name */
    Context f264o;
    int p;
    int q;
    View r;
    int s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setPopupCallback$MediaSessionCompat$QueueItem(int i) {
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(setOnDismissListener setondismisslistener) {
        setPopupTheme setpopuptheme;
        setOnDismissListener setondismisslistener2 = this.m;
        if (setondismisslistener != setondismisslistener2) {
            if (setondismisslistener2 != null) {
                setondismisslistener2.a(this.h);
            }
            this.m = setondismisslistener;
            if (setondismisslistener != null && (setpopuptheme = this.h) != null) {
                Context context = setondismisslistener.e;
                setondismisslistener.s.add(new WeakReference<>(setpopuptheme));
                setpopuptheme.e(context, setondismisslistener);
                setondismisslistener.i = true;
            }
        }
    }

    public final boolean a() {
        boolean z = false;
        if (this.r == null) {
            return false;
        }
        if (this.e != null) {
            return true;
        }
        setPopupTheme setpopuptheme = this.h;
        if (setpopuptheme.b == null) {
            setpopuptheme.b = new setPopupTheme.write();
        }
        if (setpopuptheme.b.getCount() > 0) {
            z = true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Context context) {
        TypedValue typedValue = new TypedValue();
        Resources.Theme newTheme = context.getResources().newTheme();
        newTheme.setTo(context.getTheme());
        newTheme.resolveAttribute(setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.e, typedValue, true);
        if (typedValue.resourceId != 0) {
            newTheme.applyStyle(typedValue.resourceId, true);
        }
        newTheme.resolveAttribute(setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.G, typedValue, true);
        if (typedValue.resourceId != 0) {
            newTheme.applyStyle(typedValue.resourceId, true);
        } else {
            newTheme.applyStyle(setHasDecor.MediaDescriptionCompat.a, true);
        }
        setShowingForActionMode setshowingforactionmode = new setShowingForActionMode(context, 0);
        setshowingforactionmode.getTheme().setTo(newTheme);
        this.f264o = setshowingforactionmode;
        TypedArray obtainStyledAttributes = setshowingforactionmode.obtainStyledAttributes(setHasDecor$MediaBrowserCompat$MediaItem.az);
        this.a = obtainStyledAttributes.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.aC, 0);
        this.q = obtainStyledAttributes.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.aF, 0);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setCustomSelectionActionModeCallback e(setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer) {
        if (this.m == null) {
            return null;
        }
        if (this.h == null) {
            setPopupTheme setpopuptheme = new setPopupTheme(this.f264o, setHasDecor.MediaMetadataCompat.m);
            this.h = setpopuptheme;
            setpopuptheme.c = iconCompatParcelizer;
            setOnDismissListener setondismisslistener = this.m;
            setPopupTheme setpopuptheme2 = this.h;
            Context context = setondismisslistener.e;
            setondismisslistener.s.add(new WeakReference<>(setpopuptheme2));
            setpopuptheme2.e(context, setondismisslistener);
            setondismisslistener.i = true;
        }
        setPopupTheme setpopuptheme3 = this.h;
        ViewGroup viewGroup = this.d;
        if (setpopuptheme3.j == null) {
            setpopuptheme3.j = (setActivityChooserModel) setpopuptheme3.a.inflate(setHasDecor.MediaMetadataCompat.h, viewGroup, false);
            if (setpopuptheme3.b == null) {
                setpopuptheme3.b = new setPopupTheme.write();
            }
            setpopuptheme3.j.setAdapter((ListAdapter) setpopuptheme3.b);
            setpopuptheme3.j.setOnItemClickListener(setpopuptheme3);
        }
        return setpopuptheme3.j;
    }
}
