package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import o.setHasDecor;
/* loaded from: classes-dex2jar.jar:o/setTextClassifier.class */
public final class setTextClassifier extends ViewGroup {
    final View a;
    int b;
    final Drawable c;
    final IconCompatParcelizer d;
    final FrameLayout e;
    int f;
    final ImageView g;
    final DataSetObserver h;
    final FrameLayout i;
    boolean j;
    private boolean k;
    onCreateDialog l;
    private final ImageView m;
    PopupWindow.OnDismissListener n;

    /* renamed from: o  reason: collision with root package name */
    private final read f278o;
    private final int p;
    private setAllowCollapse q;
    private final ViewTreeObserver.OnGlobalLayoutListener t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setTextClassifier$IconCompatParcelizer.class */
    public final class IconCompatParcelizer extends BaseAdapter {
        boolean a;
        int b = 4;
        setSupportButtonTintMode c;
        boolean d;
        boolean e;

        IconCompatParcelizer() {
        }

        public final int c() {
            int i = this.b;
            this.b = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.b = i;
            return i2;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            int e = this.c.e();
            int i = e;
            if (!this.e) {
                i = e;
                if (this.c.b() != null) {
                    i = e - 1;
                }
            }
            int min = Math.min(i, this.b);
            int i2 = min;
            if (this.d) {
                i2 = min + 1;
            }
            return i2;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                int i2 = i;
                if (!this.e) {
                    i2 = i;
                    if (this.c.b() != null) {
                        i2 = i + 1;
                    }
                }
                return this.c.a(i2);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return (long) i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i) {
            return (!this.d || i != getCount() - 1) ? 0 : 1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
            if (r7.getId() != o.setHasDecor$MediaBrowserCompat$SearchResultReceiver.y) goto L_0x0072;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
            if (r7.getId() != 1) goto L_0x0021;
         */
        @Override // android.widget.Adapter
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            /*
            // Method dump skipped, instructions count: 233
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setTextClassifier.IconCompatParcelizer.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setTextClassifier$read.class */
    public final class read implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        read() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view == setTextClassifier.this.e) {
                setTextClassifier.this.d();
                Intent e = setTextClassifier.this.d.c.e(setTextClassifier.this.d.c.b(setTextClassifier.this.d.c.b()));
                if (e != null) {
                    e.addFlags(524288);
                    setTextClassifier.this.getContext().startActivity(e);
                }
            } else if (view == setTextClassifier.this.i) {
                setTextClassifier.this.j = false;
                setTextClassifier settextclassifier = setTextClassifier.this;
                settextclassifier.b(settextclassifier.f);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            if (setTextClassifier.this.n != null) {
                setTextClassifier.this.n.onDismiss();
            }
            if (setTextClassifier.this.l != null) {
                setTextClassifier.this.l.d(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((IconCompatParcelizer) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                setTextClassifier.this.d();
                if (!setTextClassifier.this.j) {
                    int i2 = i;
                    if (!setTextClassifier.this.d.e) {
                        i2 = i + 1;
                    }
                    Intent e = setTextClassifier.this.d.c.e(i2);
                    if (e != null) {
                        e.addFlags(524288);
                        setTextClassifier.this.getContext().startActivity(e);
                    }
                } else if (i > 0) {
                    setTextClassifier.this.d.c.c(i);
                }
            } else if (itemViewType == 1) {
                setTextClassifier.this.b(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            if (view != setTextClassifier.this.e) {
                throw new IllegalArgumentException();
            } else if (setTextClassifier.this.d.getCount() <= 0) {
                return true;
            } else {
                setTextClassifier.this.j = true;
                setTextClassifier settextclassifier = setTextClassifier.this;
                settextclassifier.b(settextclassifier.f);
                return true;
            }
        }
    }

    public setTextClassifier(Context context) {
        this(context, null);
    }

    public setTextClassifier(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public setTextClassifier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new DataSetObserver() { // from class: o.setTextClassifier.2
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                onChanged();
                setTextClassifier.this.d.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                onInvalidated();
                setTextClassifier.this.d.notifyDataSetInvalidated();
            }
        };
        this.t = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.setTextClassifier.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (!setTextClassifier.this.a().f()) {
                    return;
                }
                if (!setTextClassifier.this.isShown()) {
                    setTextClassifier.this.a().c();
                    return;
                }
                setTextClassifier.this.a().j();
                if (setTextClassifier.this.l != null) {
                    setTextClassifier.this.l.d(true);
                }
            }
        };
        this.f = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.G, i, 0);
        findFragmentByWho.e(this, context, setHasDecor$MediaBrowserCompat$MediaItem.G, attributeSet, obtainStyledAttributes, i, 0);
        this.f = obtainStyledAttributes.getInt(setHasDecor$MediaBrowserCompat$MediaItem.E, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(setHasDecor$MediaBrowserCompat$MediaItem.F);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(setHasDecor.MediaMetadataCompat.a, (ViewGroup) this, true);
        read read2 = new read();
        this.f278o = read2;
        View findViewById = findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.i);
        this.a = findViewById;
        this.c = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.r);
        this.e = frameLayout;
        frameLayout.setOnClickListener(read2);
        frameLayout.setOnLongClickListener(read2);
        this.g = (ImageView) frameLayout.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.v);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.t);
        frameLayout2.setOnClickListener(read2);
        frameLayout2.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: o.setTextClassifier.4
            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                getChildFragmentManager.d(accessibilityNodeInfo).a(true);
            }
        });
        frameLayout2.setOnTouchListener(new setOrientation(frameLayout2) { // from class: o.setTextClassifier.3
            @Override // o.setOrientation
            protected final boolean c() {
                setTextClassifier.this.b();
                return true;
            }

            @Override // o.setOrientation
            public final setSupportBackgroundTintMode d() {
                return setTextClassifier.this.a();
            }

            @Override // o.setOrientation
            protected final boolean e() {
                setTextClassifier.this.d();
                return true;
            }
        });
        this.i = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.v);
        this.m = imageView;
        imageView.setImageDrawable(drawable);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        this.d = iconCompatParcelizer;
        iconCompatParcelizer.registerDataSetObserver(new DataSetObserver() { // from class: o.setTextClassifier.5
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                onChanged();
                setTextClassifier settextclassifier = setTextClassifier.this;
                if (settextclassifier.d.getCount() > 0) {
                    settextclassifier.i.setEnabled(true);
                } else {
                    settextclassifier.i.setEnabled(false);
                }
                int e = settextclassifier.d.c.e();
                int d = settextclassifier.d.c.d();
                if (e == 1 || (e > 1 && d > 0)) {
                    settextclassifier.e.setVisibility(0);
                    ResolveInfo b = settextclassifier.d.c.b();
                    PackageManager packageManager = settextclassifier.getContext().getPackageManager();
                    settextclassifier.g.setImageDrawable(b.loadIcon(packageManager));
                    if (settextclassifier.b != 0) {
                        settextclassifier.e.setContentDescription(settextclassifier.getContext().getString(settextclassifier.b, b.loadLabel(packageManager)));
                    }
                } else {
                    settextclassifier.e.setVisibility(8);
                }
                if (settextclassifier.e.getVisibility() == 0) {
                    settextclassifier.a.setBackgroundDrawable(settextclassifier.c);
                } else {
                    settextclassifier.a.setBackgroundDrawable(null);
                }
            }
        });
        Resources resources = context.getResources();
        this.p = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(setHasDecor.write.c));
    }

    final setAllowCollapse a() {
        if (this.q == null) {
            setAllowCollapse setallowcollapse = new setAllowCollapse(getContext());
            this.q = setallowcollapse;
            setallowcollapse.e(this.d);
            this.q.e(this);
            this.q.c(true);
            this.q.c(this.f278o);
            this.q.b(this.f278o);
        }
        return this.q;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final void b(int r6) {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTextClassifier.b(int):void");
    }

    public final boolean b() {
        if (a().f() || !this.k) {
            return false;
        }
        this.j = false;
        b(this.f);
        return true;
    }

    public final boolean d() {
        if (!a().f()) {
            return true;
        }
        a().c();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.t);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        onAttachedToWindow();
        setSupportButtonTintMode setsupportbuttontintmode = this.d.c;
        if (setsupportbuttontintmode != null) {
            setsupportbuttontintmode.registerObserver(this.h);
        }
        this.k = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        onDetachedFromWindow();
        setSupportButtonTintMode setsupportbuttontintmode = this.d.c;
        if (setsupportbuttontintmode != null) {
            setsupportbuttontintmode.unregisterObserver(this.h);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.t);
        }
        if (a().f()) {
            d();
        }
        this.k = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, 0, i3 - i, i4 - i2);
        if (!a().f()) {
            d();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        View view = this.a;
        int i3 = i2;
        if (this.e.getVisibility() != 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void setActivityChooserModel(setSupportButtonTintMode setsupportbuttontintmode) {
        IconCompatParcelizer iconCompatParcelizer = this.d;
        setSupportButtonTintMode setsupportbuttontintmode2 = setTextClassifier.this.d.c;
        if (setsupportbuttontintmode2 != null && setTextClassifier.this.isShown()) {
            setsupportbuttontintmode2.unregisterObserver(setTextClassifier.this.h);
        }
        iconCompatParcelizer.c = setsupportbuttontintmode;
        if (setsupportbuttontintmode != null && setTextClassifier.this.isShown()) {
            setsupportbuttontintmode.registerObserver(setTextClassifier.this.h);
        }
        iconCompatParcelizer.notifyDataSetChanged();
        if (a().f()) {
            d();
            b();
        }
    }

    public final void setDefaultActionButtonContentDescription(int i) {
        this.b = i;
    }

    public final void setExpandActivityOverflowButtonContentDescription(int i) {
        this.m.setContentDescription(getContext().getString(i));
    }

    public final void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.m.setImageDrawable(drawable);
    }

    public final void setInitialActivityCount(int i) {
        this.f = i;
    }

    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.n = onDismissListener;
    }

    public final void setProvider(onCreateDialog oncreatedialog) {
        this.l = oncreatedialog;
    }
}
