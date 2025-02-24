package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* loaded from: classes-dex2jar.jar:o/setChecked.class */
public final class setChecked {
    public ListView A;
    int B;
    int C;
    CharSequence D;
    TextView E;
    int F;
    boolean G;
    int H;
    getLifecycle I;
    CharSequence J;
    int K;
    int L;
    View M;
    TextView N;
    int O;
    int Q;
    final Window R;
    int S;
    Button a;
    ListAdapter b;
    final int d;
    int e;
    Drawable f;
    Message g;
    CharSequence h;
    Drawable i;
    Button j;
    int l;
    Button m;
    Message n;

    /* renamed from: o */
    CharSequence f205o;
    CharSequence p;
    Drawable r;
    Message s;
    final Context t;
    Handler u;
    final setContentHeight v;
    Drawable x;
    View y;
    ImageView z;
    boolean P = false;
    int w = 0;
    int q = -1;
    int k = 0;
    final View.OnClickListener c = new View.OnClickListener() { // from class: o.setChecked.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message obtain = (view != setChecked.this.m || setChecked.this.s == null) ? (view != setChecked.this.a || setChecked.this.g == null) ? (view != setChecked.this.j || setChecked.this.n == null) ? null : Message.obtain(setChecked.this.n) : Message.obtain(setChecked.this.g) : Message.obtain(setChecked.this.s);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            setChecked.this.u.obtainMessage(1, setChecked.this.v).sendToTarget();
        }
    };

    /* loaded from: classes-dex2jar.jar:o/setChecked$IconCompatParcelizer.class */
    public static class IconCompatParcelizer extends ListView {
        private final int a;
        private final int e;

        public IconCompatParcelizer(Context context) {
            this(context, null);
        }

        public IconCompatParcelizer(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.co);
            this.a = obtainStyledAttributes.getDimensionPixelOffset(setHasDecor$MediaBrowserCompat$MediaItem.cp, -1);
            this.e = obtainStyledAttributes.getDimensionPixelOffset(setHasDecor$MediaBrowserCompat$MediaItem.cs, -1);
        }

        public void setHasDecor(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.e, getPaddingRight(), z2 ? getPaddingBottom() : this.a);
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setChecked$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends ArrayAdapter<CharSequence> {
        public RemoteActionCompatParcelizer(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, 16908308, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return (long) i;
        }

        @Override // android.widget.Adapter, android.widget.BaseAdapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setChecked$read.class */
    public static final class read {
        public DialogInterface.OnKeyListener A;
        public Drawable B;
        public AdapterView.OnItemSelectedListener C;
        public DialogInterface.OnDismissListener D;
        public View E;
        public CharSequence F;
        public DialogInterface.OnClickListener H;
        public CharSequence I;
        public int J;
        public int K;
        public int L;
        public int N;
        public int O;
        public ListAdapter a;
        public boolean[] b;
        public final Context d;
        public Drawable f;
        public View i;
        public Cursor j;
        public String k;
        public boolean l;
        public boolean m;
        public CharSequence[] n;

        /* renamed from: o */
        public final LayoutInflater f206o;
        public DialogInterface.OnClickListener p;
        public CharSequence q;
        public CharSequence r;
        public String s;
        public Drawable t;
        public DialogInterface.OnClickListener u;
        public DialogInterface.OnCancelListener v;
        public DialogInterface.OnMultiChoiceClickListener w;
        public CharSequence x;
        public Drawable y;
        public DialogInterface.OnClickListener z;
        public int h = 0;
        public int g = 0;
        public boolean M = false;
        public int e = -1;
        public boolean G = true;
        public boolean c = true;

        public read(Context context) {
            this.d = context;
            this.f206o = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    public setChecked(Context context, setContentHeight setcontentheight, Window window) {
        this.t = context;
        this.v = setcontentheight;
        this.R = window;
        this.u = new Handler(setcontentheight) { // from class: o.setChecked$MediaBrowserCompat$CustomActionResultReceiver
            private WeakReference<DialogInterface> e;

            {
                this.e = new WeakReference<>(r6);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick(this.e.get(), message.what);
                } else if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                }
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, setHasDecor$MediaBrowserCompat$MediaItem.I, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.m, 0);
        this.e = obtainStyledAttributes.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.H, 0);
        this.l = obtainStyledAttributes.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.M, 0);
        this.C = obtainStyledAttributes.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.K, 0);
        this.H = obtainStyledAttributes.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.N, 0);
        this.F = obtainStyledAttributes.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.P, 0);
        this.B = obtainStyledAttributes.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.J, 0);
        this.G = obtainStyledAttributes.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.S, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(setHasDecor$MediaBrowserCompat$MediaItem.L, 0);
        obtainStyledAttributes.recycle();
        setcontentheight.a(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            View view3 = view2;
            if (view2 instanceof ViewStub) {
                view3 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view3;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        View view4 = view;
        if (view instanceof ViewStub) {
            view4 = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view4;
    }

    static void d(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    public static boolean d(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            int i = childCount - 1;
            childCount = i;
            if (d(viewGroup.getChildAt(i))) {
                return true;
            }
        }
        return false;
    }

    public final void b(int i) {
        this.x = null;
        this.w = i;
        ImageView imageView = this.z;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.z.setImageResource(this.w);
            return;
        }
        imageView.setVisibility(8);
    }

    public final void b(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message message2 = message;
        if (message == null) {
            message2 = message;
            if (onClickListener != null) {
                message2 = this.u.obtainMessage(i, onClickListener);
            }
        }
        if (i == -3) {
            this.f205o = charSequence;
            this.n = message2;
            this.f = drawable;
        } else if (i == -2) {
            this.h = charSequence;
            this.g = message2;
            this.i = drawable;
        } else if (i == -1) {
            this.p = charSequence;
            this.s = message2;
            this.r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
