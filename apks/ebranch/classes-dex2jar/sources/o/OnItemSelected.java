package o;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import o.BindFont;
import o.OnPageChange;
import o.findRequiredViewAsType;
import o.setSnap;
/* loaded from: classes-dex2jar.jar:o/OnItemSelected.class */
public final class OnItemSelected implements OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver, OnFocusChange, OnItemClick {
    private final setText a;
    private boolean b;
    private final boolean c;
    private final OnPageChange.Callback<?, Float> d;
    private final String e;
    private final OnPageChange.Callback<?, PointF> g;
    private final OnPageChange.Callback<?, PointF> j;
    private final Path f = new Path();
    private final RectF i = new RectF();
    private BindFont.TypefaceStyle h = new BindFont.TypefaceStyle();

    /* loaded from: classes-dex2jar.jar:o/OnItemSelected$Callback.class */
    public final class Callback implements OnItemClick, OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver, OnFocusChange {
        private final boolean a;
        private final setText b;
        private final OnPageChange.Callback<?, Float> c;
        private final OnPageChange.Callback<?, Float> d;
        private boolean e;
        private final OnPageChange.Callback<?, Float> f;
        private final String g;
        private final OnPageChange.Callback<?, Float> h;
        private final OnPageChange.Callback<?, Float> j;
        private final OnPageChange.Callback<?, Float> m;
        private final OnPageChange.Callback<?, PointF> n;

        /* renamed from: o */
        private final findRequiredViewAsType.RemoteActionCompatParcelizer f123o;
        private final Path i = new Path();
        private BindFont.TypefaceStyle l = new BindFont.TypefaceStyle();

        /* renamed from: o.OnItemSelected$Callback$4 */
        /* loaded from: classes-dex2jar.jar:o/OnItemSelected$Callback$4.class */
        static final /* synthetic */ class AnonymousClass4 {
            static final /* synthetic */ int[] c;

            static {
                int[] iArr = new int[findRequiredViewAsType.RemoteActionCompatParcelizer.values().length];
                c = iArr;
                try {
                    iArr[findRequiredViewAsType.RemoteActionCompatParcelizer.STAR.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                }
                try {
                    c[findRequiredViewAsType.RemoteActionCompatParcelizer.POLYGON.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                }
            }
        }

        public Callback(setText settext, setPageColor setpagecolor, findRequiredViewAsType findrequiredviewastype) {
            this.b = settext;
            this.g = findrequiredviewastype.c;
            findRequiredViewAsType.RemoteActionCompatParcelizer remoteActionCompatParcelizer = findrequiredviewastype.g;
            this.f123o = remoteActionCompatParcelizer;
            this.a = findrequiredviewastype.a;
            OnPageChange onPageChange = new OnPageChange(findrequiredviewastype.h.c);
            this.h = onPageChange;
            OnPageChange.Callback<PointF, PointF> a = findrequiredviewastype.i.a();
            this.n = a;
            OnPageChange onPageChange2 = new OnPageChange(findrequiredviewastype.j.c);
            this.m = onPageChange2;
            OnPageChange onPageChange3 = new OnPageChange(findrequiredviewastype.e.c);
            this.j = onPageChange3;
            OnPageChange onPageChange4 = new OnPageChange(findrequiredviewastype.f.c);
            this.f = onPageChange4;
            if (remoteActionCompatParcelizer == findRequiredViewAsType.RemoteActionCompatParcelizer.STAR) {
                this.d = new OnPageChange(findrequiredviewastype.d.c);
                this.c = new OnPageChange(findrequiredviewastype.b.c);
            } else {
                this.d = null;
                this.c = null;
            }
            setpagecolor.e.add(onPageChange);
            if (a != null) {
                setpagecolor.e.add(a);
            }
            setpagecolor.e.add(onPageChange2);
            setpagecolor.e.add(onPageChange3);
            setpagecolor.e.add(onPageChange4);
            if (remoteActionCompatParcelizer == findRequiredViewAsType.RemoteActionCompatParcelizer.STAR) {
                OnPageChange.Callback<?, Float> callback = this.d;
                if (callback != null) {
                    setpagecolor.e.add(callback);
                }
                OnPageChange.Callback<?, Float> callback2 = this.c;
                if (callback2 != null) {
                    setpagecolor.e.add(callback2);
                }
            }
            onPageChange.d.add(this);
            a.d.add(this);
            onPageChange2.d.add(this);
            onPageChange3.d.add(this);
            onPageChange4.d.add(this);
            if (remoteActionCompatParcelizer == findRequiredViewAsType.RemoteActionCompatParcelizer.STAR) {
                this.d.d.add(this);
                this.c.d.add(this);
            }
        }

        @Override // o.OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver
        public final void a() {
            this.e = false;
            this.b.invalidateSelf();
        }

        @Override // o.doClick
        public final <T> void a(T t, onClickBcaMobile<T> onclickbcamobile) {
            OnPageChange.Callback<?, Float> callback;
            OnPageChange.Callback<?, Float> callback2;
            if (t == value.r) {
                this.h.d(onclickbcamobile);
            } else if (t == value.t) {
                this.m.d(onclickbcamobile);
            } else if (t == value.p) {
                this.n.d(onclickbcamobile);
            } else if (t == value.k && (callback2 = this.d) != null) {
                callback2.d(onclickbcamobile);
            } else if (t == value.s) {
                this.j.d(onclickbcamobile);
            } else if (t == value.l && (callback = this.c) != null) {
                callback.d(onclickbcamobile);
            } else if (t == value.q) {
                this.f.d(onclickbcamobile);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v27, types: [double] */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v3, types: [double] */
        /* JADX WARN: Unknown variable types count: 2 */
        @Override // o.OnItemClick
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final android.graphics.Path b() {
            /*
            // Method dump skipped, instructions count: 1340
            */
            throw new UnsupportedOperationException("Method not decompiled: o.OnItemSelected.Callback.b():android.graphics.Path");
        }

        @Override // o.style
        public final void b(List<style> list, List<style> list2) {
            for (int i = 0; i < list.size(); i++) {
                style style = list.get(i);
                if (style instanceof OnTouch) {
                    OnTouch onTouch = (OnTouch) style;
                    if (onTouch.i == setSnap.write.SIMULTANEOUSLY) {
                        this.l.d.add(onTouch);
                        onTouch.d.add(this);
                    }
                }
            }
        }

        @Override // o.style
        public final String e() {
            return this.g;
        }

        @Override // o.doClick
        public final void e(unbind unbind, int i, List<unbind> list, unbind unbind2) {
            BN6PembayaranActivity.c(unbind, i, list, unbind2, this);
        }
    }

    public OnItemSelected(setText settext, setPageColor setpagecolor, findOptionalViewAsType findoptionalviewastype) {
        this.e = findoptionalviewastype.c;
        this.c = findoptionalviewastype.e;
        this.a = settext;
        OnPageChange.Callback<PointF, PointF> a = findoptionalviewastype.a.a();
        this.j = a;
        OnPageChange.Callback<PointF, PointF> a2 = findoptionalviewastype.b.a();
        this.g = a2;
        OnPageChange onPageChange = new OnPageChange(findoptionalviewastype.d.c);
        this.d = onPageChange;
        if (a != null) {
            setpagecolor.e.add(a);
        }
        if (a2 != null) {
            setpagecolor.e.add(a2);
        }
        setpagecolor.e.add(onPageChange);
        a.d.add(this);
        a2.d.add(this);
        onPageChange.d.add(this);
    }

    @Override // o.OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver
    public final void a() {
        this.b = false;
        this.a.invalidateSelf();
    }

    @Override // o.doClick
    public final <T> void a(T t, onClickBcaMobile<T> onclickbcamobile) {
        if (t == value.y) {
            this.g.d(onclickbcamobile);
        } else if (t == value.p) {
            this.j.d(onclickbcamobile);
        } else if (t == value.d) {
            this.d.d(onclickbcamobile);
        }
    }

    @Override // o.OnItemClick
    public final Path b() {
        if (this.b) {
            return this.f;
        }
        this.f.reset();
        if (this.c) {
            this.b = true;
            return this.f;
        }
        PointF h = this.g.h();
        float f = h.x / 2.0f;
        float f2 = h.y / 2.0f;
        OnPageChange.Callback<?, Float> callback = this.d;
        float i = callback == null ? 0.0f : ((OnPageChange) callback).i();
        float min = Math.min(f, f2);
        float f3 = i;
        if (i > min) {
            f3 = min;
        }
        PointF h2 = this.j.h();
        this.f.moveTo(h2.x + f, (h2.y - f2) + f3);
        this.f.lineTo(h2.x + f, (h2.y + f2) - f3);
        int i2 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i2 > 0) {
            RectF rectF = this.i;
            float f4 = h2.x;
            float f5 = f3 * 2.0f;
            rectF.set((f4 + f) - f5, (h2.y + f2) - f5, h2.x + f, h2.y + f2);
            this.f.arcTo(this.i, 0.0f, 90.0f, false);
        }
        this.f.lineTo((h2.x - f) + f3, h2.y + f2);
        if (i2 > 0) {
            RectF rectF2 = this.i;
            float f6 = h2.x;
            float f7 = h2.y;
            float f8 = f3 * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (h2.x - f) + f8, h2.y + f2);
            this.f.arcTo(this.i, 90.0f, 90.0f, false);
        }
        this.f.lineTo(h2.x - f, (h2.y - f2) + f3);
        if (i2 > 0) {
            RectF rectF3 = this.i;
            float f9 = h2.x;
            float f10 = h2.y;
            float f11 = h2.x;
            float f12 = f3 * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f11 - f) + f12, (h2.y - f2) + f12);
            this.f.arcTo(this.i, 180.0f, 90.0f, false);
        }
        this.f.lineTo((h2.x + f) - f3, h2.y - f2);
        if (i2 > 0) {
            RectF rectF4 = this.i;
            float f13 = h2.x;
            float f14 = f3 * 2.0f;
            rectF4.set((f13 + f) - f14, h2.y - f2, h2.x + f, (h2.y - f2) + f14);
            this.f.arcTo(this.i, 270.0f, 90.0f, false);
        }
        this.f.close();
        this.h.a(this.f);
        this.b = true;
        return this.f;
    }

    @Override // o.style
    public final void b(List<style> list, List<style> list2) {
        for (int i = 0; i < list.size(); i++) {
            style style = list.get(i);
            if (style instanceof OnTouch) {
                OnTouch onTouch = (OnTouch) style;
                if (onTouch.i == setSnap.write.SIMULTANEOUSLY) {
                    this.h.d.add(onTouch);
                    onTouch.d.add(this);
                }
            }
        }
    }

    @Override // o.style
    public final String e() {
        return this.e;
    }

    @Override // o.doClick
    public final void e(unbind unbind, int i, List<unbind> list, unbind unbind2) {
        BN6PembayaranActivity.c(unbind, i, list, unbind2, this);
    }
}
