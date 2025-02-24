package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import o.BaseDialogKotlin;
import o.getChildFragmentManager;
import o.setDropDownBackgroundResource;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes2-dex2jar.jar:o/FiturReservasiGuestDialog_ViewBinding.class */
public final class FiturReservasiGuestDialog_ViewBinding implements setDropDownBackgroundResource {
    public IconCompatParcelizer a;
    boolean b;
    ColorStateList c;
    public LinearLayout d;
    public int e;
    int f;
    int g;
    int h;
    Drawable i;
    public FiturSignUpDialog k;
    public LayoutInflater l;
    setOnDismissListener m;

    /* renamed from: o */
    int f27o;
    boolean q;
    int r;
    int s;
    public int t;
    private setDropDownBackgroundResource.IconCompatParcelizer u;
    ColorStateList w;
    public boolean j = true;
    public int p = -1;
    final View.OnClickListener n = new View.OnClickListener() { // from class: o.FiturReservasiGuestDialog_ViewBinding.5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FingerprintSuccessDialog fingerprintSuccessDialog = (FingerprintSuccessDialog) view;
            IconCompatParcelizer iconCompatParcelizer = FiturReservasiGuestDialog_ViewBinding.this.a;
            boolean z = true;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.g = true;
            }
            setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = fingerprintSuccessDialog.j;
            boolean d = FiturReservasiGuestDialog_ViewBinding.this.m.d(setexpandactivityoverflowbuttondrawable, FiturReservasiGuestDialog_ViewBinding.this, 0);
            if (setexpandactivityoverflowbuttondrawable == null || !setexpandactivityoverflowbuttondrawable.isCheckable() || !d) {
                z = false;
            } else {
                FiturReservasiGuestDialog_ViewBinding.this.a.c(setexpandactivityoverflowbuttondrawable);
            }
            IconCompatParcelizer iconCompatParcelizer2 = FiturReservasiGuestDialog_ViewBinding.this.a;
            if (iconCompatParcelizer2 != null) {
                iconCompatParcelizer2.g = false;
            }
            if (z) {
                FiturReservasiGuestDialog_ViewBinding.this.c(false);
            }
        }
    };

    /* loaded from: classes2-dex2jar.jar:o/FiturReservasiGuestDialog_ViewBinding$IconCompatParcelizer.class */
    public final class IconCompatParcelizer extends setOnStartEnterTransitionListener.MediaBrowserCompat.CustomActionResultReceiver<FiturReservasiGuestDialog_ViewBinding$MediaSessionCompat$ResultReceiverWrapper> {
        final ArrayList<read> b = new ArrayList<>();
        private setExpandActivityOverflowButtonDrawable f;
        public boolean g;

        public IconCompatParcelizer() {
            FiturReservasiGuestDialog_ViewBinding.this = r5;
            d();
        }

        public final /* synthetic */ setOnStartEnterTransitionListener.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$SearchResultReceiver(FiturReservasiGuestDialog_ViewBinding.this.l, viewGroup, FiturReservasiGuestDialog_ViewBinding.this.n);
            }
            if (i == 1) {
                return new FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$ItemReceiver(FiturReservasiGuestDialog_ViewBinding.this.l, viewGroup);
            }
            if (i == 2) {
                return new MediaDescriptionCompat(FiturReservasiGuestDialog_ViewBinding.this.l, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new RemoteActionCompatParcelizer(FiturReservasiGuestDialog_ViewBinding.this.d);
        }

        final int b() {
            int i = FiturReservasiGuestDialog_ViewBinding.this.d.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < FiturReservasiGuestDialog_ViewBinding.this.a.b.size(); i2++) {
                i = i;
                if (FiturReservasiGuestDialog_ViewBinding.this.a.d(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        public final int c() {
            return this.b.size();
        }

        public final long c(int i) {
            return (long) i;
        }

        public final void c(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
            if (this.f != setexpandactivityoverflowbuttondrawable && setexpandactivityoverflowbuttondrawable.isCheckable()) {
                setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable2 = this.f;
                if (setexpandactivityoverflowbuttondrawable2 != null) {
                    setexpandactivityoverflowbuttondrawable2.setChecked(false);
                }
                this.f = setexpandactivityoverflowbuttondrawable;
                setexpandactivityoverflowbuttondrawable.setChecked(true);
            }
        }

        public final /* synthetic */ void c(setOnStartEnterTransitionListener.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable lifecycleOnBackPressedCancellable) {
            FiturReservasiGuestDialog_ViewBinding$MediaSessionCompat$ResultReceiverWrapper fiturReservasiGuestDialog_ViewBinding$MediaSessionCompat$ResultReceiverWrapper = (FiturReservasiGuestDialog_ViewBinding$MediaSessionCompat$ResultReceiverWrapper) lifecycleOnBackPressedCancellable;
            if (fiturReservasiGuestDialog_ViewBinding$MediaSessionCompat$ResultReceiverWrapper instanceof FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$SearchResultReceiver) {
                FingerprintSuccessDialog fingerprintSuccessDialog = (FingerprintSuccessDialog) fiturReservasiGuestDialog_ViewBinding$MediaSessionCompat$ResultReceiverWrapper.b;
                FrameLayout frameLayout = fingerprintSuccessDialog.e;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                fingerprintSuccessDialog.f.setCompoundDrawables(null, null, null, null);
            }
        }

        public final int d(int i) {
            read read = this.b.get(i);
            if (read instanceof FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver) {
                return 2;
            }
            if (read instanceof write) {
                return 3;
            }
            if (read instanceof FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem) {
                return ((FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem) read).c.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        void d() {
            if (!this.g) {
                this.g = true;
                this.b.clear();
                this.b.add(new write());
                int size = FiturReservasiGuestDialog_ViewBinding.this.m.e().size();
                int i = -1;
                int i2 = 0;
                boolean z = false;
                for (int i3 = 0; i3 < size; i3++) {
                    setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = (setExpandActivityOverflowButtonDrawable) FiturReservasiGuestDialog_ViewBinding.this.m.e().get(i3);
                    if (setexpandactivityoverflowbuttondrawable.isChecked()) {
                        c(setexpandactivityoverflowbuttondrawable);
                    }
                    if (setexpandactivityoverflowbuttondrawable.isCheckable()) {
                        setexpandactivityoverflowbuttondrawable.b = (setexpandactivityoverflowbuttondrawable.b & -5) | 0;
                    }
                    if (setexpandactivityoverflowbuttondrawable.hasSubMenu()) {
                        SubMenu subMenu = setexpandactivityoverflowbuttondrawable.getSubMenu();
                        i = i;
                        i2 = i2;
                        z = z;
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.b.add(new FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(FiturReservasiGuestDialog_ViewBinding.this.s, 0));
                            }
                            this.b.add(new FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem(setexpandactivityoverflowbuttondrawable));
                            int size2 = this.b.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                setExpandActivityOverflowButtonDrawable item = subMenu.getItem(i4);
                                z2 = z2;
                                if (item.isVisible()) {
                                    z2 = z2;
                                    if (!z2) {
                                        z2 = z2;
                                        if (item.getIcon() != null) {
                                            z2 = true;
                                        }
                                    }
                                    if (item.isCheckable()) {
                                        item.b = (item.b & -5) | 0;
                                    }
                                    if (setexpandactivityoverflowbuttondrawable.isChecked()) {
                                        c(setexpandactivityoverflowbuttondrawable);
                                    }
                                    this.b.add(new FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem(item));
                                }
                            }
                            i = i;
                            i2 = i2;
                            z = z;
                            if (z2) {
                                int size4 = this.b.size();
                                while (true) {
                                    i = i;
                                    i2 = i2;
                                    z = z;
                                    if (size2 < size4) {
                                        ((FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem) this.b.get(size2)).a = true;
                                        size2++;
                                    }
                                }
                            }
                        }
                    } else {
                        i = setexpandactivityoverflowbuttondrawable.getGroupId();
                        if (i != i) {
                            int size5 = this.b.size();
                            boolean z3 = setexpandactivityoverflowbuttondrawable.getIcon() != null;
                            i2 = size5;
                            z = z3;
                            if (i3 != 0) {
                                i2 = size5 + 1;
                                this.b.add(new FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(FiturReservasiGuestDialog_ViewBinding.this.s, FiturReservasiGuestDialog_ViewBinding.this.s));
                                z = z3;
                            }
                        } else {
                            i2 = i2;
                            z = z;
                            if (!z) {
                                i2 = i2;
                                z = z;
                                if (setexpandactivityoverflowbuttondrawable.getIcon() != null) {
                                    int size6 = this.b.size();
                                    for (int i5 = i2; i5 < size6; i5++) {
                                        ((FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem) this.b.get(i5)).a = true;
                                    }
                                    z = true;
                                    i2 = i2;
                                }
                            }
                        }
                        FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem fiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem = new FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem(setexpandactivityoverflowbuttondrawable);
                        fiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem.a = z;
                        this.b.add(fiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem);
                    }
                }
                this.g = false;
            }
        }

        public final Bundle e() {
            Bundle bundle = new Bundle();
            setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = this.f;
            if (setexpandactivityoverflowbuttondrawable != null) {
                bundle.putInt("android:menu:checked", setexpandactivityoverflowbuttondrawable.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                read read = this.b.get(i);
                if (read instanceof FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem) {
                    setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable2 = ((FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem) read).c;
                    View actionView = setexpandactivityoverflowbuttondrawable2 != null ? setexpandactivityoverflowbuttondrawable2.getActionView() : null;
                    if (actionView != null) {
                        FiturSignUpDialog_ViewBinding fiturSignUpDialog_ViewBinding = new FiturSignUpDialog_ViewBinding();
                        actionView.saveHierarchyState(fiturSignUpDialog_ViewBinding);
                        sparseArray.put(setexpandactivityoverflowbuttondrawable2.getItemId(), fiturSignUpDialog_ViewBinding);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [o.FingerprintSuccessDialog, android.view.View] */
        /* JADX WARN: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final /* synthetic */ void e(o.setOnStartEnterTransitionListener.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable r7, int r8) {
            /*
            // Method dump skipped, instructions count: 316
            */
            throw new UnsupportedOperationException("Method not decompiled: o.FiturReservasiGuestDialog_ViewBinding.IconCompatParcelizer.e(o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable, int):void");
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/FiturReservasiGuestDialog_ViewBinding$MediaDescriptionCompat.class */
    static final class MediaDescriptionCompat extends FiturReservasiGuestDialog_ViewBinding$MediaSessionCompat$ResultReceiverWrapper {
        public MediaDescriptionCompat(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(BaseDialogKotlin$MediaBrowserCompat$MediaItem.g, viewGroup, false));
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/FiturReservasiGuestDialog_ViewBinding$MediaMetadataCompat.class */
    public final class MediaMetadataCompat extends setHideReplaced {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(setOnStartEnterTransitionListener setonstartentertransitionlistener) {
            super(setonstartentertransitionlistener);
            FiturReservasiGuestDialog_ViewBinding.this = r4;
        }

        public final void b(View view, getChildFragmentManager getchildfragmentmanager) {
            b(view, getchildfragmentmanager);
            getchildfragmentmanager.c(getChildFragmentManager.MediaBrowserCompat.CustomActionResultReceiver.e(FiturReservasiGuestDialog_ViewBinding.this.a.b(), 0, false));
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/FiturReservasiGuestDialog_ViewBinding$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer extends FiturReservasiGuestDialog_ViewBinding$MediaSessionCompat$ResultReceiverWrapper {
        public RemoteActionCompatParcelizer(View view) {
            super(view);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/FiturReservasiGuestDialog_ViewBinding$read.class */
    public interface read {
    }

    /* loaded from: classes2-dex2jar.jar:o/FiturReservasiGuestDialog_ViewBinding$write.class */
    public static final class write implements read {
        write() {
        }
    }

    public final int a() {
        return this.e;
    }

    public final void a(int i) {
        this.g = i;
        IconCompatParcelizer iconCompatParcelizer = this.a;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.d();
            ((setOnStartEnterTransitionListener.MediaBrowserCompat.CustomActionResultReceiver) iconCompatParcelizer).a.b();
        }
    }

    public final boolean a(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return false;
    }

    public final boolean a(setTextAppearance settextappearance) {
        return false;
    }

    public final void b(int i) {
        this.r = i;
        this.q = true;
        IconCompatParcelizer iconCompatParcelizer = this.a;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.d();
            ((setOnStartEnterTransitionListener.MediaBrowserCompat.CustomActionResultReceiver) iconCompatParcelizer).a.b();
        }
    }

    public final void b(ColorStateList colorStateList) {
        this.c = colorStateList;
        IconCompatParcelizer iconCompatParcelizer = this.a;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.d();
            ((setOnStartEnterTransitionListener.MediaBrowserCompat.CustomActionResultReceiver) iconCompatParcelizer).a.b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v69, types: [o.FiturSignUpDialog, android.view.View] */
    public final void b(Parcelable parcelable) {
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable;
        View actionView;
        FiturSignUpDialog_ViewBinding fiturSignUpDialog_ViewBinding;
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.k.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                IconCompatParcelizer iconCompatParcelizer = this.a;
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    iconCompatParcelizer.g = true;
                    int size = iconCompatParcelizer.b.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        read read2 = iconCompatParcelizer.b.get(i2);
                        if ((read2 instanceof FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem) && (setexpandactivityoverflowbuttondrawable2 = ((FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem) read2).c) != null && setexpandactivityoverflowbuttondrawable2.getItemId() == i) {
                            iconCompatParcelizer.c(setexpandactivityoverflowbuttondrawable2);
                            break;
                        }
                        i2++;
                    }
                    iconCompatParcelizer.g = false;
                    iconCompatParcelizer.d();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = iconCompatParcelizer.b.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        read read3 = iconCompatParcelizer.b.get(i3);
                        if (!(!(read3 instanceof FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem) || (setexpandactivityoverflowbuttondrawable = ((FiturReservasiGuestDialog_ViewBinding$MediaBrowserCompat$MediaItem) read3).c) == null || (actionView = setexpandactivityoverflowbuttondrawable.getActionView()) == null || (fiturSignUpDialog_ViewBinding = (FiturSignUpDialog_ViewBinding) sparseParcelableArray2.get(setexpandactivityoverflowbuttondrawable.getItemId())) == null)) {
                            actionView.restoreHierarchyState(fiturSignUpDialog_ViewBinding);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.d.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [o.FiturSignUpDialog, android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void c() {
        /*
            r6 = this;
            r0 = r6
            android.widget.LinearLayout r0 = r0.d
            int r0 = r0.getChildCount()
            if (r0 != 0) goto L_0x0019
            r0 = r6
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x0019
            r0 = r6
            int r0 = r0.t
            r7 = r0
            goto L_0x001b
        L_0x0019:
            r0 = 0
            r7 = r0
        L_0x001b:
            r0 = r6
            o.FiturSignUpDialog r0 = r0.k
            r8 = r0
            r0 = r8
            r1 = 0
            r2 = r7
            r3 = 0
            r4 = r8
            int r4 = r4.getPaddingBottom()
            r0.setPadding(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.FiturReservasiGuestDialog_ViewBinding.c():void");
    }

    public final void c(int i) {
        this.h = i;
        IconCompatParcelizer iconCompatParcelizer = this.a;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.d();
            ((setOnStartEnterTransitionListener.MediaBrowserCompat.CustomActionResultReceiver) iconCompatParcelizer).a.b();
        }
    }

    public final void c(setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer) {
        this.u = iconCompatParcelizer;
    }

    public final void c(boolean z) {
        IconCompatParcelizer iconCompatParcelizer = this.a;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.d();
            ((setOnStartEnterTransitionListener.MediaBrowserCompat.CustomActionResultReceiver) iconCompatParcelizer).a.b();
        }
    }

    public final boolean c(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return false;
    }

    public final void d(int i) {
        this.f27o = i;
        IconCompatParcelizer iconCompatParcelizer = this.a;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.d();
            ((setOnStartEnterTransitionListener.MediaBrowserCompat.CustomActionResultReceiver) iconCompatParcelizer).a.b();
        }
    }

    public final void e(int i) {
        if (this.f != i) {
            this.f = i;
            this.b = true;
            IconCompatParcelizer iconCompatParcelizer = this.a;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.d();
                ((setOnStartEnterTransitionListener.MediaBrowserCompat.CustomActionResultReceiver) iconCompatParcelizer).a.b();
            }
        }
    }

    public final void e(Context context, setOnDismissListener setondismisslistener) {
        this.l = LayoutInflater.from(context);
        this.m = setondismisslistener;
        this.s = context.getResources().getDimensionPixelOffset(BaseDialogKotlin.read.g);
    }

    public final void e(ColorStateList colorStateList) {
        this.w = colorStateList;
        IconCompatParcelizer iconCompatParcelizer = this.a;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.d();
            ((setOnStartEnterTransitionListener.MediaBrowserCompat.CustomActionResultReceiver) iconCompatParcelizer).a.b();
        }
    }

    public final void e(Drawable drawable) {
        this.i = drawable;
        IconCompatParcelizer iconCompatParcelizer = this.a;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.d();
            ((setOnStartEnterTransitionListener.MediaBrowserCompat.CustomActionResultReceiver) iconCompatParcelizer).a.b();
        }
    }

    public final void e(setOnDismissListener setondismisslistener, boolean z) {
        setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer = this.u;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.a(setondismisslistener, z);
        }
    }

    public final boolean e() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [o.FiturSignUpDialog, android.view.View] */
    public final Parcelable i() {
        Bundle bundle = new Bundle();
        if (this.k != null) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            this.k.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        IconCompatParcelizer iconCompatParcelizer = this.a;
        if (iconCompatParcelizer != null) {
            bundle.putBundle("android:menu:adapter", iconCompatParcelizer.e());
        }
        if (this.d != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.d.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }
}
