package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes-dex2jar.jar:o/setOnChildScrollUpCallback.class */
public final class setOnChildScrollUpCallback extends setSlingshotDistance {
    private boolean q;
    private int[] r;
    private boolean t;
    private static final String[] p = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> m = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") { // from class: o.setOnChildScrollUpCallback.1
        private Rect d = new Rect();

        @Override // android.util.Property
        public final /* synthetic */ PointF get(Drawable drawable) {
            drawable.copyBounds(this.d);
            return new PointF((float) this.d.left, (float) this.d.top);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.d);
            this.d.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.d);
        }
    };
    private static final Property<RemoteActionCompatParcelizer, PointF> k = new Property<RemoteActionCompatParcelizer, PointF>(PointF.class, "topLeft") { // from class: o.setOnChildScrollUpCallback.4
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            return null;
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(RemoteActionCompatParcelizer remoteActionCompatParcelizer, PointF pointF) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
            PointF pointF2 = pointF;
            remoteActionCompatParcelizer2.d = Math.round(pointF2.x);
            remoteActionCompatParcelizer2.a = Math.round(pointF2.y);
            int i2 = remoteActionCompatParcelizer2.g + 1;
            remoteActionCompatParcelizer2.g = i2;
            if (i2 == remoteActionCompatParcelizer2.c) {
                remoteActionCompatParcelizer2.b();
            }
        }
    };

    /* renamed from: o  reason: collision with root package name */
    private static final Property<RemoteActionCompatParcelizer, PointF> f249o = new Property<RemoteActionCompatParcelizer, PointF>(PointF.class, "bottomRight") { // from class: o.setOnChildScrollUpCallback.5
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            return null;
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(RemoteActionCompatParcelizer remoteActionCompatParcelizer, PointF pointF) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
            PointF pointF2 = pointF;
            remoteActionCompatParcelizer2.b = Math.round(pointF2.x);
            remoteActionCompatParcelizer2.e = Math.round(pointF2.y);
            int i2 = remoteActionCompatParcelizer2.c + 1;
            remoteActionCompatParcelizer2.c = i2;
            if (remoteActionCompatParcelizer2.g == i2) {
                remoteActionCompatParcelizer2.b();
            }
        }
    };
    private static final Property<View, PointF> i = new Property<View, PointF>(PointF.class, "bottomRight") { // from class: o.setOnChildScrollUpCallback.2
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            setStrokeColor.e(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    };
    private static final Property<View, PointF> n = new Property<View, PointF>(PointF.class, "topLeft") { // from class: o.setOnChildScrollUpCallback.10
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            setStrokeColor.e(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    };
    private static final Property<View, PointF> l = new Property<View, PointF>(PointF.class, "position") { // from class: o.setOnChildScrollUpCallback.7
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            setStrokeColor.e(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    };
    private static setProgressBackgroundColorSchemeColor s = new setProgressBackgroundColorSchemeColor();

    /* loaded from: classes-dex2jar.jar:o/setOnChildScrollUpCallback$RemoteActionCompatParcelizer.class */
    static class RemoteActionCompatParcelizer {
        int a;
        int b;
        int c;
        int d;
        int e;
        int g;
        private View h;

        RemoteActionCompatParcelizer(View view) {
            this.h = view;
        }

        void b() {
            setStrokeColor.e(this.h, this.d, this.a, this.b, this.e);
            this.g = 0;
            this.c = 0;
        }
    }

    public setOnChildScrollUpCallback() {
        this.r = new int[2];
        this.q = false;
        this.t = false;
    }

    public setOnChildScrollUpCallback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = new int[2];
        this.q = false;
        this.t = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setProgressViewOffset.e);
        boolean e = isVisible.e(obtainStyledAttributes, (XmlPullParser) ((XmlResourceParser) attributeSet), "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        this.q = e;
    }

    private void e(getStrokeColor getstrokecolor) {
        View view = getstrokecolor.a;
        if (findFragmentByWho.G(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            getstrokecolor.c.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            getstrokecolor.c.put("android:changeBounds:parent", getstrokecolor.a.getParent());
            if (this.t) {
                getstrokecolor.a.getLocationInWindow(this.r);
                getstrokecolor.c.put("android:changeBounds:windowX", Integer.valueOf(this.r[0]));
                getstrokecolor.c.put("android:changeBounds:windowY", Integer.valueOf(this.r[1]));
            }
            if (this.q) {
                getstrokecolor.c.put("android:changeBounds:clip", findFragmentByWho.g(view));
            }
        }
    }

    @Override // o.setSlingshotDistance
    public final void a(getStrokeColor getstrokecolor) {
        e(getstrokecolor);
    }

    @Override // o.setSlingshotDistance
    public final String[] a() {
        return p;
    }

    @Override // o.setSlingshotDistance
    public final void d(getStrokeColor getstrokecolor) {
        e(getstrokecolor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0142, code lost:
        if (r0 != r0) goto L_0x0145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x016c, code lost:
        if (r0 != null) goto L_0x016f;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03e1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017a  */
    @Override // o.setSlingshotDistance
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final android.animation.Animator e(final android.view.ViewGroup r12, o.getStrokeColor r13, o.getStrokeColor r14) {
        /*
        // Method dump skipped, instructions count: 1164
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnChildScrollUpCallback.e(android.view.ViewGroup, o.getStrokeColor, o.getStrokeColor):android.animation.Animator");
    }
}
