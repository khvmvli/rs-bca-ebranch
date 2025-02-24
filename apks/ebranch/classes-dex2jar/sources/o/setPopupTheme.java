package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o.setCustomSelectionActionModeCallback;
import o.setDropDownBackgroundResource;
import o.setExpandedFormat;
import o.setHasDecor;
/* loaded from: classes-dex2jar.jar:o/setPopupTheme.class */
public final class setPopupTheme implements setDropDownBackgroundResource, AdapterView.OnItemClickListener {
    public LayoutInflater a;
    public write b;
    public setDropDownBackgroundResource.IconCompatParcelizer c;
    int d;
    Context e;
    int f;
    int g;
    setOnDismissListener h;
    private int i;
    public setActivityChooserModel j;

    /* loaded from: classes-dex2jar.jar:o/setPopupTheme$write.class */
    public final class write extends BaseAdapter {
        private int c = -1;

        public write() {
            setPopupTheme.this = r4;
            e();
        }

        private void e() {
            setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = setPopupTheme.this.h.c;
            if (setexpandactivityoverflowbuttondrawable != null) {
                setOnDismissListener setondismisslistener = setPopupTheme.this.h;
                setondismisslistener.a();
                ArrayList<setExpandActivityOverflowButtonDrawable> arrayList = setondismisslistener.l;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == setexpandactivityoverflowbuttondrawable) {
                        this.c = i;
                        return;
                    }
                }
            }
            this.c = -1;
        }

        /* renamed from: c */
        public final setExpandActivityOverflowButtonDrawable getItem(int i) {
            setOnDismissListener setondismisslistener = setPopupTheme.this.h;
            setondismisslistener.a();
            ArrayList<setExpandActivityOverflowButtonDrawable> arrayList = setondismisslistener.l;
            int i2 = i + setPopupTheme.this.d;
            int i3 = this.c;
            int i4 = i2;
            if (i3 >= 0) {
                i4 = i2;
                if (i2 >= i3) {
                    i4 = i2 + 1;
                }
            }
            return arrayList.get(i4);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            setOnDismissListener setondismisslistener = setPopupTheme.this.h;
            setondismisslistener.a();
            int size = setondismisslistener.l.size() - setPopupTheme.this.d;
            return this.c < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return (long) i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = view;
            if (view == null) {
                view2 = setPopupTheme.this.a.inflate(setPopupTheme.this.f, viewGroup, false);
            }
            ((setCustomSelectionActionModeCallback.read) view2).e(getItem(i));
            return view2;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            e();
            notifyDataSetChanged();
        }
    }

    private setPopupTheme(int i, int i2) {
        this.f = i;
        this.g = 0;
    }

    public setPopupTheme(Context context, int i) {
        this(i, 0);
        this.e = context;
        this.a = LayoutInflater.from(context);
    }

    @Override // o.setDropDownBackgroundResource
    public final int a() {
        return this.i;
    }

    @Override // o.setDropDownBackgroundResource
    public final boolean a(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return false;
    }

    @Override // o.setDropDownBackgroundResource
    public final boolean a(setTextAppearance settextappearance) {
        if (!settextappearance.hasVisibleItems()) {
            return false;
        }
        setExpandActivityOverflowButtonContentDescription setexpandactivityoverflowbuttoncontentdescription = new setExpandActivityOverflowButtonContentDescription(settextappearance);
        setOnDismissListener setondismisslistener = setexpandactivityoverflowbuttoncontentdescription.a;
        setExpandedFormat.write write2 = new setExpandedFormat.write(setondismisslistener.e);
        setPopupTheme setpopuptheme = new setPopupTheme(write2.c.d, setHasDecor.MediaMetadataCompat.m);
        setexpandactivityoverflowbuttoncontentdescription.c = setpopuptheme;
        setpopuptheme.c = setexpandactivityoverflowbuttoncontentdescription;
        setOnDismissListener setondismisslistener2 = setexpandactivityoverflowbuttoncontentdescription.a;
        setPopupTheme setpopuptheme2 = setexpandactivityoverflowbuttoncontentdescription.c;
        Context context = setondismisslistener2.e;
        setondismisslistener2.s.add(new WeakReference<>(setpopuptheme2));
        setpopuptheme2.e(context, setondismisslistener2);
        setondismisslistener2.i = true;
        setPopupTheme setpopuptheme3 = setexpandactivityoverflowbuttoncontentdescription.c;
        if (setpopuptheme3.b == null) {
            setpopuptheme3.b = new write();
        }
        write2.d(setpopuptheme3.b, setexpandactivityoverflowbuttoncontentdescription);
        View view = setondismisslistener.h;
        if (view != null) {
            write2.c(view);
        } else {
            write2.e(setondismisslistener.j).e(setondismisslistener.g);
        }
        write2.e(setexpandactivityoverflowbuttoncontentdescription);
        setExpandedFormat b = write2.b();
        setexpandactivityoverflowbuttoncontentdescription.d = b;
        b.setOnDismissListener(setexpandactivityoverflowbuttoncontentdescription);
        WindowManager.LayoutParams attributes = setexpandactivityoverflowbuttoncontentdescription.d.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        setexpandactivityoverflowbuttoncontentdescription.d.show();
        setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer = this.c;
        if (iconCompatParcelizer == null) {
            return true;
        }
        iconCompatParcelizer.a(settextappearance);
        return true;
    }

    @Override // o.setDropDownBackgroundResource
    public final void b(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.j.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final void c(setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer) {
        this.c = iconCompatParcelizer;
    }

    @Override // o.setDropDownBackgroundResource
    public final void c(boolean z) {
        write write2 = this.b;
        if (write2 != null) {
            write2.notifyDataSetChanged();
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final boolean c(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return false;
    }

    @Override // o.setDropDownBackgroundResource
    public final void e(Context context, setOnDismissListener setondismisslistener) {
        if (this.g != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.g);
            this.e = contextThemeWrapper;
            this.a = LayoutInflater.from(contextThemeWrapper);
        } else if (this.e != null) {
            this.e = context;
            if (this.a == null) {
                this.a = LayoutInflater.from(context);
            }
        }
        this.h = setondismisslistener;
        write write2 = this.b;
        if (write2 != null) {
            write2.notifyDataSetChanged();
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final void e(setOnDismissListener setondismisslistener, boolean z) {
        setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer = this.c;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.a(setondismisslistener, z);
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final boolean e() {
        return false;
    }

    @Override // o.setDropDownBackgroundResource
    public final Parcelable i() {
        if (this.j == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        setActivityChooserModel setactivitychoosermodel = this.j;
        if (setactivitychoosermodel != null) {
            setactivitychoosermodel.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.h.d(this.b.getItem(i), this, 0);
    }
}
